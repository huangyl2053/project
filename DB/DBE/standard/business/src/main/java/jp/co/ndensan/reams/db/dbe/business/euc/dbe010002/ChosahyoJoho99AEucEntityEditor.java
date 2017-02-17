/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.euc.dbe010002;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jp.co.ndensan.reams.db.dbe.definition.core.Renban;
import jp.co.ndensan.reams.db.dbe.entity.db.relate.shinseishadataout.ChosahyoEntity;
import jp.co.ndensan.reams.db.dbe.entity.euc.shinseishadataout.DBE010002_ChosahyoJoho99AEucEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.core.tokuteishippei.TokuteiShippei;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ChosaKubun;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser01;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser02;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser03;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser04;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser08;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser09;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser14;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser15;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser16;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser20;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser21;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser22;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser23;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser30;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser31;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser32;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser33;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaAnser34;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ChosaJisshiBashoCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.GenzainoJokyoCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.IsJutakuKaishu;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.NinchishoNichijoSeikatsuJiritsudoCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.NinteiChousaIraiKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ServiceKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.chosain.ShogaiNichijoSeikatsuJiritsudoCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ichijihantei.IchijiHanteiKekkaCode99;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ichijihantei.JotaiAnteiseiCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ichijihantei.KariIchijiHanteiKubun;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.ichijihantei.SuiteiKyufuKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.HihokenshaKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiHoreiCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.NinteiShinseiShinseijiKubunCode;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.ShienShinseiKubun;
import jp.co.ndensan.reams.db.dbz.definition.core.yokaigonintei.shinsei.ShoriJotaiKubun;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5207NinteichosahyoServiceJokyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5208NinteichosahyoServiceJokyoFlagEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5209NinteichosahyoKinyuItemEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5210NinteichosahyoShisetsuRiyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5211NinteichosahyoChosaItemEntity;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.Gender;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 申請者調査票情報99ACSVエンティティ編集クラスです。
 *
 * @author N3212 竹内 和紀
 */
public class ChosahyoJoho99AEucEntityEditor {

    private static final RString 改行 = new RString("<br/>");
    private static final RString 下矢印 = new RString("↓");
    private static final Decimal 十 = new Decimal("10");

    private ChosahyoJoho99AEucEntityEditor() {
    }

    /**
     * DBE010002_ChosahyoJoho99AEucEntityを編集して返します。
     *
     * @param entity ChosahyoEntity
     * @param サービスの状況List DbT5207NinteichosahyoServiceJokyoEntityのリスト
     * @param サービスの状況フラグList DbT5208NinteichosahyoServiceJokyoFlagEntityのリスト
     * @param 記入項目List DbT5209NinteichosahyoKinyuItemEntityのリスト
     * @param 施設利用List DbT5210NinteichosahyoShisetsuRiyoEntityのリスト
     * @param 調査項目List DbT5211NinteichosahyoChosaItemEntityのリスト
     * @return DBE010002_ChosahyoJoho99AEucEntity
     */
    public static DBE010002_ChosahyoJoho99AEucEntity edit(ChosahyoEntity entity,
            List<DbT5207NinteichosahyoServiceJokyoEntity> サービスの状況List,
            List<DbT5208NinteichosahyoServiceJokyoFlagEntity> サービスの状況フラグList,
            List<DbT5209NinteichosahyoKinyuItemEntity> 記入項目List,
            List<DbT5210NinteichosahyoShisetsuRiyoEntity> 施設利用List,
            List<DbT5211NinteichosahyoChosaItemEntity> 調査項目List) {
        DBE010002_ChosahyoJoho99AEucEntity eucEntity = new DBE010002_ChosahyoJoho99AEucEntity();
        eucEntity.set申請書管理番号(entity.getShinseishoKanriNo());
        eucEntity.set保険者番号(entity.getShoKisaiHokenshaNo());
        eucEntity.set保険者名(entity.getShichosonMeisho());
        eucEntity.set被保険者番号(entity.getHihokenshaNo());
        eucEntity.set被保険者氏名(nullToEmpty(entity.getHihokenshaName()));
        eucEntity.set性別コード(nullToEmpty(entity.getSeibetsu()));
        eucEntity.set性別((entity.getSeibetsu() != null && !entity.getSeibetsu().isEmpty())
                ? Gender.toValue(entity.getSeibetsu().value()).getCommonName() : RString.EMPTY);
        eucEntity.set生年月日(format日付(entity.getSeinengappiYMD()));
        eucEntity.set年齢(new RString(entity.getAge()));
        eucEntity.set被保険者区分コード(entity.getHihokenshaKubunCode());
        eucEntity.set被保険者区分((entity.getHihokenshaKubunCode() != null && !entity.getHihokenshaKubunCode().trim().isEmpty())
                ? HihokenshaKubunCode.toValue(entity.getHihokenshaKubunCode()).get名称() : RString.EMPTY);
        eucEntity.set_２号特定疾病コード(entity.getNigoTokuteiShippeiCode());
        eucEntity.set_２号特定疾病名((entity.getNigoTokuteiShippeiCode() != null && !entity.getNigoTokuteiShippeiCode().trim().isEmpty())
                ? TokuteiShippei.toValue(entity.getNigoTokuteiShippeiCode()).get名称() : RString.EMPTY);
        eucEntity.set申請日(format日付(entity.getNinteiShinseiYMD()));
        eucEntity.set申請書区分コード(entity.getShienShinseiKubun());
        eucEntity.set申請書区分((entity.getShienShinseiKubun() != null && !entity.getShienShinseiKubun().trim().isEmpty())
                ? ShienShinseiKubun.toValue(entity.getShienShinseiKubun()).get名称() : RString.EMPTY);
        eucEntity.set申請区分_法令_コード(nullToEmpty(entity.getNinteiShinseiHoreiKubunCode()));
        eucEntity.set申請区分_法令((entity.getNinteiShinseiHoreiKubunCode() != null && !entity.getNinteiShinseiHoreiKubunCode().isEmpty())
                ? NinteiShinseiHoreiCode.toValue(entity.getNinteiShinseiHoreiKubunCode().value()).get名称() : RString.EMPTY);
        eucEntity.set申請区分_申請時_コード(nullToEmpty(entity.getNinteiShinseiShinseijiKubunCode()));
        eucEntity.set申請区分_申請時((entity.getNinteiShinseiShinseijiKubunCode() != null && !entity.getNinteiShinseiShinseijiKubunCode().isEmpty())
                ? NinteiShinseiShinseijiKubunCode.toValue(entity.getNinteiShinseiShinseijiKubunCode().value()).get名称() : RString.EMPTY);
        eucEntity.set処理状態区分コード(nullToEmpty(entity.getShoriJotaiKubun()));
        eucEntity.set処理状態区分((entity.getShoriJotaiKubun() != null && !entity.getShoriJotaiKubun().isEmpty())
                ? ShoriJotaiKubun.toValue(entity.getShoriJotaiKubun().value()).get名称() : RString.EMPTY);
        eucEntity.set申請時_調査委託先コード(entity.getShinseiNinteiChosaItakusakiCode());
        eucEntity.set申請時_調査委託先名称(entity.getShinseiJigyoshaMeisho());
        eucEntity.set申請時_調査員コード(entity.getShinseiNinteiChosainCode());
        eucEntity.set申請時_調査員名(entity.getShinseiChosainShimei());
        eucEntity.set依頼区分コード(nullToEmpty(entity.getNinteichosaIraiKubunCode()));
        eucEntity.set依頼区分((entity.getNinteichosaIraiKubunCode() != null && !entity.getNinteichosaIraiKubunCode().isEmpty())
                ? NinteiChousaIraiKubunCode.toValue(entity.getNinteichosaIraiKubunCode().value()).get名称() : RString.EMPTY);
        eucEntity.set依頼時_調査委託先コード(nullToEmpty(entity.getIraiNinteichosaItakusakiCode()));
        eucEntity.set依頼時_調査委託先名称(entity.getIraiJigyoshaMeisho());
        eucEntity.set依頼時_調査員コード(entity.getIraiNinteiChosainCode());
        eucEntity.set依頼時_調査員名(entity.getIraiChosainShimei());
        eucEntity.set入手時_調査委託先コード(nullToEmpty(entity.getNyushuChosaItakusakiCode()));
        eucEntity.set入手時_調査委託先名称(entity.getNyushuIraiJigyoshaMeisho());
        eucEntity.set入手時_調査員コード(entity.getNyushuChosainCode());
        eucEntity.set入手時_調査員名(entity.getNyushuIraiChosainShimei());
        eucEntity.set調査回数(new RString(entity.getNinteichosaIraiKaisu()));
        eucEntity.set調査実施日(format日付(entity.getNinteichosaJisshiYMD()));
        eucEntity.set受領日(format日付(entity.getNinteichosaJuryoYMD()));
        eucEntity.set調査区分コード(nullToEmpty(entity.getNinteiChosaKubunCode()));
        eucEntity.set調査区分((entity.getNinteiChosaKubunCode() != null && !entity.getNinteiChosaKubunCode().isEmpty())
                ? ChosaKubun.toValue(entity.getNinteiChosaKubunCode().value()).get名称() : RString.EMPTY);
        eucEntity.set実施場所コード(nullToEmpty(entity.getChosaJisshiBashoCode()));
        eucEntity.set実施場所((entity.getChosaJisshiBashoCode() != null && !entity.getChosaJisshiBashoCode().isEmpty())
                ? ChosaJisshiBashoCode.toValue(entity.getChosaJisshiBashoCode().value()).get名称() : RString.EMPTY);
        eucEntity.set実施場所名称(entity.getChosaJisshiBashoMeisho());
        eucEntity.setサービス区分コード(nullToEmpty(entity.getServiceKubunCode()));
        eucEntity.setサービス区分((entity.getServiceKubunCode() != null && !entity.getServiceKubunCode().isEmpty())
                ? ServiceKubunCode.toValue(entity.getServiceKubunCode().value()).get名称() : RString.EMPTY);
        eucEntity.set訪問介護(getサービスの状況(サービスの状況List, Renban._1.getValue()));
        eucEntity.set訪問入浴介護(getサービスの状況(サービスの状況List, Renban._2.getValue()));
        eucEntity.set訪問看護(getサービスの状況(サービスの状況List, Renban._3.getValue()));
        eucEntity.set訪問リハビリ(getサービスの状況(サービスの状況List, Renban._4.getValue()));
        eucEntity.set居宅療養管理指導(getサービスの状況(サービスの状況List, Renban._5.getValue()));
        eucEntity.set通所介護(getサービスの状況(サービスの状況List, Renban._6.getValue()));
        eucEntity.set通所リハビリ(getサービスの状況(サービスの状況List, Renban._7.getValue()));
        eucEntity.set福祉用具貸与(getサービスの状況(サービスの状況List, Renban._8.getValue()));
        eucEntity.set短期入所生活介護(getサービスの状況(サービスの状況List, Renban._9.getValue()));
        eucEntity.set短期入所療養介護(getサービスの状況(サービスの状況List, Renban._10.getValue()));
        eucEntity.set認知症対応型共同生活介護(getサービスの状況(サービスの状況List, Renban._11.getValue()));
        eucEntity.set特定施設入所者生活介護(getサービスの状況(サービスの状況List, Renban._12.getValue()));
        eucEntity.set福祉用具購入(getサービスの状況(サービスの状況List, Renban._13.getValue()));
        eucEntity.set住宅改修(get住宅改修(サービスの状況フラグList));
        eucEntity.set市町村特別給付(get記入項目(記入項目List, Renban._1.getValue()));
        eucEntity.set介護保険給付外の在宅サービス(get記入項目(記入項目List, Renban._2.getValue()));
        RString 現在の状況コード = get現在の状況コード(施設利用List);
        eucEntity.set現在の状況コード(現在の状況コード);
        eucEntity.set現在の状況(GenzainoJokyoCode.toValue(現在の状況コード).get名称());
        eucEntity.set利用施設名(entity.getRiyoShisetsuShimei());
        eucEntity.set特記事項(convert改行(entity.getTokki()));
        eucEntity.set麻痺等_左上肢(get調査項目01名称(get調査項目(調査項目List, Renban._1.getValue())));
        eucEntity.set麻痺等_右上肢(get調査項目01名称(get調査項目(調査項目List, Renban._2.getValue())));
        eucEntity.set麻痺等_左下肢(get調査項目01名称(get調査項目(調査項目List, Renban._3.getValue())));
        eucEntity.set麻痺等_右下肢(get調査項目01名称(get調査項目(調査項目List, Renban._4.getValue())));
        eucEntity.set麻痺等_その他(get調査項目01名称(get調査項目(調査項目List, Renban._5.getValue())));
        eucEntity.set拘縮_肩関節(get調査項目01名称(get調査項目(調査項目List, Renban._6.getValue())));
        eucEntity.set拘縮_肘関節(get調査項目01名称(get調査項目(調査項目List, Renban._7.getValue())));
        eucEntity.set拘縮_股関節(get調査項目01名称(get調査項目(調査項目List, Renban._8.getValue())));
        eucEntity.set拘縮_膝関節(get調査項目01名称(get調査項目(調査項目List, Renban._9.getValue())));
        eucEntity.set拘縮_足関節(get調査項目01名称(get調査項目(調査項目List, Renban._10.getValue())));
        eucEntity.set拘縮_その他(get調査項目01名称(get調査項目(調査項目List, Renban._11.getValue())));
        eucEntity.set寝返り(get調査項目02名称(get調査項目(調査項目List, Renban._12.getValue())));
        eucEntity.set起き上がり(get調査項目02名称(get調査項目(調査項目List, Renban._13.getValue())));
        eucEntity.set座位保持(get調査項目03名称(get調査項目(調査項目List, Renban._14.getValue())));
        eucEntity.set非接地座位保持(get調査項目03名称(get調査項目(調査項目List, Renban._15.getValue())));
        eucEntity.set両足での立位(get調査項目04名称(get調査項目(調査項目List, Renban._16.getValue())));
        eucEntity.set歩行(get調査項目02名称(get調査項目(調査項目List, Renban._17.getValue())));
        eucEntity.set移乗(get調査項目20名称(get調査項目(調査項目List, Renban._18.getValue())));
        eucEntity.set立ち上がり(get調査項目02名称(get調査項目(調査項目List, Renban._19.getValue())));
        eucEntity.set片足での立位(get調査項目04名称(get調査項目(調査項目List, Renban._20.getValue())));
        eucEntity.set浴槽の出入り(get調査項目21名称(get調査項目(調査項目List, Renban._21.getValue())));
        eucEntity.set洗身(get調査項目21名称(get調査項目(調査項目List, Renban._22.getValue())));
        eucEntity.setじょくそう(get調査項目01名称(get調査項目(調査項目List, Renban._23.getValue())));
        eucEntity.set他の皮膚疾患(get調査項目01名称(get調査項目(調査項目List, Renban._24.getValue())));
        eucEntity.set片手胸元上げ(get調査項目30名称(get調査項目(調査項目List, Renban._25.getValue())));
        eucEntity.setえん下(get調査項目31名称(get調査項目(調査項目List, Renban._26.getValue())));
        eucEntity.set尿意(get調査項目16名称(get調査項目(調査項目List, Renban._27.getValue())));
        eucEntity.set便意(get調査項目16名称(get調査項目(調査項目List, Renban._28.getValue())));
        eucEntity.set排尿後の後始末(get調査項目32名称(get調査項目(調査項目List, Renban._29.getValue())));
        eucEntity.set排便後の後始末(get調査項目32名称(get調査項目(調査項目List, Renban._30.getValue())));
        eucEntity.set食事摂取(get調査項目33名称(get調査項目(調査項目List, Renban._31.getValue())));
        eucEntity.set口腔清潔(get調査項目22名称(get調査項目(調査項目List, Renban._32.getValue())));
        eucEntity.set洗顔(get調査項目22名称(get調査項目(調査項目List, Renban._33.getValue())));
        eucEntity.set整髪(get調査項目22名称(get調査項目(調査項目List, Renban._34.getValue())));
        eucEntity.setつめ切り(get調査項目22名称(get調査項目(調査項目List, Renban._35.getValue())));
        eucEntity.setボタンのかけはずし(get調査項目34名称(get調査項目(調査項目List, Renban._36.getValue())));
        eucEntity.set上衣の着脱(get調査項目34名称(get調査項目(調査項目List, Renban._37.getValue())));
        eucEntity.setズボン等の着脱(get調査項目34名称(get調査項目(調査項目List, Renban._38.getValue())));
        eucEntity.set靴下の着脱(get調査項目34名称(get調査項目(調査項目List, Renban._39.getValue())));
        eucEntity.set居室の掃除(get調査項目22名称(get調査項目(調査項目List, Renban._40.getValue())));
        eucEntity.set薬の内服(get調査項目22名称(get調査項目(調査項目List, Renban._41.getValue())));
        eucEntity.set金銭の管理(get調査項目22名称(get調査項目(調査項目List, Renban._42.getValue())));
        eucEntity.setひどい物忘れ(get調査項目16名称(get調査項目(調査項目List, Renban._43.getValue())));
        eucEntity.set周囲への無関心(get調査項目16名称(get調査項目(調査項目List, Renban._44.getValue())));
        eucEntity.set視力(get調査項目08名称(get調査項目(調査項目List, Renban._45.getValue())));
        eucEntity.set聴力(get調査項目09名称(get調査項目(調査項目List, Renban._46.getValue())));
        eucEntity.set意思の伝達(get調査項目14名称(get調査項目(調査項目List, Renban._47.getValue())));
        eucEntity.set指示への反応(get調査項目23名称(get調査項目(調査項目List, Renban._48.getValue())));
        eucEntity.set毎日の日課を理解(get調査項目15名称(get調査項目(調査項目List, Renban._49.getValue())));
        eucEntity.set生年月日をいう(get調査項目15名称(get調査項目(調査項目List, Renban._50.getValue())));
        eucEntity.set短期記憶(get調査項目15名称(get調査項目(調査項目List, Renban._51.getValue())));
        eucEntity.set自分の名前をいう(get調査項目15名称(get調査項目(調査項目List, Renban._52.getValue())));
        eucEntity.set今の季節を理解(get調査項目15名称(get調査項目(調査項目List, Renban._53.getValue())));
        eucEntity.set場所の理解(get調査項目15名称(get調査項目(調査項目List, Renban._54.getValue())));
        eucEntity.set被害的(get調査項目16名称(get調査項目(調査項目List, Renban._55.getValue())));
        eucEntity.set作話(get調査項目16名称(get調査項目(調査項目List, Renban._56.getValue())));
        eucEntity.set幻視幻聴(get調査項目16名称(get調査項目(調査項目List, Renban._57.getValue())));
        eucEntity.set感情が不安定(get調査項目16名称(get調査項目(調査項目List, Renban._58.getValue())));
        eucEntity.set昼夜逆転(get調査項目16名称(get調査項目(調査項目List, Renban._59.getValue())));
        eucEntity.set暴言暴行(get調査項目16名称(get調査項目(調査項目List, Renban._60.getValue())));
        eucEntity.set同じ話をする(get調査項目16名称(get調査項目(調査項目List, Renban._61.getValue())));
        eucEntity.set大声をだす(get調査項目16名称(get調査項目(調査項目List, Renban._62.getValue())));
        eucEntity.set介護に抵抗(get調査項目16名称(get調査項目(調査項目List, Renban._63.getValue())));
        eucEntity.set常時の徘徊(get調査項目16名称(get調査項目(調査項目List, Renban._64.getValue())));
        eucEntity.set落ち着きなし(get調査項目16名称(get調査項目(調査項目List, Renban._65.getValue())));
        eucEntity.set外出して戻れない(get調査項目16名称(get調査項目(調査項目List, Renban._66.getValue())));
        eucEntity.set一人で出たがる(get調査項目16名称(get調査項目(調査項目List, Renban._67.getValue())));
        eucEntity.set収集癖(get調査項目16名称(get調査項目(調査項目List, Renban._68.getValue())));
        eucEntity.set火の不始末(get調査項目16名称(get調査項目(調査項目List, Renban._69.getValue())));
        eucEntity.set物や衣類を壊す(get調査項目16名称(get調査項目(調査項目List, Renban._70.getValue())));
        eucEntity.set不潔行為(get調査項目16名称(get調査項目(調査項目List, Renban._71.getValue())));
        eucEntity.set異食行動(get調査項目16名称(get調査項目(調査項目List, Renban._72.getValue())));
        eucEntity.set性的迷惑行為(get調査項目16名称(get調査項目(調査項目List, Renban._73.getValue())));
        eucEntity.set点滴の管理(get調査項目01名称(get調査項目(調査項目List, Renban._74.getValue())));
        eucEntity.set中心静脈栄養(get調査項目01名称(get調査項目(調査項目List, Renban._75.getValue())));
        eucEntity.set透析(get調査項目01名称(get調査項目(調査項目List, Renban._76.getValue())));
        eucEntity.setストーマ(get調査項目01名称(get調査項目(調査項目List, Renban._77.getValue())));
        eucEntity.set酸素療法(get調査項目01名称(get調査項目(調査項目List, Renban._78.getValue())));
        eucEntity.setレスピレーター(get調査項目01名称(get調査項目(調査項目List, Renban._79.getValue())));
        eucEntity.set気管切開の処置(get調査項目01名称(get調査項目(調査項目List, Renban._80.getValue())));
        eucEntity.set疼痛の看護(get調査項目01名称(get調査項目(調査項目List, Renban._81.getValue())));
        eucEntity.set経管栄養(get調査項目01名称(get調査項目(調査項目List, Renban._82.getValue())));
        eucEntity.setモニター測定(get調査項目01名称(get調査項目(調査項目List, Renban._83.getValue())));
        eucEntity.setじょくそうの処置(get調査項目01名称(get調査項目(調査項目List, Renban._84.getValue())));
        eucEntity.setカテーテル(get調査項目01名称(get調査項目(調査項目List, Renban._85.getValue())));
        eucEntity.set障害高齢者の日常生活自立度コード(nullToEmpty(entity.getShogaiNichijoSeikatsuJiritsudoCode()));
        eucEntity.set障害高齢者の日常生活自立度(
                (entity.getShogaiNichijoSeikatsuJiritsudoCode() != null && !entity.getShogaiNichijoSeikatsuJiritsudoCode().isEmpty())
                ? ShogaiNichijoSeikatsuJiritsudoCode.toValue(entity.getShogaiNichijoSeikatsuJiritsudoCode().value()).get名称() : RString.EMPTY);
        eucEntity.set認知症高齢者の日常生活自立度コード(nullToEmpty(entity.getNinchishoNichijoSeikatsuJiritsudoCode()));
        eucEntity.set認知症高齢者の日常生活自立度(
                (entity.getNinchishoNichijoSeikatsuJiritsudoCode() != null && !entity.getNinchishoNichijoSeikatsuJiritsudoCode().isEmpty())
                ? NinchishoNichijoSeikatsuJiritsudoCode.toValue(
                        entity.getNinchishoNichijoSeikatsuJiritsudoCode().value()).get名称() : RString.EMPTY);
        eucEntity.set判定区分コード(KariIchijiHanteiKubun.toValue(entity.isKariIchijiHanteiKubun()).get名称());
        eucEntity.set判定区分(KariIchijiHanteiKubun.toValue(entity.isKariIchijiHanteiKubun()).get名称());
        eucEntity.set一次判定日(format日付(entity.getIchijiHanteiYMD()));
        eucEntity.set一次判定結果コード(nullToEmpty(entity.getIchijiHanteiKekkaCode()));
        eucEntity.set一次判定結果((entity.getIchijiHanteiKekkaCode() != null && !entity.getIchijiHanteiKekkaCode().isEmpty())
                ? IchijiHanteiKekkaCode99.toValue(entity.getIchijiHanteiKekkaCode().value()).get名称() : RString.EMPTY);
        eucEntity.set一次判定結果コード_認知症加算(nullToEmpty(entity.getIchijiHanteiKekkaNinchishoKasanCode()));
        eucEntity.set一次判定結果_認知症加算(
                (entity.getIchijiHanteiKekkaNinchishoKasanCode() != null && !entity.getIchijiHanteiKekkaNinchishoKasanCode().isEmpty())
                ? IchijiHanteiKekkaCode99.toValue(entity.getIchijiHanteiKekkaNinchishoKasanCode().value()).get名称() : RString.EMPTY);
        eucEntity.set要介護認定基準時間(format得点(entity.getKijunJikan()));
        eucEntity.set要基準時間_食事(format得点(entity.getKijunJikanShokuji()));
        eucEntity.set要基準時間_排泄(format得点(entity.getKijunJikanHaisetsu()));
        eucEntity.set要基準時間_移動(format得点(entity.getKijunJikanIdo()));
        eucEntity.set要基準時間_清潔保持(format得点(entity.getKijunJikanSeiketsuHoji()));
        eucEntity.set要基準時間_間接ケア(format得点(entity.getKijunJikanKansetsuCare()));
        eucEntity.set要基準時間_BPSD問題(format得点(entity.getKijunJikanBPSDKanren()));
        eucEntity.set要基準時間_機能訓練(format得点(entity.getKijunJikanKinoKunren()));
        eucEntity.set要基準時間_医療関連(format得点(entity.getKijunJikanIryoKanren()));
        eucEntity.set要基準時間_認知症加算(format得点(entity.getKijunJikanNinchishoKasan()));
        eucEntity.set中間評価項目得点第１群(format得点(entity.getChukanHyokaKomoku1gun()));
        eucEntity.set中間評価項目得点第２群(format得点(entity.getChukanHyokaKomoku2gun()));
        eucEntity.set中間評価項目得点第３群(format得点(entity.getChukanHyokaKomoku3gun()));
        eucEntity.set中間評価項目得点第４群(format得点(entity.getChukanHyokaKomoku4gun()));
        eucEntity.set中間評価項目得点第５群(format得点(entity.getChukanHyokaKomoku5gun()));
        eucEntity.set一次判定警告コード(get一次判定警告コード(entity.getIchijiHnateiKeikokuCode()));
        eucEntity.set状態の安定性コード(nullToEmpty(entity.getJotaiAnteiseiCode()));
        eucEntity.set状態の安定性((entity.getJotaiAnteiseiCode() != null && !entity.getJotaiAnteiseiCode().isEmpty())
                ? JotaiAnteiseiCode.toValue(entity.getJotaiAnteiseiCode().value()).get名称() : RString.EMPTY);
        eucEntity.set認知症自立度Ⅱ以上の蓋然性(nullToEmpty(entity.getNinchishoJiritsudoIIijoNoGaizensei()));
        eucEntity.set給付区分コード(nullToEmpty(entity.getSuiteiKyufuKubunCode()));
        eucEntity.set給付区分((entity.getSuiteiKyufuKubunCode() != null && !entity.getSuiteiKyufuKubunCode().isEmpty())
                ? SuiteiKyufuKubunCode.toValue(entity.getSuiteiKyufuKubunCode().value()).get名称() : RString.EMPTY);
        return eucEntity;
    }

    private static RString get一次判定警告コード(RString 一次判定警告コード) {
        if (一次判定警告コード != null && !一次判定警告コード.trim().isEmpty()) {
            Pattern pattern = Pattern.compile("[^0]");
            Matcher matcher = pattern.matcher(一次判定警告コード);
            if (matcher.find()) {
                return 一次判定警告コード;
            }
        }
        return RString.EMPTY;
    }

    private static RString getサービスの状況(List<DbT5207NinteichosahyoServiceJokyoEntity> サービスの状況List, int 連番) {
        for (DbT5207NinteichosahyoServiceJokyoEntity サービスの状況 : サービスの状況List) {
            if (サービスの状況.getRemban() == 連番) {
                return new RString(サービスの状況.getServiceJokyo());
            }
        }
        return new RString("0");
    }

    private static RString get住宅改修(List<DbT5208NinteichosahyoServiceJokyoFlagEntity> サービスの状況フラグList) {
        for (DbT5208NinteichosahyoServiceJokyoFlagEntity サービスの状況フラグ : サービスの状況フラグList) {
            if (サービスの状況フラグ.getRemban() == Renban._1.getValue()) {
                return IsJutakuKaishu.toValue(サービスの状況フラグ.getServiceJokyoFlag()).get名称();
            }
        }
        return RString.EMPTY;
    }

    private static RString get記入項目(List<DbT5209NinteichosahyoKinyuItemEntity> 記入項目List, int 連番) {
        for (DbT5209NinteichosahyoKinyuItemEntity 記入項目 : 記入項目List) {
            if (記入項目.getRemban() == 連番) {
                return convert改行(記入項目.getServiceJokyoKinyu());
            }
        }
        return RString.EMPTY;
    }

    private static RString get現在の状況コード(List<DbT5210NinteichosahyoShisetsuRiyoEntity> 施設利用List) {
        for (DbT5210NinteichosahyoShisetsuRiyoEntity 施設利用 : 施設利用List) {
            if (施設利用.getShisetsuRiyoFlag()) {
                return new RString(施設利用.getRemban());
            }
        }
        return new RString("1");
    }

    private static RString get調査項目(List<DbT5211NinteichosahyoChosaItemEntity> 調査項目List, int 連番) {
        for (DbT5211NinteichosahyoChosaItemEntity 調査項目 : 調査項目List) {
            if (調査項目.getRemban() == 連番) {
                return 調査項目.getResearchItem();
            }
        }
        return RString.EMPTY;
    }

    private static RString get調査項目01名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser01.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目02名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser02.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目03名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser03.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目04名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser04.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目08名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser08.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目09名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser09.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目14名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser14.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目15名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser15.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目16名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser16.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目20名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser20.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目21名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser21.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目22名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser22.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目23名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser23.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目30名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser30.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目31名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser31.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目32名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser32.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目33名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser33.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString get調査項目34名称(RString code) {
        return (code != null && !code.trim().isEmpty()) ? ChosaAnser34.toValue(code).get名称() : RString.EMPTY;
    }

    private static RString format得点(int value) {
        return new RString(new Decimal(value).divide(十).toString("##0.0"));
    }

    private static RString format日付(FlexibleDate value) {
        return value.seireki().separator(Separator.SLASH).fillType(FillType.ZERO).toDateString();
    }

    private static RString convert改行(RString text) {
        return new RStringBuilder(text).replace(改行, 下矢印).toRString();
    }

    private static RString nullToEmpty(Code item) {
        return (item != null) ? item.value() : RString.EMPTY;
    }

    private static RString nullToEmpty(AtenaMeisho item) {
        return (item != null) ? item.value() : RString.EMPTY;
    }

    private static RString nullToEmpty(JigyoshaNo item) {
        return (item != null) ? item.value() : RString.EMPTY;
    }

    private static RString nullToEmpty(Decimal item) {
        return (item != null) ? new RString(item.toString()) : RString.EMPTY;
    }
}
