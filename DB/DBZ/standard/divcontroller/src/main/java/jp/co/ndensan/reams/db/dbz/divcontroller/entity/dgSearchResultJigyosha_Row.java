package jp.co.ndensan.reams.db.dbz.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Wed May 14 17:50:26 JST 2014 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.ui.binding.Button;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.TextBoxFlexibleDate;


/**
 * dgSearchResultJigyosha_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgSearchResultJigyosha_Row extends DataRow {

    private Button select;
    private RString jigyoshaCode;
    private RString jigyoshaMeisho;
    private RString jigyosha;
    private RString jusho;
    private RString service;
    private TextBoxFlexibleDate ninteiKaishiDate;
    private TextBoxFlexibleDate ninteiShuryoDate;
    private RString keigenTaisho;

    public dgSearchResultJigyosha_Row() {
        super();
    }

    public dgSearchResultJigyosha_Row(Button select, RString jigyoshaCode, RString jigyoshaMeisho, RString jigyosha, RString jusho, RString service, TextBoxFlexibleDate ninteiKaishiDate, TextBoxFlexibleDate ninteiShuryoDate, RString keigenTaisho) {
        super();
        this.setOriginalData("select", select);
        this.setOriginalData("jigyoshaCode", jigyoshaCode);
        this.setOriginalData("jigyoshaMeisho", jigyoshaMeisho);
        this.setOriginalData("jigyosha", jigyosha);
        this.setOriginalData("jusho", jusho);
        this.setOriginalData("service", service);
        this.setOriginalData("ninteiKaishiDate", ninteiKaishiDate);
        this.setOriginalData("ninteiShuryoDate", ninteiShuryoDate);
        this.setOriginalData("keigenTaisho", keigenTaisho);
        this.select = select;
        this.jigyoshaCode = jigyoshaCode;
        this.jigyoshaMeisho = jigyoshaMeisho;
        this.jigyosha = jigyosha;
        this.jusho = jusho;
        this.service = service;
        this.ninteiKaishiDate = ninteiKaishiDate;
        this.ninteiShuryoDate = ninteiShuryoDate;
        this.keigenTaisho = keigenTaisho;
    }

    public Button getSelect() {
        return select;
    }

    public RString getJigyoshaCode() {
        return jigyoshaCode;
    }

    public RString getJigyoshaMeisho() {
        return jigyoshaMeisho;
    }

    public RString getJigyosha() {
        return jigyosha;
    }

    public RString getJusho() {
        return jusho;
    }

    public RString getService() {
        return service;
    }

    public TextBoxFlexibleDate getNinteiKaishiDate() {
        return ninteiKaishiDate;
    }

    public TextBoxFlexibleDate getNinteiShuryoDate() {
        return ninteiShuryoDate;
    }

    public RString getKeigenTaisho() {
        return keigenTaisho;
    }

    public void setSelect(Button select) {
        this.setOriginalData("select", select);
        this.select = select;
    }

    public void setJigyoshaCode(RString jigyoshaCode) {
        this.setOriginalData("jigyoshaCode", jigyoshaCode);
        this.jigyoshaCode = jigyoshaCode;
    }

    public void setJigyoshaMeisho(RString jigyoshaMeisho) {
        this.setOriginalData("jigyoshaMeisho", jigyoshaMeisho);
        this.jigyoshaMeisho = jigyoshaMeisho;
    }

    public void setJigyosha(RString jigyosha) {
        this.setOriginalData("jigyosha", jigyosha);
        this.jigyosha = jigyosha;
    }

    public void setJusho(RString jusho) {
        this.setOriginalData("jusho", jusho);
        this.jusho = jusho;
    }

    public void setService(RString service) {
        this.setOriginalData("service", service);
        this.service = service;
    }

    public void setNinteiKaishiDate(TextBoxFlexibleDate ninteiKaishiDate) {
        this.setOriginalData("ninteiKaishiDate", ninteiKaishiDate);
        this.ninteiKaishiDate = ninteiKaishiDate;
    }

    public void setNinteiShuryoDate(TextBoxFlexibleDate ninteiShuryoDate) {
        this.setOriginalData("ninteiShuryoDate", ninteiShuryoDate);
        this.ninteiShuryoDate = ninteiShuryoDate;
    }

    public void setKeigenTaisho(RString keigenTaisho) {
        this.setOriginalData("keigenTaisho", keigenTaisho);
        this.keigenTaisho = keigenTaisho;
    }

}