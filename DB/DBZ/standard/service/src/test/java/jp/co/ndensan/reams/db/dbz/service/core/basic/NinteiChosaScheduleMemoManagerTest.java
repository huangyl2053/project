/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteiChosaScheduleMemo;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5222NinteiChosaScheduleMemoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT5222NinteiChosaScheduleMemoDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * {link NinteiChosaScheduleMemoManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NinteiChosaScheduleMemoManagerTest {

    private static DbT5222NinteiChosaScheduleMemoDac dac;
    private static NinteiChosaScheduleMemoManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT5222NinteiChosaScheduleMemoDac.class);
        sut = new NinteiChosaScheduleMemoManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get認定調査スケジュールメモ情報 extends DbzTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ年月日;
            Code 主キー2 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ区分;
            Decimal 主キー3 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_連番;
            sut.get認定調査スケジュールメモ情報(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ年月日;
            Code 主キー2 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ区分;
            Decimal 主キー3 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_連番;
            sut.get認定調査スケジュールメモ情報(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            FlexibleDate 主キー1 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ年月日;
            Code 主キー2 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ区分;
            Decimal 主キー3 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_連番;
            NinteiChosaScheduleMemo result = sut.get認定調査スケジュールメモ情報(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            FlexibleDate 主キー1 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ年月日;
            Code 主キー2 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_メモ区分;
            Decimal 主キー3 = DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_連番;
            NinteiChosaScheduleMemo result = sut.get認定調査スケジュールメモ情報(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get認定調査スケジュールメモ情報一覧 extends DbzTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<NinteiChosaScheduleMemo> result = sut.get認定調査スケジュールメモ情報一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT5222NinteiChosaScheduleMemoEntity> entityList = Arrays.asList(DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<NinteiChosaScheduleMemo> result = sut.get認定調査スケジュールメモ情報一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT5222NinteiChosaScheduleMemoEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class save認定調査スケジュールメモ情報 extends DbzTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(1);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(0);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(1);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            entity.initializeMd5();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);
            認定調査スケジュールメモ情報 = 認定調査スケジュールメモ情報.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(0);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            entity.initializeMd5();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);
            認定調査スケジュールメモ情報 = 認定調査スケジュールメモ情報.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(1);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            entity.initializeMd5();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);
            認定調査スケジュールメモ情報 = 認定調査スケジュールメモ情報.deleted();

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT5222NinteiChosaScheduleMemoEntity.class))).thenReturn(0);

            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            entity.initializeMd5();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);
            認定調査スケジュールメモ情報 = 認定調査スケジュールメモ情報.deleted();

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT5222NinteiChosaScheduleMemoEntity entity = DbT5222NinteiChosaScheduleMemoEntityGenerator.createDbT5222NinteiChosaScheduleMemoEntity();
            entity.initializeMd5();
            NinteiChosaScheduleMemo 認定調査スケジュールメモ情報 = new NinteiChosaScheduleMemo(entity);

            assertThat(sut.save認定調査スケジュールメモ情報(認定調査スケジュールメモ情報), is(false));
        }
    }
}