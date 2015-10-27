/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.persistence.db.basic;

import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT7116JukyushaGendoGakuKanriDac;
import java.util.Collections;
import jp.co.ndensan.reams.db.dbc.entity.db.basic.DbT7116JukyushaGendoGakuKanriEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7116JukyushaGendoGakuKanriEntityGenerator;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7116JukyushaGendoGakuKanriEntityGenerator.DEFAULT_履歴番号;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7116JukyushaGendoGakuKanriEntityGenerator.DEFAULT_有効開始年月;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7116JukyushaGendoGakuKanriEntityGenerator.DEFAULT_被保険者番号;
import static jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT7116JukyushaGendoGakuKanriEntityGenerator.DEFAULT_識別区分;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestDacBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * {@link DbT7116JukyushaGendoGakuKanriDac}のテストです。
 */
@RunWith(Enclosed.class)
public class DbT7116JukyushaGendoGakuKanriDacTest extends DbcTestDacBase {

    private static final RString キー_01 = new RString("02");
    private static final RString キー_02 = new RString("02");
    private static final RString キー_03 = new RString("03");
    private static DbT7116JukyushaGendoGakuKanriDac sut;

    @BeforeClass
    public static void setUpClass() {
        sut = InstanceProvider.create(DbT7116JukyushaGendoGakuKanriDac.class);
    }

    public static class selectByKeyのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 被保険者番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 識別区分がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 有効開始年月がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test(expected = NullPointerException.class)
        public void 履歴番号がnullの場合_selectByKeyは_NullPointerExceptionを発生させる() {
            sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 存在する主キーを渡すと_selectByKeyは_該当のエンティティを返す() {
            DbT7116JukyushaGendoGakuKanriEntity insertedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(notNullValue()));
        }

        @Test
        public void 存在しない主キーを渡すと_selectByKeyは_nullを返す() {
            DbT7116JukyushaGendoGakuKanriEntity insertedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            assertThat(insertedRecord, is(nullValue()));
        }
    }

    public static class selectAllのテスト extends DbcTestDacBase {

        @Test
        public void 受給者限度額管理が存在する場合_selectAllは_全件を返す() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            assertThat(sut.selectAll().size(), is(2));
        }

        @Test
        public void 受給者限度額管理が存在しない場合_selectAllは_空のリストを返す() {
            assertThat(sut.selectAll(), is(Collections.EMPTY_LIST));
        }
    }

    public static class insertのテスト extends DbcTestDacBase {

        @Test
        public void 受給者限度額管理エンティティを渡すと_insertは_受給者限度額管理を追加する() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);

            assertThat(sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号), is(notNullValue()));
        }
    }

    public static class updateのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 受給者限度額管理エンティティを渡すと_updateは_受給者限度額管理を更新する() {
            DbT7116JukyushaGendoGakuKanriEntity updateRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            // TODO  主キー以外の項目を変更してください
            // updateRecord.set変更したい項目(75);

            sut.save(updateRecord);

            DbT7116JukyushaGendoGakuKanriEntity updatedRecord = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);

            // TODO  主キー以外の項目を変更してください
            // assertThat(updateRecord.get変更したい項目(), is(updatedRecord.get変更したい項目()));
        }
    }

    public static class deleteのテスト extends DbcTestDacBase {

        @Before
        public void setUp() {
            TestSupport.insert(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
        }

        @Test
        public void 受給者限度額管理エンティティを渡すと_deleteは_受給者限度額管理を削除する() {
            DbT7116JukyushaGendoGakuKanriEntity deletedEntity = sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号);
            deletedEntity.setState(EntityDataState.Deleted);

            sut.save(deletedEntity);

            assertThat(sut.selectByKey(
                    DEFAULT_被保険者番号,
                    DEFAULT_識別区分,
                    DEFAULT_有効開始年月,
                    DEFAULT_履歴番号), is(nullValue()));
        }
    }

    private static class TestSupport {

        public static void insert(
                HihokenshaNo 被保険者番号,
                RString 識別区分,
                FlexibleYearMonth 有効開始年月,
                int 履歴番号) {
            DbT7116JukyushaGendoGakuKanriEntity entity = DbT7116JukyushaGendoGakuKanriEntityGenerator.createDbT7116JukyushaGendoGakuKanriEntity();
            entity.setHihokenshaNo(被保険者番号);
            entity.setShikibetsuKubun(識別区分);
            entity.setYukoKaishiYM(有効開始年月);
            entity.setRirekiNo(履歴番号);
            sut.save(entity);
        }
    }
}