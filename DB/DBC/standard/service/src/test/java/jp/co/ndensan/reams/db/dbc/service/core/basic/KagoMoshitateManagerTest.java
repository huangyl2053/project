/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KagoMoshitate;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3059KagoMoshitateEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3059KagoMoshitateEntityGenerator;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3059KagoMoshitateDac;
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
 * {link KagoMoshitateManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KagoMoshitateManagerTest {

    private static DbT3059KagoMoshitateDac dac;
    private static KagoMoshitateManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT3059KagoMoshitateDac.class);
        sut = new KagoMoshitateManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get過誤申立 extends DbcTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー2 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー3 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_サービス提供年月;
            Decimal 主キー4 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_履歴番号;
            sut.get過誤申立(null, 主キー2, 主キー3, 主キー4);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            JigyoshaNo 主キー1 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号;
            FlexibleYearMonth 主キー3 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_サービス提供年月;
            Decimal 主キー4 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_履歴番号;
            sut.get過誤申立(主キー1, null, 主キー3, 主キー4);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            JigyoshaNo 主キー1 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号;
            HihokenshaNo 主キー2 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー4 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_履歴番号;
            sut.get過誤申立(主キー1, 主キー2, null, 主キー4);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型4にnullを指定した場合_NullPointerExceptionが発生する() {
            JigyoshaNo 主キー1 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号;
            HihokenshaNo 主キー2 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー3 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_サービス提供年月;
            sut.get過誤申立(主キー1, 主キー2, 主キー3, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(JigyoshaNo.class), any(HihokenshaNo.class), any(FlexibleYearMonth.class), any(Decimal.class))).thenReturn(null);

            JigyoshaNo 主キー1 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号;
            HihokenshaNo 主キー2 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー3 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_サービス提供年月;
            Decimal 主キー4 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_履歴番号;
            KagoMoshitate result = sut.get過誤申立(主キー1, 主キー2, 主キー3, 主キー4);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            when(dac.selectByKey(any(JigyoshaNo.class), any(HihokenshaNo.class), any(FlexibleYearMonth.class), any(Decimal.class))).thenReturn(entity);

            JigyoshaNo 主キー1 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号;
            HihokenshaNo 主キー2 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_被保険者番号;
            FlexibleYearMonth 主キー3 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_サービス提供年月;
            Decimal 主キー4 = DbT3059KagoMoshitateEntityGenerator.DEFAULT_履歴番号;
            KagoMoshitate result = sut.get過誤申立(主キー1, 主キー2, 主キー3, 主キー4);

            assertThat(result.get主キー1().value(), is(DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get過誤申立一覧 extends DbcTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<KagoMoshitate> result = sut.get過誤申立一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT3059KagoMoshitateEntity> entityList = Arrays.asList(DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<KagoMoshitate> result = sut.get過誤申立一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT3059KagoMoshitateEntityGenerator.DEFAULT_事業所番号.value()));
        }
    }

    public static class save過誤申立 extends DbcTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(1);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);

            assertThat(sut.save過誤申立(過誤申立), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(0);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);

            assertThat(sut.save過誤申立(過誤申立), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(1);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            entity.initializeMd5();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);
            過誤申立 = 過誤申立.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save過誤申立(過誤申立), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(0);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            entity.initializeMd5();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);
            過誤申立 = 過誤申立.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save過誤申立(過誤申立), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(1);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            entity.initializeMd5();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);
            過誤申立 = 過誤申立.deleted();

            assertThat(sut.save過誤申立(過誤申立), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT3059KagoMoshitateEntity.class))).thenReturn(0);

            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            entity.initializeMd5();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);
            過誤申立 = 過誤申立.deleted();

            assertThat(sut.save過誤申立(過誤申立), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT3059KagoMoshitateEntity entity = DbT3059KagoMoshitateEntityGenerator.createDbT3059KagoMoshitateEntity();
            entity.initializeMd5();
            KagoMoshitate 過誤申立 = new KagoMoshitate(entity);

            assertThat(sut.save過誤申立(過誤申立), is(false));
        }
    }
}