/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.Hihokensha;
import jp.co.ndensan.reams.db.dbz.business.comparator.HihokenshaComparators.RegisterDateTimeComparator;
import jp.co.ndensan.reams.db.dbz.business.comparator.HihokenshaComparators.ShichosonCodeComparator;
import jp.co.ndensan.reams.db.dbz.business.helper.HihokenshaMock;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoHihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Before;

/**
 * HihokenshaComparatorsのテストです。
 *
 * @author N3327 三浦 凌
 */
@RunWith(Enclosed.class)
public class HihokenshaComparatorsTest extends DbzTestBase {

    private static final LasdecCode l000001 = new LasdecCode("000001");
    private static final LasdecCode l000002 = new LasdecCode("000002");
    private static final LasdecCode l000003 = new LasdecCode("000003");
    private static final LasdecCode l000004 = new LasdecCode("000003");
    private static final ShikibetsuCode s0000000001 = new ShikibetsuCode("0000000001");
    private static final ShikibetsuCode s0000000002 = new ShikibetsuCode("0000000002");
    private static final RDateTime rt2014_04_01_00_00 = RDateTime.of(2014, 4, 1, 0, 0);
    private static final RDateTime rt2014_04_02_00_00 = RDateTime.of(2014, 4, 2, 0, 0);
    private static final RDateTime rt2014_04_03_00_00 = RDateTime.of(2014, 4, 3, 0, 0);
    private static final RDateTime rt2014_04_04_00_00 = RDateTime.of(2014, 4, 4, 0, 0);
    private static final KaigoHihokenshaNo hn0000000001 = new KaigoHihokenshaNo(new RString("0000000001"));
    private static final KaigoHihokenshaNo hn0000000002 = new KaigoHihokenshaNo(new RString("0000000002"));

    public static class _RegisterDateTimeComparator extends DbzTestBase {

        private List<Hihokensha> list;
        private static RegisterDateTimeComparator sut;
        private final int first = 0;
        private int last;

        @Before
        public void setUp() {
            list = createHihokenshaList();
            last = list.size() - 1;
        }

        @Test
        public void ASCを引数に作成したRegisterDateTimeComparatorによりsortしたとき_結果の先頭要素は_もっとも小さな値を返す() {
            sut = RegisterDateTimeComparator.ASC;
            Collections.sort(list, sut);
            assertThat(list.get(first).get被保険者台帳登録日時(), is(rt2014_04_01_00_00));
        }

        @Test
        public void ASCを引数に作成したRegisterDateTimeComparatorによりsortしたとき_結果の最後の要素は_もっともに大きな値を返す() {
            sut = RegisterDateTimeComparator.ASC;
            Collections.sort(list, sut);
            assertThat(list.get(last).get被保険者台帳登録日時(), is(rt2014_04_04_00_00));
        }

        @Test
        public void DESCを引数に作成したRegisterDateTimeComparatorによりsortしたとき_結果の先頭要素は_もっともに大きな値を返す() {
            sut = RegisterDateTimeComparator.DESC;
            Collections.sort(list, sut);
            assertThat(list.get(first).get被保険者台帳登録日時(), is(rt2014_04_04_00_00));
        }

        @Test
        public void DESCを引数に作成したRegisterDateTimeComparatorによりsortしたとき_結果の最後の要素は_もっとも小さな値を返す() {
            sut = RegisterDateTimeComparator.DESC;
            Collections.sort(list, sut);
            assertThat(list.get(last).get被保険者台帳登録日時(), is(rt2014_04_01_00_00));
        }
    }

    public static class _ShichosonCodeComparator extends DbzTestBase {

        private List<Hihokensha> list;
        private static ShichosonCodeComparator sut;
        private final int first = 0;
        private int last;

        @Before
        public void setUp() {
            list = createHihokenshaList();
            last = list.size() - 1;
        }

        @Test
        public void ASCを引数に作成したShichosonCodeComparatorによりsortしたとき_結果の先頭要素は_もっとも小さな値を返す() {
            sut = ShichosonCodeComparator.ASC;
            Collections.sort(list, sut);
            assertThat(list.get(first).get地方公共団体コード(), is(l000001));
        }

        @Test
        public void ASCを引数に作成したShichosonCodeComparatorによりsortしたとき_結果の最後の要素は_もっともに大きな値を返す() {
            sut = ShichosonCodeComparator.ASC;
            Collections.sort(list, sut);
            assertThat(list.get(last).get地方公共団体コード(), is(l000004));
        }

        @Test
        public void DESCを引数に作成したShichosonCodeComparatorによりsortしたとき_結果の先頭要素は_もっともに大きな値を返す() {
            sut = ShichosonCodeComparator.DESC;
            Collections.sort(list, sut);
            assertThat(list.get(first).get地方公共団体コード(), is(l000004));
        }

        @Test
        public void DESCを引数に作成したShichosonCodeComparatorによりsortしたとき_結果の最後の要素は_もっとも小さな値を返す() {
            sut = ShichosonCodeComparator.DESC;
            Collections.sort(list, sut);
            assertThat(list.get(last).get地方公共団体コード(), is(l000001));
        }
    }

    private static List<Hihokensha> createHihokenshaList() {
        List<Hihokensha> list = new ArrayList<>();
        list.add(HihokenshaMock.createHihokensha(l000002, s0000000001, rt2014_04_04_00_00, hn0000000002));
        list.add(HihokenshaMock.createHihokensha(l000003, s0000000001, rt2014_04_02_00_00, hn0000000002));
        list.add(HihokenshaMock.createHihokensha(l000004, s0000000002, rt2014_04_01_00_00, hn0000000001));
        list.add(HihokenshaMock.createHihokensha(l000001, s0000000002, rt2014_04_03_00_00, hn0000000001));
        return list;
    }
}