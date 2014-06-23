/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.realservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbz.business.Hihokensha;
import jp.co.ndensan.reams.db.dbz.business.HihokenshaList;
import jp.co.ndensan.reams.db.dbz.business.HihokenshaShikaku;
import jp.co.ndensan.reams.db.dbz.business.IHihokenshaShikaku;
import jp.co.ndensan.reams.db.dbz.business.ShikakuShutoku;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoHihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.ur.urz.business.shikibetsutaisho.IKojin;
import jp.co.ndensan.reams.ur.urz.definition.enumeratedtype.ShikakuHihokenshaKubun;
import jp.co.ndensan.reams.ur.urz.realservice.IKojinFinder;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Before;
import static org.mockito.Mockito.*;

/**
 * HihokenshaFinderのテストです。
 *
 * @author N3327 三浦 凌
 */
@RunWith(Enclosed.class)
public class HihokenshaFinderTest extends DbzTestBase {

    private static final HihokenshaDaichoManager hihokenshaDaicho;
    private static final IKojinFinder profileSearcher;
    private static final HihokenshaFinder sut;

    static {
        hihokenshaDaicho = mock(HihokenshaDaichoManager.class);
        profileSearcher = mock(IKojinFinder.class);
        sut = new HihokenshaFinder(hihokenshaDaicho, profileSearcher);
    }

    public static class get被保険者_直近_ShikibetsuCode版 extends DbzTestBase {

        private final LasdecCode lasdecCode = new LasdecCode("123456");
        private final ShikibetsuCode shikibetsuCode = new ShikibetsuCode("1234567890");
        private final RDateTime shoriTimestamp = RDateTime.now();
        private final KaigoHihokenshaNo hihokenshaNo = new KaigoHihokenshaNo(new RString("1234567892"));
        private Hihokensha result;

        @Before
        public void setUp() {
            setUpMock(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, shikibetsuCode);
        }

        @Test
        public void get被保険者_直近_ShikibetsuCode版_の結果は_検索条件と_地方公共団体コードが一致する() {
            assertThat(result.get地方公共団体コード(), is(lasdecCode));
        }

        @Test
        public void get被保険者_直近_ShikibetsuCode版_の結果は_検索条件と_識別コードが一致する() {
            assertThat(result.get識別コード(), is(shikibetsuCode));
        }

        @Test
        public void get被保険者_直近_ShikibetsuCode版は_HihokenshaDaichoManagerがnullを返すとき_nullを返す() {
            result = sut.get被保険者(lasdecCode, new ShikibetsuCode("9876543210"));
            assertThat(result, is(nullValue()));
        }

        @Test
        public void get被保険者_直近_ShikibetsuCode版_は_IKojinFinderがnullを返すとき_nullを返す() {
            ShikibetsuCode code = new ShikibetsuCode("9876543210");
            setUpMockAsKojinFinderReturnsNull(lasdecCode, code, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, code);
            assertThat(result, is(nullValue()));
        }
    }

    public static class get被保険者_直近_KaigoHihokenshaNo版 extends DbzTestBase {

        private final LasdecCode lasdecCode = new LasdecCode("123456");
        private final ShikibetsuCode shikibetsuCode = new ShikibetsuCode("1234567890");
        private final RDateTime shoriTimestamp = RDateTime.now();
        private final KaigoHihokenshaNo hihokenshaNo = new KaigoHihokenshaNo(new RString("1234567892"));
        private Hihokensha result;

        @Before
        public void setUp() {
            setUpMock(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, hihokenshaNo);
        }

        @Test
        public void get被保険者_直近_KaigoHihokenshaNo版_の結果は_検索条件と_地方公共団体コードが一致する() {
            assertThat(result.get地方公共団体コード(), is(lasdecCode));
        }

        @Test
        public void get被保険者_直近_KaigoHihokenshaNo版_の結果は_検索条件と_識別コードが一致する() {
            assertThat(result.get識別コード(), is(shikibetsuCode));
        }

        @Test
        public void get被保険者_直近_KaigoHihokenshaNo版は_HihokenshaDaichoManagerがnullを返すとき_nullを返す() {
            result = sut.get被保険者(lasdecCode, new ShikibetsuCode("9876543210"));
            assertThat(result, is(nullValue()));
        }

        @Test
        public void get被保険者_直近_KaigoHihokenshaNo版_は_IKojinFinderがnullを返すとき_nullを返す() {
            ShikibetsuCode code = new ShikibetsuCode("9876543210");
            setUpMockAsKojinFinderReturnsNull(lasdecCode, code, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, hihokenshaNo);
            assertThat(result, is(nullValue()));
        }
    }

    public static class get被保険者_主キー版 extends DbzTestBase {

        private final LasdecCode lasdecCode = new LasdecCode("123456");
        private final ShikibetsuCode shikibetsuCode = new ShikibetsuCode("1234567890");
        private final RDateTime shoriTimestamp = RDateTime.now();
        private final KaigoHihokenshaNo hihokenshaNo = new KaigoHihokenshaNo(new RString("1234567892"));
        private Hihokensha result;

        @Before
        public void setUp() {
            setUpMock(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, shikibetsuCode, shoriTimestamp);
        }

        @Test
        public void get被保険者_主キー版_の結果は_検索条件と_地方公共団体コードが一致する() {
            assertThat(result.get地方公共団体コード(), is(lasdecCode));
        }

        @Test
        public void get被保険者_主キー版_の結果は_検索条件と_識別コードが一致する() {
            assertThat(result.get識別コード(), is(shikibetsuCode));
        }

        @Test
        public void get被保険者_主キー版_の結果は_検索条件と_被保険者台帳登録日時が一致する() {
            assertThat(result.get被保険者台帳登録日時(), is(shoriTimestamp));
        }

        @Test
        public void get被保険者_主キー版_は_HihokenshaDaichoManagerがnullを返すとき_nullを返す() {
            result = sut.get被保険者(lasdecCode, new ShikibetsuCode("9876543210"), shoriTimestamp);
            assertThat(result, is(nullValue()));
        }

        @Test
        public void get被保険者_主キー版_は_IKojinFinderがnullを返すとき_nullを返す() {
            ShikibetsuCode code = new ShikibetsuCode("9876543210");
            setUpMockAsKojinFinderReturnsNull(lasdecCode, code, shoriTimestamp, hihokenshaNo);
            result = sut.get被保険者(lasdecCode, code, shoriTimestamp);
            assertThat(result, is(nullValue()));
        }
    }

    public static class get被保険者List extends DbzTestBase {

        private final LasdecCode lasdecCode = new LasdecCode("123456");
        private final KaigoHihokenshaNo hihokenshaNo = new KaigoHihokenshaNo(new RString("1234567892"));
        List<IHihokenshaShikaku> list;
        private final int listSize = 3;
        private HihokenshaList result;

        @Before
        public void setUp() {
            list = createListOfHihokenshaShikaku(lasdecCode, listSize);
        }

        @Test
        public void get被保険者Listにより得られるlistは_IKojinFinderの結果にnullがないとき_HihokenshaDaichoManager$get被保険者資格ListOfの結果と_sizeが一致する() {
            when(hihokenshaDaicho.get被保険者資格ListOf(lasdecCode)).thenReturn(list);
            int size = hihokenshaDaicho.get被保険者資格ListOf(lasdecCode).size();

            result = sut.get被保険者List(lasdecCode);
            assertThat(result.size(), is(size));
        }

        @Test
        public void get被保険者Listにより得られるlistは_IKojinFinderの結果にnullがあるとき_その数だけ_HihokenshaDaichoManager$get被保険者資格ListOfの結果よりも_sizeが小さくなる() {
            ShikibetsuCode code = new ShikibetsuCode("9999999999");
            list.add(createHihokenshaShikaku(lasdecCode, code, RDateTime.now(), hihokenshaNo));
            when(profileSearcher.get個人(code)).thenReturn(null);

            when(hihokenshaDaicho.get被保険者資格ListOf(lasdecCode)).thenReturn(list);
            int size = hihokenshaDaicho.get被保険者資格ListOf(lasdecCode).size();

            result = sut.get被保険者List(lasdecCode);
            assertThat(result.size(), is(size - 1));
        }

        @Test
        public void get被保険者Listにより得られるlistは_HihokenshaDaichoManager$get被保険者資格ListOfが_Collections$EMPTY_LIST_を返すとき_sizeが0である() {
            list = Collections.EMPTY_LIST;
            when(hihokenshaDaicho.get被保険者資格ListOf(lasdecCode)).thenReturn(list);

            result = sut.get被保険者List(lasdecCode);
            assertThat(result.size(), is(0));
        }
    }

    private static void setUpMock(LasdecCode lasdecCode, ShikibetsuCode shikibetsuCode, RDateTime shoriTimestamp, KaigoHihokenshaNo hihokenshaNo) {
        _setUpMockOfHihokenshaDaichoManager(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
        _setUpMockOfIKojinFinder_returnIKojinFor(shikibetsuCode);
    }

    private static void setUpMockAsKojinFinderReturnsNull(LasdecCode lasdecCode, ShikibetsuCode shikibetsuCode, RDateTime shoriTimestamp,
            KaigoHihokenshaNo hihokenshaNo) {
        _setUpMockOfHihokenshaDaichoManager(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
        _setUpMockOfIKojinFinder_returnNullAt(shikibetsuCode);
    }

    private static void _setUpMockOfHihokenshaDaichoManager(LasdecCode lasdecCode, ShikibetsuCode shikibetsuCode, RDateTime shoriTimestamp,
            KaigoHihokenshaNo hihokenshaNo) {
        IHihokenshaShikaku shikaku = createHihokenshaShikaku(lasdecCode, shikibetsuCode, shoriTimestamp, hihokenshaNo);
        when(hihokenshaDaicho.get直近被保険者資格(lasdecCode, shikibetsuCode)).thenReturn(shikaku);
        when(hihokenshaDaicho.get直近被保険者資格(lasdecCode, hihokenshaNo)).thenReturn(shikaku);
        when(hihokenshaDaicho.get被保険者資格(lasdecCode, shikibetsuCode, shoriTimestamp)).thenReturn(shikaku);
    }

    private static void _setUpMockOfIKojinFinder_returnIKojinFor(ShikibetsuCode shikibetsuCode) {
        IKojin profile = mock(IKojin.class);
        when(profile.get識別コード()).thenReturn(shikibetsuCode);
        when(profileSearcher.get個人(shikibetsuCode)).thenReturn(profile);
    }

    private static void _setUpMockOfIKojinFinder_returnNullAt(ShikibetsuCode shikibetsuCode) {
        when(profileSearcher.get個人(shikibetsuCode)).thenReturn(null);
    }

    private static List<IHihokenshaShikaku> createListOfHihokenshaShikaku(LasdecCode lasdecCode, int listSize) {
        List<IHihokenshaShikaku> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            ShikibetsuCode shikibetsuCode = new ShikibetsuCode("000000000" + i);
            KaigoHihokenshaNo hihokenshaNo = new KaigoHihokenshaNo(new RString("000000000" + i));
            list.add(createHihokenshaShikaku(lasdecCode, shikibetsuCode, RDateTime.now(), hihokenshaNo));
            _setUpMockOfIKojinFinder_returnIKojinFor(shikibetsuCode);
        }
        return list;
    }

    private static IHihokenshaShikaku createHihokenshaShikaku(LasdecCode lasdecCode, ShikibetsuCode shikibetsuCode,
            RDateTime shoriTimestamp, KaigoHihokenshaNo hihokenshaNo) {
        return new HihokenshaShikaku.Builder(lasdecCode, shikibetsuCode, shoriTimestamp,
                ShikakuHihokenshaKubun.第１号被保険者, FlexibleDate.MAX, ShikakuShutoku.NOTHING).hihokenshaNo(hihokenshaNo).build();
    }
}