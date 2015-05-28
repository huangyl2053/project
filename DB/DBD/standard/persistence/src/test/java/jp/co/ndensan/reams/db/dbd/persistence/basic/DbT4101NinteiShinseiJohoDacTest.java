/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbd.entity.basic.DbT4101NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.db.dbd.entity.basic.helper.DbT4101NinteiShinseiJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbd.entity.basic.helper.DbT4101NinteiShinseiJohoEntityGenerator.*;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbdTestDacBase;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT4101NinteiShinseiJohoDac}のテストです。
 *
 * @author n8235 船山洋介
 */
@RunWith(Enclosed.class)
public class DbT4101NinteiShinseiJohoDacTest extends DbdTestDacBase {

    private static DbT4101NinteiShinseiJohoDac sut;

    public static ShinseishoKanriNo OTHER_申請書管理番号 = new ShinseishoKanriNo("90000000000000002");
    public static ShinseishoKanriNo NOTFOUND_申請書管理番号 = new ShinseishoKanriNo("99999999999999999");

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT4101NinteiShinseiJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbdTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(DEFAULT_申請書管理番号);
            TestSupport.insert(OTHER_申請書管理番号);
        }

        @Test(expected = NullPointerException.class)
        public void 申請書管理番号がnullの場合_selectByKeyのisPresentは_NullPointerExceptionを発生させる() {
            sut.selectByKey(null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            Optional<DbT4101NinteiShinseiJohoEntity> insertedRecord = sut.selectByKey(DEFAULT_申請書管理番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyのisPresentは_falseを返す() {
            Optional<DbT4101NinteiShinseiJohoEntity> insertedRecord = sut.selectByKey(NOTFOUND_申請書管理番号);
            assertThat(insertedRecord.isPresent(), is(false));
        }
    }

    @Ignore("テストデータの件数は可変なので、エラーとしない")
    public static class selectAllのテスト extends DbdTestDacBase {

        @Test
        public void 要介護認定申請情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(DEFAULT_申請書管理番号);
            TestSupport.insert(OTHER_申請書管理番号);
            assertThat(sut.selectAll().size(), is(3));
        }

        @Test
        public void 要介護認定申請情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll().toList(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbdTestDacBase {

        @Test
        public void 要介護認定申請情報エンティティを渡すと_insertは_要介護認定申請情報を追加する() {
            TestSupport.insert(DEFAULT_申請書管理番号);

            assertThat(sut.selectByKey(DEFAULT_申請書管理番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbdTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(DEFAULT_申請書管理番号);
        }

        @Test
        public void 要介護認定申請情報エンティティを渡すと_updateは_要介護認定申請情報を更新する() {
            DbT4101NinteiShinseiJohoEntity updateRecord = DbT4101NinteiShinseiJohoEntityGenerator.createDbT4101NinteiShinseiJohoEntity();
            updateRecord.setAge(75);

            sut.update(updateRecord);

            Optional<DbT4101NinteiShinseiJohoEntity> updatedRecord = sut.selectByKey(
                    DEFAULT_申請書管理番号);

            assertThat(updateRecord.getAge(), is(updatedRecord.get().getAge()));
        }
    }

    public static class deleteのテスト extends DbdTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(DEFAULT_申請書管理番号);
        }

        @Test
        public void 要介護認定申請情報エンティティを渡すと_deleteは_要介護認定申請情報を削除する() {
            sut.delete(sut.selectByKey(DEFAULT_申請書管理番号).get());
            assertThat(sut.selectByKey(DEFAULT_申請書管理番号).isPresent(), is(false));
        }
    }

    private static class TestSupport {

        public static void insert(ShinseishoKanriNo 申請書管理番号) {
            DbT4101NinteiShinseiJohoEntity entity = DbT4101NinteiShinseiJohoEntityGenerator.createDbT4101NinteiShinseiJohoEntity();
            entity.setShinseishoKanriNo(申請書管理番号);
            sut.insert(entity);
        }
    }
}
