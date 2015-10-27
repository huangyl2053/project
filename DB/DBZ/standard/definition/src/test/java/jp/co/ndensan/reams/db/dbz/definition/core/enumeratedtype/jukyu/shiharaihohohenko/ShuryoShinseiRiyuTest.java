/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.enumeratedtype.jukyu.shiharaihohohenko;

import jp.co.ndensan.reams.db.dbz.definition.core.enumeratedtype.jukyu.shiharaihohohenko.ShuryoShinseiRiyu;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link ShuryoShinseiRiyu}のテストです。
 *
 * @author N3327 三浦 凌
 */
@RunWith(Enclosed.class)
public class ShuryoShinseiRiyuTest {

    public ShuryoShinseiRiyuTest() {
    }

    public static class toRString extends DbzTestBase {

        @Test
        public void toRStringは_nameをRStringへ変換した物を返す() {
            ShuryoShinseiRiyu sut = ShuryoShinseiRiyu.保険料完納;
            assertThat(sut.toRString(), is(new RString(sut.name())));
        }
    }

    public static class toValue extends DbzTestBase {

        private ShuryoShinseiRiyu sut;

        @Test
        public void toValueは_引数と同じ値のcodeを持つオブジェクトが有る時_そのオブジェクトを返す() {
            ShuryoShinseiRiyu result = sut.toValue(ShuryoShinseiRiyu.滞納保険料の減少.code());
            assertThat(result, is(ShuryoShinseiRiyu.滞納保険料の減少));
        }

        @Test(expected = IllegalArgumentException.class)
        public void toValueは_引数と同じ値のcodeを持つオブジェクトが無い時_IllegalArgumentExceptionをスローする() {
            sut.toValue(null);
        }
    }
}