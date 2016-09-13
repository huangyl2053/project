/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.report.dbd800001;

import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護保険負担限度額認定申請書 出力順設定可能項目です。
 *
 * @reamsid_L DBD-3530-080 mawy
 */
public enum FutangendogakuNinteiShinseishoOrderKey implements IReportItems {

    /**
     * 項目ID:0001 フォームフィールド名:郵便番号 MyBatis項目名:郵便番号
     */
    郵便番号("0001", "郵便番号", "郵便番号"),
    /**
     * 項目ID:0002 フォームフィールド名:町域コード MyBatis項目名:町域コード
     */
    町域コード("0002", "町域コード", "町域コード"),
    /**
     * 項目ID:0004 フォームフィールド名:行政区コード MyBatis項目名:行政区コード
     */
    行政区コード("0004", "行政区コード", "行政区コード"),
    /**
     * 項目ID:0010 フォームフィールド名:氏名５０音カナ MyBatis項目名:氏名カナ
     */
    氏名５０音カナ("0010", "氏名５０音カナ", "氏名カナ"),
    /**
     * 項目ID:0012 フォームフィールド名:生年月日 MyBatis項目名:生年月日
     */
    生年月日("0012", "生年月日", "生年月日"),
    /**
     * 項目ID:0016 フォームフィールド名:市町村コード MyBatis項目名:市町村コード
     */
    市町村コード("0016", "市町村コード", "市町村コード"),
    /**
     * 項目ID:0104 フォームフィールド名:被保険者番号 MyBatis項目名:被保険者番号
     */
    被保険者番号("0104", "被保険者番号", "被保険者番号");

//TODO 指定事業者番号と計画事業者番号と契約開始年月日は検索関連のテープルから取得できません。QA:447
//    /**
//     * 項目ID:0303 フォームフィールド名:指定事業者番号 MyBatis項目名:定義なし
//     */
//    指定事業者番号("0303", "指定事業者番号", "指定事業者番号"),
//    /**
//     * 項目ID:0311 フォームフィールド名:計画事業者番号 MyBatis項目名:定義なし
//     */
//    計画事業者番号("0311", "計画事業者番号", "計画事業者番号"),
//    /**
//     * 項目ID:0343 フォームフィールド名:契約開始年月日 MyBatis項目名:定義なし
//     */
//    契約開始年月日("0343", "契約開始年月日", "契約開始年月日");
    private final RString 項目ID;
    private final RString フォームフィールド名;
    private final RString 項目名;

    private FutangendogakuNinteiShinseishoOrderKey(String 項目ID, String フォームフィールド名, String 項目名) {
        this.項目ID = new RString(項目ID);
        this.フォームフィールド名 = new RString(フォームフィールド名);
        this.項目名 = new RString(項目名);
    }

    @Override
    public RString get項目ID() {
        return 項目ID;
    }

    @Override
    public RString getフォームフィールド名() {
        return フォームフィールド名;
    }

    @Override
    public RString getMyBatis項目名() {
        return 項目名;
    }
}