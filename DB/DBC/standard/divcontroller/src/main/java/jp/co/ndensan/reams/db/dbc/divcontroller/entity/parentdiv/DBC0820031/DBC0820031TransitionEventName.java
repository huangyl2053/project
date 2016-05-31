package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820031;

import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC0820031のイベント名定義クラスです</br>
 *
 * @reamsid_L DBC-1030-080 xuhao
 */
public enum DBC0820031TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    一覧に戻る("一覧に戻る"),
    基本情報("基本情報"),
    給付費明細("給付費明細"),
    特定診療費("特定診療費"),
    サービス計画費("サービス計画費"),
    特定入所者費用("特定入所者費用"),
    合計情報("合計情報"),
    緊急時施設療養費("緊急時施設療養費"),
    緊急時_所定疾患("緊急時_所定疾患"),
    食事費用("食事費用"),
    請求額集計("請求額集計"),
    給付費明細_住特("給付費明細_住特");

    private final RString name;

    private DBC0820031TransitionEventName(String name) {
        this.name = new RString(name);
    }

    /**
     * getName
     *
     * @return 名前
     */
    @Override
    public RString getName() {
        return name;
    }
// </editor-fold>
}
