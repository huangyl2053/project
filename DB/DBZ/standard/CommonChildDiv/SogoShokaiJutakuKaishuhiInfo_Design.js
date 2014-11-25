var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var DBZ;
(function (DBZ) {
    (function (SogoShokaiJutakuKaishuhiInfo) {
        var Events = (function () {
            function Events() {
            }
            Object.defineProperty(Events, "onClick_btnModify", {
                get: function () {
                    return "onClick_btnModify";
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
            return Events;
        })();
        SogoShokaiJutakuKaishuhiInfo.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Object.defineProperty(Controls, "MyType", {
                get: function () {
                    return "SogoShokaiJutakuKaishuhiInfo";
                },
                enumerable: true,
                configurable: true
            });

            Controls.prototype.SogoShokaiJutakuKaishuhiInfo = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.txtJutakuOwner = function () {
                return new UZA.TextBox(this.convFiledName("txtJutakuOwner"));
            };

            Controls.prototype.txtRelationWithHihokensha = function () {
                return new UZA.TextBox(this.convFiledName("txtRelationWithHihokensha"));
            };

            Controls.prototype.dgJutakuKaishuDetail = function () {
                return new UZA.DataGrid(this.convFiledName("dgJutakuKaishuDetail"));
            };

            Controls.prototype.JutakuKaishuDetail = function () {
                return new UZA.Panel(this.convFiledName("JutakuKaishuDetail"));
            };

            Controls.prototype.txtKaishuContents = function () {
                return new UZA.TextBoxMultiLine(this.convFiledName("txtKaishuContents"));
            };

            Controls.prototype.txtKaishuJigyoshaName = function () {
                return new UZA.TextBox(this.convFiledName("txtKaishuJigyoshaName"));
            };

            Controls.prototype.txtKaishuTaishoAddress1 = function () {
                return new UZA.TextBoxMultiLine(this.convFiledName("txtKaishuTaishoAddress1"));
            };

            Controls.prototype.txtChakkoDueDate = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtChakkoDueDate"));
            };

            Controls.prototype.txtKanseiDueDate = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKanseiDueDate"));
            };

            Controls.prototype.txtEstimatedAmount = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtEstimatedAmount"));
            };

            Controls.prototype.tblSeikyuSummary = function () {
                return new UZA.TablePanel(this.convFiledName("tblSeikyuSummary"));
            };

            Controls.prototype.cel11 = function () {
                return new UZA.TableCell(this.convFiledName("cel11"));
            };

            Controls.prototype.lblSummary = function () {
                return new UZA.Label(this.convFiledName("lblSummary"));
            };

            Controls.prototype.cel12 = function () {
                return new UZA.TableCell(this.convFiledName("cel12"));
            };

            Controls.prototype.lblHiyoTotal = function () {
                return new UZA.Label(this.convFiledName("lblHiyoTotal"));
            };

            Controls.prototype.cel13 = function () {
                return new UZA.TableCell(this.convFiledName("cel13"));
            };

            Controls.prototype.lblHokenTaishoHiyo = function () {
                return new UZA.Label(this.convFiledName("lblHokenTaishoHiyo"));
            };

            Controls.prototype.cel21 = function () {
                return new UZA.TableCell(this.convFiledName("cel21"));
            };

            Controls.prototype.lblSummaryMae = function () {
                return new UZA.Label(this.convFiledName("lblSummaryMae"));
            };

            Controls.prototype.cel22 = function () {
                return new UZA.TableCell(this.convFiledName("cel22"));
            };

            Controls.prototype.txtPayTotalMae = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtPayTotalMae"));
            };

            Controls.prototype.cel23 = function () {
                return new UZA.TableCell(this.convFiledName("cel23"));
            };

            Controls.prototype.txtHokenSeikyuAmountMae = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtHokenSeikyuAmountMae"));
            };

            Controls.prototype.cel31 = function () {
                return new UZA.TableCell(this.convFiledName("cel31"));
            };

            Controls.prototype.lblSummaryNow = function () {
                return new UZA.Label(this.convFiledName("lblSummaryNow"));
            };

            Controls.prototype.cel32 = function () {
                return new UZA.TableCell(this.convFiledName("cel32"));
            };

            Controls.prototype.txtPayTotalNow = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtPayTotalNow"));
            };

            Controls.prototype.cel33 = function () {
                return new UZA.TableCell(this.convFiledName("cel33"));
            };

            Controls.prototype.txtHokenSeikyuAmountNow = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtHokenSeikyuAmountNow"));
            };

            Controls.prototype.cel14 = function () {
                return new UZA.TableCell(this.convFiledName("cel14"));
            };

            Controls.prototype.lblHokenKyufuAmount = function () {
                return new UZA.Label(this.convFiledName("lblHokenKyufuAmount"));
            };

            Controls.prototype.cel15 = function () {
                return new UZA.TableCell(this.convFiledName("cel15"));
            };

            Controls.prototype.lblRiyoshaFutanAmount = function () {
                return new UZA.Label(this.convFiledName("lblRiyoshaFutanAmount"));
            };

            Controls.prototype.cel24 = function () {
                return new UZA.TableCell(this.convFiledName("cel24"));
            };

            Controls.prototype.txtRiyoshaFutanAmountMae = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtRiyoshaFutanAmountMae"));
            };

            Controls.prototype.cel25 = function () {
                return new UZA.TableCell(this.convFiledName("cel25"));
            };

            Controls.prototype.txtLimitOverAmountMae = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtLimitOverAmountMae"));
            };

            Controls.prototype.cel34 = function () {
                return new UZA.TableCell(this.convFiledName("cel34"));
            };

            Controls.prototype.txtRiyoshaFutanAmountNow = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtRiyoshaFutanAmountNow"));
            };

            Controls.prototype.cel35 = function () {
                return new UZA.TableCell(this.convFiledName("cel35"));
            };

            Controls.prototype.txtLimitOverAmountNow = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtLimitOverAmountNow"));
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
        SogoShokaiJutakuKaishuhiInfo.Controls = Controls;
    })(DBZ.SogoShokaiJutakuKaishuhiInfo || (DBZ.SogoShokaiJutakuKaishuhiInfo = {}));
    var SogoShokaiJutakuKaishuhiInfo = DBZ.SogoShokaiJutakuKaishuhiInfo;

    var SogoShokaiJutakuKaishuhiInfo_Design = (function (_super) {
        __extends(SogoShokaiJutakuKaishuhiInfo_Design, _super);
        function SogoShokaiJutakuKaishuhiInfo_Design($parentElement, isDesignMode, fieldName) {
            _super.call(this, $parentElement, isDesignMode, SogoShokaiJutakuKaishuhiInfo_Design.myLayout, fieldName);
        }
        SogoShokaiJutakuKaishuhiInfo_Design.prototype.registProperty = function () {
            _super.prototype.registProperty.call(this);
        };

        SogoShokaiJutakuKaishuhiInfo_Design.prototype.getEditablePropertyInfo = function () {
            var editablePropertyInfo = _super.prototype.getEditablePropertyInfo.call(this);

            return editablePropertyInfo;
        };
        SogoShokaiJutakuKaishuhiInfo_Design.myLayout = {
            "fieldName": "defaultLayout",
            "items": [
                {
                    "fieldName": "SogoShokaiJutakuKaishuhiInfo",
                    "items": [
                        {
                            "fieldName": "txtJutakuOwner",
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
                            "selectControlID": "txtJutakuOwner_core",
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
                            "labelLText": "住宅所有者",
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
                            "fieldName": "txtRelationWithHihokensha",
                            "items": [],
                            "controlType": "TextBox",
                            "width": "100",
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
                            "selectControlID": "txtRelationWithHihokensha_core",
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
                            "labelLText": "被保険者との関係",
                            "labelRText": "",
                            "labelLWidth": "135",
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
                            "fieldName": "dgJutakuKaishuDetail",
                            "items": [],
                            "controlType": "DataGrid",
                            "width": "450",
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
                            "selectControlID": "dgJutakuKaishuDetail",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "readOnly": false,
                            "height": "175",
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
                                    "headerHeight": 1
                                },
                                "columns": [
                                    {
                                        "columnName": "着工<br>予定日",
                                        "dataName": "txtChakkoDueDate",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 80,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0
                                        },
                                        "align": 1,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtChakkoDueDate"
                                    },
                                    {
                                        "columnName": "完成<br>予定日",
                                        "dataName": "txtKanseiDueDate",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 80,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0
                                        },
                                        "align": 1,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtKanseiDueDate"
                                    },
                                    {
                                        "columnName": "見積金額",
                                        "dataName": "txtMitsumoriAmount",
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
                                        "sortKey": "txtMitsumoriAmount"
                                    },
                                    {
                                        "columnName": "事業者",
                                        "dataName": "txtKaishuJigyosha",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0
                                        },
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtKaishuJigyosha"
                                    },
                                    {
                                        "columnName": "改修対象住所",
                                        "dataName": "txtKaishuTaishoAddress",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtKaishuTaishoAddress"
                                    },
                                    {
                                        "columnName": "改修内容",
                                        "dataName": "txtKaishuContents",
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
                                        "sortKey": "txtKaishuContents"
                                    }
                                ]
                            },
                            "onSort": "",
                            "onSelect": "",
                            "onSelectByDblClick": "onClick_btnModify",
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
                            "sortOrder": "txtKaishuJigyosha",
                            "isAscending": true,
                            "filterList": [],
                            "activeRowId": -1
                        },
                        {
                            "fieldName": "JutakuKaishuDetail",
                            "items": [
                                {
                                    "fieldName": "txtKaishuContents",
                                    "items": [],
                                    "controlType": "TextBoxMultiLine",
                                    "width": "280",
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
                                    "selectControlID": "txtKaishuContents_text_area",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": true,
                                    "height": "S",
                                    "required": false,
                                    "placeHolder": "",
                                    "isPrivateInfo": false,
                                    "onFocus": "",
                                    "onBlur": "",
                                    "onChange": "",
                                    "onKeyPress": "",
                                    "text": "",
                                    "labelLText": "改修の内容・<br>箇所及び規模",
                                    "labelRText": "",
                                    "labelLWidth": "100",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "value": "",
                                    "maxLength": 100000000,
                                    "minLength": 0,
                                    "textKind": 0,
                                    "limitLength": "",
                                    "countDisp": false
                                },
                                {
                                    "fieldName": "txtKaishuJigyoshaName",
                                    "items": [],
                                    "controlType": "TextBox",
                                    "width": "280",
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
                                    "selectControlID": "txtKaishuJigyoshaName_core",
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
                                    "labelLText": "事業者",
                                    "labelRText": "",
                                    "labelLWidth": "100",
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
                                    "fieldName": "txtKaishuTaishoAddress1",
                                    "items": [],
                                    "controlType": "TextBoxMultiLine",
                                    "width": "280",
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
                                    "selectControlID": "txtKaishuTaishoAddress1_text_area",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "readOnly": true,
                                    "height": "XS",
                                    "required": false,
                                    "placeHolder": "",
                                    "isPrivateInfo": false,
                                    "onFocus": "",
                                    "onBlur": "",
                                    "onChange": "",
                                    "onKeyPress": "",
                                    "text": "",
                                    "labelLText": "対象住宅住所",
                                    "labelRText": "",
                                    "labelLWidth": "100",
                                    "labelRWidth": "S",
                                    "labelLAlign": 2,
                                    "labelRAlign": 0,
                                    "value": "",
                                    "maxLength": 100000000,
                                    "minLength": 0,
                                    "textKind": 0,
                                    "limitLength": "",
                                    "countDisp": false
                                },
                                {
                                    "fieldName": "txtChakkoDueDate",
                                    "items": [],
                                    "controlType": "TextBoxDate",
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
                                    "selectControlID": "txtChakkoDueDate_core",
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
                                    "labelLText": "着工予定日",
                                    "labelRText": "",
                                    "labelLWidth": "100",
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
                                    "fieldName": "txtKanseiDueDate",
                                    "items": [],
                                    "controlType": "TextBoxDate",
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
                                    "selectControlID": "txtKanseiDueDate_core",
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
                                    "labelLText": "完成予定日",
                                    "labelRText": "",
                                    "labelLWidth": "85",
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
                                    "fieldName": "txtEstimatedAmount",
                                    "items": [],
                                    "controlType": "TextBoxNum",
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
                                    "selectControlID": "txtEstimatedAmount_core",
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
                                    "labelLText": "見積額",
                                    "labelRText": "",
                                    "labelLWidth": "100",
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
                                }
                            ],
                            "controlType": "Panel",
                            "width": "405",
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
                            "selectControlID": "JutakuKaishuDetail",
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
                                    "postParameterPanelNames": "JutakuKaishuDetail"
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
                            "fieldName": "tblSeikyuSummary",
                            "items": [
                                {
                                    "fieldName": "cel11",
                                    "items": [
                                        {
                                            "fieldName": "lblSummary",
                                            "items": [],
                                            "controlType": "Label",
                                            "width": "XS",
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
                                            "selectControlID": "lblSummary",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "集計",
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
                                    "selectControlID": "cel11",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R1C1"
                                },
                                {
                                    "fieldName": "cel12",
                                    "items": [
                                        {
                                            "fieldName": "lblHiyoTotal",
                                            "items": [],
                                            "controlType": "Label",
                                            "width": "115",
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
                                            "selectControlID": "lblHiyoTotal",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "費用額合計",
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
                                    "selectControlID": "cel12",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R1C2"
                                },
                                {
                                    "fieldName": "cel13",
                                    "items": [
                                        {
                                            "fieldName": "lblHokenTaishoHiyo",
                                            "items": [],
                                            "controlType": "Label",
                                            "width": "115",
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
                                            "selectControlID": "lblHokenTaishoHiyo",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "保険対象費用額",
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
                                    "selectControlID": "cel13",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R1C3"
                                },
                                {
                                    "fieldName": "cel21",
                                    "items": [
                                        {
                                            "fieldName": "lblSummaryMae",
                                            "items": [],
                                            "controlType": "Label",
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
                                            "selectControlID": "lblSummaryMae",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "前回までの支払結果",
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
                                    "selectControlID": "cel21",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R2C1"
                                },
                                {
                                    "fieldName": "cel22",
                                    "items": [
                                        {
                                            "fieldName": "txtPayTotalMae",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtPayTotalMae_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel22",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R2C2"
                                },
                                {
                                    "fieldName": "cel23",
                                    "items": [
                                        {
                                            "fieldName": "txtHokenSeikyuAmountMae",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtHokenSeikyuAmountMae_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel23",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R2C3"
                                },
                                {
                                    "fieldName": "cel31",
                                    "items": [
                                        {
                                            "fieldName": "lblSummaryNow",
                                            "items": [],
                                            "controlType": "Label",
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
                                            "selectControlID": "lblSummaryNow",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "今回の支払状況",
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
                                    "selectControlID": "cel31",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R3C1"
                                },
                                {
                                    "fieldName": "cel32",
                                    "items": [
                                        {
                                            "fieldName": "txtPayTotalNow",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtPayTotalNow_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel32",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R3C2"
                                },
                                {
                                    "fieldName": "cel33",
                                    "items": [
                                        {
                                            "fieldName": "txtHokenSeikyuAmountNow",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtHokenSeikyuAmountNow_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel33",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R3C3"
                                },
                                {
                                    "fieldName": "cel14",
                                    "items": [
                                        {
                                            "fieldName": "lblHokenKyufuAmount",
                                            "items": [],
                                            "controlType": "Label",
                                            "width": "115",
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
                                            "selectControlID": "lblHokenKyufuAmount",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "保険給付額",
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
                                    "selectControlID": "cel14",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R1C4"
                                },
                                {
                                    "fieldName": "cel15",
                                    "items": [
                                        {
                                            "fieldName": "lblRiyoshaFutanAmount",
                                            "items": [],
                                            "controlType": "Label",
                                            "width": "115",
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
                                            "selectControlID": "lblRiyoshaFutanAmount",
                                            "helpMessageID": "",
                                            "jpControlName": "",
                                            "required": false,
                                            "isPrivateInfo": false,
                                            "text": "利用者負担額",
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
                                    "selectControlID": "cel15",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R1C5"
                                },
                                {
                                    "fieldName": "cel24",
                                    "items": [
                                        {
                                            "fieldName": "txtRiyoshaFutanAmountMae",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtRiyoshaFutanAmountMae_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel24",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R2C4"
                                },
                                {
                                    "fieldName": "cel25",
                                    "items": [
                                        {
                                            "fieldName": "txtLimitOverAmountMae",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtLimitOverAmountMae_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel25",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R2C5"
                                },
                                {
                                    "fieldName": "cel34",
                                    "items": [
                                        {
                                            "fieldName": "txtRiyoshaFutanAmountNow",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtRiyoshaFutanAmountNow_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel34",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R3C4"
                                },
                                {
                                    "fieldName": "cel35",
                                    "items": [
                                        {
                                            "fieldName": "txtLimitOverAmountNow",
                                            "items": [],
                                            "controlType": "TextBoxNum",
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
                                            "selectControlID": "txtLimitOverAmountNow_core",
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
                                            "labelLWidth": "90",
                                            "labelRWidth": "15",
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
                                    "selectControlID": "cel35",
                                    "helpMessageID": "",
                                    "jpControlName": "",
                                    "connectTd": "R3C5"
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
                            "selectControlID": "tblSeikyuSummary",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "html": "<table border='1'>\n  <tbody>\n    <tr><td id='R1C1' bgcolor=\"#d7ebf6\"></td><td id='R1C2' bgcolor=\"#d7ebf6\"></td><td id='R1C3' bgcolor=\"#d7ebf6\"></td><td id='R1C4' bgcolor=\"#d7ebf6\"></td><td id='R1C5' bgcolor=\"#d7ebf6\"></td></tr>\n    <tr><td id='R2C1' bgcolor=\"#d7ebf6\"></td><td id='R2C2'></td><td id='R2C3'></td><td id='R2C4'></td><td id='R2C5'></td></tr>\n    <tr><td id='R3C1' bgcolor=\"#d7ebf6\"></td><td id='R3C2'></td><td id='R3C3'></td><td id='R3C4'></td><td id='R3C5'></td></tr>\n  </tbody>\n</table>\n"
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
                            "float": 2,
                            "toolTip": "",
                            "authorityMode": 0,
                            "marginLeft": "XS",
                            "marginRight": "XS",
                            "selectControlID": "btnClose",
                            "helpMessageID": "",
                            "jpControlName": "",
                            "text": "閉じる",
                            "onClick": "onClick_btnClose",
                            "appearance": 0,
                            "imageFileUrl": "",
                            "imageWidth": "",
                            "imageHeight": "",
                            "icon": 0,
                            "heightTextBoxMatches": false
                        }
                    ],
                    "controlType": "Panel",
                    "width": "G2",
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
                    "selectControlID": "SogoShokaiJutakuKaishuhiInfo",
                    "helpMessageID": "",
                    "jpControlName": "",
                    "onLoad": "",
                    "title": "住宅改修費情報",
                    "marginTop": "Default",
                    "marginBottom": "Default",
                    "isOpen": true,
                    "canOpenAndClose": true,
                    "postParameterPanelNames": [
                        {
                            "postParameterPanelNames": "SogoShokaiJutakuKaishuhiInfo"
                        }
                    ],
                    "requestSettings": [
                        {
                            "eventName": "onLoad",
                            "requestUrl": "dbu/db/dbu/SogoShokaiInfo/onLoad_JutakuKaishuhiInfo"
                        }
                    ],
                    "hiddenInput": [],
                    "onOpen": "",
                    "onClose": "",
                    "session": {},
                    "eraseBorder": false,
                    "backgroundColor": 0,
                    "widthAuto": true,
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
            "controlName": "SogoShokaiJutakuKaishuhiInfo",
            "marginTop": 0,
            "marginBottom": 0,
            "originalProperty": [],
            "dataPassingForDialog": [],
            "dialogOkEventNameForDialog": "",
            "dialogCancelEventNameForDialog": "onClick_btnClose",
            "canTransferEvent": true,
            "heightForDialog": "Auto"
        };
        return SogoShokaiJutakuKaishuhiInfo_Design;
    })(Uz.CommonChildDiv);
    DBZ.SogoShokaiJutakuKaishuhiInfo_Design = SogoShokaiJutakuKaishuhiInfo_Design;
})(DBZ || (DBZ = {}));
