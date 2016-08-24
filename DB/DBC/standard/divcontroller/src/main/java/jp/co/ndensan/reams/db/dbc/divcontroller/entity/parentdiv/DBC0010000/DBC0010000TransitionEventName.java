package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0010000;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.core.ui.response.IContainerEvents;

/**
 * このコードはツールによって生成されました。</br>
 * このファイルへの変更は、再生成時には損失するため</br>
 * 不正な動作の原因になります。</br>
 * DBC0010000のイベント名定義クラスです</br>
 *
 * @author 自動生成
 */
public enum DBC0010000TransitionEventName implements IContainerEvents {
// <editor-fold defaultstate="collapsed" desc="Created By UI Designer ver 1.0.0">

    給付実績照会検索一覧("給付実績照会検索一覧"),
    完了("完了"),
    基本情報("基本情報"),
    明細集計("明細集計"),
    緊急時施設療養費("緊急時施設療養費"),
    所定疾患施設療養費("所定疾患施設療養費"),
    特定診療費("特定診療費"),
    食事費用("食事費用"),
    居宅サービス計画費("居宅サービス計画費"),
    福祉用具購入費("福祉用具購入費"),
    住宅改修費("住宅改修費"),
    高額介護サービス費("高額介護サービス費"),
    特定入所者費用("特定入所者費用"),
    社福軽減費("社福軽減費"),
    ケアマネジメント費("ケアマネジメント費"),
    対象者検索("対象者検索"),
    対象者検索一覧("対象者検索一覧");

    private final RString name;

    private DBC0010000TransitionEventName(String name) {
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
