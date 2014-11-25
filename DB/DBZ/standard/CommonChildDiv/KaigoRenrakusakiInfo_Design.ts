/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module KaigoRenrakusakiInfo {

        export class Events {

            public static get onClick_btnKoshin(): string {
                return "onClick_btnKoshin";
            }
            public static get onClick_btnDelete(): string {
                return "onClick_btnDelete";
            }
            public static get onClick_btnCancel(): string {
                return "onClick_btnCancel";
            }
            public static get onSelectBySB_Renrakusaki(): string {
                return "onSelectBySB_Renrakusaki";
            }
            public static get onSelectByDC_Renrakusaki(): string {
                return "onSelectByDC_Renrakusaki";
            }
            public static get onClick_btnClose(): string {
                return "onClick_btnClose";
            }
            public static get onClick_btnAdd(): string {
                return "onClick_btnAdd";
            }

        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "KaigoRenrakusakiInfo";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public KaigoRenrakusakiInfo() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public btnAdd() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnAdd"));

            }

            public btnDelete() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnDelete"));

            }

            public dgRenrakusaki() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgRenrakusaki"));

            }

            public btnClose() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnClose"));

            }

            public SelectedContents() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SelectedContents"));

            }

            public txtRenrakusakiKbnNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtRenrakusakiKbnNo"));

            }

            public txtShimei() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtShimei"));

            }

            public txtShimeiKana() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtShimeiKana"));

            }

            public txtTsuzukigara() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtTsuzukigara"));

            }

            public txtTel() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtTel"));

            }

            public txtKeitaiNo() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKeitaiNo"));

            }

            public txtYubinNo() : UZA.TextBoxYubinNo {

                return new UZA.TextBoxYubinNo(this.convFiledName("txtYubinNo"));

            }

            public txtJusho() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtJusho"));

            }

            public btnUpdate() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnUpdate"));

            }

            public btnReturn() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnReturn"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class KaigoRenrakusakiInfo_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, KaigoRenrakusakiInfo_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
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
   "fieldName": "KaigoRenrakusakiInfo",
   "items": [
    {
     "fieldName": "btnAdd",
     "items": [],
     "controlType": "Button",
     "width": "S",
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
     "selectControlID": "btnAdd",
     "helpMessageID": "",
     "jpControlName": "",
     "onBeforeClick": "",
     "onAfterClick": "",
     "onClick": "onClick_btnAdd",
     "text": "追加",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    },
    {
     "fieldName": "btnDelete",
     "items": [],
     "controlType": "Button",
     "width": "S",
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
     "selectControlID": "btnDelete",
     "helpMessageID": "",
     "jpControlName": "",
     "onBeforeClick": "",
     "onAfterClick": "",
     "onClick": "onClick_btnDelete",
     "text": "削除",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    },
    {
     "fieldName": "dgRenrakusaki",
     "items": [],
     "controlType": "DataGrid",
     "width": "580",
     "visible": true,
     "displayNone": false,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "float": 1,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "dgRenrakusaki",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "167",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": false,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": false,
      "isShowSelectButtonColumn": true,
      "isShowModifyButtonColumn": false,
      "isShowDeleteButtonColumn": false,
      "limitRowCount": 0,
      "selectedRowCount": 0,
      "header": {
       "combineColumns": [],
       "frozenColumn": "",
       "headerHeight": 0
      },
      "columns": [
       {
        "columnName": "No",
        "dataName": "renrakusakiKbnNo",
        "toolTip": "",
        "bgColor": 0,
        "width": 20,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "renrakusakiKbnNo"
       },
       {
        "columnName": "氏名",
        "dataName": "shimei",
        "toolTip": "",
        "bgColor": 0,
        "width": 230,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "shimei"
       },
       {
        "columnName": "続柄",
        "dataName": "tsuzukigara",
        "toolTip": "",
        "bgColor": 0,
        "width": 60,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "tsuzukigara"
       },
       {
        "columnName": "電話番号",
        "dataName": "tel",
        "toolTip": "",
        "bgColor": 0,
        "width": 110,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "tel"
       },
       {
        "columnName": "携帯番号",
        "dataName": "keitaiNo",
        "toolTip": "",
        "bgColor": 0,
        "width": 110,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "keitaiNo"
       },
       {
        "columnName": "氏名カナ",
        "dataName": "shimeiKana",
        "toolTip": "",
        "bgColor": 0,
        "width": 200,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "shimeiKana"
       },
       {
        "columnName": "郵便番号",
        "dataName": "yubinNo",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "yubinNo"
       },
       {
        "columnName": "住所",
        "dataName": "jusho",
        "toolTip": "",
        "bgColor": 0,
        "width": 200,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "jusho"
       }
      ]
     },
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "onSelectByDC_Renrakusaki",
     "onSelectBySelectButton": "onSelectBySB_Renrakusaki",
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
     "sortOrder": "keitaiNo",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "btnClose",
     "items": [],
     "controlType": "Button",
     "width": "S",
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
     "selectControlID": "btnClose",
     "helpMessageID": "",
     "jpControlName": "",
     "onBeforeClick": "",
     "onAfterClick": "",
     "onClick": "onClick_btnClose",
     "text": "閉じる",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    },
    {
     "fieldName": "SelectedContents",
     "items": [
      {
       "fieldName": "txtRenrakusakiKbnNo",
       "items": [],
       "controlType": "TextBoxCode",
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
       "marginRight": "XS",
       "selectControlID": "txtRenrakusakiKbnNo_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": "10000000",
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 2,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "No",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": "",
       "formatLength": "1"
      },
      {
       "fieldName": "txtShimei",
       "items": [],
       "controlType": "TextBox",
       "width": "400",
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
       "selectControlID": "txtShimei_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "氏名",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtShimeiKana",
       "items": [],
       "controlType": "TextBox",
       "width": "400",
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
       "selectControlID": "txtShimeiKana_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "氏名カナ",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtTsuzukigara",
       "items": [],
       "controlType": "TextBox",
       "width": "100",
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
       "selectControlID": "txtTsuzukigara_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "続柄",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtTel",
       "items": [],
       "controlType": "TextBox",
       "width": "125",
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
       "selectControlID": "txtTel_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": "13",
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "電話番号",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtKeitaiNo",
       "items": [],
       "controlType": "TextBox",
       "width": "125",
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
       "selectControlID": "txtKeitaiNo_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": "13",
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "携帯番号",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtYubinNo",
       "items": [],
       "controlType": "TextBoxYubinNo",
       "width": "70",
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
       "selectControlID": "txtYubinNo_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "placeHolder": "",
       "textKind": 2,
       "isPrivateInfo": false,
       "isPassword": false,
       "isComboBox": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "suggest": [],
       "value": "",
       "labelLText": "〒",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtJusho",
       "items": [],
       "controlType": "TextBoxMultiLine",
       "width": "430",
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
       "selectControlID": "txtJusho_text_area",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "height": "S",
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "placeHolder": "",
       "textKind": 0,
       "isPrivateInfo": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "value": "",
       "labelLText": "住所",
       "labelRText": "",
       "labelLWidth": "65",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "limitLength": "100",
       "countDisp": true
      },
      {
       "fieldName": "btnUpdate",
       "items": [],
       "controlType": "Button",
       "width": "S",
       "visible": true,
       "displayNone": false,
       "disabled": false,
       "accessKey": "",
       "nextFocusFieldName": "",
       "wrap": true,
       "dependencies": [],
       "float": 2,
       "toolTip": "",
       "authorityMode": 0,
       "marginLeft": "XS",
       "marginRight": "XS",
       "selectControlID": "btnUpdate",
       "helpMessageID": "",
       "jpControlName": "",
       "onBeforeClick": "",
       "onAfterClick": "",
       "onClick": "onClick_btnKoshin",
       "text": "更新",
       "appearance": 0,
       "imageFileUrl": "",
       "imageWidth": "",
       "imageHeight": "",
       "icon": 0,
       "heightTextBoxMatches": false
      },
      {
       "fieldName": "btnReturn",
       "items": [],
       "controlType": "Button",
       "width": "S",
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
       "selectControlID": "btnReturn",
       "helpMessageID": "",
       "jpControlName": "",
       "onBeforeClick": "",
       "onAfterClick": "",
       "onClick": "onClick_btnCancel",
       "text": "取消",
       "appearance": 0,
       "imageFileUrl": "",
       "imageWidth": "",
       "imageHeight": "",
       "icon": 0,
       "heightTextBoxMatches": false
      }
     ],
     "controlType": "Panel",
     "width": "580",
     "visible": true,
     "displayNone": true,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": true,
     "dependencies": [],
     "float": 1,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "SelectedContents",
     "helpMessageID": "",
     "jpControlName": "",
     "onLoad": "",
     "title": "連絡先内容",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": false,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "SelectedContents"
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
     "panelDisplay": 1,
     "isGroupBox": false,
     "readOnly": false,
     "height": "Auto",
     "canPost": true
    }
   ],
   "controlType": "Panel",
   "width": "600",
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
   "selectControlID": "KaigoRenrakusakiInfo",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "連絡先",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "KaigoRenrakusakiInfo"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onLoad"
    },
    {
     "eventName": "onClick_btnCancel",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnCancel"
    },
    {
     "eventName": "onClick_btnAdd",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnAdd"
    },
    {
     "eventName": "onSelectByDC_Renrakusaki",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onSelect_Renrakusaki"
    },
    {
     "eventName": "onSelectBySB_Renrakusaki",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onSelect_Renrakusaki"
    },
    {
     "eventName": "onClick_btnKoshin",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnKoshin"
    },
    {
     "eventName": "onClick_btnDelete",
     "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnDelete"
    }
   ],
   "hiddenInput": [
    {
     "propertyName": "hokenshaNo",
     "value": ""
    },
    {
     "propertyName": "hihokenshaNo",
     "value": ""
    },
    {
     "propertyName": "shoriKbn",
     "value": ""
    }
   ],
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
   "canPost": true
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
 "controlName": "KaigoRenrakusakiInfo",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [
  {
   "key": "hokenshaNo",
   "controlName": "KaigoRenrakusakiInfo.hokenshaNo"
  },
  {
   "key": "hihokenshaNo",
   "controlName": "KaigoRenrakusakiInfo.hihokenshaNo"
  }
 ],
 "dialogOkEventNameForDialog": "onClick_btnClose",
 "dialogCancelEventNameForDialog": "onClick_btnClose",
 "canTransferEvent": true,
 "heightForDialog": "Auto"
}        
    }
}

