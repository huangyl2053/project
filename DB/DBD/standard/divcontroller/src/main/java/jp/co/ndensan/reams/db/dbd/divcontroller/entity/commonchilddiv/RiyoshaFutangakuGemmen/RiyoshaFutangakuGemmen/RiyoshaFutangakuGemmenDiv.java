package jp.co.ndensan.reams.db.dbd.divcontroller.entity.commonchilddiv.RiyoshaFutangakuGemmen.RiyoshaFutangakuGemmen;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

/**
 * RiyoshaFutangakuGemmen のクラスファイル 
 * 
 * @author 自動生成
 */
public class RiyoshaFutangakuGemmenDiv extends Panel implements IRiyoshaFutangakuGemmenDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgRiyoshaFutangakuGemmenList")
    private DataGrid<dgRiyoshaFutangakuGemmenList_Row> dgRiyoshaFutangakuGemmenList;
    @JsonProperty("RiyoshaFutangakuGemmenDetail")
    private RiyoshaFutangakuGemmenDetailDiv RiyoshaFutangakuGemmenDetail;
    @JsonProperty("btnClose")
    private Button btnClose;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgRiyoshaFutangakuGemmenList
     * @return dgRiyoshaFutangakuGemmenList
     */
    @JsonProperty("dgRiyoshaFutangakuGemmenList")
    public DataGrid<dgRiyoshaFutangakuGemmenList_Row> getDgRiyoshaFutangakuGemmenList() {
        return dgRiyoshaFutangakuGemmenList;
    }

    /*
     * setdgRiyoshaFutangakuGemmenList
     * @param dgRiyoshaFutangakuGemmenList dgRiyoshaFutangakuGemmenList
     */
    @JsonProperty("dgRiyoshaFutangakuGemmenList")
    public void setDgRiyoshaFutangakuGemmenList(DataGrid<dgRiyoshaFutangakuGemmenList_Row> dgRiyoshaFutangakuGemmenList) {
        this.dgRiyoshaFutangakuGemmenList = dgRiyoshaFutangakuGemmenList;
    }

    /*
     * getRiyoshaFutangakuGemmenDetail
     * @return RiyoshaFutangakuGemmenDetail
     */
    @JsonProperty("RiyoshaFutangakuGemmenDetail")
    public RiyoshaFutangakuGemmenDetailDiv getRiyoshaFutangakuGemmenDetail() {
        return RiyoshaFutangakuGemmenDetail;
    }

    /*
     * setRiyoshaFutangakuGemmenDetail
     * @param RiyoshaFutangakuGemmenDetail RiyoshaFutangakuGemmenDetail
     */
    @JsonProperty("RiyoshaFutangakuGemmenDetail")
    public void setRiyoshaFutangakuGemmenDetail(RiyoshaFutangakuGemmenDetailDiv RiyoshaFutangakuGemmenDetail) {
        this.RiyoshaFutangakuGemmenDetail = RiyoshaFutangakuGemmenDetail;
    }

    /*
     * getbtnClose
     * @return btnClose
     */
    @JsonProperty("btnClose")
    public Button getBtnClose() {
        return btnClose;
    }

    /*
     * setbtnClose
     * @param btnClose btnClose
     */
    @JsonProperty("btnClose")
    public void setBtnClose(Button btnClose) {
        this.btnClose = btnClose;
    }

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}
