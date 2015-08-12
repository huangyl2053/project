/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbu.business.core.basic.JigyoHokokuTokeiData;
import jp.co.ndensan.reams.db.dbu.entity.basic.DbT7021JigyoHokokuTokeiDataEntity;
import jp.co.ndensan.reams.db.dbu.entity.basic.helper.DbT7021JigyoHokokuTokeiDataEntityGenerator;
import jp.co.ndensan.reams.db.dbu.persistence.basic.DbT7021JigyoHokokuTokeiDataDac;
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
 * {link JigyoHokokuTokeiDataManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class JigyoHokokuTokeiDataManagerTest {

    private static DbT7021JigyoHokokuTokeiDataDac dac;
    private static JigyoHokokuTokeiDataManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT7021JigyoHokokuTokeiDataDac.class);
        sut = new JigyoHokokuTokeiDataManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get事業報告統計データ extends FdaTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型2 主キー2 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー2;
            sut.get事業報告統計データ(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型1 主キー1 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー1;
            sut.get事業報告統計データ(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            主キー型1 主キー1 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー2;
            JigyoHokokuTokeiData result = sut.get事業報告統計データ(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            主キー型1 主キー1 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー2;
            JigyoHokokuTokeiData result = sut.get事業報告統計データ(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get事業報告統計データ一覧 extends FdaTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<JigyoHokokuTokeiData> result = sut.get事業報告統計データ一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT7021JigyoHokokuTokeiDataEntity> entityList = Arrays.asList(DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<JigyoHokokuTokeiData> result = sut.get事業報告統計データ一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT7021JigyoHokokuTokeiDataEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class save事業報告統計データ extends XxxTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(1);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(0);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(1);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            entity.initializeMd5();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);
            事業報告統計データ = 事業報告統計データ.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(0);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            entity.initializeMd5();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);
            事業報告統計データ = 事業報告統計データ.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(1);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            entity.initializeMd5();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);
            事業報告統計データ = 事業報告統計データ.deleted();

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT7021JigyoHokokuTokeiDataEntity.class))).thenReturn(0);

            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            entity.initializeMd5();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);
            事業報告統計データ = 事業報告統計データ.deleted();

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT7021JigyoHokokuTokeiDataEntity entity = DbT7021JigyoHokokuTokeiDataEntityGenerator.createDbT7021JigyoHokokuTokeiDataEntity();
            entity.initializeMd5();
            JigyoHokokuTokeiData 事業報告統計データ = new JigyoHokokuTokeiData(entity);

            assertThat(sut.save事業報告統計データ(事業報告統計データ), is(false));
        }
    }
}