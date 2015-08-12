/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.model;

import jp.co.ndensan.reams.db.dbc.model.KyodoShoriyoJukyushaIdoKihonSofuModel;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link KyodoShoriyoJukyushaIdoKihonSofuModel}のテストクラスです。
 *
 * @author LDNS 鄭雪双
 */
@RunWith(Enclosed.class)
public class KyodoShoriyoJukyushaIdoKihonSofuModelTest extends DbzTestBase {

    public static class getterSetterTest extends DbzTestBase {

        private static KyodoShoriyoJukyushaIdoKihonSofuModel sut;

        @BeforeClass
        public static void test() {
            sut = new KyodoShoriyoJukyushaIdoKihonSofuModel();
        }

        @Test
        public void 戻り値の異動年月日は_設定した値と同じ異動年月日を返す() {
            sut.set異動年月日(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_異動年月日);
            assertThat(sut.get異動年月日(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_異動年月日));
        }

        @Test
        public void 戻り値の異動区分コードは_設定した値と同じ異動区分コードを返す() {
            sut.set異動区分コード(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_異動区分コード);
            assertThat(sut.get異動区分コード(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_異動区分コード));
        }

        @Test
        public void 戻り値の受給者異動事由は_設定した値と同じ受給者異動事由を返す() {
            sut.set受給者異動事由(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_受給者異動事由);
            assertThat(sut.get受給者異動事由(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_受給者異動事由));
        }

        @Test
        public void 戻り値の証記載保険者番号は_設定した値と同じ証記載保険者番号を返す() {
            sut.set証記載保険者番号(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_証記載保険者番号);
            assertThat(sut.get証記載保険者番号(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_証記載保険者番号));
        }

        @Test
        public void 戻り値の被保険者番号は_設定した値と同じ被保険者番号を返す() {
            sut.set被保険者番号(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_被保険者番号);
            assertThat(sut.get被保険者番号(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_被保険者番号));
        }

        @Test
        public void 戻り値の被保険者氏名は_設定した値と同じ被保険者氏名を返す() {
            sut.set被保険者氏名(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_被保険者氏名);
            assertThat(sut.get被保険者氏名(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_被保険者氏名));
        }

        @Test
        public void 戻り値の郵便番号は_設定した値と同じ郵便番号を返す() {
            sut.set郵便番号(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_郵便番号);
            assertThat(sut.get郵便番号(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_郵便番号));
        }

        @Test
        public void 戻り値の住所カナは_設定した値と同じ住所カナを返す() {
            sut.set住所カナ(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_住所カナ);
            assertThat(sut.get住所カナ(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_住所カナ));
        }

        @Test
        public void 戻り値の住所は_設定した値と同じ住所を返す() {
            sut.set住所(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_住所);
            assertThat(sut.get住所(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_住所));
        }

        @Test
        public void 戻り値の電話番号は_設定した値と同じ電話番号を返す() {
            sut.set電話番号(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_電話番号);
            assertThat(sut.get電話番号(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_電話番号));
        }

        @Test
        public void 戻り値の帳票出力順序コードは_設定した値と同じ帳票出力順序コードを返す() {
            sut.set帳票出力順序コード(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_帳票出力順序コード);
            assertThat(sut.get帳票出力順序コード(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_帳票出力順序コード));
        }

        @Test
        public void 戻り値の訂正連絡票フラグは_設定した値と同じ訂正連絡票フラグを返す() {
            sut.set訂正連絡票フラグ(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_訂正連絡票フラグ);
            assertThat(sut.get訂正連絡票フラグ(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_訂正連絡票フラグ));
        }

        @Test
        public void 戻り値の送付年月は_設定した値と同じ送付年月を返す() {
            sut.set送付年月(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_送付年月);
            assertThat(sut.get送付年月(), is(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.DEFAULT_送付年月));
        }
    }

    public static class getStateTest extends DbzTestBase {

        @Test
        public void 状態Addedの取得確認() {
            KyodoShoriyoJukyushaIdoKihonSofuModel sut = new KyodoShoriyoJukyushaIdoKihonSofuModel();

            assertThat(sut.getState(), is(EntityDataState.Added));
        }

        @Test
        public void 状態Modifinedの取得確認() {
            KyodoShoriyoJukyushaIdoKihonSofuModel sut = new KyodoShoriyoJukyushaIdoKihonSofuModel();
            sut.setEntity(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.createDbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity());

            sut.getEntity().initializeMd5();

            // 主キー以外の項目を変更してください
//            sut.getEntity().setXXX(new XXX());
//            assertThat(sut.getState(), is(EntityDataState.Modified));
        }

        @Test
        public void 状態Unchangedの取得確認() {
            KyodoShoriyoJukyushaIdoKihonSofuModel sut = new KyodoShoriyoJukyushaIdoKihonSofuModel();
            sut.setEntity(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.createDbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity());

            sut.getEntity().initializeMd5();

            assertThat(sut.getState(), is(EntityDataState.Unchanged));
        }

        @Test
        public void 状態Deletedの取得確認() {
            KyodoShoriyoJukyushaIdoKihonSofuModel sut = new KyodoShoriyoJukyushaIdoKihonSofuModel();
            sut.setEntity(DbT3002KyodoShoriyoJukyushaIdoKihonSofuEntityGenerator.createDbT3002KyodoShoriyoJukyushaIdoKihonSofuEntity());

            sut.getEntity().initializeMd5();

            sut.setDeletedState(true);

            assertThat(sut.getState(), is(EntityDataState.Deleted));
        }
    }
}