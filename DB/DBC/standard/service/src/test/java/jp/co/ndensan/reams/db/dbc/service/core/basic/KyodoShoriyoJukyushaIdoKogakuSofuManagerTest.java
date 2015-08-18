/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.core.basic.KyodoShoriyoJukyushaIdoKogakuSofu;
import jp.co.ndensan.reams.db.dbc.entity.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity;
import jp.co.ndensan.reams.db.dbc.entity.basic.helper.DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator;
import jp.co.ndensan.reams.db.dbc.persistence.db.basic.DbT3004KyodoShoriyoJukyushaIdoKogakuSofuDac;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HokenshaNo;
import jp.co.ndensan.reams.db.dbz.testhelper.DbcTestBase;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * {link KyodoShoriyoJukyushaIdoKogakuSofuManager}のテストクラスです。
 */
@RunWith(Enclosed.class)
public class KyodoShoriyoJukyushaIdoKogakuSofuManagerTest {

    private static DbT3004KyodoShoriyoJukyushaIdoKogakuSofuDac dac;
    private static KyodoShoriyoJukyushaIdoKogakuSofuManager sut;

    @BeforeClass
    public static void test() {
        dac = mock(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuDac.class);
        sut = new KyodoShoriyoJukyushaIdoKogakuSofuManager(dac);
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get共同処理用受給者異動高額送付 extends DbcTestBase {

        // TODO メソッドの引数の数に合わせて、NullPointerExceptionのテストケースを増減してください。
        @Test(expected = NullPointerException.class)
        public void 引数の主キー型1にnullを指定した場合_NullPointerExceptionが発生する() {
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            sut.get共同処理用受給者異動高額送付(null, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型2にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            sut.get共同処理用受給者異動高額送付(主キー1, null, 主キー3, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型3にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, null, 主キー4, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型4にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, 主キー3, null, 主キー5, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型5にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, 主キー3, 主キー4, null, 主キー6);
        }

        @Test(expected = NullPointerException.class)
        public void 引数の主キー型6にnullを指定した場合_NullPointerExceptionが発生する() {
            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, 主キー3, 主キー4, null, null);
        }

        // TODO メソッドの引数の数に合わせて、mock処理とメソッド呼び出しを見直してください。
        @Test
        public void 検索結果がnullの場合() {
            when(dac.selectByKey(any(FlexibleDate.class), any(RString.class), any(RString.class),
                    any(HokenshaNo.class), any(HihokenshaNo.class), any(Decimal.class))).thenReturn(null);

            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            KyodoShoriyoJukyushaIdoKogakuSofu result = sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);

            assertThat(result, is(nullValue()));
        }

        @Test
        public void 検索結果が存在する場合() {
            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            when(dac.selectByKey(any(FlexibleDate.class), any(RString.class), any(RString.class),
                    any(HokenshaNo.class), any(HihokenshaNo.class), any(Decimal.class))).thenReturn(entity);

            FlexibleDate 主キー1 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日;
            RString 主キー2 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動区分コード;
            RString 主キー3 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_受給者異動事由;
            HokenshaNo 主キー4 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_証記載保険者番号;
            HihokenshaNo 主キー5 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_被保険者番号;
            Decimal 主キー6 = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_履歴番号;
            KyodoShoriyoJukyushaIdoKogakuSofu result = sut.get共同処理用受給者異動高額送付(主キー1, 主キー2, 主キー3, 主キー4, 主キー5, 主キー6);

            assertThat(result.get主キー1().value(), is(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日.toString()));
        }
    }

    // TODO 主キー型、主キー値については使用するエンティティに合わせて適切に置換してください。
    public static class get共同処理用受給者異動高額送付一覧 extends DbcTestBase {

        @Test
        public void 検索結果が空の場合() {
            when(dac.selectAll()).thenReturn(Collections.EMPTY_LIST);

            List<KyodoShoriyoJukyushaIdoKogakuSofu> result = sut.get共同処理用受給者異動高額送付一覧();

            assertThat(result.isEmpty(), is(true));
        }

        @Test
        public void 検索結果が存在する場合() {
            List<DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity> entityList = Arrays.asList(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity());
            when(dac.selectAll()).thenReturn(entityList);

            List<KyodoShoriyoJukyushaIdoKogakuSofu> result = sut.get共同処理用受給者異動高額送付一覧();

            assertThat(result.size(), is(1));
            assertThat(result.get(0).get主キー1().value(), is(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.DEFAULT_異動年月日.toString()));
        }
    }

    public static class save共同処理用受給者異動高額送付 extends DbcTestBase {

        @Test
        public void insertに成功するとtrueが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(1);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(true));
        }

        @Test
        public void insertに失敗するとfalseが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(0);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(false));
        }

        @Test
        public void updateに成功するとtrueが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(1);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            entity.initializeMd5();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);
            共同処理用受給者異動高額送付 = 共同処理用受給者異動高額送付.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(true));
        }

        @Test
        public void updateに失敗するとfalseが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(0);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            entity.initializeMd5();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);
            共同処理用受給者異動高額送付 = 共同処理用受給者異動高額送付.createBuilderForEdit().set任意項目1(new RString("任意項目1を変更")).build();

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(false));
        }

        @Test
        public void deleteに成功するとtrueが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(1);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            entity.initializeMd5();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);
            共同処理用受給者異動高額送付 = 共同処理用受給者異動高額送付.deleted();

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(true));
        }

        @Test
        public void deleteに失敗するとfalseが返る() {
            when(dac.save(any(DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity.class))).thenReturn(0);

            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            entity.initializeMd5();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);
            共同処理用受給者異動高額送付 = 共同処理用受給者異動高額送付.deleted();

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(false));
        }

        public void 何も変更せずにsaveを呼び出すとfalseが返る() {
            DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity entity = DbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntityGenerator.createDbT3004KyodoShoriyoJukyushaIdoKogakuSofuEntity();
            entity.initializeMd5();
            KyodoShoriyoJukyushaIdoKogakuSofu 共同処理用受給者異動高額送付 = new KyodoShoriyoJukyushaIdoKogakuSofu(entity);

            assertThat(sut.save共同処理用受給者異動高額送付(共同処理用受給者異動高額送付), is(false));
        }
    }
}
