/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.DbT5590ShinsakaiIinJogaiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5590ShinsakaiIinJogaiJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5590ShinsakaiIinJogaiJohoEntityGenerator.DEFAULT_申請書管理番号;
import static jp.co.ndensan.reams.db.dbe.entity.db.basic.helper.DbT5590ShinsakaiIinJogaiJohoEntityGenerator.DEFAULT_連番;
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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT5590ShinsakaiIinJogaiJohoDac}のテストです。
 */
@Ignore
@RunWith(Enclosed.class)
public class DbT5590ShinsakaiIinJogaiJohoDacTest extends DbeTestDacBase {

    private static final ShinseishoKanriNo キー_01 = new ShinseishoKanriNo("01");
    private static final ShinseishoKanriNo キー_02 = new ShinseishoKanriNo("02");
    private static final ShinseishoKanriNo キー_03 = new ShinseishoKanriNo("03");
    private static DbT5590ShinsakaiIinJogaiJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5590ShinsakaiIinJogaiJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
            TestSupport.insert(
                    キー_02,
                    DEFAULT_連番);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_連番);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5590ShinsakaiIinJogaiJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5590ShinsakaiIinJogaiJohoEntity insertedRecord = sut.selectByKey(
                    キー_01,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 審査会委員除外情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    キー_02,
                    DEFAULT_連番);
            TestSupport.insert(
                    キー_03,
                    DEFAULT_連番);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 審査会委員除外情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 審査会委員除外情報エンティティを渡すと_insertは_審査会委員除外情報を追加する() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
        }

        @Test
        public void 審査会委員除外情報エンティティを渡すと_updateは_審査会委員除外情報を更新する() {
            DbT5590ShinsakaiIinJogaiJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
            updateRecord.setJogaiTaishoShinsakaiIinCode(new RString("00001"));

            sut.save(updateRecord);

            DbT5590ShinsakaiIinJogaiJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);

            assertThat(updateRecord.getJogaiTaishoShinsakaiIinCode(), is(updatedRecord.getJogaiTaishoShinsakaiIinCode()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
        }

        @Test
        public void 審査会委員除外情報エンティティを渡すと_deleteは_審査会委員除外情報を削除する() {
            DbT5590ShinsakaiIinJogaiJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_連番), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShinseishoKanriNo 申請書管理番号,
                int 連番) {
            DbT5590ShinsakaiIinJogaiJohoEntity entity = DbT5590ShinsakaiIinJogaiJohoEntityGenerator.createDbT5590ShinsakaiIinJogaiJohoEntity();
            entity.setShinseishoKanriNo(申請書管理番号);
            entity.setRenban(連番);
            sut.save(entity);
        }
    }
}