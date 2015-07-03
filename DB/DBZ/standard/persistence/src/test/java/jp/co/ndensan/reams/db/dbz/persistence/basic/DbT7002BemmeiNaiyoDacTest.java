/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7002BemmeiNaiyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator.DEFAULT_原処分被保険者番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator.DEFAULT_審査請求届出日;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator.DEFAULT_弁明書作成日;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator.DEFAULT_証記載保険者番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7002BemmeiNaiyoEntityGenerator.DEFAULT_識別コード;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
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
 * {@link DbT7002BemmeiNaiyoDac}のテストです。
 *
 * @author LDNS 宋昕沢
 */
@RunWith(Enclosed.class)
public class DbT7002BemmeiNaiyoDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT7002BemmeiNaiyoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT7002BemmeiNaiyoDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    new ShoKisaiHokenshaNo(キー_01),
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
            TestSupport.insert(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test(expected = NullPointerException.class)
        public void 証記載保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test(expected = NullPointerException.class)
        public void 識別コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    null,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test(expected = NullPointerException.class)
        public void 原処分被保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    null,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test(expected = NullPointerException.class)
        public void 審査請求届出日がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    null,
                    DEFAULT_弁明書作成日);
        }

        @Test(expected = NullPointerException.class)
        public void 弁明書作成日がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT7002BemmeiNaiyoEntity insertedRecord = sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT7002BemmeiNaiyoEntity insertedRecord = sut.selectByKey(
                    new ShoKisaiHokenshaNo(キー_03),
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 弁明内容が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    new ShoKisaiHokenshaNo(キー_01),
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
            TestSupport.insert(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 弁明内容が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 弁明内容エンティティを渡すと_insertは_弁明内容を追加する() {
            TestSupport.insert(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);

            assertThat(sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test
        public void 弁明内容エンティティを渡すと_updateは_弁明内容を更新する() {
            DbT7002BemmeiNaiyoEntity updateRecord = DbT7002BemmeiNaiyoEntityGenerator.createDbT7002BemmeiNaiyoEntity();
            //TODO  主キー以外の項目を変更してください
//     updateRecord.set変更したい項目(75);

            sut.update(updateRecord);

            DbT7002BemmeiNaiyoEntity updatedRecord = sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);

            //TODO  主キー以外の項目を変更してください
//   assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日);
        }

        @Test
        public void 弁明内容エンティティを渡すと_deleteは_弁明内容を削除する() {
            sut.delete(sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日));
            assertThat(sut.selectByKey(
                    DEFAULT_証記載保険者番号,
                    DEFAULT_識別コード,
                    DEFAULT_原処分被保険者番号,
                    DEFAULT_審査請求届出日,
                    DEFAULT_弁明書作成日), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                ShoKisaiHokenshaNo 証記載保険者番号,
                ShikibetsuCode 識別コード,
                HihokenshaNo 原処分被保険者番号,
                FlexibleDate 審査請求届出日,
                FlexibleDate 弁明書作成日) {
            DbT7002BemmeiNaiyoEntity entity = DbT7002BemmeiNaiyoEntityGenerator.createDbT7002BemmeiNaiyoEntity();
            entity.setShoKisaiHokenshaNo(証記載保険者番号);
            entity.setShikibetsuCode(識別コード);
            entity.setGenshobunHihokenshaNo(原処分被保険者番号);
            entity.setShinsaseikyuTodokedeYMD(審査請求届出日);
            entity.setBemmeishoSakuseiYMD(弁明書作成日);
            sut.insert(entity);
        }
    }
}