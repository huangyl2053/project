package jp.co.ndensan.reams.db.dbu.divcontroller.entity.dbu0600011;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Fri Jun 13 17:14:02 JST 2014 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.ui.binding.ButtonDialog;
import jp.co.ndensan.reams.uz.uza.lang.RString;


/**
 * dgSogoShokaiKyufuKagoMoushitateshoList_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgSogoShokaiKyufuKagoMoushitateshoList_Row extends DataRow {

    private ButtonDialog btnSelect;
    private RString txtMoushitateYMD;
    private RString txtJigyosha;
    private RString txtTeikyoYM;
    private RString txtRiyu;

    public dgSogoShokaiKyufuKagoMoushitateshoList_Row() {
        super();
        this.btnSelect = new ButtonDialog();
        this.txtMoushitateYMD = RString.EMPTY;
        this.txtJigyosha = RString.EMPTY;
        this.txtTeikyoYM = RString.EMPTY;
        this.txtRiyu = RString.EMPTY;
    }

    public dgSogoShokaiKyufuKagoMoushitateshoList_Row(ButtonDialog btnSelect, RString txtMoushitateYMD, RString txtJigyosha, RString txtTeikyoYM, RString txtRiyu) {
        super();
        this.setOriginalData("btnSelect", btnSelect);
        this.setOriginalData("txtMoushitateYMD", txtMoushitateYMD);
        this.setOriginalData("txtJigyosha", txtJigyosha);
        this.setOriginalData("txtTeikyoYM", txtTeikyoYM);
        this.setOriginalData("txtRiyu", txtRiyu);
        this.btnSelect = btnSelect;
        this.txtMoushitateYMD = txtMoushitateYMD;
        this.txtJigyosha = txtJigyosha;
        this.txtTeikyoYM = txtTeikyoYM;
        this.txtRiyu = txtRiyu;
    }

    public ButtonDialog getBtnSelect() {
        return btnSelect;
    }

    public RString getTxtMoushitateYMD() {
        return txtMoushitateYMD;
    }

    public RString getTxtJigyosha() {
        return txtJigyosha;
    }

    public RString getTxtTeikyoYM() {
        return txtTeikyoYM;
    }

    public RString getTxtRiyu() {
        return txtRiyu;
    }

    public void setBtnSelect(ButtonDialog btnSelect) {
        this.setOriginalData("btnSelect", btnSelect);
        this.btnSelect = btnSelect;
    }

    public void setTxtMoushitateYMD(RString txtMoushitateYMD) {
        this.setOriginalData("txtMoushitateYMD", txtMoushitateYMD);
        this.txtMoushitateYMD = txtMoushitateYMD;
    }

    public void setTxtJigyosha(RString txtJigyosha) {
        this.setOriginalData("txtJigyosha", txtJigyosha);
        this.txtJigyosha = txtJigyosha;
    }

    public void setTxtTeikyoYM(RString txtTeikyoYM) {
        this.setOriginalData("txtTeikyoYM", txtTeikyoYM);
        this.txtTeikyoYM = txtTeikyoYM;
    }

    public void setTxtRiyu(RString txtRiyu) {
        this.setOriginalData("txtRiyu", txtRiyu);
        this.txtRiyu = txtRiyu;
    }

}