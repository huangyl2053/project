package jp.co.ndensan.reams.db.dbb.divcontroller.entity.parentdiv.DBB0030001;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

/**
 * FukaKakutei のクラスファイル 
 * 
 * @author 自動生成
 */
public class FukaKakuteiDiv extends Panel {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：UZ-deploy-2016-03-22_14-06-37">
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("FukaKakuteiBatchParameter")
    private FukaKakuteiBatchParameterDiv FukaKakuteiBatchParameter;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getFukaKakuteiBatchParameter
     * @return FukaKakuteiBatchParameter
     */
    @JsonProperty("FukaKakuteiBatchParameter")
    public FukaKakuteiBatchParameterDiv getFukaKakuteiBatchParameter() {
        return FukaKakuteiBatchParameter;
    }

    /*
     * setFukaKakuteiBatchParameter
     * @param FukaKakuteiBatchParameter FukaKakuteiBatchParameter
     */
    @JsonProperty("FukaKakuteiBatchParameter")
    public void setFukaKakuteiBatchParameter(FukaKakuteiBatchParameterDiv FukaKakuteiBatchParameter) {
        this.FukaKakuteiBatchParameter = FukaKakuteiBatchParameter;
    }

    // </editor-fold>
}