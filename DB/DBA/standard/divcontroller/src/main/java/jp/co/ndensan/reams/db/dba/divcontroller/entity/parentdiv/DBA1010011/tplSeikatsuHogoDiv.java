package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA1010011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * tplSeikatsuHogo のクラスファイル
 *
 * @reamsid_L DBA-0520-030 wangkun
 */
public class tplSeikatsuHogoDiv extends TabPanel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：Uz-master-49">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("SeikatsuHogo")
    private SeikatsuHogoDiv SeikatsuHogo;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("SeikatsuHogo")
    public SeikatsuHogoDiv getSeikatsuHogo() {
        return SeikatsuHogo;
    }

    @JsonProperty("SeikatsuHogo")
    public void setSeikatsuHogo(SeikatsuHogoDiv SeikatsuHogo) {
        this.SeikatsuHogo = SeikatsuHogo;
    }

    // </editor-fold>
}
