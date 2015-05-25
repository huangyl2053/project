/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.realservice;

import jp.co.ndensan.reams.db.dbd.business.HokenshaShinseiRirekiJoho;
import jp.co.ndensan.reams.db.dbd.business.IShinseiRirekiJoho;
import jp.co.ndensan.reams.db.dbd.entity.basic.DbT4121ShinseiRirekiJohoEntity;
import jp.co.ndensan.reams.db.dbd.entity.basic.helper.DbT4121ShinseiRirekiJohoEntityGenerator;
import jp.co.ndensan.reams.db.dbd.persistence.basic.DbT4121ShinseiRirekiJohoDac;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbdTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * {link HokenshaShinseiRirekiManager}のテストクラスです。
 *
 * @author n8223　朴義一
 */
@RunWith(Enclosed.class)
public class HokenshaShinseiRirekiManagerTest extends DbdTestBase {

    //   private static final ShinseishoKanriNo 申請管理番号 = DbT4121ShinseiRirekiJohoEntityGenerator.DEFAULT_申請管理番号;
    private static final ShinseishoKanriNo 申請管理番号 = new ShinseishoKanriNo("12345678901234567");
    private static final ShinseishoKanriNo notFound申請管理番号 = new ShinseishoKanriNo("92345678901234567");

    public HokenshaShinseiRirekiManagerTest() {
    }

    /**
     * Test of find申請履歴情報 method, of class HokenshaShinseiRirekiManager.
     */
    public static class testFind申請履歴情報 extends DbdTestBase {

        private HokenshaShinseiRirekiManager sut;
        private DbT4121ShinseiRirekiJohoDac dac;

        @Before
        public void setUp() {
            dac = mock(DbT4121ShinseiRirekiJohoDac.class);
            sut = new HokenshaShinseiRirekiManager(dac);
        }

        private static IShinseiRirekiJoho createBusiness(ShinseishoKanriNo 申請管理番号) {
            IShinseiRirekiJoho business = mock(IShinseiRirekiJoho.class);
            when(business.get申請管理番号()).thenReturn(申請管理番号);
            return business;
        }

        @Test
        public void testFind申請履歴情報は_該当の情報がないとき_Optionalのemptyを返す() {
            Optional<DbT4121ShinseiRirekiJohoEntity> entity = Optional.empty();
            Optional<IShinseiRirekiJoho> business = Optional.empty();

            when(dac.selectByKey(notFound申請管理番号)).thenReturn(entity);
            Optional<IShinseiRirekiJoho> result = sut.find申請履歴情報(notFound申請管理番号);
            assertThat(result, is(business));

        }

        @Test
        public void testFind申請履歴情報は_該当の情報があるとき_該当情報を返す() {
            ShinseishoKanriNo DEFAULT_申請管理番号 = new ShinseishoKanriNo("12345678901234567");
            IShinseiRirekiJoho business = createBusiness(DEFAULT_申請管理番号);

            Optional<DbT4121ShinseiRirekiJohoEntity> entity = Optional.ofNullable(DbT4121ShinseiRirekiJohoEntityGenerator.createDbT4121ShinseiRirekiJohoEntity());

            when(dac.selectByKey(申請管理番号)).thenReturn(entity);
            Optional<IShinseiRirekiJoho> result = sut.find申請履歴情報(申請管理番号);
            assertThat(result.get().get申請管理番号().value(), is(business.get申請管理番号().value()));

        }

    }

}
