/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.business.report.jukyushikakushomeisho;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;

/**
 * 受給資格証明書情報です。
 *
 * @reamsid_L DBU-0490-090 suguangjun
 */
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class JukyuShikakuShomeishoBodyItem {

    private final RString hihokenshaNo;
    private final RString hihokenshaNameKana;
    private final RString hihokenshaName;
    private final RString birthGengoMeiji;
    private final RString birthGengoTaisho;
    private final RString birthGengoShowa;
    private final RString birthYMD;
    private final RString seibetsu;
    private final RString susakiYoteiJusho;
    private final RString tenshutsusakiYoteiJusho;
    private final RString idoYoteiYMD;
    private final RString hokenshaNo;
    private final RString hakkoYMD;
    private final RString ninshoshaYakushokuMei;
    private final RString recognizedName;
    private final RString denshiKoin;
    private final RString koinShoryaku;
    private final RString shichosonMei;
    private final RString shinseichu;
    private final RString shinseiYMD;
    private final RString yokaigoKubun;
    private final RString ninteiYMD;
    private final RString yukoKaishiYMD;
    private final RString yukoShuryoYMD;
    private final RString shinsakaiIken;
    private final RString biko;
    private final RString remban;
    private final RString koinMojiretsu;
    private final RString ninshoshaShimeiKakenai;
    private final RString ninshoshaShimeiKakeru;
    private final RString ninshoshaYakushokuMei1;
    private final RString ninshoshaYakushokuMei2;

    /**
     * インスタンスを生成します。
     *
     * @param hihokenshaNo 被保険者番号
     * @param hihokenshaNameKana 被保険者フリガナ
     * @param hihokenshaName 被保険者氏名
     * @param birthGengoMeiji 年号_明治
     * @param birthGengoTaisho 年号_大正
     * @param birthGengoShowa 年号_昭和
     * @param birthYMD 被保険者生年月日
     * @param seibetsu 被保険者性別
     * @param susakiYoteiJusho 被保険者住所（転出前）
     * @param tenshutsusakiYoteiJusho 被保険者住所（転出先予定）
     * @param idoYoteiYMD 被保険者異動予定日
     * @param hokenshaNo 保険者番号
     * @param hakkoYMD 発行日
     * @param ninshoshaYakushokuMei 役職名
     * @param recognizedName 認職者氏名
     * @param denshiKoin 電子公印
     * @param koinShoryaku 公印省略
     * @param shichosonMei 市町村名
     * @param shinseichu 申請状況
     * @param shinseiYMD 申請年月日
     * @param yokaigoKubun 要介護状態区分
     * @param ninteiYMD 認定年月日
     * @param yukoKaishiYMD 認定の有効期間の開始年月日
     * @param yukoShuryoYMD 認定の有効期間の終了年月日
     * @param shinsakaiIken 認定審査会の意見等
     * @param biko 備考
     * @param remban 連番
     * @param koinMojiretsu 公印文字列
     * @param ninshoshaShimeiKakenai 認証者氏名(公印に掛けない)
     * @param ninshoshaShimeiKakeru 認証者氏名(公印に掛ける)
     * @param ninshoshaYakushokuMei1 認証者役職名1
     * @param ninshoshaYakushokuMei2 認証者役職名2
     */
    public JukyuShikakuShomeishoBodyItem(RString hihokenshaNo,
            RString hihokenshaNameKana,
            RString hihokenshaName,
            RString birthGengoMeiji,
            RString birthGengoTaisho,
            RString birthGengoShowa,
            RString birthYMD,
            RString seibetsu,
            RString susakiYoteiJusho,
            RString tenshutsusakiYoteiJusho,
            RString idoYoteiYMD,
            RString hokenshaNo,
            RString hakkoYMD,
            RString ninshoshaYakushokuMei,
            RString recognizedName,
            RString denshiKoin,
            RString koinShoryaku,
            RString shichosonMei,
            RString shinseichu,
            RString shinseiYMD,
            RString yokaigoKubun,
            RString ninteiYMD,
            RString yukoKaishiYMD,
            RString yukoShuryoYMD,
            RString shinsakaiIken,
            RString biko,
            RString remban,
            RString koinMojiretsu,
            RString ninshoshaShimeiKakenai,
            RString ninshoshaShimeiKakeru,
            RString ninshoshaYakushokuMei1,
            RString ninshoshaYakushokuMei2
    ) {
        this.hihokenshaNo = hihokenshaNo;
        this.hihokenshaNameKana = hihokenshaNameKana;
        this.hihokenshaName = hihokenshaName;
        this.birthGengoMeiji = birthGengoMeiji;
        this.birthGengoTaisho = birthGengoTaisho;
        this.birthGengoShowa = birthGengoShowa;
        this.birthYMD = birthYMD;
        this.seibetsu = seibetsu;
        this.susakiYoteiJusho = susakiYoteiJusho;
        this.tenshutsusakiYoteiJusho = tenshutsusakiYoteiJusho;
        this.idoYoteiYMD = idoYoteiYMD;
        this.hokenshaNo = hokenshaNo;
        this.hakkoYMD = hakkoYMD;
        this.ninshoshaYakushokuMei = ninshoshaYakushokuMei;
        this.recognizedName = recognizedName;
        this.denshiKoin = denshiKoin;
        this.koinShoryaku = koinShoryaku;
        this.shichosonMei = shichosonMei;
        this.shinseichu = shinseichu;
        this.shinseiYMD = shinseiYMD;
        this.yokaigoKubun = yokaigoKubun;
        this.ninteiYMD = ninteiYMD;
        this.yukoKaishiYMD = yukoKaishiYMD;
        this.yukoShuryoYMD = yukoShuryoYMD;
        this.shinsakaiIken = shinsakaiIken;
        this.biko = biko;
        this.remban = remban;
        this.koinMojiretsu = koinMojiretsu;
        this.ninshoshaShimeiKakenai = ninshoshaShimeiKakenai;
        this.ninshoshaShimeiKakeru = ninshoshaShimeiKakeru;
        this.ninshoshaYakushokuMei1 = ninshoshaYakushokuMei1;
        this.ninshoshaYakushokuMei2 = ninshoshaYakushokuMei2;
    }
}