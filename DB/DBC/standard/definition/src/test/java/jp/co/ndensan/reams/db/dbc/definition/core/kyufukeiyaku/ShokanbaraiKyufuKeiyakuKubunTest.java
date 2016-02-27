package jp.co.ndensan.reams.db.dbc.definition.core.kyufukeiyaku;

import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 償還払給付契約の有無のテストクラスです。
 * 
 * @author LDNS 
 */
public class ShokanbaraiKyufuKeiyakuKubunTest extends DbcTestBase{

    @Test(expected = NullPointerException.class)
    public void 引数がNullである場合_toValueは_NullPointerExceptionが発生する() {
        ShokanbaraiKyufuKeiyakuKubun.toValue(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 引数に想定外の99999を指定した場合_toValueは_IllegalArgumentExceptionが発生する() {
        ShokanbaraiKyufuKeiyakuKubun.toValue(new RString("99999"));
    }

    @Test
    public void 引数にtrueを指定した場合_toValueは_契約有りを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.toValue(new RString("true")), is(ShokanbaraiKyufuKeiyakuKubun.契約有り));
    }

    @Test
    public void 引数にfalseを指定した場合_toValueは_契約無しを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.toValue(new RString("false")), is(ShokanbaraiKyufuKeiyakuKubun.契約無し));
    }

    @Test
    public void 契約有りを指定した場合_getコードは_trueを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.契約有り.getコード(), is(new RString("true")));
    }

    @Test
    public void 契約無しを指定した場合_getコードは_falseを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.契約無し.getコード(), is(new RString("false")));
    }

    @Test
    public void 契約有りを指定した場合_get名称は_契約有りを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.契約有り.get名称(), is(new RString("契約有り")));
    }

    @Test
    public void 契約無しを指定した場合_get名称は_契約無しを返す() {
        assertThat(ShokanbaraiKyufuKeiyakuKubun.契約無し.get名称(), is(new RString("契約無し")));
    }

}
