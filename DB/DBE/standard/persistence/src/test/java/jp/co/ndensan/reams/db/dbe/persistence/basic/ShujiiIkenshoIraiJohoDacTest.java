/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5011ShujiiIkenshoIraiJohoEntity;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.SystemException;
import jp.co.ndensan.reams.uz.uza.testhelper.TestDacBase;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceCreator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * 主治医意見書作成依頼情報のデータアクセスクラスのテストクラスです。
 *
 * @author N8156 宮本 康
 */
@RunWith(Enclosed.class)
public class ShujiiIkenshoIraiJohoDacTest extends TestDacBase {

    private static IShujiiIkenshoIraiJohoDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceCreator.create(IShujiiIkenshoIraiJohoDac.class);
    }

    public static class select extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が存在しない時_selectは_NULLを返す() {
            assertThat(sut.select(createKanriNo("SKN9999999"), 99), nullValue());
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が存在する時_selectは_該当の情報を返す() {
            assertThat(sut.select(createKanriNo("SKN0000002"), 1).getShinseishoKanriNo(), is(createKanriNo("SKN0000002")));
        }
    }

    public static class selectBy申請書管理番号 extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が0件の時_selectBy申請書管理番号は_EMPTYを返す() {
            assertThat(sut.selectBy申請書管理番号(createKanriNo("SKN9999999")), is(Collections.EMPTY_LIST));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が1件の時_selectBy申請書管理番号は_1件の情報を返す() {
            assertThat(sut.selectBy申請書管理番号(createKanriNo("SKN0000001")).size(), is(1));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が2件の時_selectBy申請書管理番号は_2件の情報を返す() {
            assertThat(sut.selectBy申請書管理番号(createKanriNo("SKN0000002")).size(), is(2));
        }
    }

    public static class selectBy依頼年月日 extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が0件の時_selectBy依頼年月日は_EMPTYを返す() {
            assertThat(sut.selectBy依頼年月日(new FlexibleDate("20141231")), is(Collections.EMPTY_LIST));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が1件の時_selectBy依頼年月日は_1件の情報を返す() {
            assertThat(sut.selectBy依頼年月日(new FlexibleDate("20140101")).size(), is(1));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が2件の時_selectBy依頼年月日は_2件の情報を返す() {
            assertThat(sut.selectBy依頼年月日(new FlexibleDate("20140202")).size(), is(2));
        }
    }

    public static class selectBy主治医情報 extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が0件の時_selectBy主治医情報は_EMPTYを返す() {
            assertThat(sut.selectBy主治医情報(new RString("SIKC999999"), new RString("ISN99999")), is(Collections.EMPTY_LIST));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が1件の時_selectBy主治医情報は_1件の情報を返す() {
            assertThat(sut.selectBy主治医情報(new RString("SIKC000011"), new RString("ISN01101")).size(), is(1));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が2件の時_selectBy主治医情報は_2件の情報を返す() {
            assertThat(sut.selectBy主治医情報(new RString("SIKC000022"), new RString("ISN02202")).size(), is(2));
        }
    }

    public static class selectBy督促年月日 extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が0件の時_selectBy督促年月日は_EMPTYを返す() {
            assertThat(sut.selectBy督促年月日(new FlexibleDate("20141231")), is(Collections.EMPTY_LIST));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が1件の時_selectBy督促年月日は_1件の情報を返す() {
            assertThat(sut.selectBy督促年月日(new FlexibleDate("20140404")).size(), is(1));
        }

        @Test
        public void 該当の主治医意見書作成依頼情報が2件の時_selectBy督促年月日は_2件の情報を返す() {
            assertThat(sut.selectBy督促年月日(new FlexibleDate("20140505")).size(), is(2));
        }
    }

    public static class insertOrUpdate extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在しない時_insertOrUpdateは_指定した情報を追加する() {
            sut.insertOrUpdate(createEntity("SKN0000003", 3, "20140303", "SIKC000033", "ISN03303", "20140606"));
            assertThat(sut.select(createKanriNo("SKN0000003"), 3).getShinseishoKanriNo(), is(createKanriNo("SKN0000003")));
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在する時_insertOrUpdateは_該当の情報を更新する() {
            sut.insertOrUpdate(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20141231"));
            assertThat(sut.select(createKanriNo("SKN0000001"), 0).getIkenshoSakuseiTokusokuYMD(), is(new FlexibleDate("20141231")));
        }
    }

    public static class insert extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在しない時_insertは_成功する() {
            assertThat(sut.insert(createEntity("SKN0000003", 3, "20140303", "SIKC000033", "ISN03303", "20140606")), is(1));
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在しない時_insertは_指定した情報を追加する() {
            sut.insert(createEntity("SKN0000003", 3, "20140303", "SIKC000033", "ISN03303", "20140606"));
            assertThat(sut.select(createKanriNo("SKN0000003"), 3).getShinseishoKanriNo(), is(createKanriNo("SKN0000003")));
        }

        @Test(expected = SystemException.class)
        public void 指定した主治医意見書作成依頼情報が存在する時_insertは_失敗する() {
            sut.insert(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20140404"));
        }
    }

    public static class update extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在する時_updateは_成功する() {
            assertThat(sut.update(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20141231")), is(1));
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在する時_updateは_該当の情報を更新する() {
            sut.update(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20141231"));
            assertThat(sut.select(createKanriNo("SKN0000001"), 0).getIkenshoSakuseiTokusokuYMD(), is(new FlexibleDate("20141231")));
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在しない時_updateは_失敗する() {
            assertThat(sut.update(createEntity("SKN0000003", 3, "20140303", "SIKC000033", "ISN03303", "20141231")), is(0));
        }
    }

    public static class delete extends TestDacBase {

        static {
            setGyomuCD("DB");
        }

        @Override
        public void setUp() {
            setUpEntity();
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在する時_deleteは_成功する() {
            assertThat(sut.delete(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20140404")), is(1));
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在する時_deleteは_該当の情報を削除する() {
            sut.delete(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20140404"));
            assertThat(sut.select(createKanriNo("SKN0000001"), 0), nullValue());
        }

        @Test
        public void 指定した主治医意見書作成依頼情報が存在しない時_deleteは_失敗する() {
            assertThat(sut.delete(createEntity("SKN0000003", 3, "20140303", "SIKC000033", "ISN03303", "20140606")), is(0));
        }
    }

    private static void setUpEntity() {
        sut.insert(createEntity("SKN0000001", 0, "20140101", "SIKC000011", "ISN01101", "20140404"));
        sut.insert(createEntity("SKN0000002", 0, "20140202", "SIKC000022", "ISN02202", "20140505"));
        sut.insert(createEntity("SKN0000002", 1, "20140202", "SIKC000022", "ISN02202", "20140505"));
    }

    private static DbT5011ShujiiIkenshoIraiJohoEntity createEntity(String 申請書管理番号, int 意見書依頼履歴番号, String 意見書作成依頼年月日, String 主治医医療機関コード, String 医師識別番号, String 意見書作成督促年月日) {
        DbT5011ShujiiIkenshoIraiJohoEntity entity = new DbT5011ShujiiIkenshoIraiJohoEntity();
        entity.setShinseishoKanriNo(createKanriNo(申請書管理番号));
        entity.setIkenshoIraiRirekiNo(意見書依頼履歴番号);
        entity.setShujiiIryoKikanCode(new RString(主治医医療機関コード));
        entity.setIshiShikibetsuNo(new RString(医師識別番号));
        entity.setIkenshoIraiKubun(new RString("1"));
        entity.setIkenshoIraiKaisu(1);
        entity.setIshiKubunCode(new Code(new RString("2")));
        entity.setIkenshoSakuseiIraiYMD(new FlexibleDate(意見書作成依頼年月日));
        entity.setIkenshoSakuseiKigenYMD(FlexibleDate.MAX);
        entity.setIkenshoShutsuryokuYMD(FlexibleDate.MIN);
        entity.setSeikyushoShutsuryokuYMD(FlexibleDate.MAX);
        entity.setSakuseiryoSeikyuKubun(new Code(new RString("12")));
        entity.setIkenshoSakuseiTokusokuYMD(new FlexibleDate(意見書作成督促年月日));
        entity.setIkenshoSakuseiTokusokuHoho(new RString("3"));
        entity.setIkenshoTokusokuKaisu(2);
        entity.setIkenshoTokusokuMemo(new RString("意見書作成督促メモ"));
        return entity;
    }

    private static ShinseishoKanriNo createKanriNo(String no) {
        return new ShinseishoKanriNo(new RString(no));
    }
}
