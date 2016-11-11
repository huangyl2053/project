/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.tokubetsuchoshumidoteiichiran;

import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 帳票設計_DBBPR81003_1_特別徴収未同定一覧表の出力順設定
 *
 * @reamsid_L DBB-1860-050 pengxingyi
 *
 */
public enum TokubetsuChoshuMidoteiIchiranOutputOrder implements IReportItems {

    /**
     * 氏名５０音カナ
     */
    氏名５０音カナ(new RString("0010"), new RString("氏名５０音カナ"), new RString("\"dtKanaShimei\"")),
    /**
     * 生年月日
     */
    生年月日(new RString("0012"), new RString("生年月日"), new RString("\"dtBirthDay\"")),
    /**
     * 性別
     */
    性別(new RString("0013"), new RString("性別"), new RString("\"dtSeibetsu\"")),
    /**
     * 市町村コード
     */
    市町村コード(new RString("0016"), new RString("市町村コード"), new RString("\"genLasdecCode\"")),
    /**
     * 年金コード
     */
    年金コード(new RString("0206"), new RString("年金コード"), new RString("\"nenkinCode\"")),
    /**
     * 年金番号
     */
    年金番号(new RString("0207"), new RString("年金番号"), new RString("\"kisoNenkinNo\""));

    private final RString 項目ID;
    private final RString フォームフィールド名;
    private final RString myBatis項目名;

    private TokubetsuChoshuMidoteiIchiranOutputOrder(RString 項目ID, RString フォームフィールド名, RString myBatis項目名) {
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