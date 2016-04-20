package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810029;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC0810029のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBC0810029TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    サービス提供証明書へ戻る("サービス提供証明書へ戻る"),
    基本情報へ("基本情報へ"),
    給付費明細へ("給付費明細へ"),
    特定診療費へ("特定診療費へ"),
    サービス計画費へ("サービス計画費へ"),
    特定入所者費用へ("特定入所者費用へ"),
    合計情報へ("合計情報へ"),
    緊急時施設療養費へ("緊急時施設療養費へ"),
    緊急時_所定疾患へ("緊急時_所定疾患へ"),
    請求額集計へ("請求額集計へ"),
    社福軽減額へ("社福軽減額へ"),
    給付費明細_住所地特例へ("給付費明細_住所地特例へ");

    private final RString name;

    private DBC0810029TransitionEventName(String name) {
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