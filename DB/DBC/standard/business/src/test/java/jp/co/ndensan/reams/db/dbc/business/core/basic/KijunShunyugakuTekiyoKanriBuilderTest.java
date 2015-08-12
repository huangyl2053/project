/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.core.basic;

import jp.co.ndensan.reams.fd.fdz.testhelper.FdaTestBase;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link KijunShunyugakuTekiyoKanriBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KijunShunyugakuTekiyoKanriBuilderTest extends DbcTestBase {

    private static DbT3116KijunShunyugakuTekiyoKanriEntity KijunShunyugakuTekiyoKanriEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends FdaTestBase {

        private static KijunShunyugakuTekiyoKanriBuilder sut;
        private static KijunShunyugakuTekiyoKanri business;

        @Before
        public void setUp() {
            KijunShunyugakuTekiyoKanriEntity = new DbT3116KijunShunyugakuTekiyoKanriEntity();
            KijunShunyugakuTekiyoKanriEntity.setXXX(主キー名1);
            KijunShunyugakuTekiyoKanriEntity.setXXX(主キー名2);

            business = new KijunShunyugakuTekiyoKanri(KijunShunyugakuTekiyoKanriEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。
        @Test
        public void 戻り値の世帯コードは_設定した値と同じ世帯コードを返す() {
            business = sut.set世帯コード(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯コード).build();
            assertThat(business.get世帯コード(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯コード));
        }

        @Test
        public void 戻り値の年度は_設定した値と同じ年度を返す() {
            business = sut.set年度(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年度).build();
            assertThat(business.get年度(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年度));
        }

        @Test
        public void 戻り値の履歴番号は_設定した値と同じ履歴番号を返す() {
            business = sut.set履歴番号(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_履歴番号).build();
            assertThat(business.get履歴番号(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_履歴番号));
        }

        @Test
        public void 戻り値の被保険者番号は_設定した値と同じ被保険者番号を返す() {
            business = sut.set被保険者番号(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_被保険者番号).build();
            assertThat(business.get被保険者番号(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_被保険者番号));
        }

        @Test
        public void 戻り値の公的年金収入額は_設定した値と同じ公的年金収入額を返す() {
            business = sut.set公的年金収入額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_公的年金収入額).build();
            assertThat(business.get公的年金収入額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_公的年金収入額));
        }

        @Test
        public void 戻り値の給与収入額は_設定した値と同じ給与収入額を返す() {
            business = sut.set給与収入額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_給与収入額).build();
            assertThat(business.get給与収入額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_給与収入額));
        }

        @Test
        public void 戻り値のその他の収入額は_設定した値と同じその他の収入額を返す() {
            business = sut.setその他の収入額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_その他の収入額).build();
            assertThat(business.getその他の収入額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_その他の収入額));
        }

        @Test
        public void 戻り値の算定基準額は_設定した値と同じ算定基準額を返す() {
            business = sut.set算定基準額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_算定基準額).build();
            assertThat(business.get算定基準額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_算定基準額));
        }

        @Test
        public void 戻り値の適用開始年月は_設定した値と同じ適用開始年月を返す() {
            business = sut.set適用開始年月(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_適用開始年月).build();
            assertThat(business.get適用開始年月(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_適用開始年月));
        }

        @Test
        public void 戻り値の申請日は_設定した値と同じ申請日を返す() {
            business = sut.set申請日(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請日).build();
            assertThat(business.get申請日(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請日));
        }

        @Test
        public void 戻り値の決定日は_設定した値と同じ決定日を返す() {
            business = sut.set決定日(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_決定日).build();
            assertThat(business.get決定日(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_決定日));
        }

        @Test
        public void 戻り値の申請書作成日は_設定した値と同じ申請書作成日を返す() {
            business = sut.set申請書作成日(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請書作成日).build();
            assertThat(business.get申請書作成日(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請書作成日));
        }

        @Test
        public void 戻り値の申請書作成の世帯基準日は_設定した値と同じ申請書作成の世帯基準日を返す() {
            business = sut.set申請書作成の世帯基準日(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請書作成の世帯基準日).build();
            assertThat(business.get申請書作成の世帯基準日(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_申請書作成の世帯基準日));
        }

        @Test
        public void 戻り値の決定通知書発行日は_設定した値と同じ決定通知書発行日を返す() {
            business = sut.set決定通知書発行日(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_決定通知書発行日).build();
            assertThat(business.get決定通知書発行日(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_決定通知書発行日));
        }

        @Test
        public void 戻り値の宛先印字対象者フラグは_設定した値と同じ宛先印字対象者フラグを返す() {
            business = sut.set宛先印字対象者フラグ(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_宛先印字対象者フラグ).build();
            assertThat(business.get宛先印字対象者フラグ(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_宛先印字対象者フラグ));
        }

        @Test
        public void 戻り値の年少扶養控除（16歳未満）人数は_設定した値と同じ年少扶養控除（16歳未満）人数を返す() {
            business = sut.set年少扶養控除（16歳未満）人数(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年少扶養控除（16歳未満）人数).build();
            assertThat(business.get年少扶養控除（16歳未満）人数(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年少扶養控除（16歳未満）人数));
        }

        @Test
        public void 戻り値の年少扶養控除（16～18歳未満）人数は_設定した値と同じ年少扶養控除（16～18歳未満）人数を返す() {
            business = sut.set年少扶養控除（16～18歳未満）人数(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年少扶養控除（16～18歳未満）人数).build();
            assertThat(business.get年少扶養控除（16～18歳未満）人数(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_年少扶養控除（16～18歳未満）人数));
        }

        @Test
        public void 戻り値の世帯員の総収入額は_設定した値と同じ世帯員の総収入額を返す() {
            business = sut.set世帯員の総収入額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯員の総収入額).build();
            assertThat(business.get世帯員の総収入額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯員の総収入額));
        }

        @Test
        public void 戻り値の世帯主フラグは_設定した値と同じ世帯主フラグを返す() {
            business = sut.set世帯主フラグ(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯主フラグ).build();
            assertThat(business.get世帯主フラグ(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_世帯主フラグ));
        }

        @Test
        public void 戻り値の課税所得額は_設定した値と同じ課税所得額を返す() {
            business = sut.set課税所得額(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_課税所得額).build();
            assertThat(business.get課税所得額(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_課税所得額));
        }

        @Test
        public void 戻り値の課税所得額（控除後）は_設定した値と同じ課税所得額（控除後）を返す() {
            business = sut.set課税所得額（控除後）(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_課税所得額（控除後）).build();
            assertThat(business.get課税所得額（控除後）(), is(DbT3116KijunShunyugakuTekiyoKanriEntityGenerator.DEFAULT_課税所得額（控除後）));
        }

    }
}