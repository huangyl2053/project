/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5210NinteichosahyoShisetsuRiyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5210NinteichosahyoShisetsuRiyoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link NinteichosahyoShisetsuRiyoBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NinteichosahyoShisetsuRiyoBuilderTest extends DbzTestBase {

    private static DbT5210NinteichosahyoShisetsuRiyoEntity NinteichosahyoShisetsuRiyoEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends DbzTestBase {

        private static NinteichosahyoShisetsuRiyoBuilder sut;
        private static NinteichosahyoShisetsuRiyo business;

        @Before
        public void setUp() {
            NinteichosahyoShisetsuRiyoEntity = new DbT5210NinteichosahyoShisetsuRiyoEntity();

            business = new NinteichosahyoShisetsuRiyo(NinteichosahyoShisetsuRiyoEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。

        @Test
        public void 戻り値の申請書管理番号は_設定した値と同じ申請書管理番号を返す() {
            business = sut.set申請書管理番号(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_申請書管理番号).build();
            assertThat(business.get申請書管理番号(), is(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_申請書管理番号));
        }

        @Test
        public void 戻り値の認定調査依頼履歴番号は_設定した値と同じ認定調査依頼履歴番号を返す() {
            business = sut.set認定調査依頼履歴番号(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_認定調査依頼履歴番号).build();
            assertThat(business.get認定調査依頼履歴番号(), is(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_認定調査依頼履歴番号));
        }

        @Test
        public void 戻り値の連番は_設定した値と同じ連番を返す() {
            business = sut.set連番(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_連番).build();
            assertThat(business.get連番(), is(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_連番));
        }

        @Test
        public void 戻り値の厚労省IF識別コードは_設定した値と同じ厚労省IF識別コードを返す() {
            business = sut.set厚労省IF識別コード(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_厚労省IF識別コード).build();
            assertThat(business.get厚労省IF識別コード(), is(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_厚労省IF識別コード));
        }

        @Test
        public void 戻り値の施設利用フラグは_設定した値と同じ施設利用フラグを返す() {
            business = sut.set施設利用フラグ(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_施設利用フラグ).build();
            assertThat(business.get施設利用フラグ(), is(DbT5210NinteichosahyoShisetsuRiyoEntityGenerator.DEFAULT_施設利用フラグ));
        }

    }
}