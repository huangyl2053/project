/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     * ShinseishaInfoクラスのみで継承して使えます。
     */
    export class ShinseishaInfo_Design extends Uz.CommonChildDiv {
    
        public get btnJigyoshaInputGuide_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"])["displayNone"];
        }
        
        public set btnJigyoshaInputGuide_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[4]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get txtUkestukeDate_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["displayNone"];
        }
        
        public set txtUkestukeDate_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[2]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get title() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["title"];
        }
        
        public set title(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["title"] = value;
            } else {
                this.layout.items[0]["title"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get panelDisplay() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["panelDisplay"];
        }
        
        public set panelDisplay(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["panelDisplay"] = value;
            } else {
                this.layout.items[0]["panelDisplay"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get txtJigyoshaNo_disabled() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["disabled"];
        }
        
        public set txtJigyoshaNo_disabled(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["disabled"] = value;
            } else {
                this.layout.items[0].items[3]["disabled"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get txtShinseishaName_labelLText() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"])["labelLText"];
        }
        
        public set txtShinseishaName_labelLText(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"])["labelLText"] = value;
            } else {
                this.layout.items[0].items[6]["labelLText"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get txtYubinNo_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[9]["fieldName"])["displayNone"];
        }
        
        public set txtYubinNo_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[9]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[9]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[9]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[9]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get txtAddress_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["displayNone"];
        }
        
        public set txtAddress_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[10]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get btnJigyoshaInputGuide_disabled() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"])["disabled"];
        }
        
        public set btnJigyoshaInputGuide_disabled(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"])["disabled"] = value;
            } else {
                this.layout.items[0].items[4]["disabled"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get shinseishaInfo_eraseBorder() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["eraseBorder"];
        }
        
        public set shinseishaInfo_eraseBorder(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["eraseBorder"] = value;
            } else {
                this.layout.items[0]["eraseBorder"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, ShinseishaInfo_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("btnJigyoshaInputGuide_displayNone");
            Uz.JSControlUtil.registProperty("txtUkestukeDate_displayNone");
            Uz.JSControlUtil.registProperty("title");
            Uz.JSControlUtil.registProperty("panelDisplay");
            Uz.JSControlUtil.registProperty("txtJigyoshaNo_disabled");
            Uz.JSControlUtil.registProperty("txtShinseishaName_labelLText");
            Uz.JSControlUtil.registProperty("txtYubinNo_displayNone");
            Uz.JSControlUtil.registProperty("txtAddress_displayNone");
            Uz.JSControlUtil.registProperty("btnJigyoshaInputGuide_disabled");
            Uz.JSControlUtil.registProperty("shinseishaInfo_eraseBorder");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["btnJigyoshaInputGuide_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["txtUkestukeDate_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["title"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]).getEditablePropertyInfo()["title"];
            editablePropertyInfo["panelDisplay"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]).getEditablePropertyInfo()["panelDisplay"];
            editablePropertyInfo["txtJigyoshaNo_disabled"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).getEditablePropertyInfo()["disabled"];
            editablePropertyInfo["txtShinseishaName_labelLText"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]).getEditablePropertyInfo()["labelLText"];
            editablePropertyInfo["txtYubinNo_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[9]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["txtAddress_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["btnJigyoshaInputGuide_disabled"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[4]["fieldName"]).getEditablePropertyInfo()["disabled"];
            editablePropertyInfo["shinseishaInfo_eraseBorder"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]).getEditablePropertyInfo()["eraseBorder"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "ShinseishaInfo",
   "items": [
    {
     "fieldName": "txtShinseiDate",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "85",
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
     "selectControlID": "txtShinseiDate_core",
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
     "labelLText": "申請日",
     "labelRText": "",
     "labelLWidth": "55",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "textKind": 0,
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "ddlShinseishaKubun",
     "items": [],
     "controlType": "DropDownList",
     "width": "150",
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
     "selectControlID": "ddlShinseishaKubun_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "required": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "onChange_ddlShinseishaKubun",
     "labelLText": "申請者区分",
     "labelRText": "",
     "labelLWidth": "90",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "selectedItem": "myself",
     "dataSource": [
      {
       "key": "myself",
       "value": "本人"
      },
      {
       "key": "family",
       "value": "家族"
      },
      {
       "key": "serviceJigyosha",
       "value": "サービス事業者"
      },
      {
       "key": "other",
       "value": "その他"
      },
      {
       "key": "blank",
       "value": ""
      }
     ]
    },
    {
     "fieldName": "txtUketsukeDate",
     "items": [],
     "controlType": "TextBoxDate",
     "width": "90",
     "visible": true,
     "displayNone": true,
     "disabled": false,
     "accessKey": "",
     "nextFocusFieldName": "",
     "wrap": false,
     "dependencies": [],
     "float": 0,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "2.5",
     "marginRight": "XS",
     "selectControlID": "txtUketsukeDate_core",
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
     "labelLText": "受付日",
     "labelRText": "",
     "labelLWidth": "55",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0,
     "value": "",
     "textKind": 0,
     "permitCharactor": "./_-"
    },
    {
     "fieldName": "txtJigyoshaNo",
     "items": [],
     "controlType": "TextBoxCode",
     "width": "85",
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
     "selectControlID": "txtJigyoshaNo_core",
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
     "labelLText": "事業者",
     "labelRText": "",
     "labelLWidth": "55",
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
     "fieldName": "btnJigyoshaInputGuide",
     "items": [],
     "controlType": "ButtonDialog",
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
     "marginLeft": "0",
     "marginRight": "0",
     "selectControlID": "btnJigyoshaInputGuide",
     "helpMessageID": "",
     "jpControlName": "",
     "text": "ButtonDialog1",
     "onClick": "",
     "appearance": 2,
     "imageFileUrl": "/uz/uza/image/UZ_Search.png",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": true,
     "displayChildDivName": "DBZ.JigyoshaInputGuide",
     "dataPassing": [
      {
       "key": "jigyoshaCode",
       "controlName": "txtJigyoshaNo"
      },
      {
       "key": "jigyoshaMeisho",
       "controlName": "txtShinseishaName"
      }
     ],
     "visibleCloseButton": true,
     "onOkClose": "",
     "onBeforeOpenDialog": ""
    },
    {
     "fieldName": "ddlHokensha",
     "items": [],
     "controlType": "DropDownList",
     "width": "120",
     "visible": true,
     "displayNone": true,
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
     "selectControlID": "ddlHokensha_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "labelLText": "保険者",
     "labelRText": "",
     "labelLWidth": "48",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "selectedItem": "key0",
     "dataSource": [
      {
       "key": "key0",
       "value": "value0"
      },
      {
       "key": "key1",
       "value": "value1"
      }
     ]
    },
    {
     "fieldName": "txtShinseishaNameKana",
     "items": [],
     "controlType": "TextBox",
     "width": "355",
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
     "selectControlID": "txtShinseishaNameKana_core",
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
     "labelLText": "氏名",
     "labelRText": "",
     "labelLWidth": "55",
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
     "fieldName": "txtShinseishaName",
     "items": [],
     "controlType": "TextBox",
     "width": "355",
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
     "marginLeft": "3.9",
     "marginRight": "XS",
     "selectControlID": "txtShinseishaName_core",
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
     "labelLText": "",
     "labelRText": "",
     "labelLWidth": "80",
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
     "fieldName": "txtTelNo",
     "items": [],
     "controlType": "TextBox",
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
     "marginLeft": "0.3",
     "marginRight": "XS",
     "selectControlID": "txtTelNo_core",
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
     "labelLText": "電話番号",
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
     "fieldName": "txtYubinNo",
     "items": [],
     "controlType": "TextBoxYubinNo",
     "width": "65",
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
     "required": false,
     "placeHolder": "",
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "labelLText": "住所",
     "labelRText": "",
     "labelLWidth": "55",
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
     "permitCharactor": ""
    },
    {
     "fieldName": "txtAddress",
     "items": [],
     "controlType": "TextBox",
     "width": "481",
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
     "marginLeft": "-0.2",
     "marginRight": "XS",
     "selectControlID": "txtAddress_core",
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
    }
   ],
   "controlType": "Panel",
   "width": "637",
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
   "selectControlID": "ShinseishaInfo",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "申請者情報",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": false,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "YoguKonyuhiShikyuShinseishaJoho"
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
 "controlName": "ShinseishaInfo",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "btnJigyoshaInputGuide",
   "publicChildProperty": "displayNone",
   "newPropertyName": "btnJigyoshaInputGuide_displayNone"
  },
  {
   "publicChildFieldName": "txtUketsukeDate",
   "publicChildProperty": "displayNone",
   "newPropertyName": "txtUkestukeDate_displayNone"
  },
  {
   "publicChildFieldName": "ShinseishaInfo",
   "publicChildProperty": "title",
   "newPropertyName": "title"
  },
  {
   "publicChildFieldName": "ShinseishaInfo",
   "publicChildProperty": "panelDisplay",
   "newPropertyName": "panelDisplay"
  },
  {
   "publicChildFieldName": "txtJigyoshaNo",
   "publicChildProperty": "disabled",
   "newPropertyName": "txtJigyoshaNo_disabled"
  },
  {
   "publicChildFieldName": "txtShinseishaNameKana",
   "publicChildProperty": "labelLText",
   "newPropertyName": "txtShinseishaName_labelLText"
  },
  {
   "publicChildFieldName": "txtYubinNo",
   "publicChildProperty": "displayNone",
   "newPropertyName": "txtYubinNo_displayNone"
  },
  {
   "publicChildFieldName": "txtAddress",
   "publicChildProperty": "displayNone",
   "newPropertyName": "txtAddress_displayNone"
  },
  {
   "publicChildFieldName": "btnJigyoshaInputGuide",
   "publicChildProperty": "disabled",
   "newPropertyName": "btnJigyoshaInputGuide_disabled"
  },
  {
   "publicChildFieldName": "ShinseishaInfo",
   "publicChildProperty": "eraseBorder",
   "newPropertyName": "shinseishaInfo_eraseBorder"
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
