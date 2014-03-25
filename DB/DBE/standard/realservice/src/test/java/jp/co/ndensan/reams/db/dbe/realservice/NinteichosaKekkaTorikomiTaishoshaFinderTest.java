/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice;

import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.NinteichosaKekkaTorikomiTaishosha;
import jp.co.ndensan.reams.db.dbe.persistence.basic.INinteiChosaIraiJohoDac;
import jp.co.ndensan.reams.db.dbe.persistence.relate.INinteichosaKekkaTorikomiTaishoshaDac;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import static org.mockito.Mockito.*;

/**
 * 認定調査結果取込対象者を扱うクラスのテストです。
 *
 * @author N8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class NinteichosaKekkaTorikomiTaishoshaFinderTest extends DbeTestBase {

    private static NinteichosaKekkaTorikomiTaishoshaFinder sut;
    private static INinteiChosaIraiJohoDac chosaIraiJohoDac;
    private static INinteichosaKekkaTorikomiTaishoshaDac torikomiTaishoshaDac;
    private static ShichosonCode 市町村コード = new ShichosonCode(new RString("123456"));
    private static RString 支所コード = new RString("0001");
    private static List<NinteichosaKekkaTorikomiTaishosha> resultList;

    @BeforeClass
    public static void setUpClass() {
        chosaIraiJohoDac = mock(INinteiChosaIraiJohoDac.class);
        torikomiTaishoshaDac = mock(INinteichosaKekkaTorikomiTaishoshaDac.class);

    }

    public static class get認定調査結果取込対象者全件 extends DbeTestBase {

        @Test
        public void 認定調査結果取込対象者の取得条件に一致するデータが登録されていないとき_COLLECTIONS_EMPTYを返す() {
            when(torikomiTaishoshaDac.selectAll()).thenReturn(Collections.EMPTY_LIST);
            sut = new NinteichosaKekkaTorikomiTaishoshaFinder(chosaIraiJohoDac, torikomiTaishoshaDac);
            resultList = sut.get認定調査結果取込対象者全件();
            assertThat(resultList, is(Collections.EMPTY_LIST));
        }
    }

    public static class get認定調査結果取込対象者全件_市町村コード extends DbeTestBase {

        @Test
        public void 認定調査結果取込対象者の取得条件に一致するデータが登録されていないとき_COLLECTIONS_EMPTYを返す() {
            when(torikomiTaishoshaDac.select市町村コード(市町村コード)).thenReturn(Collections.EMPTY_LIST);
            sut = new NinteichosaKekkaTorikomiTaishoshaFinder(chosaIraiJohoDac, torikomiTaishoshaDac);
            resultList = sut.get認定調査結果取込対象者全件(市町村コード);
            assertThat(resultList, is(Collections.EMPTY_LIST));
        }
    }

    public static class get認定調査結果取込対象者全件_支所コード extends DbeTestBase {

        @Test
        public void 認定調査結果取込対象者の取得条件に一致するデータが登録されていないとき_COLLECTIONS_EMPTYを返す() {
            when(torikomiTaishoshaDac.select支所コード(支所コード)).thenReturn(Collections.EMPTY_LIST);
            sut = new NinteichosaKekkaTorikomiTaishoshaFinder(chosaIraiJohoDac, torikomiTaishoshaDac);
            resultList = sut.get認定調査結果取込対象者全件(支所コード);
            assertThat(resultList, is(Collections.EMPTY_LIST));
        }
    }

    public static class get認定調査結果取込対象者全件_市町村コード_支所コード extends DbeTestBase {

        @Test
        public void 認定調査結果取込対象者の取得条件に一致するデータが登録されていないとき_COLLECTIONS_EMPTYを返す() {
            when(torikomiTaishoshaDac.select市町村コード及び支所コード(市町村コード, 支所コード)).thenReturn(Collections.EMPTY_LIST);
            sut = new NinteichosaKekkaTorikomiTaishoshaFinder(chosaIraiJohoDac, torikomiTaishoshaDac);
            resultList = sut.get認定調査結果取込対象者全件(市町村コード, 支所コード);
            assertThat(resultList, is(Collections.EMPTY_LIST));
        }
    }
}
