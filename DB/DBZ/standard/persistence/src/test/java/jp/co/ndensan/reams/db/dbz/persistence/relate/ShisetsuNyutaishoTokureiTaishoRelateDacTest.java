/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.relate;

import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.DaichoType;
import jp.co.ndensan.reams.db.dbz.definition.util.itemlist.IItemList;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShoriTimestamp;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT1004ShisetsuNyutaishoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT1005KaigoJogaiTokureiTaishoShisetsuEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT1004ShisetsuNyutaishoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT1005KaigoJogaiTokureiTaishoShisetsuEntityGenerator;
import jp.co.ndensan.reams.db.dbz.model.kaigojogaitokureitaishoshisetsu.KaigoJogaiTokureiTaishoShisetsuModel;
import jp.co.ndensan.reams.db.dbz.model.relate.ShisetsuNyutaishoRelateModel;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT1004ShisetsuNyutaishoDac;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT1005KaigoJogaiTokureiTaishoShisetsuDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link ShisetsuNyutaishoTokureiTaishoRelateDac}のテストクラスです。
 *
 * @author n8223　朴義一
 */
@RunWith(Enclosed.class)
public class ShisetsuNyutaishoTokureiTaishoRelateDacTest extends DbzTestDacBase {

    private static ShisetsuNyutaishoDac sut1;
    private static KaigoJogaiTokureiTaishoShisetsuDac sut2;
    private static DbT1004ShisetsuNyutaishoDac 介護保険施設入退所Dac;
    private static DbT1005KaigoJogaiTokureiTaishoShisetsuDac 介護除外住所地特例対象施設Dac;

    private static final LasdecCode 市町村コード = new LasdecCode("202016");
    private static final ShikibetsuCode 識別コード = new ShikibetsuCode("000001234567892");
    private static final RString 事業者種別 = new RString("1");
    private static final RString 事業者番号 = new RString("2");
    private static final FlexibleDate 有効開始年月日 = new FlexibleDate("20140405");

    public ShisetsuNyutaishoTokureiTaishoRelateDacTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        sut1 = InstanceProvider.create(ShisetsuNyutaishoDac.class);
        介護保険施設入退所Dac = InstanceProvider.create(DbT1004ShisetsuNyutaishoDac.class);

        sut2 = InstanceProvider.create(KaigoJogaiTokureiTaishoShisetsuDac.class);
        介護除外住所地特例対象施設Dac = InstanceProvider.create(DbT1005KaigoJogaiTokureiTaishoShisetsuDac.class);

    }

    public static class 介護保険施設入退所一覧By主キーTest extends DbzTestDacBase {

        @Before
        public void setup() {
            TestSupport.insertDbT1004(市町村コード, 識別コード);
        }

        /**
         * Test of select介護保険施設入退所一覧By主キー method, of class
         * ShisetsuNyutaishoTokureiTaishoRelateDac.
         */
        @Test
        public void testSelect介護保険施設入退所一覧By主キー1() {

            IItemList<ShisetsuNyutaishoRelateModel> modelList = sut1.select介護保険施設入退所一覧By識別コード(識別コード);
            assertThat(modelList.toList().get(0).get介護保険施設入退所モデル().get識別コード(), is(識別コード));

        }
    }

    public static class 介護除外住所地特例対象施設ByKey1Test extends DbzTestDacBase {

        @Before
        public void setup() {
            TestSupport.insertDbT1005(事業者種別, 事業者番号, 有効開始年月日);
        }

        /**
         * Test of select介護保険施設入退所一覧By識別コード method, of class
         * ShisetsuNyutaishoTokureiTaishoRelateDac.
         */
        @Test
        public void testSelect介護除外住所地特例対象施設ByKey() {

            Optional<KaigoJogaiTokureiTaishoShisetsuModel> model = sut2.select介護除外住所地特例対象施設ByKey(事業者種別, 事業者番号, 有効開始年月日);
            assertThat(model.get().get事業者種別(), is(事業者種別));

        }

    }

    public static class select台帳別施設入退所一覧 extends DbzTestDacBase {

        private final DaichoType type1 = DaichoType.被保険者;
        private final DaichoType type2 = DaichoType.適用除外者;
        private final ShoriTimestamp shoriTimestamp = ShoriTimestamp.of(new YMDHMS("20140101000000"));

        @Before
        public void setup() {
            TestSupport.insertDbT1004(市町村コード, 識別コード, type1, shoriTimestamp.getColumnValue());
            TestSupport.insertDbT1004(市町村コード, 識別コード, type1, shoriTimestamp.plusSeconds(1).getColumnValue());
            TestSupport.insertDbT1004(市町村コード, 識別コード, type2, shoriTimestamp.plusSeconds(2).getColumnValue());
            TestSupport.insertDbT1004(市町村コード, 識別コード, type2, shoriTimestamp.plusSeconds(3).getColumnValue());
            TestSupport.insertDbT1004(市町村コード, 識別コード, type2, shoriTimestamp.plusSeconds(4).getColumnValue());
        }

        @Test
        public void 台帳種別にtype1を指定したとき_2件のListが返る() {

            IItemList<ShisetsuNyutaishoRelateModel> result = sut1.select台帳別施設入退所一覧(識別コード, type1);
            assertThat(result.size(), is(2));

        }

        @Test
        public void 台帳種別にtype2を指定したとき_3件のListが返る() {

            IItemList<ShisetsuNyutaishoRelateModel> result = sut1.select台帳別施設入退所一覧(識別コード, type2);
            assertThat(result.size(), is(3));

        }
    }

    private static class TestSupport {

        public static void insertDbT1004(
                LasdecCode 市町村コード,
                ShikibetsuCode 識別コード) {
            DbT1004ShisetsuNyutaishoEntity entity = DbT1004ShisetsuNyutaishoEntityGenerator.createDbT1004ShisetsuNyutaishoEntity();
            entity.setShichosonCode(市町村コード);
            entity.setShikibetsuCode(識別コード);
            介護保険施設入退所Dac.insert(entity);
        }

        public static void insertDbT1004(LasdecCode 市町村コード, ShikibetsuCode 識別コード, DaichoType 台帳種別, YMDHMS shoriTimestamp) {
            DbT1004ShisetsuNyutaishoEntity entity = DbT1004ShisetsuNyutaishoEntityGenerator.createDbT1004ShisetsuNyutaishoEntity();
            entity.setShichosonCode(市町村コード);
            entity.setShikibetsuCode(識別コード);
            entity.setDaichoShubetsu(台帳種別.getCode());
            entity.setShoriTimestamp(shoriTimestamp);
            介護保険施設入退所Dac.insert(entity);
        }

        public static void insertDbT1005(
                RString 事業者種別,
                RString 事業者番号,
                FlexibleDate 有効開始年月日) {
            DbT1005KaigoJogaiTokureiTaishoShisetsuEntity entity = DbT1005KaigoJogaiTokureiTaishoShisetsuEntityGenerator.createDbT1005KaigoJogaiTokureiTaishoShisetsuEntity();
            entity.setJigyoshaShubetsu(事業者種別);
            entity.setJigyoshaNo(事業者番号);
            entity.setYukoKaishiYMD(有効開始年月日);
            介護除外住所地特例対象施設Dac.insert(entity);
        }

    }
}