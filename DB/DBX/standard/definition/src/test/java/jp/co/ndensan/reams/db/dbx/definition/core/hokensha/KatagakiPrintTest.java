/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.definition.core.hokensha;

import jp.co.ndensan.reams.db.dbx.testhelper.DbxTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * KatagakiPrintのテストです。
 */
@RunWith(Enclosed.class)
public class KatagakiPrintTest extends DbxTestBase {

    public KatagakiPrintTest() {
    }

    public static class toValue extends DbxTestBase {

        private KatagakiPrint sut;

        @Test
        public void toValue_は引数のcodeに該当するオブジェクトが存在する時_それを返す() {
            KatagakiPrint item = KatagakiPrint.印字する;
            assertThat(sut.toValue(item.code()), is(item));
        }

        @Test(expected = IllegalArgumentException.class)
        public void toValue_は引数のcodeに該当するオブジェクトが無い時_IllegalArgumentExceptionをスローする() {
            sut.toValue(new RString("99"));
        }
    }
}