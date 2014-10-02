/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.realservice;

import jp.co.ndensan.reams.db.dbe.business.YokaigoNinteiProgress;
import jp.co.ndensan.reams.db.dbe.business.helper.NinteiShinchokuJohoMock;
import jp.co.ndensan.reams.db.dbe.entity.basic.DbT5005NinteiShinchokuJohoEntity;
import jp.co.ndensan.reams.db.dbe.entity.helper.NinteiShinchokuJohoEntityMock;
import jp.co.ndensan.reams.db.dbe.persistence.basic.NinteiShinchokuJohoDac;
import jp.co.ndensan.reams.db.dbz.testhelper.DbeTestBase;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

/**
 * 要介護認定進捗情報Managerのテストです。
 *
 * @author N8187 久保田 英男
 */
@RunWith(Enclosed.class)
public class YokaigoninteiProgressManagerTest extends DbeTestBase {

    public static class save extends DbeTestBase {

        private static YokaigoNinteiProgressManager sut;

        @Test
        public void 要介護認定進捗情報の保存が成功した時_saveは_TRUEを返す() {
            assertThat(createYokaigoniteiProgressManager(1).save(createYokaigoniteiProgress()), is(true));
        }

        @Test
        public void 要介護認定進捗情報の保存が失敗した時_saveは_FALSEを返す() {
            assertThat(createYokaigoniteiProgressManager(0).save(createYokaigoniteiProgress()), is(false));
        }
    }

    private static YokaigoNinteiProgressManager createYokaigoniteiProgressManager(int flg) {
        NinteiShinchokuJohoDac dac = mock(NinteiShinchokuJohoDac.class);
        when(dac.update(any(DbT5005NinteiShinchokuJohoEntity.class))).thenReturn(flg);
        return new YokaigoNinteiProgressManager(dac);
    }

    private static YokaigoNinteiProgress createYokaigoniteiProgress() {
        return NinteiShinchokuJohoMock.create認定進捗情報();
    }
}
