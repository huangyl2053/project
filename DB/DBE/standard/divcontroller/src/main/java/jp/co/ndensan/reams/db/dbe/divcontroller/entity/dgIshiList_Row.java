package jp.co.ndensan.reams.db.dbe.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、以下の状況下で不正な動作の原因になったり、
 * コードが再生成されるときに損失したりします。
 * Fri Nov 28 15:28:53 JST 2014 
 */



import jp.co.ndensan.reams.uz.uza.ui.binding.DataRow;
import jp.co.ndensan.reams.uz.uza.lang.RString;


/**
 * dgIshiList_Row のクラスファイル 
 * 
 * @author 自動生成
 */

public class dgIshiList_Row extends DataRow {

    private RString ishiNo;
    private RString ishiName;

    public dgIshiList_Row() {
        super();
        this.ishiNo = RString.EMPTY;
        this.ishiName = RString.EMPTY;
    }

    public dgIshiList_Row(RString ishiNo, RString ishiName) {
        super();
        this.setOriginalData("ishiNo", ishiNo);
        this.setOriginalData("ishiName", ishiName);
        this.ishiNo = ishiNo;
        this.ishiName = ishiName;
    }

    public RString getIshiNo() {
        return ishiNo;
    }

    public RString getIshiName() {
        return ishiName;
    }

    public void setIshiNo(RString ishiNo) {
        this.setOriginalData("ishiNo", ishiNo);
        this.ishiNo = ishiNo;
    }

    public void setIshiName(RString ishiName) {
        this.setOriginalData("ishiName", ishiName);
        this.ishiName = ishiName;
    }

}