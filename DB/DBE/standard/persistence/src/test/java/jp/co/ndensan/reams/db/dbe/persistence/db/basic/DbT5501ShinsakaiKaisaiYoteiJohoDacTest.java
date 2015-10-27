/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5501ShinsakaiKaisaiYoteiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5501ShinsakaiKaisaiYoteiJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5501ShinsakaiKaisaiYoteiJohoEntityGenerator.DEFAULT_介護認定審査会開催番号;
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
 * {@link DbT5501ShinsakaiKaisaiYoteiJohoDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5501ShinsakaiKaisaiYoteiJohoDacTest extends DbeTestDacBase {

    private static final RString キー_01 = DEFAULT_介護認定審査会開催番号;
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5501ShinsakaiKaisaiYoteiJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5501ShinsakaiKaisaiYoteiJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号);
            TestSupport.insert(
                    キー_02);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会開催番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5501ShinsakaiKaisaiYoteiJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5501ShinsakaiKaisaiYoteiJohoEntity insertedRecord = sut.selectByKey(
                    キー_01);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会開催予定情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    キー_02);
            TestSupport.insert(
                    キー_03);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 介護認定審査会開催予定情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会開催予定情報エンティティを渡すと_insertは_介護認定審査会開催予定情報を追加する() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号);
        }

        @Test
        public void 介護認定審査会開催予定情報エンティティを渡すと_updateは_介護認定審査会開催予定情報を更新する() {
            DbT5501ShinsakaiKaisaiYoteiJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号);
            updateRecord.setShinsakaiKaishiYoteiTime(new RString("001"));

            sut.save(updateRecord);

            DbT5501ShinsakaiKaisaiYoteiJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号);

            assertThat(updateRecord.getShinsakaiKaishiYoteiTime(), is(updatedRecord.getShinsakaiKaishiYoteiTime()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号);
        }

        @Test
        public void 介護認定審査会開催予定情報エンティティを渡すと_deleteは_介護認定審査会開催予定情報を削除する() {
            DbT5501ShinsakaiKaisaiYoteiJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                RString 介護認定審査会開催番号) {
            DbT5501ShinsakaiKaisaiYoteiJohoEntity entity = DbT5501ShinsakaiKaisaiYoteiJohoEntityGenerator.createDbT5501ShinsakaiKaisaiYoteiJohoEntity();
            entity.setShinsakaiKaisaiNo(介護認定審査会開催番号);
            sut.save(entity);
        }
    }
}