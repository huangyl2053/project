/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.definition.core.hanyorisutojigyotaishosha;

import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 汎用リスト出力(事業対象者)のEnumEntity処理クラスです。
 *
 * @reamsid_L DBD-5080-030 mawy
 */
public enum JigyoTaishoshaCsvEnumEntity {

    /**
     * コード:20 名称:get識別コード 略称:定義なし
     */
    get識別コード("20", "get識別コード"),
    /**
     * コード:30 名称:get住民種別 略称:定義なし
     */
    get住民種別("30", "get住民種別"),
    /**
     * コード:40 名称:氏名 略称:定義なし
     */
    get氏名("40", "get氏名"),
    /**
     * コード:50 名称:get氏名カナ 略称:定義なし
     */
    get氏名カナ("50", "get氏名カナ"),
    /**
     * コード:20 名称:get生年月日 略称:定義なし
     */
    get生年月日("60", "get生年月日"),
    /**
     * コード:70 名称:get年齢 略称:定義なし
     */
    get年齢("70", "get年齢"),
    /**
     * コード:80 名称:get性別 略称:定義なし
     */
    get性別("80", "get性別"),
    /**
     * コード:90 名称:get続柄コード 略称:定義なし
     */
    get続柄コード("90", "get続柄コード"),
    /**
     * コード:100 名称:get世帯コード 略称:定義なし
     */
    get世帯コード("100", "get世帯コード"),
    /**
     * コード:110 名称:get世帯主名 略称:定義なし
     */
    get世帯主名("110", "get世帯主名"),
    /**
     * コード:120 名称:住所コード 略称:定義なし
     */
    get住所コード("120", "get住所コード"),
    /**
     * コード:130 名称:get郵便番号 略称:定義なし
     */
    get郵便番号("130", "get郵便番号"),
    /**
     * コード:140 名称:get住所番地方書 略称:定義なし
     */
    get住所番地方書("140", "get住所番地方書"),
    /**
     * コード:150 名称:get住所 略称:定義なし
     */
    get住所("150", "get住所"),
    /**
     * コード:160 名称:get番地 略称:定義なし
     */
    get番地("160", "get番地"),
    /**
     * コード:170 名称:get方書 略称:定義なし
     */
    get方書("170", "get方書"),
    /**
     * コード:180 名称:get行政区コード 略称:定義なし
     */
    get行政区コード("180", "get行政区コード"),
    /**
     * コード:140 名称:get住所番地方書 略称:定義なし
     */
    get行政区名("190", "get行政区名"),
    /**
     * コード:200 名称:get地区１ 略称:定義なし
     */
    get地区１("200", "get地区１"),
    /**
     * コード:210 名称:get地区２ 略称:定義なし
     */
    get地区２("210", "get地区２"),
    /**
     * コード:220 名称:get地区３ 略称:定義なし
     */
    get地区３("220", "get地区３"),
    /**
     * コード:230 名称:get住所番地方書 略称:定義なし
     */
    get連絡先１("230", "get連絡先１"),
    /**
     * コード:240 名称:get連絡先２ 略称:定義なし
     */
    get連絡先２("240", "get連絡先２"),
    /**
     * コード:250 名称:get登録異動日 略称:定義なし
     */
    get登録異動日("250", "get登録異動日"),
    /**
     * コード:260 名称:get登録事由 略称:定義なし
     */
    get登録事由("260", "get登録事由"),
    /**
     * コード:270 名称:get登録届出日 略称:定義なし
     */
    get登録届出日("270", "get登録届出日"),
    /**
     * コード:280 名称:get住定異動日 略称:定義なし
     */
    get住定異動日("280", "get住定異動日"),
    /**
     * コード:290 名称:get住定事由 略称:定義なし
     */
    get住定事由("290", "get住定事由"),
    /**
     * コード:300 名称:get住定届出日 略称:定義なし
     */
    get住定届出日("300", "get住定届出日"),
    /**
     * コード:310 名称:get消除異動日 略称:定義なし
     */
    get消除異動日("310", "get消除異動日"),
    /**
     * コード:320 名称:get消除事由 略称:定義なし
     */
    get消除事由("320", "get消除事由"),
    /**
     * コード:330 名称:get消除届出日 略称:定義なし
     */
    get消除届出日("330", "get消除届出日"),
    /**
     * コード:340 名称:get転出入理由 略称:定義なし
     */
    get転出入理由("340", "get転出入理由"),
    /**
     * コード:350 名称:get前住所郵便番号 略称:定義なし
     */
    get前住所郵便番号("350", "get前住所郵便番号"),
    /**
     * コード:360 名称:get前住所番地方書 略称:定義なし
     */
    get前住所番地方書("360", "get前住所番地方書"),
    /**
     * コード:370 名称:get前住所 略称:定義なし
     */
    get前住所("370", "get前住所"),
    /**
     * コード:380 名称:get前住所番地 略称:定義なし
     */
    get前住所番地("380", "get前住所番地"),
    /**
     * コード:390 名称:get前住所方書 略称:定義なし
     */
    get前住所方書("390", "get前住所方書"),
    /**
     * コード:400 名称:get市町村コード 略称:定義なし
     */
    get市町村コード("400", "get市町村コード"),
    /**
     * コード:410 名称:get市町村名 略称:定義なし
     */
    get市町村名("410", "get市町村名"),
    /**
     * コード:420 名称:get保険者コード 略称:定義なし
     */
    get保険者コード("420", "get保険者コード"),
    /**
     * コード:430 名称:get保険者名 略称:定義なし
     */
    get保険者名("430", "get保険者名"),
    /**
     * コード:440 名称:get空白 略称:定義なし
     */
    get空白("440", "get空白"),
    /**
     * コード:450 名称:get送付先氏名 略称:定義なし
     */
    get送付先氏名("450", "get送付先氏名"),
    /**
     * コード:460 名称:get送付先氏名カナ 略称:定義なし
     */
    get送付先氏名カナ("460", "get送付先氏名カナ"),
    /**
     * コード:450 名称:get送付先住所コード 略称:定義なし
     */
    get送付先住所コード("470", "get送付先住所コード"),
    /**
     * コード:450 名称:get送付先郵便番号 略称:定義なし
     */
    get送付先郵便番号("480", "get送付先郵便番号"),
    /**
     * コード:490 名称:get送付先住所番地方書 略称:定義なし
     */
    get送付先住所番地方書("490", "get送付先住所番地方書"),
    /**
     * コード:500 名称:get送付先住所 略称:定義なし
     */
    get送付先住所("500", "get送付先住所"),
    /**
     * コード:510 名称:get送付先番地 略称:定義なし
     */
    get送付先番地("510", "get送付先番地"),
    /**
     * コード:520 名称:get送付先住所番地方書 略称:定義なし
     */
    get送付先方書("520", "get送付先方書"),
    /**
     * コード:530 名称:get送付先行政区コード 略称:定義なし
     */
    get送付先行政区コード("530", "get送付先行政区コード"),
    /**
     * コード:540 名称:get送付先行政区名 略称:定義なし
     */
    get送付先行政区名("540", "get送付先行政区名"),
    /**
     * コード:550 名称:get被保険者番号 略称:定義なし
     */
    get被保険者番号("550", "get被保険者番号"),
    /**
     * コード:2230 名称:get履歴番号 略称:定義なし
     */
    get履歴番号("560", "get履歴番号"),
    /**
     * コード:2240 名称:get事業適用開始日 略称:定義なし
     */
    get事業適用開始日("570", "get事業適用開始日"),
    /**
     * コード:2250 名称:get事業適用終了日 略称:定義なし
     */
    get事業適用終了日("580", "get事業適用終了日"),
    /**
     * コード:2260 名称:get事業チェック実施日 略称:定義なし
     */
    get事業チェック実施日("590", "get事業チェック実施日"),
    /**
     * コード:2270 名称:get事業決定日 略称:定義なし
     */
    get事業決定日("600", "get事業決定日");
    private final RString code;
    private final RString fullName;

    private JigyoTaishoshaCsvEnumEntity(String code, String fullname) {
        this.code = new RString(code);
        this.fullName = new RString(fullname);
    }

    /**
     * 事業対象者のコードを返します。
     *
     * @return 事業対象者のコード
     */
    public RString getコード() {
        return code;
    }

    /**
     * 事業対象者の名称を返します。
     *
     * @return 事業対象者の名称
     */
    public RString get名称() {
        return fullName;
    }

    /**
     * 事業対象者のコードと一致する内容を探します。
     *
     * @param code 事業対象者のコード
     * @return {@code code} に対応する対象リスト
     */
    public static JigyoTaishoshaCsvEnumEntity toValue(RString code) {
        for (JigyoTaishoshaCsvEnumEntity tokubetsuChi : JigyoTaishoshaCsvEnumEntity.values()) {
            if (tokubetsuChi.code.equals(code)) {
                return tokubetsuChi;
            }
        }
        throw new IllegalArgumentException(UrSystemErrorMessages.変換不可.getReplacedMessage("事業対象者"));
    }
}
