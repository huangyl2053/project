/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3063SaishinsaKetteiShukeiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3063SaishinsaKetteiShukeiEntityGenerator;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3063SaishinsaKetteiShukeiEntityGenerator.*;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestDacBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT3063SaishinsaKetteiShukeiDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT3063SaishinsaKetteiShukeiDacTest extends DbcTestDacBase {

    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT3063SaishinsaKetteiShukeiDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT3063SaishinsaKetteiShukeiDac.class);
    }

    public static class selectByKeyのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 取扱年月がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 保険者区分がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT3063SaishinsaKetteiShukeiEntity insertedRecord = sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT3063SaishinsaKetteiShukeiEntity insertedRecord = sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbcTestDacBase {

        @Test
        public void 再審査決定集計が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 再審査決定集計が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbcTestDacBase {

        @Test
        public void 再審査決定集計エンティティを渡すと_insertは_再審査決定集計を追加する() {
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);

            assertThat(sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 再審査決定集計エンティティを渡すと_updateは_再審査決定集計を更新する() {
            DbT3063SaishinsaKetteiShukeiEntity updateRecord = sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            updateRecord.setKaigoKyufuhiChoseiFutangaku(new Decimal(1000));

            sut.save(updateRecord);

            DbT3063SaishinsaKetteiShukeiEntity updatedRecord = sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);

            assertThat(updateRecord.getKaigoKyufuhiChoseiFutangaku(), is(updatedRecord.getKaigoKyufuhiChoseiFutangaku()));
        }
    }

    public static class deleteのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 再審査決定集計エンティティを渡すと_deleteは_再審査決定集計を削除する() {
            DbT3063SaishinsaKetteiShukeiEntity deletedEntity = sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_取扱年月,
                    DEFAULT_保険者区分,
                    DEFAULT_履歴番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                FlexibleYearMonth 取扱年月,
                RString 保険者区分,
                Decimal 履歴番号) {
            DbT3063SaishinsaKetteiShukeiEntity entity = DbT3063SaishinsaKetteiShukeiEntityGenerator.createDbT3063SaishinsaKetteiShukeiEntity();
            entity.setToriatsukaiYM(取扱年月);
            entity.setHokenshaKubun(保険者区分);
            entity.setRirekiNo(履歴番号);
            sut.save(entity);
        }
    }
}