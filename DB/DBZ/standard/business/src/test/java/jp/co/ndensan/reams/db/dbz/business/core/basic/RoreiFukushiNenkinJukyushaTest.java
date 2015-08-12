/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7006RoreiFukushiNenkinJukyushaEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7006RoreiFukushiNenkinJukyushaEntityGenerator;
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
 * {@link RoreiFukushiNenkinJukyusha}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class RoreiFukushiNenkinJukyushaTest extends DbzTestBase {

    private static DbT7006RoreiFukushiNenkinJukyushaEntity RoreiFukushiNenkinJukyushaEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new RoreiFukushiNenkinJukyusha(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new RoreiFukushiNenkinJukyusha(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT7006RoreiFukushiNenkinJukyushaEntityにセットされている() {
            sut = new RoreiFukushiNenkinJukyusha(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するRoreiFukushiNenkinJukyushaIdentifierにセットされている() {
            sut = new RoreiFukushiNenkinJukyusha(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new RoreiFukushiNenkinJukyusha(null);
        }

        @Test
        public void 指定したDbT7006RoreiFukushiNenkinJukyushaEntityのキー情報を識別子が持つ() {

            sut = new RoreiFukushiNenkinJukyusha(RoreiFukushiNenkinJukyushaEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);

            sut = new RoreiFukushiNenkinJukyusha(RoreiFukushiNenkinJukyushaEntity);
        }

        @Test
        public void get識別コードは_entityが持つ識別コードを返す() {
            assertThat(sut.get識別コード(), is(RoreiFukushiNenkinJukyushaEntity.getShikibetsuCode()));
        }

        @Test
        public void get受給開始年月日は_entityが持つ受給開始年月日を返す() {
            assertThat(sut.get受給開始年月日(), is(RoreiFukushiNenkinJukyushaEntity.getJukyuKaishiYMD()));
        }

        @Test
        public void get受給終了年月日は_entityが持つ受給終了年月日を返す() {
            assertThat(sut.get受給終了年月日(), is(RoreiFukushiNenkinJukyushaEntity.getJukyuShuryoYMD()));
        }

        @Test
        public void get被保険者番号は_entityが持つ被保険者番号を返す() {
            assertThat(sut.get被保険者番号(), is(RoreiFukushiNenkinJukyushaEntity.getHihokenshaNo()));
        }
    }

    public static class toEntityテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);

            sut = new RoreiFukushiNenkinJukyusha(RoreiFukushiNenkinJukyushaEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(RoreiFukushiNenkinJukyushaEntity));
        }
    }

    public static class SerializationProxyテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);

            sut = new RoreiFukushiNenkinJukyusha(RoreiFukushiNenkinJukyushaEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbzTestBase {

        private static RoreiFukushiNenkinJukyusha sut;
        private static RoreiFukushiNenkinJukyusha result;

        @Before
        public void setUp() {
            RoreiFukushiNenkinJukyushaEntity = DbT7006RoreiFukushiNenkinJukyushaEntityGenerator.createDbT7006RoreiFukushiNenkinJukyushaEntity();
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名1);
            RoreiFukushiNenkinJukyushaEntity.setXXX(主キー名2);

        }

        @Test
        public void RoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりRoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがDeletedに指定されたRoreiFukushiNenkinJukyushaが返る() {
            sut = TestSupport.setStateRoreiFukushiNenkinJukyusha(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void RoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりRoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがDeletedに指定されたRoreiFukushiNenkinJukyushaが返る() {
            sut = TestSupport.setStateRoreiFukushiNenkinJukyusha(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void RoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりRoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがDeletedに指定されたRoreiFukushiNenkinJukyushaが返る() {
            sut = TestSupport.setStateRoreiFukushiNenkinJukyusha(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void RoreiFukushiNenkinJukyushaが保持するDbT7006RoreiFukushiNenkinJukyushaEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateRoreiFukushiNenkinJukyusha(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static RoreiFukushiNenkinJukyusha setStateRoreiFukushiNenkinJukyusha(EntityDataState parentState) {
            RoreiFukushiNenkinJukyushaEntity.setState(parentState);
            return new RoreiFukushiNenkinJukyusha(RoreiFukushiNenkinJukyushaEntity);
        }
    }
}