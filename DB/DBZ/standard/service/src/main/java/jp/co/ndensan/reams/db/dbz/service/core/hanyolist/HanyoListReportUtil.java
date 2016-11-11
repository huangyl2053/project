/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.hanyolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.hanyolist.HanyoListShutsuryokuKomoku;
import jp.co.ndensan.reams.db.dbz.business.core.hanyolist.HanyoListShutsuryokuKomokuList;
import jp.co.ndensan.reams.db.dbz.definition.mybatisprm.hanyolist.HanyoLisyInvertedParameter;
import jp.co.ndensan.reams.db.dbz.entity.db.relate.hanyolist.HanyoLisyInvertedEntity;
import jp.co.ndensan.reams.db.dbz.persistence.db.mapper.relate.hanyolist.IHanyoLisyInvertedMapper;
import jp.co.ndensan.reams.db.dbz.service.core.MapperProvider;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputitem.ShutsuryokuKomokuDetailModel;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputitem.relate.ChohyoShutsuryokuKomokuModel;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputitem.relate.SelectedShutsuryokuKomokuModel;
import jp.co.ndensan.reams.ur.urz.service.core.reportoutputitem.ShutsuryokuKomokuFinder;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * ビジネス設計_DBZMNnnnnn_汎用リストのビジネス
 *
 * @reamsid_L DBZ-4570-010 jinge
 */
public class HanyoListReportUtil {

    private final MapperProvider mapperProvider;

    /**
     * コンストラクタです。
     */
    HanyoListReportUtil() {
        this.mapperProvider = InstanceProvider.create(MapperProvider.class);
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link HanyoListReportUtil}のインスタンスを返します。
     *
     * @return {@link InstanceProvider#create}にて生成した{@link HanyoListReportUtil}のインスタンス
     */
    public static HanyoListReportUtil createInstance() {
        return InstanceProvider.create(HanyoListReportUtil.class);
    }

    /**
     * 汎用リスト出力項目を取得します。
     *
     * @param 業務コード 業務コード
     * @param サブ業務コード サブ業務コード
     * @param 帳票ID 帳票ID
     * @param 出力項目ID 出力項目ID
     * @return HanyoListShutsuryokuKomoku 汎用リスト出力項目
     * @throws NullPointerException 引数のいずれかがnullの場合
     */
    public HanyoListShutsuryokuKomoku get汎用リスト出力項目(GyomuCode 業務コード, SubGyomuCode サブ業務コード, ReportId 帳票ID, long 出力項目ID) throws NullPointerException {
        HanyoListShutsuryokuKomoku hanyoList = new HanyoListShutsuryokuKomoku();
        IHanyoLisyInvertedMapper hanyoLisyInverted = this.mapperProvider.create(IHanyoLisyInvertedMapper.class);
        HanyoLisyInvertedParameter parameter = new HanyoLisyInvertedParameter(帳票ID);
        List<HanyoLisyInvertedEntity> hanyoLisyInvertedEntitys = hanyoLisyInverted.select汎用リスト項目変換テーブル(parameter);
        if (hanyoLisyInvertedEntitys == null || hanyoLisyInvertedEntitys.isEmpty()) {
            return null;
        }
        ShutsuryokuKomokuFinder finder = new ShutsuryokuKomokuFinder();
        ChohyoShutsuryokuKomokuModel chohyoModel = finder.get帳票出力項目(サブ業務コード, 帳票ID);
        if (chohyoModel == null) {
            return null;
        }
        ArrayList<ShutsuryokuKomokuDetailModel> detailModel = chohyoModel.get出力項目詳細モデルList();
        ShutsuryokuKomokuDetailModel shutsuryokuKomokuModel = new ShutsuryokuKomokuDetailModel();
        if (detailModel == null || detailModel.isEmpty()) {
            return null;
        } else {
            for (int index = 0; index < detailModel.size(); index++) {
                if (detailModel.get(index).get出力項目管理モデル().get出力項目ID() == 出力項目ID) {
                    shutsuryokuKomokuModel = detailModel.get(index);
                }
            }
        }
        if (shutsuryokuKomokuModel == null) {
            return null;
        }
        ArrayList<SelectedShutsuryokuKomokuModel> selectedModel = shutsuryokuKomokuModel.get選択済み出力項目List();
        if (selectedModel == null || selectedModel.isEmpty()) {
            return null;
        }
        List<HanyoListShutsuryokuKomokuList> 汎用リスト出力項目リスト = new ArrayList();
        for (int index = 0; index < selectedModel.size(); index++) {
            HanyoListShutsuryokuKomokuList 汎用リスト出力項目 = new HanyoListShutsuryokuKomokuList();
            汎用リスト出力項目.set項目ID(selectedModel.get(index).get出力項目モデル().get項目ID());
            汎用リスト出力項目.set出力項目順位(selectedModel.get(index).get出力項目モデル().get出力項目順位());
            汎用リスト出力項目.set省略区分(selectedModel.get(index).get出力項目モデル().get省略区分());
            汎用リスト出力項目.set出力項目文字数(selectedModel.get(index).get出力項目モデル().get出力項目文字数());
            汎用リスト出力項目.set出力項目日付区分(selectedModel.get(index).get出力項目モデル().get出力項目日付区分());
            汎用リスト出力項目.set項目名称(selectedModel.get(index).get帳票出力項目管理モデル().get項目名());
            汎用リスト出力項目.set項目桁数(selectedModel.get(index).get帳票出力項目管理モデル().get項目桁数());
            for (int index2 = 0; index2 < hanyoLisyInvertedEntitys.size(); index2++) {
                if (hanyoLisyInvertedEntitys.get(index2).get項目ID().equals(selectedModel.get(index).get出力項目モデル().get項目ID())) {
                    汎用リスト出力項目.set項目位置(hanyoLisyInvertedEntitys.get(index2).get項目位置());
                    汎用リスト出力項目.set編集方法(hanyoLisyInvertedEntitys.get(index2).get帳票表示位置());
                    汎用リスト出力項目.set金額編集(hanyoLisyInvertedEntitys.get(index2).get金額編集());
                }
            }
            汎用リスト出力項目リスト.add(汎用リスト出力項目);
        }
        hanyoList.set汎用リスト出力項目リスト(汎用リスト出力項目リスト);
        hanyoList.set項目間スペース数(shutsuryokuKomokuModel.get出力項目管理モデル().get項目間スペース数());
        Collections.sort(hanyoList.get汎用リスト出力項目リスト(), new Comparator<HanyoListShutsuryokuKomokuList>() {
            @Override
            public int compare(HanyoListShutsuryokuKomokuList result1, HanyoListShutsuryokuKomokuList result2) {
                if (result1.get出力項目順位() < result2.get出力項目順位()) {
                    return -1;
                } else if (result1.get出力項目順位() > result2.get出力項目順位()) {
                    return 1;
                } else {
                    return Long.parseLong(result1.get項目ID().toString()) < Long.parseLong(result2.get項目ID().toString()) ? -1 : 1;
                }
            }
        });
        hanyoList.set汎用リスト出力項目リスト(hanyoList.get汎用リスト出力項目リスト());
        return hanyoList;
    }

}