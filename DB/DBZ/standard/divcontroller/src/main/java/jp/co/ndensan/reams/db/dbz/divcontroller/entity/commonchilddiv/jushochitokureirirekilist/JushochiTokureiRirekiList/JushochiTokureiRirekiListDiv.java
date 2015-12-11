package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.jushochitokureirirekilist.JushochiTokureiRirekiList;
/*
 * このコードはツールによって生成されました。
 * このファイルへの変更は、再生成時には損失するため
 * 不正な動作の原因になります。
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.*;
import jp.co.ndensan.reams.uz.uza.ui.binding.Panel;

import java.util.HashSet;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ICommonChildDivMode;
import jp.co.ndensan.reams.uz.uza.ui.servlets._CommonChildDivModeUtil;

/**
 * JushochiTokureiRirekiList のクラスファイル 
 * 
 * @author 自動生成
 */
public class JushochiTokureiRirekiListDiv extends Panel implements IJushochiTokureiRirekiListDiv {
    // <editor-fold defaultstate="collapsed" desc="Created By UIDesigner ver：バージョン情報無し">
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
    @JsonProperty("executionStatus")
    private RString executionStatus;
    @JsonProperty("jushochiTokureiExecutionState")
    private RString jushochiTokureiExecutionState;

    /*
     * [ GetterとSetterの作成 ]
     * クライアント側から取得した情報を元に検索を行い
     * コントロール名とフィールド名を取得する
     * フィールド名のGetterとSetter を作成
     */
    /*
     * getbtnAdd
     * @return btnAdd
     */
    @JsonProperty("btnAdd")
    public Button getBtnAdd() {
        return btnAdd;
    }

    /*
     * setbtnAdd
     * @param btnAdd btnAdd
     */
    @JsonProperty("btnAdd")
    public void setBtnAdd(Button btnAdd) {
        this.btnAdd = btnAdd;
    }

    /*
     * getdgJutoku
     * @return dgJutoku
     */
    @JsonProperty("dgJutoku")
    public DataGrid<dgJutoku_Row> getDgJutoku() {
        return dgJutoku;
    }

    /*
     * setdgJutoku
     * @param dgJutoku dgJutoku
     */
    @JsonProperty("dgJutoku")
    public void setDgJutoku(DataGrid<dgJutoku_Row> dgJutoku) {
        this.dgJutoku = dgJutoku;
    }

    /*
     * getJutokuInput
     * @return JutokuInput
     */
    @JsonProperty("JutokuInput")
    public JutokuInputDiv getJutokuInput() {
        return JutokuInput;
    }

    /*
     * setJutokuInput
     * @param JutokuInput JutokuInput
     */
    @JsonProperty("JutokuInput")
    public void setJutokuInput(JutokuInputDiv JutokuInput) {
        this.JutokuInput = JutokuInput;
    }

    /*
     * getexecutionStatus
     * @return executionStatus
     */
    @JsonProperty("executionStatus")
    public RString getExecutionStatus() {
        return executionStatus;
    }

    /*
     * setexecutionStatus
     * @param executionStatus executionStatus
     */
    @JsonProperty("executionStatus")
    public void setExecutionStatus(RString executionStatus) {
        this.executionStatus = executionStatus;
    }

    /*
     * getjushochiTokureiExecutionState
     * @return jushochiTokureiExecutionState
     */
    @JsonProperty("jushochiTokureiExecutionState")
    public RString getJushochiTokureiExecutionState() {
        return jushochiTokureiExecutionState;
    }

    /*
     * setjushochiTokureiExecutionState
     * @param jushochiTokureiExecutionState jushochiTokureiExecutionState
     */
    @JsonProperty("jushochiTokureiExecutionState")
    public void setJushochiTokureiExecutionState(RString jushochiTokureiExecutionState) {
        this.jushochiTokureiExecutionState = jushochiTokureiExecutionState;
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
        teiseiInput("teiseiInput"),
        teiseiShokai("teiseiShokai"),
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
        tekiyo("tekiyo"),
        kaijo("kaijo"),
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

    // </editor-fold>
    //--------------- この行より下にコードを追加してください -------------------

}