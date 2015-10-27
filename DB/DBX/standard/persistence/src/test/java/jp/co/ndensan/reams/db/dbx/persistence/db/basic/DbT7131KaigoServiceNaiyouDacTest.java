/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.persistence.db.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7131KaigoServiceNaiyouEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7131KaigoServiceNaiyouEntityGenerator;
import static jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7131KaigoServiceNaiyouEntityGenerator.*;
import jp.co.ndensan.reams.db.dbx.testhelper.DbxTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.KaigoServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.lang.RYearMonth;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
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
 * {@link DbT7131KaigoServiceNaiyouDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT7131KaigoServiceNaiyouDacTest extends DbxTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT7131KaigoServiceNaiyouDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT7131KaigoServiceNaiyouDac.class);
    }

    public static class selectByKeyのテスト extends DbxTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void サービス種類コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void サービス項目コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 提供開始年月がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT7131KaigoServiceNaiyouEntity insertedRecord = sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT7131KaigoServiceNaiyouEntity insertedRecord = sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbxTestDacBase {

        @Test
        public void 介護サービス内容が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 介護サービス内容が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbxTestDacBase {

        @Test
        public void 介護サービス内容エンティティを渡すと_insertは_介護サービス内容を追加する() {
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);

            assertThat(sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbxTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 介護サービス内容エンティティを渡すと_updateは_介護サービス内容を更新する() {
            DbT7131KaigoServiceNaiyouEntity updateRecord = sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            updateRecord.setServiceName(new RString("サービス名称"));

            sut.save(updateRecord);

            DbT7131KaigoServiceNaiyouEntity updatedRecord = sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);

            assertThat(updateRecord.getServiceName(), is(updatedRecord.getServiceName()));
        }
    }

    public static class deleteのテスト extends DbxTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 介護サービス内容エンティティを渡すと_deleteは_介護サービス内容を削除する() {
            DbT7131KaigoServiceNaiyouEntity deletedEntity = sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_サービス種類コード,
                    DEFAULT_サービス項目コード,
                    DEFAULT_提供開始年月,
                    DEFAULT_履歴番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                KaigoServiceShuruiCode サービス種類コード,
                RString サービス項目コード,
                FlexibleYearMonth 提供開始年月,
                Decimal 履歴番号) {
            DbT7131KaigoServiceNaiyouEntity entity = DbT7131KaigoServiceNaiyouEntityGenerator.createDbT7131KaigoServiceNaiyouEntity();
            entity.setServiceShuruiCode(サービス種類コード);
            entity.setServiceKoumokuCode(サービス項目コード);
            entity.setTeikyoKaishiYM(提供開始年月);
            entity.setRirekiNo(履歴番号);
            sut.save(entity);
        }
    }
}