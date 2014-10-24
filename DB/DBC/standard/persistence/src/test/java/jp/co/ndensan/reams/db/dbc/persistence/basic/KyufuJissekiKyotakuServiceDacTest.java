/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.basic;

import java.util.Collections;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3025KyufujissekiKyotakuServiceEntity;
import jp.co.ndensan.reams.db.dbc.entity.helper.DbT3025KyufujissekiKyotakuServiceEntityMock;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.InputShikibetsuNoCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.JigyoshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoHihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KokanShikibetsuNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ToshiNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestDacBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 給付実績サービス計画費のデータアクセスクラスのテストクラスです。
 *
 * @author N8156 宮本 康
 */
@RunWith(Enclosed.class)
public class KyufuJissekiKyotakuServiceDacTest {

    private static IKyufuJissekiKyotakuServiceDac sut;

    private static final KokanShikibetsuNo 交換情報識別番号_データなし = new KokanShikibetsuNo(new RString("9999"));
    private static final KokanShikibetsuNo 交換情報識別番号_データあり = new KokanShikibetsuNo(new RString("1234"));
    private static final InputShikibetsuNoCode 入力識別番号 = new InputShikibetsuNoCode(new Code("0001"));
    private static final ShoKisaiHokenshaNo 証記載保険者番号 = new ShoKisaiHokenshaNo(new RString("00000003"));
    private static final KaigoHihokenshaNo 被保番号 = new KaigoHihokenshaNo(new RString("0000000004"));
    private static final FlexibleYearMonth サービス提供年月 = new FlexibleYearMonth("201401");
    private static final JigyoshaNo 事業所番号 = new JigyoshaNo(new RString("0000000005"));
    private static final ToshiNo 通番 = new ToshiNo(new RString("0000000006"));

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(KyufuJissekiKyotakuServiceDac.class);
    }

    public static class select extends DbcTestDacBase {

        @Test
        public void 該当の給付実績サービス計画費が存在しない時_selectは_EMPTYを返す() {
            assertThat(sut.select(
                    交換情報識別番号_データなし,
                    入力識別番号,
                    証記載保険者番号,
                    被保番号,
                    サービス提供年月,
                    事業所番号,
                    通番), is(Collections.EMPTY_LIST));
        }

        @Test
        public void 該当の給付実績サービス計画費が存在する時_selectは_該当のデータを返す() {
            initializeEntityData();
            assertThat(sut.select(
                    交換情報識別番号_データあり,
                    入力識別番号,
                    証記載保険者番号,
                    被保番号,
                    サービス提供年月,
                    事業所番号,
                    通番).get(0).getKokanJohoShikibetsuNo(), is(交換情報識別番号_データあり));
        }
    }

    private static void initializeEntityData() {
        sut.insert(createEntity());
    }

    private static DbT3025KyufujissekiKyotakuServiceEntity createEntity() {
        return DbT3025KyufujissekiKyotakuServiceEntityMock.createEntity();
    }
}