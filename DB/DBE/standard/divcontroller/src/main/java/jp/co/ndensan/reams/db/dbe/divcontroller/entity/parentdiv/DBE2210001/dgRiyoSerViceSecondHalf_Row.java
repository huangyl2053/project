package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2210001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Sat Jan 23 18:01:59 CST 2016 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBox;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxNum;
import jp.co.ndensan.reams.uz.uza.lang.RString;


/**
 * dgRiyoSerViceSecondHalf_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgRiyoSerViceSecondHalf_Row extends DataRow {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">

    private TextBox serviceMeisho;
    private TextBoxNum serviceJokyo;
    private RString tani;

    public dgRiyoSerViceSecondHalf_Row() {
        super();
        this.serviceMeisho = new TextBox();
        this.serviceJokyo = new TextBoxNum();
        this.tani = RString.EMPTY;
        this.setOriginalData("serviceMeisho", serviceMeisho);
        this.setOriginalData("serviceJokyo", serviceJokyo);
        this.setOriginalData("tani", tani);
    }

    public dgRiyoSerViceSecondHalf_Row(TextBox serviceMeisho, TextBoxNum serviceJokyo, RString tani) {
        super();
        this.setOriginalData("serviceMeisho", serviceMeisho);
        this.setOriginalData("serviceJokyo", serviceJokyo);
        this.setOriginalData("tani", tani);
        this.serviceMeisho = serviceMeisho;
        this.serviceJokyo = serviceJokyo;
        this.tani = tani;
    }

    public TextBox getServiceMeisho() {
        return serviceMeisho;
    }

    public TextBoxNum getServiceJokyo() {
        return serviceJokyo;
    }

    public RString getTani() {
        return tani;
    }

    public void setServiceMeisho(TextBox serviceMeisho) {
        this.setOriginalData("serviceMeisho", serviceMeisho);
        this.serviceMeisho = serviceMeisho;
    }

    public void setServiceJokyo(TextBoxNum serviceJokyo) {
        this.setOriginalData("serviceJokyo", serviceJokyo);
        this.serviceJokyo = serviceJokyo;
    }

    public void setTani(RString tani) {
        this.setOriginalData("tani", tani);
        this.tani = tani;
    }

    // </editor-fold>
}
