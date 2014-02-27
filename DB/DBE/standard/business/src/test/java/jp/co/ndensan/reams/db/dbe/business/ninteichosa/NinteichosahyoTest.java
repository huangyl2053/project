/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.ninteichosa;

import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.ChosahyoRegulation;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.ChosahyoItemGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.ChosahyoItems;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * 要介護認定調査の調査票情報を扱うクラスのテストクラスです。
 *
 * @author N8156 宮本 康
 */
@RunWith(Enclosed.class)
public class NinteichosahyoTest {

    public static class コンストラクタ {

        @Test(expected = NullPointerException.class)
        public void 調査票項目MapがNULLの時_コンストラクタは_NullPointerExceptionを投げる() {
            new Ninteichosahyo(null, ChosahyoItemGroup.Of2006.values());
        }

        @Test(expected = NullPointerException.class)
        public void 調査分類がNULLの時_コンストラクタは_NullPointerExceptionを投げる() {
            new Ninteichosahyo(new ChosahyoRegulation.Of2006().get調査票定義(), null);
        }
    }

    public static class get調査項目 {

        @Test
        public void 調査項目の指定がある時_get調査項目は_該当の調査項目情報を返す() {
            assertThat(NinteichosahyoFactory.createInstance(2006).get調査項目(ChosahyoItems.麻痺等の有無_左上肢).get表示名称(), is(new RString("麻痺等の有無 左上肢")));
        }

        @Test
        public void 調査項目がNULLの時_get調査項目は_NULLを返す() {
            assertThat(NinteichosahyoFactory.createInstance(2006).get調査項目(null), is(nullValue()));
        }
    }

    public static class get調査項目List {

        @Test
        public void 調査分類の指定がある時_get調査項目Listは_該当の調査項目情報を返す() {
            assertThat(NinteichosahyoFactory.createInstance(2006).get調査項目List(ChosahyoItemGroup.Of2006.第１群).size(), is(20));
        }

        @Test
        public void 調査分類がNULLの時_get調査項目Listは_0件の調査項目情報を返す() {
            assertThat(NinteichosahyoFactory.createInstance(2006).get調査項目List(null).size(), is(0));
        }
    }

    public static class get調査項目ListAll {

        @Test
        public void 調査分類の指定がある時_get調査項目ListAllは_該当の調査項目情報を返す() {
            assertThat(NinteichosahyoFactory.createInstance(2006).get調査項目ListAll().size(), is(76));
        }
    }
}
