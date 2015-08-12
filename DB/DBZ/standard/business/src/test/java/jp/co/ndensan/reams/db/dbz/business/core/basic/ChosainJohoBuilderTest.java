/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5913ChosainJohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5913ChosainJohoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link ChosainJohoBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ChosainJohoBuilderTest extends DbzTestBase {

    private static DbT5913ChosainJohoEntity ChosainJohoEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT5913ChosainJohoEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT5913ChosainJohoEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends FdaTestBase {

        private static ChosainJohoBuilder sut;
        private static ChosainJoho business;

        @Before
        public void setUp() {
            ChosainJohoEntity = new DbT5913ChosainJohoEntity();

            business = new ChosainJoho(ChosainJohoEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。

        @Test
        public void 戻り値の市町村コードは_設定した値と同じ市町村コードを返す() {
            business = sut.set市町村コード(DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード).build();
            assertThat(business.get市町村コード(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード));
        }

        @Test
        public void 戻り値の認定調査委託先コードは_設定した値と同じ認定調査委託先コードを返す() {
            business = sut.set認定調査委託先コード(DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード).build();
            assertThat(business.get認定調査委託先コード(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード));
        }

        @Test
        public void 戻り値の認定調査員コードは_設定した値と同じ認定調査員コードを返す() {
            business = sut.set認定調査員コード(DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード).build();
            assertThat(business.get認定調査員コード(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード));
        }

        @Test
        public void 戻り値の調査員氏名は_設定した値と同じ調査員氏名を返す() {
            business = sut.set調査員氏名(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員氏名).build();
            assertThat(business.get調査員氏名(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員氏名));
        }

        @Test
        public void 戻り値の調査員氏名カナは_設定した値と同じ調査員氏名カナを返す() {
            business = sut.set調査員氏名カナ(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員氏名カナ).build();
            assertThat(business.get調査員氏名カナ(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員氏名カナ));
        }

        @Test
        public void 戻り値の性別は_設定した値と同じ性別を返す() {
            business = sut.set性別(DbT5913ChosainJohoEntityGenerator.DEFAULT_性別).build();
            assertThat(business.get性別(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_性別));
        }

        @Test
        public void 戻り値の調査員資格は_設定した値と同じ調査員資格を返す() {
            business = sut.set調査員資格(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員資格).build();
            assertThat(business.get調査員資格(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査員資格));
        }

        @Test
        public void 戻り値の地区コードは_設定した値と同じ地区コードを返す() {
            business = sut.set地区コード(DbT5913ChosainJohoEntityGenerator.DEFAULT_地区コード).build();
            assertThat(business.get地区コード(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_地区コード));
        }

        @Test
        public void 戻り値の調査可能人数_月は_設定した値と同じ調査可能人数_月を返す() {
            business = sut.set調査可能人数_月(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査可能人数_月).build();
            assertThat(business.get調査可能人数_月(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_調査可能人数_月));
        }

        @Test
        public void 戻り値の郵便番号は_設定した値と同じ郵便番号を返す() {
            business = sut.set郵便番号(DbT5913ChosainJohoEntityGenerator.DEFAULT_郵便番号).build();
            assertThat(business.get郵便番号(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_郵便番号));
        }

        @Test
        public void 戻り値の住所は_設定した値と同じ住所を返す() {
            business = sut.set住所(DbT5913ChosainJohoEntityGenerator.DEFAULT_住所).build();
            assertThat(business.get住所(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_住所));
        }

        @Test
        public void 戻り値の電話番号は_設定した値と同じ電話番号を返す() {
            business = sut.set電話番号(DbT5913ChosainJohoEntityGenerator.DEFAULT_電話番号).build();
            assertThat(business.get電話番号(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_電話番号));
        }

        @Test
        public void 戻り値のFAX番号は_設定した値と同じFAX番号を返す() {
            business = sut.setFAX番号(DbT5913ChosainJohoEntityGenerator.DEFAULT_FAX番号).build();
            assertThat(business.getFAX番号(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_FAX番号));
        }

        @Test
        public void 戻り値の状況フラグは_設定した値と同じ状況フラグを返す() {
            business = sut.set状況フラグ(DbT5913ChosainJohoEntityGenerator.DEFAULT_状況フラグ).build();
            assertThat(business.get状況フラグ(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_状況フラグ));
        }

    }
}