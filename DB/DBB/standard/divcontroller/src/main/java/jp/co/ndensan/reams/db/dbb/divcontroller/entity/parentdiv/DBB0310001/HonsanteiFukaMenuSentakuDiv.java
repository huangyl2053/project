package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0310001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * HonsanteiFukaMenuSentaku のクラスファイル
 *
 * @reamsid_L DBB-0780-010 xicongwang
 */
public class HonsanteiFukaMenuSentakuDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-05-30_13-18-33">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnHonsanteiFukaKeisan")
    private Button btnHonsanteiFukaKeisan;
    @JsonProperty("btnHonsanteiTsuchisho")
    private Button btnHonsanteiTsuchisho;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnHonsanteiFukaKeisan
     * @return btnHonsanteiFukaKeisan
     */
    @JsonProperty("btnHonsanteiFukaKeisan")
    public Button getBtnHonsanteiFukaKeisan() {
        return btnHonsanteiFukaKeisan;
    }

    /*
     * setbtnHonsanteiFukaKeisan
     * @param btnHonsanteiFukaKeisan btnHonsanteiFukaKeisan
     */
    @JsonProperty("btnHonsanteiFukaKeisan")
    public void setBtnHonsanteiFukaKeisan(Button btnHonsanteiFukaKeisan) {
        this.btnHonsanteiFukaKeisan = btnHonsanteiFukaKeisan;
    }

    /*
     * getbtnHonsanteiTsuchisho
     * @return btnHonsanteiTsuchisho
     */
    @JsonProperty("btnHonsanteiTsuchisho")
    public Button getBtnHonsanteiTsuchisho() {
        return btnHonsanteiTsuchisho;
    }

    /*
     * setbtnHonsanteiTsuchisho
     * @param btnHonsanteiTsuchisho btnHonsanteiTsuchisho
     */
    @JsonProperty("btnHonsanteiTsuchisho")
    public void setBtnHonsanteiTsuchisho(Button btnHonsanteiTsuchisho) {
        this.btnHonsanteiTsuchisho = btnHonsanteiTsuchisho;
    }

    // </editor-fold>
}
