/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.reportid;

import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票ＩＤの列挙型です。
 *
 * @reamsid_L DBA-9999-021 zhengsongling
 */
public enum ReportIdDBZ {

    /**
     * 要介護認定調査票差異チェック票(両面左)の帳票ＩＤです。
     */
    DBE292003(new ReportId("DBE292003_SaiChekkuhyoHidari"), new RString("要介護認定調査票差異チェック票(両面左)")),
    /**
     * 要介護認定調査票差異チェック票(両面右)の帳票ＩＤです。
     */
    DBE292002(new ReportId("DBE292002_SaiChekkuhyoMigi"), new RString("要介護認定調査票差異チェック票(両面右)")),
    /**
     * 主治医意見書作成料請求書です。
     */
    DBE234001(new ReportId("DBE234001_ShujiiIkenshoSakuseiRyoSeikyusho"), new RString("主治医意見書作成料請求書")),
    /**
     * 主治医意見書作成依頼書の帳票ＩＤです。
     */
    DBE230001(new ReportId("DBE230001_ShujiiIkenshoSakuseiIraisho"), new RString("主治医意見書作成依頼書")),
    /**
     * 要介護認定調査票差異チェック票(片面)の帳票ＩＤです。
     */
    DBE292001(new ReportId("DBE292001_SaiChekkuhyo"), new RString("要介護認定調査票差異チェック票")),
    /**
     * 要介護認定調査票（概況特記）の帳票ID。
     */
    DBE221051(new ReportId("DBE221051_GaikyotokkiA4"), new RString("要介護認定調査票（概況特記）")),
    /**
     * 要介護認定調査票（デザイン）両面の帳票ＩＤです。
     */
    DBE221001(new ReportId("DBE221001_ChosahyoDesignRyomen"), new RString("要介護認定調査票（デザイン用紙）")),
    /**
     * 要介護認定調査票（デザイン）片面の帳票ＩＤです。
     */
    DBE221002(new ReportId("DBE221002_ChosahyoDesignKatamen"), new RString("要介護認定調査票（デザイン用紙）")),
    /**
     * 要介護認定調査票OCR両面の帳票ＩＤです。
     */
    DBE221011(new ReportId("DBE221011_ChosahyoOcrRyomen"), new RString("要介護認定調査票（OCR）")),
    /**
     * 要介護認定調査票OCR片面の帳票ＩＤです。
     */
    DBE221012(new ReportId("DBE221012_ChosahyoOcrKatamen"), new RString("要介護認定調査票（OCR）")),
    /**
     * 要介護認定調査票（特記事項）デザイン用紙の帳票ＩＤです。
     */
    DBE221003(new ReportId("DBE221003_ChosahyoTokkijikoDesign"), new RString("要介護認定調査票（特記事項）")),
    /**
     * 要介護認定調査票（特記事項）OCR両面の帳票ＩＤです。
     */
    DBE221031(new ReportId("DBE221031_ChosahyoTokkijikoOcrRyomen"), new RString("要介護認定調査票（特記事項）")),
    /**
     * 要介護認定調査票（特記事項）OCR片面の帳票ＩＤです。
     */
    DBE221032(new ReportId("DBE221032_ChosahyoTokkijikoOcrKatamen"), new RString("要介護認定調査票（特記事項）")),
    /**
     * 要介護認定調査票（特記事項）項目有りの帳票ＩＤです。
     */
    DBE221022_1(new ReportId("DBE221022_ChosahyoTokkijikoKomokuAri"), new RString("要介護認定調査票（特記事項）項目有り")),
    /**
     * 要介護認定調査票（特記事項）項目無しの帳票ＩＤです。
     */
    DBE221022_2(new ReportId("DBE221022_ChosahyoTokkijikoKomokuNashi"), new RString("要介護認定調査票（特記事項）項目無し")),
    /**
     * 要介護認定調査票（特記事項）フリー様式の帳票ＩＤです。
     */
    DBE221022_3(new ReportId("DBE221022_ChosahyoTokkijikoFree"), new RString("要介護認定調査票（特記事項）フリー様式")),
    /**
     * 要介護認定調査票（特記事項）項目有り（手入力）の帳票ＩＤです。
     */
    DBE221022_4(new ReportId("DBE221022_ChosahyoTokkijikoKomokuAriTenyuryoku"), new RString("要介護認定調査票（特記事項）項目有り")),
    /**
     * 要介護認定調査票（特記事項）項目無し（手入力）の帳票ＩＤです。
     */
    DBE221022_5(new ReportId("DBE221022_ChosahyoTokkijikoKomokuNashiTenyuryoku"), new RString("要介護認定調査票（特記事項）項目無し")),
    /**
     * 要介護認定調査票（特記事項）フリー様式（手入力）の帳票ＩＤです。
     */
    DBE221022_6(new ReportId("DBE221022_ChosahyoTokkijikoFreeTenyuryoku"), new RString("要介護認定調査票（特記事項）フリー様式")),
    /**
     * 介護保険診断命令書の帳票ＩＤです。
     */
    DBE235001(new ReportId("DBE235001_kaigohokenShindanMeireisho"), new RString("介護保険診断命令書")),
    /**
     * 主治医意見書作成依頼一覧の帳票ＩＤです。
     */
    DBE230002(
            new ReportId("DBE230002_IkenshoSakuseiIraiIchiranhyo"), new RString("主治医意見書作成依頼一覧")),
    /**
     * 要介護認定主治医意見書記入用紙の帳票ＩＤです。
     */
    DBE231001(new ReportId("DBE231001_ikenshokinyuyoshi"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231001RyomenMono(new ReportId("DBE231001_ikenshokinyuyoshi_Ryomen_Mono"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231001KatamenMono(new ReportId("DBE231001_ikenshokinyuyoshi_Katamen_Mono"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231011RyomenColor(new ReportId("DBE231011_ikenshokinyuyoshiOCR_Ryomen_Color"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231011KatamenColor(new ReportId("DBE231011_ikenshokinyuyoshiOCR_Katamen_Color"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231012(new ReportId("DBE231012_ikenshokinyuyoshiOCR"), new RString("要介護認定主治医意見書記入用紙")),
    DBE231014(new ReportId("DBE231014_ikenshokinyuyoshiOCR"), new RString("要介護認定主治医意見書記入用紙")),
    /**
     * 要介護認定調査依頼書の帳票ＩＤです。
     */
    DBE220001(
            new ReportId("DBE220001_ChosaIraisho"), new RString("要介護認定調査依頼書")),
    /**
     * 認定調査依頼一覧表の帳票ＩＤです。
     */
    DBE220002(
            new ReportId("DBE220002_ChosaIraiIchiranhyo"), new RString("認定調査依頼一覧表")),
    /**
     * 宛名シールの帳票ＩＤです。
     */
    DBZ100001(new ReportId("DBZ100001_AtenaSeal"), new RString("宛名シール"));

    private final ReportId reportId;
    private final RString reportName;

    private ReportIdDBZ(ReportId reportId, RString reportName) {
        this.reportId = reportId;
        this.reportName = reportName;
    }

    /**
     * 帳票ＩＤの取得します。
     *
     * @return 帳票ＩＤ
     */
    public ReportId getReportId() {
        return reportId;
    }

    /**
     * 帳票Nameの取得します。
     *
     * @return 帳票Name
     */
    public RString getReportName() {
        return reportName;
    }

}
