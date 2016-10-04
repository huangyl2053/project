/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.sogojigyohikagomoshitateshojohosofuIchiran;

import java.util.Collections;
import java.util.List;
import jp.co.ndensan.reams.db.dbc.business.report.kaigokyufuhikagomoshitateshoout.KaigokyufuhiKagoMoshitateshoOutOutPutOrder;
import jp.co.ndensan.reams.db.dbc.entity.report.sogojigyohikagomoshitateshojohosofuIchiran.SogojigyohiKagoMoshitateshojohoSofuIchiranSource;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.report.ReportLineRecord;
import jp.co.ndensan.reams.uz.uza.report.source.breaks.PageBreaker;

/**
 *
 * 帳票設計_DBC200046_総合事業費（経過措置）過誤申立書情報送付一覧表のPageBreakクラスです
 *
 * @reamsid_L DBC-2530-031 jiangwenkai
 */
public class SogojigyohiKagoMoshitateshojohoSofuIchiranPageBreak extends PageBreaker<SogojigyohiKagoMoshitateshojohoSofuIchiranSource> {

    private final List<RString> breakKeysList;

    /**
     * breakKeysの構造方法です
     *
     * @param breakKeys ページングキー
     */
    public SogojigyohiKagoMoshitateshojohoSofuIchiranPageBreak(List<RString> breakKeys) {
        this.breakKeysList = Collections.unmodifiableList(breakKeys);
    }

    @Override
    public List<RString> breakKeys() {
        return breakKeysList;
    }

    @Override
    public boolean isBreak(ReportLineRecord<SogojigyohiKagoMoshitateshojohoSofuIchiranSource> currentSource,
            ReportLineRecord<SogojigyohiKagoMoshitateshojohoSofuIchiranSource> nextSource) {
        boolean flag = false;
        if (!currentSource.getSource().shokisaiHokenshaNo.equals(nextSource.getSource().shokisaiHokenshaNo)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.郵便番号.get項目ID())
                && !currentSource.getSource().listUpper_11.equals(nextSource.getSource().listUpper_11)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.町域コード.get項目ID())
                && !currentSource.getSource().listUpper_12.equals(nextSource.getSource().listUpper_11)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.行政区コード.get項目ID())
                && !currentSource.getSource().listUpper_13.equals(nextSource.getSource().listUpper_11)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.氏名５０音カナ.get項目ID())
                && !currentSource.getSource().listUpper_14.equals(nextSource.getSource().listUpper_11)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.市町村コード.get項目ID())
                && !currentSource.getSource().listUpper_15.equals(nextSource.getSource().listUpper_11)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.被保険者番号.get項目ID())
                && !currentSource.getSource().listUpper_4.equals(nextSource.getSource().listUpper_4)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.事業者番号.get項目ID())
                && !currentSource.getSource().listUpper_2.equals(nextSource.getSource().listUpper_2)) {
            flag = true;
        } else if (this.breakKeysList.contains(KaigokyufuhiKagoMoshitateshoOutOutPutOrder.サービス提供年月.get項目ID())
                && !currentSource.getSource().listUpper_6.equals(nextSource.getSource().listUpper_6)) {
            flag = true;
        }
        return flag;
    }
}