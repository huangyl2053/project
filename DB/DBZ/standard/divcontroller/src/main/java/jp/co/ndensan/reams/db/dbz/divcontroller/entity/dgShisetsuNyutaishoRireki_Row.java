package jp.co.ndensan.reams.db.dbz.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Mon May 19 19:52:35 JST 2014 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxFlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;


/**
 * dgShisetsuNyutaishoRireki_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgShisetsuNyutaishoRireki_Row extends DataRow {

    private Button btnSelect;
    private Button btnDelete;
    private TextBoxFlexibleDate nyushoDate;
    private TextBoxFlexibleDate taishoDate;
    private RString shisetsuCode;
    private RString shisetsuMeisho;
    private RString shisetsu;
    private RString taishoJoho;
    private RString shisetsuShurui;

    public dgShisetsuNyutaishoRireki_Row() {
        super();
    }

    public dgShisetsuNyutaishoRireki_Row(Button btnSelect, Button btnDelete, TextBoxFlexibleDate nyushoDate, TextBoxFlexibleDate taishoDate, RString shisetsuCode, RString shisetsuMeisho, RString shisetsu, RString taishoJoho, RString shisetsuShurui) {
        super();
        this.setOriginalData("btnSelect", btnSelect);
        this.setOriginalData("btnDelete", btnDelete);
        this.setOriginalData("nyushoDate", nyushoDate);
        this.setOriginalData("taishoDate", taishoDate);
        this.setOriginalData("shisetsuCode", shisetsuCode);
        this.setOriginalData("shisetsuMeisho", shisetsuMeisho);
        this.setOriginalData("shisetsu", shisetsu);
        this.setOriginalData("taishoJoho", taishoJoho);
        this.setOriginalData("shisetsuShurui", shisetsuShurui);
        this.btnSelect = btnSelect;
        this.btnDelete = btnDelete;
        this.nyushoDate = nyushoDate;
        this.taishoDate = taishoDate;
        this.shisetsuCode = shisetsuCode;
        this.shisetsuMeisho = shisetsuMeisho;
        this.shisetsu = shisetsu;
        this.taishoJoho = taishoJoho;
        this.shisetsuShurui = shisetsuShurui;
    }

    public Button getBtnSelect() {
        return btnSelect;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public TextBoxFlexibleDate getNyushoDate() {
        return nyushoDate;
    }

    public TextBoxFlexibleDate getTaishoDate() {
        return taishoDate;
    }

    public RString getShisetsuCode() {
        return shisetsuCode;
    }

    public RString getShisetsuMeisho() {
        return shisetsuMeisho;
    }

    public RString getShisetsu() {
        return shisetsu;
    }

    public RString getTaishoJoho() {
        return taishoJoho;
    }

    public RString getShisetsuShurui() {
        return shisetsuShurui;
    }

    public void setBtnSelect(Button btnSelect) {
        this.setOriginalData("btnSelect", btnSelect);
        this.btnSelect = btnSelect;
    }

    public void setBtnDelete(Button btnDelete) {
        this.setOriginalData("btnDelete", btnDelete);
        this.btnDelete = btnDelete;
    }

    public void setNyushoDate(TextBoxFlexibleDate nyushoDate) {
        this.setOriginalData("nyushoDate", nyushoDate);
        this.nyushoDate = nyushoDate;
    }

    public void setTaishoDate(TextBoxFlexibleDate taishoDate) {
        this.setOriginalData("taishoDate", taishoDate);
        this.taishoDate = taishoDate;
    }

    public void setShisetsuCode(RString shisetsuCode) {
        this.setOriginalData("shisetsuCode", shisetsuCode);
        this.shisetsuCode = shisetsuCode;
    }

    public void setShisetsuMeisho(RString shisetsuMeisho) {
        this.setOriginalData("shisetsuMeisho", shisetsuMeisho);
        this.shisetsuMeisho = shisetsuMeisho;
    }

    public void setShisetsu(RString shisetsu) {
        this.setOriginalData("shisetsu", shisetsu);
        this.shisetsu = shisetsu;
    }

    public void setTaishoJoho(RString taishoJoho) {
        this.setOriginalData("taishoJoho", taishoJoho);
        this.taishoJoho = taishoJoho;
    }

    public void setShisetsuShurui(RString shisetsuShurui) {
        this.setOriginalData("shisetsuShurui", shisetsuShurui);
        this.shisetsuShurui = shisetsuShurui;
    }

}