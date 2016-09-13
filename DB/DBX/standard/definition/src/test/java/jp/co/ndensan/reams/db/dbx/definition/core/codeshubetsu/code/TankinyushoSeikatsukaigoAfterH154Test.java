/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  jp.co.ndensan.reams.db.dbx.definition.core.codeshubetsu.code;

import jp.co.ndensan.reams.db.dbx.definition.core.codeshubetsu.code.TankinyushoSeikatsukaigoAfterH154;
import jp.co.ndensan.reams.db.dbx.testhelper.DbxTestBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * 短期入所生活介護_平成15年4月以降を表すドメインクラスのテストクラスです。
 *
 * @author LDNS 袁国棟
 */
@RunWith(Enclosed.class)
public class TankinyushoSeikatsukaigoAfterH154Test extends DbxTestBase {

    private static TankinyushoSeikatsukaigoAfterH154 sut;

    @BeforeClass
    public static void setUp() {
        sut = new TankinyushoSeikatsukaigoAfterH154(new RString("10"));
    }

    /**
     * valueのテストです。
     *
     */
    public static class valueテスト extends DbxTestBase {

        @Test
        public void LDNS_コード種別に10を指定した場合_valueは_コード10を返す() {
            assertThat(sut.value(), is(new Code(new RString("10"))));
        }
    }

    /**
     * equalsのテストです。
     *
     */
    public static class equalsテスト extends DbxTestBase {

        @Test
        public void LDNS_Objectがnullの場合_equalsは_falseを返す() {
            Object obj = null;
            assertFalse(sut.equals(obj));
        }

        @Test
        public void LDNS_Objectが1234567かつTankinyushoSeikatsukaigo_AfterH15_4ではないの場合_equalsは_falseを返す() {
            Object obj = new RString("1111");
            assertFalse(sut.equals(obj));
        }

        @Test
        public void LDNS_Objectのcodeとコンストラクタのcodeが不一致の場合_equalsは_falseを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut2 = new TankinyushoSeikatsukaigoAfterH154(new RString("90"));
            assertFalse(sut.equals(sut2));
        }

        @Test
        public void LDNS_Object値とコンストラクタ値が一致の場合_equalsは_trueを返す() {
            assertTrue(sut.equals(new TankinyushoSeikatsukaigoAfterH154(new RString("10"))));
        }

    }

    /**
     * toStringのテストです。
     *
     */
    public static class toStringテスト extends DbxTestBase {

        @Test
        public void LDNS_codeがnullの場合_toStringは_emptyを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154((Code) null);
            assertThat(sut.toString(), is(RString.EMPTY.toString()));
        }

        @Test
        public void LDNS_codeが1234567の場合_toStringは_1234567を返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154(new Code("1234567"));
            assertThat(sut.toString(), is("1234567"));
        }
    }

    /**
     * hashCodeのテストです。
     *
     */
    public static class hashCodeテスト extends DbxTestBase {

        @Test
        public void LDNS_設定した対象とコンストラクタ同じの場合_hashCodeは_同じhashCodeを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut2 = new TankinyushoSeikatsukaigoAfterH154(new RString("10"));
            assertThat(sut.hashCode(), is(sut2.hashCode()));
        }
    }

    /**
     * getColumnValueのテストです。
     *
     */
    public static class getColumnValueテスト extends DbxTestBase {

        @Test
        public void LDNS_コード種別に10を指定した場合_getColumnValueは_10を返す() {
            assertThat(sut.getColumnValue(), is(new RString("10")));
        }
    }

    /**
     * toRStringのテストです。
     *
     */
    public static class toRStringテスト extends DbxTestBase {

        @Test
        public void LDNS_コード種別に10を指定した場合_toRStringは_10を返す() {
            assertThat(sut.toRString(), is(new RString("10")));
        }
    }

    /**
     * getMeishoのテストです。
     *
     */
    public static class getMeishoパラメタあるテスト extends DbxTestBase {

        private static final FlexibleDate kijunbi = new FlexibleDate("20150303");

        @Test
        public void LDNS_指定したコードがnullの場合_getMeishoは_emptyを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154((Code) null);
            assertThat(sut.getMeisho(kijunbi), is(RString.EMPTY));
        }

        @Test
        public void LDNS_指定したコードが1234567の場合_getMeishoは_短期入所生活介護_平成15年4月以降を返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154(new Code("1234567"));
            assertThat(sut.getMeisho(kijunbi), is(new RString("短期入所生活介護_平成15年4月以降")));
        }
    }

    /**
     * getMeishoのテストです。
     *
     */
    public static class getMeishoテスト extends DbxTestBase {

        @Test
        public void LDNS_codeがnullの場合_getMeishoは_emptyを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154((Code) null);
            assertThat(sut.getMeisho(), is(RString.EMPTY));
        }

        @Test
        public void LDNS_codeが1234567の場合_getMeishoは_短期入所生活介護_平成15年4月以降を返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154(new Code("1234567"));
            assertThat(sut.getMeisho(), is(new RString("短期入所生活介護_平成15年4月以降")));
        }
    }

    /**
     * getRyakushoのテストです。
     *
     */
    public static class getRyakushoパラメタあるテスト extends DbxTestBase {

        private static final FlexibleDate kijunbi = new FlexibleDate("20150303");

        @Test
        public void LDNS_codeがnullの場合_getRyakushoは_emptyを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154((Code) null);
            assertThat(sut.getRyakusho(kijunbi), is(RString.EMPTY));
        }

        @Test
        public void LDNS_codeが1234567の場合_getRyakushoは_短期入所生活介護_平成15年4月以降を返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154(new Code("1234567"));
            assertThat(sut.getRyakusho(kijunbi), is(new RString("短期入所生活介護_平成15年4月以降")));
        }
    }

    /**
     * getRyakushoのテストです。
     *
     */
    public static class getRyakushoテスト extends DbxTestBase {

        @Test
        public void LDNS_codeがnullの場合_getRyakushoは_emptyを返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154((Code) null);
            assertThat(sut.getRyakusho(), is(RString.EMPTY));
        }

        @Test
        public void LDNS_codeが1234567の場合_getRyakushoは_短期入所生活介護_平成15年4月以降を返す() {
            TankinyushoSeikatsukaigoAfterH154 sut = new TankinyushoSeikatsukaigoAfterH154(new Code("1234567"));
            assertThat(sut.getRyakusho(), is(new RString("短期入所生活介護_平成15年4月以降")));
        }
    }
}