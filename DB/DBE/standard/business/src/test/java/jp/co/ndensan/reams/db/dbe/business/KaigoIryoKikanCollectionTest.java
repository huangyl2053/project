/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.IryoKikanJokyo;
import jp.co.ndensan.reams.db.dbe.definition.IryoKikanKubun;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoIryoKikanCode;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShichosonCode;
import jp.co.ndensan.reams.ur.urz.business.IIryoKikan;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.testhelper.TestBase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.*;

/**
 * 介護医療機関コレクションクラスのテストです。
 *
 * @author n8178 城間篤人
 */
@RunWith(Enclosed.class)
public class KaigoIryoKikanCollectionTest extends TestBase {

    private static KaigoIryoKikanCollection sut;
    private static List<KaigoIryoKikan> kaigoIryoKikanList;

    public static class コンストラクタのテスト extends TestBase {

        @Test
        public void 必須項目がそろっているとき_インスタンスが生成される() {
            kaigoIryoKikanList = mock(List.class);
            sut = new KaigoIryoKikanCollection(kaigoIryoKikanList);
            assertThat(sut, instanceOf(KaigoIryoKikanCollection.class));
        }

        @Test(expected = NullPointerException.class)
        public void 引数からnullが渡されたとき_NullPointerExceptionを返す() {
            sut = new KaigoIryoKikanCollection(null);
        }
    }

    public static class get介護医療機関のテスト extends TestBase {

        private ShichosonCode 市町村コード;
        private KaigoIryoKikanCode 介護医療機関コード;

        @Override
        public void setUp() {
            kaigoIryoKikanList = new ArrayList<>();
            kaigoIryoKikanList.add(create介護医療機関("0001", "1234", "5678"));
            kaigoIryoKikanList.add(create介護医療機関("0002", "2345", "6789"));
            kaigoIryoKikanList.add(create介護医療機関("0003", "3456", "7890"));
            sut = new KaigoIryoKikanCollection(kaigoIryoKikanList);
        }

        @Test(expected = IllegalArgumentException.class)
        public void 市町村コード_介護医療機関コードともに対応していない場合_例外が発生する() {
            市町村コード = new ShichosonCode(new RString("0987"));
            介護医療機関コード = new KaigoIryoKikanCode(new RString("0987"));
            assertThat(sut.get介護医療機関(市町村コード, 介護医療機関コード), nullValue());
        }

        @Test(expected = IllegalArgumentException.class)
        public void 市町村コードに対応するものがあっても_介護医療機関コードについて対応していない場合_例外が発生する() {
            市町村コード = new ShichosonCode(new RString("1234"));
            介護医療機関コード = new KaigoIryoKikanCode(new RString("0987"));
            sut.get介護医療機関(市町村コード, 介護医療機関コード);
        }

        @Test(expected = IllegalArgumentException.class)
        public void 介護医療機関コードに対応するものがあっても_市町村コードについて対応していない場合_例外が発生する() {
            市町村コード = new ShichosonCode(new RString("0987"));
            介護医療機関コード = new KaigoIryoKikanCode(new RString("5678"));
            sut.get介護医療機関(市町村コード, 介護医療機関コード);
        }

        @Test
        public void 両方に対応しているものが存在するとき_対応した介護医療機関が返る() {
            市町村コード = new ShichosonCode(new RString("1234"));
            介護医療機関コード = new KaigoIryoKikanCode(new RString("5678"));
            assertThat(sut.get介護医療機関(市町村コード, 介護医療機関コード).get識別コード().getColumnValue(), is(new RString("0001")));
        }

        private KaigoIryoKikan create介護医療機関(String 識別コード, String 市町村コード, String 介護医療機関コード) {
            IShujiiIryoKikan 主治医医療機関 = mock(KaigoIryoKikan.class);
            ShichosonCode sCode = create市町村コード(市町村コード);
            when(主治医医療機関.get市町村コード()).thenReturn(sCode);
            KaigoIryoKikanCode kCode = create介護医療機関コード(介護医療機関コード);
            when(主治医医療機関.get介護医療機関コード()).thenReturn(kCode);

            IIryoKikan 医療機関 = mock(KaigoIryoKikan.class);
            when(医療機関.get識別コード()).thenReturn(new ShikibetsuCode(new RString(識別コード)));

            return new KaigoIryoKikan(医療機関, 主治医医療機関);
        }
    }

    public static class sub介護医療機関Collection_医療機関区分を引数に渡した場合のテスト extends TestBase {

        private KaigoIryoKikan iryoKikan1_A001 = create介護医療機関("0001", "A001", "市町村コード1", "介護医療機関コード1");
        private KaigoIryoKikan iryoKikan2_B001 = create介護医療機関("0002", "B001", "市町村コード2", "介護医療機関コード2");
        private KaigoIryoKikan iryoKikan3_C001 = create介護医療機関("0003", "C001", "市町村コード3", "介護医療機関コード3");
        private KaigoIryoKikan iryoKikan4_A001 = create介護医療機関("0001", "A001", "市町村コード4", "介護医療機関コード4");
        private KaigoIryoKikan iryoKikan5_A001 = create介護医療機関("0001", "A001", "市町村コード5", "介護医療機関コード5");
        private KaigoIryoKikan iryoKikan6_B001 = create介護医療機関("0002", "B001", "市町村コード6", "介護医療機関コード6");

        @Override
        public void setUp() {
            sut = new KaigoIryoKikanCollection(create介護医療機関List());
        }

        @Test
        public void 医療機関コードにA001を指定したとき_sub介護医療機関Collectionは3件の要素を持つコレクションを返す() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("A001"));
            assertThat(results.size(), is(3));
        }

        @Test
        public void 医療機関コードにA001を指定したとき_sub介護医療機関Collectionは_A001_市町村コード1_介護医療機関コード1の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("A001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード1"), create介護医療機関コード("介護医療機関コード1"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("A001")));
        }

        @Test
        public void 医療機関コードにA001を指定したとき_sub介護医療機関Collectionは_A001_市町村コード4_介護医療機関コード4の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("A001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード4"), create介護医療機関コード("介護医療機関コード4"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("A001")));
        }

        @Test
        public void 医療機関コードにA001を指定したとき_sub介護医療機関Collectionは_A001_市町村コード5_介護医療機関コード5の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("A001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード5"), create介護医療機関コード("介護医療機関コード5"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("A001")));
        }

        @Test
        public void 医療機関コードにB001を指定したとき_sub介護医療機関Collectionは2件の要素を持つコレクションを返す() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("B001"));
            assertThat(results.size(), is(2));
        }

        @Test
        public void 医療機関コードにB001を指定したとき_sub介護医療機関Collectionは_B001_市町村コード2_介護医療機関コード2の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("B001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード2"), create介護医療機関コード("介護医療機関コード2"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("B001")));
        }

        @Test
        public void 医療機関コードにB001を指定したとき_sub介護医療機関Collectionは_B001_市町村コード6_介護医療機関コード6の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("B001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード6"), create介護医療機関コード("介護医療機関コード6"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("B001")));
        }

        @Test
        public void 医療機関コードにC001を指定したとき_sub介護医療機関Collectionは1件の要素を持つコレクションを返す() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("C001"));
            assertThat(results.size(), is(1));
        }

        @Test
        public void 医療機関コードにC001を指定したとき_sub介護医療機関Collectionは_C001_市町村コード3_介護医療機関コード3の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(create医療機関区分("C001"));
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード3"), create介護医療機関コード("介護医療機関コード3"));
            assertThat(result.get医療機関区分().getCode(), is(new RString("C001")));
        }

        private List<KaigoIryoKikan> create介護医療機関List() {
            List<KaigoIryoKikan> kaigoIryoKikanList = new ArrayList<>();
            kaigoIryoKikanList.add(iryoKikan1_A001);
            kaigoIryoKikanList.add(iryoKikan2_B001);
            kaigoIryoKikanList.add(iryoKikan3_C001);
            kaigoIryoKikanList.add(iryoKikan4_A001);
            kaigoIryoKikanList.add(iryoKikan5_A001);
            kaigoIryoKikanList.add(iryoKikan6_B001);
            return kaigoIryoKikanList;
        }

        private KaigoIryoKikan create介護医療機関(String 識別コード, String 医療機関区分コード, String 市町村コード, String 介護医療機関コード) {
//            IryoKikanKubun 医療機関区分 = create医療機関区分(医療機関区分コード);
//
//            IShujiiIryoKikan 主治医医療機関 = mock(KaigoIryoKikan.class);
//            when(主治医医療機関.get医療機関区分()).thenReturn(医療機関区分);
//            when(主治医医療機関.get市町村コード()).thenReturn(create市町村コード(市町村コード));
//            when(主治医医療機関.get介護医療機関コード()).thenReturn(create介護医療機関コード(介護医療機関コード));
//
//            IIryoKikan 医療機関 = mock(KaigoIryoKikan.class);
//            when(医療機関.get識別コード()).thenReturn(new ShikibetsuCode(new RString(識別コード)));
//
//            return new KaigoIryoKikan(医療機関, 主治医医療機関);
            KaigoIryoKikan 介護医療機関 = mock(KaigoIryoKikan.class);
            IryoKikanKubun iryoKikanKubun = create医療機関区分(医療機関区分コード);
            when(介護医療機関.get医療機関区分()).thenReturn(iryoKikanKubun);
            ShichosonCode sCode = create市町村コード(市町村コード);
            when(介護医療機関.get市町村コード()).thenReturn(sCode);
            KaigoIryoKikanCode kCode = create介護医療機関コード(介護医療機関コード);
            when(介護医療機関.get介護医療機関コード()).thenReturn(kCode);
            when(介護医療機関.get識別コード()).thenReturn(new ShikibetsuCode(new RString(識別コード)));
            return 介護医療機関;
        }

        private IryoKikanKubun create医療機関区分(String 医療機関区分コード) {
            return new IryoKikanKubun(new RString(医療機関区分コード), RString.EMPTY, RString.EMPTY);
        }
    }

    public static class sub介護医療機関Collection_医療機関状況を引数に渡した場合のテスト extends TestBase {

        private final KaigoIryoKikan iryoKikan1_有効 = create介護医療機関("0001", IryoKikanJokyo.有効, "市町村コード1", "介護医療機関コード1");
        private final KaigoIryoKikan iryoKikan2_無効 = create介護医療機関("0002", IryoKikanJokyo.無効, "市町村コード2", "介護医療機関コード2");
        private final KaigoIryoKikan iryoKikan3_有効 = create介護医療機関("0001", IryoKikanJokyo.有効, "市町村コード3", "介護医療機関コード3");

        @Override
        public void setUp() {
            sut = new KaigoIryoKikanCollection(create介護医療機関List());
        }

        @Test
        public void 医療機関状況に有効を指定したとき_sub介護医療機関Collectionは2件の要素を持つコレクションを返す() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(IryoKikanJokyo.有効);
            assertThat(results.size(), is(2));
        }

        @Test
        public void 医療機関状況に有効を指定したとき_sub介護医療機関Collectionは_状況が有効_市町村コード1_介護医療機関コード1の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(IryoKikanJokyo.有効);
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード1"), create介護医療機関コード("介護医療機関コード1"));
            assertThat(result.get医療機関状況(), is(IryoKikanJokyo.有効));
        }

        @Test
        public void 医療機関状況に有効を指定したとき_sub介護医療機関Collectionは_状況が有効_市町村コード3_介護医療機関コード3の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(IryoKikanJokyo.有効);
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード3"), create介護医療機関コード("介護医療機関コード3"));
            assertThat(result.get医療機関状況(), is(IryoKikanJokyo.有効));
        }

        @Test
        public void 医療機関状況に無効を指定したとき_sub介護医療機関Collectionは1件の要素を持つコレクションを返す() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(IryoKikanJokyo.無効);
            assertThat(results.size(), is(1));
        }

        @Test
        public void 医療機関状況に無効を指定したとき_sub介護医療機関Collectionは_状況が無効_市町村コード2_介護医療機関コード2の要素を持つ() {
            KaigoIryoKikanCollection results = sut.sub介護医療機関Collection(IryoKikanJokyo.無効);
            KaigoIryoKikan result = results.get介護医療機関(create市町村コード("市町村コード2"), create介護医療機関コード("介護医療機関コード2"));
            assertThat(result.get医療機関状況(), is(IryoKikanJokyo.無効));
        }

        private List<KaigoIryoKikan> create介護医療機関List() {
            List<KaigoIryoKikan> kaigoIryoKikanList = new ArrayList<>();
            kaigoIryoKikanList.add(iryoKikan1_有効);
            kaigoIryoKikanList.add(iryoKikan2_無効);
            kaigoIryoKikanList.add(iryoKikan3_有効);
            return kaigoIryoKikanList;
        }

        private KaigoIryoKikan create介護医療機関(String 識別コード, IryoKikanJokyo 医療機関状況, String 市町村コード, String 介護医療機関コード) {
            KaigoIryoKikan 介護医療機関 = mock(KaigoIryoKikan.class);
            when(介護医療機関.get医療機関状況()).thenReturn(医療機関状況);
            ShichosonCode sCode = create市町村コード(市町村コード);
            when(介護医療機関.get市町村コード()).thenReturn(sCode);
            KaigoIryoKikanCode kCode = create介護医療機関コード(介護医療機関コード);
            when(介護医療機関.get介護医療機関コード()).thenReturn(kCode);

//            IIryoKikan 医療機関 = mock(IIryoKikan.class);
            when(介護医療機関.get識別コード()).thenReturn(new ShikibetsuCode(new RString(識別コード)));

//            return new KaigoIryoKikan(医療機関, 主治医医療機関);
            return 介護医療機関;
        }
    }

    public static class isEmptyのテスト {

        @Test
        public void コレクションが空の場合_trueが返る() {
            sut = new KaigoIryoKikanCollection(Collections.EMPTY_LIST);
            assertThat(sut.isEmpty(), is(true));
        }

        @Test
        public void コレクションに一つ以上の要素がある場合_falseが返る() {
//            List<KaigoIryoKikan> kaigoIryoKikanList = new ArrayList<>();
            kaigoIryoKikanList = new ArrayList<>();
//            KaigoIryoKikan iryoKikan = mock(KaigoIryoKikan.class);
            kaigoIryoKikanList.add(null);
            sut = new KaigoIryoKikanCollection(kaigoIryoKikanList);
            assertThat(sut.isEmpty(), is(false));
        }

    }

    private static ShichosonCode create市町村コード(String str) {
        return new ShichosonCode(new RString(str));
    }

    private static KaigoIryoKikanCode create介護医療機関コード(String str) {
        return new KaigoIryoKikanCode(new RString(str));
    }
}
