/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     * ShoKaishuJokyoShosaiクラスのみで継承して使えます。
     */
    export class ShoKaishuJokyoShosai_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, ShoKaishuJokyoShosai_Design.myLayout, fieldName);
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
   "fieldName": "ShoKaishuJokyoShosai",
   "items": [
    {
     "fieldName": "txt",
     "items": [],
     "controlType": "TextBox",
     "width": "160",
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
     "selectControlID": "txt_core",
     "required": false,
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "readOnly": true,
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
     "labelLText": "交付証種類",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
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
     "selectControlID": "txtKofuDate_core",
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
     "value": "",
     "labelLText": "交付日",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0
    },
    {
     "fieldName": "txtYukoKigen",
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
     "selectControlID": "txtYukoKigen_core",
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
     "value": "",
     "labelLText": "有効期限",
     "labelRText": "",
     "labelLWidth": "70",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0
    },
    {
     "fieldName": "txtKofuJiyu",
     "items": [],
     "controlType": "TextBox",
     "width": "200",
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
     "selectControlID": "txtKofuJiyu_core",
     "required": false,
     "maxLength": 100000000,
     "minLength": 0,
     "textAlign": 0,
     "readOnly": true,
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
     "labelLText": "交付事由",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0
    },
    {
     "fieldName": "txtKofuRiyu",
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
     "selectControlID": "txtKofuRiyu_text_area",
     "required": false,
     "maxLength": 100000000,
     "minLength": 0,
     "readOnly": true,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "value": "",
     "labelLText": "交付理由",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "height": "40",
     "limitLength": "200",
     "countDisp": false
    },
    {
     "fieldName": "txtKaishuDate",
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
     "selectControlID": "txtKaishuDate_core",
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
     "value": "",
     "labelLText": "回収日",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "ymdKubun": 2,
     "displayFormat": 0
    },
    {
     "fieldName": "ddlKaishuJiyu",
     "items": [],
     "controlType": "DropDownList",
     "width": "200",
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
     "selectControlID": "ddlKaishuJiyu_core",
     "required": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "labelLText": "回収事由",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "selectedItem": "06",
     "dataSource": [
      {
       "key": "00",
       "value": "転出"
      },
      {
       "key": "01",
       "value": "受給者転入"
      },
      {
       "key": "02",
       "value": "死亡"
      },
      {
       "key": "03",
       "value": "紛失等"
      },
      {
       "key": "04",
       "value": "汚損等"
      },
      {
       "key": "05",
       "value": "証記載内容変更"
      },
      {
       "key": "06",
       "value": "居宅サービス計画届出"
      },
      {
       "key": "07",
       "value": "医療保険脱退"
      },
      {
       "key": "08",
       "value": "適用除外施設入所"
      },
      {
       "key": "09",
       "value": "住所地特例適用"
      },
      {
       "key": "10",
       "value": "住所地特例変更"
      },
      {
       "key": "11",
       "value": "住所地特例解除"
      },
      {
       "key": "12",
       "value": "住所地特例終了"
      },
      {
       "key": "13",
       "value": "支払方法変更"
      },
      {
       "key": "14",
       "value": "支払方法変更終了"
      },
      {
       "key": "15",
       "value": "保険給付差止"
      },
      {
       "key": "16",
       "value": "保険給付差止終了"
      },
      {
       "key": "17",
       "value": "滞納保険料控除"
      },
      {
       "key": "18",
       "value": "給付額減額"
      },
      {
       "key": "19",
       "value": "給付額減額免除"
      },
      {
       "key": "20",
       "value": "給付額減額終了"
      }
     ]
    },
    {
     "fieldName": "txtKaishuRiyu",
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
     "selectControlID": "txtKaishuRiyu_text_area",
     "required": false,
     "maxLength": 100000000,
     "minLength": 0,
     "readOnly": false,
     "placeHolder": "",
     "textKind": 0,
     "isPrivateInfo": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "text": "",
     "value": "",
     "labelLText": "回収理由",
     "labelRText": "",
     "labelLWidth": "85",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "height": "40",
     "limitLength": "200",
     "countDisp": true
    }
   ],
   "controlType": "Panel",
   "width": "950",
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
   "selectControlID": "ShoKaishuJokyoShosai",
   "onLoad": "",
   "title": "証類交付情報",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "ShoKaishuJokyoShosai"
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
 "controlName": "ShoKaishuJokyoShosai",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": ""
}        
    }
}
