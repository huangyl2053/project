/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.definition.mybatis.param.relate;

import jp.co.ndensan.reams.db.dbz.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link NijiYoboKihonCheckListMapperParameter}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NijiYoboKihonCheckListMapperParameterTest extends DbcTestBase {

// TODO 主キー型、主キー名を適切に置換してください。
// TODO 主キーの数が足りない場合、処理を追加してください。
    private static final ShikibetsuCode 主キー1 = new ShikibetsuCode("000010000100001");
    private static final HihokenshaNo 主キー2 = new HihokenshaNo("0123400001");
    private static FlexibleDate 主キー3;

// テストクラス名は適切に変更してください
    public static class createSelectByKeyParamテスト extends DbcTestBase {

        @Test(expected = NullPointerException.class)
        public void 主キー1にNullを指定すると_NullPointerExceptionが発生する() {
            NijiYoboKihonCheckListMapperParameter sut = NijiYoboKihonCheckListMapperParameter.createSelectByKeyParam(null, 主キー2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー2にNullを指定すると_NullPointerExceptionが発生する() {
            NijiYoboKihonCheckListMapperParameter sut = NijiYoboKihonCheckListMapperParameter.createSelectByKeyParam(主キー1, null);
        }

        @Test
        public void 引数にNull以外を指定すると_パラメータが生成できる() {
            NijiYoboKihonCheckListMapperParameter sut = NijiYoboKihonCheckListMapperParameter.createSelectByKeyParam(主キー1, 主キー2);

            assertThat(sut.get主キー1().value(), is(主キー1.value()));
            assertThat(sut.get主キー2(), is(主キー2));
//            assertThat(sut.uses主キー1(), is(true));
//            assertThat(sut.uses主キー2(), is(true));
        }
    }

// テストクラス名は適切に変更してください
// 用途に応じたパラメータ生成メソッドのテストクラスを追加してください。
    public static class createSelectListParamテスト extends DbcTestBase {

        @Test(expected = NullPointerException.class)
        public void 主キー1にNullを指定すると_NullPointerExceptionが発生する() {
            NijiYoboKihonCheckListMapperParameter sut = NijiYoboKihonCheckListMapperParameter.createSelectListParam(null);
        }

        @Test
        public void 引数にNull意外を指定すると_パラメータが生成できる() {
            NijiYoboKihonCheckListMapperParameter sut = NijiYoboKihonCheckListMapperParameter.createSelectListParam(主キー1);

            assertThat(sut.get主キー1().value(), is(主キー1.value()));
//            assertThat(sut.uses主キー1(), is(true));
//            assertThat(sut.uses主キー2(), is(false));
        }
    }

}
