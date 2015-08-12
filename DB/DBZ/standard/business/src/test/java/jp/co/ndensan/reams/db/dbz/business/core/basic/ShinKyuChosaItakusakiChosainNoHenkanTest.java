/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link ShinKyuChosaItakusakiChosainNoHenkan}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShinKyuChosaItakusakiChosainNoHenkanTest extends DbzTestBase {

    private static DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity ShinKyuChosaItakusakiChosainNoHenkanEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new ShinKyuChosaItakusakiChosainNoHenkan(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new ShinKyuChosaItakusakiChosainNoHenkan(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityにセットされている() {
            sut = new ShinKyuChosaItakusakiChosainNoHenkan(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するShinKyuChosaItakusakiChosainNoHenkanIdentifierにセットされている() {
            sut = new ShinKyuChosaItakusakiChosainNoHenkan(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new ShinKyuChosaItakusakiChosainNoHenkan(null);
        }

        @Test
        public void 指定したDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのキー情報を識別子が持つ() {

            sut = new ShinKyuChosaItakusakiChosainNoHenkan(ShinKyuChosaItakusakiChosainNoHenkanEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuChosaItakusakiChosainNoHenkan(ShinKyuChosaItakusakiChosainNoHenkanEntity);
        }

        @Test
        public void get市町村コードは_entityが持つ市町村コードを返す() {
            assertThat(sut.get市町村コード(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getShichosonCode()));
        }

        @Test
        public void get新調査委託先番号は_entityが持つ新調査委託先番号を返す() {
            assertThat(sut.get新調査委託先番号(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getShinChosaItakusakiNo()));
        }

        @Test
        public void get新調査員番号は_entityが持つ新調査員番号を返す() {
            assertThat(sut.get新調査員番号(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getShinChosainNo()));
        }

        @Test
        public void get旧調査委託先番号は_entityが持つ旧調査委託先番号を返す() {
            assertThat(sut.get旧調査委託先番号(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getKyuChosaItakusakiNo()));
        }

        @Test
        public void get旧調査員番号は_entityが持つ旧調査員番号を返す() {
            assertThat(sut.get旧調査員番号(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getKyuChosainNo()));
        }

        @Test
        public void get市町村コード２は_entityが持つ市町村コード２を返す() {
            assertThat(sut.get市町村コード２(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getShichosonCode2()));
        }

        @Test
        public void get旧調査委託先番号２は_entityが持つ旧調査委託先番号２を返す() {
            assertThat(sut.get旧調査委託先番号２(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getKyuChosaItakusakiNo2()));
        }

        @Test
        public void get旧調査員番号２は_entityが持つ旧調査員番号２を返す() {
            assertThat(sut.get旧調査員番号２(), is(ShinKyuChosaItakusakiChosainNoHenkanEntity.getKyuChosainNo2()));
        }
    }

    public static class toEntityテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuChosaItakusakiChosainNoHenkan(ShinKyuChosaItakusakiChosainNoHenkanEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(ShinKyuChosaItakusakiChosainNoHenkanEntity));
        }
    }

    public static class SerializationProxyテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuChosaItakusakiChosainNoHenkan(ShinKyuChosaItakusakiChosainNoHenkanEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbzTestBase {

        private static ShinKyuChosaItakusakiChosainNoHenkan sut;
        private static ShinKyuChosaItakusakiChosainNoHenkan result;

        @Before
        public void setUp() {
            ShinKyuChosaItakusakiChosainNoHenkanEntity = DbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityGenerator.createDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntity();
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名1);
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setXXX(主キー名2);

        }

        @Test
        public void ShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuChosaItakusakiChosainNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuChosaItakusakiChosainNoHenkan(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void ShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuChosaItakusakiChosainNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuChosaItakusakiChosainNoHenkan(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void ShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuChosaItakusakiChosainNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuChosaItakusakiChosainNoHenkan(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void ShinKyuChosaItakusakiChosainNoHenkanが保持するDbT7029ShinKyuChosaItakusakiChosainNoHenkanEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateShinKyuChosaItakusakiChosainNoHenkan(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static ShinKyuChosaItakusakiChosainNoHenkan setStateShinKyuChosaItakusakiChosainNoHenkan(EntityDataState parentState) {
            ShinKyuChosaItakusakiChosainNoHenkanEntity.setState(parentState);
            return new ShinKyuChosaItakusakiChosainNoHenkan(ShinKyuChosaItakusakiChosainNoHenkanEntity);
        }
    }
}