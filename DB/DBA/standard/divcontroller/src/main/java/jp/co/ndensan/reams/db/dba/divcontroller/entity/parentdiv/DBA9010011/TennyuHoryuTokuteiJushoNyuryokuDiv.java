package jp.co.ndensan.reams.db.dba.divcontroller.entity.parentdiv.DBA9010011;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShisetsuJohoCommonChildDiv.IShisetsuJohoCommonChildDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.ShisetsuJohoCommonChildDiv.ShisetsuJohoCommonChildDivDiv;
import jp.co.ndensan.reams.ur.ura.divcontroller.entity.commonchilddiv.BanchiInput.BanchiInputDiv;
import jp.co.ndensan.reams.ur.ura.divcontroller.entity.commonchilddiv.BanchiInput.IBanchiInputDiv;
import jp.co.ndensan.reams.ur.ura.divcontroller.entity.commonchilddiv.ChoikiInput.ChoikiInputDiv;
import jp.co.ndensan.reams.ur.ura.divcontroller.entity.commonchilddiv.ChoikiInput.IChoikiInputDiv;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * TennyuHoryuTokuteiJushoNyuryoku のクラスファイル 
 * 
 * @author 自動生成
 */
public class TennyuHoryuTokuteiJushoNyuryokuDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-08-06_01-12-04">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("ddlShichosonCode")
    private DropDownList ddlShichosonCode;
    @JsonProperty("ccdBunchiInput")
    private BanchiInputDiv ccdBunchiInput;
    @JsonProperty("ccdJushoInputGuide")
    private ChoikiInputDiv ccdJushoInputGuide;
    @JsonProperty("ccdSisetuInputGuide")
    private ShisetsuJohoCommonChildDivDiv ccdSisetuInputGuide;
    @JsonProperty("txtJotai")
    private RString txtJotai;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getddlShichosonCode
     * @return ddlShichosonCode
     */
    @JsonProperty("ddlShichosonCode")
    public DropDownList getDdlShichosonCode() {
        return ddlShichosonCode;
    }

    /*
     * setddlShichosonCode
     * @param ddlShichosonCode ddlShichosonCode
     */
    @JsonProperty("ddlShichosonCode")
    public void setDdlShichosonCode(DropDownList ddlShichosonCode) {
        this.ddlShichosonCode = ddlShichosonCode;
    }

    /*
     * getccdBunchiInput
     * @return ccdBunchiInput
     */
    @JsonProperty("ccdBunchiInput")
    public IBanchiInputDiv getCcdBunchiInput() {
        return ccdBunchiInput;
    }

    /*
     * getccdJushoInputGuide
     * @return ccdJushoInputGuide
     */
    @JsonProperty("ccdJushoInputGuide")
    public IChoikiInputDiv getCcdJushoInputGuide() {
        return ccdJushoInputGuide;
    }

    /*
     * getccdSisetuInputGuide
     * @return ccdSisetuInputGuide
     */
    @JsonProperty("ccdSisetuInputGuide")
    public IShisetsuJohoCommonChildDiv getCcdSisetuInputGuide() {
        return ccdSisetuInputGuide;
    }

    /*
     * gettxtJotai
     * @return txtJotai
     */
    @JsonProperty("txtJotai")
    public RString getTxtJotai() {
        return txtJotai;
    }

    /*
     * settxtJotai
     * @param txtJotai txtJotai
     */
    @JsonProperty("txtJotai")
    public void setTxtJotai(RString txtJotai) {
        this.txtJotai = txtJotai;
    }

    // </editor-fold>
}