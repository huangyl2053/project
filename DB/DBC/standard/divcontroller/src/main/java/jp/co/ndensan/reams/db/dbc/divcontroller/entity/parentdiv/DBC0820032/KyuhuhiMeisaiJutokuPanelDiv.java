package jp.co.ndensan.reams.db.dbc.divcontroller.entity.parentdiv.DBC0820032;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * KyuhuhiMeisaiJutokuPanel のクラスファイル
 *
 * @reamsid_L DBC-1030-030 quxiaodong
 */
public class KyuhuhiMeisaiJutokuPanelDiv extends Panel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("PnlAtenaCommon")
    private PnlAtenaCommonDiv PnlAtenaCommon;
    @JsonProperty("PnlBtnDetail")
    private PnlBtnDetailDiv PnlBtnDetail;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getPnlAtenaCommon
     * @return PnlAtenaCommon
     */
    @JsonProperty("PnlAtenaCommon")
    public PnlAtenaCommonDiv getPnlAtenaCommon() {
        return PnlAtenaCommon;
    }

    /*
     * setPnlAtenaCommon
     * @param PnlAtenaCommon PnlAtenaCommon
     */
    @JsonProperty("PnlAtenaCommon")
    public void setPnlAtenaCommon(PnlAtenaCommonDiv PnlAtenaCommon) {
        this.PnlAtenaCommon = PnlAtenaCommon;
    }

    /*
     * getPnlBtnDetail
     * @return PnlBtnDetail
     */
    @JsonProperty("PnlBtnDetail")
    public PnlBtnDetailDiv getPnlBtnDetail() {
        return PnlBtnDetail;
    }

    /*
     * setPnlBtnDetail
     * @param PnlBtnDetail PnlBtnDetail
     */
    @JsonProperty("PnlBtnDetail")
    public void setPnlBtnDetail(PnlBtnDetailDiv PnlBtnDetail) {
        this.PnlBtnDetail = PnlBtnDetail;
    }

    // </editor-fold>
}
