package jp.co.ndensan.reams.db.dbu.divcontroller.entity.parentdiv.DBU0060031;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.DataGrid;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * tabHisetsugaigosabisujukyuInput のクラスファイル
 *
 * @reamsid_L DBU-1060-030 zhengshukai
 */
public class tabHisetsugaigosabisujukyuInputDiv extends TabPanel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("dgHisetsugaigosabisujukyu")
    private DataGrid<dgHisetsugaigosabisujukyu_Row> dgHisetsugaigosabisujukyu;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getdgHisetsugaigosabisujukyu
     * @return dgHisetsugaigosabisujukyu
     */
    @JsonProperty("dgHisetsugaigosabisujukyu")
    public DataGrid<dgHisetsugaigosabisujukyu_Row> getDgHisetsugaigosabisujukyu() {
        return dgHisetsugaigosabisujukyu;
    }

    /*
     * setdgHisetsugaigosabisujukyu
     * @param dgHisetsugaigosabisujukyu dgHisetsugaigosabisujukyu
     */
    @JsonProperty("dgHisetsugaigosabisujukyu")
    public void setDgHisetsugaigosabisujukyu(DataGrid<dgHisetsugaigosabisujukyu_Row> dgHisetsugaigosabisujukyu) {
        this.dgHisetsugaigosabisujukyu = dgHisetsugaigosabisujukyu;
    }

    // </editor-fold>
}