package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5110001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Sat Mar 26 17:14:35 JST 2016
 */

import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;

/**
 * dgShinsainList_Row のクラスファイル
 *
 */
public class dgShinsainList_Row extends DataRow {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-01-15_09-59-03">

    private Boolean gogitaicho;
    private Boolean fukuGogitaicho;
    private RString shinsakaiIinCode;
    private RString shinsakaiIinShimei;
    private RString state;

    public dgShinsainList_Row() {
        super();
        this.gogitaicho = false;
        this.fukuGogitaicho = false;
        this.shinsakaiIinCode = RString.EMPTY;
        this.shinsakaiIinShimei = RString.EMPTY;
        this.state = RString.EMPTY;
        this.setOriginalData("gogitaicho", gogitaicho);
        this.setOriginalData("fukuGogitaicho", fukuGogitaicho);
        this.setOriginalData("shinsakaiIinCode", shinsakaiIinCode);
        this.setOriginalData("shinsakaiIinShimei", shinsakaiIinShimei);
        this.setOriginalData("state", state);
    }

    public dgShinsainList_Row(Boolean gogitaicho, Boolean fukuGogitaicho, RString shinsakaiIinCode, RString shinsakaiIinShimei, RString state) {
        super();
        this.setOriginalData("gogitaicho", gogitaicho);
        this.setOriginalData("fukuGogitaicho", fukuGogitaicho);
        this.setOriginalData("shinsakaiIinCode", shinsakaiIinCode);
        this.setOriginalData("shinsakaiIinShimei", shinsakaiIinShimei);
        this.setOriginalData("state", state);
        this.gogitaicho = gogitaicho;
        this.fukuGogitaicho = fukuGogitaicho;
        this.shinsakaiIinCode = shinsakaiIinCode;
        this.shinsakaiIinShimei = shinsakaiIinShimei;
        this.state = state;
    }

    public Boolean getGogitaicho() {
        return gogitaicho;
    }

    public Boolean getFukuGogitaicho() {
        return fukuGogitaicho;
    }

    public RString getShinsakaiIinCode() {
        return shinsakaiIinCode;
    }

    public RString getShinsakaiIinShimei() {
        return shinsakaiIinShimei;
    }

    public RString getState() {
        return state;
    }

    public void setGogitaicho(Boolean gogitaicho) {
        this.setOriginalData("gogitaicho", gogitaicho);
        this.gogitaicho = gogitaicho;
    }

    public void setFukuGogitaicho(Boolean fukuGogitaicho) {
        this.setOriginalData("fukuGogitaicho", fukuGogitaicho);
        this.fukuGogitaicho = fukuGogitaicho;
    }

    public void setShinsakaiIinCode(RString shinsakaiIinCode) {
        this.setOriginalData("shinsakaiIinCode", shinsakaiIinCode);
        this.shinsakaiIinCode = shinsakaiIinCode;
    }

    public void setShinsakaiIinShimei(RString shinsakaiIinShimei) {
        this.setOriginalData("shinsakaiIinShimei", shinsakaiIinShimei);
        this.shinsakaiIinShimei = shinsakaiIinShimei;
    }

    public void setState(RString state) {
        this.setOriginalData("state", state);
        this.state = state;
    }

    // </editor-fold>
}
