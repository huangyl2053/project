/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.TandokuJoseikinKyufuKettei;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3097TandokuJoseikinKyufuKetteiEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3097TandokuJoseikinKyufuKetteiEntityGenerator;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3097TandokuJoseikinKyufuKetteiDac;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
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
 * {link TandokuJoseikinKyufuKetteiManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class TandokuJoseikinKyufuKetteiManagerTest {

    private static DbT3097TandokuJoseikinKyufuKetteiDac dac;
    private static TandokuJoseikinKyufuKetteiManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT3097TandokuJoseikinKyufuKetteiDac.class);
        sut = new TandokuJoseikinKyufuKetteiManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get市町村単独助成金給付決定 extends DbcTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー2 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_受付年月日;
            Decimal 主キー3 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_履歴番号;
            sut.get市町村単独助成金給付決定(null, 主キー2, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー3 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_履歴番号;
            sut.get市町村単独助成金給付決定(主キー1, null, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            HihokenshaNo 主キー1 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号;
            FlexibleDate 主キー2 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_受付年月日;
            sut.get市町村単独助成金給付決定(主キー1, 主キー2, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(HihokenshaNo.class), any(FlexibleDate.class), any(Decimal.class))).thenReturn(null);

            HihokenshaNo 主キー1 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号;
            FlexibleDate 主キー2 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_受付年月日;
            Decimal 主キー3 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_履歴番号;
            TandokuJoseikinKyufuKettei result = sut.get市町村単独助成金給付決定(主キー1, 主キー2, 主キー3);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            when(dac.selectByKey(any(HihokenshaNo.class), any(FlexibleDate.class), any(Decimal.class))).thenReturn(entity);
            HihokenshaNo 主キー1 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号;
            FlexibleDate 主キー2 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_受付年月日;
            Decimal 主キー3 = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_履歴番号;
            TandokuJoseikinKyufuKettei result = sut.get市町村単独助成金給付決定(主キー1, 主キー2, 主キー3);

            assertThat(result.get主キー1().value(), is(DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get市町村単独助成金給付決定一覧 extends DbcTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<TandokuJoseikinKyufuKettei> result = sut.get市町村単独助成金給付決定一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT3097TandokuJoseikinKyufuKetteiEntity> entityList = Arrays.asList(DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<TandokuJoseikinKyufuKettei> result = sut.get市町村単独助成金給付決定一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.DEFAULT_被保険者番号.value()));
        }
    }

    public static class save市町村単独助成金給付決定 extends DbcTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(1);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(0);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(1);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            entity.initializeMd5();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);
            市町村単独助成金給付決定 = 市町村単独助成金給付決定.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(0);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            entity.initializeMd5();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);
            市町村単独助成金給付決定 = 市町村単独助成金給付決定.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(1);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            entity.initializeMd5();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);
            市町村単独助成金給付決定 = 市町村単独助成金給付決定.deleted();

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT3097TandokuJoseikinKyufuKetteiEntity.class))).thenReturn(0);

            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            entity.initializeMd5();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);
            市町村単独助成金給付決定 = 市町村単独助成金給付決定.deleted();

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT3097TandokuJoseikinKyufuKetteiEntity entity = DbT3097TandokuJoseikinKyufuKetteiEntityGenerator.createDbT3097TandokuJoseikinKyufuKetteiEntity();
            entity.initializeMd5();
            TandokuJoseikinKyufuKettei 市町村単独助成金給付決定 = new TandokuJoseikinKyufuKettei(entity);

            assertThat(sut.save市町村単独助成金給付決定(市町村単独助成金給付決定), is(false));
        }
    }
}
