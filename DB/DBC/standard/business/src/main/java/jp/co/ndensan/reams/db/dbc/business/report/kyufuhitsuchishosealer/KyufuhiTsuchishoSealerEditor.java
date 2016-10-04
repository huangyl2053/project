/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.kyufuhitsuchishosealer;

import jp.co.ndensan.reams.db.dbc.entity.db.relate.kyufuhitsuchishosealer.KyufuhiTsuchishoSealerEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.kyufuhitsuchishosealer.KyufuhiTsuchishoSealerReportSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票設計_DBC100042_介護保険給付費通知書(ｼｰﾗﾀｲﾌﾟ)のEditorです。
 *
 * @reamsid_L DBC-2280-070 lizhuoxuan
 *
 */
public class KyufuhiTsuchishoSealerEditor implements IKyufuhiTsuchishoSealerEditor {

    private final KyufuhiTsuchishoSealerEntity item;
    private int index;
    private static final int PAGECOUNT = 25;

    /**
     * インスタンスを生成します。
     *
     * @param item {@link KyufuhiTsuchishoSealerEntity}
     * @param index int
     */
    protected KyufuhiTsuchishoSealerEditor(KyufuhiTsuchishoSealerEntity item, int index) {
        this.item = item;
        this.index = index;
    }

    @Override
    public KyufuhiTsuchishoSealerReportSource edit(KyufuhiTsuchishoSealerReportSource source) {
        return editSource(source);
    }

    private KyufuhiTsuchishoSealerReportSource editSource(KyufuhiTsuchishoSealerReportSource source) {
        source.bunshoNo = item.getBunshoNo();
        source.yubinNo1 = item.getYubinNo1();
        source.yubinNo2 = item.getYubinNo2();
        source.yubinNo3 = item.getYubinNo3();
        source.yubinNo4 = item.getYubinNo4();
        source.yubinNo5 = item.getYubinNo5();
        source.yubinNo6 = item.getYubinNo6();
        source.yubinNo7 = item.getYubinNo7();
        source.hihokenshaNo = item.getHihokenshaNo();
        source.hihokenshaName = item.getHihokenshaName();
        source.shukeiserviceSTYM = item.getShukeiserviceSTYM();
        source.shukeiserviceEDYM = item.getShukeiserviceEDYM();
        source.listServiceIchiran_1 = item.getListServiceIchiran_1();
        source.listServiceIchiran_2 = item.getListServiceIchiran_2();
        source.listServiceIchiran_3 = item.getListServiceIchiran_3();
        source.listServiceIchiran_4 = item.getListServiceIchiran_4();
        source.listServiceIchiran_5 = item.getListServiceIchiran_5();
        source.listServiceIchiran_6 = item.getListServiceIchiran_6();
        source.toiawasesakiTitle = item.getToiawasesakiTitle();
        getイメージ03(item);
        source.pageBunshi = new RString(item.getPageBunshi());
        source.pageBunbo = new RString(item.getPageBunbo());
        source.tsuchibun1 = item.getTsuchibun1();
        source.tsuchibun2 = item.getTsuchibun2();
        source.hakkoYMD = item.getHakkoYMD();
        source.denshiKoin = item.getDenshiKoin();
        source.ninshoshaYakushokuMei = item.getNinshoshaYakushokuMei();
        source.ninshoshaYakushokuMei1 = item.getNinshoshaYakushokuMei1();
        source.koinMojiretsu = item.getKoinMojiretsu();
        source.ninshoshaYakushokuMei2 = item.getNinshoshaYakushokuMei2();
        source.ninshoshaShimeiKakenai = item.getNinshoshaShimeiKakenai();
        source.ninshoshaShimeiKakeru = item.getNinshoshaShimeiKakeru();
        source.koinShoryaku = item.getKoinShoryaku();
        source.yubinNo = item.getYubinNo();
        source.gyoseiku1 = item.getGyoseiku();
        source.jusho4 = item.getJusho4();
        source.jushoText = item.getJushoText();
        source.jusho5 = item.getJusho5();
        source.jusho6 = item.getJusho6();
        source.katagakiText = item.getKatagakiText();
        source.katagaki3 = item.getKatagaki3();
        source.katagakiSmall2 = item.getKatagakiSmall2();
        source.katagaki4 = item.getKatagaki4();
        source.katagakiSmall1 = item.getKatagakiSmall1();
        source.shimei5 = item.getShimei5();
        source.shimeiSmall2 = item.getShimeiSmall2();
        source.shimeiText = item.getShimeiText();
        source.meishoFuyo2 = item.getMeishoFuyo2();
        source.shimeiSmall1 = item.getShimeiSmall1();
        source.dainoKubunMei = item.getDainoKubunMei();
        source.shimei6 = item.getShimei6();
        source.meishoFuyo1 = item.getMeishoFuyo1();
        source.samabunShimeiText = item.getSamabunShimeiText();
        source.samaBun2 = item.getSamaBun2();
        source.samabunShimeiSmall2 = item.getSamabunShimeiSmall2();
        source.kakkoLeft2 = item.getKakkoLeft2();
        source.samabunShimei2 = item.getSamabunShimei2();
        source.kakkoRight2 = item.getKakkoRight2();
        source.kakkoLeft1 = item.getKakkoLeft1();
        source.samabunShimei1 = item.getSamabunShimei1();
        source.samaBun1 = item.getSamaBun1();
        source.kakkoRight1 = item.getKakkoRight1();
        source.samabunShimeiSmall1 = item.getSamabunShimeiSmall1();
        source.customerBarCode = item.getCustomerBarCode();
        source.yubinBango = item.getYubinBango();
        source.shozaichi = item.getShozaichi();
        source.choshaBushoName = item.getChoshaBushoName();
        source.tantoName = item.getTantoName();
        source.telNo = item.getTelNo();
        source.naisenLabel = item.getNaisenLabel();
        source.naisenNo = item.getNaisenNo();
        return source;
    }

    private void getイメージ03(KyufuhiTsuchishoSealerEntity item) {
        index = index + 1;
        if (index % PAGECOUNT > 0) {
            item.setPageBunshi((index - (index % PAGECOUNT)) / PAGECOUNT + 1);
        } else {
            item.setPageBunshi(index / PAGECOUNT);
        }
        if (item.getCount() % PAGECOUNT > 0) {
            item.setPageBunbo((item.getCount() - (item.getCount() % PAGECOUNT)) / PAGECOUNT + 1);
        } else {
            item.setPageBunbo(item.getCount() / PAGECOUNT);
        }
    }
}