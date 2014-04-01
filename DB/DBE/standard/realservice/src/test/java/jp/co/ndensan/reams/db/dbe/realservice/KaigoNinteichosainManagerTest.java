/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ChosainJokyo;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.KaigoNinteichosainNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoJigyoshaNo;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7010NinteichosaItakusakiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT7013ChosainJohoEntity;
import jp.co.ndensan.reams.db.dbe.persistence.INinteichosaItakusakiDac;
import jp.co.ndensan.reams.db.dbe.persistence.basic.IKaigoNinteichosainDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.testhelper.TestBase;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;
import static jp.co.ndensan.reams.db.dbe.realservice.helper.KaigoNinteichosainTestHelper.*;
import jp.co.ndensan.reams.db.dbe.realservice.helper.MockNinteichosaItakusakiJohoEntity;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 介護認定調査員情報を扱うクラスのテストです。
 *
 * @author N8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class KaigoNinteichosainManagerTest extends TestBase {

    private static KaigoNinteichosainManager sut;
    private static ShoKisaiHokenshaNo 証記載保険者番号;
    private static KaigoJigyoshaNo 介護事業者番号;
    private static KaigoNinteichosainNo 介護調査員番号;
    private static ChosainJokyo 調査員の状況;

    public static class get介護認定調査員_引数が_証記載保険者番号_介護事業者番号_介護調査員番号 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            介護調査員番号 = new KaigoNinteichosainNo(new RString("003"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_証記載保険者番号に000001を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号).get証記載保険者番号().getValue(), is(証記載保険者番号.getValue()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護事業者番号に002を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号).get介護事業者番号().value(), is(介護事業者番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護調査員番号に003を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号).get介護調査員番号().value(), is(介護調査員番号.value()));
        }
    }

    public static class get介護認定調査員_引数が_証記載保険者番号_介護事業者番号_介護調査員番号_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            介護調査員番号 = new KaigoNinteichosainNo(new RString("003"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_証記載保険者番号に000001を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況).get証記載保険者番号().getValue(), is(証記載保険者番号.getValue()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護事業者番号に002を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護事業者番号().value(), is(介護事業者番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_介護調査員番号に003を持つ認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護調査員番号().value(), is(介護調査員番号.value()));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されているとき_調査員の状況が有効の認定調査員情報が返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況).get介護調査員番号().value(), is(介護調査員番号.value()));
        }
    }

    public static class get介護認定調査員List_引数が_証記載保険者番号_介護事業者番号 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(0), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(1), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(3), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_証記載保険者番号_介護事業者番号_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
            介護事業者番号 = new KaigoJigyoshaNo(new RString("002"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(0), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号, 調査員の状況).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(1), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号, 調査員の状況).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(3), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 介護事業者番号, 調査員の状況).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_証記載保険者番号_調査員の状況 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
            調査員の状況 = ChosainJokyo.有効;
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(0), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 調査員の状況).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(1), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 調査員の状況).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(3), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号, 調査員の状況).size(), is(3));
        }
    }

    public static class get介護認定調査員List_引数が_証記載保険者番号 extends TestBase {

        @Override
        protected void setUp() {
            証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("000001"));
        }

        @Test
        public void 引数に該当する介護認定調査員が登録されていないとき_0件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(0), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号).isEmpty(), is(true));
        }

        @Test
        public void 引数に該当する介護認定調査員が1件登録されているとき_1件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(1), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号).size(), is(1));
        }

        @Test
        public void 引数に該当する介護認定調査員が3件登録されているとき_3件の認定調査員情報Listが返る() {
            sut = new KaigoNinteichosainManager(createMockChosainDac(3), createMockItakusakiDac());
            assertThat(sut.get介護認定調査員List(証記載保険者番号).size(), is(3));
        }
    }

    public static class save extends TestBase {

        @Test
        public void saveに成功した場合_trueを返す() {
            sut = new KaigoNinteichosainManager(createMockSaveDac(1), createMockItakusakiDac());
            assertThat(sut.save(create認定調査員()), is(true));
        }

        @Test
        public void saveに失敗した場合_falseを返す() {
            sut = new KaigoNinteichosainManager(createMockSaveDac(0), createMockItakusakiDac());
            assertThat(sut.save(create認定調査員()), is(false));
        }

        private IKaigoNinteichosainDac createMockSaveDac(int 件数) {
            IKaigoNinteichosainDac dac = mock(IKaigoNinteichosainDac.class);
            when(dac.insertOrUpdate(any(DbT7013ChosainJohoEntity.class))).thenReturn(件数);
            return dac;
        }
    }

    public static class remove extends TestBase {

        @Test
        public void removeに成功した場合_trueを返す() {
            sut = new KaigoNinteichosainManager(createMockRemoveDac(1), createMockItakusakiDac());
            assertThat(sut.remove(create認定調査員()), is(true));
        }

        @Test
        public void removeに失敗した場合_falseを返す() {
            sut = new KaigoNinteichosainManager(createMockRemoveDac(0), createMockItakusakiDac());
            assertThat(sut.remove(create認定調査員()), is(false));
        }

        private IKaigoNinteichosainDac createMockRemoveDac(int 件数) {
            IKaigoNinteichosainDac dac = mock(IKaigoNinteichosainDac.class);
            when(dac.delete(any(DbT7013ChosainJohoEntity.class))).thenReturn(件数);
            return dac;
        }
    }

    private static IKaigoNinteichosainDac createMockChosainDac() {
        IKaigoNinteichosainDac dac = mock(IKaigoNinteichosainDac.class);
        when(dac.select(証記載保険者番号, 介護事業者番号, 介護調査員番号)).thenReturn(createChosainEntity(証記載保険者番号, 介護事業者番号, 介護調査員番号));
        when(dac.select(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況)).thenReturn(createChosainEntity(証記載保険者番号, 介護事業者番号, 介護調査員番号, 調査員の状況));
        return dac;
    }

    private static DbT7013ChosainJohoEntity createChosainEntity(ShoKisaiHokenshaNo 証記載保険者番号, KaigoJigyoshaNo 介護事業者番号, KaigoNinteichosainNo 介護調査員番号) {
        DbT7013ChosainJohoEntity entity = create認定調査員Entity();
        entity.setShoKisaiHokenshaNo(証記載保険者番号);
        entity.setKaigoJigyoshaNo(介護事業者番号);
        entity.setKaigoChosainNo(介護調査員番号.value());
        return entity;
    }

    private static DbT7013ChosainJohoEntity createChosainEntity(ShoKisaiHokenshaNo 証記載保険者番号, KaigoJigyoshaNo 介護事業者番号, KaigoNinteichosainNo 介護調査員番号, ChosainJokyo 調査員の状況) {
        DbT7013ChosainJohoEntity entity = create認定調査員Entity();
        entity.setShoKisaiHokenshaNo(証記載保険者番号);
        entity.setKaigoJigyoshaNo(介護事業者番号);
        entity.setKaigoChosainNo(介護調査員番号.value());
        entity.setKaigoChosainJokyo(調査員の状況.is有効());
        return entity;
    }

    private static IKaigoNinteichosainDac createMockChosainDac(int 要素数) {
        IKaigoNinteichosainDac dac = mock(IKaigoNinteichosainDac.class);
        when(dac.selectAll(any(ShoKisaiHokenshaNo.class), any(KaigoJigyoshaNo.class))).thenReturn(createChosainEntity(要素数));
        when(dac.selectAll(any(ShoKisaiHokenshaNo.class), any(KaigoJigyoshaNo.class), any(ChosainJokyo.class))).thenReturn(createChosainEntity(要素数));
        when(dac.selectAll(any(ShoKisaiHokenshaNo.class), any(ChosainJokyo.class))).thenReturn(createChosainEntity(要素数));
        when(dac.selectAll(any(ShoKisaiHokenshaNo.class))).thenReturn(createChosainEntity(要素数));
        return dac;
    }

    private static List<DbT7013ChosainJohoEntity> createChosainEntity(int 要素数) {
        List<DbT7013ChosainJohoEntity> list = new ArrayList<>();
        for (int i = 0; i < 要素数; i++) {
            list.add(create認定調査員Entity());
        }
        return list;
    }

    private static INinteichosaItakusakiDac createMockItakusakiDac() {
        INinteichosaItakusakiDac dac = mock(INinteichosaItakusakiDac.class);
        when(dac.select(any(RString.class), any(KaigoJigyoshaNo.class), any(boolean.class))).thenReturn(createItakusakiEntity());
        return dac;
    }

    private static DbT7010NinteichosaItakusakiJohoEntity createItakusakiEntity() {
        DbT7010NinteichosaItakusakiJohoEntity entity = MockNinteichosaItakusakiJohoEntity.getSpiedInstance();
        return entity;
    }
}
