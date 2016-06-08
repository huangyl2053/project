/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3025KyufujissekiKyotakuServiceEntityGenerator;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.NyuryokuShikibetsuNo;
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
 * {@link KyufujissekiKyotakuServiceIdentifier}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyufujissekiKyotakuServiceIdentifierTest extends DbcTestBase {

//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static KokanShikibetsuNo 交換情報識別番号;
    private static NyuryokuShikibetsuNo 入力識別番号;
    private static RString レコード種別コード;
    private static HokenshaNo 証記載保険者番号;
    private static HihokenshaNo 被保険者番号;
    private static FlexibleYearMonth サービス提供年月;
    private static JigyoshaNo 事業所番号;
    private static RString 通し番号;
    private static RString サービス計画費明細行番号;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        交換情報識別番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_交換情報識別番号;
        入力識別番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_入力識別番号;
        レコード種別コード = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_レコード種別コード;
        証記載保険者番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_証記載保険者番号;
        被保険者番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_被保険者番号;
        サービス提供年月 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_サービス提供年月;
        事業所番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_事業所番号;
        通し番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_通し番号;
        サービス計画費明細行番号 = DbT3025KyufujissekiKyotakuServiceEntityGenerator.DEFAULT_サービス計画費明細行番号;
    }

    public static class シリアライズテスト extends DbcTestBase {

        @Test
        public void シリアライズできる() {
            KyufujissekiKyotakuServiceIdentifier sut = new KyufujissekiKyotakuServiceIdentifier(
                    交換情報識別番号, 入力識別番号, レコード種別コード, 証記載保険者番号, 被保険者番号,
                    サービス提供年月, 事業所番号, 通し番号, サービス計画費明細行番号);
            assertThat(sut, is(serializable()));
        }
    }
}
