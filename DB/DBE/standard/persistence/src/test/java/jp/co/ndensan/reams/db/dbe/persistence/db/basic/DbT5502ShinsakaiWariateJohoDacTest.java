/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5502ShinsakaiWariateJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5502ShinsakaiWariateJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5502ShinsakaiWariateJohoEntityGenerator.DEFAULT_介護認定審査会開催番号;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5502ShinsakaiWariateJohoEntityGenerator.DEFAULT_申請書管理番号;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestDacBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT5502ShinsakaiWariateJohoDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5502ShinsakaiWariateJohoDacTest extends DbeTestDacBase {

    private static final RString キー_01 = DEFAULT_介護認定審査会開催番号;
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5502ShinsakaiWariateJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5502ShinsakaiWariateJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
            TestSupport.insert(
                    キー_02,
                    DEFAULT_申請書管理番号);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会開催番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_申請書管理番号);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5502ShinsakaiWariateJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5502ShinsakaiWariateJohoEntity insertedRecord = sut.selectByKey(
                    キー_01,
                    DEFAULT_申請書管理番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会割当情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    キー_02,
                    DEFAULT_申請書管理番号);
            TestSupport.insert(
                    キー_03,
                    DEFAULT_申請書管理番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 介護認定審査会割当情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会割当情報エンティティを渡すと_insertは_介護認定審査会割当情報を追加する() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
        }

        @Test
        public void 介護認定審査会割当情報エンティティを渡すと_updateは_介護認定審査会割当情報を更新する() {
            DbT5502ShinsakaiWariateJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
            updateRecord.setShinsakaiOrder(75);

            sut.save(updateRecord);

            DbT5502ShinsakaiWariateJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);

            assertThat(updateRecord.getShinsakaiOrder(), is(updatedRecord.getShinsakaiOrder()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
        }

        @Test
        public void 介護認定審査会割当情報エンティティを渡すと_deleteは_介護認定審査会割当情報を削除する() {
            DbT5502ShinsakaiWariateJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_申請書管理番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                RString 介護認定審査会開催番号,
                ShinseishoKanriNo 申請書管理番号) {
            DbT5502ShinsakaiWariateJohoEntity entity = DbT5502ShinsakaiWariateJohoEntityGenerator.createDbT5502ShinsakaiWariateJohoEntity();
            entity.setShinsakaiKaisaiNo(介護認定審査会開催番号);
            entity.setShinseishoKanriNo(申請書管理番号);
            sut.save(entity);
        }
    }
}