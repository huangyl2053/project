/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.ｇassankyufujissekitorikomiichiran;

import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 高額合算給付実績取込の帳票出力項目管理Enumクラスです。
 *
 * @reamsid_L DBC-2700-010 wangxingpeng
 */
public enum KogakuGassanKyufuJissekiInOutputOrder implements IReportItems {

    /**
     * 証記載保険者番号
     */
    証記載保険者番号(new RString("0103"), new RString("証記載保険者番号"), new RString("DbWT38P1.\"shoKisaiHokenshaNo\"")),
    /**
     * 郵便番号
     */
    郵便番号(new RString("0001"), new RString("郵便番号"), new RString("TEMP.\"yubinNo\"")),
    /**
     * 町域コード
     */
    町域コード(new RString("0002"), new RString("町域コード"), new RString("TEMP.\"choikiCode\"")),
    /**
     * 行政区コード
     */
    行政区コード(new RString("0004"), new RString("行政区コード"), new RString("TEMP.\"gyoseikuCode\"")),
    /**
     * 氏名５０音カナ
     */
    氏名５０音カナ(new RString("0016"), new RString("氏名５０音カナ"), new RString("TEMP.\"shimei50onKana\"")),
    /**
     * 市町村コード
     */
    市町村コード(new RString("0010"), new RString("市町村コード"), new RString("TEMP.\"shichosonCode\"")),
    /**
     * 被保険者番号
     */
    被保険者番号(new RString("0104"), new RString("被保険者番号"), new RString("TEMP.\"hihokenshaNo\"")),
    /**
     * 申請年月日
     */
    申請年月日(new RString("0333"), new RString("申請年月日"), new RString("DbWT38P1.\"shinseiYMD\"")),
    /**
     * 申請書整理番号
     */
    申請書整理番号(new RString("0337"), new RString("申請書整理番号"), new RString("DbWT38P1.\"shikyuShinseishoSeiriNo\""));

    private final RString 項目ID;
    private final RString フォームフィールド名;
    private final RString myBatis項目名;

    private KogakuGassanKyufuJissekiInOutputOrder(RString 項目ID, RString フォームフィールド名,
            RString myBatis項目名) {
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
