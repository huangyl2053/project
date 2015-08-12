/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.KyotakuKeikakuJigyoshaSakusei;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT3006KyotakuKeikakuJigyoshaSakuseiEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT3006KyotakuKeikakuJigyoshaSakuseiDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
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
 * {link KyotakuKeikakuJigyoshaSakuseiManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyotakuKeikakuJigyoshaSakuseiManagerTest {

    private static DbT3006KyotakuKeikakuJigyoshaSakuseiDac dac;
    private static KyotakuKeikakuJigyoshaSakuseiManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT3006KyotakuKeikakuJigyoshaSakuseiDac.class);
        sut = new KyotakuKeikakuJigyoshaSakuseiManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get居宅給付計画事業者作成 extends DbzTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            Decimal 主キー2 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_履歴番号;
            sut.get居宅給付計画事業者作成(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleYearMonth 主キー1 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_対象年月;
            sut.get居宅給付計画事業者作成(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(FlexibleYearMonth.class), any(Decimal.class))).thenReturn(null);

            FlexibleYearMonth 主キー1 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_対象年月;
            Decimal 主キー2 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_履歴番号;
            KyotakuKeikakuJigyoshaSakusei result = sut.get居宅給付計画事業者作成(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            when(dac.selectByKey(any(FlexibleYearMonth.class), any(Decimal.class))).thenReturn(entity);

            FlexibleYearMonth 主キー1 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_対象年月;
            Decimal 主キー2 = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_履歴番号;
            KyotakuKeikakuJigyoshaSakusei result = sut.get居宅給付計画事業者作成(主キー1, 主キー2);

            assertThat(result.get対象年月().toDateString(), is(DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_対象年月.toDateString()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get居宅給付計画事業者作成一覧 extends DbzTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<KyotakuKeikakuJigyoshaSakusei> result = sut.get居宅給付計画事業者作成一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT3006KyotakuKeikakuJigyoshaSakuseiEntity> entityList = Arrays.asList(DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<KyotakuKeikakuJigyoshaSakusei> result = sut.get居宅給付計画事業者作成一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get対象年月().toDateString(), is(DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.DEFAULT_対象年月.toDateString()));
        }
    }

    public static class save居宅給付計画事業者作成 extends DbzTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(1);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(0);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(1);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            entity.initializeMd5();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);
            居宅給付計画事業者作成 = 居宅給付計画事業者作成.createBuilderForEdit().set計画事業者番号(new JigyoshaNo("任意項目1を変更")).build();

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(0);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            entity.initializeMd5();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);
            居宅給付計画事業者作成 = 居宅給付計画事業者作成.createBuilderForEdit().set計画事業者番号(new JigyoshaNo("任意項目1を変更")).build();

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(1);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            entity.initializeMd5();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);
            居宅給付計画事業者作成 = 居宅給付計画事業者作成.deleted();

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT3006KyotakuKeikakuJigyoshaSakuseiEntity.class))).thenReturn(0);

            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            entity.initializeMd5();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);
            居宅給付計画事業者作成 = 居宅給付計画事業者作成.deleted();

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT3006KyotakuKeikakuJigyoshaSakuseiEntity entity = DbT3006KyotakuKeikakuJigyoshaSakuseiEntityGenerator.createDbT3006KyotakuKeikakuJigyoshaSakuseiEntity();
            entity.initializeMd5();
            KyotakuKeikakuJigyoshaSakusei 居宅給付計画事業者作成 = new KyotakuKeikakuJigyoshaSakusei(entity);

            assertThat(sut.save居宅給付計画事業者作成(居宅給付計画事業者作成), is(false));
        }
    }
}