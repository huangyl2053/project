/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5209NinteichosahyoKinyuItemEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5209NinteichosahyoKinyuItemEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5209NinteichosahyoKinyuItemEntityGenerator.DEFAULT_申請書管理番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5209NinteichosahyoKinyuItemEntityGenerator.DEFAULT_認定調査依頼履歴番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5209NinteichosahyoKinyuItemEntityGenerator.DEFAULT_連番;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
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
 * {@link DbT5209NinteichosahyoKinyuItemDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5209NinteichosahyoKinyuItemDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5209NinteichosahyoKinyuItemDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5209NinteichosahyoKinyuItemDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test(expected = NullPointerException.class)
        public void 認定調査依頼履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test(expected = NullPointerException.class)
        public void 連番がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5209NinteichosahyoKinyuItemEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5209NinteichosahyoKinyuItemEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 認定調査票_概況調査_記入項目が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 認定調査票_概況調査_記入項目が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 認定調査票_概況調査_記入項目エンティティを渡すと_insertは_認定調査票_概況調査_記入項目を追加する() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test
        public void 認定調査票_概況調査_記入項目エンティティを渡すと_updateは_認定調査票_概況調査_記入項目を更新する() {
            DbT5209NinteichosahyoKinyuItemEntity updateRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT5209NinteichosahyoKinyuItemEntity updatedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
        }

        @Test
        public void 認定調査票_概況調査_記入項目エンティティを渡すと_deleteは_認定調査票_概況調査_記入項目を削除する() {
            DbT5209NinteichosahyoKinyuItemEntity deletedEntity = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_認定調査依頼履歴番号,
                    DEFAULT_連番), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShinseishoKanriNo 申請書管理番号,
                int 認定調査依頼履歴番号,
                int 連番) {
            DbT5209NinteichosahyoKinyuItemEntity entity = DbT5209NinteichosahyoKinyuItemEntityGenerator.createDbT5209NinteichosahyoKinyuItemEntity();
            entity.setShinseishoKanriNo(申請書管理番号);
            entity.setNinteichosaRirekiNo(認定調査依頼履歴番号);
            entity.setRemban(連番);
            sut.save(entity);
        }
    }
}