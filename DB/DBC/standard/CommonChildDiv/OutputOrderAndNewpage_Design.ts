/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBC {
    /**
     * 自動生成コードです。修正しないでください。
     * OutputOrderAndNewpageクラスのみで継承して使えます。
     */
    export class OutputOrderAndNewpage_Design extends Uz.CommonChildDiv {
    
        public get isGroupBox() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["isGroupBox"];
        }
        
        public set isGroupBox(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"])["isGroupBox"] = value;
            } else {
                this.layout.items[0]["isGroupBox"] = value;
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
        
        public get txtNewPageItem_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["displayNone"];
        }
        
        public set txtNewPageItem_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[1]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, OutputOrderAndNewpage_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("isGroupBox");
            Uz.JSControlUtil.registProperty("title");
            Uz.JSControlUtil.registProperty("txtNewPageItem_displayNone");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["isGroupBox"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]).getEditablePropertyInfo()["isGroupBox"];
            editablePropertyInfo["title"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"]).getEditablePropertyInfo()["title"];
            editablePropertyInfo["txtNewPageItem_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "OutputOrderAndNewpage",
   "items": [
    {
     "fieldName": "btnChangeOrder",
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
     "onClick": "",
     "text": "出力順序を変更する",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": ""
    },
    {
     "fieldName": "txtNewPageItem",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "改頁項目",
     "labelRText": "",
     "labelLWidth": "182",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txt1",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "1:",
     "labelRText": "",
     "labelLWidth": "15",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txt2",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "2:",
     "labelRText": "",
     "labelLWidth": "15",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txt3",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "3:",
     "labelRText": "",
     "labelLWidth": "15",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txt4",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "4:",
     "labelRText": "",
     "labelLWidth": "15",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txt5",
     "items": [],
     "controlType": "TextBox",
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
     "text": "",
     "required": false,
     "maxLength": 1000000000000,
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
     "labelLText": "5:",
     "labelRText": "",
     "labelLWidth": "15",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    }
   ],
   "controlType": "Panel",
   "width": "980",
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
   "title": "出力順序・改頁",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "OutputOrderAndNewpage"
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
 "businessId": "DBC",
 "controlName": "OutputOrderAndNewpage",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "OutputOrderAndNewpage",
   "publicChildProperty": "isGroupBox",
   "newPropertyName": "isGroupBox"
  },
  {
   "publicChildFieldName": "OutputOrderAndNewpage",
   "publicChildProperty": "title",
   "newPropertyName": "title"
  },
  {
   "publicChildFieldName": "txtNewPageItem",
   "publicChildProperty": "displayNone",
   "newPropertyName": "txtNewPageItem_displayNone"
  }
 ],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": ""
}        
    }
}
