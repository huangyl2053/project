package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA2010013;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JigyoshaShurui のクラスファイル 
 * 
 */
public class JigyoshaShuruiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radServiceShurui")
    private RadioButton radServiceShurui;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradServiceShurui
     * @return radServiceShurui
     */
    @JsonProperty("radServiceShurui")
    public RadioButton getRadServiceShurui() {
        return radServiceShurui;
    }

    /*
     * setradServiceShurui
     * @param radServiceShurui radServiceShurui
     */
    @JsonProperty("radServiceShurui")
    public void setRadServiceShurui(RadioButton radServiceShurui) {
        this.radServiceShurui = radServiceShurui;
    }

    // </editor-fold>
}
