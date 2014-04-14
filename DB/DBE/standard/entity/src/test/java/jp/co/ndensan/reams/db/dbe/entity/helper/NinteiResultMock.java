/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.helper;

import jp.co.ndensan.reams.db.dbe.business.NinteiResult;
import jp.co.ndensan.reams.db.dbe.business.NinteiResultIdo;
import jp.co.ndensan.reams.db.dbe.business.NinteiShinsakaiIken;
import jp.co.ndensan.reams.db.dbe.business.NinteiTorikeshi;
import jp.co.ndensan.reams.db.dbe.business.NinteiYukoKikan;
import jp.co.ndensan.reams.db.dbe.business.TokuteiShippei;
import jp.co.ndensan.reams.db.dbe.business.YokaigoJotai;
import jp.co.ndensan.reams.db.dbe.business.YokaigoJotaiKubun;
import jp.co.ndensan.reams.db.dbe.business.YokaigoJotaizoRei;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.KaigoServiceType;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.NinteiResultIdoJiyuKubun;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ShinsakaiIkenType;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.ShisetsuNyushoKubun;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.TsuchiKubun;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.NinteiYukoKikanTsukisu;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.ShinsakaiKaisaiNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.KaigoHihokenshaNo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ShinseishoKanriNo;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.mockito.Mockito.spy;

/**
 * NinteiResultを生成するMockです。
 *
 * @author N8156 宮本 康
 */
public class NinteiResultMock {

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private NinteiResultMock() {
    }

    /**
     * NinteiResultを生成して返します。
     *
     * @return NinteiResult
     */
    public static NinteiResult getSpiedInstance() {
        return spy(createNinteiResult());
    }

    private static NinteiResult createNinteiResult() {
        return new NinteiResult(
                new ShinseishoKanriNo(new RString("1234567890")),
                new KaigoHihokenshaNo(new RString("123456")),
                new KaigoHihokenshaNo(new RString("456789")),
                new FlexibleDate("20140101"),
                createYokaigoJotai(),
                createYokaigoJotaizoRei(),
                KaigoServiceType.訪問介護,
                ShisetsuNyushoKubun.入所している,
                createTokuteiShippeiKubun(),
                createNinteiShinsakaiIken(),
                createNinteiResultIdo(),
                createNinteiTorikeshi(),
                TsuchiKubun.認定,
                new RString("認定理由"));
    }

    private static ShinseishoKanriNo createShinseishoKanriNo() {
        return new ShinseishoKanriNo(new RString("1234567890"));
    }

    private static YokaigoJotai createYokaigoJotai() {
        return new YokaigoJotai(createYokaigoJotaiKubun(), createNinteiYukoKikan());
    }

    private static YokaigoJotaiKubun createYokaigoJotaiKubun() {
        return spy(new YokaigoJotaiKubun(new Code(new RString("1111111111")), new RString("名称"), new RString("略称")));
    }

    private static YokaigoJotaizoRei createYokaigoJotaizoRei() {
        return spy(new YokaigoJotaizoRei(new Code(new RString("2222222222")), new RString("名称"), new RString("略称")));
    }

    private static NinteiYukoKikan createNinteiYukoKikan() {
        return spy(new NinteiYukoKikan(new FlexibleDate("20140202"), new NinteiYukoKikanTsukisu(1), new FlexibleDate("20140303")));
    }

    private static TokuteiShippei createTokuteiShippeiKubun() {
        return spy(new TokuteiShippei(new Code(new RString("3333333333")), new RString("名称"), new RString("略称")));
    }

    private static NinteiShinsakaiIken createNinteiShinsakaiIken() {
        return spy(new NinteiShinsakaiIken(
                new ShinsakaiKaisaiNo(new Integer("123")),
                ShinsakaiIkenType.サービス利用への意見,
                new RString("審査会意見"),
                new RString("審査会メモ"),
                new RString("一次判定結果変更理由")));
    }

    private static NinteiResultIdo createNinteiResultIdo() {
        return spy(new NinteiResultIdo(NinteiResultIdoJiyuKubun.職権追加, new FlexibleDate("20140404")));
    }

    private static NinteiTorikeshi createNinteiTorikeshi() {
        return spy(new NinteiTorikeshi(new RString("認定取消理由"), new FlexibleDate("20140505")));
    }
}
