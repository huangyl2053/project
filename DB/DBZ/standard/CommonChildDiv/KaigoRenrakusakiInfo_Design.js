var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var DBZ;
(function (DBZ) {
    (function (KaigoRenrakusakiInfo) {
        var Events = (function () {
            function Events() {
            }
            Object.defineProperty(Events, "onClick_btnKoshin", {
                get: function () {
                    return "onClick_btnKoshin";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onClick_btnDelete", {
                get: function () {
                    return "onClick_btnDelete";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onClick_btnCancel", {
                get: function () {
                    return "onClick_btnCancel";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onSelectBySB_Renrakusaki", {
                get: function () {
                    return "onSelectBySB_Renrakusaki";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onSelectByDC_Renrakusaki", {
                get: function () {
                    return "onSelectByDC_Renrakusaki";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onClick_btnClose", {
                get: function () {
                    return "onClick_btnClose";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "onClick_btnAdd", {
                get: function () {
                    return "onClick_btnAdd";
                },
                enumerable: true,
                configurable: true
            });
            return Events;
        })();
        KaigoRenrakusakiInfo.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Object.defineProperty(Controls, "MyType", {
                get: function () {
                    return "KaigoRenrakusakiInfo";
                },
                enumerable: true,
                configurable: true
            });

            Controls.prototype.KaigoRenrakusakiInfo = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.btnAdd = function () {
                return new UZA.Button(this.convFiledName("btnAdd"));
            };

            Controls.prototype.btnDelete = function () {
                return new UZA.Button(this.convFiledName("btnDelete"));
            };

            Controls.prototype.dgRenrakusaki = function () {
                return new UZA.DataGrid(this.convFiledName("dgRenrakusaki"));
            };

            Controls.prototype.btnClose = function () {
                return new UZA.Button(this.convFiledName("btnClose"));
            };

            Controls.prototype.SelectedContents = function () {
                return new UZA.Panel(this.convFiledName("SelectedContents"));
            };

            Controls.prototype.txtRenrakusakiKbnNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtRenrakusakiKbnNo"));
            };

            Controls.prototype.txtShimei = function () {
                return new UZA.TextBox(this.convFiledName("txtShimei"));
            };

            Controls.prototype.txtShimeiKana = function () {
                return new UZA.TextBox(this.convFiledName("txtShimeiKana"));
            };

            Controls.prototype.txtTsuzukigara = function () {
                return new UZA.TextBox(this.convFiledName("txtTsuzukigara"));
            };

            Controls.prototype.txtTel = function () {
                return new UZA.TextBox(this.convFiledName("txtTel"));
            };

            Controls.prototype.txtKeitaiNo = function () {
                return new UZA.TextBox(this.convFiledName("txtKeitaiNo"));
            };

            Controls.prototype.txtYubinNo = function () {
                return new UZA.TextBoxYubinNo(this.convFiledName("txtYubinNo"));
            };

            Controls.prototype.txtJusho = function () {
                return new UZA.TextBoxMultiLine(this.convFiledName("txtJusho"));
            };

            Controls.prototype.btnUpdate = function () {
                return new UZA.Button(this.convFiledName("btnUpdate"));
            };

            Controls.prototype.btnReturn = function () {
                return new UZA.Button(this.convFiledName("btnReturn"));
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + Controls.MyType;
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            };
            return Controls;
        })();
        KaigoRenrakusakiInfo.Controls = Controls;
    })(DBZ.KaigoRenrakusakiInfo || (DBZ.KaigoRenrakusakiInfo = {}));
    var KaigoRenrakusakiInfo = DBZ.KaigoRenrakusakiInfo;

    var KaigoRenrakusakiInfo_Design = (function (_super) {
        __extends(KaigoRenrakusakiInfo_Design, _super);
        function KaigoRenrakusakiInfo_Design($parentElement, isDesignMode, fieldName) {
            _super.call(this, $parentElement, isDesignMode, KaigoRenrakusakiInfo_Design.myLayout, fieldName);
        }
        KaigoRenrakusakiInfo_Design.prototype.registProperty = function () {
            _super.prototype.registProperty.call(this);
        };

        KaigoRenrakusakiInfo_Design.prototype.getEditablePropertyInfo = function () {
            var editablePropertyInfo = _super.prototype.getEditablePropertyInfo.call(this);

            return editablePropertyInfo;
        };
        KaigoRenrakusakiInfo_Design.myLayout = {
            "fieldName": "defaultLayout",
            "items": [
                {
                    "fieldName": "KaigoRenrakusakiInfo",
                    "items": [
                        {
                            "fieldName": "btnAdd",
                            "items": [],
                            "controlType": "Button",
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
                            "marginLeft": "XS",
                            "marginRight": "XS",
                            "selectControlID": "btnAdd",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "onBeforeClick": "",
                            "onAfterClick": "",
                            "onClick": "onClick_btnAdd",
                            "text": "追加",
                            "appearance": 0,
                            "imageFileUrl": "",
                            "imageWidth": "",
                            "imageHeight": "",
                            "icon": 0,
                            "heightTextBoxMatches": false
                        },
                        {
                            "fieldName": "btnDelete",
                            "items": [],
                            "controlType": "Button",
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
                            "marginLeft": "XS",
                            "marginRight": "XS",
                            "selectControlID": "btnDelete",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "onBeforeClick": "",
                            "onAfterClick": "",
                            "onClick": "onClick_btnDelete",
                            "text": "削除",
                            "appearance": 0,
                            "imageFileUrl": "",
                            "imageWidth": "",
                            "imageHeight": "",
                            "icon": 0,
                            "heightTextBoxMatches": false
                        },
                        {
                            "fieldName": "dgRenrakusaki",
                            "items": [],
                            "controlType": "DataGrid",
                            "width": "580",
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
                            "selectControlID": "dgRenrakusaki",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "readOnly": false,
                            "height": "167",
                            "gridSetting": {
                                "rowHeight": 25,
                                "isMultiSelectable": false,
                                "isShowHeader": true,
                                "isShowFooter": false,
                                "isShowFilter": false,
                                "isShowFilterButton": false,
                                "isShowRowState": false,
                                "isShowSelectButtonColumn": true,
                                "isShowModifyButtonColumn": false,
                                "isShowDeleteButtonColumn": false,
                                "limitRowCount": 0,
                                "selectedRowCount": 0,
                                "header": {
                                    "combineColumns": [],
                                    "frozenColumn": "",
                                    "headerHeight": 0
                                },
                                "columns": [
                                    {
                                        "columnName": "No",
                                        "dataName": "renrakusakiKbnNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 20,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "renrakusakiKbnNo"
                                    },
                                    {
                                        "columnName": "氏名",
                                        "dataName": "shimei",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 230,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "shimei"
                                    },
                                    {
                                        "columnName": "続柄",
                                        "dataName": "tsuzukigara",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 60,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "tsuzukigara"
                                    },
                                    {
                                        "columnName": "電話番号",
                                        "dataName": "tel",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 110,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0
                                        },
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "tel"
                                    },
                                    {
                                        "columnName": "携帯番号",
                                        "dataName": "keitaiNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 110,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "keitaiNo"
                                    },
                                    {
                                        "columnName": "氏名カナ",
                                        "dataName": "shimeiKana",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "shimeiKana"
                                    },
                                    {
                                        "columnName": "郵便番号",
                                        "dataName": "yubinNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 100,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "yubinNo"
                                    },
                                    {
                                        "columnName": "住所",
                                        "dataName": "jusho",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "jusho"
                                    }
                                ]
                            },
                            "onSort": "",
                            "onSelect": "",
                            "onSelectByDblClick": "onSelectByDC_Renrakusaki",
                            "onSelectBySelectButton": "onSelectBySB_Renrakusaki",
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
                            "sortOrder": "keitaiNo",
                            "isAscending": true,
                            "filterList": [],
                            "activeRowId": -1
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
                            "wrap": false,
                            "dependencies": [],
                            "float": 2,
                            "toolTip": "",
                            "authorityMode": 0,
                            "marginLeft": "XS",
                            "marginRight": "XS",
                            "selectControlID": "btnClose",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "onBeforeClick": "",
                            "onAfterClick": "",
                            "onClick": "onClick_btnClose",
                            "text": "閉じる",
                            "appearance": 0,
                            "imageFileUrl": "",
                            "imageWidth": "",
                            "imageHeight": "",
                            "icon": 0,
                            "heightTextBoxMatches": false
                        },
                        {
                            "fieldName": "SelectedContents",
                            "items": [
                                {
                                    "fieldName": "txtRenrakusakiKbnNo",
                                    "items": [],
                                    "controlType": "TextBoxCode",
                                    "width": "20",
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
                                    "selectControlID": "txtRenrakusakiKbnNo_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
                                    "required": false,
                                    "maxLength": "10000000",
                                    "minLength": 0,
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "No",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": "",
                                    "formatLength": "1"
                                },
                                {
                                    "fieldName": "txtShimei",
                                    "items": [],
                                    "controlType": "TextBox",
                                    "width": "400",
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
                                    "selectControlID": "txtShimei_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "氏名",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtShimeiKana",
                                    "items": [],
                                    "controlType": "TextBox",
                                    "width": "400",
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
                                    "selectControlID": "txtShimeiKana_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "氏名カナ",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtTsuzukigara",
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
                                    "selectControlID": "txtTsuzukigara_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "続柄",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtTel",
                                    "items": [],
                                    "controlType": "TextBox",
                                    "width": "125",
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
                                    "selectControlID": "txtTel_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
                                    "required": false,
                                    "maxLength": "13",
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "電話番号",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtKeitaiNo",
                                    "items": [],
                                    "controlType": "TextBox",
                                    "width": "125",
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
                                    "selectControlID": "txtKeitaiNo_core",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "text": "",
                                    "required": false,
                                    "maxLength": "13",
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "携帯番号",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtYubinNo",
                                    "items": [],
                                    "controlType": "TextBoxYubinNo",
                                    "width": "70",
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
                                    "text": "",
                                    "required": false,
                                    "maxLength": 100000000,
                                    "minLength": 0,
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
                                    "suggest": [],
                                    "value": "",
                                    "labelLText": "〒",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "decorationClass": "",
                                    "permitCharactor": ""
                                },
                                {
                                    "fieldName": "txtJusho",
                                    "items": [],
                                    "controlType": "TextBoxMultiLine",
                                    "width": "430",
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
                                    "selectControlID": "txtJusho_text_area",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": false,
                                    "height": "S",
                                    "text": "",
                                    "required": false,
                                    "maxLength": 100000000,
                                    "minLength": 0,
                                    "placeHolder": "",
                                    "textKind": 0,
                                    "isPrivateInfo": false,
                                    "onFocus": "",
                                    "onBlur": "",
                                    "onChange": "",
                                    "onKeyPress": "",
                                    "value": "",
                                    "labelLText": "住所",
                                    "labelRText": "",
                                    "labelLWidth": "65",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "limitLength": "100",
                                    "countDisp": true
                                },
                                {
                                    "fieldName": "btnUpdate",
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
                                    "selectControlID": "btnUpdate",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "onBeforeClick": "",
                                    "onAfterClick": "",
                                    "onClick": "onClick_btnKoshin",
                                    "text": "更新",
                                    "appearance": 0,
                                    "imageFileUrl": "",
                                    "imageWidth": "",
                                    "imageHeight": "",
                                    "icon": 0,
                                    "heightTextBoxMatches": false
                                },
                                {
                                    "fieldName": "btnReturn",
                                    "items": [],
                                    "controlType": "Button",
                                    "width": "S",
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
                                    "selectControlID": "btnReturn",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "onBeforeClick": "",
                                    "onAfterClick": "",
                                    "onClick": "onClick_btnCancel",
                                    "text": "取消",
                                    "appearance": 0,
                                    "imageFileUrl": "",
                                    "imageWidth": "",
                                    "imageHeight": "",
                                    "icon": 0,
                                    "heightTextBoxMatches": false
                                }
                            ],
                            "controlType": "Panel",
                            "width": "580",
                            "visible": true,
                            "displayNone": true,
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
                            "selectControlID": "SelectedContents",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "onLoad": "",
                            "title": "連絡先内容",
                            "marginTop": "Default",
                            "marginBottom": "Default",
                            "isOpen": true,
                            "canOpenAndClose": false,
                            "postParameterPanelNames": [
                                {
                                    "postParameterPanelNames": "SelectedContents"
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
                        }
                    ],
                    "controlType": "Panel",
                    "width": "600",
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
                    "marginLeft": "Default",
                    "marginRight": "Default",
                    "selectControlID": "KaigoRenrakusakiInfo",
                    "helpMessageID": "",
                    "jpControlName": "",
                    "onLoad": "",
                    "title": "連絡先",
                    "marginTop": "Default",
                    "marginBottom": "Default",
                    "isOpen": true,
                    "canOpenAndClose": true,
                    "postParameterPanelNames": [
                        {
                            "postParameterPanelNames": "KaigoRenrakusakiInfo"
                        }
                    ],
                    "requestSettings": [
                        {
                            "eventName": "onLoad",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onLoad"
                        },
                        {
                            "eventName": "onClick_btnCancel",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnCancel"
                        },
                        {
                            "eventName": "onClick_btnAdd",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnAdd"
                        },
                        {
                            "eventName": "onSelectByDC_Renrakusaki",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onSelect_Renrakusaki"
                        },
                        {
                            "eventName": "onSelectBySB_Renrakusaki",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onSelect_Renrakusaki"
                        },
                        {
                            "eventName": "onClick_btnKoshin",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnKoshin"
                        },
                        {
                            "eventName": "onClick_btnDelete",
                            "requestUrl": "dbz/db/dbz/RenrakusakiInfo/onClick_btnDelete"
                        }
                    ],
                    "hiddenInput": [
                        {
                            "propertyName": "hokenshaNo",
                            "value": ""
                        },
                        {
                            "propertyName": "hihokenshaNo",
                            "value": ""
                        },
                        {
                            "propertyName": "shoriKbn",
                            "value": ""
                        }
                    ],
                    "onOpen": "",
                    "onClose": "",
                    "session": {},
                    "eraseBorder": false,
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
            "controlName": "KaigoRenrakusakiInfo",
            "marginTop": 0,
            "marginBottom": 0,
            "originalProperty": [],
            "dataPassingForDialog": [
                {
                    "key": "hokenshaNo",
                    "controlName": "KaigoRenrakusakiInfo.hokenshaNo"
                },
                {
                    "key": "hihokenshaNo",
                    "controlName": "KaigoRenrakusakiInfo.hihokenshaNo"
                }
            ],
            "dialogOkEventNameForDialog": "onClick_btnClose",
            "dialogCancelEventNameForDialog": "onClick_btnClose",
            "canTransferEvent": true,
            "heightForDialog": "Auto"
        };
        return KaigoRenrakusakiInfo_Design;
    })(Uz.CommonChildDiv);
    DBZ.KaigoRenrakusakiInfo_Design = KaigoRenrakusakiInfo_Design;
})(DBZ || (DBZ = {}));
