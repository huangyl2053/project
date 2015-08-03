package jp.co.ndensan.reams.db.dbz.divcontroller.entity;
/**
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.IJushochiTokureiRirekiListDiv;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.JutokuInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.JutokuKaijoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.JutokuTekiyoInputDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.dgJutoku_Row;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.kaijojiHokenshaJohoDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.tekiyojiHokenshaJohoDiv;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;
import jp.co.ndensan.reams.uz.uza.ui.binding.domain.*;

import java.util.HashSet;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ICommonChildDivMode;
import jp.co.ndensan.reams.uz.uza.ui.servlets._CommonChildDivModeUtil;

/**
 * JushochiTokureiRirekiList のクラスファイル 
 * 
 * @author 自動生成
 */
public class JushochiTokureiRirekiListDiv extends Panel implements IJushochiTokureiRirekiListDiv {
    /*
     * [ private の作成 ]
     * クライアント側から取得した情報を元にを検索を行い
     * コントロール名とフィールド名を取得する
     * private + コントロール名 + フィールド名 の文字列を作成
     */
    @JsonProperty("btnAdd")
    private Button btnAdd;
    @JsonProperty("dgJutoku")
    private DataGrid<dgJutoku_Row> dgJutoku;
    @JsonProperty("JutokuInput")
    private JutokuInputDiv JutokuInput;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    @JsonProperty("btnAdd")
    public Button getBtnAdd() {
        return btnAdd;
    }

    @JsonProperty("btnAdd")
    public void setBtnAdd(Button btnAdd) {
        this.btnAdd=btnAdd;
    }

    @JsonProperty("dgJutoku")
    public DataGrid<dgJutoku_Row> getDgJutoku() {
        return dgJutoku;
    }

    @JsonProperty("dgJutoku")
    public void setDgJutoku(DataGrid<dgJutoku_Row> dgJutoku) {
        this.dgJutoku=dgJutoku;
    }

    @JsonProperty("JutokuInput")
    public JutokuInputDiv getJutokuInput() {
        return JutokuInput;
    }

    @JsonProperty("JutokuInput")
    public void setJutokuInput(JutokuInputDiv JutokuInput) {
        this.JutokuInput=JutokuInput;
    }

    /*
     * [共有子DIVモード]
     */
    @JsonProperty("modes")
    private HashSet<Mode> modes;

    public static enum DataGridHeight implements ICommonChildDivMode {

        Size1("Size1"),
        Size2("Size2"),
        Size3("Size3"),
        Size4("Size4"),
        Size5("Size5"),
        Size6("Size6");

        private final String name;

        private DataGridHeight(final String name) {
            this.name = name;
        }

        public static DataGridHeight getEnum(String str) {
            DataGridHeight[] enumArray = DataGridHeight.values();

            for (DataGridHeight enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public DataGridHeight getMode_DataGridHeight() {
        return (DataGridHeight) _CommonChildDivModeUtil.getMode( this.modes, DataGridHeight.class );
    }

    public void setMode_DataGridHeight( DataGridHeight value ) {
        _CommonChildDivModeUtil.setMode( this.modes, DataGridHeight.class , value );
    }

    public static enum ShoriNichijiDisplayMode implements ICommonChildDivMode {

        VisibleTrue("VisibleTrue"),
        VisibleFalse("VisibleFalse");

        private final String name;

        private ShoriNichijiDisplayMode(final String name) {
            this.name = name;
        }

        public static ShoriNichijiDisplayMode getEnum(String str) {
            ShoriNichijiDisplayMode[] enumArray = ShoriNichijiDisplayMode.values();

            for (ShoriNichijiDisplayMode enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public ShoriNichijiDisplayMode getMode_ShoriNichijiDisplayMode() {
        return (ShoriNichijiDisplayMode) _CommonChildDivModeUtil.getMode( this.modes, ShoriNichijiDisplayMode.class );
    }

    public void setMode_ShoriNichijiDisplayMode( ShoriNichijiDisplayMode value ) {
        _CommonChildDivModeUtil.setMode( this.modes, ShoriNichijiDisplayMode.class , value );
    }

    public static enum DataGridWidth implements ICommonChildDivMode {

        Size1("Size1"),
        Size2("Size2"),
        Size3("Size3"),
        Size4("Size4"),
        Size5("Size5"),
        Size6("Size6"),
        Size7("Size7"),
        Size8("Size8"),
        Size9("Size9"),
        Size10("Size10"),
        Size11("Size11");

        private final String name;

        private DataGridWidth(final String name) {
            this.name = name;
        }

        public static DataGridWidth getEnum(String str) {
            DataGridWidth[] enumArray = DataGridWidth.values();

            for (DataGridWidth enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public DataGridWidth getMode_DataGridWidth() {
        return (DataGridWidth) _CommonChildDivModeUtil.getMode( this.modes, DataGridWidth.class );
    }

    public void setMode_DataGridWidth( DataGridWidth value ) {
        _CommonChildDivModeUtil.setMode( this.modes, DataGridWidth.class , value );
    }

    public static enum HokenshaJohoDisplayMode implements ICommonChildDivMode {

        TanitsuGappeiNashi("TanitsuGappeiNashi"),
        TanitsuGappeiAri("TanitsuGappeiAri"),
        KoikiGappeiNashi("KoikiGappeiNashi"),
        KoikiGappeiAri("KoikiGappeiAri");

        private final String name;

        private HokenshaJohoDisplayMode(final String name) {
            this.name = name;
        }

        public static HokenshaJohoDisplayMode getEnum(String str) {
            HokenshaJohoDisplayMode[] enumArray = HokenshaJohoDisplayMode.values();

            for (HokenshaJohoDisplayMode enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public HokenshaJohoDisplayMode getMode_HokenshaJohoDisplayMode() {
        return (HokenshaJohoDisplayMode) _CommonChildDivModeUtil.getMode( this.modes, HokenshaJohoDisplayMode.class );
    }

    public void setMode_HokenshaJohoDisplayMode( HokenshaJohoDisplayMode value ) {
        _CommonChildDivModeUtil.setMode( this.modes, HokenshaJohoDisplayMode.class , value );
    }

    public static enum BtnDisplayMode implements ICommonChildDivMode {

        SetDisplay("SetDisplay"),
        SetDisplayNone("SetDisplayNone");

        private final String name;

        private BtnDisplayMode(final String name) {
            this.name = name;
        }

        public static BtnDisplayMode getEnum(String str) {
            BtnDisplayMode[] enumArray = BtnDisplayMode.values();

            for (BtnDisplayMode enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public BtnDisplayMode getMode_BtnDisplayMode() {
        return (BtnDisplayMode) _CommonChildDivModeUtil.getMode( this.modes, BtnDisplayMode.class );
    }

    public void setMode_BtnDisplayMode( BtnDisplayMode value ) {
        _CommonChildDivModeUtil.setMode( this.modes, BtnDisplayMode.class , value );
    }

    public static enum MeisaiDisplayMode implements ICommonChildDivMode {

        tekiyoShokai("tekiyoShokai"),
        kaijoShokai("kaijoShokai"),
        tekiyoInput("tekiyoInput"),
        kaijoInput("kaijoInput"),
        TeiseiInput("TeiseiInput"),
        displayNone("displayNone");

        private final String name;

        private MeisaiDisplayMode(final String name) {
            this.name = name;
        }

        public static MeisaiDisplayMode getEnum(String str) {
            MeisaiDisplayMode[] enumArray = MeisaiDisplayMode.values();

            for (MeisaiDisplayMode enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public MeisaiDisplayMode getMode_MeisaiDisplayMode() {
        return (MeisaiDisplayMode) _CommonChildDivModeUtil.getMode( this.modes, MeisaiDisplayMode.class );
    }

    public void setMode_MeisaiDisplayMode( MeisaiDisplayMode value ) {
        _CommonChildDivModeUtil.setMode( this.modes, MeisaiDisplayMode.class , value );
    }

    public static enum DisplayType implements ICommonChildDivMode {

        shokai("shokai"),
        toroku("toroku"),
        teiseitoroku("teiseitoroku");

        private final String name;

        private DisplayType(final String name) {
            this.name = name;
        }

        public static DisplayType getEnum(String str) {
            DisplayType[] enumArray = DisplayType.values();

            for (DisplayType enumStr : enumArray) {
                if (str.equals(enumStr.name.toString())) { 
                    return enumStr;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.name;
        }

    }

    public DisplayType getMode_DisplayType() {
        return (DisplayType) _CommonChildDivModeUtil.getMode( this.modes, DisplayType.class );
    }

    public void setMode_DisplayType( DisplayType value ) {
        _CommonChildDivModeUtil.setMode( this.modes, DisplayType.class , value );
    }

    /*
     * [ ショートカットの作成 ]
     */
    @JsonIgnore
    public JutokuTekiyoInputDiv getJutokuTekiyoInput() {
        return this.getJutokuInput().getJutokuTekiyoInput();
    }

    @JsonIgnore
    public void  setJutokuTekiyoInput(JutokuTekiyoInputDiv JutokuTekiyoInput) {
        this.getJutokuInput().setJutokuTekiyoInput(JutokuTekiyoInput);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtTekiyoDate() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTxtTekiyoDate();
    }

    @JsonIgnore
    public void  setTxtTekiyoDate(TextBoxFlexibleDate txtTekiyoDate) {
        this.getJutokuInput().getJutokuTekiyoInput().setTxtTekiyoDate(txtTekiyoDate);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtTekiyoTodokedeDate() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTxtTekiyoTodokedeDate();
    }

    @JsonIgnore
    public void  setTxtTekiyoTodokedeDate(TextBoxFlexibleDate txtTekiyoTodokedeDate) {
        this.getJutokuInput().getJutokuTekiyoInput().setTxtTekiyoTodokedeDate(txtTekiyoTodokedeDate);
    }

    @JsonIgnore
    public DropDownList getDdlTekiyoJiyu() {
        return this.getJutokuInput().getJutokuTekiyoInput().getDdlTekiyoJiyu();
    }

    @JsonIgnore
    public void  setDdlTekiyoJiyu(DropDownList ddlTekiyoJiyu) {
        this.getJutokuInput().getJutokuTekiyoInput().setDdlTekiyoJiyu(ddlTekiyoJiyu);
    }

    @JsonIgnore
    public tekiyojiHokenshaJohoDiv getTekiyojiHokenshaJoho() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho();
    }

    @JsonIgnore
    public void  setTekiyojiHokenshaJoho(tekiyojiHokenshaJohoDiv tekiyojiHokenshaJoho) {
        this.getJutokuInput().getJutokuTekiyoInput().setTekiyojiHokenshaJoho(tekiyojiHokenshaJoho);
    }

    @JsonIgnore
    public DropDownList getDdlTekiyojiShozaiHokensha() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().getDdlTekiyojiShozaiHokensha();
    }

    @JsonIgnore
    public void  setDdlTekiyojiShozaiHokensha(DropDownList ddlTekiyojiShozaiHokensha) {
        this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().setDdlTekiyojiShozaiHokensha(ddlTekiyojiShozaiHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlTekiyojiSochimotoHokensha() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().getDdlTekiyojiSochimotoHokensha();
    }

    @JsonIgnore
    public void  setDdlTekiyojiSochimotoHokensha(DropDownList ddlTekiyojiSochimotoHokensha) {
        this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().setDdlTekiyojiSochimotoHokensha(ddlTekiyojiSochimotoHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlTekiyojiKyuHokensha() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().getDdlTekiyojiKyuHokensha();
    }

    @JsonIgnore
    public void  setDdlTekiyojiKyuHokensha(DropDownList ddlTekiyojiKyuHokensha) {
        this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().setDdlTekiyojiKyuHokensha(ddlTekiyojiKyuHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlTekiyojiJuminJoho() {
        return this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().getDdlTekiyojiJuminJoho();
    }

    @JsonIgnore
    public void  setDdlTekiyojiJuminJoho(DropDownList ddlTekiyojiJuminJoho) {
        this.getJutokuInput().getJutokuTekiyoInput().getTekiyojiHokenshaJoho().setDdlTekiyojiJuminJoho(ddlTekiyojiJuminJoho);
    }

    @JsonIgnore
    public JutokuKaijoInputDiv getJutokuKaijoInput() {
        return this.getJutokuInput().getJutokuKaijoInput();
    }

    @JsonIgnore
    public void  setJutokuKaijoInput(JutokuKaijoInputDiv JutokuKaijoInput) {
        this.getJutokuInput().setJutokuKaijoInput(JutokuKaijoInput);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtKaijoDate() {
        return this.getJutokuInput().getJutokuKaijoInput().getTxtKaijoDate();
    }

    @JsonIgnore
    public void  setTxtKaijoDate(TextBoxFlexibleDate txtKaijoDate) {
        this.getJutokuInput().getJutokuKaijoInput().setTxtKaijoDate(txtKaijoDate);
    }

    @JsonIgnore
    public TextBoxFlexibleDate getTxtKaijoTodokedeDate() {
        return this.getJutokuInput().getJutokuKaijoInput().getTxtKaijoTodokedeDate();
    }

    @JsonIgnore
    public void  setTxtKaijoTodokedeDate(TextBoxFlexibleDate txtKaijoTodokedeDate) {
        this.getJutokuInput().getJutokuKaijoInput().setTxtKaijoTodokedeDate(txtKaijoTodokedeDate);
    }

    @JsonIgnore
    public DropDownList getDdlKaijoJiyu() {
        return this.getJutokuInput().getJutokuKaijoInput().getDdlKaijoJiyu();
    }

    @JsonIgnore
    public void  setDdlKaijoJiyu(DropDownList ddlKaijoJiyu) {
        this.getJutokuInput().getJutokuKaijoInput().setDdlKaijoJiyu(ddlKaijoJiyu);
    }

    @JsonIgnore
    public kaijojiHokenshaJohoDiv getKaijojiHokenshaJoho() {
        return this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho();
    }

    @JsonIgnore
    public void  setKaijojiHokenshaJoho(kaijojiHokenshaJohoDiv kaijojiHokenshaJoho) {
        this.getJutokuInput().getJutokuKaijoInput().setKaijojiHokenshaJoho(kaijojiHokenshaJoho);
    }

    @JsonIgnore
    public DropDownList getDdlKaijojiShozaiHokensha() {
        return this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().getDdlKaijojiShozaiHokensha();
    }

    @JsonIgnore
    public void  setDdlKaijojiShozaiHokensha(DropDownList ddlKaijojiShozaiHokensha) {
        this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().setDdlKaijojiShozaiHokensha(ddlKaijojiShozaiHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlKaijojiSochimotoHokensha() {
        return this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().getDdlKaijojiSochimotoHokensha();
    }

    @JsonIgnore
    public void  setDdlKaijojiSochimotoHokensha(DropDownList ddlKaijojiSochimotoHokensha) {
        this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().setDdlKaijojiSochimotoHokensha(ddlKaijojiSochimotoHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlKaijojiKyuHokensha() {
        return this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().getDdlKaijojiKyuHokensha();
    }

    @JsonIgnore
    public void  setDdlKaijojiKyuHokensha(DropDownList ddlKaijojiKyuHokensha) {
        this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().setDdlKaijojiKyuHokensha(ddlKaijojiKyuHokensha);
    }

    @JsonIgnore
    public DropDownList getDdlKaijojiJuminJono() {
        return this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().getDdlKaijojiJuminJono();
    }

    @JsonIgnore
    public void  setDdlKaijojiJuminJono(DropDownList ddlKaijojiJuminJono) {
        this.getJutokuInput().getJutokuKaijoInput().getKaijojiHokenshaJoho().setDdlKaijojiJuminJono(ddlKaijojiJuminJono);
    }

    @JsonIgnore
    public Button getBtnJutokuKakutei() {
        return this.getJutokuInput().getBtnJutokuKakutei();
    }

    @JsonIgnore
    public void  setBtnJutokuKakutei(Button btnJutokuKakutei) {
        this.getJutokuInput().setBtnJutokuKakutei(btnJutokuKakutei);
    }

    @JsonIgnore
    public Button getBtnJutokuTorikeshi() {
        return this.getJutokuInput().getBtnJutokuTorikeshi();
    }

    @JsonIgnore
    public void  setBtnJutokuTorikeshi(Button btnJutokuTorikeshi) {
        this.getJutokuInput().setBtnJutokuTorikeshi(btnJutokuTorikeshi);
    }

    //--------------- この行より下にコードを追加してください -------------------

}