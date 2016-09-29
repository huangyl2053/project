/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.gassanjigyobunkekkaichiran;

import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 総合事業分支給額計算結果一覧表OutPutOrderクラスです。
 *
 * @reamsid_L DBC-4830-030 zhujun
 */
public enum GassanJigyobunKekkaIchiranOrder implements IReportItems {

    /**
     * 証記載保険者番号
     */
    証記載保険者番号(new RString("0103"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"shoKisaiHokenshaNo\"")),
    /**
     * 郵便番号
     */
    郵便番号(new RString("0001"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"yubinNo\"")),
    /**
     * 町域コード
     */
    町域コード(new RString("0002"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"jushoCode\"")),
    /**
     * 行政区コード
     */
    行政区コード(new RString("0004"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"gyoseiCode\"")),
    /**
     * 氏名５０音カナ
     */
    氏名５０音カナ(new RString("0010"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"atenaKanaShimei\"")),
    /**
     * 市町村コード
     */
    市町村コード(new RString("0016"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"shichosonCode\"")),
    /**
     * 被保険者番号
     */
    被保険者番号(new RString("0104"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"hihokenshaNo\"")),
    /**
     * 支払方法
     */
    支払方法(new RString("0312"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"taishoNendo\"")),
    /**
     * 対象年度
     */
    対象年度(new RString("0334"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"taishoNendo\"")),
    /**
     * 支給区分コード
     */
    支給区分コード(new RString("0336"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"kettei_shikyuKubun\"")),
    /**
     * 申請書整理番号
     */
    申請書整理番号(new RString("0337"), new RString(""), new RString("\"ShikyugakuUpdateTemp\".\"shikyuShinseishoSeiriNo\""));

    private final RString 項目ID;
    private final RString フォームフィールド名;
    private final RString myBatis項目名;

    private GassanJigyobunKekkaIchiranOrder(RString 項目ID, RString フォームフィールド名, RString myBatis項目名) {
        this.項目ID = 項目ID;
        this.フォームフィールド名 = フォームフィールド名;
        this.myBatis項目名 = myBatis項目名;
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
        return myBatis項目名;

    }
}
