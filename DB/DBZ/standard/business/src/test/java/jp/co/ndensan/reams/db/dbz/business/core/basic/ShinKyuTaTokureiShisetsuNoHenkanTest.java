/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator;
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
 * {@link ShinKyuTaTokureiShisetsuNoHenkan}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class ShinKyuTaTokureiShisetsuNoHenkanTest extends DbzTestBase {

    private static DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity ShinKyuTaTokureiShisetsuNoHenkanEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new ShinKyuTaTokureiShisetsuNoHenkan(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new ShinKyuTaTokureiShisetsuNoHenkan(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityにセットされている() {
            sut = new ShinKyuTaTokureiShisetsuNoHenkan(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するShinKyuTaTokureiShisetsuNoHenkanIdentifierにセットされている() {
            sut = new ShinKyuTaTokureiShisetsuNoHenkan(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new ShinKyuTaTokureiShisetsuNoHenkan(null);
        }

        @Test
        public void 指定したDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのキー情報を識別子が持つ() {

            sut = new ShinKyuTaTokureiShisetsuNoHenkan(ShinKyuTaTokureiShisetsuNoHenkanEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuTaTokureiShisetsuNoHenkan(ShinKyuTaTokureiShisetsuNoHenkanEntity);
        }

        @Test
        public void get市町村コードは_entityが持つ市町村コードを返す() {
            assertThat(sut.get市町村コード(), is(ShinKyuTaTokureiShisetsuNoHenkanEntity.getShichosonCode()));
        }

        @Test
        public void get新他特例施設番号は_entityが持つ新他特例施設番号を返す() {
            assertThat(sut.get新他特例施設番号(), is(ShinKyuTaTokureiShisetsuNoHenkanEntity.getShinTaTokureiShisetsuNo()));
        }

        @Test
        public void get旧他特例施設番号は_entityが持つ旧他特例施設番号を返す() {
            assertThat(sut.get旧他特例施設番号(), is(ShinKyuTaTokureiShisetsuNoHenkanEntity.getKyuTaTokureiShisetsuNo()));
        }

        @Test
        public void get市町村コード２は_entityが持つ市町村コード２を返す() {
            assertThat(sut.get市町村コード２(), is(ShinKyuTaTokureiShisetsuNoHenkanEntity.getShichosonCode2()));
        }

        @Test
        public void get旧他特例施設番号２は_entityが持つ旧他特例施設番号２を返す() {
            assertThat(sut.get旧他特例施設番号２(), is(ShinKyuTaTokureiShisetsuNoHenkanEntity.getKyuTaTokureiShisetsuNo2()));
        }
    }

    public static class toEntityテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuTaTokureiShisetsuNoHenkan(ShinKyuTaTokureiShisetsuNoHenkanEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(ShinKyuTaTokureiShisetsuNoHenkanEntity));
        }
    }

    public static class SerializationProxyテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);

            sut = new ShinKyuTaTokureiShisetsuNoHenkan(ShinKyuTaTokureiShisetsuNoHenkanEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbzTestBase {

        private static ShinKyuTaTokureiShisetsuNoHenkan sut;
        private static ShinKyuTaTokureiShisetsuNoHenkan result;

        @Before
        public void setUp() {
            ShinKyuTaTokureiShisetsuNoHenkanEntity = DbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityGenerator.createDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntity();
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名1);
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setXXX(主キー名2);

        }

        @Test
        public void ShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuTaTokureiShisetsuNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuTaTokureiShisetsuNoHenkan(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void ShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuTaTokureiShisetsuNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuTaTokureiShisetsuNoHenkan(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void ShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがDeletedに指定されたShinKyuTaTokureiShisetsuNoHenkanが返る() {
            sut = TestSupport.setStateShinKyuTaTokureiShisetsuNoHenkan(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void ShinKyuTaTokureiShisetsuNoHenkanが保持するDbT7032ShinKyuTaTokureiShisetsuNoHenkanEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateShinKyuTaTokureiShisetsuNoHenkan(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static ShinKyuTaTokureiShisetsuNoHenkan setStateShinKyuTaTokureiShisetsuNoHenkan(EntityDataState parentState) {
            ShinKyuTaTokureiShisetsuNoHenkanEntity.setState(parentState);
            return new ShinKyuTaTokureiShisetsuNoHenkan(ShinKyuTaTokureiShisetsuNoHenkanEntity);
        }
    }
}