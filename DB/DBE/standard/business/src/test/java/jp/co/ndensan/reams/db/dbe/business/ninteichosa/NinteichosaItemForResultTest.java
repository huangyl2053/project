/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.ninteichosa;

import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.INinteichosaItem;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.Choice;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemSubGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.NinteichosaItemKubun;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.IAnsweringItem;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.INinteichosaItemGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.INinteichosaItemSubGroup;
import jp.co.ndensan.reams.db.dbe.definition.ninteichosa.enumeratedtype.KoroshoIFKubun;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * 要介護認定調査の調査結果（調査項目単位）を扱うクラスのテストクラスです。
 *
 * @author N8156 宮本 康
 */
@RunWith(Enclosed.class)
public class NinteichosaItemForResultTest {

    private static final int AS_NULL項目無し = 0;
    private static final int AS_調査項目がNULL = 1;
    private static final int AS_調査結果がNULL = 2;

    public static class コンストラクタ {

        @Test(expected = NullPointerException.class)
        public void 調査項目がNULLの時_コンストラクタは_NullPointerExceptionを投げる() {
            createNinteichosaItemForResult(AS_調査項目がNULL);
        }

        @Test(expected = NullPointerException.class)
        public void 調査結果がNULLの時_コンストラクタは_NullPointerExceptionを投げる() {
            createNinteichosaItemForResult(AS_調査結果がNULL);
        }
    }

    public static class get調査項目グループ {

        @Test
        public void 調査項目グループの設定がある時_get調査項目グループは_設置値を返す() {
            assertThat(createNinteichosaItemForResult().get調査項目グループ(), is((INinteichosaItemGroup) NinteichosaItemGroup.Of2009.第１群));
        }
    }

    public static class get調査項目サブグループ {

        @Test
        public void 調査項目サブグループの設定がある時_get調査項目サブグループは_設置値を返す() {
            assertThat(createNinteichosaItemForResult().get調査項目サブグループ(), is((INinteichosaItemSubGroup) NinteichosaItemSubGroup.Of2009.麻痺等の有無));
        }
    }

    public static class get調査項目グループ内番号 {

        @Test
        public void 調査項目グループ内番号の設定がある時_get調査項目グループ内番号は_設置値を返す() {
            assertThat(createNinteichosaItemForResult().get調査項目グループ内番号(), is(3));
        }
    }

    public static class get調査項目番号 {

        @Test
        public void 調査項目番号の設定がある時_get調査項目番号は_設定値を返す() {
            assertThat(createNinteichosaItemForResult().get調査項目番号().value(), is(new RString("1-1")));
        }
    }

    public static class get調査項目区分 {

        @Test
        public void 調査項目区分の設定がある時_get調査項目区分は_設定値を返す() {
            assertThat(createNinteichosaItemForResult().get調査項目区分(), is(NinteichosaItemKubun.麻痺等の有無_右上肢));
        }
    }

    public static class get表示項目 {

        @Test
        public void 表示名称の設定がある時_get表示名称は_設定値を返す() {
            assertThat(createNinteichosaItemForResult().get表示名称(), is(new RString("右上肢")));
        }
    }

    public static class get選択肢 {

        @Test
        public void 選択肢が2択の時_get選択肢は_2件の選択肢を返す() {
            assertThat(createNinteichosaItemForResult().get選択肢().asList().size(), is(2));
        }

        @Test
        public void 選択肢の設定がある時_get選択肢は_設定値を返す() {
            assertThat(createNinteichosaItemForResult().get選択肢().asList().get(0), is((IAnsweringItem) Choice.Checked.Disable));
        }
    }

    public static class get調査結果 {

        @Test
        public void 調査結果の設定がある時_get調査結果は_設定値を返す() {
            assertThat(createNinteichosaItemForResult().get調査結果(), is(new RString("1")));
        }
    }

    public static class get選択結果 {

        @Test
        public void 調査項目が選択形式の時_get選択結果は_該当の選択肢を返す() {
            assertThat(createNinteichosaItemForResult(NinteichosaItemKubun.寝返り).get選択結果(), is((IAnsweringItem) Choice.DekiruDekinai3.できる));
        }

        @Test
        public void 調査項目が入力形式の時_get選択結果は_NULLを返す() {
            assertThat(createNinteichosaItemForResult(NinteichosaItemKubun.市町村特別給付).get選択結果(), nullValue());
        }
    }

    private static NinteichosaItemForResult createNinteichosaItemForResult() {
        return createNinteichosaItemForResult(AS_NULL項目無し);
    }

    private static NinteichosaItemForResult createNinteichosaItemForResult(int flg) {
        return createNinteichosaItemForResult(flg, NinteichosaItemKubun.麻痺等の有無_右上肢);
    }

    private static NinteichosaItemForResult createNinteichosaItemForResult(NinteichosaItemKubun itemKubun) {
        return createNinteichosaItemForResult(AS_NULL項目無し, itemKubun);
    }

    private static NinteichosaItemForResult createNinteichosaItemForResult(int flg, NinteichosaItemKubun itemKubun) {
        return new NinteichosaItemForResult(
                flg == AS_調査項目がNULL ? null : createNinteichosaItem(itemKubun),
                flg == AS_調査結果がNULL ? null : new RString("1"));
    }

    private static INinteichosaItem createNinteichosaItem(NinteichosaItemKubun itemKubun) {
        INinteichosaItem item = NinteichosahyoFactory.createサービス状況Instance(KoroshoIFKubun.V09A).get調査項目(itemKubun);
        return item == null ? NinteichosahyoFactory.create基本情報Instance(KoroshoIFKubun.V09A).get調査項目(itemKubun) : item;
    }
}
