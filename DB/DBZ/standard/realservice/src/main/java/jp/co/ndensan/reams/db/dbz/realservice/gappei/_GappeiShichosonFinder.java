/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.realservice.gappei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.model.gappei.GappeiShichosonJohoModel;
import jp.co.ndensan.reams.db.dbz.business.config.HokenshaJohoConfig;
import jp.co.ndensan.reams.db.dbz.business.config.kyotsutokei.GappeiJohoKanriConfig;
import jp.co.ndensan.reams.db.dbz.business.core.basic.GappeiShichoson;
import jp.co.ndensan.reams.db.dbz.business.hokensha.IKoikiKoseiShichoson;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.hokensha.HokenshaKosei;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.ItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7051KoseiShichosonMasterEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7055GappeiJohoEntity;
import jp.co.ndensan.reams.db.dbz.persistence.relate.GappeiJohoDac;
import jp.co.ndensan.reams.db.dbz.persistence.relate.GappeiShichosonDac;
import jp.co.ndensan.reams.db.dbz.persistence.basic.KoseiShichosonMasterDac;
import jp.co.ndensan.reams.db.dbz.realservice.search.GappeiJohoSearchItem;
import jp.co.ndensan.reams.db.dbz.realservice.search.GappeiShichosonSearchItem;
import jp.co.ndensan.reams.db.dbz.realservice.search.KoseiShichosonMasterSearchItem;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.ITrueFalseCriteria;
import jp.co.ndensan.reams.uz.uza.util.db.searchcondition.FlexibleDateOperator;
import jp.co.ndensan.reams.uz.uza.util.db.searchcondition.INewSearchCondition;
import jp.co.ndensan.reams.uz.uza.util.db.searchcondition.ISearchCondition;
import jp.co.ndensan.reams.uz.uza.util.db.searchcondition.SearchConditionFactory;
import jp.co.ndensan.reams.uz.uza.util.db.searchcondition.StringOperator;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 合併市町村情報を取得するクラスです。
 *
 * @author N8156 宮本 康
 */
public class _GappeiShichosonFinder implements IGappeiShichosonFinder {

    private final GappeiJohoDac gappeiDac;
    private final GappeiShichosonDac tanitsuDac;
    private final KoseiShichosonMasterDac koikiDac;
    private final GappeiJohoKanriConfig gappeiConfig;
    private final HokenshaJohoConfig hokenshaConfig;

    private static final RString 表示対象 = new RString("1");

    /**
     * コンストラクタです。
     */
    public _GappeiShichosonFinder() {
        gappeiDac = InstanceProvider.create(GappeiJohoDac.class);
        tanitsuDac = InstanceProvider.create(GappeiShichosonDac.class);
        koikiDac = InstanceProvider.create(KoseiShichosonMasterDac.class);
        gappeiConfig = new GappeiJohoKanriConfig();
        hokenshaConfig = new HokenshaJohoConfig();
    }

    /**
     * モックを使用するテスト用コンストラクタです。
     *
     * @param gappeiDac 合併情報Dac
     * @param tanitsuDac 合併市町村Dac
     * @param koikiDac 構成市町村Dac
     * @param gappeiConfig 合併情報Config
     * @param hokenshaConfig 保険者情報Config
     */
    _GappeiShichosonFinder(
            GappeiJohoDac gappeiDac, GappeiShichosonDac tanitsuDac, KoseiShichosonMasterDac koikiDac,
            GappeiJohoKanriConfig gappeiConfig, HokenshaJohoConfig hokenshaConfig) {
        this.gappeiDac = gappeiDac;
        this.tanitsuDac = tanitsuDac;
        this.koikiDac = koikiDac;
        this.gappeiConfig = gappeiConfig;
        this.hokenshaConfig = hokenshaConfig;
    }

    @Override
    public boolean is合併あり() {
        return gappeiConfig.is合併あり();
    }

    @Override
    public Optional<FlexibleDate> get旧市町村情報付与終了日() {
        IItemList<DbT7055GappeiJohoEntity> 合併List = gappeiDac.selectAll();
        if (!合併List.isEmpty()) {
            return Optional.of(合併List.toList().get(合併List.size() - 1).getKyuJohoFuyoToYMD());
        }
        return Optional.empty();
    }

    @Override
    public IItemList<GappeiShichoson> get合併市町村情報(boolean 表示対象のみ) {
        if (!is合併あり()) {
            return ItemList.empty();
        }
        IItemList<DbT7055GappeiJohoEntity> 合併List = gappeiDac.selectAll();
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報List(合併List.toList(), 表示対象のみ);
        return ItemList.of(合併市町村情報List);
    }

    @Override
    public IItemList<GappeiShichoson> get合併市町村情報(LasdecCode 旧市町村コード) {
        if (!is合併あり()) {
            return ItemList.empty();
        }
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報List(make単一Key(旧市町村コード), make広域Key(旧市町村コード));
        return ItemList.of(合併市町村情報List);
    }

    @Override
    public IItemList<GappeiShichoson> get合併市町村情報(ShoKisaiHokenshaNo 旧保険者番号) {
        if (!is合併あり()) {
            return ItemList.empty();
        }
        List<GappeiShichosonJohoModel> 合併市町村情報List = get合併市町村情報List(make単一Key(旧保険者番号), make広域Key(旧保険者番号));
        return ItemList.of(合併市町村情報List);
    }

    @Override
    public Optional<GappeiShichoson> get最新合併市町村情報(LasdecCode 市町村コード) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        return get最新合併市町村情報(make合併Key(市町村コード));
    }

    @Override
    public Optional<GappeiShichoson> get最新合併市町村情報(ShoKisaiHokenshaNo 保険者番号) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        return get最新合併市町村情報(make合併Key(保険者番号));
    }

    @Override
    public Optional<GappeiShichoson> get最新合併市町村情報(ShoKisaiHokenshaNo 保険者番号, FlexibleYearMonth 基準年月) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        return get最新合併市町村情報(make合併Key(保険者番号, 基準年月));
    }

    @Override
    public Optional<GappeiShichoson> get最古合併市町村情報(LasdecCode 旧市町村コード) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報List(make単一Key(旧市町村コード), make広域Key(旧市町村コード));
        if (!合併市町村情報List.isEmpty()) {
            return Optional.of(合併市町村情報List.get(0));
        }
        return Optional.empty();
    }

    @Override
    public Optional<GappeiShichoson> get直近合併市町村情報(LasdecCode 市町村コード) {

        if (!is合併あり()) {
            return Optional.empty();
        }
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報(市町村コード).toList();
        if (!合併市町村情報List.isEmpty()) {
            return Optional.of(合併市町村情報List.get(合併市町村情報List.size() - 1));
        }
        return Optional.empty();
    }

    @Override
    public Optional<GappeiShichoson> get直近合併市町村情報(ShoKisaiHokenshaNo 旧保険者番号) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報(旧保険者番号).toList();
        if (!合併市町村情報List.isEmpty()) {
            return Optional.of(合併市町村情報List.get(合併市町村情報List.size() - 1));
        }
        return Optional.empty();
    }

    @Override
    public Optional<GappeiShichoson> get直近合併市町村情報(ShoKisaiHokenshaNo 旧保険者番号, FlexibleYearMonth 基準年月) {
        if (!is合併あり()) {
            return Optional.empty();
        }
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報(旧保険者番号).toList();
        for (GappeiShichoson 合併市町村情報 : 合併市町村情報List) {
            if (基準年月.isBefore(合併市町村情報.get合併情報().get().get国保連データ連携開始日().getYearMonth())) {
                return Optional.of(合併市町村情報);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<GappeiShichoson> get市町村情報(LasdecCode 市町村コード) {
        return get合併市町村情報(null, make単一Key(市町村コード), make広域Key(市町村コード), false);
    }

    @Override
    public Optional<GappeiShichoson> get市町村情報(ShoKisaiHokenshaNo 保険者番号) {
        return get合併市町村情報(null, make単一Key(保険者番号), make広域Key(保険者番号), false);
    }

    @Override
    public Optional<GappeiShichoson> get最古市町村情報(LasdecCode 市町村コード) {
        return get合併市町村情報(null, make単一Key(市町村コード), make広域Key(市町村コード), true);
    }

    @Override
    public IItemList<GappeiShichoson> find合併市町村情報(ISearchCondition 条件, boolean 表示対象のみ) {
        if (!is合併あり()) {
            return ItemList.empty();
        }
        IItemList<DbT7055GappeiJohoEntity> 合併List = gappeiDac.select(条件.makeSearchCondition());
        List<GappeiShichoson> 合併市町村情報List = get合併市町村情報List(合併List.toList(), 表示対象のみ);
        return ItemList.of(合併市町村情報List);
    }

    private boolean is単一市町村() {
        return hokenshaConfig.get保険者構成() == HokenshaKosei.単一市町村;
    }

    private Optional<GappeiShichoson> get最新合併市町村情報(ITrueFalseCriteria 条件) {
        DbT7055GappeiJohoEntity 合併 = get最新合併情報(条件);
        if (合併 == null) {
            return Optional.empty();
        }
        HokenshaKosei 構成;
        List<IGappeiShichoson> 単一List = new ArrayList<>();
        List<IKoikiKoseiShichoson> 広域List = new ArrayList<>();
        if (is単一市町村()) {
            構成 = HokenshaKosei.単一市町村;
            単一List = get最新合併市町村List(合併);
        } else {
            構成 = HokenshaKosei.広域市町村;
            広域List = get最新構成市町村List(合併);
        }
        return create合併市町村情報(合併, 構成, 単一List, 広域List);
    }

    private DbT7055GappeiJohoEntity get最新合併情報(ITrueFalseCriteria 条件) {
        IItemList<DbT7055GappeiJohoEntity> 合併List = gappeiDac.select(条件);
        if (合併List.isEmpty()) {
            return null;
        }
        return 合併List.toList().get(合併List.size() - 1);
    }

    private List<IGappeiShichoson> get最新合併市町村List(IGappeiJoho 合併) {
        List<IGappeiShichoson> 単一List = new ArrayList<>();
        ITrueFalseCriteria 条件 = make単一Key(合併.get合併日(), 合併.get地域番号(), 合併.get市町村コード(), false);
        IItemList<IGappeiShichoson> list = tanitsuDac.select(条件);
        if (!list.isEmpty()) {
            単一List.add(list.toList().get(list.size() - 1));
        }
        return 単一List;
    }

    private List<IKoikiKoseiShichoson> get最新構成市町村List(IGappeiJoho 合併) {
        List<IKoikiKoseiShichoson> 広域List = new ArrayList<>();
        ITrueFalseCriteria 条件 = make広域Key(合併.get市町村コード());
        IItemList<IKoikiKoseiShichoson> list = koikiDac.select(条件);
        if (!list.isEmpty()) {
            広域List.add(list.toList().get(list.size() - 1));
        }
        return 広域List;
    }

    private Optional<GappeiShichoson> get合併市町村情報(
            IGappeiJoho 合併, ITrueFalseCriteria 単一条件, ITrueFalseCriteria 広域条件, boolean is最古) {
        HokenshaKosei 構成;
        List<IGappeiShichoson> 単一List = new ArrayList<>();
        List<IKoikiKoseiShichoson> 広域List = new ArrayList<>();
        if (is単一市町村()) {
            構成 = HokenshaKosei.単一市町村;
            List<IGappeiShichoson> list = tanitsuDac.select(単一条件).toList();
            if (is最古 && !list.isEmpty()) {
                単一List.add(list.get(0));
            } else {
                単一List = list;
            }
        } else {
            構成 = HokenshaKosei.広域市町村;
            List<IKoikiKoseiShichoson> list = koikiDac.select(広域条件).toList();
            if (is最古 && !list.isEmpty()) {
                広域List.add(list.get(0));
            } else {
                広域List = list;
            }
        }
        return create合併市町村情報(合併, 構成, 単一List, 広域List);
    }

    private List<GappeiShichoson> get合併市町村情報List(List<IGappeiJoho> 合併List, boolean 表示対象のみ) {
        List<GappeiShichoson> 合併市町村情報List = new ArrayList<>();
        for (IGappeiJoho 合併 : 合併List) {
            Optional<GappeiShichosonJohoModel> 合併市町村情報 = get合併市町村情報(
                    合併,
                    make単一Key(合併.get合併日(), 合併.get地域番号(), 合併.get市町村コード(), 表示対象のみ),
                    make広域Key(合併.get地域番号(), 表示対象のみ),
                    false);
            合併市町村情報List.add(合併市町村情報.get());
        }
        return 合併市町村情報List;
    }

    private List<GappeiShichoson> get合併市町村情報List(ITrueFalseCriteria 単一条件, ITrueFalseCriteria 広域条件) {
        Map<FlexibleDate, GappeiShichoson> map = new TreeMap<>();
        if (is単一市町村()) {
            IItemList<IGappeiShichoson> 単一List = tanitsuDac.select(単一条件);
            for (IGappeiShichoson 単一 : 単一List) {
                ITrueFalseCriteria 条件 = make合併Key(単一.get合併日(), 単一.get地域番号(), 単一.get旧市町村コード());
                IItemList<IGappeiJoho> 合併List = gappeiDac.select(条件);
                if (合併List.isEmpty()) {
                    continue;
                }
                IGappeiJoho 合併 = 合併List.toList().get(0);
                List<IGappeiShichoson> list = new ArrayList<>();
                list.add(単一);
                Optional<GappeiShichosonJohoModel> 合併市町村情報 = create合併市町村情報(
                        合併, HokenshaKosei.単一市町村, list, Collections.EMPTY_LIST);
                map.put(合併.get国保連データ連携開始日(), 合併市町村情報.get());
            }
        } else {
            IItemList<DbT7051KoseiShichosonMasterEntity> 広域List = koikiDac.select(広域条件);
            for (IKoikiKoseiShichoson 広域 : 広域List) {
                ITrueFalseCriteria 条件 = make合併Key(広域.get合併情報地域番号());
                IItemList<IGappeiJoho> 合併List = gappeiDac.select(条件);
                if (合併List.isEmpty()) {
                    continue;
                }
                IGappeiJoho 合併 = 合併List.toList().get(0);
                List<IKoikiKoseiShichoson> list = new ArrayList<>();
                list.add(広域);
                Optional<GappeiShichosonJohoModel> 合併市町村情報 = create合併市町村情報(
                        合併, HokenshaKosei.広域市町村, Collections.EMPTY_LIST, list);
                map.put(合併.get国保連データ連携開始日(), 合併市町村情報.get());
            }
        }
        return (List) Arrays.asList(map.values().toArray());
    }

    private Optional<GappeiShichoson> create合併市町村情報(
            IGappeiJoho 合併, HokenshaKosei 構成, List<IGappeiShichoson> 単一List, List<IKoikiKoseiShichoson> 広域List) {
        GappeiShichosonJohoModel 合併市町村情報 = new GappeiShichosonJohoModel(
                Optional.ofNullable(合併), 構成, ItemList.of(単一List), ItemList.of(広域List));
        return Optional.of(合併市町村情報);
    }

    private ITrueFalseCriteria make合併Key(FlexibleDate 合併日, RString 地域番号, LasdecCode 市町村コード) {
        INewSearchCondition 条件1 = SearchConditionFactory.condition(GappeiJohoSearchItem.合併日, FlexibleDateOperator.等しい, 合併日);
        INewSearchCondition 条件2 = SearchConditionFactory.condition(GappeiJohoSearchItem.地域番号, StringOperator.完全一致, 地域番号);
        INewSearchCondition 条件3 = SearchConditionFactory.condition(GappeiJohoSearchItem.市町村コード, StringOperator.完全一致, 市町村コード.value());
        return 条件1.and(条件2).and(条件3).makeSearchCondition();
    }

    private ITrueFalseCriteria make合併Key(RString 地域番号) {
        INewSearchCondition 条件 = SearchConditionFactory.condition(GappeiJohoSearchItem.地域番号, StringOperator.完全一致, 地域番号);
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make合併Key(LasdecCode 市町村コード) {
        INewSearchCondition 条件 = SearchConditionFactory.condition(GappeiJohoSearchItem.市町村コード, StringOperator.完全一致, 市町村コード.value());
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make合併Key(ShoKisaiHokenshaNo 保険者番号) {
        INewSearchCondition 条件 = SearchConditionFactory.condition(GappeiJohoSearchItem.保険者番号, StringOperator.完全一致, 保険者番号.value());
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make合併Key(ShoKisaiHokenshaNo 保険者番号, FlexibleYearMonth 基準年月) {
        FlexibleDate 基準日 = new FlexibleDate(基準年月.getYearValue(), 基準年月.getMonthValue(), 基準年月.getLastDay());
        INewSearchCondition 条件1 = SearchConditionFactory.condition(GappeiJohoSearchItem.保険者番号, StringOperator.完全一致, 保険者番号.value());
        INewSearchCondition 条件2 = SearchConditionFactory.condition(GappeiJohoSearchItem.国保連データ連携開始日, FlexibleDateOperator.以前, 基準日);
        return 条件1.and(条件2).makeSearchCondition();
    }

    private ITrueFalseCriteria make単一Key(FlexibleDate 合併日, RString 地域番号, LasdecCode 旧市町村コード, boolean 表示対象のみ) {
        INewSearchCondition 条件1 = SearchConditionFactory.condition(GappeiShichosonSearchItem.合併日, FlexibleDateOperator.等しい, 合併日);
        INewSearchCondition 条件2 = SearchConditionFactory.condition(GappeiShichosonSearchItem.地域番号, StringOperator.完全一致, 地域番号);
        INewSearchCondition 条件3
                = SearchConditionFactory.condition(GappeiShichosonSearchItem.旧市町村コード, StringOperator.完全一致, 旧市町村コード.value());
        INewSearchCondition 条件4 = SearchConditionFactory.condition(GappeiShichosonSearchItem.表示有無, StringOperator.完全一致, 表示対象);
        return 表示対象のみ ? 条件1.and(条件2).and(条件3).and(条件4).makeSearchCondition() : 条件1.and(条件2).and(条件3).makeSearchCondition();
    }

    private ITrueFalseCriteria make単一Key(LasdecCode 旧市町村コード) {
        INewSearchCondition 条件
                = SearchConditionFactory.condition(GappeiShichosonSearchItem.旧市町村コード, StringOperator.完全一致, 旧市町村コード.value());
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make単一Key(ShoKisaiHokenshaNo 旧保険者番号) {
        INewSearchCondition 条件
                = SearchConditionFactory.condition(GappeiShichosonSearchItem.旧保険者番号, StringOperator.完全一致, 旧保険者番号.value());
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make広域Key(RString 地域番号, boolean 表示対象のみ) {
        INewSearchCondition 条件1
                = SearchConditionFactory.condition(KoseiShichosonMasterSearchItem.合併情報地域番号, StringOperator.完全一致, 地域番号);
        INewSearchCondition 条件2
                = SearchConditionFactory.condition(KoseiShichosonMasterSearchItem.合併旧市町村表示有無, StringOperator.完全一致, 表示対象);
        return 表示対象のみ ? 条件1.and(条件2).makeSearchCondition() : 条件1.makeSearchCondition();
    }

    private ITrueFalseCriteria make広域Key(LasdecCode 市町村コード) {
        INewSearchCondition 条件
                = SearchConditionFactory.condition(KoseiShichosonMasterSearchItem.市町村コード, StringOperator.完全一致, 市町村コード.value());
        return 条件.makeSearchCondition();
    }

    private ITrueFalseCriteria make広域Key(ShoKisaiHokenshaNo 保険者番号) {
        INewSearchCondition 条件
                = SearchConditionFactory.condition(KoseiShichosonMasterSearchItem.証記載保険者番号, StringOperator.完全一致, 保険者番号.value());
        return 条件.makeSearchCondition();
    }
}
