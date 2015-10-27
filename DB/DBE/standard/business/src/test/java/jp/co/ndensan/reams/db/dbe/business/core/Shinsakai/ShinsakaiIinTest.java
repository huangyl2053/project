/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.Shinsakai;

import jp.co.ndensan.reams.db.dbe.definition.core.enumeratedtype.ShinsainYusoKubun;
import jp.co.ndensan.reams.db.dbe.definition.core.enumeratedtype.ShinsakaiIinJokyo;
import jp.co.ndensan.reams.db.dbe.definition.core.valueobject.shinsakaiiincode.ShinsakaiIinCode;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import jp.co.ndensan.reams.ur.urz.definition.core.shikibetsutaisho.Gender;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanCode;
import jp.co.ndensan.reams.uz.uza.biz.KinyuKikanShitenCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Range;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * 介護認定審査会委員のテストです。
 *
 * @author n8178 城間篤人
 */
@RunWith(Enclosed.class)
public class ShinsakaiIinTest {

    public static class コンストラクタのテスト extends DbeTestBase {

        private ShinsakaiIinCode 委員コード;
        private Range<FlexibleDate> 委員着任期間;
        private ShinsakaiIinJokyo 審査会委員状況;
        private JigyoshaNo 事業者番号;
        private AtenaMeisho 氏名;
        private AtenaKanaMeisho カナ氏名;
        private Gender 性別;
        private ShinsakaiIinShikaku 審査会委員資格;
        private ShinsainYusoKubun 審査委員郵送区分;
        private YubinNo 郵便番号;
        private AtenaJusho 住所;
        private TelNo 電話番号;
        private ShinsakaiIinKoza 口座情報;
        private ShinsakaiIin sut;

        @Before
        public void setUp() {
            委員コード = new ShinsakaiIinCode(new RString("00000001"));
//            委員着任期間 = mock(Range.class);
            委員着任期間 = new Range<>(new FlexibleDate("20140301"), new FlexibleDate("20140331"));
            審査会委員状況 = ShinsakaiIinJokyo.有効;
            事業者番号 = new JigyoshaNo(RString.EMPTY);
            氏名 = new AtenaMeisho(RString.EMPTY);
            カナ氏名 = new AtenaKanaMeisho(RString.EMPTY);
            性別 = Gender.MALE;
            審査会委員資格 = new ShinsakaiIinShikaku(new Code("A001"), new RString("資格of資格"), new RString("資格"));
            審査委員郵送区分 = ShinsainYusoKubun.所属機関;
            郵便番号 = new YubinNo(new RString("123-1234"));
            住所 = new AtenaJusho(RString.EMPTY);
            電話番号 = new TelNo(RString.EMPTY);
            KinyuKikanCode 金融機関コード = new KinyuKikanCode(new RString("0000"));
            KinyuKikanShitenCode 金融機関支店コード = new KinyuKikanShitenCode(new RString("000"));
            //          口座情報 = mock(ShinsakaiIinKoza.class);
            口座情報 = new ShinsakaiIinKoza(金融機関コード, 金融機関支店コード, new RString("口座種別"), new RString("口座名義人"), new RString("口座名義人カナ"), new RString("口座番号"));
        }

        @Test
        public void 必須項目がそろっているとき_インスタンスが生成される() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
            assertThat(sut, is(instanceOf(ShinsakaiIin.class)));
        }

        @Test(expected = NullPointerException.class)
        public void 委員コードにnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(null, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 委員着任期間にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, null, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 審査会委員状況にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, null, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 事業者番号にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, null, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 氏名にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, null, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void カナ氏名にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, null,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 性別にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    null, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 審査会委員資格にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, null, 審査委員郵送区分, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 審査委員郵送区分にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, null, 郵便番号, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 郵便番号にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, null, 住所, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 住所にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, null, 電話番号, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 電話番号にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, null, 口座情報);
        }

        @Test(expected = NullPointerException.class)
        public void 金融機関コードにnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiIin(委員コード, 委員着任期間, 審査会委員状況, 事業者番号, 氏名, カナ氏名,
                    性別, 審査会委員資格, 審査委員郵送区分, 郵便番号, 住所, 電話番号, null);
        }
    }
}