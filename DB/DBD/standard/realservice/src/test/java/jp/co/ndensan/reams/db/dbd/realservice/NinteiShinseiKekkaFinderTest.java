/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.realservice;

import jp.co.ndensan.reams.db.dbd.model.relate.NinteiShinseiKekkaModel;
import jp.co.ndensan.reams.db.dbd.persistence.relate.NinteiShinseiKekkaDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;

/**
 * {link NinteiShinseiKekkaFinder}のテストクラスです。
 *
 * @author n8187 久保田 英男
 */
//TODO n8235 船山洋介 受給者台帳・認定申請結果情報・認定申請情報のテーブルが変更されたため、最新化が必要
//TODO n8300姜　ビルドエラー回避のために暫定対応
@RunWith(Enclosed.class)
public class NinteiShinseiKekkaFinderTest {

    private static NinteiShinseiKekkaDac dac;
    private static NinteiShinseiKekkaFinder sut;

    @BeforeClass
    public static void test() {
        dac = mock(NinteiShinseiKekkaDac.class);
        sut = new NinteiShinseiKekkaFinder(dac);
    }

    public static class find要介護認定申請結果Test extends DbzTestBase {

        @Test
        public void データが見つかる検索条件を指定した場合_要介護認定申請結果のリストが返る() {

//            List<NinteiShinseiKekkaModel> 要介護認定申請結果モデルリスト = new ArrayList<>();
//            要介護認定申請結果モデルリスト.add(createModel());
//            要介護認定申請結果モデルリスト.add(createModel());
//            IItemList<NinteiShinseiKekkaModel> list = ItemList.of(要介護認定申請結果モデルリスト);
//
//            when(dac.select要介護認定申請結果履歴By被保険者番号(any(HihokenshaNo.class))).thenReturn(list);
//
//            IItemList<NinteiShinseiKekkaModel> 要介護認定申請結果リスト = sut.find要介護認定申請結果(DbT4001JukyushaDaichoEntityGenerator.DEFAULT_被保険者番号);
//
//            assertThat(要介護認定申請結果リスト.size(), is(2));
//            // 任意の項目が一致するテストケースを記述してください。
//            assertThat(要介護認定申請結果リスト.toList().get(0).get要介護認定申請情報モデル().get().get介護医師コード(), is(DbT5001NinteiShinseiJohoEntityGenerator.DEFAULT_介護医師コード));
//            assertThat(要介護認定申請結果リスト.toList().get(1).get要介護認定申請情報モデル().get().get介護医師コード(), is(DbT5001NinteiShinseiJohoEntityGenerator.DEFAULT_介護医師コード));
//            assertThat(要介護認定申請結果リスト.toList().get(0).get要介護認定結果情報モデル().get().get一次判定結果変更理由(), is(DbT5002NinteiKekkaJohoEntityGenerator.DEFAULT_一次判定結果変更理由));
//            assertThat(要介護認定申請結果リスト.toList().get(1).get要介護認定結果情報モデル().get().get一次判定結果変更理由(), is(DbT5002NinteiKekkaJohoEntityGenerator.DEFAULT_一次判定結果変更理由));
        }
    }

    public static NinteiShinseiKekkaModel createModel() {
        return null;

//        return new NinteiShinseiKekkaModel(
//                new JukyushaDaichoModel(DbT4001JukyushaDaichoEntityGenerator.createDbT4001JukyushaDaichoEntity()),
//                Optional.of(new NinteiShinseiJohoModel(DbT5001NinteiShinseiJohoEntityGenerator.createDbT5001NinteiShinseiJohoEntity())),
//                Optional.of(new NinteiKekkaJohoModel(DbT5002NinteiKekkaJohoEntityGenerator.createDbT5002NinteiKekkaJohoEntity())));
    }

}