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
 * {@link KyufujissekiKogakuKaigoServicehi}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyufujissekiKogakuKaigoServicehiTest extends DbcTestBase {

    private static DbT3028KyufujissekiKogakuKaigoServicehiEntity KyufujissekiKogakuKaigoServicehiEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.DEFAULT_主キー名2;
    }

    public static class 主キーコンストラクタテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);
        }

//TODO 主キー名を置換してください
        @Test(expected = NullPointerException.class)
        public void 主キー名1がnullである場合に_NullPointerExceptionが発生する() {
            sut = new KyufujissekiKogakuKaigoServicehi(null, 主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 主キー名2がnullである場合に_NullPointerExceptionが発生する() {
            sut = new KyufujissekiKogakuKaigoServicehi(主キー名1, null);
        }

        @Test
        public void 指定したキーが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityにセットされている() {
            sut = new KyufujissekiKogakuKaigoServicehi(主キー名1, 主キー名2);
            assertThat(sut.get主キー名1(), is(主キー名1));
            assertThat(sut.get主キー名2(), is(主キー名2));
        }

        @Test
        public void 指定したキーが保持するKyufujissekiKogakuKaigoServicehiIdentifierにセットされている() {
            sut = new KyufujissekiKogakuKaigoServicehi(主キー名1, 主キー名2);
            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class Entityコンストラクタテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);
        }

        @Test(expected = NullPointerException.class)
        public void 指定したEntityがnullである場合_NullPointerExceptionとなる() {
            sut = new KyufujissekiKogakuKaigoServicehi(null);
        }

        @Test
        public void 指定したDbT3028KyufujissekiKogakuKaigoServicehiEntityのキー情報を識別子が持つ() {

            sut = new KyufujissekiKogakuKaigoServicehi(KyufujissekiKogakuKaigoServicehiEntity);

            assertThat(sut.identifier().getXXX(), is(主キー名1));
            assertThat(sut.identifier().getXXX(), is(主キー名2));
        }
    }

    public static class getterテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);

            sut = new KyufujissekiKogakuKaigoServicehi(KyufujissekiKogakuKaigoServicehiEntity);
        }

        @Test
        public void get交換情報識別番号は_entityが持つ交換情報識別番号を返す() {
            assertThat(sut.get交換情報識別番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getKokanJohoShikibetsuNo()));
        }

        @Test
        public void get入力識別番号は_entityが持つ入力識別番号を返す() {
            assertThat(sut.get入力識別番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getInputShikibetsuNo()));
        }

        @Test
        public void getレコード種別コードは_entityが持つレコード種別コードを返す() {
            assertThat(sut.getレコード種別コード(), is(KyufujissekiKogakuKaigoServicehiEntity.getRecodeShubetsuCode()));
        }

        @Test
        public void get証記載保険者番号は_entityが持つ証記載保険者番号を返す() {
            assertThat(sut.get証記載保険者番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getShokisaiHokenshaNo()));
        }

        @Test
        public void get被保険者番号は_entityが持つ被保険者番号を返す() {
            assertThat(sut.get被保険者番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getHiHokenshaNo()));
        }

        @Test
        public void getサービス提供年月は_entityが持つサービス提供年月を返す() {
            assertThat(sut.getサービス提供年月(), is(KyufujissekiKogakuKaigoServicehiEntity.getServiceTeikyoYM()));
        }

        @Test
        public void get通し番号は_entityが持つ通し番号を返す() {
            assertThat(sut.get通し番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getToshiNo()));
        }

        @Test
        public void get給付実績情報作成区分コードは_entityが持つ給付実績情報作成区分コードを返す() {
            assertThat(sut.get給付実績情報作成区分コード(), is(KyufujissekiKogakuKaigoServicehiEntity.getKyufuSakuseiKubunCode()));
        }

        @Test
        public void get給付実績区分コードは_entityが持つ給付実績区分コードを返す() {
            assertThat(sut.get給付実績区分コード(), is(KyufujissekiKogakuKaigoServicehiEntity.getKyufuJissekiKubunCode()));
        }

        @Test
        public void get受付年月日は_entityが持つ受付年月日を返す() {
            assertThat(sut.get受付年月日(), is(KyufujissekiKogakuKaigoServicehiEntity.getUketsukeYMD()));
        }

        @Test
        public void get決定年月日は_entityが持つ決定年月日を返す() {
            assertThat(sut.get決定年月日(), is(KyufujissekiKogakuKaigoServicehiEntity.getKetteiYMD()));
        }

        @Test
        public void get公費１負担番号は_entityが持つ公費１負担番号を返す() {
            assertThat(sut.get公費１負担番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi1FutanNo()));
        }

        @Test
        public void get公費２負担番号は_entityが持つ公費２負担番号を返す() {
            assertThat(sut.get公費２負担番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi2FutanNo()));
        }

        @Test
        public void get公費３負担番号は_entityが持つ公費３負担番号を返す() {
            assertThat(sut.get公費３負担番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi3FutanNo()));
        }

        @Test
        public void get利用者負担額は_entityが持つ利用者負担額を返す() {
            assertThat(sut.get利用者負担額(), is(KyufujissekiKogakuKaigoServicehiEntity.getRiyoshaFutangaku()));
        }

        @Test
        public void get公費１負担額は_entityが持つ公費１負担額を返す() {
            assertThat(sut.get公費１負担額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi1Futangaku()));
        }

        @Test
        public void get公費２負担額は_entityが持つ公費２負担額を返す() {
            assertThat(sut.get公費２負担額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi2Futangaku()));
        }

        @Test
        public void get公費３負担額は_entityが持つ公費３負担額を返す() {
            assertThat(sut.get公費３負担額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi3Futangaku()));
        }

        @Test
        public void get支給額は_entityが持つ支給額を返す() {
            assertThat(sut.get支給額(), is(KyufujissekiKogakuKaigoServicehiEntity.getShikyugaku()));
        }

        @Test
        public void get公費１支給額は_entityが持つ公費１支給額を返す() {
            assertThat(sut.get公費１支給額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi1Shikyugaku()));
        }

        @Test
        public void get公費２支給額は_entityが持つ公費２支給額を返す() {
            assertThat(sut.get公費２支給額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi2Shikyugaku()));
        }

        @Test
        public void get公費３支給額は_entityが持つ公費３支給額を返す() {
            assertThat(sut.get公費３支給額(), is(KyufujissekiKogakuKaigoServicehiEntity.getKohi3Shikyugaku()));
        }

        @Test
        public void get審査年月は_entityが持つ審査年月を返す() {
            assertThat(sut.get審査年月(), is(KyufujissekiKogakuKaigoServicehiEntity.getShinsaYM()));
        }

        @Test
        public void get整理番号は_entityが持つ整理番号を返す() {
            assertThat(sut.get整理番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getSeiriNo()));
        }

        @Test
        public void get送付年月は_entityが持つ送付年月を返す() {
            assertThat(sut.get送付年月(), is(KyufujissekiKogakuKaigoServicehiEntity.getSofuYM()));
        }

        @Test
        public void get取込年月は_entityが持つ取込年月を返す() {
            assertThat(sut.get取込年月(), is(KyufujissekiKogakuKaigoServicehiEntity.getTorikomiYM()));
        }

        @Test
        public void get作成区分は_entityが持つ作成区分を返す() {
            assertThat(sut.get作成区分(), is(KyufujissekiKogakuKaigoServicehiEntity.getSakuseiKubun()));
        }

        @Test
        public void get管理番号は_entityが持つ管理番号を返す() {
            assertThat(sut.get管理番号(), is(KyufujissekiKogakuKaigoServicehiEntity.getKanriNo()));
        }

        @Test
        public void get保険者保有給付実績情報削除済フラグは_entityが持つ保険者保有給付実績情報削除済フラグを返す() {
            assertThat(sut.get保険者保有給付実績情報削除済フラグ(), is(KyufujissekiKogakuKaigoServicehiEntity.getHokenshaHoyuKyufujissekiJohoSakujoZumiFlag()));
        }
    }

    public static class toEntityテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);

            sut = new KyufujissekiKogakuKaigoServicehi(KyufujissekiKogakuKaigoServicehiEntity);
        }

        @Test
        public void toEntityはコンストラクタで設定したentityと異なるインスタンスを返す() {
            assertThat(sut.toEntity(), not(KyufujissekiKogakuKaigoServicehiEntity));
        }
    }

    public static class SerializationProxyテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);

            sut = new KyufujissekiKogakuKaigoServicehi(KyufujissekiKogakuKaigoServicehiEntity);
        }

        @Test
        public void シリアライズできる() {
            assertThat(sut, is(serializable()));
        }
    }

    public static class deletedテスト extends DbcTestBase {

        private static KyufujissekiKogakuKaigoServicehi sut;
        private static KyufujissekiKogakuKaigoServicehi result;

        @Before
        public void setUp() {
            KyufujissekiKogakuKaigoServicehiEntity = DbT3028KyufujissekiKogakuKaigoServicehiEntityGenerator.createDbT3028KyufujissekiKogakuKaigoServicehiEntity();
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名1);
            KyufujissekiKogakuKaigoServicehiEntity.setXXX(主キー名2);

        }

        @Test
        public void KyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがUnchangedである場合_deletedメソッド_によりKyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがDeletedに指定されたKyufujissekiKogakuKaigoServicehiが返る() {
            sut = TestSupport.setStateKyufujissekiKogakuKaigoServicehi(EntityDataState.Unchanged);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void KyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがModifiedである場合_deletedメソッド_によりKyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがDeletedに指定されたKyufujissekiKogakuKaigoServicehiが返る() {
            sut = TestSupport.setStateKyufujissekiKogakuKaigoServicehi(EntityDataState.Modified);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test
        public void KyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがDeletedである場合_deletedメソッド_によりKyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがDeletedに指定されたKyufujissekiKogakuKaigoServicehiが返る() {
            sut = TestSupport.setStateKyufujissekiKogakuKaigoServicehi(EntityDataState.Deleted);
            result = sut.deleted();
            assertThat(result.toEntity().getState(), is(EntityDataState.Deleted));
        }

        @Test(expected = IllegalStateException.class)
        public void KyufujissekiKogakuKaigoServicehiが保持するDbT3028KyufujissekiKogakuKaigoServicehiEntityのEntityDataStateがAddedである場合_deletedメソッド_により_IllegalStateExceptionが発火する() {
            sut = TestSupport.setStateKyufujissekiKogakuKaigoServicehi(EntityDataState.Added);
            result = sut.deleted();
        }
    }

    private static class TestSupport {

        public static KyufujissekiKogakuKaigoServicehi setStateKyufujissekiKogakuKaigoServicehi(EntityDataState parentState) {
            KyufujissekiKogakuKaigoServicehiEntity.setState(parentState);
            return new KyufujissekiKogakuKaigoServicehi(KyufujissekiKogakuKaigoServicehiEntity);
        }
    }
}