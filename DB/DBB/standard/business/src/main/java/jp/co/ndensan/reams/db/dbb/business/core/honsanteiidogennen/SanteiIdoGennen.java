/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.core.honsanteiidogennen;

import java.util.List;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 画面div用パラメータのクラスです。
 *
 * @reamsid_L DBB-0880-020 lijunjun
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class SanteiIdoGennen {

    private FlexibleYear 調定年度;
    private FlexibleYear 賦課年度;
    private RString 処理対象;
    private YMDHMS 抽出開始日時;
    private YMDHMS 抽出終了日時;
    private RString 特徴捕捉分;
    private RString 依頼金額計算;
    private List<ChohyoMeter> 出力帳票一覧List;
    private RString 特徴_出力対象;
    private FlexibleDate 特徴_発行日;
    private RString 決定_チェックボックス;
    private RString 決定_文書番号;
    private FlexibleDate 決定_発行日;
    private RString 変更_チェックボックス;
    private RString 変更_対象者;
    private RString 変更_文書番号;
    private FlexibleDate 変更_発行日;
    private RString 納入_対象者;
    private RString 納入_口座振替者;
    private FlexibleDate 納入_発行日;
    private RString 納入_出力方法;
    private RString 納入_出力期;
    private RString 納入_生活保護対象者;
    private RString 納入_ページごとに山分け;
    private boolean 一括発行起動フラグ;
    private boolean 随時フラグ;
    private RString 算定期;
    private boolean 画面移動フラグ;
}
