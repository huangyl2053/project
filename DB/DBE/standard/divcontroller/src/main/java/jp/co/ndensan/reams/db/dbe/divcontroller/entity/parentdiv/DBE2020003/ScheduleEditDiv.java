package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2020003;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ScheduleEdit のクラスファイル 
 * 
 * @author 自動生成
 */
public class ScheduleEditDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("radScheduleEdit")
    private RadioButton radScheduleEdit;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getradScheduleEdit
     * @return radScheduleEdit
     */
    @JsonProperty("radScheduleEdit")
    public RadioButton getRadScheduleEdit() {
        return radScheduleEdit;
    }

    /*
     * setradScheduleEdit
     * @param radScheduleEdit radScheduleEdit
     */
    @JsonProperty("radScheduleEdit")
    public void setRadScheduleEdit(RadioButton radScheduleEdit) {
        this.radScheduleEdit = radScheduleEdit;
    }

    // </editor-fold>
}