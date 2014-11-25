/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module JukyuShikakuShomeishoHakko {

        export class Events {


        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "JukyuShikakuShomeishoHakko";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public JukyuShikakuShomeishoHakko() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public txtKofuDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtKofuDate"));

            }

            public txtIdoYoteiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtIdoYoteiDate"));

            }

            public txtYokaigoJotai() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtYokaigoJotai"));

            }

            public txtNinteiYukoKikan() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtNinteiYukoKikan"));

            }

            public txtShinseiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShinseiDate"));

            }

            public lblNinteiShinsakaiIken() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblNinteiShinsakaiIken"));

            }

            public txtNinteiShinsakaiIken() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtNinteiShinsakaiIken"));

            }

            public lblBiko() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblBiko"));

            }

            public txtBiko() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtBiko"));

            }

            public chkJushoHihyoji() : UZA.CheckBoxList {

                return new UZA.CheckBoxList(this.convFiledName("chkJushoHihyoji"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class JukyuShikakuShomeishoHakko_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, JukyuShikakuShomeishoHakko_Design.myLayout, fieldName);
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
   "fieldName": "JukyuShikakuShomeishoHakko",
   "items": [
    {
     "fieldName": "txtKofuDate",
     "items": [],
     "controlType": "TextBoxFlexibleDate",
     "width": "90",
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
     "required": false,
     "readOnly": false,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "交付日",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtIdoYoteiDate",
     "items": [],
     "controlType": "TextBoxFlexibleDate",
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
     "required": false,
     "readOnly": false,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "異動予定日",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtYokaigoJotai",
     "items": [],
     "controlType": "TextBox",
     "width": "60",
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
     "required": false,
     "readOnly": true,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "要介護状態",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 1000000000000,
     "minLength": 0,
     "textAlign": 0,
     "isComboBox": false,
     "suggest": [],
     "permitCharactor": ""
    },
    {
     "fieldName": "txtNinteiYukoKikan",
     "items": [],
     "controlType": "TextBoxDateRange",
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
     "readOnly": true,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "labelLText": "認定有効期間",
     "labelRText": "",
     "labelLWidth": "115",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "permitCharactor": "",
     "fromPlaceHolder": "",
     "toPlaceHolder": "",
     "minDate": "",
     "maxDate": "",
     "fromText": "",
     "toText": "",
     "fromValue": "",
     "toValue": ""
    },
    {
     "fieldName": "txtShinseiDate",
     "items": [],
     "controlType": "TextBoxFlexibleDate",
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
     "required": false,
     "readOnly": true,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "申請日",
     "labelRText": "",
     "labelLWidth": "50",
     "labelRWidth": "",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "lblNinteiShinsakaiIken",
     "items": [],
     "controlType": "Label",
     "width": "150",
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
     "required": false,
     "isPrivateInfo": false,
     "text": "認定審査会の意見等",
     "align": 2
    },
    {
     "fieldName": "txtNinteiShinsakaiIken",
     "items": [],
     "controlType": "TextBoxMultiLine",
     "width": "800",
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
     "required": false,
     "readOnly": false,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "S",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "height": "S",
     "limitLength": "150",
     "countDisp": true
    },
    {
     "fieldName": "lblBiko",
     "items": [],
     "controlType": "Label",
     "width": "40",
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
     "required": false,
     "isPrivateInfo": false,
     "text": "備考",
     "align": 2
    },
    {
     "fieldName": "txtBiko",
     "items": [],
     "controlType": "TextBoxMultiLine",
     "width": "800",
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
     "required": false,
     "readOnly": false,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "S",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "height": "S",
     "limitLength": "240",
     "countDisp": true
    },
    {
     "fieldName": "chkJushoHihyoji",
     "items": [],
     "controlType": "CheckBoxList",
     "width": "100",
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
     "required": false,
     "onChange": "",
     "labelLText": "",
     "labelLWidth": "S",
     "labelLAlign": 2,
     "selectedItem": "",
     "dataSource": [
      {
       "key": "jushoHihyoji",
       "value": "住所非表示"
      }
     ],
     "onClick": "",
     "selectedItems": [],
     "newLineItemNumber": 2,
     "minCheckedItem": 0,
     "maxCheckedItem": "1",
     "spaceSize": 1,
     "isAllSelectable": false
    }
   ],
   "controlType": "Panel",
   "width": "1030",
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
   "onLoad": "",
   "title": "",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "JukyuShikakuShomeishoHakko"
    }
   ],
   "requestSettings": [],
   "hiddenInput": [],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorderTop": true,
   "eraseBorderBottom": true,
   "eraseBorderRight": true,
   "eraseBorderLeft": true,
   "backgroundColor": 0,
   "widthAuto": false,
   "isGroupBox": false
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
 "marginLeft": 0,
 "marginRight": 0,
 "relation": [],
 "businessId": "DBZ",
 "controlName": "JukyuShikakuShomeishoHakko",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": ""
}        
    }
}

