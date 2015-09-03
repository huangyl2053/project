/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3100NijiYoboJigyoTaishoshaEntityGenerator;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HokenshaNo;
import static jp.co.ndensan.reams.db.dbx.testhelper.matcher.IsSerializable.serializable;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link NijiYoboJigyoTaishoshaIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NijiYoboJigyoTaishoshaIdentifierTest extends DbcTestBase {

//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static HokenshaNo 証記載保険者番号;
    private static HihokenshaNo 被保険者番号;
    private static Decimal 履歴番号;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        証記載保険者番号 = DbT3100NijiYoboJigyoTaishoshaEntityGenerator.DEFAULT_証記載保険者番号;
        被保険者番号 = DbT3100NijiYoboJigyoTaishoshaEntityGenerator.DEFAULT_被保険者番号;
        履歴番号 = DbT3100NijiYoboJigyoTaishoshaEntityGenerator.DEFAULT_履歴番号;
    }

    public static class シリアライズテスト extends DbcTestBase {

        @Test
        public void シリアライズできる() {
            NijiYoboJigyoTaishoshaIdentifier sut = new NijiYoboJigyoTaishoshaIdentifier(証記載保険者番号, 被保険者番号, 履歴番号);
            assertThat(sut, is(serializable()));
        }
    }
}
