/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5593GogitaiWariateIinJohoEntityGenerator.DEFAULT_介護認定審査会委員コード;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntityGenerator.DEFAULT_連番;
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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoDac}のテストです。
 */
@RunWith(Enclosed.class)
@Ignore
public class DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoDacTest extends DbeTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
            TestSupport.insert(
                    キー_02,
                    DEFAULT_連番);
        }

        @Test(expected = NullPointerException.class)
        public void 介護認定審査会委員コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_連番);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity insertedRecord = sut.selectByKey(
                    キー_03,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会委員所属機関情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    キー_01,
                    DEFAULT_連番);
            TestSupport.insert(
                    キー_02,
                    DEFAULT_連番);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 介護認定審査会委員所属機関情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 介護認定審査会委員所属機関情報エンティティを渡すと_insertは_介護認定審査会委員所属機関情報を追加する() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
        }

        @Test
        public void 介護認定審査会委員所属機関情報エンティティを渡すと_updateは_介護認定審査会委員所属機関情報を更新する() {
            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
            updateRecord.setSonotaKikanCode(new RString("20150102"));

            sut.save(updateRecord);

            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);

            assertThat(updateRecord.getSonotaKikanCode(), is(updatedRecord.getSonotaKikanCode()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
        }

        @Test
        public void 介護認定審査会委員所属機関情報エンティティを渡すと_deleteは_介護認定審査会委員所属機関情報を削除する() {
            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_介護認定審査会委員コード,
                    DEFAULT_連番), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                RString 介護認定審査会委員コード,
                int 連番) {
            DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity entity = DbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntityGenerator.createDbT5595KaigoNinteiShinsakaiIinShozokuKikanJohoEntity();
            entity.setShinsakaiIinCode(介護認定審査会委員コード);
            entity.setRemban(連番);
            sut.save(entity);
        }
    }
}
