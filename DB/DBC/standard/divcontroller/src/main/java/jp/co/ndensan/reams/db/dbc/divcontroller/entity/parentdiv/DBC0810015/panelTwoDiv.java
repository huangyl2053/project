package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0810015;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.ShokanbaraiketteiJoho.ShokanbaraiketteiJoho.IShokanbaraiketteiJohoDiv;
import jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.ShokanbaraiketteiJoho.ShokanbaraiketteiJoho.ShokanbaraiketteiJohoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.HorizontalLine;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;

/**
 * panelTwo のクラスファイル
 *
 * @reamsid_L DBC-1010-110 xuhao
 */
public class panelTwoDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("hlUp")
    private HorizontalLine hlUp;
    @JsonProperty("btnShinsei")
    private Button btnShinsei;
    @JsonProperty("btnKouza")
    private Button btnKouza;
    @JsonProperty("btnServiceTeikyoShomeisyo")
    private Button btnServiceTeikyoShomeisyo;
    @JsonProperty("btnShokanbariKeteiInfo")
    private Button btnShokanbariKeteiInfo;
    @JsonProperty("hlDown")
    private HorizontalLine hlDown;
    @JsonProperty("txtServiceTeikyoYM")
    private TextBoxDate txtServiceTeikyoYM;
    @JsonProperty("txtSeiriBango")
    private TextBoxCode txtSeiriBango;
    @JsonProperty("ccdShokanbaraiketteiJoho")
    private ShokanbaraiketteiJohoDiv ccdShokanbaraiketteiJoho;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gethlUp
     * @return hlUp
     */
    @JsonProperty("hlUp")
    public HorizontalLine getHlUp() {
        return hlUp;
    }

    /*
     * sethlUp
     * @param hlUp hlUp
     */
    @JsonProperty("hlUp")
    public void setHlUp(HorizontalLine hlUp) {
        this.hlUp = hlUp;
    }

    /*
     * getbtnShinsei
     * @return btnShinsei
     */
    @JsonProperty("btnShinsei")
    public Button getBtnShinsei() {
        return btnShinsei;
    }

    /*
     * setbtnShinsei
     * @param btnShinsei btnShinsei
     */
    @JsonProperty("btnShinsei")
    public void setBtnShinsei(Button btnShinsei) {
        this.btnShinsei = btnShinsei;
    }

    /*
     * getbtnKouza
     * @return btnKouza
     */
    @JsonProperty("btnKouza")
    public Button getBtnKouza() {
        return btnKouza;
    }

    /*
     * setbtnKouza
     * @param btnKouza btnKouza
     */
    @JsonProperty("btnKouza")
    public void setBtnKouza(Button btnKouza) {
        this.btnKouza = btnKouza;
    }

    /*
     * getbtnServiceTeikyoShomeisyo
     * @return btnServiceTeikyoShomeisyo
     */
    @JsonProperty("btnServiceTeikyoShomeisyo")
    public Button getBtnServiceTeikyoShomeisyo() {
        return btnServiceTeikyoShomeisyo;
    }

    /*
     * setbtnServiceTeikyoShomeisyo
     * @param btnServiceTeikyoShomeisyo btnServiceTeikyoShomeisyo
     */
    @JsonProperty("btnServiceTeikyoShomeisyo")
    public void setBtnServiceTeikyoShomeisyo(Button btnServiceTeikyoShomeisyo) {
        this.btnServiceTeikyoShomeisyo = btnServiceTeikyoShomeisyo;
    }

    /*
     * getbtnShokanbariKeteiInfo
     * @return btnShokanbariKeteiInfo
     */
    @JsonProperty("btnShokanbariKeteiInfo")
    public Button getBtnShokanbariKeteiInfo() {
        return btnShokanbariKeteiInfo;
    }

    /*
     * setbtnShokanbariKeteiInfo
     * @param btnShokanbariKeteiInfo btnShokanbariKeteiInfo
     */
    @JsonProperty("btnShokanbariKeteiInfo")
    public void setBtnShokanbariKeteiInfo(Button btnShokanbariKeteiInfo) {
        this.btnShokanbariKeteiInfo = btnShokanbariKeteiInfo;
    }

    /*
     * gethlDown
     * @return hlDown
     */
    @JsonProperty("hlDown")
    public HorizontalLine getHlDown() {
        return hlDown;
    }

    /*
     * sethlDown
     * @param hlDown hlDown
     */
    @JsonProperty("hlDown")
    public void setHlDown(HorizontalLine hlDown) {
        this.hlDown = hlDown;
    }

    /*
     * gettxtServiceTeikyoYM
     * @return txtServiceTeikyoYM
     */
    @JsonProperty("txtServiceTeikyoYM")
    public TextBoxDate getTxtServiceTeikyoYM() {
        return txtServiceTeikyoYM;
    }

    /*
     * settxtServiceTeikyoYM
     * @param txtServiceTeikyoYM txtServiceTeikyoYM
     */
    @JsonProperty("txtServiceTeikyoYM")
    public void setTxtServiceTeikyoYM(TextBoxDate txtServiceTeikyoYM) {
        this.txtServiceTeikyoYM = txtServiceTeikyoYM;
    }

    /*
     * gettxtSeiriBango
     * @return txtSeiriBango
     */
    @JsonProperty("txtSeiriBango")
    public TextBoxCode getTxtSeiriBango() {
        return txtSeiriBango;
    }

    /*
     * settxtSeiriBango
     * @param txtSeiriBango txtSeiriBango
     */
    @JsonProperty("txtSeiriBango")
    public void setTxtSeiriBango(TextBoxCode txtSeiriBango) {
        this.txtSeiriBango = txtSeiriBango;
    }

    /*
     * getccdShokanbaraiketteiJoho
     * @return ccdShokanbaraiketteiJoho
     */
    @JsonProperty("ccdShokanbaraiketteiJoho")
    public IShokanbaraiketteiJohoDiv getCcdShokanbaraiketteiJoho() {
        return ccdShokanbaraiketteiJoho;
    }

    // </editor-fold>
}