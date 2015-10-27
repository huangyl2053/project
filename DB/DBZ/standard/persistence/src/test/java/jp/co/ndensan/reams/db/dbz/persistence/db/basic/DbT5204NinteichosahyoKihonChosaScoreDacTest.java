/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT5204NinteichosahyoKihonChosaScoreDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT5204NinteichosahyoKihonChosaScoreEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5204NinteichosahyoKihonChosaScoreEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5204NinteichosahyoKihonChosaScoreEntityGenerator.DEFAULT_申請書管理番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5204NinteichosahyoKihonChosaScoreEntityGenerator.DEFAULT_要介護認定調査履歴番号;
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
 * {@link DbT5204NinteichosahyoKihonChosaScoreDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT5204NinteichosahyoKihonChosaScoreDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT5204NinteichosahyoKihonChosaScoreDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT5204NinteichosahyoKihonChosaScoreDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 要介護認定調査履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT5204NinteichosahyoKihonChosaScoreEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT5204NinteichosahyoKihonChosaScoreEntity insertedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 認定調査票_基本調査素点_が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 認定調査票_基本調査素点_が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 認定調査票_基本調査素点_エンティティを渡すと_insertは_認定調査票_基本調査素点_を追加する() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
        }

        @Test
        public void 認定調査票_基本調査素点_エンティティを渡すと_updateは_認定調査票_基本調査素点_を更新する() {
            DbT5204NinteichosahyoKihonChosaScoreEntity updateRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT5204NinteichosahyoKihonChosaScoreEntity updatedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
        }

        @Test
        public void 認定調査票_基本調査素点_エンティティを渡すと_deleteは_認定調査票_基本調査素点_を削除する() {
            DbT5204NinteichosahyoKihonChosaScoreEntity deletedEntity = sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_申請書管理番号,
                    DEFAULT_要介護認定調査履歴番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShinseishoKanriNo 申請書管理番号,
                int 要介護認定調査履歴番号) {
            DbT5204NinteichosahyoKihonChosaScoreEntity entity = DbT5204NinteichosahyoKihonChosaScoreEntityGenerator.createDbT5204NinteichosahyoKihonChosaScoreEntity();
            entity.setShinseishoKanriNo(申請書管理番号);
            entity.setNinteichosaRirekiNo(要介護認定調査履歴番号);
            sut.save(entity);
        }
    }
}