/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBD {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module ShakaiFukushiHojinKeigen {

        export class Events {

            public static get CloseOK(): string {
                return "CloseOK";
            }
            public static get onSelect_dgShakaiFukushiHojinKeigenList(): string {
                return "onSelect_dgShakaiFukushiHojinKeigenList";
            }

        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "ShakaiFukushiHojinKeigen";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public ShakaiFukushiHojinKeigen() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public txtHiddenHihokenshaNo() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHiddenHihokenshaNo"));

            }

            public dgShakaiFukushiHojinKeigenList() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgShakaiFukushiHojinKeigenList"));

            }

            public ShakaiFukushiHojinKeigenDetail() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("ShakaiFukushiHojinKeigenDetail"));

            }

            public txtShinseiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShinseiDate"));

            }

            public ShakaiFukushiHojinKeigenRiyoshaFutan() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("ShakaiFukushiHojinKeigenRiyoshaFutan"));

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

            public txtKeigenJiyu() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKeigenJiyu"));

            }

            public txtKeigenRitsuBunshi() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtKeigenRitsuBunshi"));

            }

            public lblIKeigenRitsuVinculum() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblIKeigenRitsuVinculum"));

            }

            public txtKeigenRitsuBunbo() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtKeigenRitsuBunbo"));

            }

            public txtFushoninRiyu() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtFushoninRiyu"));

            }

            public txtKakuninNo() : UZA.TextBoxCode {

                return new UZA.TextBoxCode(this.convFiledName("txtKakuninNo"));

            }

            public txtKyotakuServiceOnly() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKyotakuServiceOnly"));

            }

            public txtKyojuhiShokujiOnly() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKyojuhiShokujiOnly"));

            }

            public txtUnitPrivateRoomOnly() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtUnitPrivateRoomOnly"));

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

    export class ShakaiFukushiHojinKeigen_Design extends Uz.CommonChildDiv {
    
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, ShakaiFukushiHojinKeigen_Design.myLayout, fieldName);
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
   "fieldName": "ShakaiFukushiHojinKeigen",
   "items": [
    {
     "fieldName": "txtHiddenHihokenshaNo",
     "items": [],
     "controlType": "TextBox",
     "width": "XS",
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
     "fieldName": "dgShakaiFukushiHojinKeigenList",
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
     "selectControlID": "dgShakaiFukushiHojinKeigenList",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "height": "210",
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
        "columnName": "確認番号",
        "dataName": "kakuninNo",
        "toolTip": "",
        "bgColor": 0,
        "width": 90,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "kakuninNo"
       },
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
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
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
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "tekiyoDate"
       },
       {
        "columnName": "有効期限",
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
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
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
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "ketteiDate"
       },
       {
        "columnName": "軽減率(分子)",
        "dataName": "keigenRitsuBunshi",
        "toolTip": "",
        "bgColor": 0,
        "width": 0,
        "visible": false,
        "cellType": 5,
        "cellDetails": {
         "cellType": 5,
         "maxLength": "1000000000000",
         "minLength": "0",
         "maxValue": "1.7976931348623157e+308",
         "minValue": "0",
         "isCurrency": false,
         "isComma": false,
         "decimalPointLength": "0",
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "keigenRitsuBunshi"
       },
       {
        "columnName": "軽減率(分母)",
        "dataName": "keigenRitsuBunbo",
        "toolTip": "",
        "bgColor": 0,
        "width": 0,
        "visible": false,
        "cellType": 5,
        "cellDetails": {
         "cellType": 5,
         "maxLength": "1000000000000",
         "minLength": "0",
         "maxValue": "1.7976931348623157e+308",
         "minValue": "0",
         "isCurrency": false,
         "isComma": false,
         "decimalPointLength": "0",
         "onChange": "",
         "isSetValueToToolTip": false,
         "readOnly": true
        },
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "keigenRitsuBunbo"
       },
       {
        "columnName": "軽減率",
        "dataName": "keigenRitsu",
        "toolTip": "",
        "bgColor": 0,
        "width": 75,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "keigenRitsu"
       },
       {
        "columnName": "軽減事由",
        "dataName": "keigenJiyu",
        "toolTip": "",
        "bgColor": 0,
        "width": 150,
        "visible": true,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "keigenJiyu"
       },
       {
        "columnName": "居宅サービス<br>限定",
        "dataName": "kyotakuServiceOnly",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0,
         "isSetValueToToolTip": false
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "kyotakuServiceOnly"
       },
       {
        "columnName": "居住費・食費<br>のみ",
        "dataName": "kyojuhiShokujiOnly",
        "toolTip": "",
        "bgColor": 0,
        "width": 100,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0,
         "isSetValueToToolTip": false
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "kyojuhiShokujiOnly"
       },
       {
        "columnName": "旧措置ユニット型<br>個室のみ",
        "dataName": "unitPrivateRoomOnly",
        "toolTip": "",
        "bgColor": 0,
        "width": 130,
        "visible": true,
        "cellType": 0,
        "cellDetails": {
         "cellType": 0,
         "isSetValueToToolTip": false
        },
        "align": 1,
        "resize": true,
        "isPrivateInfo": false,
        "sortKey": "unitPrivateRoomOnly"
       },
       {
        "columnName": "承認しない理由",
        "dataName": "fushoninRiyu",
        "toolTip": "",
        "bgColor": 0,
        "width": 0,
        "visible": false,
        "cellType": 0,
        "cellDetails": null,
        "align": 0,
        "resize": false,
        "isPrivateInfo": false,
        "sortKey": "fushoninRiyu"
       }
      ]
     },
     "onSort": "",
     "onSelect": "onSelect_dgShakaiFukushiHojinKeigenList",
     "onSelectByDblClick": "",
     "onSelectBySelectButton": "",
     "onSelectByModifyButton": "",
     "onSelectByDeleteButton": "",
     "onOnlyRow": "",
     "onNoRow": "",
     "onMultiRows": "",
     "dataSource": [],
     "sortOrder": "keigenTaishoServiceSeigen",
     "isAscending": true,
     "filterList": [],
     "activeRowId": -1
    },
    {
     "fieldName": "ShakaiFukushiHojinKeigenDetail",
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
       "wrap": true,
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
       "fieldName": "ShakaiFukushiHojinKeigenRiyoshaFutan",
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
         "fieldName": "txtKeigenJiyu",
         "items": [],
         "controlType": "TextBox",
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
         "selectControlID": "txtKeigenJiyu_core",
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
         "labelLText": "軽減事由",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "decorationClass": "",
         "permitCharactor": ""
        },
        {
         "fieldName": "txtKeigenRitsuBunshi",
         "items": [],
         "controlType": "TextBoxNum",
         "width": "25",
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
         "marginRight": "",
         "selectControlID": "txtKeigenRitsuBunshi_core",
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
         "labelLText": "減額率",
         "labelRText": "",
         "labelLWidth": "166",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "decorationClass": "",
         "maxValue": 1.7976931348623157e+308,
         "minValue": 0,
         "isCurrency": false,
         "isComma": false,
         "decimalPointLength": 0,
         "permitCharactor": "+-,.\\"
        },
        {
         "fieldName": "lblIKeigenRitsuVinculum",
         "items": [],
         "controlType": "Label",
         "width": "18",
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
         "marginLeft": "",
         "marginRight": "",
         "selectControlID": "lblIKeigenRitsuVinculum",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "/",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "txtKeigenRitsuBunbo",
         "items": [],
         "controlType": "TextBoxNum",
         "width": "25",
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
         "marginRight": "",
         "selectControlID": "txtKeigenRitsuBunbo_core",
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
         "labelLText": "",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
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
        },
        {
         "fieldName": "txtKakuninNo",
         "items": [],
         "controlType": "TextBoxCode",
         "width": "82",
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
         "selectControlID": "txtKakuninNo_core",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
         "required": false,
         "maxLength": "10",
         "minLength": "1",
         "textAlign": 0,
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
         "labelLText": "確認番号",
         "labelRText": "",
         "labelLWidth": "S",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "decorationClass": "",
         "permitCharactor": "",
         "formatLength": "10"
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
       "selectControlID": "ShakaiFukushiHojinKeigenRiyoshaFutan",
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
         "postParameterPanelNames": "ShakaiFukushiHojinKeigenRiyoshaFutan"
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
      },
      {
       "fieldName": "txtKyotakuServiceOnly",
       "items": [],
       "controlType": "TextBox",
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
       "marginRight": "XS",
       "selectControlID": "txtKyotakuServiceOnly_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": true,
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 1,
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
       "labelLText": "居宅サービス限定",
       "labelRText": "",
       "labelLWidth": "152",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtKyojuhiShokujiOnly",
       "items": [],
       "controlType": "TextBox",
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
       "marginRight": "XS",
       "selectControlID": "txtKyojuhiShokujiOnly_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": true,
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 1,
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
       "labelLText": "居住費・食事のみ",
       "labelRText": "",
       "labelLWidth": "146",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
      },
      {
       "fieldName": "txtUnitPrivateRoomOnly",
       "items": [],
       "controlType": "TextBox",
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
       "marginRight": "XS",
       "selectControlID": "txtUnitPrivateRoomOnly_core",
       "helpMessageID": "",
       "jpControlName": "",
       "readOnly": true,
       "required": false,
       "maxLength": 100000000,
       "minLength": 0,
       "textAlign": 1,
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
       "labelLText": "旧措置ユニット型個室のみ",
       "labelRText": "",
       "labelLWidth": "220",
       "labelRWidth": "S",
       "labelLAlign": 2,
       "labelRAlign": 0,
       "decorationClass": "",
       "permitCharactor": ""
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
     "selectControlID": "ShakaiFukushiHojinKeigenDetail",
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
       "postParameterPanelNames": "ShakaiFukushiHojinKeigenDetail"
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
   "selectControlID": "ShakaiFukushiHojinKeigen",
   "helpMessageID": "",
   "jpControlName": "",
   "onLoad": "",
   "title": "社会福祉法人軽減",
   "marginTop": "Default",
   "marginBottom": "Default",
   "isOpen": true,
   "canOpenAndClose": true,
   "postParameterPanelNames": [
    {
     "postParameterPanelNames": "ShakaiFukushiHojinKeigen"
    }
   ],
   "requestSettings": [
    {
     "eventName": "onLoad",
     "requestUrl": "dbd/db/dbd/ShakaiFukushiHojinKeigen/onLoad"
    },
    {
     "eventName": "onSelect_dgShakaiFukushiHojinKeigenList",
     "requestUrl": "dbd/db/dbd/ShakaiFukushiHojinKeigen/onSelect_dgShakaiFukushiHojinKeigenList"
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
   "height": "530"
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
 "controlName": "ShakaiFukushiHojinKeigen",
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
 "heightForDialog": "570"
}        
    }
}

