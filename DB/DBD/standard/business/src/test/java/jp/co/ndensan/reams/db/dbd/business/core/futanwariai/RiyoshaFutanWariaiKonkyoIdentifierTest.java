/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.business.core.futanwariai;

import jp.co.ndensan.reams.db.dbd.entity.db.basic.helper.DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import static jp.co.ndensan.reams.uz.uza.testhelper.ByteArraySerializations.canBeCopiedBySerialization;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link RiyoshaFutanWariaiKonkyoIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class RiyoshaFutanWariaiKonkyoIdentifierTest extends DbcTestBase {

//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static FlexibleYear 年度;
    private static HihokenshaNo 被保険者番号;
    private static int 履歴番号;
    private static int 枝番号;
    private static HihokenshaNo 世帯員被保険者番号;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        年度 = DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator.DEFAULT_年度;
        被保険者番号 = DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator.DEFAULT_被保険者番号;
        履歴番号 = DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator.DEFAULT_履歴番号;
        枝番号 = DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator.DEFAULT_枝番号;
        世帯員被保険者番号 = DbT3115RiyoshaFutanWariaiKonkyoEntityGenerator.DEFAULT_世帯員被保険者番号;
    }

    public static class シリアライズテスト extends DbcTestBase {

        @Test
        public void シリアライズできる() {
            RiyoshaFutanWariaiKonkyoIdentifier sut = new RiyoshaFutanWariaiKonkyoIdentifier(年度, 被保険者番号, 履歴番号, 枝番号, 世帯員被保険者番号);
            assertThat(sut, canBeCopiedBySerialization());
        }
    }
}
