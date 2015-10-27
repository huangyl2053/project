/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import jp.co.ndensan.reams.db.dbe.persistence.db.basic.DbT5508ShinsakaiJizenKekkaJohoDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5508ShinsakaiJizenKekkaJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.helper.DbT5508ShinsakaiJizenKekkaJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbe.entity.helper.DbT5508ShinsakaiJizenKekkaJohoEntityGenerator.DEFAULT_介護認定審査会委員コード;
import static jp.co.ndensan.reams.db.dbe.entity.helper.DbT5508ShinsakaiJizenKekkaJohoEntityGenerator.DEFAULT_介護認定審査会審査順;
import static jp.co.ndensan.reams.db.dbe.entity.helper.DbT5508ShinsakaiJizenKekkaJohoEntityGenerator.DEFAULT_介護認定審査会開催番号;
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
 * {@link DbT5508ShinsakaiJizenKekkaJohoDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5508ShinsakaiJizenKekkaJohoDacTest extends DbeTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5508ShinsakaiJizenKekkaJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5508ShinsakaiJizenKekkaJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会開催番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会委員コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会審査順がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5508ShinsakaiJizenKekkaJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5508ShinsakaiJizenKekkaJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会事前審査結果情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 介護認定審査会事前審査結果情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会事前審査結果情報エンティティを渡すと_insertは_介護認定審査会事前審査結果情報を追加する() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test
        public void 介護認定審査会事前審査結果情報エンティティを渡すと_updateは_介護認定審査会事前審査結果情報を更新する() {
            DbT5508ShinsakaiJizenKekkaJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT5508ShinsakaiJizenKekkaJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
        }

        @Test
        public void 介護認定審査会事前審査結果情報エンティティを渡すと_deleteは_介護認定審査会事前審査結果情報を削除する() {
            DbT5508ShinsakaiJizenKekkaJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会開催番号,
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_介護認定審査会審査順), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                RString 介護認定審査会開催番号,
                RString 介護認定審査会委員コード,
                int 介護認定審査会審査順) {
            DbT5508ShinsakaiJizenKekkaJohoEntity entity = DbT5508ShinsakaiJizenKekkaJohoEntityGenerator.createDbT5508ShinsakaiJizenKekkaJohoEntity();
            entity.setShinsakaiKaisaiNo(介護認定審査会開催番号);
            entity.setShinsakaiIinCode(介護認定審査会委員コード);
            entity.setShinsakaiOrder(介護認定審査会審査順);
            sut.save(entity);
        }
    }
}