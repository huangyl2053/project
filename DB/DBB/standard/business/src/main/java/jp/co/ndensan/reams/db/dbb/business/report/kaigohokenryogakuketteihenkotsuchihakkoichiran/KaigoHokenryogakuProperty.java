/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.kaigohokenryogakuketteihenkotsuchihakkoichiran;

import jp.co.ndensan.reams.db.dbb.definition.reportid.ReportIdDBB;
import jp.co.ndensan.reams.db.dbb.entity.report.kaigohokenryogakuketteihenkotsuchihakkoichiran.KaigoHokenryogakuSource;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IReportItems;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBBRP43002_5_介護保険料額変更通知書発行一覧表 KaigoHokenryogakuProperty
 *
 * @reamsid_L DBB-0780-120 yangchenbing
 */
public class KaigoHokenryogakuProperty extends ReportPropertyBase<KaigoHokenryogakuSource> {

    private static final RString FORMAT = new RString("\"");

    /**
     * コンストラクタです。
     */
    public KaigoHokenryogakuProperty() {
        super(SubGyomuCode.DBB介護賦課, ReportIdDBB.DBB200012.getReportId());
    }

    /**
     * 帳票設計_DBBRP43002_5_介護保険料額変更通知書発行一覧表 出力順設定可能項目です。
     */
    public enum OutputOrderEnum implements IReportItems {

        /**
         * 郵便番号
         */
        郵便番号(new RString("0001"), new RString("郵便番号"), FORMAT.concat(new RString("ShikibetsuTaisho_yubinNo")).concat(FORMAT)),
        /**
         * 町域コード
         */
        町域コード(new RString("0002"), new RString("町域コード"), FORMAT.concat(new RString("ShikibetsuTaisho_choikiCode")).concat(FORMAT)),
        /**
         * 番地コード
         */
        番地コード(new RString("0003"), new RString("番地コード"), new RString("")),
        /**
         * 行政区コード
         */
        行政区コード(new RString("0004"), new RString("行政区コード"), FORMAT.concat(new RString("ShikibetsuTaisho_gyoseikuCode")).concat(FORMAT)),
        /**
         * 地区１
         */
        地区１(new RString("0005"), new RString("地区１"), FORMAT.concat(new RString("ShikibetsuTaisho_chikuCode1")).concat(FORMAT)),
        /**
         * 地区２
         */
        地区２(new RString("0006"), new RString("地区２"), FORMAT.concat(new RString("ShikibetsuTaisho_chikuCode2")).concat(FORMAT)),
        /**
         * 地区３
         */
        地区３(new RString("0007"), new RString("地区３"), FORMAT.concat(new RString("ShikibetsuTaisho_chikuCode3")).concat(FORMAT)),
        /**
         * 世帯コード
         */
        世帯コード(new RString("0008"), new RString("世帯コード"), FORMAT.concat(new RString("dbT2015KeisangoJoho_setaiCode")).concat(FORMAT)),
        /**
         * 識別コード
         */
        識別コード(new RString("0009"), new RString("識別コード"), FORMAT.concat(new RString("dbT2015KeisangoJoho_shikibetsuCode")).concat(FORMAT)),
        /**
         * 氏名５０音カナ
         */
        氏名５０音カナ(new RString("0010"), new RString("氏名５０音カナ"), new RString("")),
        /**
         * 生年月日
         */
        生年月日(new RString("0012"), new RString("生年月日"), FORMAT.concat(new RString("ShikibetsuTaisho_seinengappiYMD")).concat(FORMAT)),
        /**
         * 性別
         */
        性別(new RString("0013"), new RString("性別"), FORMAT.concat(new RString("ShikibetsuTaisho_seibetsuCode")).concat(FORMAT)),
        /**
         * 市町村コード
         */
        市町村コード(new RString("0016"), new RString("市町村コード"), new RString("")),
        /**
         * 被保険者番号
         */
        被保険者番号(new RString("0104"), new RString("被保険者番号"), FORMAT
                .concat(new RString("dbT2015KeisangoJoho_hihokenshaNo")).concat(FORMAT)),
        /**
         * 年金コード
         */
        年金コード(new RString("0206"), new RString("年金コード"), new RString("UeT0511after_nenkinCode")),
        /**
         * 納組コード
         */
        納組コード(new RString("0208"), new RString("納組コード"), FORMAT.concat(new RString("CaT0714nokumiCode")).concat(FORMAT)),
        /**
         * 生活保護
         */
        生活保護(new RString("0133"), new RString("生活保護"), new RString("")),
        /**
         * 生活保護種別
         */
        生活保護種別(new RString("0116"), new RString("生活保護種別"), new RString("")),
        /**
         * 現金口座区分
         */
        現金口座区分(new RString("0210"), new RString("現金口座区分"), new RString("")),
        /**
         * 8月特徴開始者
         */
        八月特徴開始者(new RString("0220"), new RString("八月特徴開始者"), new RString("")),
        /**
         * 10月特徴開始者
         */
        十月特徴開始者(new RString("0219"), new RString("十月特徴開始者"), new RString(""));

        private final RString 項目ID;
        private final RString フォームフィールド名;
        private final RString myBatis項目名;

        private OutputOrderEnum(RString 項目ID, RString フォームフィールド名, RString myBatis項目名) {
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
}
