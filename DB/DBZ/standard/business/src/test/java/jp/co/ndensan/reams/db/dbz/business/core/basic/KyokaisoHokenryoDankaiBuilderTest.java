/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.business.core.KyokaisoHokenryoDankai;
import jp.co.ndensan.reams.db.dbz.business.core.KyokaisoHokenryoDankaiBuilder;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT1007KyokaisoHokenryoDankaiEntityGenerator;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.DbT1007KyokaisoHokenryoDankaiEntity;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link KyokaisoHokenryoDankaiBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyokaisoHokenryoDankaiBuilderTest extends DbzTestBase {

    private static DbT1007KyokaisoHokenryoDankaiEntity KyokaisoHokenryoDankaiEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static HihokenshaNo 被保険者番号;
    private static int 履歴番号;
    private static int リンク番号;
    private static FlexibleYearMonth 適用開始年月日;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        被保険者番号 = DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_被保険者番号;
        履歴番号 = DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_履歴番号;
        リンク番号 = DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_リンク番号;
        適用開始年月日 = DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_適用開始年月;
    }

    public static class getterSetterTest extends DbzTestBase {

        private static KyokaisoHokenryoDankaiBuilder sut;
        private static KyokaisoHokenryoDankai business;

        @Before
        public void setUp() {
            KyokaisoHokenryoDankaiEntity = new DbT1007KyokaisoHokenryoDankaiEntity();
            KyokaisoHokenryoDankaiEntity.setHihokenshaNo(被保険者番号);
            KyokaisoHokenryoDankaiEntity.setRirekiNo(履歴番号);
            KyokaisoHokenryoDankaiEntity.setLinkNo(リンク番号);
            KyokaisoHokenryoDankaiEntity.setTekiyoKaishiYM(適用開始年月日);

            business = new KyokaisoHokenryoDankai(KyokaisoHokenryoDankaiEntity);

            sut = business.createBuilderForEdit();
        }

        @Test
        public void 戻り値の適用終了年月は_設定した値と同じ適用終了年月を返す() {
            business = sut.set適用終了年月(DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_適用終了年月).build();
            assertThat(business.get適用終了年月(), is(DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_適用終了年月));
        }

        @Test
        public void 戻り値の保険料納付減額後保険料段階は_設定した値と同じ保険料納付減額後保険料段階を返す() {
            business = sut.set保険料納付減額後保険料段階(DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_保険料納付減額後保険料段階).build();
            assertThat(business.get保険料納付減額後保険料段階(), is(DbT1007KyokaisoHokenryoDankaiEntityGenerator.DEFAULT_保険料納付減額後保険料段階));
        }

    }
}
