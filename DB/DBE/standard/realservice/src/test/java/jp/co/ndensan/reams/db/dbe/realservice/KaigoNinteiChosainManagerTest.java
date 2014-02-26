/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ChosainJokyo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoChosainNo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoJigyoshaNo;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7013ChosainJohoEntity;
import jp.co.ndensan.reams.db.dbe.persistence.basic.IKaigoNinteiChosainDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.testhelper.TestBase;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import static jp.co.ndensan.reams.db.dbe.realservice.helper.KaigoNinteiChosainTestHelper.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 介護認定調査員情報を扱うクラスのテストです。
 *
 * @author N8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class KaigoNinteiChosainManagerTest extends TestBase {

    private static KaigoNinteiChosainManager sut;
    private static ShichosonCode 市町村コード;
    private static KaigoJigyoshaNo 介護事業者番号;
    private static KaigoChosainNo 介護調査員番号;
    private static ChosainJokyo 調査員の状況;

    public static class get介護認定調査員_引数が_市町村コード_介護事業者番号_介護調査員番号 extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            介護調査員番号 = new KaigoChosainNo(new RString("003"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_市町村コードに001を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号).get市町村コード().getValue(), is(市町村コード.getValue()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護事業者番号に002を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号).get介護事業者番号().value(), is(介護事業者番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護調査員番号に003を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号).get介護調査員番号().value(), is(介護調査員番号.value()));
        }
    }

    public static class get介護認定調査員_引数が_市町村コード_介護事業者番号_介護調査員番号_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            介護調査員番号 = new KaigoChosainNo(new RString("003"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_市町村コードに001を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況).get市町村コード().getValue(), is(市町村コード.getValue()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護事業者番号に002を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護事業者番号().value(), is(介護事業者番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護調査員番号に003を持つ認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護調査員番号().value(), is(介護調査員番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_調査員の状況が有効の認定調査員情報が返る() {
            sut = new KaigoNinteiChosainManager(createMockDac());
            assertThat(sut.get介護認定調査員(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護調査員番号().value(), is(介護調査員番号.value()));
        }
    }

    public static class get介護認定調査員List_引数が_市町村コード_介護事業者番号 extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(0));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(1));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(3));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_市町村コード_介護事業者番号_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(0));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号, 調査員の状況).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(1));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号, 調査員の状況).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(3));
            assertThat(sut.get介護認定調査員List(市町村コード, 介護事業者番号, 調査員の状況).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_市町村コード_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(0));
            assertThat(sut.get介護認定調査員List(市町村コード, 調査員の状況).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(1));
            assertThat(sut.get介護認定調査員List(市町村コード, 調査員の状況).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(3));
            assertThat(sut.get介護認定調査員List(市町村コード, 調査員の状況).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_市町村コード extends TestBase {

        @Override
        protected void setUp() {
            市町村コード = new ShichosonCode(new RString("001"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(0));
            assertThat(sut.get介護認定調査員List(市町村コード).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(1));
            assertThat(sut.get介護認定調査員List(市町村コード).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteiChosainManager(createMockDac(3));
            assertThat(sut.get介護認定調査員List(市町村コード).size(), is(3));
        }
    }

    public static class save extends TestBase {

        @Test
        public void saveに成功した場合_trueを返す() {
            sut = new KaigoNinteiChosainManager(createMockSaveDac(1));
            assertThat(sut.save(create認定調査員()), is(true));
        }

        @Test
        public void saveに失敗した場合_falseを返す() {
            sut = new KaigoNinteiChosainManager(createMockSaveDac(0));
            assertThat(sut.save(create認定調査員()), is(false));
        }

        private IKaigoNinteiChosainDac createMockSaveDac(int 件数) {
            IKaigoNinteiChosainDac dac = mock(IKaigoNinteiChosainDac.class);
            when(dac.insertOrUpdate(any(DbT7013ChosainJohoEntity.class))).thenReturn(件数);
            return dac;
        }
    }

    public static class remove extends TestBase {

        @Test
        public void removeに成功した場合_trueを返す() {
            sut = new KaigoNinteiChosainManager(createMockRemoveDac(1));
            assertThat(sut.remove(create認定調査員()), is(true));
        }

        @Test
        public void removeに失敗した場合_falseを返す() {
            sut = new KaigoNinteiChosainManager(createMockRemoveDac(0));
            assertThat(sut.remove(create認定調査員()), is(false));
        }

        private IKaigoNinteiChosainDac createMockRemoveDac(int 件数) {
            IKaigoNinteiChosainDac dac = mock(IKaigoNinteiChosainDac.class);
            when(dac.delete(any(DbT7013ChosainJohoEntity.class))).thenReturn(件数);
            return dac;
        }
    }

    private static IKaigoNinteiChosainDac createMockDac() {
        IKaigoNinteiChosainDac dac = mock(IKaigoNinteiChosainDac.class);
        when(dac.select(市町村コード, 介護事業者番号, 介護調査員番号)).thenReturn(createEntity(市町村コード, 介護事業者番号, 介護調査員番号));
        when(dac.select(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況)).thenReturn(createEntity(市町村コード, 介護事業者番号, 介護調査員番号, 調査員の状況));
        return dac;
    }

    private static DbT7013ChosainJohoEntity createEntity(ShichosonCode 市町村コード, KaigoJigyoshaNo 介護事業者番号, KaigoChosainNo 介護調査員番号) {
        DbT7013ChosainJohoEntity entity = create認定調査員Entity();
        entity.setShichosonCode(市町村コード);
        entity.setKaigoJigyoshaNo(介護事業者番号);
        entity.setKaigoChosainNo(介護調査員番号);
        return entity;
    }

    private static DbT7013ChosainJohoEntity createEntity(ShichosonCode 市町村コード, KaigoJigyoshaNo 介護事業者番号, KaigoChosainNo 介護調査員番号, ChosainJokyo 調査員の状況) {
        DbT7013ChosainJohoEntity entity = create認定調査員Entity();
        entity.setShichosonCode(市町村コード);
        entity.setKaigoJigyoshaNo(介護事業者番号);
        entity.setKaigoChosainNo(介護調査員番号);
        entity.setKaigoChosainJokyo(調査員の状況.is有効());
        return entity;
    }

    private static IKaigoNinteiChosainDac createMockDac(int 要素数) {
        IKaigoNinteiChosainDac dac = mock(IKaigoNinteiChosainDac.class);
        when(dac.selectAll(any(ShichosonCode.class), any(KaigoJigyoshaNo.class))).thenReturn(createEntity(要素数));
        when(dac.selectAll(any(ShichosonCode.class), any(KaigoJigyoshaNo.class), any(ChosainJokyo.class))).thenReturn(createEntity(要素数));
        when(dac.selectAll(any(ShichosonCode.class), any(ChosainJokyo.class))).thenReturn(createEntity(要素数));
        when(dac.selectAll(any(ShichosonCode.class))).thenReturn(createEntity(要素数));
        return dac;
    }

    private static List<DbT7013ChosainJohoEntity> createEntity(int 要素数) {
        List<DbT7013ChosainJohoEntity> list = new ArrayList<>();
        for (int i = 0; i < 要素数; i++) {
            list.add(create認定調査員Entity());
        }
        return list;
    }
}
