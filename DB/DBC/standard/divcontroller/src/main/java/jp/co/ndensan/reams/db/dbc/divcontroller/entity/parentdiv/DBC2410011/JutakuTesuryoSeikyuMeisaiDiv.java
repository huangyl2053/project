package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC2410011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * JutakuTesuryoSeikyuMeisai のクラスファイル 
 * 
 * @author 自動生成
 */
public class JutakuTesuryoSeikyuMeisaiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-10-07_19-12-57">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgSeikyuMeisai")
    private DataGrid<dgSeikyuMeisai_Row> dgSeikyuMeisai;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgSeikyuMeisai
     * @return dgSeikyuMeisai
     */
    @JsonProperty("dgSeikyuMeisai")
    public DataGrid<dgSeikyuMeisai_Row> getDgSeikyuMeisai() {
        return dgSeikyuMeisai;
    }

    /*
     * setdgSeikyuMeisai
     * @param dgSeikyuMeisai dgSeikyuMeisai
     */
    @JsonProperty("dgSeikyuMeisai")
    public void setDgSeikyuMeisai(DataGrid<dgSeikyuMeisai_Row> dgSeikyuMeisai) {
        this.dgSeikyuMeisai = dgSeikyuMeisai;
    }

    // </editor-fold>
}
