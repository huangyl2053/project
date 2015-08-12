/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.testhelper.DbcTestBase;
import static jp.co.ndensan.reams.db.dbc.testhelper.matcher.IsSerializable.serializable;
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
 * {@link KyufuhiKashitsukekinShakuyoshoJuri}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyufuhiKashitsukekinShakuyoshoJuriTest extends DbcTestBase {

    private static DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity KyufuhiKashitsukekinShakuyoshoJuriEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new KyufuhiKashitsukekinShakuyoshoJuri(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new KyufuhiKashitsukekinShakuyoshoJuri(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityにセットされている() {
            sut = new KyufuhiKashitsukekinShakuyoshoJuri(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するKyufuhiKashitsukekinShakuyoshoJuriIdentifierにセットされている() {
            sut = new KyufuhiKashitsukekinShakuyoshoJuri(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new KyufuhiKashitsukekinShakuyoshoJuri(null);
        }

        @Test
        public void 指定したDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのキー情報を識別子が持つ() {

            sut = new KyufuhiKashitsukekinShakuyoshoJuri(KyufuhiKashitsukekinShakuyoshoJuriEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);

            sut = new KyufuhiKashitsukekinShakuyoshoJuri(KyufuhiKashitsukekinShakuyoshoJuriEntity);
        }

        @Test
        public void get被保険者番号は_entityが持つ被保険者番号を返す() {
            assertThat(sut.get被保険者番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHihokenshaNo()));
        }

        @Test
        public void get借入申請年月日は_entityが持つ借入申請年月日を返す() {
            assertThat(sut.get借入申請年月日(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariireShinseiYMD()));
        }

        @Test
        public void get履歴番号は_entityが持つ履歴番号を返す() {
            assertThat(sut.get履歴番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getRirekiNo()));
        }

        @Test
        public void get借受年月日は_entityが持つ借受年月日を返す() {
            assertThat(sut.get借受年月日(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeYMD()));
        }

        @Test
        public void get借受人郵便番号は_entityが持つ借受人郵便番号を返す() {
            assertThat(sut.get借受人郵便番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeninYubinNo()));
        }

        @Test
        public void get借受人住所は_entityが持つ借受人住所を返す() {
            assertThat(sut.get借受人住所(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeninJusho()));
        }

        @Test
        public void get借受人氏名カナは_entityが持つ借受人氏名カナを返す() {
            assertThat(sut.get借受人氏名カナ(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeninShimeiKana()));
        }

        @Test
        public void get借受人氏名は_entityが持つ借受人氏名を返す() {
            assertThat(sut.get借受人氏名(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeninShimei()));
        }

        @Test
        public void get借受人電話番号は_entityが持つ借受人電話番号を返す() {
            assertThat(sut.get借受人電話番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getKariukeninTelNo()));
        }

        @Test
        public void get保証人氏名カナは_entityが持つ保証人氏名カナを返す() {
            assertThat(sut.get保証人氏名カナ(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHoshoninShimeiKana()));
        }

        @Test
        public void get保証人氏名は_entityが持つ保証人氏名を返す() {
            assertThat(sut.get保証人氏名(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHoshoninShimei()));
        }

        @Test
        public void get保証人郵便番号は_entityが持つ保証人郵便番号を返す() {
            assertThat(sut.get保証人郵便番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHoshoninYubinNo()));
        }

        @Test
        public void get保証人住所は_entityが持つ保証人住所を返す() {
            assertThat(sut.get保証人住所(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHoshoninJusho()));
        }

        @Test
        public void get保証人電話番号は_entityが持つ保証人電話番号を返す() {
            assertThat(sut.get保証人電話番号(), is(KyufuhiKashitsukekinShakuyoshoJuriEntity.getHoshoninTelNo()));
        }
    }

    public static class toEntityテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);

            sut = new KyufuhiKashitsukekinShakuyoshoJuri(KyufuhiKashitsukekinShakuyoshoJuriEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(KyufuhiKashitsukekinShakuyoshoJuriEntity));
        }
    }

    public static class SerializationProxyテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);

            sut = new KyufuhiKashitsukekinShakuyoshoJuri(KyufuhiKashitsukekinShakuyoshoJuriEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbcTestBase {

        private static KyufuhiKashitsukekinShakuyoshoJuri sut;
        private static KyufuhiKashitsukekinShakuyoshoJuri result;

        @Before
        public void setUp() {
            KyufuhiKashitsukekinShakuyoshoJuriEntity = DbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityGenerator.createDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntity();
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名1);
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setXXX(主キー名2);

        }

        @Test
        public void KyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりKyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがDeletedに指定されたKyufuhiKashitsukekinShakuyoshoJuriが返る() {
            sut = TestSupport.setStateKyufuhiKashitsukekinShakuyoshoJuri(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void KyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりKyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがDeletedに指定されたKyufuhiKashitsukekinShakuyoshoJuriが返る() {
            sut = TestSupport.setStateKyufuhiKashitsukekinShakuyoshoJuri(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void KyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりKyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがDeletedに指定されたKyufuhiKashitsukekinShakuyoshoJuriが返る() {
            sut = TestSupport.setStateKyufuhiKashitsukekinShakuyoshoJuri(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void KyufuhiKashitsukekinShakuyoshoJuriが保持するDbT3088KyufuhiKashitsukekinShakuyoshoJuriEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateKyufuhiKashitsukekinShakuyoshoJuri(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static KyufuhiKashitsukekinShakuyoshoJuri setStateKyufuhiKashitsukekinShakuyoshoJuri(EntityDataState parentState) {
            KyufuhiKashitsukekinShakuyoshoJuriEntity.setState(parentState);
            return new KyufuhiKashitsukekinShakuyoshoJuri(KyufuhiKashitsukekinShakuyoshoJuriEntity);
        }
    }
}