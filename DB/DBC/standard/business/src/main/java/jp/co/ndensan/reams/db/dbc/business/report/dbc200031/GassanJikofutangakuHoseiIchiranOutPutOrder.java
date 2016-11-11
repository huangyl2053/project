/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.dbc200031;

import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 高額合算自己負担額補正一覧表発行processのPageBreakenum
 *
 * @reamsid_L DBC-2320-030 chenyadong
 */
public enum GassanJikofutangakuHoseiIchiranOutPutOrder implements IReportItems {

    /**
     * 被保険者番号
     */
    被保険者番号("0104", "被保険者番号", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"hihokenshaNo\""),
    /**
     * 申請年月日
     */
    申請年月日("0333", "申請年月日", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"shinseiYMD\""),
    /**
     * 対象年度
     */
    対象年度("0334", "対象年度", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"taishoNendo\""),
    /**
     * 申請書整理番号
     */
    申請書整理番号("0337", "申請書整理番号", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"shikyuShinseishoSeiriNo\""),
    /**
     * 証記載保険者番号
     */
    証記載保険者番号("0103", "証記載保険者番号", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"hokenshaNo\""),
    /**
     * 市町村コード
     */
    市町村コード("0016", "市町村コード", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"shichosonCode\""),
    /**
     * 行政区コード
     */
    行政区コード("0004", "行政区コード", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"gyoseikuCode\""),
    /**
     * 氏名５０音カナ
     */
    氏名５０音カナ("0010", "氏名５０音カナ", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"hihokenshaShimeiKana\""),
    /**
     * 町域コード
     */
    町域コード("0002", "町域コード", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"choikiCode\""),
    /**
     * 郵便番号
     */
    郵便番号("0001", "郵便番号", "\"KogakugassanJikofutangakuInfoHoseiTemp\".\"yubinNo\"");

    private final RString 項目ID;
    private final RString フォームフィールド名;
    private final RString myBatis項目名;

    private GassanJikofutangakuHoseiIchiranOutPutOrder(String 項目ID, String フォームフィールド名, String myBatis項目名) {
        this.項目ID = new RString(項目ID);
        this.フォームフィールド名 = new RString(フォームフィールド名);
        this.myBatis項目名 = new RString(myBatis項目名);
    }

    @Override
    public RString get項目ID() {
        return this.項目ID;
    }

    @Override
    public RString getフォームフィールド名() {
        return this.フォームフィールド名;
    }

    @Override
    public RString getMyBatis項目名() {
        return this.myBatis項目名;
    }

}