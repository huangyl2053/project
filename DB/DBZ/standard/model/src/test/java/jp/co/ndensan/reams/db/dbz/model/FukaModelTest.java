/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.model;

import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT2002FukaEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link FukaModel}のテストクラスです。
 *
 * @author LDNS 鄭雪双
 */
@RunWith(Enclosed.class)
public class FukaModelTest extends DbzTestBase {

    public static class getterSetterTest extends DbzTestBase {

        private static FukaModel sut;

        @BeforeClass
        public static void test() {
            sut = new FukaModel();
        }

        @Test
        public void 戻り値の調定年度は_設定した値と同じ調定年度を返す() {
            sut.set調定年度(DbT2002FukaEntityGenerator.DEFAULT_調定年度);
            assertThat(sut.get調定年度(), is(DbT2002FukaEntityGenerator.DEFAULT_調定年度));
        }

        @Test
        public void 戻り値の賦課年度は_設定した値と同じ賦課年度を返す() {
            sut.set賦課年度(DbT2002FukaEntityGenerator.DEFAULT_賦課年度);
            assertThat(sut.get賦課年度(), is(DbT2002FukaEntityGenerator.DEFAULT_賦課年度));
        }

        @Test
        public void 戻り値の通知書番号は_設定した値と同じ通知書番号を返す() {
            sut.set通知書番号(DbT2002FukaEntityGenerator.DEFAULT_通知書番号);
            assertThat(sut.get通知書番号(), is(DbT2002FukaEntityGenerator.DEFAULT_通知書番号));
        }

        @Test
        public void 戻り値の処理日時は_設定した値と同じ処理日時を返す() {
            sut.set処理日時(DbT2002FukaEntityGenerator.DEFAULT_処理日時);
            assertThat(sut.get処理日時(), is(DbT2002FukaEntityGenerator.DEFAULT_処理日時));
        }

        @Test
        public void 戻り値の被保険者番号は_設定した値と同じ被保険者番号を返す() {
            sut.set被保険者番号(DbT2002FukaEntityGenerator.DEFAULT_被保険者番号);
            assertThat(sut.get被保険者番号(), is(DbT2002FukaEntityGenerator.DEFAULT_被保険者番号));
        }

        @Test
        public void 戻り値の識別コードは_設定した値と同じ識別コードを返す() {
            sut.set識別コード(DbT2002FukaEntityGenerator.DEFAULT_識別コード);
            assertThat(sut.get識別コード(), is(DbT2002FukaEntityGenerator.DEFAULT_識別コード));
        }

        @Test
        public void 戻り値の世帯コードは_設定した値と同じ世帯コードを返す() {
            sut.set世帯コード(DbT2002FukaEntityGenerator.DEFAULT_世帯コード);
            assertThat(sut.get世帯コード(), is(DbT2002FukaEntityGenerator.DEFAULT_世帯コード));
        }

        @Test
        public void 戻り値の世帯員数は_設定した値と同じ世帯員数を返す() {
            sut.set世帯員数(DbT2002FukaEntityGenerator.DEFAULT_世帯員数);
            assertThat(sut.get世帯員数(), is(DbT2002FukaEntityGenerator.DEFAULT_世帯員数));
        }

        @Test
        public void 戻り値の賦課期日は_設定した値と同じ賦課期日を返す() {
            sut.set賦課期日(DbT2002FukaEntityGenerator.DEFAULT_賦課期日);
            assertThat(sut.get賦課期日(), is(DbT2002FukaEntityGenerator.DEFAULT_賦課期日));
        }

        @Test
        public void 戻り値の課税区分は_設定した値と同じ課税区分を返す() {
            sut.set課税区分(DbT2002FukaEntityGenerator.DEFAULT_課税区分);
            assertThat(sut.get課税区分(), is(DbT2002FukaEntityGenerator.DEFAULT_課税区分));
        }

        @Test
        public void 戻り値の世帯課税区分は_設定した値と同じ世帯課税区分を返す() {
            sut.set世帯課税区分(DbT2002FukaEntityGenerator.DEFAULT_世帯課税区分);
            assertThat(sut.get世帯課税区分(), is(DbT2002FukaEntityGenerator.DEFAULT_世帯課税区分));
        }

        @Test
        public void 戻り値の合計所得金額は_設定した値と同じ合計所得金額を返す() {
            sut.set合計所得金額(DbT2002FukaEntityGenerator.DEFAULT_合計所得金額);
            assertThat(sut.get合計所得金額(), is(DbT2002FukaEntityGenerator.DEFAULT_合計所得金額));
        }

        @Test
        public void 戻り値の公的年金収入額は_設定した値と同じ公的年金収入額を返す() {
            sut.set公的年金収入額(DbT2002FukaEntityGenerator.DEFAULT_公的年金収入額);
            assertThat(sut.get公的年金収入額(), is(DbT2002FukaEntityGenerator.DEFAULT_公的年金収入額));
        }

        @Test
        public void 戻り値の保険料段階は_設定した値と同じ保険料段階を返す() {
            sut.set保険料段階(DbT2002FukaEntityGenerator.DEFAULT_保険料段階);
            assertThat(sut.get保険料段階(), is(DbT2002FukaEntityGenerator.DEFAULT_保険料段階));
        }

        @Test
        public void 戻り値の保険料算定段階1は_設定した値と同じ保険料算定段階1を返す() {
            sut.set保険料算定段階1(DbT2002FukaEntityGenerator.DEFAULT_保険料算定段階1);
            assertThat(sut.get保険料算定段階1(), is(DbT2002FukaEntityGenerator.DEFAULT_保険料算定段階1));
        }

        @Test
        public void 戻り値の算定年額保険料1は_設定した値と同じ算定年額保険料1を返す() {
            sut.set算定年額保険料1(DbT2002FukaEntityGenerator.DEFAULT_算定年額保険料1);
            assertThat(sut.get算定年額保険料1(), is(DbT2002FukaEntityGenerator.DEFAULT_算定年額保険料1));
        }

        @Test
        public void 戻り値の月割開始年月1は_設定した値と同じ月割開始年月1を返す() {
            sut.set月割開始年月1(DbT2002FukaEntityGenerator.DEFAULT_月割開始年月1);
            assertThat(sut.get月割開始年月1(), is(DbT2002FukaEntityGenerator.DEFAULT_月割開始年月1));
        }

        @Test
        public void 戻り値の月割終了年月1は_設定した値と同じ月割終了年月1を返す() {
            sut.set月割終了年月1(DbT2002FukaEntityGenerator.DEFAULT_月割終了年月1);
            assertThat(sut.get月割終了年月1(), is(DbT2002FukaEntityGenerator.DEFAULT_月割終了年月1));
        }

        @Test
        public void 戻り値の保険料算定段階2は_設定した値と同じ保険料算定段階2を返す() {
            sut.set保険料算定段階2(DbT2002FukaEntityGenerator.DEFAULT_保険料算定段階2);
            assertThat(sut.get保険料算定段階2(), is(DbT2002FukaEntityGenerator.DEFAULT_保険料算定段階2));
        }

        @Test
        public void 戻り値の算定年額保険料2は_設定した値と同じ算定年額保険料2を返す() {
            sut.set算定年額保険料2(DbT2002FukaEntityGenerator.DEFAULT_算定年額保険料2);
            assertThat(sut.get算定年額保険料2(), is(DbT2002FukaEntityGenerator.DEFAULT_算定年額保険料2));
        }

        @Test
        public void 戻り値の月割開始年月2は_設定した値と同じ月割開始年月2を返す() {
            sut.set月割開始年月2(DbT2002FukaEntityGenerator.DEFAULT_月割開始年月2);
            assertThat(sut.get月割開始年月2(), is(DbT2002FukaEntityGenerator.DEFAULT_月割開始年月2));
        }

        @Test
        public void 戻り値の月割終了年月2は_設定した値と同じ月割終了年月2を返す() {
            sut.set月割終了年月2(DbT2002FukaEntityGenerator.DEFAULT_月割終了年月2);
            assertThat(sut.get月割終了年月2(), is(DbT2002FukaEntityGenerator.DEFAULT_月割終了年月2));
        }

        @Test
        public void 戻り値の調定日時は_設定した値と同じ調定日時を返す() {
            sut.set調定日時(DbT2002FukaEntityGenerator.DEFAULT_調定日時);
            assertThat(sut.get調定日時(), is(DbT2002FukaEntityGenerator.DEFAULT_調定日時));
        }

        @Test
        public void 戻り値の調定事由1は_設定した値と同じ調定事由1を返す() {
            sut.set調定事由1(DbT2002FukaEntityGenerator.DEFAULT_調定事由1);
            assertThat(sut.get調定事由1(), is(DbT2002FukaEntityGenerator.DEFAULT_調定事由1));
        }

        @Test
        public void 戻り値の調定事由2は_設定した値と同じ調定事由2を返す() {
            sut.set調定事由2(DbT2002FukaEntityGenerator.DEFAULT_調定事由2);
            assertThat(sut.get調定事由2(), is(DbT2002FukaEntityGenerator.DEFAULT_調定事由2));
        }

        @Test
        public void 戻り値の調定事由3は_設定した値と同じ調定事由3を返す() {
            sut.set調定事由3(DbT2002FukaEntityGenerator.DEFAULT_調定事由3);
            assertThat(sut.get調定事由3(), is(DbT2002FukaEntityGenerator.DEFAULT_調定事由3));
        }

        @Test
        public void 戻り値の調定事由4は_設定した値と同じ調定事由4を返す() {
            sut.set調定事由4(DbT2002FukaEntityGenerator.DEFAULT_調定事由4);
            assertThat(sut.get調定事由4(), is(DbT2002FukaEntityGenerator.DEFAULT_調定事由4));
        }

        @Test
        public void 戻り値の更正月は_設定した値と同じ更正月を返す() {
            sut.set更正月(DbT2002FukaEntityGenerator.DEFAULT_更正月);
            assertThat(sut.get更正月(), is(DbT2002FukaEntityGenerator.DEFAULT_更正月));
        }

        @Test
        public void 戻り値の減免前介護保険料_年額は_設定した値と同じ減免前介護保険料_年額を返す() {
            sut.set減免前介護保険料_年額(DbT2002FukaEntityGenerator.DEFAULT_減免前介護保険料_年額);
            assertThat(sut.get減免前介護保険料_年額(), is(DbT2002FukaEntityGenerator.DEFAULT_減免前介護保険料_年額));
        }

        @Test
        public void 戻り値の減免額は_設定した値と同じ減免額を返す() {
            sut.set減免額(DbT2002FukaEntityGenerator.DEFAULT_減免額);
            assertThat(sut.get減免額(), is(DbT2002FukaEntityGenerator.DEFAULT_減免額));
        }

        @Test
        public void 戻り値の確定介護保険料_年額は_設定した値と同じ確定介護保険料_年額を返す() {
            sut.set確定介護保険料_年額(DbT2002FukaEntityGenerator.DEFAULT_確定介護保険料_年額);
            assertThat(sut.get確定介護保険料_年額(), is(DbT2002FukaEntityGenerator.DEFAULT_確定介護保険料_年額));
        }

        @Test
        public void 戻り値の保険料段階_仮算定時は_設定した値と同じ保険料段階_仮算定時を返す() {
            sut.set保険料段階_仮算定時(DbT2002FukaEntityGenerator.DEFAULT_保険料段階_仮算定時);
            assertThat(sut.get保険料段階_仮算定時(), is(DbT2002FukaEntityGenerator.DEFAULT_保険料段階_仮算定時));
        }

        @Test
        public void 戻り値の徴収方法処理日時は_設定した値と同じ徴収方法処理日時を返す() {
            sut.set徴収方法処理日時(DbT2002FukaEntityGenerator.DEFAULT_徴収方法処理日時);
            assertThat(sut.get徴収方法処理日時(), is(DbT2002FukaEntityGenerator.DEFAULT_徴収方法処理日時));
        }

        @Test
        public void 戻り値の異動基準日時は_設定した値と同じ異動基準日時を返す() {
            sut.set異動基準日時(DbT2002FukaEntityGenerator.DEFAULT_異動基準日時);
            assertThat(sut.get異動基準日時(), is(DbT2002FukaEntityGenerator.DEFAULT_異動基準日時));
        }
    }

    public static class getStateTest extends DbzTestBase {

        @Test
        public void 状態Addedの取得確認() {
            FukaModel sut = new FukaModel();

            assertThat(sut.getState(), is(EntityDataState.Added));
        }

        @Test
        public void 状態Modifinedの取得確認() {
            FukaModel sut = new FukaModel();
            sut.setEntity(DbT2002FukaEntityGenerator.createDbT2002FukaEntity());

            sut.getEntity().initializeMd5();

            // 主キー以外の項目を変更してください
//            sut.getEntity().setXXX(new XXX());
//            assertThat(sut.getState(), is(EntityDataState.Modified));
        }

        @Test
        public void 状態Unchangedの取得確認() {
            FukaModel sut = new FukaModel();
            sut.setEntity(DbT2002FukaEntityGenerator.createDbT2002FukaEntity());

            sut.getEntity().initializeMd5();

            assertThat(sut.getState(), is(EntityDataState.Unchanged));
        }

        @Test
        public void 状態Deletedの取得確認() {
            FukaModel sut = new FukaModel();
            sut.setEntity(DbT2002FukaEntityGenerator.createDbT2002FukaEntity());

            sut.getEntity().initializeMd5();

            sut.setDeletedState(true);

            assertThat(sut.getState(), is(EntityDataState.Deleted));
        }
    }
}
