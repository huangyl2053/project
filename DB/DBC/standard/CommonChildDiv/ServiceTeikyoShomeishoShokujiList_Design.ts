/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBC {
    /**
     * 自動生成コードです。修正しないでください。
     * ServiceTeikyoShomeishoShokujiListクラスのみで継承して使えます。
     */
    export class ServiceTeikyoShomeishoShokujiList_Design extends Uz.CommonChildDiv {
    
        public get AddButtonVisible() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["visible"];
        }
        
        public set AddButtonVisible(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["visible"] = value;
            } else {
                this.layout.items[0].items[0]["visible"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get AddButtonDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["displayNone"];
        }
        
        public set AddButtonDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[0]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get AddButtonOnClick() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["onClick"];
        }
        
        public set AddButtonOnClick(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["onClick"] = value;
            } else {
                this.layout.items[0].items[0]["onClick"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get MeisaiListGridSetting() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["gridSetting"];
        }
        
        public set MeisaiListGridSetting(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["gridSetting"] = value;
            } else {
                this.layout.items[0].items[1]["gridSetting"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get MeisaiListHeight() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["height"];
        }
        
        public set MeisaiListHeight(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["height"] = value;
            } else {
                this.layout.items[0].items[1]["height"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get MeisaiListOnSelect() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onSelect"];
        }
        
        public set MeisaiListOnSelect(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onSelect"] = value;
            } else {
                this.layout.items[0].items[1]["onSelect"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get MeisaiListOnSelectByDblClick() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onSelectByDblClick"];
        }
        
        public set MeisaiListOnSelectByDblClick(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onSelectByDblClick"] = value;
            } else {
                this.layout.items[0].items[1]["onSelectByDblClick"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, ServiceTeikyoShomeishoShokujiList_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("AddButtonVisible");
            Uz.JSControlUtil.registProperty("AddButtonDisplayNone");
            Uz.JSControlUtil.registProperty("AddButtonOnClick");
            Uz.JSControlUtil.registProperty("MeisaiListGridSetting");
            Uz.JSControlUtil.registProperty("MeisaiListHeight");
            Uz.JSControlUtil.registProperty("MeisaiListOnSelect");
            Uz.JSControlUtil.registProperty("MeisaiListOnSelectByDblClick");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["AddButtonVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["AddButtonDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["AddButtonOnClick"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).getEditablePropertyInfo()["onClick"];
            editablePropertyInfo["MeisaiListGridSetting"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["gridSetting"];
            editablePropertyInfo["MeisaiListHeight"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["height"];
            editablePropertyInfo["MeisaiListOnSelect"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["onSelect"];
            editablePropertyInfo["MeisaiListOnSelectByDblClick"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["onSelectByDblClick"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "ServiceTeikyoShomeishoShokujiList",
   "items": [
    {
     "fieldName": "btnAdd",
     "items": [],
     "controlType": "Button",
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
     "text": "明細情報を追加する",
     "onClick": "",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": ""
    },
    {
     "fieldName": "dgServiceTeikyoShomeishoShokujiList",
     "items": [],
     "controlType": "DataGrid",
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
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowFooter": true,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": true,
      "header": {
       "combineColumns": [],
       "frozenColumn": "",
       "headerHeight": 0
      },
      "columns": [
       {
        "columnName": "",
        "dataName": "btnSelect",
        "toolTip": "",
        "bgColor": 0,
        "width": 35,
        "visible": true,
        "cellType": 8,
        "cellDetails": {
         "cellType": 8,
         "text": "選",
         "onClick": "",
         "imageFileUrl": "",
         "imageWidth": "",
         "imageHeight": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "btnSelect"
       },
       {
        "columnName": "",
        "dataName": "btnEdit",
        "toolTip": "",
        "bgColor": 0,
        "width": 35,
        "visible": true,
        "cellType": 8,
        "cellDetails": {
         "cellType": 8,
         "text": "修",
         "onClick": "",
         "imageFileUrl": "",
         "imageWidth": "",
         "imageHeight": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "btnEdit"
       },
       {
        "columnName": "",
        "dataName": "btnDelete",
        "toolTip": "",
        "bgColor": 0,
        "width": 35,
        "visible": true,
        "cellType": 8,
        "cellDetails": {
         "cellType": 8,
         "text": "削",
         "onClick": "",
         "imageFileUrl": "",
         "imageWidth": "",
         "imageHeight": ""
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "btnDelete"
       },
       {
        "columnName": "サービス",
        "dataName": "txtService",
        "toolTip": "",
        "bgColor": 0,
        "width": 350,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "txtService"
       },
       {
        "columnName": "単位数",
        "dataName": "txtTanisu",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 2,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "txtTanisu"
       },
       {
        "columnName": "日数・回数",
        "dataName": "txtNissuKaisu",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 2,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "txtNissuKaisu"
       },
       {
        "columnName": "金額",
        "dataName": "txtKingaku",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 2,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "txtKingaku"
       }
      ]
     },
     "height": "175",
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
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
   "marginLeft": "0",
   "marginRight": "0",
   "onLoad": "",
   "title": "",
   "marginTop": "0",
   "marginBottom": "0",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "ServiceTeikyoShomeishoShokujiList"
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
 "controlName": "ServiceTeikyoShomeishoShokujiList",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "btnAdd",
   "publicChildProperty": "visible",
   "newPropertyName": "AddButtonVisible"
  },
  {
   "publicChildFieldName": "btnAdd",
   "publicChildProperty": "displayNone",
   "newPropertyName": "AddButtonDisplayNone"
  },
  {
   "publicChildFieldName": "btnAdd",
   "publicChildProperty": "onClick",
   "newPropertyName": "AddButtonOnClick"
  },
  {
   "publicChildFieldName": "dgServiceTeikyoShomeishoShokujiList",
   "publicChildProperty": "gridSetting",
   "newPropertyName": "MeisaiListGridSetting"
  },
  {
   "publicChildFieldName": "dgServiceTeikyoShomeishoShokujiList",
   "publicChildProperty": "height",
   "newPropertyName": "MeisaiListHeight"
  },
  {
   "publicChildFieldName": "dgServiceTeikyoShomeishoShokujiList",
   "publicChildProperty": "onSelect",
   "newPropertyName": "MeisaiListOnSelect"
  },
  {
   "publicChildFieldName": "dgServiceTeikyoShomeishoShokujiList",
   "publicChildProperty": "onSelectByDblClick",
   "newPropertyName": "MeisaiListOnSelectByDblClick"
  }
 ],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": ""
}        
    }
}

