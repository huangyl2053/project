/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT4912ShujiiJohoDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.definition.core.valueobject.ninteishinsei.ShujiiCode;
import jp.co.ndensan.reams.db.dbz.definition.core.valueobject.ninteishinsei.ShujiiIryokikanCode;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT4912ShujiiJohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT4912ShujiiJohoEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT4912ShujiiJohoEntityGenerator.DEFAULT_主治医コード;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT4912ShujiiJohoEntityGenerator.DEFAULT_主治医医療機関コード;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT4912ShujiiJohoEntityGenerator.DEFAULT_市町村コード;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
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
 * {@link DbT4912ShujiiJohoDac}のテストです。
 */
@Ignore
@RunWith(Enclosed.class)
public class DbT4912ShujiiJohoDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT4912ShujiiJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT4912ShujiiJohoDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test(expected = NullPointerException.class)
        public void 市町村コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test(expected = NullPointerException.class)
        public void 主治医医療機関コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test(expected = NullPointerException.class)
        public void 主治医コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT4912ShujiiJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT4912ShujiiJohoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 主治医情報が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 主治医情報が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 主治医情報エンティティを渡すと_insertは_主治医情報を追加する() {
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);

            assertThat(sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test
        public void 主治医情報エンティティを渡すと_updateは_主治医情報を更新する() {
            DbT4912ShujiiJohoEntity updateRecord = sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT4912ShujiiJohoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
        }

        @Test
        public void 主治医情報エンティティを渡すと_deleteは_主治医情報を削除する() {
            DbT4912ShujiiJohoEntity deletedEntity = sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_市町村コード,
                    DEFAULT_主治医医療機関コード,
                    DEFAULT_主治医コード), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                LasdecCode 市町村コード,
                RString 主治医医療機関コード,
                RString 主治医コード) {
            DbT4912ShujiiJohoEntity entity = DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity();
            entity.setShichosonCode(市町村コード);
            entity.setShujiiIryokikanCode(主治医医療機関コード);
            entity.setShujiiCode(主治医コード);
            sut.save(entity);
        }
    }
}
