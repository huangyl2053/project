/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.realservice;

import jp.co.ndensan.reams.db.dbz.business.HokenshaShujiiJoho;
import jp.co.ndensan.reams.db.dbz.business.IShujiiJoho;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ninteishinsei.ShujiiIryokikanCode;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbT4912ShujiiJohoEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT4912ShujiiJohoEntityGenerator;
import jp.co.ndensan.reams.db.dbz.persistence.basic.DbT4912ShujiiJohoDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbdTestBase;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.lang.ApplicationException;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * {@link HokenshaShujiiManager}のテストクラスです。
 *
 * @author N8235 船山 洋介
 */
@RunWith(Enclosed.class)
public class HokenshaShujiiManagerTest {

    public static final LasdecCode Found市町村コード = new LasdecCode("100001");
    public static final ShujiiIryokikanCode Found主治医医療機関コード = new ShujiiIryokikanCode("1000000001");
    public static final ShujiiCode Found主治医コード = new ShujiiCode("10000001");

    public static final LasdecCode notFound市町村コード = new LasdecCode("999999");

    private static HokenshaShujiiManager sut;
    private static DbT4912ShujiiJohoDac dac;

    @BeforeClass
    public static void setUp() {
        dac = mock(DbT4912ShujiiJohoDac.class);
        sut = new HokenshaShujiiManager(dac);
    }

    public static class find主治医医療機関 extends DbdTestBase {

        private static IShujiiJoho createBusiness(
                LasdecCode 市町村コード, ShujiiIryokikanCode 主治医医療機関コード, ShujiiCode 主治医コード) {
            IShujiiJoho business = mock(IShujiiJoho.class);
            when(business.get市町村コード()).thenReturn(市町村コード);
            when(business.get主治医医療機関コード()).thenReturn(主治医医療機関コード);
            when(business.get主治医コード()).thenReturn(主治医コード);

            return business;
        }

        @Test
        public void find認定申請情報は_該当の情報がない時_Optionalのemptyを返す() {
            Optional<IShujiiJoho> empty = Optional.empty();
            DbT4912ShujiiJohoEntity entity = DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity();
            when(dac.selectByKey(notFound市町村コード, Found主治医医療機関コード, Found主治医コード)).thenReturn(entity);
            Optional<IShujiiJoho> result = sut.find主治医(notFound市町村コード, Found主治医医療機関コード, Found主治医コード);

            assertThat(result, is(empty));
        }

        @Test
        public void find認定申請情報は_該当の情報がある時_該当情報を返す() {
            when(dac.selectByKey(Found市町村コード, Found主治医医療機関コード, Found主治医コード)).thenReturn(
                    DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity());
            Optional<IShujiiJoho> result = sut.find主治医(Found市町村コード, Found主治医医療機関コード, Found主治医コード);
            assertThat(result.get().get主治医コード(), is(createBusiness(Found市町村コード, Found主治医医療機関コード, Found主治医コード).get主治医コード()));
        }
    }

    public static class save主治医医療機関のテスト extends DbdTestBase {

        @Test
        public void insertに成功すると1が返る() {
            when(dac.save(any(DbT4912ShujiiJohoEntity.class))).thenReturn(1);
            HokenshaShujiiJoho shinsakaiShujiiJoho = new HokenshaShujiiJoho(DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity());

            assertThat(sut.save主治医機関情報(shinsakaiShujiiJoho), is(1));
        }

        @Test
        public void updateに成功すると1が返る() {
            when(dac.save(any(DbT4912ShujiiJohoEntity.class))).thenReturn(1);

            HokenshaShujiiJoho hokenshaShujiiJoho = new HokenshaShujiiJoho(DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity());

            hokenshaShujiiJoho.getEntity().initializeMd5();
            HokenshaShujiiJoho.Builder createBuilderForEdit = hokenshaShujiiJoho.createBuilderForEdit();
            createBuilderForEdit.setJusho(AtenaJusho.EMPTY);
            IShujiiJoho build = createBuilderForEdit.build();

            assertThat(sut.save主治医機関情報(build), is(1));
        }

        @Test
        public void deleteに成功すると1が返る() {
            when(dac.save(any(DbT4912ShujiiJohoEntity.class))).thenReturn(1);

            HokenshaShujiiJoho hokenshaShujiiJoho = new HokenshaShujiiJoho(DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity());
            hokenshaShujiiJoho.getEntity().initializeMd5();
            hokenshaShujiiJoho.setDeletedState(true);

            assertThat(sut.save主治医機関情報(hokenshaShujiiJoho), is(1));
        }

        @Test(expected = ApplicationException.class)
        public void ビジネスクラスの状態がUnchangedの場合_ApplicationExceptionが発生する() {

            HokenshaShujiiJoho hokenshaShujiiJoho = new HokenshaShujiiJoho(DbT4912ShujiiJohoEntityGenerator.createDbT4912ShujiiJohoEntity());
            hokenshaShujiiJoho.getEntity().initializeMd5();

            sut.save主治医機関情報(hokenshaShujiiJoho);
        }
    }

}
