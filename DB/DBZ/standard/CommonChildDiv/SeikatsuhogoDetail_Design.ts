/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module SeikatsuhogoDetail {

        export class Events {


        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "SeikatsuhogoDetail";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public SeikatsuhogoDetail() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public SeikatsuhogoDetailSub() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("SeikatsuhogoDetailSub"));

            }

            public txtJukyushaNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtJukyushaNo"));

            }

            public txtKaishiYM() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtKaishiYM"));

            }

            public txtHaishiYM() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtHaishiYM"));

            }

            public txtHokenshaNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtHokenshaNo"));

            }

            public btnHokenshaGuide() : UZA.ButtonDialog {

                return new UZA.ButtonDialog(this.convFiledName("btnHokenshaGuide"));

            }

            public txtHokenshaName() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHokenshaName"));

            }

            public HokenryoDairinofu() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("HokenryoDairinofu"));

            }

            public radDairinofuKubun() : UZA.RadioButton {

                return new UZA.RadioButton(this.convFiledName("radDairinofuKubun"));

            }

            public txtNofuYM() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtNofuYM"));

            }

            public KyugoShisetsu() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("KyugoShisetsu"));

            }

            public radNyutaishoKubun() : UZA.RadioButton {

                return new UZA.RadioButton(this.convFiledName("radNyutaishoKubun"));

            }

            public txtNyushoDate() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtNyushoDate"));

            }

            public txtTaishoDate() : UZA.TextBoxDate {

                return new UZA.TextBoxDate(this.convFiledName("txtTaishoDate"));

            }

            public FujoShurui() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("FujoShurui"));

            }

            public chkFujyoShurui() : UZA.CheckBoxList {

                return new UZA.CheckBoxList(this.convFiledName("chkFujyoShurui"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class SeikatsuhogoDetail_Design extends Uz.CommonChildDiv {
    
        public get btnHokenshaGuide_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"] + "_" + this.layout.items[0].items[0].items[4]["fieldName"])["displayNone"];
        }
        
        public set btnHokenshaGuide_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"] + "_" + this.layout.items[0].items[0].items[4]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"] + "_" + this.layout.items[0].items[0].items[4]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"] + "_" + this.layout.items[0].items[0].items[4]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[0].items[4]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, SeikatsuhogoDetail_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("btnHokenshaGuide_displayNone");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["btnHokenshaGuide_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"] + "_" + this.layout.items[0].items[0].items[4]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "SeikatsuhogoDetail",
   "items": [
    {
     "fieldName": "SeikatsuhogoDetailSub",
     "items": [
      {
       "fieldName": "txtJukyushaNo",
       "items": [],
       "controlType": "TextBoxCode",
       "width": "65",
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
       "selectControlID": "txtJukyushaNo_core",
       "text": "",
       "required": true,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "readOnly": false,
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
       "labelLText": "受給者番号",
       "labelRText": "",
       "labelLWidth": "90",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "permitCharactor": "",
       "formatLength": "8"
      },
      {
       "fieldName": "txtKaishiYM",
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
       "selectControlID": "txtKaishiYM_core",
       "text": "",
       "required": true,
       "readOnly": false,
       "placeHolder": "",
       "isPrivateInfo": false,
       "isPassword": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "value": "",
       "labelLText": "開始年月",
       "labelRText": "",
       "labelLWidth": "70",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "permitCharactor": "./_-",
       "ymdKubun": 1,
       "displayFormat": 0
      },
      {
       "fieldName": "txtHaishiYM",
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
       "selectControlID": "txtHaishiYM_core",
       "text": "",
       "required": false,
       "readOnly": false,
       "placeHolder": "",
       "isPrivateInfo": false,
       "isPassword": false,
       "onFocus": "",
       "onBlur": "",
       "onChange": "",
       "onKeyPress": "",
       "value": "",
       "labelLText": "廃止年月",
       "labelRText": "",
       "labelLWidth": "70",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "permitCharactor": "./_-",
       "ymdKubun": 1,
       "displayFormat": 0
      },
      {
       "fieldName": "txtHokenshaNo",
       "items": [],
       "controlType": "TextBoxCode",
       "width": "50",
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
       "selectControlID": "txtHokenshaNo_core",
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "readOnly": false,
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
       "labelLText": "措置市町村",
       "labelRText": "",
       "labelLWidth": "90",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "permitCharactor": "",
       "formatLength": "8"
      },
      {
       "fieldName": "btnHokenshaGuide",
       "items": [],
       "controlType": "ButtonDialog",
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
       "marginLeft": "-0.2",
       "marginRight": "XS",
       "selectControlID": "btnHokenshaGuide",
       "onClick": "",
       "text": "補助",
       "appearance": 0,
       "imageFileUrl": "",
       "imageWidth": "",
       "imageHeight": "",
       "icon": 0,
       "displayChildDivName": "",
       "dataPassing": [],
       "visibleCloseButton": true,
       "onOkClose": "",
       "onBeforeOpenDialog": ""
      },
      {
       "fieldName": "txtHokenshaName",
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
       "marginLeft": "-0.2",
       "marginRight": "XS",
       "selectControlID": "txtHokenshaName_core",
       "text": "",
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 0,
       "readOnly": false,
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
       "labelLText": "",
       "labelRText": "",
       "labelLWidth": "S",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "permitCharactor": ""
      },
      {
       "fieldName": "HokenryoDairinofu",
       "items": [
        {
         "fieldName": "radDairinofuKubun",
         "items": [],
         "controlType": "RadioButton",
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
         "marginLeft": "XS",
         "marginRight": "XS",
         "selectControlID": "radDairinofuKubun_core",
         "onClick": "",
         "dataSource": [
          {
           "key": "key0",
           "value": "該当"
          },
          {
           "key": "key1",
           "value": "非該当"
          }
         ],
         "onChange": "",
         "labelLText": "区分",
         "labelLWidth": "85",
         "labelLAlign": 2,
         "selectedItem": "",
         "newLineItemNumber": 2,
         "spaceSize": "M"
        },
        {
         "fieldName": "txtNofuYM",
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
         "selectControlID": "txtNofuYM_core",
         "text": "",
         "required": false,
         "readOnly": false,
         "placeHolder": "",
         "isPrivateInfo": false,
         "isPassword": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "value": "",
         "labelLText": "納付区分年月",
         "labelRText": "",
         "labelLWidth": "100",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "permitCharactor": "./_-",
         "ymdKubun": 1,
         "displayFormat": 0
        }
       ],
       "controlType": "Panel",
       "width": "M",
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
       "selectControlID": "HokenryoDairinofu",
       "onLoad": "",
       "title": "介護保険料代理納付",
       "marginTop": "M",
       "marginBottom": "Default",
       "isOpen": true,
       "canOpenAndClose": false,
       "postParameterPanelNames": [
        {
         "postParameterPanelNames": "HokenryoDairinofu"
        }
       ],
       "requestSettings": [],
       "hiddenInput": [],
       "onOpen": "",
       "onClose": "",
       "session": {},
       "eraseBorderTop": false,
       "eraseBorderBottom": false,
       "eraseBorderRight": false,
       "eraseBorderLeft": false,
       "backgroundColor": 0,
       "widthAuto": true,
       "panelDisplay": 1,
       "isGroupBox": false
      },
      {
       "fieldName": "KyugoShisetsu",
       "items": [
        {
         "fieldName": "radNyutaishoKubun",
         "items": [],
         "controlType": "RadioButton",
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
         "selectControlID": "radNyutaishoKubun_core",
         "onClick": "",
         "dataSource": [
          {
           "key": "key0",
           "value": "入所"
          },
          {
           "key": "key1",
           "value": "退所"
          },
          {
           "key": "",
           "value": "未該当"
          }
         ],
         "onChange": "",
         "labelLText": "入退所区分",
         "labelLWidth": "85",
         "labelLAlign": 2,
         "selectedItem": "",
         "newLineItemNumber": 3,
         "spaceSize": "M"
        },
        {
         "fieldName": "txtNyushoDate",
         "items": [],
         "controlType": "TextBoxDate",
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
         "selectControlID": "txtNyushoDate_core",
         "text": "",
         "required": false,
         "readOnly": false,
         "placeHolder": "",
         "isPrivateInfo": false,
         "isPassword": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "value": "",
         "labelLText": "入所日",
         "labelRText": "",
         "labelLWidth": "85",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "permitCharactor": "./_-",
         "ymdKubun": 2,
         "displayFormat": 0
        },
        {
         "fieldName": "txtTaishoDate",
         "items": [],
         "controlType": "TextBoxDate",
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
         "selectControlID": "txtTaishoDate_core",
         "text": "",
         "required": false,
         "readOnly": false,
         "placeHolder": "",
         "isPrivateInfo": false,
         "isPassword": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "value": "",
         "labelLText": "退所日",
         "labelRText": "",
         "labelLWidth": "70",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "permitCharactor": "./_-",
         "ymdKubun": 2,
         "displayFormat": 0
        }
       ],
       "controlType": "Panel",
       "width": "M",
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
       "selectControlID": "KyugoShisetsu",
       "onLoad": "",
       "title": "救護施設",
       "marginTop": "Default",
       "marginBottom": "Default",
       "isOpen": true,
       "canOpenAndClose": false,
       "postParameterPanelNames": [
        {
         "postParameterPanelNames": "KyugoShisetsu"
        }
       ],
       "requestSettings": [],
       "hiddenInput": [],
       "onOpen": "",
       "onClose": "",
       "session": {},
       "eraseBorderTop": false,
       "eraseBorderBottom": false,
       "eraseBorderRight": false,
       "eraseBorderLeft": false,
       "backgroundColor": 0,
       "widthAuto": true,
       "panelDisplay": 1,
       "isGroupBox": false
      }
     ],
     "controlType": "Panel",
     "width": "470",
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
     "selectControlID": "SeikatsuhogoDetailSub",
     "onLoad": "",
     "title": "",
     "marginTop": "S",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": true,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "SeikatsuhogoDetailSub"
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
     "widthAuto": true,
     "panelDisplay": 0,
     "isGroupBox": false
    },
    {
     "fieldName": "FujoShurui",
     "items": [
      {
       "fieldName": "chkFujyoShurui",
       "items": [],
       "controlType": "CheckBoxList",
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
       "selectControlID": "chkFujyoShurui_core",
       "onClick": "",
       "dataSource": [
        {
         "key": "seikatsu",
         "value": "生活扶助"
        },
        {
         "key": "kyoiku",
         "value": "教育扶助"
        },
        {
         "key": "jutaku",
         "value": "住宅扶助"
        },
        {
         "key": "iryo",
         "value": "医療扶助"
        },
        {
         "key": "kaigo",
         "value": "介護扶助"
        },
        {
         "key": "shussan",
         "value": "出産扶助"
        },
        {
         "key": "nariwai",
         "value": "生業扶助"
        },
        {
         "key": "sosai",
         "value": "葬祭扶助"
        },
        {
         "key": "zanryuhojin",
         "value": "残留邦人"
        }
       ],
       "required": true,
       "onChange": "",
       "labelLText": "",
       "labelLWidth": "M",
       "labelLAlign": 0,
       "selectedItem": "",
       "newLineItemNumber": 1,
       "spaceSize": "S",
       "selectedItems": [],
       "minCheckedItem": 0,
       "maxCheckedItem": 2,
       "isAllSelectable": false
      }
     ],
     "controlType": "Panel",
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
     "selectControlID": "FujoShurui",
     "onLoad": "",
     "title": "扶助種類",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": false,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "FujoShurui"
      }
     ],
     "requestSettings": [],
     "hiddenInput": [],
     "onOpen": "",
     "onClose": "",
     "session": {},
     "eraseBorderTop": false,
     "eraseBorderBottom": false,
     "eraseBorderRight": false,
     "eraseBorderLeft": false,
     "backgroundColor": 0,
     "widthAuto": true,
     "panelDisplay": 1,
     "isGroupBox": false
    }
   ],
   "controlType": "Panel",
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
   "selectControlID": "SeikatsuhogoDetail",
   "onLoad": "",
   "title": "",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "SeikatsuhogoDetail"
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
   "widthAuto": true,
   "panelDisplay": 0,
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
 "selectControlID": "defaultLayout",
 "relation": [],
 "businessId": "DBZ",
 "controlName": "SeikatsuhogoDetail",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "btnHokenshaGuide",
   "publicChildProperty": "displayNone",
   "newPropertyName": "btnHokenshaGuide_displayNone"
  }
 ],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": ""
}        
    }
}

