/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.business.core;

import jp.co.ndensan.reams.db.dbx.testhelper.DbxTestBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.Range;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * 介護サービス種類クラスのテストクラスです
 *
 * @author n9935 知念 広宰
 */
@RunWith(Enclosed.class)
public class _KaigoServiceShuruiTest extends DbxTestBase {

    private static _KaigoServiceShurui sut;
    private static ServiceShuruiCode サービス種類コード;
    private static Range<FlexibleYearMonth> 提供年月;
    private static RString サービス種類名称;
    private static RString サービス種類名称略称;
    private static Code サービス分類;

    @BeforeClass
    public static void setUpClass() {
        サービス種類コード = new ServiceShuruiCode("01");
        提供年月 = new Range<>(new FlexibleYearMonth("201304"), new FlexibleYearMonth("201305"));
        サービス種類名称 = new RString("種類名称");
        サービス種類名称略称 = new RString("種類名称略称");
        サービス分類 = new Code("001");
    }

    public static class コンストラクタ extends DbxTestBase {

        @Test(expected = NullPointerException.class)
        public void コンストラクタのサービス種類コードにnullを指定した時_NullPointerExceptionを返す() {
            sut = new _KaigoServiceShurui(null, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
        }

        @Test(expected = NullPointerException.class)
        public void コンストラクタの提供年月にnullを指定した時_NullPointerExceptionを返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, null, サービス種類名称, サービス種類名称略称, サービス分類);
        }

        @Test(expected = NullPointerException.class)
        public void コンストラクタのサービス種類名称にnullを指定した時_NullPointerExceptionを返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, null, サービス種類名称略称, サービス分類);
        }

        @Test(expected = NullPointerException.class)
        public void コンストラクタのサービス種類名称略称にnullを指定した時_NullPointerExceptionを返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, null, サービス分類);
        }

        @Test(expected = NullPointerException.class)
        public void コンストラクタのサービス分類にnullを指定した時_NullPointerExceptionを返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, null);
        }
    }

    public static class Getサービス種類コード extends DbxTestBase {

        @Test
        public void コンストラクタのサービス種類コードに01を指定した時_getサービス種類コードは_01を返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
            assertThat(sut.getサービス種類コード(), is(new ServiceShuruiCode(new RString("01"))));
        }
    }

    public static class Get提供年月 extends DbxTestBase {

        @Test
        public void コンストラクタの提供年月に201304_201305を指定した時_get提供年月は_201304_201305を返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
            assertThat(sut.get提供年月().getFrom(), is(new FlexibleYearMonth("201304")));
            assertThat(sut.get提供年月().getTo(), is(new FlexibleYearMonth("201305")));
        }
    }

    public static class Getサービス種類名称 extends DbxTestBase {

        @Test
        public void コンストラクタのサービス種類名称に種類名称を指定した時_getサービス種類名称は_種類名称を返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
            assertThat(sut.getサービス種類名称(), is(new RString("種類名称")));
        }
    }

    public static class Getサービス種類名称略称 extends DbxTestBase {

        @Test
        public void コンストラクタのサービス種類名称略称に種類名称略称を指定した時_getサービス種類名称略称は_種類名称略称を返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
            assertThat(sut.getサービス種類名称略称(), is(new RString("種類名称略称")));
        }
    }

    public static class Getサービス分類 extends DbxTestBase {

        @Test
        public void コンストラクタのサービス分類に001を指定した時_getサービス分類は_001を返す() {
            sut = new _KaigoServiceShurui(サービス種類コード, 提供年月, サービス種類名称, サービス種類名称略称, サービス分類);
            assertThat(sut.getサービス分類(), is(new Code("001")));
        }
    }
}
