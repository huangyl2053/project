/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.valueobject;

//TODO n3327 三浦凌 ILocalGovernmentCodeが参照可能になったら、テストをアンコメントする。
//import jp.co.ndensan.reams.ur.urz.business.ILocalGovernmentCode;
//import jp.co.ndensan.reams.ur.urz.business._LocalGovernmentCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.testhelper.TestBase;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 *
 * @author N3327 三浦 凌
 */
@RunWith(Enclosed.class)
public class ShichosonCodeTest extends TestBase {

    public static class コンストラクタ_RString extends TestBase {

        @Test(expected = NullPointerException.class)
        public void コンストラクタ引数のRStringにnullを指定した時_NullPointerExceptionを返す() {
            RString test = null;
            ShichosonCode sut = new ShichosonCode(test);
        }
    }

//    public static class コンストラクタ_ILocalGovernment extends TestBase {
//
//        @Test(expected = NullPointerException.class)
//        public void コンストラクタ引数のILocalGovernmentにnullを指定した時_NullPointerExceptionを返す() {
//            ILocalGovernmentCode test = null;
//            ShichosonCode sut = new ShichosonCode(test);
//        }
//    }
//    public static class GetValue extends TestBase {
//
//        @Test
//        public void インスタンスが地方公共団体コードから生成されたとき_getCodeは_都道府県コードと市区町村コードの値を結合したものと同値を返す() {
//            ILocalGovernmentCode 地方公共団体コード = create地方公共団体コード();
//
//            String 都道府県コード = "12";
//            when(地方公共団体コード.get都道府県コード()).thenReturn(new RString(都道府県コード));
//
//            String 市区町村コード = "345";
//            when(地方公共団体コード.get市区町村コード()).thenReturn(new RString(市区町村コード));
//
//            ShichosonCode sut = new ShichosonCode(地方公共団体コード);
//            assertThat(sut.getValue(), is(new RString(都道府県コード + 市区町村コード)));
//        }
//    }
    public static class テスト_equals extends TestBase {

        @Test
        public void 比較対象がnullなら_falseを返す() {

            ShichosonCode sut = new ShichosonCode(new RString("1"));
            ShichosonCode 比較対象 = null;

            assertThat(sut.equals(比較対象), is(false));
        }

        @Test
        public void 比較対象がShichosonCodeのインスタンスでないなら_falseを返す() {
            RString コード = new RString("1");

            ShichosonCode sut = new ShichosonCode(コード);

            assertThat(sut.equals(コード), is(false));
        }

        @Test
        public void 同一の値で生成されたインスタンス同士は_trueを返す() {
            RString 同じコード = new RString("1");

            ShichosonCode sut = new ShichosonCode(同じコード);
            ShichosonCode 比較対象 = new ShichosonCode(同じコード);

            assertThat(sut.equals(比較対象), is(true));
        }

        @Test
        public void 異なった値で生成されたインスタンス同士は_falseを返す() {
            ShichosonCode sut = new ShichosonCode(new RString("11"));
            ShichosonCode 比較対象 = new ShichosonCode(new RString("22"));

            assertThat(sut.equals(比較対象), is(false));
        }
    }

    public static class テスト_hashCode extends TestBase {

        @Test
        public void 同一の値で生成されたインスタンス同士は_同じ値を返す() {
            RString 同じコード = new RString("1");

            ShichosonCode sut = new ShichosonCode(同じコード);
            ShichosonCode 比較対象 = new ShichosonCode(同じコード);

            assertThat((sut.hashCode() == 比較対象.hashCode()), is(true));
        }

        @Test
        public void 異なった値で生成されたインスタンス同士は_違う値を返す() {
            ShichosonCode sut = new ShichosonCode(new RString("11"));
            ShichosonCode 比較対象 = new ShichosonCode(new RString("22"));

            assertThat((sut.hashCode() == 比較対象.hashCode()), is(false));
        }
    }
//    private static ILocalGovernmentCode create地方公共団体コード() {
//        return mock(_LocalGovernmentCode.class);
//    }
}
