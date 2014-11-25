/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module TainoInfo {

        export class Events {


        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "TainoInfo";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public TainoInfo() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public txtHanteiKijunYMD() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtHanteiKijunYMD"));

            }

            public btnKensaku() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnKensaku"));

            }

            public btnGengakuJoho() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnGengakuJoho"));

            }

            public txtSaikoNokigen() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtSaikoNokigen"));

            }

            public txtKeikaNen() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKeikaNen"));

            }

            public txtKeikaTsuki() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKeikaTsuki"));

            }

            public linTaino1() : UZA.HorizontalLine {

                return new UZA.HorizontalLine(this.convFiledName("linTaino1"));

            }

            public txtHokenryoNendo1() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHokenryoNendo1"));

            }

            public txtHokenryoNendo2() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHokenryoNendo2"));

            }

            public txtHokenryoNendo3() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHokenryoNendo3"));

            }

            public dgTainoJokyo1() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgTainoJokyo1"));

            }

            public dgTainoJokyo2() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgTainoJokyo2"));

            }

            public dgTainoJokyo3() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgTainoJokyo3"));

            }

            public txtSonotaHokenryo() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSonotaHokenryo"));

            }

            public txtSonotatainoGaku() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSonotatainoGaku"));

            }

            public TainoSetsumei() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("TainoSetsumei"));

            }

            public celTainoSetsumei1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTainoSetsumei1"));

            }

            public TainocolorKanno() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("TainocolorKanno"));

            }

            public WhiteCell() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("WhiteCell"));

            }

            public lblDummyWhite() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblDummyWhite"));

            }

            public TainocolorMino() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("TainocolorMino"));

            }

            public RedCell() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("RedCell"));

            }

            public lblDummyRed() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblDummyRed"));

            }

            public celTainoSetsumei2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTainoSetsumei2"));

            }

            public lblMassage1() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblMassage1"));

            }

            public lblMassage2() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblMassage2"));

            }

            public celTainoSetsumei3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTainoSetsumei3"));

            }

            public TainocolorMitorai() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("TainocolorMitorai"));

            }

            public YellowCell() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("YellowCell"));

            }

            public lblDummyYellow() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblDummyYellow"));

            }

            public TainocolorKano() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("TainocolorKano"));

            }

            public GreenCell1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("GreenCell1"));

            }

            public lblDummyGreen() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblDummyGreen"));

            }

            public celTainoSetsumei4() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTainoSetsumei4"));

            }

            public lblMassage3() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblMassage3"));

            }

            public lblMassage4() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblMassage4"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class TainoInfo_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, TainoInfo_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "TainoInfo",
   "items": [
    {
     "fieldName": "txtHanteiKijunYMD",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "80",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtHanteiKijunYMD_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "滞納判定基準日",
     "labelRText": "",
     "labelLWidth": "120",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "btnKensaku",
     "items": [],
     "controlType": "Button",
     "width": "M",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "btnKensaku",
     "helpMessageID": "",
     "jpControlName": "",
     "text": "基準日で検索する",
     "onClick": "",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": true
    },
    {
     "fieldName": "btnGengakuJoho",
     "items": [],
     "controlType": "Button",
     "width": "M",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "btnGengakuJoho",
     "helpMessageID": "",
     "jpControlName": "",
     "text": "減額情報を表示する",
     "onClick": "",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": true
    },
    {
     "fieldName": "txtSaikoNokigen",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "80",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtSaikoNokigen_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "最古滞納納期限",
     "labelRText": "",
     "labelLWidth": "120",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtKeikaNen",
     "items": [],
     "controlType": "TextBox",
     "width": "20",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "0",
     "selectControlID": "txtKeikaNen_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "最古の保険料納期限からの経過月数",
     "labelRText": "",
     "labelLWidth": "260",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 2,
     "textKind": 0,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "txtKeikaTsuki",
     "items": [],
     "controlType": "TextBox",
     "width": "20",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "0",
     "marginRight": "XS",
     "selectControlID": "txtKeikaTsuki_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "年",
     "labelRText": "ヵ月",
     "labelLWidth": "20",
     "labelRWidth": "50",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 2,
     "textKind": 0,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "linTaino1",
     "items": [],
     "controlType": "HorizontalLine",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "linTaino1",
     "helpMessageID": "",
     "jpControlName": "",
     "size": "Default"
    },
    {
     "fieldName": "txtHokenryoNendo1",
     "items": [],
     "controlType": "TextBox",
     "width": "35",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtHokenryoNendo1_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "保険料年度",
     "labelRText": "",
     "labelLWidth": "90",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 0,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "txtHokenryoNendo2",
     "items": [],
     "controlType": "TextBox",
     "width": "35",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtHokenryoNendo2_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "保険料年度",
     "labelRText": "",
     "labelLWidth": "310",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 0,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "txtHokenryoNendo3",
     "items": [],
     "controlType": "TextBox",
     "width": "35",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtHokenryoNendo3_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "保険料年度",
     "labelRText": "",
     "labelLWidth": "310",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 0,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "dgTainoJokyo1",
     "items": [],
     "controlType": "DataGrid",
     "width": "350",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "0",
     "selectControlID": "dgTainoJokyo1",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "Auto",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": false,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": false,
      "isShowSelectButtonColumn": false,
      "isShowModifyButtonColumn": false,
      "isShowDeleteButtonColumn": false,
      "limitRowCount": 0,
      "selectedRowCount": 0,
      "header": {
       "combineColumns": [],
       "frozenColumn": "txtKi",
       "headerHeight": 1
      },
      "columns": [
       {
        "columnName": "期",
        "dataName": "txtKi",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtKi"
       },
       {
        "columnName": "保険料",
        "dataName": "txtHokenryo",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 2,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtHokenryo"
       },
       {
        "columnName": "納期限",
        "dataName": "txtNokigen",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtNokigen"
       },
       {
        "columnName": "滞納",
        "dataName": "txtTaino",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtTaino"
       },
       {
        "columnName": "時効起算日",
        "dataName": "txtJikoKisanYMD",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanYMD"
       },
       {
        "columnName": "時効起算日<br>区分",
        "dataName": "txtJikoKisanbiKbn",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanbiKbn"
       }
      ]
     },
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "",
     "onSelectByDeleteButton": "",
     "onAfterRequest": "",
     "onAfterRequestByDblClick": "",
     "onAfterRequestBySelectButton": "",
     "onAfterRequestByModifyButton": "",
     "onAfterRequestByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "dgTainoJokyo2",
     "items": [],
     "controlType": "DataGrid",
     "width": "350",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "0",
     "selectControlID": "dgTainoJokyo2",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "Auto",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": false,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": false,
      "isShowSelectButtonColumn": false,
      "isShowModifyButtonColumn": false,
      "isShowDeleteButtonColumn": false,
      "limitRowCount": 0,
      "selectedRowCount": 0,
      "header": {
       "combineColumns": [],
       "frozenColumn": "txtKi",
       "headerHeight": 1
      },
      "columns": [
       {
        "columnName": "期",
        "dataName": "txtKi",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtKi"
       },
       {
        "columnName": "保険料",
        "dataName": "txtHokenryo",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 2,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtHokenryo"
       },
       {
        "columnName": "納期限",
        "dataName": "txtNokigen",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtNokigen"
       },
       {
        "columnName": "滞納",
        "dataName": "txtTaino",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtTaino"
       },
       {
        "columnName": "時効起算日",
        "dataName": "txtJikoKisanYMD",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanYMD"
       },
       {
        "columnName": "時効起算日<br>区分",
        "dataName": "txtJikoKisanbiKbn",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanbiKbn"
       }
      ]
     },
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "",
     "onSelectByDeleteButton": "",
     "onAfterRequest": "",
     "onAfterRequestByDblClick": "",
     "onAfterRequestBySelectButton": "",
     "onAfterRequestByModifyButton": "",
     "onAfterRequestByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "dgTainoJokyo3",
     "items": [],
     "controlType": "DataGrid",
     "width": "350",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "0",
     "selectControlID": "dgTainoJokyo3",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "Auto",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": false,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": false,
      "isShowSelectButtonColumn": false,
      "isShowModifyButtonColumn": false,
      "isShowDeleteButtonColumn": false,
      "limitRowCount": 0,
      "selectedRowCount": 0,
      "header": {
       "combineColumns": [],
       "frozenColumn": "txtKi",
       "headerHeight": 1
      },
      "columns": [
       {
        "columnName": "期",
        "dataName": "txtKi",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtKi"
       },
       {
        "columnName": "保険料",
        "dataName": "txtHokenryo",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 2,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtHokenryo"
       },
       {
        "columnName": "納期限",
        "dataName": "txtNokigen",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtNokigen"
       },
       {
        "columnName": "滞納",
        "dataName": "txtTaino",
        "toolTip": "",
        "bgColor": 0,
        "width": 40,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtTaino"
       },
       {
        "columnName": "時効起算日",
        "dataName": "txtJikoKisanYMD",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanYMD"
       },
       {
        "columnName": "時効起算日<br>区分",
        "dataName": "txtJikoKisanbiKbn",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 1,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "txtJikoKisanbiKbn"
       }
      ]
     },
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "",
     "onSelectByDeleteButton": "",
     "onAfterRequest": "",
     "onAfterRequestByDblClick": "",
     "onAfterRequestBySelectButton": "",
     "onAfterRequestByModifyButton": "",
     "onAfterRequestByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "txtSonotaHokenryo",
     "items": [],
     "controlType": "TextBoxNum",
     "width": "90",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "0",
     "selectControlID": "txtSonotaHokenryo_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "表示年度以前の滞納状況　保険料額",
     "labelRText": "",
     "labelLWidth": "260",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 2,
     "textKind": 2,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "maxValue": 1.7976931348623157e+308,
     "minValue": 0,
     "isCurrency": false,
     "isComma": false,
     "decimalPointLength": 0,
     "permitCharactor": "+-,.\\"
    },
    {
     "fieldName": "txtSonotatainoGaku",
     "items": [],
     "controlType": "TextBoxNum",
     "width": "90",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "txtSonotatainoGaku_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "うち滞納額",
     "labelRText": "",
     "labelLWidth": "80",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 2,
     "textKind": 2,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "maxValue": 1.7976931348623157e+308,
     "minValue": 0,
     "isCurrency": false,
     "isComma": false,
     "decimalPointLength": 0,
     "permitCharactor": "+-,.\\"
    },
    {
     "fieldName": "TainoSetsumei",
     "items": [
      {
       "fieldName": "celTainoSetsumei1",
       "items": [
        {
         "fieldName": "TainocolorKanno",
         "items": [
          {
           "fieldName": "WhiteCell",
           "items": [
            {
             "fieldName": "lblDummyWhite",
             "items": [],
             "controlType": "Label",
             "width": "64",
             "visible": false,
             "displayNone": false,
             "disabled": false,
             "accessKey": "",
             "nextFocusFieldName": "",
             "wrap": false,
             "dependencies": [],
             "float": 0,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "lblDummyWhite",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "label",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
           "width": "XS",
           "visible": true,
           "displayNone": false,
           "disabled": false,
           "accessKey": "",
           "nextFocusFieldName": "",
           "wrap": false,
           "dependencies": [],
           "float": 0,
           "toolTip": "",
           "authorityMode": 0,
           "marginLeft": "0",
           "marginRight": "0",
           "selectControlID": "WhiteCell",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "TainocolorKanno",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border=\"1\" cellspacing=0 cellpadding=0 span style=\"font-size:4pt\">\n  <tbody>\n    <tr><td id='R1C1' bgcolor='white'></td></tr>\n  </tbody>\n</table>\n"
        },
        {
         "fieldName": "TainocolorMino",
         "items": [
          {
           "fieldName": "RedCell",
           "items": [
            {
             "fieldName": "lblDummyRed",
             "items": [],
             "controlType": "Label",
             "width": "64",
             "visible": false,
             "displayNone": false,
             "disabled": false,
             "accessKey": "",
             "nextFocusFieldName": "",
             "wrap": false,
             "dependencies": [],
             "float": 0,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "lblDummyRed",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "label",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
           "width": "XS",
           "visible": true,
           "displayNone": false,
           "disabled": false,
           "accessKey": "",
           "nextFocusFieldName": "",
           "wrap": false,
           "dependencies": [],
           "float": 0,
           "toolTip": "",
           "authorityMode": 0,
           "marginLeft": "0",
           "marginRight": "0",
           "selectControlID": "RedCell",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "TainocolorMino",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border=\"1\" cellspacing=0 cellpadding=0 span style=\"font-size:4pt\">\n  <tbody>\n    <tr><td id='R1C1' bgcolor='red'></td></tr>\n  </tbody>\n</table>\n"
        }
       ],
       "controlType": "TableCell",
       "width": "XS",
       "visible": true,
       "displayNone": false,
       "disabled": false,
       "accessKey": "",
       "nextFocusFieldName": "",
       "wrap": false,
       "dependencies": [],
       "float": 0,
       "toolTip": "",
       "authorityMode": 0,
       "marginLeft": "0",
       "marginRight": "0",
       "selectControlID": "celTainoSetsumei1",
       "helpMessageID": "",
       "jpControlName": "",
       "connectTd": "R1C1"
      },
      {
       "fieldName": "celTainoSetsumei2",
       "items": [
        {
         "fieldName": "lblMassage1",
         "items": [],
         "controlType": "Label",
         "width": "120",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": false,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "lblMassage1",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "完納／未来納期",
         "decorationClass": "",
         "align": 0
        },
        {
         "fieldName": "lblMassage2",
         "items": [],
         "controlType": "Label",
         "width": "120",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "lblMassage2",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "未納・時効到来",
         "decorationClass": "",
         "align": 0
        }
       ],
       "controlType": "TableCell",
       "width": "XS",
       "visible": true,
       "displayNone": false,
       "disabled": false,
       "accessKey": "",
       "nextFocusFieldName": "",
       "wrap": false,
       "dependencies": [],
       "float": 0,
       "toolTip": "",
       "authorityMode": 0,
       "marginLeft": "0",
       "marginRight": "0",
       "selectControlID": "celTainoSetsumei2",
       "helpMessageID": "",
       "jpControlName": "",
       "connectTd": "R1C2"
      },
      {
       "fieldName": "celTainoSetsumei3",
       "items": [
        {
         "fieldName": "TainocolorMitorai",
         "items": [
          {
           "fieldName": "YellowCell",
           "items": [
            {
             "fieldName": "lblDummyYellow",
             "items": [],
             "controlType": "Label",
             "width": "64",
             "visible": false,
             "displayNone": false,
             "disabled": false,
             "accessKey": "",
             "nextFocusFieldName": "",
             "wrap": false,
             "dependencies": [],
             "float": 0,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "lblDummyYellow",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "label",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
           "width": "XS",
           "visible": true,
           "displayNone": false,
           "disabled": false,
           "accessKey": "",
           "nextFocusFieldName": "",
           "wrap": false,
           "dependencies": [],
           "float": 0,
           "toolTip": "",
           "authorityMode": 0,
           "marginLeft": "0",
           "marginRight": "0",
           "selectControlID": "YellowCell",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "TainocolorMitorai",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border=\"1\" cellspacing=0 cellpadding=0 span style=\"font-size:4pt\">\n  <tbody>\n    <tr><td id='R1C1' bgcolor='yellow'></td></tr>\n  </tbody>\n</table>\n"
        },
        {
         "fieldName": "TainocolorKano",
         "items": [
          {
           "fieldName": "GreenCell1",
           "items": [
            {
             "fieldName": "lblDummyGreen",
             "items": [],
             "controlType": "Label",
             "width": "64",
             "visible": false,
             "displayNone": false,
             "disabled": false,
             "accessKey": "",
             "nextFocusFieldName": "",
             "wrap": false,
             "dependencies": [],
             "float": 0,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "lblDummyGreen",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "label",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
           "width": "XS",
           "visible": true,
           "displayNone": false,
           "disabled": false,
           "accessKey": "",
           "nextFocusFieldName": "",
           "wrap": false,
           "dependencies": [],
           "float": 0,
           "toolTip": "",
           "authorityMode": 0,
           "marginLeft": "0",
           "marginRight": "0",
           "selectControlID": "GreenCell1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "TainocolorKano",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border=\"1\" cellspacing=0 cellpadding=0 span style=\"font-size:4pt\">\n  <tbody>\n    <tr><td id='R1C1' bgcolor='lightGreen'></td></tr>\n  </tbody>\n</table>\n"
        }
       ],
       "controlType": "TableCell",
       "width": "XS",
       "visible": true,
       "displayNone": false,
       "disabled": false,
       "accessKey": "",
       "nextFocusFieldName": "",
       "wrap": false,
       "dependencies": [],
       "float": 0,
       "toolTip": "",
       "authorityMode": 0,
       "marginLeft": "0",
       "marginRight": "0",
       "selectControlID": "celTainoSetsumei3",
       "helpMessageID": "",
       "jpControlName": "",
       "connectTd": "R1C3"
      },
      {
       "fieldName": "celTainoSetsumei4",
       "items": [
        {
         "fieldName": "lblMassage3",
         "items": [],
         "controlType": "Label",
         "width": "130",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": false,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "lblMassage3",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "未納・時効未到来",
         "decorationClass": "",
         "align": 0
        },
        {
         "fieldName": "lblMassage4",
         "items": [],
         "controlType": "Label",
         "width": "130",
         "visible": true,
         "displayNone": false,
         "disabled": false,
         "accessKey": "",
         "nextFocusFieldName": "",
         "wrap": true,
         "dependencies": [],
         "float": 0,
         "toolTip": "",
         "authorityMode": 0,
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "lblMassage4",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "過納",
         "decorationClass": "",
         "align": 0
        }
       ],
       "controlType": "TableCell",
       "width": "XS",
       "visible": true,
       "displayNone": false,
       "disabled": false,
       "accessKey": "",
       "nextFocusFieldName": "",
       "wrap": false,
       "dependencies": [],
       "float": 0,
       "toolTip": "",
       "authorityMode": 0,
       "marginLeft": "0",
       "marginRight": "0",
       "selectControlID": "celTainoSetsumei4",
       "helpMessageID": "",
       "jpControlName": "",
       "connectTd": "R1C4"
      }
     ],
     "controlType": "TablePanel",
     "width": "XS",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 2,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "TainoSetsumei",
     "helpMessageID": "",
     "jpControlName": "",
     "html": "<table cellspacing=0 cellpadding=0 span style=\"font-size:11pt\">\n  <tbody>\n    <tr><td id='R1C1'></td><td id='R1C2'></td><td id='R1C3'></td><td id='R1C4'></td></tr>\n  </tbody>\n</table>\n"
    }
   ],
   "controlType": "Panel",
   "width": "1090",
   "visible": true,
   "displayNone": false,
   "disabled": false,
   "accessKey": "",
   "nextFocusFieldName": "",
   "wrap": false,
   "dependencies": [],
   "float": 0,
   "toolTip": "",
   "authorityMode": 0,
   "marginLeft": "Default",
   "marginRight": "Default",
   "selectControlID": "TainoInfo",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "滞納情報",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "TainoInfo"
    }
   ],
   "requestSettings": [],
   "hiddenInput": [],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorder": false,
   "backgroundColor": 0,
   "widthAuto": false,
   "panelDisplay": 0,
   "isGroupBox": false,
   "readOnly": false,
   "height": "Auto",
   "focusPositionID": "createFile"
  }
 ],
 "controlType": "CommonChildDiv",
 "width": "XS",
 "visible": true,
 "displayNone": false,
 "disabled": false,
 "accessKey": "",
 "nextFocusFieldName": "",
 "wrap": false,
 "dependencies": [],
 "float": 0,
 "toolTip": "",
 "authorityMode": 0,
 "marginLeft": "0",
 "marginRight": "0",
 "selectControlID": "defaultLayout",
 "helpMessageID": "",
 "jpControlName": "",
 "relation": [],
 "businessId": "DBZ",
 "controlName": "TainoInfo",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "",
   "publicChildProperty": "",
   "newPropertyName": ""
  }
 ],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": "",
 "canTransferEvent": true,
 "heightForDialog": "M"
}        
    }
}

