/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.ketteitsuchisho;

import java.util.List;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.HonSanteiKetteiTsuchiShoJoho;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護保険料額決定通知書のパラメータクラスです。
 *
 * @reamsid_L DBB-9080-010 sunhaidi
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KaigoHokenHokenryogakuKetteiTsuchishoJoho {

    private RString 文書番号;
    private HonSanteiKetteiTsuchiShoJoho 本算定決定通知書情報;
    private RString 通知書定型文;
    private List<RString> 調定事由リスト;
}