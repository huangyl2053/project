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
 * {@link KyufuhiKashitsukeKinKyoseiHenkanBuilder}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyufuhiKashitsukeKinKyoseiHenkanBuilderTest extends DbcTestBase {

    private static DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntity KyufuhiKashitsukeKinKyoseiHenkanEntity;  //TODO 変数名称の頭文字を小文字に変更して下さい。
//TODO 主キー型と変数名を置換してください
//TODO 主キーの数が足りない場合、追加してください。
    private static 主キー型1 主キー名1;
    private static 主キー型2 主キー名2;

    @BeforeClass
    public static void setUpClass() {
//TODO 主キー値を適切な値に置換してください
        主キー名1 = DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_主キー名1;
        主キー名2 = DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_主キー名2;
    }

    public static class getterSetterTest extends FdaTestBase {

        private static KyufuhiKashitsukeKinKyoseiHenkanBuilder sut;
        private static KyufuhiKashitsukeKinKyoseiHenkan business;

        @Before
        public void setUp() {
            KyufuhiKashitsukeKinKyoseiHenkanEntity = new DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntity();
            KyufuhiKashitsukeKinKyoseiHenkanEntity.setXXX(主キー名1);
            KyufuhiKashitsukeKinKyoseiHenkanEntity.setXXX(主キー名2);

            business = new KyufuhiKashitsukeKinKyoseiHenkan(KyufuhiKashitsukeKinKyoseiHenkanEntity);

            sut = business.createBuilderForEdit();
        }
//TODO Key項目のテストメソッドは削除して下さい。
        @Test
        public void 戻り値の被保険者番号は_設定した値と同じ被保険者番号を返す() {
            business = sut.set被保険者番号(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_被保険者番号).build();
            assertThat(business.get被保険者番号(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_被保険者番号));
        }

        @Test
        public void 戻り値の貸付管理番号は_設定した値と同じ貸付管理番号を返す() {
            business = sut.set貸付管理番号(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_貸付管理番号).build();
            assertThat(business.get貸付管理番号(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_貸付管理番号));
        }

        @Test
        public void 戻り値の履歴番号は_設定した値と同じ履歴番号を返す() {
            business = sut.set履歴番号(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_履歴番号).build();
            assertThat(business.get履歴番号(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_履歴番号));
        }

        @Test
        public void 戻り値の返還金区分は_設定した値と同じ返還金区分を返す() {
            business = sut.set返還金区分(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還金区分).build();
            assertThat(business.get返還金区分(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還金区分));
        }

        @Test
        public void 戻り値の返還金額は_設定した値と同じ返還金額を返す() {
            business = sut.set返還金額(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還金額).build();
            assertThat(business.get返還金額(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還金額));
        }

        @Test
        public void 戻り値の返還期限は_設定した値と同じ返還期限を返す() {
            business = sut.set返還期限(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還期限).build();
            assertThat(business.get返還期限(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還期限));
        }

        @Test
        public void 戻り値の返還理由は_設定した値と同じ返還理由を返す() {
            business = sut.set返還理由(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還理由).build();
            assertThat(business.get返還理由(), is(DbT3093KyufuhiKashitsukeKinKyoseiHenkanEntityGenerator.DEFAULT_返還理由));
        }

    }
}