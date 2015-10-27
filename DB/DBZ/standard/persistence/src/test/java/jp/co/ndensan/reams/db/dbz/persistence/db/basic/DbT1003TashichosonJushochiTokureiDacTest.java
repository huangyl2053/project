/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.db.basic;

import jp.co.ndensan.reams.db.dbz.persistence.db.basic.DbT1003TashichosonJushochiTokureiDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1003TashichosonJushochiTokureiEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT1003TashichosonJushochiTokureiEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT1003TashichosonJushochiTokureiEntityGenerator.*;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT1003TashichosonJushochiTokureiDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT1003TashichosonJushochiTokureiDacTest extends DbzTestDacBase {

    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT1003TashichosonJushochiTokureiDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT1003TashichosonJushochiTokureiDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test(expected = NullPointerException.class)
        public void 識別コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test(expected = NullPointerException.class)
        public void 異動日がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test(expected = NullPointerException.class)
        public void 枝番がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT1003TashichosonJushochiTokureiEntity insertedRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT1003TashichosonJushochiTokureiEntity insertedRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 他市町村住所地特例が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 他市町村住所地特例が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 他市町村住所地特例エンティティを渡すと_insertは_他市町村住所地特例を追加する() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);

            assertThat(sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test
        public void 他市町村住所地特例エンティティを渡すと_updateは_他市町村住所地特例を更新する() {
            DbT1003TashichosonJushochiTokureiEntity updateRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            updateRecord.setTekiyoYMD(new FlexibleDate("20150810"));

            sut.save(updateRecord);

            DbT1003TashichosonJushochiTokureiEntity updatedRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);

            assertThat(updateRecord.getTekiyoYMD(), is(updatedRecord.getTekiyoYMD()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
        }

        @Test
        public void 他市町村住所地特例エンティティを渡すと_deleteは_他市町村住所地特例を削除する() {
            DbT1003TashichosonJushochiTokureiEntity deletedEntity = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_異動日,
                    DEFAULT_枝番), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShikibetsuCode 識別コード,
                FlexibleDate 異動日,
                RString 枝番) {
            DbT1003TashichosonJushochiTokureiEntity entity = DbT1003TashichosonJushochiTokureiEntityGenerator.createDbT1003TashichosonJushochiTokureiEntity();
            entity.setShikibetsuCode(識別コード);
            entity.setIdoYMD(異動日);
            entity.setEdaNo(枝番);
            sut.save(entity);
        }
    }
}