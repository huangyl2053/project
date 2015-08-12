/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.core.basic;

import jp.co.ndensan.reams.db.dbz.entity.basic.DbT7056GappeiShichosonEntity;
import jp.co.ndensan.reams.db.dbz.entity.basic.helper.DbT7056GappeiShichosonEntityGenerator;
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
 * {@link GappeiShichoson}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class GappeiShichosonTest extends DbzTestBase {

    private static DbT7056GappeiShichosonEntity GappeiShichosonEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT7056GappeiShichosonEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT7056GappeiShichosonEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbzTestBase {

        private static GappeiShichoson sut;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new GappeiShichoson(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new GappeiShichoson(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT7056GappeiShichosonEntityにセットされている() {
            sut = new GappeiShichoson(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するGappeiShichosonIdentifierにセットされている() {
            sut = new GappeiShichoson(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbzTestBase {

        private static GappeiShichoson sut;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new GappeiShichoson(null);
        }

        @Test
        public void 指定したDbT7056GappeiShichosonEntityのキー情報を識別子が持つ() {

            sut = new GappeiShichoson(GappeiShichosonEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbzTestBase {

        private static GappeiShichoson sut;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);

            sut = new GappeiShichoson(GappeiShichosonEntity);
        }

        @Test
        public void get合併年月日は_entityが持つ合併年月日を返す() {
            assertThat(sut.get合併年月日(), is(GappeiShichosonEntity.getGappeiYMD()));
        }

        @Test
        public void get地域番号は_entityが持つ地域番号を返す() {
            assertThat(sut.get地域番号(), is(GappeiShichosonEntity.getChiikiNo()));
        }

        @Test
        public void get旧市町村コードは_entityが持つ旧市町村コードを返す() {
            assertThat(sut.get旧市町村コード(), is(GappeiShichosonEntity.getKyuShichosonCode()));
        }

        @Test
        public void get運用開始年月日は_entityが持つ運用開始年月日を返す() {
            assertThat(sut.get運用開始年月日(), is(GappeiShichosonEntity.getUnyoKaishiYMD()));
        }

        @Test
        public void get運用終了年月日は_entityが持つ運用終了年月日を返す() {
            assertThat(sut.get運用終了年月日(), is(GappeiShichosonEntity.getUnyoShuryoYMD()));
        }

        @Test
        public void get旧保険者番号は_entityが持つ旧保険者番号を返す() {
            assertThat(sut.get旧保険者番号(), is(GappeiShichosonEntity.getKyuHokenshaNo()));
        }

        @Test
        public void get旧市町村名称は_entityが持つ旧市町村名称を返す() {
            assertThat(sut.get旧市町村名称(), is(GappeiShichosonEntity.getKyuShichosonMeisho()));
        }

        @Test
        public void get都道府県名称は_entityが持つ都道府県名称を返す() {
            assertThat(sut.get都道府県名称(), is(GappeiShichosonEntity.getTodofukenMeisho()));
        }

        @Test
        public void get郡名称は_entityが持つ郡名称を返す() {
            assertThat(sut.get郡名称(), is(GappeiShichosonEntity.getGunMeisho()));
        }

        @Test
        public void get郵便番号は_entityが持つ郵便番号を返す() {
            assertThat(sut.get郵便番号(), is(GappeiShichosonEntity.getYubinNo()));
        }

        @Test
        public void get電話番号は_entityが持つ電話番号を返す() {
            assertThat(sut.get電話番号(), is(GappeiShichosonEntity.getTelNo()));
        }

        @Test
        public void get老人保健市町村番号は_entityが持つ老人保健市町村番号を返す() {
            assertThat(sut.get老人保健市町村番号(), is(GappeiShichosonEntity.getRojinhokenShichosonNo()));
        }

        @Test
        public void get老人保健受給者番号体系は_entityが持つ老人保健受給者番号体系を返す() {
            assertThat(sut.get老人保健受給者番号体系(), is(GappeiShichosonEntity.getRokenJukyushaNoTaikei()));
        }

        @Test
        public void get表示有無は_entityが持つ表示有無を返す() {
            assertThat(sut.get表示有無(), is(GappeiShichosonEntity.getHyojiUmu()));
        }
    }

    public static class toEntityテスト extends DbzTestBase {

        private static GappeiShichoson sut;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);

            sut = new GappeiShichoson(GappeiShichosonEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(GappeiShichosonEntity));
        }
    }

    public static class SerializationProxyテスト extends DbzTestBase {

        private static GappeiShichoson sut;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);

            sut = new GappeiShichoson(GappeiShichosonEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbzTestBase {

        private static GappeiShichoson sut;
        private static GappeiShichoson result;

        @Before
        public void setUp() {
            GappeiShichosonEntity = DbT7056GappeiShichosonEntityGenerator.createDbT7056GappeiShichosonEntity();
            GappeiShichosonEntity.setXXX(主キー名1);
            GappeiShichosonEntity.setXXX(主キー名2);

        }

        @Test
        public void GappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりGappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがDeletedに指定されたGappeiShichosonが返る() {
            sut = TestSupport.setStateGappeiShichoson(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void GappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりGappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがDeletedに指定されたGappeiShichosonが返る() {
            sut = TestSupport.setStateGappeiShichoson(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void GappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりGappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがDeletedに指定されたGappeiShichosonが返る() {
            sut = TestSupport.setStateGappeiShichoson(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void GappeiShichosonが保持するDbT7056GappeiShichosonEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateGappeiShichoson(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static GappeiShichoson setStateGappeiShichoson(EntityDataState parentState) {
            GappeiShichosonEntity.setState(parentState);
            return new GappeiShichoson(GappeiShichosonEntity);
        }
    }
}