/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.basic.NinteichosahyoServiceJokyo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5207NinteichosahyoServiceJokyoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5207NinteichosahyoServiceJokyoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT5207NinteichosahyoServiceJokyoDac;
import jp.co.ndensan.reams.uz.uza.lang.RString;
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
 * {link NinteichosahyoServiceJokyoManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NinteichosahyoServiceJokyoManagerTest {

    private static DbT5207NinteichosahyoServiceJokyoDac dac;
    private static NinteichosahyoServiceJokyoManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT5207NinteichosahyoServiceJokyoDac.class);
        sut = new NinteichosahyoServiceJokyoManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get認定調査票_概況調査_サービスの状況 extends FdaTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型2 主キー2 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー2;
            sut.get認定調査票_概況調査_サービスの状況(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型1 主キー1 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー1;
            sut.get認定調査票_概況調査_サービスの状況(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            主キー型1 主キー1 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー2;
            NinteichosahyoServiceJokyo result = sut.get認定調査票_概況調査_サービスの状況(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            主キー型1 主キー1 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー2;
            NinteichosahyoServiceJokyo result = sut.get認定調査票_概況調査_サービスの状況(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get認定調査票_概況調査_サービスの状況一覧 extends FdaTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<NinteichosahyoServiceJokyo> result = sut.get認定調査票_概況調査_サービスの状況一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT5207NinteichosahyoServiceJokyoEntity> entityList = Arrays.asList(DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<NinteichosahyoServiceJokyo> result = sut.get認定調査票_概況調査_サービスの状況一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT5207NinteichosahyoServiceJokyoEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class save認定調査票_概況調査_サービスの状況 extends XxxTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(1);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(0);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(1);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            entity.initializeMd5();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);
            認定調査票_概況調査_サービスの状況 = 認定調査票_概況調査_サービスの状況.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(0);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            entity.initializeMd5();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);
            認定調査票_概況調査_サービスの状況 = 認定調査票_概況調査_サービスの状況.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(1);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            entity.initializeMd5();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);
            認定調査票_概況調査_サービスの状況 = 認定調査票_概況調査_サービスの状況.deleted();

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT5207NinteichosahyoServiceJokyoEntity.class))).thenReturn(0);

            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            entity.initializeMd5();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);
            認定調査票_概況調査_サービスの状況 = 認定調査票_概況調査_サービスの状況.deleted();

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT5207NinteichosahyoServiceJokyoEntity entity = DbT5207NinteichosahyoServiceJokyoEntityGenerator.createDbT5207NinteichosahyoServiceJokyoEntity();
            entity.initializeMd5();
            NinteichosahyoServiceJokyo 認定調査票_概況調査_サービスの状況 = new NinteichosahyoServiceJokyo(entity);

            assertThat(sut.save認定調査票_概況調査_サービスの状況(認定調査票_概況調査_サービスの状況), is(false));
        }
    }
}