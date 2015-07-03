/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3101NijiYoboKihonCheckListEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3101NijiYoboKihonCheckListEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3101NijiYoboKihonCheckListEntityGenerator.DEFAULT_処理日時;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3101NijiYoboKihonCheckListEntityGenerator.DEFAULT_受付年月日;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3101NijiYoboKihonCheckListEntityGenerator.DEFAULT_被保険者番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3101NijiYoboKihonCheckListEntityGenerator.DEFAULT_識別コード;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
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
 * {@link DbT3101NijiYoboKihonCheckListDac}のテストです。
 *
 * @author LDNS 宋昕沢
 */
@RunWith(Enclosed.class)
public class DbT3101NijiYoboKihonCheckListDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT3101NijiYoboKihonCheckListDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT3101NijiYoboKihonCheckListDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    new ShikibetsuCode(キー_01),
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
        }

        @Test(expected = NullPointerException.class)
        public void 識別コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
        }

        @Test(expected = NullPointerException.class)
        public void 被保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    null,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
        }

        @Test(expected = NullPointerException.class)
        public void 受付年月日がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    null,
                    DEFAULT_処理日時);
        }

        @Test(expected = NullPointerException.class)
        public void 処理日時がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT3101NijiYoboKihonCheckListEntity insertedRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT3101NijiYoboKihonCheckListEntity insertedRecord = sut.selectByKey(
                    new ShikibetsuCode(キー_02),
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 二次予防基本チェックリストが存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    new ShikibetsuCode(キー_01),
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 二次予防基本チェックリストが存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 二次予防基本チェックリストエンティティを渡すと_insertは_二次予防基本チェックリストを追加する() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);

            assertThat(sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
        }

        @Test
        public void 二次予防基本チェックリストエンティティを渡すと_updateは_二次予防基本チェックリストを更新する() {
            DbT3101NijiYoboKihonCheckListEntity updateRecord = DbT3101NijiYoboKihonCheckListEntityGenerator.createDbT3101NijiYoboKihonCheckListEntity();
            //TODO  主キー以外の項目を変更してください
//   updateRecord.set変更したい項目(75);

            sut.update(updateRecord);

            DbT3101NijiYoboKihonCheckListEntity updatedRecord = sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);

            //TODO  主キー以外の項目を変更してください
//  assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時);
        }

        @Test
        public void 二次予防基本チェックリストエンティティを渡すと_deleteは_二次予防基本チェックリストを削除する() {
            sut.delete(sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時));
            assertThat(sut.selectByKey(
                    DEFAULT_識別コード,
                    DEFAULT_被保険者番号,
                    DEFAULT_受付年月日,
                    DEFAULT_処理日時), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShikibetsuCode 識別コード,
                HihokenshaNo 被保険者番号,
                FlexibleDate 受付年月日,
                YMDHMS 処理日時) {
            DbT3101NijiYoboKihonCheckListEntity entity = DbT3101NijiYoboKihonCheckListEntityGenerator.createDbT3101NijiYoboKihonCheckListEntity();
            entity.setShikibetsuCode(識別コード);
            entity.setHihokenshaNo(被保険者番号);
            entity.setUketsukeYMD(受付年月日);
            entity.setShoriTimestamp(処理日時);
            sut.insert(entity);
        }
    }
}