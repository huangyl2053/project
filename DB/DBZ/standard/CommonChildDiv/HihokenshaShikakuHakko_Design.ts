/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />




module DBZ {
    /**
     * 自動生成コードです。修正しないでください。
     */

    export module HihokenshaShikakuHakko {

        export class Events {


        }

        export class Controls {
            private _myName: string;

            public static get MyType(): string {
                return "HihokenshaShikakuHakko";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }


            public HihokenshaShikakuHakko() : UZA.Panel {

                return new UZA.Panel(this.convFiledNameSelf());

            }

            public radInjiIchi() : UZA.RadioButton {

                return new UZA.RadioButton(this.convFiledName("radInjiIchi"));

            }

            public txtKofuDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtKofuDate"));

            }

            public ddlKofuJiyu() : UZA.DropDownList {

                return new UZA.DropDownList(this.convFiledName("ddlKofuJiyu"));

            }

            public txtYukoKigen() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtYukoKigen"));

            }

            public txtHokensha() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtHokensha"));

            }

            public txtYokaigodo() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtYokaigodo"));

            }

            public txtNinteiYukoKikan() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtNinteiYukoKikan"));

            }

            public txtShinseiDate() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShinseiDate"));

            }

            public tabHihokenshaShikakuShosai() : UZA.TabContainer {

                return new UZA.TabContainer(this.convFiledName("tabHihokenshaShikakuShosai"));

            }

            public tplGendoGaku() : UZA.TabPanel {

                return new UZA.TabPanel(this.convFiledName("tplGendoGaku"));

            }

            public lblKubunShikyuGendoGaku() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblKubunShikyuGendoGaku"));

            }

            public txtKubunShikyuGendoKijunGaku() : UZA.TextBoxNum {

                return new UZA.TextBoxNum(this.convFiledName("txtKubunShikyuGendoKijunGaku"));

            }

            public txtKyuhuYukoKikan() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtKyuhuYukoKikan"));

            }

            public ShuruiShikyuGendoKijungaku() : UZA.Panel {

                return new UZA.Panel(this.convFiledName("ShuruiShikyuGendoKijungaku"));

            }

            public dgShuruiShikyuGendoKijunGaku() : UZA.DataGrid {

                return new UZA.DataGrid(this.convFiledName("dgShuruiShikyuGendoKijunGaku"));

            }

            public tplShinsakaiIken() : UZA.TabPanel {

                return new UZA.TabPanel(this.convFiledName("tplShinsakaiIken"));

            }

            public lblShinsakaiIken() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblShinsakaiIken"));

            }

            public txtShinsakaiIken() : UZA.TextBoxMultiLine {

                return new UZA.TextBoxMultiLine(this.convFiledName("txtShinsakaiIken"));

            }

            public tplKyufuSeigen() : UZA.TabPanel {

                return new UZA.TabPanel(this.convFiledName("tplKyufuSeigen"));

            }

            public lblKyufuSeigen() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblKyufuSeigen"));

            }

            public tblKyuhuSeigen() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("tblKyuhuSeigen"));

            }

            public celKyufuSeigenNaiyoTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenNaiyoTitle"));

            }

            public lblKyufuSeigenNaiyo() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblKyufuSeigenNaiyo"));

            }

            public celKyufuSeigenKikanTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenKikanTitle"));

            }

            public lblKyufuSeigenKikan() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblKyufuSeigenKikan"));

            }

            public celKyufuSeigenNaiyo1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenNaiyo1"));

            }

            public txtKyufuSeigenNaiyo1() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKyufuSeigenNaiyo1"));

            }

            public celKyufuSeigenKikan1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenKikan1"));

            }

            public txtKyufuSeigenKikan1() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtKyufuSeigenKikan1"));

            }

            public celKyufuSeigenNaiyo2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenNaiyo2"));

            }

            public txtKyufuSeigenNaiyo2() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKyufuSeigenNaiyo2"));

            }

            public celKyufuSeigenKikan2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenKikan2"));

            }

            public txtKyufuSeigenKikan2() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtKyufuSeigenKikan2"));

            }

            public celKyufuSeigenNaiyo3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenNaiyo3"));

            }

            public txtKyufuSeigenNaiyo3() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtKyufuSeigenNaiyo3"));

            }

            public celKyufuSeigenKikan3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celKyufuSeigenKikan3"));

            }

            public txtKyufuSeigenKikan3() : UZA.TextBoxDateRange {

                return new UZA.TextBoxDateRange(this.convFiledName("txtKyufuSeigenKikan3"));

            }

            public tplShienJigyosha() : UZA.TabPanel {

                return new UZA.TabPanel(this.convFiledName("tplShienJigyosha"));

            }

            public lblShienJigyosha() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblShienJigyosha"));

            }

            public tblJigyosha() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("tblJigyosha"));

            }

            public celJigyoshaTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celJigyoshaTitle"));

            }

            public lblJigyosha() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblJigyosha"));

            }

            public celTodokedeDateTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTodokedeDateTitle"));

            }

            public lblTodokedeDate() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblTodokedeDate"));

            }

            public celJigyosha1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celJigyosha1"));

            }

            public txtJigyosha1() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtJigyosha1"));

            }

            public celTodokedeDate1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTodokedeDate1"));

            }

            public txtTodokedeDate1() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtTodokedeDate1"));

            }

            public celJigyosha2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celJigyosha2"));

            }

            public txtJigyosha2() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtJigyosha2"));

            }

            public celTodokedeDate2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTodokedeDate2"));

            }

            public txtTodokedeDate2() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtTodokedeDate2"));

            }

            public celJigyosha3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celJigyosha3"));

            }

            public txtJigyosha3() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtJigyosha3"));

            }

            public celTodokedeDate3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celTodokedeDate3"));

            }

            public txtTodokedeDate3() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtTodokedeDate3"));

            }

            public tplShisetsuNyutaisho() : UZA.TabPanel {

                return new UZA.TabPanel(this.convFiledName("tplShisetsuNyutaisho"));

            }

            public lblKaigoHokensha() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblKaigoHokensha"));

            }

            public tblShisetsuNyutaisho() : UZA.TablePanel {

                return new UZA.TablePanel(this.convFiledName("tblShisetsuNyutaisho"));

            }

            public celShisetsuNyushoDateTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuNyushoDateTitle"));

            }

            public lblShisetsuNyushoDate() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblShisetsuNyushoDate"));

            }

            public celShisetsuTaishoDateTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuTaishoDateTitle"));

            }

            public lblShisetsuTaishoDate() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblShisetsuTaishoDate"));

            }

            public celNyushoShisetsuTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celNyushoShisetsuTitle"));

            }

            public lblNyushoShisetsu() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblNyushoShisetsu"));

            }

            public celShisetsuNyushoDate1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuNyushoDate1"));

            }

            public txtShisetsuNyushoDate1() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuNyushoDate1"));

            }

            public celShisetsuTaishoDate1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuTaishoDate1"));

            }

            public txtShisetsuTaishoDate1() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuTaishoDate1"));

            }

            public celNyushoShisetsu1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celNyushoShisetsu1"));

            }

            public txtNyushoShisetsu1() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtNyushoShisetsu1"));

            }

            public celShisetsuNyushoDate2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuNyushoDate2"));

            }

            public txtShisetsuNyushoDate2() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuNyushoDate2"));

            }

            public celShisetsuTaishoDate2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuTaishoDate2"));

            }

            public txtShisetsuTaishoDate2() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuTaishoDate2"));

            }

            public celNyushoShisetsu2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celNyushoShisetsu2"));

            }

            public txtNyushoShisetsu2() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtNyushoShisetsu2"));

            }

            public celShisetsuShuruiTitle() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuShuruiTitle"));

            }

            public lblShisetsuShurui() : UZA.Label {

                return new UZA.Label(this.convFiledName("lblShisetsuShurui"));

            }

            public celShisetsuShurui1() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuShurui1"));

            }

            public txtShisetsuShurui1() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtShisetsuShurui1"));

            }

            public celShisetsuShurui2() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuShurui2"));

            }

            public txtShisetsuShurui2() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtShisetsuShurui2"));

            }

            public celShisetsuNyushoDate3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuNyushoDate3"));

            }

            public txtShisetsuNyushoDate3() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuNyushoDate3"));

            }

            public celShisetsuTaishoDate3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuTaishoDate3"));

            }

            public txtShisetsuTaishoDate3() : UZA.TextBoxFlexibleDate {

                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShisetsuTaishoDate3"));

            }

            public celNyushoShisetsu3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celNyushoShisetsu3"));

            }

            public txtNyushoShisetsu3() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtNyushoShisetsu3"));

            }

            public celShisetsuShurui3() : UZA.TableCell {

                return new UZA.TableCell(this.convFiledName("celShisetsuShurui3"));

            }

            public txtShisetsuShurui3() : UZA.TextBox {

                return new UZA.TextBox(this.convFiledName("txtShisetsuShurui3"));

            }


            public convFiledNameSelf(): string {
                return this._myName + "_" + Controls.MyType;
            }

            private convFiledName(fieldName: string): string {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            }
        }
    }

    export class HihokenshaShikakuHakko_Design extends Uz.CommonChildDiv {
    
        public get txtYukoKigen_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["displayNone"];
        }
        
        public set txtYukoKigen_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[3]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get radInjiIchi_displayNone() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["displayNone"];
        }
        
        public set radInjiIchi_displayNone(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"])["displayNone"] = value;
            } else {
                this.layout.items[0].items[0]["displayNone"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get onBlur_txtKofuDate() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onBlur"];
        }
        
        public set onBlur_txtKofuDate(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"])["onBlur"] = value;
            } else {
                this.layout.items[0].items[1]["onBlur"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        public get onChange_ddlKofuJiyu() {
            return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["onChange"];
        }
        
        public set onChange_ddlKofuJiyu(value) {
            if ( $("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).length > 0 && 
                 Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]) != undefined ) {
                Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["onChange"] = value;
            } else {
                this.layout.items[0].items[2]["onChange"] = value;
                this.raisePropertyChanged(this.layout);
            }
        }
        
        constructor($parentElement: JQuery, isDesignMode: bool, fieldName: string) {
            super($parentElement, isDesignMode, HihokenshaShikakuHakko_Design.myLayout, fieldName);
        }
        
        /**
         * レイアウト情報のプロパティを登録します
         * @method registProperty
         */
        public registProperty() {
            super.registProperty();
            Uz.JSControlUtil.registProperty("txtYukoKigen_displayNone");
            Uz.JSControlUtil.registProperty("radInjiIchi_displayNone");
            Uz.JSControlUtil.registProperty("onBlur_txtKofuDate");
            Uz.JSControlUtil.registProperty("onChange_ddlKofuJiyu");
        }
        
        /**
         * コントロール内で編集させたいプロパティをまとめたEditablePropertyInfoオブジェクトを返却します。
         * @method getEditableProperty
         * @return EditablePropertyInfoオブジェクト
         */
        public getEditablePropertyInfo(): any {
            var editablePropertyInfo = super.getEditablePropertyInfo();
            editablePropertyInfo["txtYukoKigen_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[3]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["radInjiIchi_displayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[0]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["onBlur_txtKofuDate"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[1]["fieldName"]).getEditablePropertyInfo()["onBlur"];
            editablePropertyInfo["onChange_ddlKofuJiyu"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).getEditablePropertyInfo()["onChange"];
            
            return editablePropertyInfo;
        }
        public static myLayout = {
 "fieldName": "defaultLayout",
 "items": [
  {
   "fieldName": "HihokenshaShikakuHakko",
   "items": [
    {
     "fieldName": "radInjiIchi",
     "items": [],
     "controlType": "RadioButton",
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
     "selectControlID": "radInjiIchi_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "required": false,
     "onChange": "",
     "labelLText": "印字位置:",
     "labelLWidth": "80",
     "labelLAlign": 2,
     "dataSource": [
      {
       "key": "upside",
       "value": "上段"
      },
      {
       "key": "downside",
       "value": "下段"
      }
     ],
     "onClick": "",
     "icon": [],
     "selectedItem": null,
     "newLineItemNumber": 2,
     "spaceSize": "M",
     "disabledItem": []
    },
    {
     "fieldName": "txtKofuDate",
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
     "selectControlID": "txtKofuDate_core",
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
     "labelLText": "交付日",
     "labelRText": "",
     "labelLWidth": "60",
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
     "fieldName": "ddlKofuJiyu",
     "items": [],
     "controlType": "DropDownList",
     "width": "132",
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
     "selectControlID": "ddlKofuJiyu_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": false,
     "required": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "labelLText": "交付事由",
     "labelRText": "",
     "labelLWidth": "70",
     "labelRWidth": "S",
     "labelLAlign": 2,
     "labelRAlign": 0,
     "dataSource": [
      {
       "key": "notSelected",
       "value": ""
      },
      {
       "key": "shikakuShutoku",
       "value": "資格取得"
      },
      {
       "key": "yokaigoNintei",
       "value": "要介護認定"
      },
      {
       "key": "kyojuKeikaku",
       "value": "居住計画"
      },
      {
       "key": "kyufuSeigen",
       "value": "給付制限"
      },
      {
       "key": "jutokuTekiyo",
       "value": "住所地特例適用"
      },
      {
       "key": "jutokuKaijo",
       "value": "住所地特例解除"
      },
      {
       "key": "koikiTenkyo",
       "value": "広域転居"
      },
      {
       "key": "kigenGire",
       "value": "期限切れ"
      },
      {
       "key": "yoshikiHenko",
       "value": "様式変更"
      },
      {
       "key": "kisaiHenko",
       "value": "記載変更"
      },
      {
       "key": "saikofu",
       "value": "再交付"
      }
     ],
     "selectedItem": "notSelected",
     "disabledItem": []
    },
    {
     "fieldName": "txtYukoKigen",
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
     "selectControlID": "txtYukoKigen_core",
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
     "labelLText": "有効期限",
     "labelRText": "",
     "labelLWidth": "155",
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
     "fieldName": "txtHokensha",
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
     "selectControlID": "txtHokensha_core",
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
     "labelLText": "保険者",
     "labelRText": "",
     "labelLWidth": "60",
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
     "fieldName": "txtYokaigodo",
     "items": [],
     "controlType": "TextBox",
     "width": "50",
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
     "selectControlID": "txtYokaigodo_core",
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
     "labelLText": "要介護状態",
     "labelRText": "",
     "labelLWidth": "85",
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
     "fieldName": "txtNinteiYukoKikan",
     "items": [],
     "controlType": "TextBoxDateRange",
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
     "selectControlID": "txtNinteiYukoKikan_core",
     "helpMessageID": "",
     "jpControlName": "",
     "readOnly": true,
     "isPrivateInfo": false,
     "isPassword": false,
     "onFocus": "",
     "onBlur": "",
     "onChange": "",
     "onKeyPress": "",
     "labelLText": "認定有効期間",
     "labelRText": "",
     "labelLWidth": "100",
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
     "toValue": "",
     "fromSelectControlID": "txtNinteiYukoKikanFrom",
     "toSelectControlID": "txtNinteiYukoKikanTo"
    },
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
     "fieldName": "tabHihokenshaShikakuShosai",
     "items": [
      {
       "fieldName": "tplGendoGaku",
       "items": [
        {
         "fieldName": "lblKubunShikyuGendoGaku",
         "items": [],
         "controlType": "Label",
         "width": "115",
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
         "selectControlID": "lblKubunShikyuGendoGaku",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "区分支給限度額",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "txtKubunShikyuGendoKijunGaku",
         "items": [],
         "controlType": "TextBoxNum",
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
         "selectControlID": "txtKubunShikyuGendoKijunGaku_core",
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
         "labelLText": "基準額",
         "labelRText": "",
         "labelLWidth": "55",
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
         "fieldName": "txtKyuhuYukoKikan",
         "items": [],
         "controlType": "TextBoxDateRange",
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
         "selectControlID": "txtKyuhuYukoKikan_core",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
         "isPrivateInfo": false,
         "isPassword": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "labelLText": "有効期間",
         "labelRText": "",
         "labelLWidth": "70",
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
         "toValue": "",
         "fromSelectControlID": "txtKyuhuYukoKikanFrom",
         "toSelectControlID": "txtKyuhuYukoKikanTo"
        },
        {
         "fieldName": "ShuruiShikyuGendoKijungaku",
         "items": [
          {
           "fieldName": "dgShuruiShikyuGendoKijunGaku",
           "items": [],
           "controlType": "DataGrid",
           "width": "390",
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
           "selectControlID": "dgShuruiShikyuGendoKijunGaku",
           "helpMessageID": "",
           "jpControlName": "",
           "readOnly": false,
           "height": "125",
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
              "columnName": "サービス種類",
              "dataName": "serviceShurui",
              "toolTip": "",
              "bgColor": 0,
              "width": 270,
              "visible": true,
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
              "columnName": "限度額",
              "dataName": "gendoGaku",
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
              "sortKey": ""
             }
            ]
           },
           "onSort": "",
           "onSelect": "",
           "onSelectByDblClick": "",
           "onSelectBySelectButton": "",
           "onSelectByModifyButton": "",
           "onSelectByDeleteButton": "",
           "onAfterRequest": "",
           "onAfterRequestByDblClick": "",
           "onAfterRequestBySelectButton": "",
           "onAfterRequestByModifyButton": "",
           "onAfterRequestByDeleteButton": "",
           "onOnlyRow": "",
           "onNoRow": "",
           "onMultiRows": "",
           "dataSource": [],
           "sortOrder": "serviceShurui",
           "isAscending": true,
           "filterList": [],
           "activeRowId": -1
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
         "selectControlID": "ShuruiShikyuGendoKijungaku",
         "helpMessageID": "",
         "jpControlName": "",
         "onLoad": "",
         "title": "うち種類支給限度基準額",
         "marginTop": "Default",
         "marginBottom": "Default",
         "isOpen": true,
         "canOpenAndClose": false,
         "postParameterPanelNames": [
          {
           "postParameterPanelNames": "ShuruiShikyuGendoKijungaku"
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
       "controlType": "TabPanel",
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
       "selectControlID": "tplGendoGaku",
       "helpMessageID": "",
       "jpControlName": "",
       "title": "限度額",
       "onActive": "",
       "onFirstActive": ""
      },
      {
       "fieldName": "tplShinsakaiIken",
       "items": [
        {
         "fieldName": "lblShinsakaiIken",
         "items": [],
         "controlType": "Label",
         "width": "290",
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
         "selectControlID": "lblShinsakaiIken",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "認定審査会意見及びサービス種類の指定",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "txtShinsakaiIken",
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
         "selectControlID": "txtShinsakaiIken_text_area",
         "helpMessageID": "",
         "jpControlName": "",
         "readOnly": true,
         "height": "100",
         "required": false,
         "placeHolder": "",
         "isPrivateInfo": false,
         "onFocus": "",
         "onBlur": "",
         "onChange": "",
         "onKeyPress": "",
         "text": "",
         "labelLText": "",
         "labelRText": "",
         "labelLWidth": "XS",
         "labelRWidth": "S",
         "labelLAlign": 2,
         "labelRAlign": 0,
         "value": "",
         "maxLength": 100000000,
         "minLength": 0,
         "textKind": 0,
         "limitLength": "198",
         "countDisp": true
        }
       ],
       "controlType": "TabPanel",
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
       "selectControlID": "tplShinsakaiIken",
       "helpMessageID": "",
       "jpControlName": "",
       "title": "審査会意見",
       "onActive": "",
       "onFirstActive": ""
      },
      {
       "fieldName": "tplKyufuSeigen",
       "items": [
        {
         "fieldName": "lblKyufuSeigen",
         "items": [],
         "controlType": "Label",
         "width": "70",
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
         "selectControlID": "lblKyufuSeigen",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "給付制限",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "tblKyuhuSeigen",
         "items": [
          {
           "fieldName": "celKyufuSeigenNaiyoTitle",
           "items": [
            {
             "fieldName": "lblKyufuSeigenNaiyo",
             "items": [],
             "controlType": "Label",
             "width": "70",
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
             "selectControlID": "lblKyufuSeigenNaiyo",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "制限内容",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenNaiyoTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          },
          {
           "fieldName": "celKyufuSeigenKikanTitle",
           "items": [
            {
             "fieldName": "lblKyufuSeigenKikan",
             "items": [],
             "controlType": "Label",
             "width": "235",
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
             "selectControlID": "lblKyufuSeigenKikan",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "制限期間",
             "decorationClass": "",
             "align": 1
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenKikanTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C2"
          },
          {
           "fieldName": "celKyufuSeigenNaiyo1",
           "items": [
            {
             "fieldName": "txtKyufuSeigenNaiyo1",
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
             "selectControlID": "txtKyufuSeigenNaiyo1_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenNaiyo1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C1"
          },
          {
           "fieldName": "celKyufuSeigenKikan1",
           "items": [
            {
             "fieldName": "txtKyufuSeigenKikan1",
             "items": [],
             "controlType": "TextBoxDateRange",
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
             "selectControlID": "txtKyufuSeigenKikan1_core",
             "helpMessageID": "",
             "jpControlName": "",
             "readOnly": true,
             "isPrivateInfo": false,
             "isPassword": false,
             "onFocus": "",
             "onBlur": "",
             "onChange": "",
             "onKeyPress": "",
             "labelLText": "",
             "labelRText": "",
             "labelLWidth": "S",
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
             "toValue": "",
             "fromSelectControlID": "txtKyufuSeigenKikan1From",
             "toSelectControlID": "txtKyufuSeigenKikan1To"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenKikan1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C2"
          },
          {
           "fieldName": "celKyufuSeigenNaiyo2",
           "items": [
            {
             "fieldName": "txtKyufuSeigenNaiyo2",
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
             "selectControlID": "txtKyufuSeigenNaiyo2_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenNaiyo2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C1"
          },
          {
           "fieldName": "celKyufuSeigenKikan2",
           "items": [
            {
             "fieldName": "txtKyufuSeigenKikan2",
             "items": [],
             "controlType": "TextBoxDateRange",
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
             "selectControlID": "txtKyufuSeigenKikan2_core",
             "helpMessageID": "",
             "jpControlName": "",
             "readOnly": true,
             "isPrivateInfo": false,
             "isPassword": false,
             "onFocus": "",
             "onBlur": "",
             "onChange": "",
             "onKeyPress": "",
             "labelLText": "",
             "labelRText": "",
             "labelLWidth": "S",
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
             "toValue": "",
             "fromSelectControlID": "txtKyufuSeigenKikan2From",
             "toSelectControlID": "txtKyufuSeigenKikan2To"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenKikan2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C2"
          },
          {
           "fieldName": "celKyufuSeigenNaiyo3",
           "items": [
            {
             "fieldName": "txtKyufuSeigenNaiyo3",
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
             "selectControlID": "txtKyufuSeigenNaiyo3_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenNaiyo3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C1"
          },
          {
           "fieldName": "celKyufuSeigenKikan3",
           "items": [
            {
             "fieldName": "txtKyufuSeigenKikan3",
             "items": [],
             "controlType": "TextBoxDateRange",
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
             "selectControlID": "txtKyufuSeigenKikan3_core",
             "helpMessageID": "",
             "jpControlName": "",
             "readOnly": true,
             "isPrivateInfo": false,
             "isPassword": false,
             "onFocus": "",
             "onBlur": "",
             "onChange": "",
             "onKeyPress": "",
             "labelLText": "",
             "labelRText": "",
             "labelLWidth": "S",
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
             "toValue": "",
             "fromSelectControlID": "txtKyufuSeigenKikan3From",
             "toSelectControlID": "txtKyufuSeigenKikan3To"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celKyufuSeigenKikan3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C2"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
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
         "selectControlID": "tblKyuhuSeigen",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border='1'>\n  <tbody>\n    <tr><td id='R1C1' bgcolor=\"#d7ebf6\"></td><td id='R1C2' bgcolor=\"#d7ebf6\"></td></tr>\n    <tr><td id='R2C1'></td><td id='R2C2'></td></tr>\n    <tr><td id='R3C1'></td><td id='R3C2'></td></tr>\n    <tr><td id='R4C1'></td><td id='R4C2'></td></tr>\n  </tbody>\n</table>\n"
        }
       ],
       "controlType": "TabPanel",
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
       "selectControlID": "tplKyufuSeigen",
       "helpMessageID": "",
       "jpControlName": "",
       "title": "給付制限",
       "onActive": "",
       "onFirstActive": ""
      },
      {
       "fieldName": "tplShienJigyosha",
       "items": [
        {
         "fieldName": "lblShienJigyosha",
         "items": [],
         "controlType": "Label",
         "width": "275",
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
         "selectControlID": "lblShienJigyosha",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "居住介護支援事業者及び事業者の名称",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "tblJigyosha",
         "items": [
          {
           "fieldName": "celJigyoshaTitle",
           "items": [
            {
             "fieldName": "lblJigyosha",
             "items": [],
             "controlType": "Label",
             "width": "55",
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
             "selectControlID": "lblJigyosha",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "事業者",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celJigyoshaTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          },
          {
           "fieldName": "celTodokedeDateTitle",
           "items": [
            {
             "fieldName": "lblTodokedeDate",
             "items": [],
             "controlType": "Label",
             "width": "96",
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
             "selectControlID": "lblTodokedeDate",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "届出日",
             "decorationClass": "",
             "align": 1
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celTodokedeDateTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C2"
          },
          {
           "fieldName": "celJigyosha1",
           "items": [
            {
             "fieldName": "txtJigyosha1",
             "items": [],
             "controlType": "TextBox",
             "width": "500",
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
             "selectControlID": "txtJigyosha1_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celJigyosha1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C1"
          },
          {
           "fieldName": "celTodokedeDate1",
           "items": [
            {
             "fieldName": "txtTodokedeDate1",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtTodokedeDate1_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celTodokedeDate1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C2"
          },
          {
           "fieldName": "celJigyosha2",
           "items": [
            {
             "fieldName": "txtJigyosha2",
             "items": [],
             "controlType": "TextBox",
             "width": "500",
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
             "selectControlID": "txtJigyosha2_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celJigyosha2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C1"
          },
          {
           "fieldName": "celTodokedeDate2",
           "items": [
            {
             "fieldName": "txtTodokedeDate2",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtTodokedeDate2_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celTodokedeDate2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C2"
          },
          {
           "fieldName": "celJigyosha3",
           "items": [
            {
             "fieldName": "txtJigyosha3",
             "items": [],
             "controlType": "TextBox",
             "width": "500",
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
             "selectControlID": "txtJigyosha3_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celJigyosha3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C1"
          },
          {
           "fieldName": "celTodokedeDate3",
           "items": [
            {
             "fieldName": "txtTodokedeDate3",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtTodokedeDate3_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celTodokedeDate3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C2"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
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
         "selectControlID": "tblJigyosha",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border='1'>\n  <tbody>\n    <tr><td id='R1C1' bgcolor=\"#d7ebf6\"></td><td id='R1C2' bgcolor=\"#d7ebf6\"></td></tr>\n    <tr><td id='R2C1'></td><td id='R2C2'></td></tr>\n    <tr><td id='R3C1'></td><td id='R3C2'></td></tr>\n    <tr><td id='R4C1'></td><td id='R4C2'></td></tr>\n  </tbody>\n</table>\n"
        }
       ],
       "controlType": "TabPanel",
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
       "selectControlID": "tplShienJigyosha",
       "helpMessageID": "",
       "jpControlName": "",
       "title": "支援事業者",
       "onActive": "",
       "onFirstActive": ""
      },
      {
       "fieldName": "tplShisetsuNyutaisho",
       "items": [
        {
         "fieldName": "lblKaigoHokensha",
         "items": [],
         "controlType": "Label",
         "width": "115",
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
         "selectControlID": "lblKaigoHokensha",
         "helpMessageID": "",
         "jpControlName": "",
         "required": false,
         "isPrivateInfo": false,
         "text": "介護保険施設等",
         "decorationClass": "",
         "align": 2
        },
        {
         "fieldName": "tblShisetsuNyutaisho",
         "items": [
          {
           "fieldName": "celShisetsuNyushoDateTitle",
           "items": [
            {
             "fieldName": "lblShisetsuNyushoDate",
             "items": [],
             "controlType": "Label",
             "width": "96",
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
             "selectControlID": "lblShisetsuNyushoDate",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "入所日",
             "decorationClass": "",
             "align": 1
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuNyushoDateTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C1"
          },
          {
           "fieldName": "celShisetsuTaishoDateTitle",
           "items": [
            {
             "fieldName": "lblShisetsuTaishoDate",
             "items": [],
             "controlType": "Label",
             "width": "96",
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
             "selectControlID": "lblShisetsuTaishoDate",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "退所日",
             "decorationClass": "",
             "align": 1
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuTaishoDateTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C2"
          },
          {
           "fieldName": "celNyushoShisetsuTitle",
           "items": [
            {
             "fieldName": "lblNyushoShisetsu",
             "items": [],
             "controlType": "Label",
             "width": "70",
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
             "selectControlID": "lblNyushoShisetsu",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "入所施設",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celNyushoShisetsuTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C3"
          },
          {
           "fieldName": "celShisetsuNyushoDate1",
           "items": [
            {
             "fieldName": "txtShisetsuNyushoDate1",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuNyushoDate1_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuNyushoDate1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C1"
          },
          {
           "fieldName": "celShisetsuTaishoDate1",
           "items": [
            {
             "fieldName": "txtShisetsuTaishoDate1",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuTaishoDate1_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuTaishoDate1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C2"
          },
          {
           "fieldName": "celNyushoShisetsu1",
           "items": [
            {
             "fieldName": "txtNyushoShisetsu1",
             "items": [],
             "controlType": "TextBox",
             "width": "350",
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
             "selectControlID": "txtNyushoShisetsu1_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celNyushoShisetsu1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C3"
          },
          {
           "fieldName": "celShisetsuNyushoDate2",
           "items": [
            {
             "fieldName": "txtShisetsuNyushoDate2",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuNyushoDate2_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuNyushoDate2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C1"
          },
          {
           "fieldName": "celShisetsuTaishoDate2",
           "items": [
            {
             "fieldName": "txtShisetsuTaishoDate2",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuTaishoDate2_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuTaishoDate2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C2"
          },
          {
           "fieldName": "celNyushoShisetsu2",
           "items": [
            {
             "fieldName": "txtNyushoShisetsu2",
             "items": [],
             "controlType": "TextBox",
             "width": "350",
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
             "selectControlID": "txtNyushoShisetsu2_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celNyushoShisetsu2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C3"
          },
          {
           "fieldName": "celShisetsuShuruiTitle",
           "items": [
            {
             "fieldName": "lblShisetsuShurui",
             "items": [],
             "controlType": "Label",
             "width": "70",
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
             "selectControlID": "lblShisetsuShurui",
             "helpMessageID": "",
             "jpControlName": "",
             "required": false,
             "isPrivateInfo": false,
             "text": "施設種類",
             "decorationClass": "",
             "align": 2
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuShuruiTitle",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R1C5"
          },
          {
           "fieldName": "celShisetsuShurui1",
           "items": [
            {
             "fieldName": "txtShisetsuShurui1",
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
             "selectControlID": "txtShisetsuShurui1_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuShurui1",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R2C5"
          },
          {
           "fieldName": "celShisetsuShurui2",
           "items": [
            {
             "fieldName": "txtShisetsuShurui2",
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
             "selectControlID": "txtShisetsuShurui2_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuShurui2",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R3C5"
          },
          {
           "fieldName": "celShisetsuNyushoDate3",
           "items": [
            {
             "fieldName": "txtShisetsuNyushoDate3",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuNyushoDate3_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuNyushoDate3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C1"
          },
          {
           "fieldName": "celShisetsuTaishoDate3",
           "items": [
            {
             "fieldName": "txtShisetsuTaishoDate3",
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
             "float": 1,
             "toolTip": "",
             "authorityMode": 0,
             "marginLeft": "XS",
             "marginRight": "XS",
             "selectControlID": "txtShisetsuTaishoDate3_core",
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
             "ymdKubun": 2,
             "displayFormat": 0,
             "value": "",
             "textKind": 0,
             "permitCharactor": "./_-"
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuTaishoDate3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C2"
          },
          {
           "fieldName": "celNyushoShisetsu3",
           "items": [
            {
             "fieldName": "txtNyushoShisetsu3",
             "items": [],
             "controlType": "TextBox",
             "width": "350",
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
             "selectControlID": "txtNyushoShisetsu3_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celNyushoShisetsu3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C3"
          },
          {
           "fieldName": "celShisetsuShurui3",
           "items": [
            {
             "fieldName": "txtShisetsuShurui3",
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
             "selectControlID": "txtShisetsuShurui3_core",
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
            }
           ],
           "controlType": "TableCell",
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
           "selectControlID": "celShisetsuShurui3",
           "helpMessageID": "",
           "jpControlName": "",
           "connectTd": "R4C5"
          }
         ],
         "controlType": "TablePanel",
         "width": "XS",
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
         "selectControlID": "tblShisetsuNyutaisho",
         "helpMessageID": "",
         "jpControlName": "",
         "html": "<table border='1'>\n  <tbody>\n    <tr><td id='R1C5' bgcolor=\"#d7ebf6\"></td><td id='R1C3' bgcolor=\"#d7ebf6\"></td><td id='R1C1' bgcolor=\"#d7ebf6\"></td><td id='R1C2' bgcolor=\"#d7ebf6\"></td></tr>\n    <tr><td id='R2C5'></td><td id='R2C3'></td><td id='R2C1'></td><td id='R2C2'></td></tr>\n    <tr><td id='R3C5'></td><td id='R3C3'></td><td id='R3C1'></td><td id='R3C2'></td></tr>\n    <tr><td id='R4C5'></td><td id='R4C3'></td><td id='R4C1'></td><td id='R4C2'></td></tr>\n  </tbody>\n</table>\n"
        }
       ],
       "controlType": "TabPanel",
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
       "selectControlID": "tplShisetsuNyutaisho",
       "helpMessageID": "",
       "jpControlName": "",
       "title": "施設入退所",
       "onActive": "",
       "onFirstActive": ""
      }
     ],
     "controlType": "TabContainer",
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
     "selectControlID": "tabHihokenshaShikakuShosai",
     "helpMessageID": "",
     "jpControlName": "",
     "onChange": "",
     "selectedItem": null,
     "tabpanelPosition": [
      "tplGendoGaku",
      "tplShinsakaiIken",
      "tplKyufuSeigen",
      "tplShienJigyosha",
      "tplShisetsuNyutaisho"
     ],
     "isDraggable": false,
     "selectedItemFieldName": "tplGendoGaku",
     "initialTab": 0,
     "isLazyLoading": false
    }
   ],
   "controlType": "Panel",
   "width": "1000",
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
   "selectControlID": "HihokenshaShikakuHakko",
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
     "postParameterPanelNames": "HihokenshaShikakuHakko"
    }
   ],
   "requestSettings": [],
   "hiddenInput": [],
   "onOpen": "",
   "onClose": "",
   "session": {},
   "eraseBorder": true,
   "backgroundColor": 0,
   "widthAuto": false,
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
 "controlName": "HihokenshaShikakuHakko",
 "marginTop": 0,
 "marginBottom": 0,
 "originalProperty": [
  {
   "publicChildFieldName": "txtYukoKigen",
   "publicChildProperty": "displayNone",
   "newPropertyName": "txtYukoKigen_displayNone"
  },
  {
   "publicChildFieldName": "radInjiIchi",
   "publicChildProperty": "displayNone",
   "newPropertyName": "radInjiIchi_displayNone"
  },
  {
   "publicChildFieldName": "txtKofuDate",
   "publicChildProperty": "onBlur",
   "newPropertyName": "onBlur_txtKofuDate"
  },
  {
   "publicChildFieldName": "ddlKofuJiyu",
   "publicChildProperty": "onChange",
   "newPropertyName": "onChange_ddlKofuJiyu"
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

