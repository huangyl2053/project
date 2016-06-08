/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3110JigyoKogakuShikyuShinseiEntityGenerator;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.Ignore;

/**
 * {@link JigyoKogakuShikyuShinseiIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
@Ignore
public class JigyoKogakuShikyuShinseiIdentifierTest extends DbcTestBase {

//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static HihokenshaNo 主キー名1;
    private static FlexibleYearMonth 主キー名2;
    private static HokenshaNo 主キー名3;
    private static Decimal 主キー名4;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3110JigyoKogakuShikyuShinseiEntityGenerator.DEFAULT_被保険者番号;
        主キー名2 = DbT3110JigyoKogakuShikyuShinseiEntityGenerator.DEFAULT_サービス提供年月;
        主キー名3 = DbT3110JigyoKogakuShikyuShinseiEntityGenerator.DEFAULT_証記載保険者番号;
        主キー名4 = DbT3110JigyoKogakuShikyuShinseiEntityGenerator.DEFAULT_履歴番号;
    }

    public static class シリアライズテスト extends DbcTestBase {

//        @Test
//        public void シリアライズできる() {
//            JigyoKogakuShikyuShinseiIdentifier sut = new JigyoKogakuShikyuShinseiIdentifier(主キー名1, 主キー名2, 主キー名3, 主キー名4);
//            assertThat(sut, is(serializable()));
//    }
    }
}
