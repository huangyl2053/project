/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChosainJoho;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ChosaItakusakiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ChosainCode;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT5913ChosainJohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT5913ChosainJohoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT5913ChosainJohoDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
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
 * {link ChosainJohoManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ChosainJohoManagerTest {

    private static DbT5913ChosainJohoDac dac;
    private static ChosainJohoManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT5913ChosainJohoDac.class);
        sut = new ChosainJohoManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get調査員情報 extends DbzTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            ChosaItakusakiCode 主キー2 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード;
            ChosainCode 主キー3 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード;
            sut.get調査員情報(null, 主キー2, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            LasdecCode 主キー1 = DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード;
            ChosainCode 主キー3 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード;
            sut.get調査員情報(主キー1, null, 主キー3);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            LasdecCode 主キー1 = DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード;
            ChosaItakusakiCode 主キー2 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード;
            sut.get調査員情報(主キー1, 主キー2, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(LasdecCode.class), any(ChosaItakusakiCode.class), any(ChosainCode.class))).thenReturn(null);
            LasdecCode 主キー1 = DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード;
            ChosaItakusakiCode 主キー2 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード;
            ChosainCode 主キー3 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード;
            ChosainJoho result = sut.get調査員情報(主キー1, 主キー2, 主キー3);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            when(dac.selectByKey(any(LasdecCode.class), any(ChosaItakusakiCode.class), any(ChosainCode.class))).thenReturn(entity);
            LasdecCode 主キー1 = DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード;
            ChosaItakusakiCode 主キー2 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査委託先コード;
            ChosainCode 主キー3 = DbT5913ChosainJohoEntityGenerator.DEFAULT_認定調査員コード;
            ChosainJoho result = sut.get調査員情報(主キー1, 主キー2, 主キー3);

            assertThat(result.get市町村コード().value(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード.value()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get調査員情報一覧 extends DbzTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<ChosainJoho> result = sut.get調査員情報一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT5913ChosainJohoEntity> entityList = Arrays.asList(DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<ChosainJoho> result = sut.get調査員情報一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get市町村コード().value(), is(DbT5913ChosainJohoEntityGenerator.DEFAULT_市町村コード.value()));
        }
    }

    public static class save調査員情報 extends DbzTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(1);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);

            assertThat(sut.save調査員情報(調査員情報), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(0);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);

            assertThat(sut.save調査員情報(調査員情報), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(1);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            entity.initializeMd5();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);
            調査員情報 = 調査員情報.createBuilderForEdit().set調査員氏名(new RString("任意項目1を変更")).build();

            assertThat(sut.save調査員情報(調査員情報), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(0);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            entity.initializeMd5();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);
            調査員情報 = 調査員情報.createBuilderForEdit().set調査員氏名(new RString("任意項目1を変更")).build();

            assertThat(sut.save調査員情報(調査員情報), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(1);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            entity.initializeMd5();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);
            調査員情報 = 調査員情報.deleted();

            assertThat(sut.save調査員情報(調査員情報), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT5913ChosainJohoEntity.class))).thenReturn(0);

            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            entity.initializeMd5();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);
            調査員情報 = 調査員情報.deleted();

            assertThat(sut.save調査員情報(調査員情報), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT5913ChosainJohoEntity entity = DbT5913ChosainJohoEntityGenerator.createDbT5913ChosainJohoEntity();
            entity.initializeMd5();
            ChosainJoho 調査員情報 = new ChosainJoho(entity);

            assertThat(sut.save調査員情報(調査員情報), is(false));
        }
    }
}
