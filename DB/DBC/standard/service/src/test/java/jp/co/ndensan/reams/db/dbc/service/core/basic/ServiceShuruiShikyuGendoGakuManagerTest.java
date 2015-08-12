/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT7111ServiceShuruiShikyuGendoGakuEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.helper.DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT7111ServiceShuruiShikyuGendoGakuDac;
import jp.co.ndensan.reams.db.dbz.realservice.ServiceShuruiShikyuGendoGakuManager;
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
 * {link ServiceShuruiShikyuGendoGakuManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ServiceShuruiShikyuGendoGakuManagerTest {

    private static DbT7111ServiceShuruiShikyuGendoGakuDac dac;
    private static ServiceShuruiShikyuGendoGakuManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT7111ServiceShuruiShikyuGendoGakuDac.class);
        sut = new ServiceShuruiShikyuGendoGakuManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class getサービス種類支給限度額 extends FdaTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型2 主キー2 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            sut.getサービス種類支給限度額(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            主キー型1 主キー1 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            sut.getサービス種類支給限度額(主キー1, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(null);

            主キー型1 主キー1 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            ServiceShuruiShikyuGendoGaku result = sut.getサービス種類支給限度額(主キー1, 主キー2);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            when(dac.selectByKey(any(主キー型1.class), any(主キー型2.class))).thenReturn(entity);

            主キー型1 主キー1 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー1;
            主キー型2 主キー2 = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー2;
            ServiceShuruiShikyuGendoGaku result = sut.getサービス種類支給限度額(主キー1, 主キー2);

            assertThat(result.get主キー1().value(), is(DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class getサービス種類支給限度額一覧 extends FdaTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<ServiceShuruiShikyuGendoGaku> result = sut.getサービス種類支給限度額一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT7111ServiceShuruiShikyuGendoGakuEntity> entityList = Arrays.asList(DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<ServiceShuruiShikyuGendoGaku> result = sut.getサービス種類支給限度額一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.DEFAULT_主キー1.value()));
        }
    }

    public static class saveサービス種類支給限度額 extends XxxTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            entity.initializeMd5();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);
            サービス種類支給限度額 = サービス種類支給限度額.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            entity.initializeMd5();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);
            サービス種類支給限度額 = サービス種類支給限度額.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(1);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            entity.initializeMd5();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);
            サービス種類支給限度額 = サービス種類支給限度額.deleted();

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT7111ServiceShuruiShikyuGendoGakuEntity.class))).thenReturn(0);

            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            entity.initializeMd5();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);
            サービス種類支給限度額 = サービス種類支給限度額.deleted();

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT7111ServiceShuruiShikyuGendoGakuEntity entity = DbT7111ServiceShuruiShikyuGendoGakuEntityGenerator.createDbT7111ServiceShuruiShikyuGendoGakuEntity();
            entity.initializeMd5();
            ServiceShuruiShikyuGendoGaku サービス種類支給限度額 = new ServiceShuruiShikyuGendoGaku(entity);

            assertThat(sut.saveサービス種類支給限度額(サービス種類支給限度額), is(false));
        }
    }
}