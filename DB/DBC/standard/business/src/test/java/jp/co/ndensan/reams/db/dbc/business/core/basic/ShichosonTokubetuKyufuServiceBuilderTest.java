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
 * {@link ShichosonTokubetuKyufuServiceBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShichosonTokubetuKyufuServiceBuilderTest extends DbcTestBase {

    private static DbT3066ShichosonTokubetuKyufuServiceEntity ShichosonTokubetuKyufuServiceEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends FdaTestBase {

        private static ShichosonTokubetuKyufuServiceBuilder sut;
        private static ShichosonTokubetuKyufuService business;

        @Before
        public void setUp() {
            ShichosonTokubetuKyufuServiceEntity = new DbT3066ShichosonTokubetuKyufuServiceEntity();
            ShichosonTokubetuKyufuServiceEntity.setXXX(主キー名1);
            ShichosonTokubetuKyufuServiceEntity.setXXX(主キー名2);

            business = new ShichosonTokubetuKyufuService(ShichosonTokubetuKyufuServiceEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。
        @Test
        public void 戻り値の市町村特別給付用サービスコードは_設定した値と同じ市町村特別給付用サービスコードを返す() {
            business = sut.set市町村特別給付用サービスコード(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービスコード).build();
            assertThat(business.get市町村特別給付用サービスコード(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービスコード));
        }

        @Test
        public void 戻り値の市町村特別給付用サービス有効期間開始年月日は_設定した値と同じ市町村特別給付用サービス有効期間開始年月日を返す() {
            business = sut.set市町村特別給付用サービス有効期間開始年月日(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス有効期間開始年月日).build();
            assertThat(business.get市町村特別給付用サービス有効期間開始年月日(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス有効期間開始年月日));
        }

        @Test
        public void 戻り値の履歴番号は_設定した値と同じ履歴番号を返す() {
            business = sut.set履歴番号(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_履歴番号).build();
            assertThat(business.get履歴番号(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_履歴番号));
        }

        @Test
        public void 戻り値の市町村特別給付用サービス名（正式名称）は_設定した値と同じ市町村特別給付用サービス名（正式名称）を返す() {
            business = sut.set市町村特別給付用サービス名（正式名称）(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス名（正式名称）).build();
            assertThat(business.get市町村特別給付用サービス名（正式名称）(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス名（正式名称）));
        }

        @Test
        public void 戻り値の市町村特別給付用サービス名（略称）は_設定した値と同じ市町村特別給付用サービス名（略称）を返す() {
            business = sut.set市町村特別給付用サービス名（略称）(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス名（略称）).build();
            assertThat(business.get市町村特別給付用サービス名（略称）(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス名（略称）));
        }

        @Test
        public void 戻り値の市町村特別給付用サービス有効期間終了年月日は_設定した値と同じ市町村特別給付用サービス有効期間終了年月日を返す() {
            business = sut.set市町村特別給付用サービス有効期間終了年月日(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス有効期間終了年月日).build();
            assertThat(business.get市町村特別給付用サービス有効期間終了年月日(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス有効期間終了年月日));
        }

        @Test
        public void 戻り値の市町村特別給付用サービス区分は_設定した値と同じ市町村特別給付用サービス区分を返す() {
            business = sut.set市町村特別給付用サービス区分(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス区分).build();
            assertThat(business.get市町村特別給付用サービス区分(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用サービス区分));
        }

        @Test
        public void 戻り値の市町村特別給付用単位・日数は_設定した値と同じ市町村特別給付用単位・日数を返す() {
            business = sut.set市町村特別給付用単位・日数(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用単位・日数).build();
            assertThat(business.get市町村特別給付用単位・日数(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用単位・日数));
        }

        @Test
        public void 戻り値の市町村特別給付用支給限度基準額は_設定した値と同じ市町村特別給付用支給限度基準額を返す() {
            business = sut.set市町村特別給付用支給限度基準額(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用支給限度基準額).build();
            assertThat(business.get市町村特別給付用支給限度基準額(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用支給限度基準額));
        }

        @Test
        public void 戻り値の市町村特別給付用給付率引下有フラグは_設定した値と同じ市町村特別給付用給付率引下有フラグを返す() {
            business = sut.set市町村特別給付用給付率引下有フラグ(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用給付率引下有フラグ).build();
            assertThat(business.get市町村特別給付用給付率引下有フラグ(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_市町村特別給付用給付率引下有フラグ));
        }

        @Test
        public void 戻り値の登録年月日は_設定した値と同じ登録年月日を返す() {
            business = sut.set登録年月日(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_登録年月日).build();
            assertThat(business.get登録年月日(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_登録年月日));
        }

        @Test
        public void 戻り値の変更年月日は_設定した値と同じ変更年月日を返す() {
            business = sut.set変更年月日(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_変更年月日).build();
            assertThat(business.get変更年月日(), is(DbT3066ShichosonTokubetuKyufuServiceEntityGenerator.DEFAULT_変更年月日));
        }

    }
}