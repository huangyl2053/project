package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.ShokanShinseiList.ShokanShinseiList.IShokanShinseiListDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.ShokanShinseiList.ShokanShinseiList.ShokanShinseiListDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * panelShokan のクラスファイル
 *
 * @reamsid_L DBC-1010-130 panhe
 */
public class panelShokanDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ccdShokanShinseiList")
    private ShokanShinseiListDiv ccdShokanShinseiList;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getccdShokanShinseiList
     * @return ccdShokanShinseiList
     */
    @JsonProperty("ccdShokanShinseiList")
    public IShokanShinseiListDiv getCcdShokanShinseiList() {
        return ccdShokanShinseiList;
    }

    // </editor-fold>
}