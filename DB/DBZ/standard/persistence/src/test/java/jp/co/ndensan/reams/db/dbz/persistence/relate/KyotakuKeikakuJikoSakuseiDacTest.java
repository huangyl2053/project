/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.relate;

import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3007KyotakuKeikakuJikoSakuseiEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator;
import jp.co.ndensan.reams.db.dbz.model.KyotakuKeikakuJikoSakuseiModel;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT3007KyotakuKeikakuJikoSakuseiDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link KyotakuKeikakuJikoSakuseiDac}のテストクラスです。
 *
 * @author n8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class KyotakuKeikakuJikoSakuseiDacTest {

    private static KyotakuKeikakuJikoSakuseiDac sut;
    private static DbT3007KyotakuKeikakuJikoSakuseiDac 居宅給付計画自己作成Dac;
    private static final HokenshaNo 証記載保険者番号1 = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.DEFAULT_証記載保険者番号;
    private static final HokenshaNo 証記載保険者番号2 = new HokenshaNo("124562");
    private static final HihokenshaNo 被保険者番号1 = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.DEFAULT_被保険者番号;
    private static final HihokenshaNo 被保険者番号2 = new HihokenshaNo("987654");
    private static final ShikibetsuCode 識別コード1 = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.DEFAULT_識別コード;
    private static final ShikibetsuCode 識別コード2 = new ShikibetsuCode("222");
    private static final FlexibleYearMonth 対象年月1 = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.DEFAULT_対象年月;
    private static final FlexibleYearMonth 対象年月2 = new FlexibleDate("20141201").getYearMonth();
    private static final YMDHMS 処理日時1 = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.DEFAULT_処理日時;
    private static final YMDHMS 処理日時2 = new YMDHMS("20140101102040");

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(KyotakuKeikakuJikoSakuseiDac.class);
        居宅給付計画自己作成Dac = InstanceProvider.create(DbT3007KyotakuKeikakuJikoSakuseiDac.class);
    }

    public static class selectByKeyTest extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insertDbT3007(証記載保険者番号1, 被保険者番号1, 識別コード1, 対象年月1, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の被保険者番号にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.selectByKey(null, 証記載保険者番号1, 識別コード1, 対象年月1, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の証記載保険者番号にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.selectByKey(被保険者番号1, null, 識別コード1, 対象年月1, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の識別コードにnullを指定した場合_NullPointerExceptionが発生する() {
            sut.selectByKey(被保険者番号1, 証記載保険者番号1, null, 対象年月1, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の対象年月にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.selectByKey(被保険者番号1, 証記載保険者番号1, 識別コード1, null, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の処理日時にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.selectByKey(被保険者番号1, 証記載保険者番号1, 識別コード1, 対象年月1, null);
        }

        // TODO 見つかる場合、居宅給付計画自己作成モデルを構成している全てのモデルクラスについて特定項目を選択し、一致していることを確認するテストケースを記述して下さい。
        // TODO 個別のMapperのテストクラスで項目単位の転記処理を確認しているため、全項目について確認する必要はありません。
        @Test
        public void データが見つかる検索条件を渡すと_居宅給付計画自己作成モデル返す() {
            assertThat(sut.selectByKey(被保険者番号1, 証記載保険者番号1, 識別コード1, 対象年月1, 処理日時1).get().get被保険者番号(), is(被保険者番号1));
        }

        // データが見つからない値を指定するように修正してください。
        @Test
        public void データが見つかない検索条件を渡すと_データ無しを返す() {
            assertThat(sut.selectByKey(被保険者番号2, 証記載保険者番号1, 識別コード1, 対象年月1, 処理日時1).isPresent(), is(false));
        }
    }

    public static class selectAll extends DbzTestDacBase {

        @Test
        public void データが見つかる検索条件を渡すと_モデルリストを返す() {
            TestSupport.insertDbT3007(証記載保険者番号1, 被保険者番号1, 識別コード1, 対象年月1, 処理日時1);
            IItemList<KyotakuKeikakuJikoSakuseiModel> modelList = sut.selectAll();
            assertThat(modelList.size(), is(1));
            // 任意の項目が一致するテストケースを記述してください。
            assertThat(modelList.toList().get(0).get証記載保険者番号(), is(証記載保険者番号1));
        }

        @Test
        public void データが見つかない検索条件を渡すと_空のリストを返す() {
            assertThat(sut.selectAll().isEmpty(), is(true));
        }
    }

    public static class select最新居宅給付計画自己作成ByKeyTest extends DbzTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insertDbT3007(証記載保険者番号1, 被保険者番号1, 識別コード1, 対象年月1, 処理日時1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の被保険者番号にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.select直近居宅給付計画自己作成(null, 証記載保険者番号1, 識別コード1, 対象年月1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の証記載保険者番号にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.select直近居宅給付計画自己作成(被保険者番号1, null, 識別コード1, 対象年月1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の識別コードにnullを指定した場合_NullPointerExceptionが発生する() {
            sut.select直近居宅給付計画自己作成(被保険者番号1, 証記載保険者番号1, null, 対象年月1);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の対象年月にnullを指定した場合_NullPointerExceptionが発生する() {
            sut.select直近居宅給付計画自己作成(被保険者番号1, 証記載保険者番号1, 識別コード1, null);
        }

        @Test
        public void データが見つかる検索条件を渡すと_居宅給付計画自己作成モデル返す() {
            assertThat(sut.select直近居宅給付計画自己作成(被保険者番号1, 証記載保険者番号1, 識別コード1, 対象年月1).get().get被保険者番号(), is(被保険者番号1));
        }

        // データが見つからない値を指定するように修正してください。
        @Test
        public void データが見つかない検索条件を渡すと_データ無しを返す() {
            assertThat(sut.select直近居宅給付計画自己作成(被保険者番号2, 証記載保険者番号2, 識別コード1, 対象年月1).isPresent(), is(false));
        }
    }

    public static class insertTest extends DbzTestDacBase {

        @Test
        public void nullを渡した時_insertは_0を返す() {
            assertThat(sut.insert(null), is(0));
        }

        // TODO KyotakuKeikakuJikoSakuseiModelの生成パターンによるテストを追加してください。nullや空のリストを指定する。
        @Test
        public void 全ての有効なモデルを持つKyotakuKeikakuJikoSakuseiRelateモデルを渡した時_insertは_1を返す() {
            KyotakuKeikakuJikoSakuseiModel model = new KyotakuKeikakuJikoSakuseiModel(DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.createDbT3007KyotakuKeikakuJikoSakuseiEntity());

            assertThat(sut.insert(model), is(1));
        }
    }

    public static class updateTest extends DbzTestDacBase {

        @Test
        public void nullを渡した時_updateは_0を返す() {
            assertThat(sut.update(null), is(0));
        }

        // TODO KyotakuKeikakuJikoSakuseiModelの生成パターンによるテストを追加してください。nullや空のリストを指定する。異なる状態を指定する。
        @Test
        public void モデルの状態がModifiedの時_updateは_1を返す() {
            KyotakuKeikakuJikoSakuseiModel model = new KyotakuKeikakuJikoSakuseiModel(DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.createDbT3007KyotakuKeikakuJikoSakuseiEntity());

            sut.insert(model);

            model.getEntity().initializeMd5();
            // 状態をModifiedにするために任意の項目をinsert時と変更してください。
            model.set計画変更事由(new RString("99"));

            assertThat(sut.update(model), is(1));
        }

    }

    public static class deleteTest extends DbzTestDacBase {

        @Test
        public void nullを渡した時_deleteは_0を返す() {
            assertThat(sut.delete(null), is(0));
        }

        // TODO KyotakuKeikakuJikoSakuseiModelの生成パターンによるテストを追加してください。nullや空のリストを指定する。
        @Test
        public void 全ての有効なモデルを持つKyotakuKeikakuJikoSakuseiRelateモデルを渡した時_deleteは_1を返す() {
            KyotakuKeikakuJikoSakuseiModel model = new KyotakuKeikakuJikoSakuseiModel(DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.createDbT3007KyotakuKeikakuJikoSakuseiEntity());

            sut.insert(model);
            assertThat(sut.delete(model), is(1));
        }
    }

    public static class deletePhysicalTest extends DbzTestDacBase {

        @Test
        public void nullを渡した時_deletePhysicalは_0を返す() {
            assertThat(sut.deletePhysical(null), is(0));
        }

        // TODO KyotakuKeikakuJikoSakuseiModelの生成パターンによるテストを追加してください。nullや空のリストを指定する。
        @Test
        public void 全ての有効なモデルを持つKyotakuKeikakuJikoSakuseiRelateモデルを渡した時_deletePhysicalは_1を返す() {
            KyotakuKeikakuJikoSakuseiModel model = new KyotakuKeikakuJikoSakuseiModel(DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.createDbT3007KyotakuKeikakuJikoSakuseiEntity());

            sut.insert(model);
            assertThat(sut.deletePhysical(model), is(1));
        }
    }

    private static class TestSupport {

        public static void insertDbT3007(
                HokenshaNo 証記載保険者番号,
                HihokenshaNo 被保険者番号,
                ShikibetsuCode 識別コード,
                FlexibleYearMonth 対象年月,
                YMDHMS 処理日時) {
            DbT3007KyotakuKeikakuJikoSakuseiEntity entity = DbT3007KyotakuKeikakuJikoSakuseiEntityGenerator.createDbT3007KyotakuKeikakuJikoSakuseiEntity();
            entity.setShoKisaiHokenshaNo(証記載保険者番号);
            entity.setHihokenshaNo(被保険者番号);
            entity.setShikibetsuCode(識別コード);
            entity.setTaishoYM(対象年月);
            entity.setShoriTimestamp(処理日時);
            居宅給付計画自己作成Dac.insert(entity);
        }
    }
}