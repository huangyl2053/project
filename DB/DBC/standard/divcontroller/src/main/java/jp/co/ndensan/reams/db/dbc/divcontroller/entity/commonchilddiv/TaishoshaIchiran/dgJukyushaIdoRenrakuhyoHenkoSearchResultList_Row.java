package jp.co.ndensan.reams.db.dbc.divcontroller.entity.commonchilddiv.TaishoshaIchiran;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Thu May 26 13:33:08 JST 2016 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxCode;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;


/**
 * dgJukyushaIdoRenrakuhyoHenkoSearchResultList_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgJukyushaIdoRenrakuhyoHenkoSearchResultList_Row extends DataRow {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">

    private TextBoxDate txtResultIdoDate;
    private RString txtTaishoNengetsu;
    private TextBoxCode txtResultHihoNo;
    private TextBox txtResultHihoName;
    private RString txtRirekiNo;
    private RString txtDeleteFlag;

    public dgJukyushaIdoRenrakuhyoHenkoSearchResultList_Row() {
        super();
        this.txtResultIdoDate = new TextBoxDate();
        this.txtTaishoNengetsu = RString.EMPTY;
        this.txtResultHihoNo = new TextBoxCode();
        this.txtResultHihoName = new TextBox();
        this.txtRirekiNo = RString.EMPTY;
        this.txtDeleteFlag = RString.EMPTY;
        this.setOriginalData("txtResultIdoDate", txtResultIdoDate);
        this.setOriginalData("txtTaishoNengetsu", txtTaishoNengetsu);
        this.setOriginalData("txtResultHihoNo", txtResultHihoNo);
        this.setOriginalData("txtResultHihoName", txtResultHihoName);
        this.setOriginalData("txtRirekiNo", txtRirekiNo);
        this.setOriginalData("txtDeleteFlag", txtDeleteFlag);
    }

    public dgJukyushaIdoRenrakuhyoHenkoSearchResultList_Row(TextBoxDate txtResultIdoDate, RString txtTaishoNengetsu, TextBoxCode txtResultHihoNo, TextBox txtResultHihoName, RString txtRirekiNo, RString txtDeleteFlag) {
        super();
        this.setOriginalData("txtResultIdoDate", txtResultIdoDate);
        this.setOriginalData("txtTaishoNengetsu", txtTaishoNengetsu);
        this.setOriginalData("txtResultHihoNo", txtResultHihoNo);
        this.setOriginalData("txtResultHihoName", txtResultHihoName);
        this.setOriginalData("txtRirekiNo", txtRirekiNo);
        this.setOriginalData("txtDeleteFlag", txtDeleteFlag);
        this.txtResultIdoDate = txtResultIdoDate;
        this.txtTaishoNengetsu = txtTaishoNengetsu;
        this.txtResultHihoNo = txtResultHihoNo;
        this.txtResultHihoName = txtResultHihoName;
        this.txtRirekiNo = txtRirekiNo;
        this.txtDeleteFlag = txtDeleteFlag;
    }

    public TextBoxDate getTxtResultIdoDate() {
        return txtResultIdoDate;
    }

    public RString getTxtTaishoNengetsu() {
        return txtTaishoNengetsu;
    }

    public TextBoxCode getTxtResultHihoNo() {
        return txtResultHihoNo;
    }

    public TextBox getTxtResultHihoName() {
        return txtResultHihoName;
    }

    public RString getTxtRirekiNo() {
        return txtRirekiNo;
    }

    public RString getTxtDeleteFlag() {
        return txtDeleteFlag;
    }

    public void setTxtResultIdoDate(TextBoxDate txtResultIdoDate) {
        this.setOriginalData("txtResultIdoDate", txtResultIdoDate);
        this.txtResultIdoDate = txtResultIdoDate;
    }

    public void setTxtTaishoNengetsu(RString txtTaishoNengetsu) {
        this.setOriginalData("txtTaishoNengetsu", txtTaishoNengetsu);
        this.txtTaishoNengetsu = txtTaishoNengetsu;
    }

    public void setTxtResultHihoNo(TextBoxCode txtResultHihoNo) {
        this.setOriginalData("txtResultHihoNo", txtResultHihoNo);
        this.txtResultHihoNo = txtResultHihoNo;
    }

    public void setTxtResultHihoName(TextBox txtResultHihoName) {
        this.setOriginalData("txtResultHihoName", txtResultHihoName);
        this.txtResultHihoName = txtResultHihoName;
    }

    public void setTxtRirekiNo(RString txtRirekiNo) {
        this.setOriginalData("txtRirekiNo", txtRirekiNo);
        this.txtRirekiNo = txtRirekiNo;
    }

    public void setTxtDeleteFlag(RString txtDeleteFlag) {
        this.setOriginalData("txtDeleteFlag", txtDeleteFlag);
        this.txtDeleteFlag = txtDeleteFlag;
    }

    // </editor-fold>
}
