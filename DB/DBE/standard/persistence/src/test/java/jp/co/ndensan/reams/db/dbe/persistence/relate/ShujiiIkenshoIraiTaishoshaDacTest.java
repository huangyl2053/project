/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.persistence.relate;

import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5001NinteiShinseiJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5005NinteiShinchokuJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.helper.NinteiShinchokuJohoMock;
import jp.co.ndensan.reams.db.dbe.entity.helper.NinteiShinseiJohoTestHelper;
import jp.co.ndensan.reams.db.dbe.persistence.basic.helper.NinteiShinchokuJohoDacMock;
import jp.co.ndensan.reams.db.dbe.persistence.basic.helper.NinteiShinseiJohoDacMock;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestDacBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.testhelper.TestBase;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.BeforeClass;

/**
 * 主治医意見書作成依頼対象者Dacのテストクラスです。
 *
 * @author N8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class ShujiiIkenshoIraiTaishoshaDacTest extends TestBase {

    private static ShujiiIkenshoIraiTaishoshaDac sut;
    private static NinteiShinchokuJohoDacMock ninteiShinchokuJohoDacMock;
    private static NinteiShinseiJohoDacMock ninteiShinseiJohoDacMock;
    private static final FlexibleDate 未完了年月日 = new FlexibleDate("00000000");
    private static final FlexibleDate 完了済年月日 = new FlexibleDate("20140101");
    private static final RString 申請書管理番号0001 = new RString("0001");
    private static final RString 申請書管理番号0002 = new RString("0002");
    private static final ShoKisaiHokenshaNo 証記載保険者番号A00001 = new ShoKisaiHokenshaNo(new RString("A00001"));
    private static final ShoKisaiHokenshaNo 証記載保険者番号A00002 = new ShoKisaiHokenshaNo(new RString("A00002"));
    private static final RString 支所コード0001 = new RString("0001");
    private static final RString 支所コード0002 = new RString("0002");

    enum ChosaShinchoku {

        作成依頼未完了,
        作成依頼完了済
    };

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(ShujiiIkenshoIraiTaishoshaDac.class);
        ninteiShinchokuJohoDacMock = InstanceProvider.create(NinteiShinchokuJohoDacMock.class);
        ninteiShinseiJohoDacMock = InstanceProvider.create(NinteiShinseiJohoDacMock.class);
    }

    public static class selectAll extends DbeTestDacBase {

        @Test
        public void selectAll_対象者がいない場合_対象者0件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.selectAll().size(), is(0));
        }

        @Test
        public void selectAll_対象者が1人の場合_対象者1件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.selectAll().size(), is(1));
        }
    }

    public static class select証記載保険者番号 extends DbeTestDacBase {

        @Test
        public void select証記載保険者番号_対象者がいない場合_対象者0件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号(証記載保険者番号A00001).size(), is(0));
        }

        @Test
        public void select証記載保険者番号_対象者が1人いて_証記載保険者番号に一致しない場合_対象者0件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号(証記載保険者番号A00002).size(), is(0));
        }

        @Test
        public void select証記載保険者番号_対象者が2人いて_証記載保険者番号に1人一致する場合_対象者1件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00002, 支所コード0002));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号(証記載保険者番号A00001).size(), is(1));
        }

        @Test
        public void select証記載保険者番号_対象者が2人いて_証記載保険者番号に2人一致する場合_対象者2件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0002));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号(証記載保険者番号A00001).size(), is(2));
        }
    }

    public static class select証記載保険者番号及び支所コード extends DbeTestDacBase {

        @Test
        public void select証記載保険者番号及び支所コード_対象者がいない場合_対象者0件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号及び支所コード(証記載保険者番号A00001, 支所コード0001).size(), is(0));
        }

        @Test
        public void select証記載保険者番号及び支所コード_対象者が1人いて_証記載保険者番号及び支所コードに一致しない場合_対象者0件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼完了済));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号及び支所コード(証記載保険者番号A00002, 支所コード0002).size(), is(0));
        }

        @Test
        public void select証記載保険者番号及び支所コード__対象者が2人いて_証記載保険者番号及び支所コードに1人一致する場合_対象者1件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00002, 支所コード0002));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号及び支所コード(証記載保険者番号A00001, 支所コード0001).size(), is(1));
        }

        @Test
        public void select証記載保険者番号及び支所コード__対象者が2人いて_証記載保険者番号及び支所コードに2人一致する場合_対象者2件の結果が返る() {
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0001, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0001, 証記載保険者番号A00001, 支所コード0001));
            ninteiShinchokuJohoDacMock.insert(create認定進捗情報Entity(申請書管理番号0002, ChosaShinchoku.作成依頼未完了));
            ninteiShinseiJohoDacMock.insert(create認定申請情報Entity(申請書管理番号0002, 証記載保険者番号A00001, 支所コード0001));
            assertThat(sut.select証記載保険者番号及び支所コード(証記載保険者番号A00001, 支所コード0001).size(), is(2));
        }
    }

    private static DbT5005NinteiShinchokuJohoEntity create認定進捗情報Entity(RString 申請書管理番号, ChosaShinchoku 調査進捗) {
        DbT5005NinteiShinchokuJohoEntity entity = NinteiShinchokuJohoMock.create認定進捗情報Entity();
        entity.setShinseishoKanriNo(new ShinseishoKanriNo(申請書管理番号));
        switch (調査進捗) {
            case 作成依頼未完了:
                entity.setIkenshoSakuseiIraiKanryoYMD(未完了年月日);
                break;
            case 作成依頼完了済:
                entity.setIkenshoSakuseiIraiKanryoYMD(完了済年月日);
                break;
        }
        return entity;
    }

    private static DbT5001NinteiShinseiJohoEntity create認定申請情報Entity(RString 申請書管理番号, ShoKisaiHokenshaNo 証記載保険者番号, RString 支所コード) {
        DbT5001NinteiShinseiJohoEntity entity = NinteiShinseiJohoTestHelper.create認定申請情報Entity();
        entity.setShinseishoKanriNo(new ShinseishoKanriNo(申請書管理番号));
        entity.setShoKisaiHokenshaNo(証記載保険者番号);
        entity.setShishoCode(支所コード);
        return entity;
    }
}