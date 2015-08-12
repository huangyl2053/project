/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.basic;

import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5031NinteiChosaHoshuTankaEntity;
import jp.co.ndensan.reams.db.dbe.entity.helper.DbT5031NinteiChosaHoshuTankaEntityGenerator;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link NinteiChosaHoshuTanka}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class NinteiChosaHoshuTankaTest extends DbeTestBase {

    private static DbT5031NinteiChosaHoshuTankaEntity NinteiChosaHoshuTankaEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT5031NinteiChosaHoshuTankaEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT5031NinteiChosaHoshuTankaEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new NinteiChosaHoshuTanka(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new NinteiChosaHoshuTanka(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT5031NinteiChosaHoshuTankaEntityにセットされている() {
            sut = new NinteiChosaHoshuTanka(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するNinteiChosaHoshuTankaIdentifierにセットされている() {
            sut = new NinteiChosaHoshuTanka(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new NinteiChosaHoshuTanka(null);
        }

        @Test
        public void 指定したDbT5031NinteiChosaHoshuTankaEntityのキー情報を識別子が持つ() {

            sut = new NinteiChosaHoshuTanka(NinteiChosaHoshuTankaEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();

            sut = new NinteiChosaHoshuTanka(NinteiChosaHoshuTankaEntity);
        }

        @Test
        public void get調査区分は_entityが持つ調査区分を返す() {
            assertThat(sut.get調査区分(), is(NinteiChosaHoshuTankaEntity.getChosaKubun()));
        }

        @Test
        public void get訪問種別は_entityが持つ訪問種別を返す() {
            assertThat(sut.get訪問種別(), is(NinteiChosaHoshuTankaEntity.getHomonShubetsu()));
        }

        @Test
        public void get意見書入手パターンは_entityが持つ意見書入手パターンを返す() {
            assertThat(sut.get意見書入手パターン(), is(NinteiChosaHoshuTankaEntity.getIkenshoNyushuPatern()));
        }

        @Test
        public void get開始年月は_entityが持つ開始年月を返す() {
            assertThat(sut.get開始年月(), is(NinteiChosaHoshuTankaEntity.getKaishiYM()));
        }

        @Test
        public void get終了年月は_entityが持つ終了年月を返す() {
            assertThat(sut.get終了年月(), is(NinteiChosaHoshuTankaEntity.getShuryoYM()));
        }

        @Test
        public void get単価は_entityが持つ単価を返す() {
            assertThat(sut.get単価(), is(NinteiChosaHoshuTankaEntity.getTanka()));
        }
    }

    public static class toEntityテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();

            sut = new NinteiChosaHoshuTanka(NinteiChosaHoshuTankaEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(NinteiChosaHoshuTankaEntity));
        }
    }

    public static class SerializationProxyテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();

            sut = new NinteiChosaHoshuTanka(NinteiChosaHoshuTankaEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbeTestBase {

        private static NinteiChosaHoshuTanka sut;
        private static NinteiChosaHoshuTanka result;

        @BeforeClass
        public static void setUpClass() {
            NinteiChosaHoshuTankaEntity = DbT5031NinteiChosaHoshuTankaEntityGenerator.createDbT5031NinteiChosaHoshuTankaEntity();

        }

        @Test
        public void NinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりNinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがDeletedに指定されたNinteiChosaHoshuTankaが返る() {
            sut = TestSupport.setStateNinteiChosaHoshuTanka(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void NinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりNinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがDeletedに指定されたNinteiChosaHoshuTankaが返る() {
            sut = TestSupport.setStateNinteiChosaHoshuTanka(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void NinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりNinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがDeletedに指定されたNinteiChosaHoshuTankaが返る() {
            sut = TestSupport.setStateNinteiChosaHoshuTanka(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void NinteiChosaHoshuTankaが保持するDbT5031NinteiChosaHoshuTankaEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateNinteiChosaHoshuTanka(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static NinteiChosaHoshuTanka setStateNinteiChosaHoshuTanka(EntityDataState parentState) {
            NinteiChosaHoshuTankaEntity.setState(parentState);
            return new NinteiChosaHoshuTanka(NinteiChosaHoshuTankaEntity);
        }
    }
}