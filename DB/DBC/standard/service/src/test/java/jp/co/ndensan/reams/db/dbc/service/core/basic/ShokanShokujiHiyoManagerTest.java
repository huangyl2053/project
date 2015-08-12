/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.ShokanShokujiHiyo;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3043ShokanShokujiHiyoEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3043ShokanShokujiHiyoEntityGenerator;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3043ShokanShokujiHiyoDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * {link ShokanShokujiHiyoManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShokanShokujiHiyoManagerTest {

    private static DbT3043ShokanShokujiHiyoDac dac;
    private static ShokanShokujiHiyoManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT3043ShokanShokujiHiyoDac.class);
        sut = new ShokanShokujiHiyoManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get償還払請求食事費用 extends DbcTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            sut.get償還払請求食事費用(null, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            sut.get償還払請求食事費用(主キー1, null, 主キー3, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            sut.get償還払請求食事費用(主キー1, 主キー2, null, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型4にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            sut.get償還払請求食事費用(主キー1, 主キー2, 主キー3, null, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型5にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            sut.get償還払請求食事費用(主キー1, 主キー2, 主キー3, 主キー4, null, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型6にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            sut.get償還払請求食事費用(主キー1, 主キー2, 主キー3, 主キー4, 主キー5, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(HihokenshaNo.class), any(FlexibleYearMonth.class), any(RString.class),
                    any(JigyoshaNo.class), any(RString.class), any(Decimal.class))).thenReturn(null);
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            ShokanShokujiHiyo result = sut.get償還払請求食事費用(主キー1, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            when(dac.selectByKey(any(HihokenshaNo.class), any(FlexibleYearMonth.class), any(RString.class),
                    any(JigyoshaNo.class), any(RString.class), any(Decimal.class))).thenReturn(entity);
            HihokenshaNo 主キー1 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー2 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_サービス提供年月;
            RString 主キー3 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_整理番号;
            JigyoshaNo 主キー4 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_事業者番号;
            RString 主キー5 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_様式番号;
            Decimal 主キー6 = DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_履歴番号;
            ShokanShokujiHiyo result = sut.get償還払請求食事費用(主キー1, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);

            assertThat(result.get主キー1().value(), is(DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get償還払請求食事費用一覧 extends DbcTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<ShokanShokujiHiyo> result = sut.get償還払請求食事費用一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT3043ShokanShokujiHiyoEntity> entityList = Arrays.asList(DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<ShokanShokujiHiyo> result = sut.get償還払請求食事費用一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT3043ShokanShokujiHiyoEntityGenerator.DEFAULT_被保険者番号.value()));
        }
    }

    public static class save償還払請求食事費用 extends DbcTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(1);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(0);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(1);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            entity.initializeMd5();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);
            償還払請求食事費用 = 償還払請求食事費用.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(0);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            entity.initializeMd5();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);
            償還払請求食事費用 = 償還払請求食事費用.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(1);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            entity.initializeMd5();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);
            償還払請求食事費用 = 償還払請求食事費用.deleted();

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT3043ShokanShokujiHiyoEntity.class))).thenReturn(0);

            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            entity.initializeMd5();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);
            償還払請求食事費用 = 償還払請求食事費用.deleted();

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT3043ShokanShokujiHiyoEntity entity = DbT3043ShokanShokujiHiyoEntityGenerator.createDbT3043ShokanShokujiHiyoEntity();
            entity.initializeMd5();
            ShokanShokujiHiyo 償還払請求食事費用 = new ShokanShokujiHiyo(entity);

            assertThat(sut.save償還払請求食事費用(償還払請求食事費用), is(false));
        }
    }
}