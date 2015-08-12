/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.Shotoku;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT2008ShotokuEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT2008ShotokuEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT2008ShotokuDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
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
 * {link ShotokuManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShotokuManagerTest {

    private static DbT2008ShotokuDac dac;
    private static ShotokuManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT2008ShotokuDac.class);
        sut = new ShotokuManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get介護所得 extends DbzTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            ShikibetsuCode 主キー2 = DbT2008ShotokuEntityGenerator.DEFAULT_識別コード;
            Decimal 主キー3 = DbT2008ShotokuEntityGenerator.DEFAULT_履歴番号;
            sut.get介護所得(null, 主キー2, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleYear 主キー1 = DbT2008ShotokuEntityGenerator.DEFAULT_所得年度;
            Decimal 主キー3 = DbT2008ShotokuEntityGenerator.DEFAULT_履歴番号;
            sut.get介護所得(主キー1, null, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleYear 主キー1 = DbT2008ShotokuEntityGenerator.DEFAULT_所得年度;
            ShikibetsuCode 主キー2 = DbT2008ShotokuEntityGenerator.DEFAULT_識別コード;
            sut.get介護所得(主キー1, 主キー2, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(FlexibleYear.class), any(ShikibetsuCode.class), any(Decimal.class))).thenReturn(null);

            FlexibleYear 主キー1 = DbT2008ShotokuEntityGenerator.DEFAULT_所得年度;
            ShikibetsuCode 主キー2 = DbT2008ShotokuEntityGenerator.DEFAULT_識別コード;
            Decimal 主キー3 = DbT2008ShotokuEntityGenerator.DEFAULT_履歴番号;
            Shotoku result = sut.get介護所得(主キー1, 主キー2, 主キー3);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            when(dac.selectByKey(any(FlexibleYear.class), any(ShikibetsuCode.class), any(Decimal.class))).thenReturn(entity);

            FlexibleYear 主キー1 = DbT2008ShotokuEntityGenerator.DEFAULT_所得年度;
            ShikibetsuCode 主キー2 = DbT2008ShotokuEntityGenerator.DEFAULT_識別コード;
            Decimal 主キー3 = DbT2008ShotokuEntityGenerator.DEFAULT_履歴番号;
            Shotoku result = sut.get介護所得(主キー1, 主キー2, 主キー3);

            assertThat(result.get所得年度().toDateString(), is(DbT2008ShotokuEntityGenerator.DEFAULT_所得年度.toDateString()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get介護所得一覧 extends DbzTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<Shotoku> result = sut.get介護所得一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT2008ShotokuEntity> entityList = Arrays.asList(DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<Shotoku> result = sut.get介護所得一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get所得年度().toDateString(), is(DbT2008ShotokuEntityGenerator.DEFAULT_所得年度.toDateString()));
        }
    }

    public static class save介護所得 extends DbzTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(1);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            Shotoku 介護所得 = new Shotoku(entity);

            assertThat(sut.save介護所得(介護所得), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(0);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            Shotoku 介護所得 = new Shotoku(entity);

            assertThat(sut.save介護所得(介護所得), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(1);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            entity.initializeMd5();
            Shotoku 介護所得 = new Shotoku(entity);
            介護所得 = 介護所得.createBuilderForEdit().set合計所得金額(new Decimal(10000)).build();

            assertThat(sut.save介護所得(介護所得), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(0);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            entity.initializeMd5();
            Shotoku 介護所得 = new Shotoku(entity);
            介護所得 = 介護所得.createBuilderForEdit().set合計所得金額(new Decimal(10000)).build();

            assertThat(sut.save介護所得(介護所得), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(1);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            entity.initializeMd5();
            Shotoku 介護所得 = new Shotoku(entity);
            介護所得 = 介護所得.deleted();

            assertThat(sut.save介護所得(介護所得), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT2008ShotokuEntity.class))).thenReturn(0);

            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            entity.initializeMd5();
            Shotoku 介護所得 = new Shotoku(entity);
            介護所得 = 介護所得.deleted();

            assertThat(sut.save介護所得(介護所得), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT2008ShotokuEntity entity = DbT2008ShotokuEntityGenerator.createDbT2008ShotokuEntity();
            entity.initializeMd5();
            Shotoku 介護所得 = new Shotoku(entity);

            assertThat(sut.save介護所得(介護所得), is(false));
        }
    }
}