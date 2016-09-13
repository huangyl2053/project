/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.service.core.shinnendokanrijohosakusei;

import java.util.HashMap;
import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.shinnendokanrijohosakusei.ShinNendoKanriJohoSakuseiEntity;
import jp.co.ndensan.reams.db.dbb.persistence.db.mapper.relate.shinnendokanrijohosakusei.IShinNendoKanriJohoSakuseiMapper;
import jp.co.ndensan.reams.db.dbb.service.core.shinnendokanrijohosakuseifinder.ShinNendoKanriJohoSakuseiFinder;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoHanyo;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShoriDateKanri;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ChohyoSeigyoHanyoManager;
import jp.co.ndensan.reams.db.dbz.service.core.basic.ShoriDateKanriManager;
import jp.co.ndensan.reams.ur.urc.business.core.noki.nokikanri.Noki;
import jp.co.ndensan.reams.ur.urc.definition.core.noki.nokikanri.GennenKanen;
import jp.co.ndensan.reams.ur.urc.definition.core.shunokamoku.shunokamoku.ShunoKamokuShubetsu;
import jp.co.ndensan.reams.ur.urc.entity.db.basic.noki.nokikanri.UrT0729NokiKanriEntity;
import jp.co.ndensan.reams.ur.urc.service.core.noki.nokikanri.NokiManager;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * ShinNendoKanriJohoSakuseiManagerクラスです。
 *
 * @reamsid_L DBB-5721-010 chenyadong
 */
public class ShinNendoKanriJohoSakuseiManager {

    private final ShoriDateKanriManager 処理日付管理manager;
    private final ChohyoSeigyoHanyoManager 帳票制御汎用manager;
    private final MapperProvider mapperProvider;
    private static final RString 調定年度 = new RString("20140401");

    /**
     * コンストラクタです。
     */
    ShinNendoKanriJohoSakuseiManager() {
        this.処理日付管理manager = InstanceProvider.create(ShoriDateKanriManager.class);
        this.帳票制御汎用manager = InstanceProvider.create(ChohyoSeigyoHanyoManager.class);
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link ShinNendoKanriJohoSakuseiManager}のインスタンスを 返します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link ShinNendoKanriJohoSakuseiManager}のインスタンス
     */
    public static ShinNendoKanriJohoSakuseiManager createInstance() {
        return InstanceProvider.create(ShinNendoKanriJohoSakuseiManager.class);
    }

    /**
     * 追加します。
     *
     * @param 本年度 FlexibleYear
     * @param param HashMap<String, Object>
     * @param 処理日付管理 ShoriDateKanri
     * @param 帳票制御汎用List List<ChohyoSeigyoHanyo>
     */
    @Transaction
    public void 追加(FlexibleYear 本年度, ShoriDateKanri 処理日付管理, List<ChohyoSeigyoHanyo> 帳票制御汎用List,
            HashMap<String, Object> param) {
        requireNonNull(本年度, UrSystemErrorMessages.値がnull.getReplacedMessage("本年度"));
        requireNonNull(処理日付管理, UrSystemErrorMessages.値がnull.getReplacedMessage("処理日付管理"));
        requireNonNull(帳票制御汎用List, UrSystemErrorMessages.値がnull.getReplacedMessage("帳票制御汎用List"));
        requireNonNull(param, UrSystemErrorMessages.値がnull.getReplacedMessage("param"));
        処理日付管理manager.save処理日付管理マスタ(処理日付管理);
        if (帳票制御汎用List != null) {
            for (ChohyoSeigyoHanyo item : 帳票制御汎用List) {
                帳票制御汎用manager.save帳票制御汎用(item);
            }
        }
        IShinNendoKanriJohoSakuseiMapper mapper = mapperProvider.create(IShinNendoKanriJohoSakuseiMapper.class);
        ShinNendoKanriJohoSakuseiFinder finder = ShinNendoKanriJohoSakuseiFinder.createInstance();
        List<ShinNendoKanriJohoSakuseiEntity> resultList = finder.getShinNendoKanriJohoSakusei(param);
        if (resultList != null) {
            for (ShinNendoKanriJohoSakuseiEntity item : resultList) {
                mapper.insertカスタムコンフィグByKey(item);
            }
        }
        NokiManager 納期管理 = new NokiManager();
        List<Noki> list = 納期管理.create翌年度納期(ShunoKamokuShubetsu.介護保険料_特別徴収,
                new RYear(本年度.toString()), GennenKanen.現年度);
        List<Noki> list現年度 = 納期管理.create翌年度納期(ShunoKamokuShubetsu.介護保険料_普通徴収,
                new RYear(本年度.toString()), GennenKanen.現年度);
        List<Noki> list過年度 = 納期管理.create翌年度納期(ShunoKamokuShubetsu.介護保険料_普通徴収,
                new RYear(本年度.toString()), GennenKanen.過年度);
        for (Noki item : list) {
            UrT0729NokiKanriEntity entity = item.toEntity();
            entity.setState(EntityDataState.Added);
            //TODO QA.1341
            entity.setTsuchishoHakkoYMD(new RDate(調定年度.toString()));
            納期管理.save納期(new Noki(entity));
        }
        for (Noki item : list現年度) {
            UrT0729NokiKanriEntity entity = item.toEntity();
            entity.setState(EntityDataState.Added);
            //TODO QA.1341
            entity.setTsuchishoHakkoYMD(new RDate(調定年度.toString()));
            納期管理.save納期(new Noki(entity));
        }
        for (Noki item : list過年度) {
            UrT0729NokiKanriEntity entity = item.toEntity();
            entity.setState(EntityDataState.Added);
            //TODO QA.1341
            entity.setTsuchishoHakkoYMD(new RDate(調定年度.toString()));
            納期管理.save納期(new Noki(entity));
        }

    }

}