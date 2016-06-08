/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7117SogoJigyoKubunShikyuGendoGakuEntityGenerator;
import static jp.co.ndensan.reams.db.dbx.testhelper.matcher.IsSerializable.serializable;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link SogoJigyoKubunShikyuGendoGakuIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class SogoJigyoKubunShikyuGendoGakuIdentifierTest extends DbcTestBase {

//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static RString 主キー名1;
    private static FlexibleYearMonth 主キー名2;
    private static int 主キー名3;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT7117SogoJigyoKubunShikyuGendoGakuEntityGenerator.DEFAULT_要介護状態区分;
        主キー名2 = DbT7117SogoJigyoKubunShikyuGendoGakuEntityGenerator.DEFAULT_適用開始年月;
        主キー名3 = DbT7117SogoJigyoKubunShikyuGendoGakuEntityGenerator.DEFAULT_履歴番号;
    }

    public static class シリアライズテスト extends DbcTestBase {

        @Test
        public void シリアライズできる() {
            SogoJigyoKubunShikyuGendoGakuIdentifier sut = new SogoJigyoKubunShikyuGendoGakuIdentifier(主キー名1, 主キー名2, 主キー名3);
            assertThat(sut, is(serializable()));
        }
    }
}
