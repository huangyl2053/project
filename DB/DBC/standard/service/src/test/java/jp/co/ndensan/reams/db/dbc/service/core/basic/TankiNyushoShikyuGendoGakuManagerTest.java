/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT7110TankiNyushoShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7110TankiNyushoShikyuGendoGakuEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT7110TankiNyushoShikyuGendoGakuDac;
import jp.co.ndensan.reams.uz.uza.lang.RString;
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
 * {link TankiNyushoShikyuGendoGakuManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class TankiNyushoShikyuGendoGakuManagerTest {

    private static DbT7110TankiNyushoShikyuGendoGakuDac dac;
    private static TankiNyushoShikyuGendoGakuManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT7110TankiNyushoShikyuGendoGakuDac.class);
        sut = new TankiNyushoShikyuGendoGakuManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get短期入所系支給限度額 extends FdaTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型2 主キー2 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            sut.get短期入所系支給限度額(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型1 主キー1 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            sut.get短期入所系支給限度額(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            主キー型1 主キー1 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            TankiNyushoShikyuGendoGaku result = sut.get短期入所系支給限度額(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            主キー型1 主キー1 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            TankiNyushoShikyuGendoGaku result = sut.get短期入所系支給限度額(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get短期入所系支給限度額一覧 extends FdaTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<TankiNyushoShikyuGendoGaku> result = sut.get短期入所系支給限度額一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT7110TankiNyushoShikyuGendoGakuEntity> entityList = Arrays.asList(DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<TankiNyushoShikyuGendoGaku> result = sut.get短期入所系支給限度額一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class save短期入所系支給限度額 extends XxxTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            entity.initializeMd5();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);
            短期入所系支給限度額 = 短期入所系支給限度額.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            entity.initializeMd5();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);
            短期入所系支給限度額 = 短期入所系支給限度額.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            entity.initializeMd5();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);
            短期入所系支給限度額 = 短期入所系支給限度額.deleted();

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT7110TankiNyushoShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            entity.initializeMd5();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);
            短期入所系支給限度額 = 短期入所系支給限度額.deleted();

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT7110TankiNyushoShikyuGendoGakuEntity entity = DbT7110TankiNyushoShikyuGendoGakuEntityGenerator.createDbT7110TankiNyushoShikyuGendoGakuEntity();
            entity.initializeMd5();
            TankiNyushoShikyuGendoGaku 短期入所系支給限度額 = new TankiNyushoShikyuGendoGaku(entity);

            assertThat(sut.save短期入所系支給限度額(短期入所系支給限度額), is(false));
        }
    }
}