/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntityGenerator;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntityGenerator.*;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestDacBase;
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
 * {@link DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuDacTest extends DbcTestDacBase {

    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuDac.class);
    }

    public static class selectByKeyのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 被保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 貸付管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity insertedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity insertedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbcTestDacBase {

        @Test
        public void 給付費貸付金延滞利息金徴収が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 給付費貸付金延滞利息金徴収が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbcTestDacBase {

        @Test
        public void 給付費貸付金延滞利息金徴収エンティティを渡すと_insertは_給付費貸付金延滞利息金徴収を追加する() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);

            assertThat(sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 給付費貸付金延滞利息金徴収エンティティを渡すと_updateは_給付費貸付金延滞利息金徴収を更新する() {
            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity updateRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            updateRecord.setKashitsukeKanriNo(new RString("3"));

            sut.save(updateRecord);

            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity updatedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);

            assertThat(updateRecord.getKashitsukeKanriNo(), is(updatedRecord.getKashitsukeKanriNo()));
        }
    }

    public static class deleteのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 給付費貸付金延滞利息金徴収エンティティを渡すと_deleteは_給付費貸付金延滞利息金徴収を削除する() {
            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity deletedEntity = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_貸付管理番号,
                    DEFAULT_履歴番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                HihokenshaNo 被保険者番号,
                RString 貸付管理番号,
                Decimal 履歴番号) {
            DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity entity = DbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntityGenerator.createDbT3091KyufuhiKashitsukeKinEntaiRisokuKinChoshuEntity();
            entity.setHihokenshaNo(被保険者番号);
            entity.setKashitsukeKanriNo(貸付管理番号);
            entity.setRirekiNo(履歴番号);
            sut.save(entity);
        }
    }
}