/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5105NinteiKanryoJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.helper.DbT5105NinteiKanryoJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbe.entity.helper.DbT5105NinteiKanryoJohoEntityGenerator.DEFAULT_申請書管理番号;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShinseishoKanriNo;
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
 * {@link DbT5105NinteiKanryoJohoDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5105NinteiKanryoJohoDacTest extends DbeTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5105NinteiKanryoJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5105NinteiKanryoJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5105NinteiKanryoJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5105NinteiKanryoJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbeTestDacBase {

        @Test
        public void 要介護認定完了情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 要介護認定完了情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbeTestDacBase {

        @Test
        public void 要介護認定完了情報エンティティを渡すと_insertは_要介護認定完了情報を追加する() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
        }

        @Test
        public void 要介護認定完了情報エンティティを渡すと_updateは_要介護認定完了情報を更新する() {
            DbT5105NinteiKanryoJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT5105NinteiKanryoJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbeTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号);
        }

        @Test
        public void 要介護認定完了情報エンティティを渡すと_deleteは_要介護認定完了情報を削除する() {
            DbT5105NinteiKanryoJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_申請書管理番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShinseishoKanriNo 申請書管理番号) {
            DbT5105NinteiKanryoJohoEntity entity = DbT5105NinteiKanryoJohoEntityGenerator.createDbT5105NinteiKanryoJohoEntity();
            entity.setShinseishoKanriNo(申請書管理番号);
            sut.save(entity);
        }
    }
}