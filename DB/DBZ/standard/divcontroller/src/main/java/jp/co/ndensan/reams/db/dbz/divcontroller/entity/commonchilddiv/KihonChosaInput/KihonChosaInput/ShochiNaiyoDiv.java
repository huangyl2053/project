package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput.KihonChosaInput;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * ShochiNaiyo のクラスファイル 
 * 
 * @author 自動生成
 */
public class ShochiNaiyoDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnShochiNaiyo")
    private ButtonDialog btnShochiNaiyo;
    @JsonProperty("chkShochiNaiyo")
    private CheckBoxList chkShochiNaiyo;
    @JsonProperty("ShochiNaiyoShinseishoKanriNo")
    private RString ShochiNaiyoShinseishoKanriNo;
    @JsonProperty("isShochiNaiyoSelected")
    private RString isShochiNaiyoSelected;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnShochiNaiyo
     * @return btnShochiNaiyo
     */
    @JsonProperty("btnShochiNaiyo")
    public ButtonDialog getBtnShochiNaiyo() {
        return btnShochiNaiyo;
    }

    /*
     * setbtnShochiNaiyo
     * @param btnShochiNaiyo btnShochiNaiyo
     */
    @JsonProperty("btnShochiNaiyo")
    public void setBtnShochiNaiyo(ButtonDialog btnShochiNaiyo) {
        this.btnShochiNaiyo = btnShochiNaiyo;
    }

    /*
     * getchkShochiNaiyo
     * @return chkShochiNaiyo
     */
    @JsonProperty("chkShochiNaiyo")
    public CheckBoxList getChkShochiNaiyo() {
        return chkShochiNaiyo;
    }

    /*
     * setchkShochiNaiyo
     * @param chkShochiNaiyo chkShochiNaiyo
     */
    @JsonProperty("chkShochiNaiyo")
    public void setChkShochiNaiyo(CheckBoxList chkShochiNaiyo) {
        this.chkShochiNaiyo = chkShochiNaiyo;
    }

    /*
     * getShochiNaiyoShinseishoKanriNo
     * @return ShochiNaiyoShinseishoKanriNo
     */
    @JsonProperty("ShochiNaiyoShinseishoKanriNo")
    public RString getShochiNaiyoShinseishoKanriNo() {
        return ShochiNaiyoShinseishoKanriNo;
    }

    /*
     * setShochiNaiyoShinseishoKanriNo
     * @param ShochiNaiyoShinseishoKanriNo ShochiNaiyoShinseishoKanriNo
     */
    @JsonProperty("ShochiNaiyoShinseishoKanriNo")
    public void setShochiNaiyoShinseishoKanriNo(RString ShochiNaiyoShinseishoKanriNo) {
        this.ShochiNaiyoShinseishoKanriNo = ShochiNaiyoShinseishoKanriNo;
    }

    /*
     * getisShochiNaiyoSelected
     * @return isShochiNaiyoSelected
     */
    @JsonProperty("isShochiNaiyoSelected")
    public RString getIsShochiNaiyoSelected() {
        return isShochiNaiyoSelected;
    }

    /*
     * setisShochiNaiyoSelected
     * @param isShochiNaiyoSelected isShochiNaiyoSelected
     */
    @JsonProperty("isShochiNaiyoSelected")
    public void setIsShochiNaiyoSelected(RString isShochiNaiyoSelected) {
        this.isShochiNaiyoSelected = isShochiNaiyoSelected;
    }

    // </editor-fold>
}
