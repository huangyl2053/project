/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.entity.euc.jigyohokokurenkei;

import jp.co.ndensan.reams.uz.uza.io.csv.CsvField;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 様式別連携情報作成のＣＳＶを定義したEntityクラスです。
 *
 * @reamsid_L DBU-4050-020 lijia
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@lombok.Getter
public class JigyoHokokuRenkei11or14Record2or3EucCsvEntity implements IJigyoHokokuRenkeiEucCsvEntity {

    @CsvField(order = 1, name = "交換情報識別番号")
    private final RString 交換情報識別番号;
    @CsvField(order = 2, name = "レコード種別番号")
    private final RString レコード種別番号;
    @CsvField(order = 3, name = "D001")
    private final RString d001;
    @CsvField(order = 4, name = "D002")
    private final RString d002;
    @CsvField(order = 5, name = "D003")
    private final RString d003;
    @CsvField(order = 6, name = "D004")
    private final RString d004;
    @CsvField(order = 7, name = "D005")
    private final RString d005;
    @CsvField(order = 8, name = "D006")
    private final RString d006;
    @CsvField(order = 9, name = "D007")
    private final RString d007;
    @CsvField(order = 10, name = "D008")
    private final RString d008;
    @CsvField(order = 11, name = "D009")
    private final RString d009;
    @CsvField(order = 12, name = "D010")
    private final RString d010;
    @CsvField(order = 13, name = "D011")
    private final RString d011;
    @CsvField(order = 14, name = "D012")
    private final RString d012;
    @CsvField(order = 15, name = "D013")
    private final RString d013;
    @CsvField(order = 16, name = "D014")
    private final RString d014;
    @CsvField(order = 17, name = "D015")
    private final RString d015;
    @CsvField(order = 18, name = "D016")
    private final RString d016;
    @CsvField(order = 19, name = "D017")
    private final RString d017;
    @CsvField(order = 20, name = "D018")
    private final RString d018;
    @CsvField(order = 21, name = "D019")
    private final RString d019;
    @CsvField(order = 22, name = "D020")
    private final RString d020;
    @CsvField(order = 23, name = "D021")
    private final RString d021;
    @CsvField(order = 24, name = "D022")
    private final RString d022;
    @CsvField(order = 25, name = "D023")
    private final RString d023;
    @CsvField(order = 26, name = "D024")
    private final RString d024;
    @CsvField(order = 27, name = "D025")
    private final RString d025;
    @CsvField(order = 28, name = "D026")
    private final RString d026;
    @CsvField(order = 29, name = "D027")
    private final RString d027;
    @CsvField(order = 30, name = "D028")
    private final RString d028;
    @CsvField(order = 31, name = "D029")
    private final RString d029;
    @CsvField(order = 32, name = "D030")
    private final RString d030;
    @CsvField(order = 33, name = "D031")
    private final RString d031;
    @CsvField(order = 34, name = "D032")
    private final RString d032;
    @CsvField(order = 35, name = "D033")
    private final RString d033;

    /**
     * コンストラクタ
     *
     * @param 交換情報識別番号 RString
     * @param レコード種別番号 RString
     * @param d001 RString
     * @param d002 RString
     * @param d003 RString
     * @param d004 RString
     * @param d005 RString
     * @param d006 RString
     * @param d007 RString
     * @param d008 RString
     * @param d009 RString
     * @param d010 RString
     * @param d011 RString
     * @param d012 RString
     * @param d013 RString
     * @param d014 RString
     * @param d015 RString
     * @param d016 RString
     * @param d017 RString
     * @param d018 RString
     * @param d019 RString
     * @param d020 RString
     * @param d021 RString
     * @param d022 RString
     * @param d023 RString
     * @param d024 RString
     * @param d025 RString
     * @param d026 RString
     * @param d027 RString
     * @param d028 RString
     * @param d029 RString
     * @param d030 RString
     * @param d031 RString
     * @param d032 RString
     * @param d033 RString
     */
    public JigyoHokokuRenkei11or14Record2or3EucCsvEntity(
            RString 交換情報識別番号,
            RString レコード種別番号,
            RString d001,
            RString d002,
            RString d003,
            RString d004,
            RString d005,
            RString d006,
            RString d007,
            RString d008,
            RString d009,
            RString d010,
            RString d011,
            RString d012,
            RString d013,
            RString d014,
            RString d015,
            RString d016,
            RString d017,
            RString d018,
            RString d019,
            RString d020,
            RString d021,
            RString d022,
            RString d023,
            RString d024,
            RString d025,
            RString d026,
            RString d027,
            RString d028,
            RString d029,
            RString d030,
            RString d031,
            RString d032,
            RString d033
    ) {
        this.交換情報識別番号 = 交換情報識別番号;
        this.レコード種別番号 = レコード種別番号;
        this.d001 = d001;
        this.d002 = d002;
        this.d003 = d003;
        this.d004 = d004;
        this.d005 = d005;
        this.d006 = d006;
        this.d007 = d007;
        this.d008 = d008;
        this.d009 = d009;
        this.d010 = d010;
        this.d011 = d011;
        this.d012 = d012;
        this.d013 = d013;
        this.d014 = d014;
        this.d015 = d015;
        this.d016 = d016;
        this.d017 = d017;
        this.d018 = d018;
        this.d019 = d019;
        this.d020 = d020;
        this.d021 = d021;
        this.d022 = d022;
        this.d023 = d023;
        this.d024 = d024;
        this.d025 = d025;
        this.d026 = d026;
        this.d027 = d027;
        this.d028 = d028;
        this.d029 = d029;
        this.d030 = d030;
        this.d031 = d031;
        this.d032 = d032;
        this.d033 = d033;
    }
}