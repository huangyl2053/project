/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBD {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module RiyoshaFutangakuGemmen {

        export class Events {

            public static get CloseOK(): string {
                return "CloseOK";
            }
            public static get onSelect_dgRiyoshaFutangakuGemmenList(): string {
                return "onSelect_dgRiyoshaFutangakuGemmenList";
            }

        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "RiyoshaFutangakuGemmen";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public RiyoshaFutangakuGemmen() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public txtHiddenHihokenshaNo() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHiddenHihokenshaNo"));

            }

            public dgRiyoshaFutangakuGemmenList() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgRiyoshaFutangakuGemmenList"));

            }

            public RiyoshaFutangakuGemmenDetail() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("RiyoshaFutangakuGemmenDetail"));

            }

            public txtShinseiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShinseiDate"));

            }

            public RiyoshaFutangakuGemmenRiyoshaFutan() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("RiyoshaFutangakuGemmenRiyoshaFutan"));

            }

            public txtKetteiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtKetteiDate"));

            }

            public txtKetteiKubun() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKetteiKubun"));

            }

            public txtTekiyoDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtTekiyoDate"));

            }

            public txtYukokigenDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtYukokigenDate"));

            }

            public txtKyufuRitsu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtKyufuRitsu"));

            }

            public txtFushoninRiyu() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtFushoninRiyu"));

            }

            public btnClose() : UZA.Button {

                return new UZA.Button(this.convFiledName("btnClose"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class RiyoshaFutangakuGemmen_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, RiyoshaFutangakuGemmen_Design.myLayout, fieldName);
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
   "fieldName": "RiyoshaFutangakuGemmen",
   "items": [
    {
     "fieldName": "txtHiddenHihokenshaNo",
     "items": [],
     "controlType": "TextBox",
     "width": "80",
     "visible": false,
     "displayNone": true,
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
     "selectControlID": "txtHiddenHihokenshaNo_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
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
     "text": "",
     "suggest": [],
     "value": "",
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "S",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "decorationClass": "",
     "permitCharactor": ""
    },
    {
     "fieldName": "dgRiyoshaFutangakuGemmenList",
     "items": [],
     "controlType": "DataGrid",
     "width": "910",
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
     "selectControlID": "dgRiyoshaFutangakuGemmenList",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "185",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": true,
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
       "frozenColumn": "",
       "headerHeight": 1
      },
      "columns": [
       {
        "columnName": "申請日",
        "dataName": "shinseiDate",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "shinseiDate"
       },
       {
        "columnName": "適用日",
        "dataName": "tekiyoDate",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "tekiyoDate"
       },
       {
        "columnName": "有効期限<br>",
        "dataName": "yukoKigen",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "yukoKigen"
       },
       {
        "columnName": "決定区分",
        "dataName": "ketteiKubun",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "ketteiKubun"
       },
       {
        "columnName": "決定日",
        "dataName": "ketteiDate",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "ketteiDate"
       },
       {
        "columnName": "給付率<br>",
        "dataName": "kyufuRitsu",
        "toolTip": "",
        "bgColor": 0,
        "width": 60,
        "visible": true,
        "cellType": 5,
        "cellDetails": {
         "cellType": 5,
         "maxLength": "3",
         "minLength": "0",
         "maxValue": "100",
         "minValue": "0",
         "isCurrency": false,
         "isComma": false,
         "decimalPointLength": "0",
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": false
        },
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "kyufuRitsu"
       },
       {
        "columnName": "承認しない理由",
        "dataName": "fushoninRiyu",
        "toolTip": "",
        "bgColor": 0,
        "width": 390,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "fushoninRiyu"
       }
      ]
     },
     "onSort": "",
     "onSelect": "onSelect_dgRiyoshaFutangakuGemmenList",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "",
     "onSelectByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "fushoninRiyu",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "RiyoshaFutangakuGemmenDetail",
     "items": [
      {
       "fieldName": "txtShinseiDate",
       "items": [],
       "controlType": "TextBoxFlexibleDate",
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
       "marginLeft": "S",
       "marginRight": "XS",
       "selectControlID": "txtShinseiDate_core",
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
       "value": "",
       "labelLText": "申請日",
       "labelRText": "",
       "labelLWidth": "S",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "ymdKubun": 2,
       "displayFormat": 0,
       "permitCharactor": "./_-"
      },
      {
       "fieldName": "RiyoshaFutangakuGemmenRiyoshaFutan",
       "items": [
        {
         "fieldName": "txtKetteiDate",
         "items": [],
         "controlType": "TextBoxFlexibleDate",
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
         "selectControlID": "txtKetteiDate_core",
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
         "value": "",
         "labelLText": "決定日",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "ymdKubun": 2,
         "displayFormat": 0,
         "permitCharactor": "./_-"
        },
        {
         "fieldName": "txtKetteiKubun",
         "items": [],
         "controlType": "TextBox",
         "width": "75",
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
         "selectControlID": "txtKetteiKubun_core",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
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
         "text": "",
         "suggest": [],
         "value": "",
         "labelLText": "決定区分",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "decorationClass": "",
         "permitCharactor": ""
        },
        {
         "fieldName": "txtTekiyoDate",
         "items": [],
         "controlType": "TextBoxFlexibleDate",
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
         "selectControlID": "txtTekiyoDate_core",
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
         "value": "",
         "labelLText": "適用日",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "ymdKubun": 2,
         "displayFormat": 0,
         "permitCharactor": "./_-"
        },
        {
         "fieldName": "txtYukokigenDate",
         "items": [],
         "controlType": "TextBoxFlexibleDate",
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
         "selectControlID": "txtYukokigenDate_core",
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
         "value": "",
         "labelLText": "有効期限",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "ymdKubun": 2,
         "displayFormat": 0,
         "permitCharactor": "./_-"
        },
        {
         "fieldName": "txtKyufuRitsu",
         "items": [],
         "controlType": "TextBoxNum",
         "width": "30",
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
         "selectControlID": "txtKyufuRitsu_core",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
         "required": false,
         "maxLength": "3",
         "minLength": "1",
         "textAlign": 2,
         "placeHolder": "",
         "textKind": 2,
         "isPrivateInfo": false,
         "isPassword": false,
         "isComboBox": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "text": "",
         "suggest": [],
         "value": "",
         "labelLText": "給付率",
         "labelRText": "％",
         "labelLWidth": "S",
         "labelRWidth": "32",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "decorationClass": "",
         "maxValue": "100",
         "minValue": 0,
         "isCurrency": false,
         "isComma": false,
         "decimalPointLength": 0,
         "permitCharactor": "+-,.\\"
        },
        {
         "fieldName": "txtFushoninRiyu",
         "items": [],
         "controlType": "TextBoxMultiLine",
         "width": "750",
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
         "selectControlID": "txtFushoninRiyu_text_area",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
         "height": "XS",
         "required": false,
         "maxLength": "200",
         "minLength": 0,
         "placeHolder": "",
         "textKind": 0,
         "isPrivateInfo": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "text": "",
         "value": "",
         "labelLText": "承認しない理由",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "limitLength": "200",
         "countDisp": false
        }
       ],
       "controlType": "Panel",
       "width": "892",
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
       "selectControlID": "RiyoshaFutangakuGemmenRiyoshaFutan",
       "helpMessageID": "",
       "jpControlName": "",
       "onLoad": "",
       "title": "利用者負担",
       "marginTop": "Default",
       "marginBottom": "Default",
       "isOpen": true,
       "canOpenAndClose": false,
       "postParameterPanelNames": [
        {
         "postParameterPanelNames": "RiyoshaFutangakuGemmenRiyoshaFutan"
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
       "height": "Auto"
      }
     ],
     "controlType": "Panel",
     "width": "910",
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
     "selectControlID": "RiyoshaFutangakuGemmenDetail",
     "helpMessageID": "",
     "jpControlName": "",
     "onLoad": "",
     "title": "詳細",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": true,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "RiyoshaFutangakuGemmenDetail"
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
     "height": "Auto"
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
     "wrap": true,
     "dependencies": [],
     "float": 1,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "btnClose",
     "helpMessageID": "",
     "jpControlName": "",
     "text": "閉じる",
     "onClick": "CloseOK",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    }
   ],
   "controlType": "Panel",
   "width": "G10",
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
   "selectControlID": "RiyoshaFutangakuGemmen",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "利用者負担額減免",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "RiyoshaFutangakuGemmen"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": "dbd/db/dbd/RiyoshaFutangakuGemmen/onLoad"
    },
    {
     "eventName": "onSelect_dgRiyoshaFutangakuGemmenList",
     "requestUrl": "dbd/db/dbd/RiyoshaFutangakuGemmen/onSelect_dgRiyoshaFutangakuGemmenList"
    }
   ],
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
   "height": "450"
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
 "businessId": "DBD",
 "controlName": "RiyoshaFutangakuGemmen",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [
  {
   "key": "hihokenshaNo",
   "controlName": "txtHiddenHihokenshaNo"
  }
 ],
 "dialogOkEventNameForDialog": "CloseOK",
 "dialogCancelEventNameForDialog": "",
 "canTransferEvent": true,
 "heightForDialog": "490"
}        
    }
}

