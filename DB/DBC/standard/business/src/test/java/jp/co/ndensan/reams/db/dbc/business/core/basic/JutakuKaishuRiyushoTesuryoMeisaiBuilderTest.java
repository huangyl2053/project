/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.fd.fdz.testhelper.FdaTestBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link JutakuKaishuRiyushoTesuryoMeisaiBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class JutakuKaishuRiyushoTesuryoMeisaiBuilderTest extends DbcTestBase {

    private static DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity JutakuKaishuRiyushoTesuryoMeisaiEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends FdaTestBase {

        private static JutakuKaishuRiyushoTesuryoMeisaiBuilder sut;
        private static JutakuKaishuRiyushoTesuryoMeisai business;

        @Before
        public void setUp() {
            JutakuKaishuRiyushoTesuryoMeisaiEntity = new DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntity();
            JutakuKaishuRiyushoTesuryoMeisaiEntity.setXXX(主キー名1);
            JutakuKaishuRiyushoTesuryoMeisaiEntity.setXXX(主キー名2);

            business = new JutakuKaishuRiyushoTesuryoMeisai(JutakuKaishuRiyushoTesuryoMeisaiEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。
        @Test
        public void 戻り値の証記載保険者番号は_設定した値と同じ証記載保険者番号を返す() {
            business = sut.set証記載保険者番号(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_証記載保険者番号).build();
            assertThat(business.get証記載保険者番号(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_証記載保険者番号));
        }

        @Test
        public void 戻り値の被保険者番号は_設定した値と同じ被保険者番号を返す() {
            business = sut.set被保険者番号(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_被保険者番号).build();
            assertThat(business.get被保険者番号(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_被保険者番号));
        }

        @Test
        public void 戻り値の履歴番号は_設定した値と同じ履歴番号を返す() {
            business = sut.set履歴番号(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_履歴番号).build();
            assertThat(business.get履歴番号(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_履歴番号));
        }

        @Test
        public void 戻り値の識別コードは_設定した値と同じ識別コードを返す() {
            business = sut.set識別コード(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_識別コード).build();
            assertThat(business.get識別コード(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_識別コード));
        }

        @Test
        public void 戻り値のサービスコードは_設定した値と同じサービスコードを返す() {
            business = sut.setサービスコード(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_サービスコード).build();
            assertThat(business.getサービスコード(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_サービスコード));
        }

        @Test
        public void 戻り値の介護住宅改修事業者名称は_設定した値と同じ介護住宅改修事業者名称を返す() {
            business = sut.set介護住宅改修事業者名称(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修事業者名称).build();
            assertThat(business.get介護住宅改修事業者名称(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修事業者名称));
        }

        @Test
        public void 戻り値の介護住宅改修着工年月日は_設定した値と同じ介護住宅改修着工年月日を返す() {
            business = sut.set介護住宅改修着工年月日(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修着工年月日).build();
            assertThat(business.get介護住宅改修着工年月日(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修着工年月日));
        }

        @Test
        public void 戻り値の介護住宅改修住宅所有者は_設定した値と同じ介護住宅改修住宅所有者を返す() {
            business = sut.set介護住宅改修住宅所有者(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修住宅所有者).build();
            assertThat(business.get介護住宅改修住宅所有者(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修住宅所有者));
        }

        @Test
        public void 戻り値の改修対象住宅住所は_設定した値と同じ改修対象住宅住所を返す() {
            business = sut.set改修対象住宅住所(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_改修対象住宅住所).build();
            assertThat(business.get改修対象住宅住所(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_改修対象住宅住所));
        }

        @Test
        public void 戻り値の改修内容・箇所及び規模は_設定した値と同じ改修内容・箇所及び規模を返す() {
            business = sut.set改修内容・箇所及び規模(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_改修内容・箇所及び規模).build();
            assertThat(business.get改修内容・箇所及び規模(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_改修内容・箇所及び規模));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成年月日は_設定した値と同じ介護住宅改修理由書作成年月日を返す() {
            business = sut.set介護住宅改修理由書作成年月日(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成年月日).build();
            assertThat(business.get介護住宅改修理由書作成年月日(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成年月日));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成事業者番号は_設定した値と同じ介護住宅改修理由書作成事業者番号を返す() {
            business = sut.set介護住宅改修理由書作成事業者番号(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成事業者番号).build();
            assertThat(business.get介護住宅改修理由書作成事業者番号(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成事業者番号));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成者名は_設定した値と同じ介護住宅改修理由書作成者名を返す() {
            business = sut.set介護住宅改修理由書作成者名(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成者名).build();
            assertThat(business.get介護住宅改修理由書作成者名(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成者名));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成者資格は_設定した値と同じ介護住宅改修理由書作成者資格を返す() {
            business = sut.set介護住宅改修理由書作成者資格(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成者資格).build();
            assertThat(business.get介護住宅改修理由書作成者資格(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成者資格));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成申請年月日は_設定した値と同じ介護住宅改修理由書作成申請年月日を返す() {
            business = sut.set介護住宅改修理由書作成申請年月日(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成申請年月日).build();
            assertThat(business.get介護住宅改修理由書作成申請年月日(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成申請年月日));
        }

        @Test
        public void 戻り値の介護住宅改修理由書作成受付年月日は_設定した値と同じ介護住宅改修理由書作成受付年月日を返す() {
            business = sut.set介護住宅改修理由書作成受付年月日(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成受付年月日).build();
            assertThat(business.get介護住宅改修理由書作成受付年月日(), is(DbT3095JutakuKaishuRiyushoTesuryoMeisaiEntityGenerator.DEFAULT_介護住宅改修理由書作成受付年月日));
        }

    }
}