/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />

module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     * ShisetsuNyutaishoRirekiKanriクラスのみで継承して使えます。
     */
    export class ShisetsuNyutaishoRirekiKanri_Design extends Uz.CommonChildDiv {
    
        public get InputPanelDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["displayNone"];
        }
        
        public set InputPanelDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[2]["displayNone"] = value;
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
        
        public get UpdateButtonDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["displayNone"];
        }
        
        public set UpdateButtonDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[3]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get gridSetting() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["gridSetting"];
        }
        
        public set gridSetting(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["gridSetting"] = value;
            } else {
                this.layout.items[0].items[1]["gridSetting"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get radShisetsuShuruiDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["radShisetsuShurui_displayNone"];
        }
        
        public set radShisetsuShuruiDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["radShisetsuShurui_displayNone"] = value;
            } else {
                this.layout.items[0].items[2].items[3]["radShisetsuShurui_displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get jigyoshaInputGuideDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnJigyoshaInputGuide_displayNone"];
        }
        
        public set jigyoshaInputGuideDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnJigyoshaInputGuide_displayNone"] = value;
            } else {
                this.layout.items[0].items[2].items[3]["btnJigyoshaInputGuide_displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get otherShisetsuInputGuideDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnOtherTokureiShisetsuInputGuide_displayNone"];
        }
        
        public set otherShisetsuInputGuideDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnOtherTokureiShisetsuInputGuide_displayNone"] = value;
            } else {
                this.layout.items[0].items[2].items[3]["btnOtherTokureiShisetsuInputGuide_displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get jogaiShisetsuInputGuideDisplayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnJogaiShisetsuInputGuide_displayNone"];
        }
        
        public set jogaiShisetsuInputGuideDisplayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"])["btnJogaiShisetsuInputGuide_displayNone"] = value;
            } else {
                this.layout.items[0].items[2].items[3]["btnJogaiShisetsuInputGuide_displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, ShisetsuNyutaishoRirekiKanri_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("InputPanelDisplayNone");
            Uz.JSControlUtil.registProperty("AddButtonDisplayNone");
            Uz.JSControlUtil.registProperty("UpdateButtonDisplayNone");
            Uz.JSControlUtil.registProperty("gridSetting");
            Uz.JSControlUtil.registProperty("radShisetsuShuruiDisplayNone");
            Uz.JSControlUtil.registProperty("jigyoshaInputGuideDisplayNone");
            Uz.JSControlUtil.registProperty("otherShisetsuInputGuideDisplayNone");
            Uz.JSControlUtil.registProperty("jogaiShisetsuInputGuideDisplayNone");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["InputPanelDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["AddButtonDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["UpdateButtonDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["gridSetting"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["gridSetting"];
            editablePropertyInfo["radShisetsuShuruiDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).getEditablePropertyInfo()["radShisetsuShurui_displayNone"];
            editablePropertyInfo["jigyoshaInputGuideDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).getEditablePropertyInfo()["btnJigyoshaInputGuide_displayNone"];
            editablePropertyInfo["otherShisetsuInputGuideDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).getEditablePropertyInfo()["btnOtherTokureiShisetsuInputGuide_displayNone"];
            editablePropertyInfo["jogaiShisetsuInputGuideDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"] + "_" + this.layout.items[0].items[2].items[3]["fieldName"]).getEditablePropertyInfo()["btnJogaiShisetsuInputGuide_displayNone"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "ShisetsuNyutaishoRirekiKanri",
   "items": [
    {
     "fieldName": "btnAddShisetsuNyutaisho",
     "items": [],
     "controlType": "Button",
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
     "selectControlID": "btnAddShisetsuNyutaisho",
     "helpMessageID": "",
     "jpControlName": "",
     "onBeforeClick": "",
     "onAfterClick": "",
     "onClick": "onClick_btnAddShisetsuNyutaisho",
     "text": "施設入退所を追加する",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
    },
    {
     "fieldName": "dgShisetsuNyutaishoRireki",
     "items": [],
     "controlType": "DataGrid",
     "width": "1010",
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
     "marginLeft": "0",
     "marginRight": "0",
     "selectControlID": "dgShisetsuNyutaishoRireki",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "S",
     "gridSetting": {
      "rowHeight": 25,
      "isMultiSelectable": false,
      "isShowHeader": true,
      "isShowFooter": true,
      "isShowFilter": false,
      "isShowFilterButton": false,
      "isShowRowState": true,
      "isShowSelectButtonColumn": false,
      "isShowModifyButtonColumn": true,
      "isShowDeleteButtonColumn": true,
      "limitRowCount": 0,
      "selectedRowCount": 0,
      "header": {
       "combineColumns": [],
       "frozenColumn": "",
       "headerHeight": 0
      },
      "columns": [
       {
        "columnName": "入所日",
        "dataName": "nyushoDate",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "nyushoDate"
       },
       {
        "columnName": "退所日",
        "dataName": "taishoDate",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": true,
        "cellType": 7,
        "cellDetails": {
         "cellType": 7,
         "ymdKubun": 2,
         "displayFormat": 0,
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "施設コード",
        "dataName": "shisetsuCode",
        "toolTip": "",
        "bgColor": 0,
        "width": 80,
        "visible": false,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "施設名称",
        "dataName": "shisetsuMeisho",
        "toolTip": "",
        "bgColor": 0,
        "width": 200,
        "visible": false,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0
        },
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "入所施設",
        "dataName": "shisetsu",
        "toolTip": "",
        "bgColor": 0,
        "width": 390,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "対象情報key",
        "dataName": "taishoJohoKey",
        "toolTip": "",
        "bgColor": 0,
        "width": 0,
        "visible": false,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "対象情報",
        "dataName": "taishoJoho",
        "toolTip": "",
        "bgColor": 0,
        "width": 180,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "施設種類key",
        "dataName": "shisetsuShuruiKey",
        "toolTip": "",
        "bgColor": 0,
        "width": 0,
        "visible": false,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": ""
       },
       {
        "columnName": "施設種類",
        "dataName": "shisetsuShurui",
        "toolTip": "",
        "bgColor": 0,
        "width": 150,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": ""
       }
      ]
     },
     "onSort": "",
     "onSelect": "",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "onSelectByModifyButton_dgShisetsuNyutaishoRireki",
     "onSelectByDeleteButton": "onSelectByDeleteButton_dgShisetsuNyutaishoRireki",
     "onAfterRequest": "",
     "onAfterRequestByDblClick": "",
     "onAfterRequestBySelectButton": "",
     "onAfterRequestByModifyButton": "",
     "onAfterRequestByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "onNoRow_dgShisetsuNyutaishoRireki",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "shisetsuShurui",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1,
     "gridAction": []
    },
    {
     "fieldName": "ShisetsuNyutaishoInput",
     "items": [
      {
       "fieldName": "ddlTaishoJoho",
       "items": [],
       "controlType": "DropDownList",
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
       "selectControlID": "ddlTaishoJoho_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "dataSource": [
        {
         "key": "kannai",
         "value": "管内施設"
        },
        {
         "key": "jutoku",
         "value": "住所地特例措置"
        },
        {
         "key": "tekiyoJogai",
         "value": "適用除外措置"
        },
        {
         "key": "tashichosonJutoku",
         "value": "他市町村住所地特例措置"
        }
       ],
       "onChange": "onChange_ddlTaishoJoho",
       "selectedItem": "kannai",
       "required": false,
       "labelLText": "対象情報",
       "labelRText": "",
       "labelLWidth": "70",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "onFocus": "",
       "onBlur": "",
       "disabledItem": []
      },
      {
       "fieldName": "txtNyushoDate",
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
       "selectControlID": "txtNyushoDate_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "onChange": "",
       "required": false,
       "labelLText": "入所日",
       "labelRText": "",
       "labelLWidth": "50",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "onFocus": "",
       "onBlur": "",
       "placeHolder": "",
       "isPrivateInfo": false,
       "isPassword": false,
       "onKeyPress": "",
       "ymdKubun": 2,
       "displayFormat": 0,
       "value": "",
       "textKind": 0,
       "permitCharactor": "./_-"
      },
      {
       "fieldName": "txtTaishoDate",
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
       "marginLeft": "0",
       "marginRight": "XS",
       "selectControlID": "txtTaishoDate_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": false,
       "text": "",
       "onChange": "",
       "required": false,
       "labelLText": "退所日",
       "labelRText": "",
       "labelLWidth": "50",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "onFocus": "",
       "onBlur": "",
       "placeHolder": "",
       "isPrivateInfo": false,
       "isPassword": false,
       "onKeyPress": "",
       "ymdKubun": 2,
       "displayFormat": 0,
       "value": "",
       "textKind": 0,
       "permitCharactor": "./_-"
      },
      {
       "fieldName": "ShisetsuJoho",
       "items": [],
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
       "marginLeft": "XS",
       "marginRight": "0",
       "selectControlID": "ShisetsuJoho",
       "helpMessageID": "",
       "jpControlName": "",
       "relation": [],
       "businessId": "DBZ",
       "controlName": "ShisetsuJoho",
       "marginTop": 0,
       "marginBottom": 0,
       "originalProperty": [],
       "dataPassingForDialog": [],
       "dialogOkEventNameForDialog": "",
       "dialogCancelEventNameForDialog": "",
       "canTransferEvent": true,
       "heightForDialog": "M",
       "firstFocusFieldName": "",
       "lastFocusFieldName": "",
       "btnJigyoshaInputGuide_displayNone": false,
       "btnOtherTokureiShisetsuInputGuide_displayNone": true,
       "btnJogaiShisetsuInputGuide_displayNone": true,
       "radShisetsuShurui_displayNone": false,
       "ShisetsuJoho_width": "900"
      }
     ],
     "controlType": "Panel",
     "width": "1013",
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
     "marginLeft": "0",
     "marginRight": "XS",
     "selectControlID": "ShisetsuNyutaishoInput",
     "helpMessageID": "",
     "jpControlName": "",
     "onLoad": "",
     "title": "施設入退所情報入力",
     "marginTop": "Default",
     "marginBottom": "Default",
     "isOpen": true,
     "canOpenAndClose": false,
     "postParameterPanelNames": [
      {
       "postParameterPanelNames": "ShisetsuNyutaishoInput"
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
    },
    {
     "fieldName": "btnUpdateShisetsuNyutaisho",
     "items": [],
     "controlType": "Button",
     "width": "200",
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
     "marginLeft": "0",
     "marginRight": "0",
     "selectControlID": "btnUpdateShisetsuNyutaisho",
     "helpMessageID": "",
     "jpControlName": "",
     "onBeforeClick": "",
     "onAfterClick": "",
     "onClick": "onClick_btnUpdateShisetsuNyutaisho",
     "text": "施設入退所を確定する",
     "appearance": 0,
     "imageFileUrl": "",
     "imageWidth": "",
     "imageHeight": "",
     "icon": 0,
     "heightTextBoxMatches": false
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
   "marginLeft": "0",
   "marginRight": "0",
   "selectControlID": "ShisetsuNyutaishoRirekiKanri",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "ShisetsuNyutaishoRirekiKanri"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onLoad"
    },
    {
     "eventName": "onSelectByModifyButton_dgShisetsuNyutaishoRireki",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onSelectByModifyButton_dgShisetsuNyutaishoRireki"
    },
    {
     "eventName": "onClick_btnAddShisetsuNyutaisho",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onClick_btnAddShisetsuNyutaisho"
    },
    {
     "eventName": "onClick_btnUpdateShisetsuNyutaisho",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onClick_btnUpdateShisetsuNyutaisho"
    },
    {
     "eventName": "onSelectByDeleteButton_dgShisetsuNyutaishoRireki",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onSelectByDeleteButton_dgShisetsuNyutaishoRireki"
    },
    {
     "eventName": "onNoRow_dgShisetsuNyutaishoRireki",
     "requestUrl": ""
    },
    {
     "eventName": "onChange_ddlTaishoJoho",
     "requestUrl": "dbz/db/dbz/ShisetsuNyutaishoRirekiKanri/onChange_ddlTaishoJoho"
    }
   ],
   "hiddenInput": [
    {
     "propertyName": "selectRow",
     "value": ""
    },
    {
     "propertyName": "inputMode",
     "value": ""
    }
   ],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorder": true,
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
 "controlName": "ShisetsuNyutaishoRirekiKanri",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "ShisetsuNyutaishoInput",
   "publicChildProperty": "displayNone",
   "newPropertyName": "InputPanelDisplayNone"
  },
  {
   "publicChildFieldName": "btnAddShisetsuNyutaisho",
   "publicChildProperty": "displayNone",
   "newPropertyName": "AddButtonDisplayNone"
  },
  {
   "publicChildFieldName": "btnUpdateShisetsuNyutaisho",
   "publicChildProperty": "displayNone",
   "newPropertyName": "UpdateButtonDisplayNone"
  },
  {
   "publicChildFieldName": "dgShisetsuNyutaishoRireki",
   "publicChildProperty": "gridSetting",
   "newPropertyName": "gridSetting"
  },
  {
   "publicChildFieldName": "ShisetsuJoho",
   "publicChildProperty": "radShisetsuShurui_displayNone",
   "newPropertyName": "radShisetsuShuruiDisplayNone"
  },
  {
   "publicChildFieldName": "ShisetsuJoho",
   "publicChildProperty": "btnJigyoshaInputGuide_displayNone",
   "newPropertyName": "jigyoshaInputGuideDisplayNone"
  },
  {
   "publicChildFieldName": "ShisetsuJoho",
   "publicChildProperty": "btnOtherTokureiShisetsuInputGuide_displayNone",
   "newPropertyName": "otherShisetsuInputGuideDisplayNone"
  },
  {
   "publicChildFieldName": "ShisetsuJoho",
   "publicChildProperty": "btnJogaiShisetsuInputGuide_displayNone",
   "newPropertyName": "jogaiShisetsuInputGuideDisplayNone"
  }
 ],
 "dataPassingForDialog": [],
 "dialogOkEventNameForDialog": "",
 "dialogCancelEventNameForDialog": "",
 "canTransferEvent": true,
 "heightForDialog": "M",
 "firstFocusFieldName": "",
 "lastFocusFieldName": ""
}        
    }
}

