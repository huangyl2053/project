package jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ikensho;

import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * 内科受診の有無のテストクラスです。
 *
 * @author LDNS
 */
public class IsNaikajJshinUmuTest extends DbeTestBase {

    @Test
    public void 引数にTrueを指定した場合_toValueは_ありを返す() {
        assertThat(IsNaikajJshinUmu.toValue(true), is(IsNaikajJshinUmu.あり));
    }

    @Test
    public void 引数にFalseを指定した場合_toValueは_なしを返す() {
        assertThat(IsNaikajJshinUmu.toValue(false), is(IsNaikajJshinUmu.なし));
    }

    @Test
    public void ありを指定した場合_getコードは_Trueを返す() {
        assertThat(IsNaikajJshinUmu.あり.is内科受診あり(), is(true));
    }

    @Test
    public void なしを指定した場合_getコードは_Falseを返す() {
        assertThat(IsNaikajJshinUmu.なし.is内科受診あり(), is(false));
    }

    @Test
    public void ありを指定した場合_get名称は_ありを返す() {
        assertThat(IsNaikajJshinUmu.あり.get名称(), is(new RString("あり")));
    }

    @Test
    public void なしを指定した場合_get名称は_なしを返す() {
        assertThat(IsNaikajJshinUmu.なし.get名称(), is(new RString("なし")));
    }

}
