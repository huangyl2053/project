package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0020091;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;

/**
 * pnlDaini のクラスファイル
 *
 * @reamsid_L DBU-1100-080 lijunjun
 */
public class pnlDainiDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("tbp3")
    private tbp3Div tbp3;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * gettbp3
     * @return tbp3
     */
    @JsonProperty("tbp3")
    public tbp3Div getTbp3() {
        return tbp3;
    }

    /*
     * settbp3
     * @param tbp3 tbp3
     */
    @JsonProperty("tbp3")
    public void setTbp3(tbp3Div tbp3) {
        this.tbp3 = tbp3;
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKensu1() {
        return this.getTbp3().getTxtRiyoshaDainiKensu1();
    }

    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKensu2() {
        return this.getTbp3().getTxtRiyoshaDainiKensu2();
    }

    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKensu3() {
        return this.getTbp3().getTxtRiyoshaDainiKensu3();
    }

    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKyufugaku1() {
        return this.getTbp3().getTxtRiyoshaDainiKyufugaku1();
    }

    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKyufugaku2() {
        return this.getTbp3().getTxtRiyoshaDainiKyufugaku2();
    }

    @JsonIgnore
    public TextBoxNum getTxtRiyoshaDainiKyufugaku3() {
        return this.getTbp3().getTxtRiyoshaDainiKyufugaku3();
    }

    // </editor-fold>
}