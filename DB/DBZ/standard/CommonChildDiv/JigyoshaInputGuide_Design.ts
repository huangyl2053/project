/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     * JigyoshaInputGuideクラスのみで継承して使えます。
     */
    export class JigyoshaInputGuide_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, JigyoshaInputGuide_Design.myLayout, fieldName);
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
   "fieldName": "JigyoshaInputGuide",
   "items": [
    {
     "fieldName": "radJigyoshaSearchType",
     "items": [],
     "controlType": "RadioButton",
     "width": "500",
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
     "marginLeft": "XS",
     "marginRight": "XS",
     "onChange": "",
     "selectedItem": "keyJigyosha",
     "dataSource": [
      {
       "key": "keyJigyosha",
       "value": "事業者検索"
      },
      {
       "key": "keyMeisho",
       "value": "名称検索"
      },
      {
       "key": "keyJusho",
       "value": "住所検索"
      },
      {
       "key": "keyJigyoshaCodeUchiwake",
       "value": "事業者コード内訳検索"
      }
     ],
     "required": false,
     "onClick": "",
     "newLineItemNumber": 4,
     "spaceSize": 1,
     "labelLText": "",
     "labelLWidth": "S",
     "labelLAlign": 2
    },
    {
     "fieldName": "txtJigyoshaCode",
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
     "onChange": "",
     "required": false,
     "labelLText": "事業者コード",
     "labelLWidth": "S",
     "labelLAlign": 2,
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
     "onKeyPress": "",
     "text": "",
     "suggest": [],
     "value": "",
     "labelRText": "",
     "labelRWidth": "S",
     "labelRAlign": 0,
     "permitCharactor": ""
    },
    {
     "fieldName": "btnSearchJigyosha",
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
     "float": 2,
     "toolTip": "",
     "authorityMode": 0,
     "marginLeft": "XS",
     "marginRight": "XS",
     "onClick": "onClick_btnSearchJigyosha",
     "text": "該当する事業者を表示する",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": ""
    },
    {
     "fieldName": "SearchResultJigyosha",
     "items": [
      {
       "fieldName": "dgSearchResultJigyosha",
       "items": [],
       "controlType": "DataGrid",
       "width": "1130",
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
       "dataSource": [],
       "gridSetting": {
        "rowHeight": 25,
        "isMultiSelectable": false,
        "isShowFooter": true,
        "isShowFilter": false,
        "isShowFilterButton": false,
        "isShowRowState": false,
        "header": {
         "combineColumns": [],
         "frozenColumn": "",
         "headerHeight": 0
        },
        "columns": [
         {
          "columnName": "",
          "dataName": "select",
          "toolTip": "",
          "bgColor": 0,
          "width": 40,
          "visible": true,
          "cellType": 8,
          "cellDetails": {
           "cellType": 8,
           "text": "■",
           "onClick": "onClick_select",
           "imageFileUrl": "",
           "imageWidth": "",
           "imageHeight": ""
          },
          "align": 0,
          "resize": false,
          "isPrivateInfo": false,
          "sortKey": "select"
         },
         {
          "columnName": "事業者コード",
          "dataName": "jigyoshaCode",
          "toolTip": "",
          "bgColor": 0,
          "width": 0,
          "visible": false,
          "cellType": 0,
          "cellDetails": null,
          "align": 0,
          "resize": false,
          "isPrivateInfo": false,
          "sortKey": "jigyoshaCode"
         },
         {
          "columnName": "事業者名称",
          "dataName": "jigyoshaMeisho",
          "toolTip": "",
          "bgColor": 0,
          "width": 0,
          "visible": false,
          "cellType": 0,
          "cellDetails": null,
          "align": 0,
          "resize": false,
          "isPrivateInfo": false,
          "sortKey": "jigyoshaMeisho"
         },
         {
          "columnName": "事業者",
          "dataName": "jigyosha",
          "toolTip": "",
          "bgColor": 0,
          "width": 300,
          "visible": true,
          "cellType": 0,
          "cellDetails": {
           "cellType": 0
          },
          "align": 0,
          "resize": true,
          "isPrivateInfo": false,
          "sortKey": "jigyosha"
         },
         {
          "columnName": "住所",
          "dataName": "jusho",
          "toolTip": "",
          "bgColor": 0,
          "width": 350,
          "visible": true,
          "cellType": 0,
          "cellDetails": null,
          "align": 0,
          "resize": true,
          "isPrivateInfo": false,
          "sortKey": "jusho"
         },
         {
          "columnName": "サービス",
          "dataName": "service",
          "toolTip": "",
          "bgColor": 0,
          "width": 80,
          "visible": true,
          "cellType": 0,
          "cellDetails": {
           "cellType": 0
          },
          "align": 0,
          "resize": true,
          "isPrivateInfo": false,
          "sortKey": "service"
         },
         {
          "columnName": "認定開始日",
          "dataName": "ninteiKaishiDate",
          "toolTip": "",
          "bgColor": 0,
          "width": 100,
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
          "sortKey": "ninteiKaishiDate"
         },
         {
          "columnName": "認定終了日",
          "dataName": "ninteiShuryoDate",
          "toolTip": "",
          "bgColor": 0,
          "width": 100,
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
          "sortKey": "ninteiShuryoDate"
         },
         {
          "columnName": "社福法人軽減対象",
          "dataName": "keigenTaisho",
          "toolTip": "",
          "bgColor": 0,
          "width": 140,
          "visible": true,
          "cellType": 0,
          "cellDetails": null,
          "align": 0,
          "resize": true,
          "isPrivateInfo": false,
          "sortKey": "keigenTaisho"
         }
        ]
       },
       "height": "S",
       "onSort": "",
       "onSelect": "",
       "onSelectByDblClick": "",
       "onOnlyRow": "",
       "onNoRow": "",
       "onMultiRows": "",
       "sortOrder": "keigenTaisho",
       "isAscending": true,
       "filterList": [],
       "activeRowId": -1
      }
     ],
     "controlType": "Panel",
     "width": "950",
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
     "onLoad": "",
     "title": "事業者一覧",
     "marginTop": "XS",
     "marginBottom": "XS",
     "isOpen": true,
     "canOpenAndClose": true,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "SearchResultJigyosha"
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
     "isGroupBox": false
    },
    {
     "fieldName": "btnKaigoHokenShisetsuReturn",
     "items": [],
     "controlType": "Button",
     "width": "80",
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
     "onClick": "onClick_btnKaigoHokenShisetsuReturn",
     "text": "キャンセル",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": ""
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
   "onLoad": "",
   "title": "事業者入力ガイド",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "JigyoshaInputGuide"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": ""
    },
    {
     "eventName": "onClick_select",
     "requestUrl": "dbz/db/dbz/JigyoshaInputGuide/onClick_select"
    },
    {
     "eventName": "onClick_btnSearchJigyosha",
     "requestUrl": "dbz/db/dbz/JigyoshaInputGuide/onClick_btnSearchJigyosha"
    }
   ],
   "hiddenInput": [
    {
     "propertyName": "jigyoshaCode",
     "value": ""
    },
    {
     "propertyName": "jigyoshaMeisho",
     "value": ""
    }
   ],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorderTop": false,
   "eraseBorderBottom": false,
   "eraseBorderRight": false,
   "eraseBorderLeft": false,
   "backgroundColor": 0,
   "widthAuto": true,
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
 "controlName": "JigyoshaInputGuide",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [],
 "dataPassingForDialog": [
  {
   "key": "jigyoshaCode",
   "controlName": "JigyoshaInputGuide.jigyoshaCode"
  },
  {
   "key": "jigyoshaMeisho",
   "controlName": "JigyoshaInputGuide.jigyoshaMeisho"
  }
 ],
 "dialogOkEventNameForDialog": "onClick_select",
 "dialogCancelEventNameForDialog": "onClick_btnKaigoHokenShisetsuReturn"
}        
    }
}
