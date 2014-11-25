var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var DBD;
(function (DBD) {
    (function (HomonkaigoRiyoshaFutangakuGengaku) {
        var Events = (function () {
            function Events() {
            }
            Object.defineProperty(Events, "onSelect_dgHomonkaigoRiyoshaFutangakuGengakuList", {
                get: function () {
                    return "onSelect_dgHomonkaigoRiyoshaFutangakuGengakuList";
                },
                enumerable: true,
                configurable: true
            });
            Object.defineProperty(Events, "CloseOK", {
                get: function () {
                    return "CloseOK";
                },
                enumerable: true,
                configurable: true
            });
            return Events;
        })();
        HomonkaigoRiyoshaFutangakuGengaku.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Object.defineProperty(Controls, "MyType", {
                get: function () {
                    return "HomonkaigoRiyoshaFutangakuGengaku";
                },
                enumerable: true,
                configurable: true
            });

            Controls.prototype.HomonkaigoRiyoshaFutangakuGengaku = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.txtHiddenHihokenshaNo = function () {
                return new UZA.TextBox(this.convFiledName("txtHiddenHihokenshaNo"));
            };

            Controls.prototype.dgHomonkaigoRiyoshaFutangakuGengakuList = function () {
                return new UZA.DataGrid(this.convFiledName("dgHomonkaigoRiyoshaFutangakuGengakuList"));
            };

            Controls.prototype.HomonkaigoRiyoshaFutangakuGengakuDetail = function () {
                return new UZA.Panel(this.convFiledName("HomonkaigoRiyoshaFutangakuGengakuDetail"));
            };

            Controls.prototype.HomonkaigoRiyoshaFutangakuGengakuShinsei = function () {
                return new UZA.Panel(this.convFiledName("HomonkaigoRiyoshaFutangakuGengakuShinsei"));
            };

            Controls.prototype.txtShinseiDate = function () {
                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtShinseiDate"));
            };

            Controls.prototype.txtHobetsuKubun = function () {
                return new UZA.TextBox(this.convFiledName("txtHobetsuKubun"));
            };

            Controls.prototype.txtShinseiRiyu = function () {
                return new UZA.TextBoxMultiLine(this.convFiledName("txtShinseiRiyu"));
            };

            Controls.prototype.ShogaishaTecho = function () {
                return new UZA.Panel(this.convFiledName("ShogaishaTecho"));
            };

            Controls.prototype.txtHasShogaishaTecho = function () {
                return new UZA.TextBox(this.convFiledName("txtHasShogaishaTecho"));
            };

            Controls.prototype.txtShogaishaTechoTokyu = function () {
                return new UZA.TextBox(this.convFiledName("txtShogaishaTechoTokyu"));
            };

            Controls.prototype.txtShogaishaTechoNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtShogaishaTechoNo"));
            };

            Controls.prototype.HomonkaigoRiyoshaFutangakuGengakuRiyoshaFutan = function () {
                return new UZA.Panel(this.convFiledName("HomonkaigoRiyoshaFutangakuGengakuRiyoshaFutan"));
            };

            Controls.prototype.txtKetteiDate = function () {
                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtKetteiDate"));
            };

            Controls.prototype.txtKetteiKubun = function () {
                return new UZA.TextBox(this.convFiledName("txtKetteiKubun"));
            };

            Controls.prototype.txtTekiyoDate = function () {
                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtTekiyoDate"));
            };

            Controls.prototype.txtYukokigenDate = function () {
                return new UZA.TextBoxFlexibleDate(this.convFiledName("txtYukokigenDate"));
            };

            Controls.prototype.txtKyufuRitsu = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtKyufuRitsu"));
            };

            Controls.prototype.txtFushoninRiyu = function () {
                return new UZA.TextBoxMultiLine(this.convFiledName("txtFushoninRiyu"));
            };

            Controls.prototype.txtKohiFutanshaNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtKohiFutanshaNo"));
            };

            Controls.prototype.txtKohiJukyushaNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtKohiJukyushaNo"));
            };

            Controls.prototype.btnClose = function () {
                return new UZA.Button(this.convFiledName("btnClose"));
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + Controls.MyType;
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + Controls.MyType + "_" + fieldName;
            };
            return Controls;
        })();
        HomonkaigoRiyoshaFutangakuGengaku.Controls = Controls;
    })(DBD.HomonkaigoRiyoshaFutangakuGengaku || (DBD.HomonkaigoRiyoshaFutangakuGengaku = {}));
    var HomonkaigoRiyoshaFutangakuGengaku = DBD.HomonkaigoRiyoshaFutangakuGengaku;

    var HomonkaigoRiyoshaFutangakuGengaku_Design = (function (_super) {
        __extends(HomonkaigoRiyoshaFutangakuGengaku_Design, _super);
        function HomonkaigoRiyoshaFutangakuGengaku_Design($parentElement, isDesignMode, fieldName) {
            _super.call(this, $parentElement, isDesignMode, HomonkaigoRiyoshaFutangakuGengaku_Design.myLayout, fieldName);
        }
        HomonkaigoRiyoshaFutangakuGengaku_Design.prototype.registProperty = function () {
            _super.prototype.registProperty.call(this);
        };

        HomonkaigoRiyoshaFutangakuGengaku_Design.prototype.getEditablePropertyInfo = function () {
            var editablePropertyInfo = _super.prototype.getEditablePropertyInfo.call(this);

            return editablePropertyInfo;
        };
        HomonkaigoRiyoshaFutangakuGengaku_Design.myLayout = {
            "fieldName": "defaultLayout",
            "items": [
                {
                    "fieldName": "HomonkaigoRiyoshaFutangakuGengaku",
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
                            "fieldName": "dgHomonkaigoRiyoshaFutangakuGengakuList",
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
                            "selectControlID": "dgHomonkaigoRiyoshaFutangakuGengakuList",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "readOnly": false,
                            "height": "185",
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
                                        "columnName": "申請理由",
                                        "dataName": "shinseiRiyu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 0,
                                        "visible": false,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": "shinseiRiyu"
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
                                        "width": 90,
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
                                    },
                                    {
                                        "columnName": "法別区分",
                                        "dataName": "hobetsuKubun",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "hobetsuKubun"
                                    },
                                    {
                                        "columnName": "給付率<br>",
                                        "dataName": "kyufuRitsu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 60,
                                        "visible": true,
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
                                        "align": 2,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "kyufuRitsu"
                                    },
                                    {
                                        "columnName": "公費負担者番号",
                                        "dataName": "kohiFutanshaNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 0,
                                        "visible": false,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 1,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": "kohiFutanshaNo"
                                    },
                                    {
                                        "columnName": "公費受給者<br>番号",
                                        "dataName": "kohiJukyushaNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 88,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 1,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "kohiJukyushaNo"
                                    },
                                    {
                                        "columnName": "障害者手帳有無",
                                        "dataName": "hasShogaishaTecho",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 0,
                                        "visible": false,
                                        "cellType": 2,
                                        "cellDetails": {
                                            "cellType": 2,
                                            "disabled": true,
                                            "onChange": ""
                                        },
                                        "align": 1,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": "hasShogaishaTecho"
                                    },
                                    {
                                        "columnName": "障害者手帳等級",
                                        "dataName": "shogaishaTechoTokyu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 0,
                                        "visible": false,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0,
                                            "isSetValueToToolTip": false
                                        },
                                        "align": 1,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": "shogaishaTechoTokyu"
                                    },
                                    {
                                        "columnName": "障害者手帳<br>番号",
                                        "dataName": "shogaishaTechoNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 88,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 1,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "shogaishaTechoNo"
                                    }
                                ]
                            },
                            "onSort": "",
                            "onSelect": "onSelect_dgHomonkaigoRiyoshaFutangakuGengakuList",
                            "onSelectByDblClick": "",
                            "onSelectBySelectButton": "",
                            "onSelectByModifyButton": "",
                            "onSelectByDeleteButton": "",
                            "onOnlyRow": "",
                            "onNoRow": "",
                            "onMultiRows": "",
                            "dataSource": [],
                            "sortOrder": "tekiyoKaishiDate",
                            "isAscending": true,
                            "filterList": [],
                            "activeRowId": -1
                        },
                        {
                            "fieldName": "HomonkaigoRiyoshaFutangakuGengakuDetail",
                            "items": [
                                {
                                    "fieldName": "HomonkaigoRiyoshaFutangakuGengakuShinsei",
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
                                            "fieldName": "txtHobetsuKubun",
                                            "items": [],
                                            "controlType": "TextBox",
                                            "width": "180",
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
                                            "selectControlID": "txtHobetsuKubun_core",
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
                                            "labelLText": "法別区分",
                                            "labelRText": "",
                                            "labelLWidth": "79",
                                            "labelRWidth": "S",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "decorationClass": "",
                                            "permitCharactor": ""
                                        },
                                        {
                                            "fieldName": "txtShinseiRiyu",
                                            "items": [],
                                            "controlType": "TextBoxMultiLine",
                                            "width": "360",
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
                                            "selectControlID": "txtShinseiRiyu_text_area",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "readOnly": true,
                                            "height": "XS",
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
                                            "text": "",
                                            "value": "",
                                            "labelLText": "申請理由",
                                            "labelRText": "",
                                            "labelLWidth": "S",
                                            "labelRWidth": "S",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "limitLength": 20,
                                            "countDisp": false
                                        }
                                    ],
                                    "controlType": "Panel",
                                    "width": "500",
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
                                    "selectControlID": "HomonkaigoRiyoshaFutangakuGengakuShinsei",
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
                                            "postParameterPanelNames": "HomonkaigoRiyoshaFutangakuGengakuShinsei"
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
                                    "fieldName": "ShogaishaTecho",
                                    "items": [
                                        {
                                            "fieldName": "txtHasShogaishaTecho",
                                            "items": [],
                                            "controlType": "TextBox",
                                            "width": "16",
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
                                            "marginLeft": "4",
                                            "marginRight": "XS",
                                            "selectControlID": "txtHasShogaishaTecho_core",
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
                                            "fieldName": "txtShogaishaTechoTokyu",
                                            "items": [],
                                            "controlType": "TextBox",
                                            "width": "16",
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
                                            "selectControlID": "txtShogaishaTechoTokyu_core",
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
                                            "labelLText": "",
                                            "labelRText": "等級",
                                            "labelLWidth": "50",
                                            "labelRWidth": "32",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "decorationClass": "",
                                            "permitCharactor": ""
                                        },
                                        {
                                            "fieldName": "txtShogaishaTechoNo",
                                            "items": [],
                                            "controlType": "TextBoxCode",
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
                                            "selectControlID": "txtShogaishaTechoNo_core",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "readOnly": true,
                                            "required": false,
                                            "maxLength": "7",
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
                                            "text": "",
                                            "suggest": [],
                                            "value": "",
                                            "labelLText": "番号",
                                            "labelRText": "",
                                            "labelLWidth": "40",
                                            "labelRWidth": "S",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "decorationClass": "",
                                            "permitCharactor": "",
                                            "formatLength": "7"
                                        }
                                    ],
                                    "controlType": "Panel",
                                    "width": "G4",
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
                                    "marginRight": "S",
                                    "selectControlID": "ShogaishaTecho",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "onLoad": "",
                                    "title": "障害者手帳",
                                    "marginTop": "L",
                                    "marginBottom": "Default",
                                    "isOpen": true,
                                    "canOpenAndClose": false,
                                    "postParameterPanelNames": [
                                        {
                                            "postParameterPanelNames": "ShogaishaTecho"
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
                                    "fieldName": "HomonkaigoRiyoshaFutangakuGengakuRiyoshaFutan",
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
                                            "fieldName": "txtKyufuRitsu",
                                            "items": [],
                                            "controlType": "TextBoxNum",
                                            "width": "30",
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
                                            "selectControlID": "txtKyufuRitsu_core",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "readOnly": true,
                                            "required": false,
                                            "maxLength": "3",
                                            "minLength": 0,
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
                                            "labelLText": "給付率",
                                            "labelRText": "％",
                                            "labelLWidth": "S",
                                            "labelRWidth": "32",
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
                                            "wrap": true,
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
                                            "fieldName": "txtKohiFutanshaNo",
                                            "items": [],
                                            "controlType": "TextBoxCode",
                                            "width": "68",
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
                                            "selectControlID": "txtKohiFutanshaNo_core",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "readOnly": true,
                                            "required": false,
                                            "maxLength": "8",
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
                                            "text": "",
                                            "suggest": [],
                                            "value": "",
                                            "labelLText": "公費負担者番号",
                                            "labelRText": "",
                                            "labelLWidth": "S",
                                            "labelRWidth": "S",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "decorationClass": "",
                                            "permitCharactor": "",
                                            "formatLength": "8"
                                        },
                                        {
                                            "fieldName": "txtKohiJukyushaNo",
                                            "items": [],
                                            "controlType": "TextBoxCode",
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
                                            "selectControlID": "txtKohiJukyushaNo_core",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "readOnly": true,
                                            "required": false,
                                            "maxLength": "7",
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
                                            "text": "",
                                            "suggest": [],
                                            "value": "",
                                            "labelLText": "公費受給者番号",
                                            "labelRText": "",
                                            "labelLWidth": "132",
                                            "labelRWidth": "S",
                                            "labelLAlign": 2,
                                            "labelRAlign": 0,
                                            "decorationClass": "",
                                            "permitCharactor": "",
                                            "formatLength": "7"
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
                                    "selectControlID": "HomonkaigoRiyoshaFutangakuGengakuRiyoshaFutan",
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
                                            "postParameterPanelNames": "HomonkaigoRiyoshaFutangakuGengakuRiyoshaFutan"
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
                            "selectControlID": "HomonkaigoRiyoshaFutangakuGengakuDetail",
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
                                    "postParameterPanelNames": "HomonkaigoRiyoshaFutangakuGengakuDetail"
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
                    "selectControlID": "HomonkaigoRiyoshaFutangakuGengaku",
                    "helpMessageID": "",
                    "jpControlName": "",
                    "onLoad": "",
                    "title": "訪問介護利用者負担額減免",
                    "marginTop": "Default",
                    "marginBottom": "Default",
                    "isOpen": true,
                    "canOpenAndClose": true,
                    "postParameterPanelNames": [
                        {
                            "postParameterPanelNames": "HomonkaigoRiyoshaFutangakuGengaku"
                        }
                    ],
                    "requestSettings": [
                        {
                            "eventName": "onLoad",
                            "requestUrl": "dbd/db/dbd/HomonkaigoRiyoshaFutangakuGengaku/onLoad"
                        },
                        {
                            "eventName": "onSelect_dgHomonkaigoRiyoshaFutangakuGengakuList",
                            "requestUrl": "dbd/db/dbd/HomonkaigoRiyoshaFutangakuGengaku/onSelect_dgHomonkaigoRiyoshaFutangakuGengakuList"
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
                    "height": "540"
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
            "controlName": "HomonkaigoRiyoshaFutangakuGengaku",
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
            "heightForDialog": "580"
        };
        return HomonkaigoRiyoshaFutangakuGengaku_Design;
    })(Uz.CommonChildDiv);
    DBD.HomonkaigoRiyoshaFutangakuGengaku_Design = HomonkaigoRiyoshaFutangakuGengaku_Design;
})(DBD || (DBD = {}));
