package jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE2210001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput3.KihonChosaInput3.IKihonChosaInput3Div;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput3.KihonChosaInput3.KihonChosaInput3Div;
import jp.co.ndensan.reams.uz.uza.ui.binding.TabPanel;

/**
 * tplSangun のクラスファイル
 *
 * @author 自動生成
 */
public class tplSangunDiv extends TabPanel {

    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2015-11-30_08-54-50">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ccdSangunKihonChosa")
    private KihonChosaInput3Div ccdSangunKihonChosa;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getccdSangunKihonChosa
     * @return ccdSangunKihonChosa
     */
    @JsonProperty("ccdSangunKihonChosa")
    public IKihonChosaInput3Div getCcdSangunKihonChosa() {
        return ccdSangunKihonChosa;
    }

    // </editor-fold>
}