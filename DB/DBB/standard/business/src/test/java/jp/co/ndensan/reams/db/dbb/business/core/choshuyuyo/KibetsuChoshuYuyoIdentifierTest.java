/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.core.choshuyuyo;

import jp.co.ndensan.reams.db.dbb.entity.db.basic.helper.DbT2007KibetsuChoshuYuyoEntityGenerator;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbbTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import static jp.co.ndensan.reams.uz.uza.testhelper.ByteArraySerializations.canBeCopiedBySerialization;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link KibetsuChoshuYuyoIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KibetsuChoshuYuyoIdentifierTest extends DbbTestBase {

    private static FlexibleYear 調定年度;
    private static FlexibleYear 賦課年度;
    private static TsuchishoNo 通知書番号;
    private static Decimal 履歴番号;
    private static RString 徴収方法;
    private static int 期;

    @BeforeClass
    public static void setUpClass() {
        調定年度 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_調定年度;
        賦課年度 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_賦課年度;
        通知書番号 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_通知書番号;
        履歴番号 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_履歴番号;
        徴収方法 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_徴収方法;
        期 = DbT2007KibetsuChoshuYuyoEntityGenerator.DEFAULT_期;
    }

    public static class シリアライズテスト extends DbbTestBase {

        @Test
        public void シリアライズできる() {
            KibetsuChoshuYuyoIdentifier sut = new KibetsuChoshuYuyoIdentifier(調定年度, 賦課年度, 通知書番号, 履歴番号, 徴収方法, 期);
            assertThat(sut, is(canBeCopiedBySerialization()));
        }
    }
}
