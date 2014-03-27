/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.valueobject;

import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import org.junit.Test;
import org.junit.Before;

/**
 * 審査会開催地区のテストです。
 *
 * @author n8178 城間篤人
 */
public class ShinsakaiKaisaiChikuTest {

    private static ShinsakaiKaisaiChiku sut;

    public static class コンストラクタ_コードを表す文字列と名称を渡す場合のテスト extends DbeTestBase {

        private RString code;
        private RString name;

        @Before
        public void setUp() {
            code = new RString("code");
            name = new RString("name");
        }

        @Test(expected = NullPointerException.class)
        public void コードにnullが渡されたとき_NullPointerExceptionが発生する() {
            code = null;
            sut = new ShinsakaiKaisaiChiku(code, name);
        }

        @Test(expected = NullPointerException.class)
        public void 名称にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiKaisaiChiku(code, null);
        }

        @Test(expected = IllegalArgumentException.class)
        public void コードに20桁以上の値が渡されたとき_IllegalArgumentExceptionが返る() {
            code = new RString("0123456789abcdefchijklmnopqlstrvwxyz");
            sut = new ShinsakaiKaisaiChiku(code, name);
        }
    }

    public static class コンストラクタ_コードと名称を渡す場合のテスト extends DbeTestBase {

        private Code code;
        private RString name;

        @Before
        public void setUp() {
            code = new Code("code");
            name = new RString("name");
        }

        @Test(expected = NullPointerException.class)
        public void コードにnullが渡されたとき_NullPointerExceptionが発生する() {
            code = null;
            sut = new ShinsakaiKaisaiChiku(code, name);
        }

        @Test(expected = NullPointerException.class)
        public void 名称にnullが渡されたとき_NullPointerExceptionが発生する() {
            sut = new ShinsakaiKaisaiChiku(code, null);
        }

        @Test(expected = IllegalArgumentException.class)
        public void コードに20桁以上の値が渡されたとき_IllegalArgumentExceptionが返る() {
            code = new Code("0123456789abcdefchijklmnopqlstrvwxyz");
            sut = new ShinsakaiKaisaiChiku(code, name);
        }
    }
}