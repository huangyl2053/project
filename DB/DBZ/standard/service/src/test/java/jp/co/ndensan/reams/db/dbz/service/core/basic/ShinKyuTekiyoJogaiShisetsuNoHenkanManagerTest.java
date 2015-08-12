/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ShinKyuTekiyoJogaiShisetsuNoHenkan;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanDac;
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
 * {link ShinKyuTekiyoJogaiShisetsuNoHenkanManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShinKyuTekiyoJogaiShisetsuNoHenkanManagerTest {

    private static DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanDac dac;
    private static ShinKyuTekiyoJogaiShisetsuNoHenkanManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanDac.class);
        sut = new ShinKyuTekiyoJogaiShisetsuNoHenkanManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get新旧適用除外施設番号変換テーブル extends FdaTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型2 主キー2 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー2;
            sut.get新旧適用除外施設番号変換テーブル(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型1 主キー1 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー1;
            sut.get新旧適用除外施設番号変換テーブル(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            主キー型1 主キー1 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー2;
            ShinKyuTekiyoJogaiShisetsuNoHenkan result = sut.get新旧適用除外施設番号変換テーブル(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            主キー型1 主キー1 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー2;
            ShinKyuTekiyoJogaiShisetsuNoHenkan result = sut.get新旧適用除外施設番号変換テーブル(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get新旧適用除外施設番号変換テーブル一覧 extends FdaTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<ShinKyuTekiyoJogaiShisetsuNoHenkan> result = sut.get新旧適用除外施設番号変換テーブル一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity> entityList = Arrays.asList(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<ShinKyuTekiyoJogaiShisetsuNoHenkan> result = sut.get新旧適用除外施設番号変換テーブル一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class save新旧適用除外施設番号変換テーブル extends XxxTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(1);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(0);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(1);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            entity.initializeMd5();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);
            新旧適用除外施設番号変換テーブル = 新旧適用除外施設番号変換テーブル.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(0);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            entity.initializeMd5();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);
            新旧適用除外施設番号変換テーブル = 新旧適用除外施設番号変換テーブル.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(1);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            entity.initializeMd5();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);
            新旧適用除外施設番号変換テーブル = 新旧適用除外施設番号変換テーブル.deleted();

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity.class))).thenReturn(0);

            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            entity.initializeMd5();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);
            新旧適用除外施設番号変換テーブル = 新旧適用除外施設番号変換テーブル.deleted();

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity entity = DbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntityGenerator.createDbT7031ShinKyuTekiyoJogaiShisetsuNoHenkanEntity();
            entity.initializeMd5();
            ShinKyuTekiyoJogaiShisetsuNoHenkan 新旧適用除外施設番号変換テーブル = new ShinKyuTekiyoJogaiShisetsuNoHenkan(entity);

            assertThat(sut.save新旧適用除外施設番号変換テーブル(新旧適用除外施設番号変換テーブル), is(false));
        }
    }
}