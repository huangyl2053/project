/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.NyuryokuShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3028KyufujissekiKogakuKaigoServicehiEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_サービス提供年月;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_レコード種別コード;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_交換情報識別番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_入力識別番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_給付実績区分コード;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_給付実績情報作成区分コード;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_被保険者番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_証記載保険者番号;
import static jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_通し番号;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
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
 * {@link DbT3028KyufujissekiKogakuKaigoServicehiDac}のテストです。
 *
 * @author LDNS 鄭雪双
 */
@RunWith(Enclosed.class)
public class DbT3028KyufujissekiKogakuKaigoServicehiDacTest extends DbzTestDacBase {

    private static final RString キー_01 = new RString("01");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static final KokanShikibetsuNo 交換情報識別番号1 = new KokanShikibetsuNo(new RString("1"));
    private static final KokanShikibetsuNo 交換情報識別番号3 = new KokanShikibetsuNo(new RString("3"));
    private static DbT3028KyufujissekiKogakuKaigoServicehiDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT3028KyufujissekiKogakuKaigoServicehiDac.class);
    }

    public static class selectByKeyのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
            TestSupport.insert(
                    交換情報識別番号1,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 交換情報識別番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    null,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 入力識別番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    null,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void レコード種別コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    null,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 証記載保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    null,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 被保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    null,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void サービス提供年月がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    null,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 通し番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    null,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 給付実績情報作成区分コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    null,
                    DEFAULT_給付実績区分コード);
        }

        @Test(expected = NullPointerException.class)
        public void 給付実績区分コードがnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    null);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT3028KyufujissekiKogakuKaigoServicehiEntity insertedRecord = sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT3028KyufujissekiKogakuKaigoServicehiEntity insertedRecord = sut.selectByKey(
                    交換情報識別番号3,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbzTestDacBase {

        @Test
        public void 給付実績高額介護サービス費が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
            TestSupport.insert(
                    交換情報識別番号1,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 給付実績高額介護サービス費が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbzTestDacBase {

        @Test
        public void 給付実績高額介護サービス費エンティティを渡すと_insertは_給付実績高額介護サービス費を追加する() {
            TestSupport.insert(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);

            assertThat(sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test
        public void 給付実績高額介護サービス費エンティティを渡すと_updateは_給付実績高額介護サービス費を更新する() {
            DbT3028KyufujissekiKogakuKaigoServicehiEntity updateRecord = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            // TODO 主キー以外の項目を変更してください
//            updateRecord.set変更したい項目(75);

            sut.update(updateRecord);

            DbT3028KyufujissekiKogakuKaigoServicehiEntity updatedRecord = sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);

//            assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード);
        }

        @Test
        public void 給付実績高額介護サービス費エンティティを渡すと_deleteは_給付実績高額介護サービス費を削除する() {
            sut.delete(sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード));
            assertThat(sut.selectByKey(
                    DEFAULT_交換情報識別番号,
                    DEFAULT_入力識別番号,
                    DEFAULT_レコード種別コード,
                    DEFAULT_証記載保険者番号,
                    DEFAULT_被保険者番号,
                    DEFAULT_サービス提供年月,
                    DEFAULT_通し番号,
                    DEFAULT_給付実績情報作成区分コード,
                    DEFAULT_給付実績区分コード), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                KokanShikibetsuNo 交換情報識別番号,
                NyuryokuShikibetsuNo 入力識別番号,
                RString レコード種別コード,
                HokenshaNo 証記載保険者番号,
                HihokenshaNo 被保険者番号,
                FlexibleYearMonth サービス提供年月,
                RString 通し番号,
                RString 給付実績情報作成区分コード,
                RString 給付実績区分コード) {
            DbT3028KyufujissekiKogakuKaigoServicehiEntity entity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            entity.setKokanJohoShikibetsuNo(交換情報識別番号);
            entity.setInputShikibetsuNo(入力識別番号);
            entity.setRecodeShubetsuCode(レコード種別コード);
            entity.setShokisaiHokenshaNo(証記載保険者番号);
            entity.setHiHokenshaNo(被保険者番号);
            entity.setServiceTeikyoYM(サービス提供年月);
            entity.setToshiNo(通し番号);
            entity.setKyufuSakuseiKubunCode(給付実績情報作成区分コード);
            entity.setKyufuJissekiKubunCode(給付実績区分コード);
            sut.insert(entity);
        }
    }
}