package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC8020001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.RadioButton;

/**
 * IchiranhyoSakuseiShiji のクラスファイル
 *
 * @reamsid_L DBC-4870-010 zhouchuanlin
 */
public class IchiranhyoSakuseiShijiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-10-07_19-12-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radSiharaihohou")
    private RadioButton radSiharaihohou;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradSiharaihohou
     * @return radSiharaihohou
     */
    @JsonProperty("radSiharaihohou")
    public RadioButton getRadSiharaihohou() {
        return radSiharaihohou;
    }

    /*
     * setradSiharaihohou
     * @param radSiharaihohou radSiharaihohou
     */
    @JsonProperty("radSiharaihohou")
    public void setRadSiharaihohou(RadioButton radSiharaihohou) {
        this.radSiharaihohou = radSiharaihohou;
    }

    // </editor-fold>
}