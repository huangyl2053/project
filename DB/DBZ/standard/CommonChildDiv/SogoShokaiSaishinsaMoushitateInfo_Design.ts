/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module SogoShokaiSaishinsaMoushitateInfo {

        export class Events {

            public static get onClick_btnClose(): string {
                return "onClick_btnClose";
            }

        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "SogoShokaiSaishinsaMoushitateInfo";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public SogoShokaiSaishinsaMoushitateInfo() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public txtSaishinsaTaishoYM() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtSaishinsaTaishoYM"));

            }

            public txtSaishinsaMoshitateYMD() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtSaishinsaMoshitateYMD"));

            }

            public txtSaishinsaTeikyoYM() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtSaishinsaTeikyoYM"));

            }

            public txtSaishinsaJigyoshaCode() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtSaishinsaJigyoshaCode"));

            }

            public txtSaishinsaJigyoshaName() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaJigyoshaName"));

            }

            public txtSaishinsaServiceShuruiCode() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtSaishinsaServiceShuruiCode"));

            }

            public txtSaishinsaServiceCode() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtSaishinsaServiceCode"));

            }

            public txtSaishinsaServiceName() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaServiceName"));

            }

            public txtSaishinsaMoshitateTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaMoshitateTanisu"));

            }

            public SogoShokaiSaishinsaJiyu() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SogoShokaiSaishinsaJiyu"));

            }

            public txtSaishinsaMoshitateKomoku() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaMoshitateKomoku"));

            }

            public txtSaishinsaMoshitateRiyu() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaMoshitateRiyu"));

            }

            public SogoShokaiSaishinsaKekka() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SogoShokaiSaishinsaKekka"));

            }

            public SogoShokaiSaishinsaHokensha() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SogoShokaiSaishinsaHokensha"));

            }

            public txtSaishinsaHokenshaKekka() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaHokenshaKekka"));

            }

            public txtSaishinsaHokenshaToshoTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaToshoTanisu"));

            }

            public txtSaishinsaHokenshaGenshinTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaGenshinTanisu"));

            }

            public txtSaishinsaHokenshaMoshitateTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaMoshitateTanisu"));

            }

            public txtSaishinsaHokenshaKetteiTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaKetteiTanisu"));

            }

            public txtSaishinsaHokenshaChoseiTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaChoseiTanisu"));

            }

            public txtSaishinsaHokenshaFutangaku() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaHokenshaFutangaku"));

            }

            public SogoShokaiSaishinsaKohi() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SogoShokaiSaishinsaKohi"));

            }

            public txtSaishinsaKohiJukyushaNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtSaishinsaKohiJukyushaNo"));

            }

            public txtSaishinsaKohiJukyushaName() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaKohiJukyushaName"));

            }

            public txtSaishinsaKohiHokenshaNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtSaishinsaKohiHokenshaNo"));

            }

            public txtSaishinsaKohiKekka() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtSaishinsaKohiKekka"));

            }

            public txtSaishinsaKohiToshoTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiToshoTanisu"));

            }

            public txtSaishinsaKohiGenshinTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiGenshinTanisu"));

            }

            public txtSaishinsaKohiMoshitateTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiMoshitateTanisu"));

            }

            public txtSaishinsaKohiKetteiTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiKetteiTanisu"));

            }

            public txtSaishinsaKohiChoseiTanisu() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiChoseiTanisu"));

            }

            public txtSaishinsaKohiFutangaku() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtSaishinsaKohiFutangaku"));

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

    export class SogoShokaiSaishinsaMoushitateInfo_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, SogoShokaiSaishinsaMoushitateInfo_Design.myLayout, fieldName);
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
   "fieldName": "SogoShokaiSaishinsaMoushitateInfo",
   "items": [
    {
     "fieldName": "txtSaishinsaTaishoYM",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "60",
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
     "selectControlID": "txtSaishinsaTaishoYM_core",
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
     "labelLText": "対象年月",
     "labelRText": "",
     "labelLWidth": "70",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 1,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtSaishinsaMoshitateYMD",
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
     "selectControlID": "txtSaishinsaMoshitateYMD_core",
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
     "labelLText": "申立日",
     "labelRText": "",
     "labelLWidth": "50",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtSaishinsaTeikyoYM",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "60",
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
     "selectControlID": "txtSaishinsaTeikyoYM_core",
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
     "labelLText": "サービス提供年月",
     "labelRText": "",
     "labelLWidth": "130",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 1,
     "displayFormat": 0,
     "value": "",
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtSaishinsaJigyoshaCode",
     "items": [],
     "controlType": "TextBoxCode",
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
     "selectControlID": "txtSaishinsaJigyoshaCode_core",
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
     "labelLText": "事業者",
     "labelRText": "",
     "labelLWidth": "70",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 2,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": "",
     "formatLength": "10"
    },
    {
     "fieldName": "txtSaishinsaJigyoshaName",
     "items": [],
     "controlType": "TextBox",
     "width": "300",
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
     "selectControlID": "txtSaishinsaJigyoshaName_core",
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
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "S",
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
     "fieldName": "txtSaishinsaServiceShuruiCode",
     "items": [],
     "controlType": "TextBoxCode",
     "width": "28",
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
     "selectControlID": "txtSaishinsaServiceShuruiCode_core",
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
     "labelLText": "サービス",
     "labelRText": "",
     "labelLWidth": "70",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 2,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": "",
     "formatLength": "2"
    },
    {
     "fieldName": "txtSaishinsaServiceCode",
     "items": [],
     "controlType": "TextBoxCode",
     "width": "40",
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
     "selectControlID": "txtSaishinsaServiceCode_core",
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
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "65",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "value": "",
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "textKind": 2,
     "isComboBox": false,
     "suggest": [],
     "decorationClass": "",
     "permitCharactor": "",
     "formatLength": "4"
    },
    {
     "fieldName": "txtSaishinsaServiceName",
     "items": [],
     "controlType": "TextBox",
     "width": "300",
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
     "selectControlID": "txtSaishinsaServiceName_core",
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
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "S",
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
     "fieldName": "txtSaishinsaMoshitateTanisu",
     "items": [],
     "controlType": "TextBoxNum",
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
     "selectControlID": "txtSaishinsaMoshitateTanisu_core",
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
     "labelLText": "申立単位数",
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
     "permitCharactor": "+-,.\\",
     "maxValue": 1.7976931348623157e+308,
     "minValue": 0,
     "isCurrency": false,
     "isComma": true,
     "decimalPointLength": 0
    },
    {
     "fieldName": "SogoShokaiSaishinsaJiyu",
     "items": [
      {
       "fieldName": "txtSaishinsaMoshitateKomoku",
       "items": [],
       "controlType": "TextBox",
       "width": "520",
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
       "selectControlID": "txtSaishinsaMoshitateKomoku_core",
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
       "labelLText": "対象項目",
       "labelRText": "",
       "labelLWidth": "70",
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
       "fieldName": "txtSaishinsaMoshitateRiyu",
       "items": [],
       "controlType": "TextBox",
       "width": "520",
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
       "selectControlID": "txtSaishinsaMoshitateRiyu_core",
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
       "labelLText": "申立理由",
       "labelRText": "",
       "labelLWidth": "70",
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
      }
     ],
     "controlType": "Panel",
     "width": "G2",
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
     "selectControlID": "SogoShokaiSaishinsaJiyu",
     "helpMessageID": "",
     "jpControlName": "",
     "onLoad": "",
     "title": "申立事由",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": false,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "SogoShokaiKagoMoshitateJiyu"
      }
     ],
     "requestSettings": [],
     "hiddenInput": [],
     "onOpen": "",
     "onClose": "",
     "session": {},
     "eraseBorder": false,
     "backgroundColor": 0,
     "widthAuto": true,
     "panelDisplay": 1,
     "isGroupBox": false,
     "readOnly": false,
     "height": "Auto"
    },
    {
     "fieldName": "SogoShokaiSaishinsaKekka",
     "items": [
      {
       "fieldName": "SogoShokaiSaishinsaHokensha",
       "items": [
        {
         "fieldName": "txtSaishinsaHokenshaKekka",
         "items": [],
         "controlType": "TextBox",
         "width": "300",
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
         "selectControlID": "txtSaishinsaHokenshaKekka_core",
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
         "labelLText": "再審査結果",
         "labelRText": "",
         "labelLWidth": "115",
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
         "fieldName": "txtSaishinsaHokenshaToshoTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaToshoTanisu_core",
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
         "labelLText": "当初請求単位数",
         "labelRText": "",
         "labelLWidth": "115",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaHokenshaGenshinTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaGenshinTanisu_core",
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
         "labelLText": "原審単位数",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaHokenshaMoshitateTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaMoshitateTanisu_core",
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
         "labelLText": "申立単位数",
         "labelRText": "",
         "labelLWidth": "100",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaHokenshaKetteiTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaKetteiTanisu_core",
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
         "labelLText": "決定単位数",
         "labelRText": "",
         "labelLWidth": "115",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaHokenshaChoseiTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaChoseiTanisu_core",
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
         "labelLText": "調整単位数",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaHokenshaFutangaku",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaHokenshaFutangaku_core",
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
         "labelLText": "保険者負担額",
         "labelRText": "",
         "labelLWidth": "100",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        }
       ],
       "controlType": "Panel",
       "width": "G2",
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
       "selectControlID": "SogoShokaiSaishinsaHokensha",
       "helpMessageID": "",
       "jpControlName": "",
       "onLoad": "",
       "title": "保険者分",
       "marginTop": "Default",
       "marginBottom": "Default",
       "isOpen": true,
       "canOpenAndClose": false,
       "postParameterPanelNames": [
        {
         "postParameterPanelNames": "SogoShokaiKagoMoshitateHokensha"
        }
       ],
       "requestSettings": [],
       "hiddenInput": [],
       "onOpen": "",
       "onClose": "",
       "session": {},
       "eraseBorder": false,
       "backgroundColor": 0,
       "widthAuto": true,
       "panelDisplay": 1,
       "isGroupBox": false,
       "readOnly": false,
       "height": "Auto"
      },
      {
       "fieldName": "SogoShokaiSaishinsaKohi",
       "items": [
        {
         "fieldName": "txtSaishinsaKohiJukyushaNo",
         "items": [],
         "controlType": "TextBoxCode",
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
         "selectControlID": "txtSaishinsaKohiJukyushaNo_core",
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
         "labelLText": "公費受給者番号",
         "labelRText": "",
         "labelLWidth": "130",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "value": "",
         "maxLength": 100000000,
         "minLength": 0,
         "textAlign": 0,
         "textKind": 2,
         "isComboBox": false,
         "suggest": [],
         "decorationClass": "",
         "permitCharactor": "",
         "formatLength": "7"
        },
        {
         "fieldName": "txtSaishinsaKohiJukyushaName",
         "items": [],
         "controlType": "TextBox",
         "width": "200",
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
         "selectControlID": "txtSaishinsaKohiJukyushaName_core",
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
         "labelLText": "公費受給者氏名",
         "labelRText": "",
         "labelLWidth": "115",
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
         "fieldName": "txtSaishinsaKohiHokenshaNo",
         "items": [],
         "controlType": "TextBoxCode",
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
         "selectControlID": "txtSaishinsaKohiHokenshaNo_core",
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
         "labelLText": "証記載保険者番号",
         "labelRText": "",
         "labelLWidth": "130",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "value": "",
         "maxLength": 100000000,
         "minLength": 0,
         "textAlign": 0,
         "textKind": 2,
         "isComboBox": false,
         "suggest": [],
         "decorationClass": "",
         "permitCharactor": "",
         "formatLength": "6"
        },
        {
         "fieldName": "txtSaishinsaKohiKekka",
         "items": [],
         "controlType": "TextBox",
         "width": "300",
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
         "selectControlID": "txtSaishinsaKohiKekka_core",
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
         "labelLText": "再審査結果",
         "labelRText": "",
         "labelLWidth": "130",
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
         "fieldName": "txtSaishinsaKohiToshoTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiToshoTanisu_core",
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
         "labelLText": "当初請求単位数",
         "labelRText": "",
         "labelLWidth": "130",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaKohiGenshinTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiGenshinTanisu_core",
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
         "labelLText": "原審単位数",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaKohiMoshitateTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiMoshitateTanisu_core",
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
         "labelLText": "申立単位数",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaKohiKetteiTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiKetteiTanisu_core",
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
         "labelLText": "決定単位数",
         "labelRText": "",
         "labelLWidth": "130",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaKohiChoseiTanisu",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiChoseiTanisu_core",
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
         "labelLText": "調整単位数",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        },
        {
         "fieldName": "txtSaishinsaKohiFutangaku",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtSaishinsaKohiFutangaku_core",
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
         "labelLText": "公費負担額",
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
         "permitCharactor": "+-,.\\",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": true,
         "decimalPointLength": 0
        }
       ],
       "controlType": "Panel",
       "width": "G2",
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
       "selectControlID": "SogoShokaiSaishinsaKohi",
       "helpMessageID": "",
       "jpControlName": "",
       "onLoad": "",
       "title": "公費負担者分",
       "marginTop": "Default",
       "marginBottom": "Default",
       "isOpen": true,
       "canOpenAndClose": false,
       "postParameterPanelNames": [
        {
         "postParameterPanelNames": "SogoShokaiKagoMoshitateKohi"
        }
       ],
       "requestSettings": [],
       "hiddenInput": [],
       "onOpen": "",
       "onClose": "",
       "session": {},
       "eraseBorder": false,
       "backgroundColor": 0,
       "widthAuto": true,
       "panelDisplay": 1,
       "isGroupBox": false,
       "readOnly": false,
       "height": "Auto"
      }
     ],
     "controlType": "Panel",
     "width": "G2",
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
     "selectControlID": "SogoShokaiSaishinsaKekka",
     "helpMessageID": "",
     "jpControlName": "",
     "onLoad": "",
     "title": "再審査結果",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": false,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "SogoShokaiKagoMoshitateKekka"
      }
     ],
     "requestSettings": [],
     "hiddenInput": [],
     "onOpen": "",
     "onClose": "",
     "session": {},
     "eraseBorder": false,
     "backgroundColor": 0,
     "widthAuto": true,
     "panelDisplay": 1,
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
     "float": 2,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "selectControlID": "btnClose",
     "helpMessageID": "",
     "jpControlName": "",
     "text": "閉じる",
     "onClick": "onClick_btnClose",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    }
   ],
   "controlType": "Panel",
   "width": "G2",
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
   "selectControlID": "SogoShokaiSaishinsaMoushitateInfo",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "再審査申立情報",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "SogoShokaiSaishinsaMoushitateInfo"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": "dbu/db/dbu/SogoShokaiInfo/onLoad_SaishinsaMoushitateInfo"
    }
   ],
   "hiddenInput": [],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorder": false,
   "backgroundColor": 0,
   "widthAuto": true,
   "panelDisplay": 0,
   "isGroupBox": false,
   "readOnly": false,
   "height": "Auto"
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
 "controlName": "SogoShokaiSaishinsaMoushitateInfo",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": "onClick_btnClose",
 "canTransferEvent": true,
 "heightForDialog": "Auto"
}        
    }
}

