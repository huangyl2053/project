package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2210001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Sat Jan 23 18:01:59 CST 2016 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.lang.RString;


/**
 * dgRiyoShisetsu_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgRiyoShisetsu_Row extends DataRow {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">

    private Boolean shisetsuRiyoUmu;
    private RString shisetsuRiyoName;

    public dgRiyoShisetsu_Row() {
        super();
        this.shisetsuRiyoUmu = false;
        this.shisetsuRiyoName = RString.EMPTY;
        this.setOriginalData("shisetsuRiyoUmu", shisetsuRiyoUmu);
        this.setOriginalData("shisetsuRiyoName", shisetsuRiyoName);
    }

    public dgRiyoShisetsu_Row(Boolean shisetsuRiyoUmu, RString shisetsuRiyoName) {
        super();
        this.setOriginalData("shisetsuRiyoUmu", shisetsuRiyoUmu);
        this.setOriginalData("shisetsuRiyoName", shisetsuRiyoName);
        this.shisetsuRiyoUmu = shisetsuRiyoUmu;
        this.shisetsuRiyoName = shisetsuRiyoName;
    }

    public Boolean getShisetsuRiyoUmu() {
        return shisetsuRiyoUmu;
    }

    public RString getShisetsuRiyoName() {
        return shisetsuRiyoName;
    }

    public void setShisetsuRiyoUmu(Boolean shisetsuRiyoUmu) {
        this.setOriginalData("shisetsuRiyoUmu", shisetsuRiyoUmu);
        this.shisetsuRiyoUmu = shisetsuRiyoUmu;
    }

    public void setShisetsuRiyoName(RString shisetsuRiyoName) {
        this.setOriginalData("shisetsuRiyoName", shisetsuRiyoName);
        this.shisetsuRiyoName = shisetsuRiyoName;
    }

    // </editor-fold>
}