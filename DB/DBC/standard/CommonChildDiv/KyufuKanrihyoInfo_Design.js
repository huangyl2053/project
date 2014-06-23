var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var DBC;
(function (DBC) {
    var KyufuKanrihyoInfo_Design = (function (_super) {
        __extends(KyufuKanrihyoInfo_Design, _super);
        function KyufuKanrihyoInfo_Design($parentElement, isDesignMode, fieldName) {
            _super.call(this, $parentElement, isDesignMode, KyufuKanrihyoInfo_Design.myLayout, fieldName);
        }
        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ZengetsuNissuVisible", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["visible"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"])["visible"] = value;
                } else {
                    this.layout.items[0].items[2]["visible"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ShikyuGendogakuIsComma", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"])["isComma"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"])["isComma"] = value;
                } else {
                    this.layout.items[0].items[6]["isComma"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "GokeiTanisuLabelLText", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["labelLText"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["labelLText"] = value;
                } else {
                    this.layout.items[0].items[10]["labelLText"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "GokeiTanisuIsComma", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["isComma"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"])["isComma"] = value;
                } else {
                    this.layout.items[0].items[10]["isComma"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "TantoSenmonNoVisible", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"])["visible"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"])["visible"] = value;
                } else {
                    this.layout.items[0].items[12]["visible"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "TantoSenmonNoDisplayNone", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"])["displayNone"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"])["displayNone"] = value;
                } else {
                    this.layout.items[0].items[12]["displayNone"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuJigyoshaNoVisible", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"])["visible"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"])["visible"] = value;
                } else {
                    this.layout.items[0].items[13]["visible"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuJigyoshaNoDisplayNode", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"])["displayNone"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"])["displayNone"] = value;
                } else {
                    this.layout.items[0].items[13]["displayNone"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuJigyoshaNameVisible", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"])["visible"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"])["visible"] = value;
                } else {
                    this.layout.items[0].items[14]["visible"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuJigyoshaNameDisplayNode", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"])["displayNone"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"])["displayNone"] = value;
                } else {
                    this.layout.items[0].items[14]["displayNone"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuSenmonNoVisible", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"])["visible"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"])["visible"] = value;
                } else {
                    this.layout.items[0].items[15]["visible"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "ItakuSenmonNoDisplayNone", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"])["displayNone"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"])["displayNone"] = value;
                } else {
                    this.layout.items[0].items[15]["displayNone"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "MeisaiListGridSetting", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"])["gridSetting"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"])["gridSetting"] = value;
                } else {
                    this.layout.items[0].items[11]["gridSetting"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        Object.defineProperty(KyufuKanrihyoInfo_Design.prototype, "MeisaiListHeight", {
            get: function () {
                return Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"])["height"];
            },
            set: function (value) {
                if ($("#" + this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]).length > 0 && Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]) != undefined) {
                    Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"])["height"] = value;
                } else {
                    this.layout.items[0].items[11]["height"] = value;
                    this.raisePropertyChanged(this.layout);
                }
            },
            enumerable: true,
            configurable: true
        });


        KyufuKanrihyoInfo_Design.prototype.registProperty = function () {
            _super.prototype.registProperty.call(this);
            Uz.JSControlUtil.registProperty("ZengetsuNissuVisible");
            Uz.JSControlUtil.registProperty("ShikyuGendogakuIsComma");
            Uz.JSControlUtil.registProperty("GokeiTanisuLabelLText");
            Uz.JSControlUtil.registProperty("GokeiTanisuIsComma");
            Uz.JSControlUtil.registProperty("TantoSenmonNoVisible");
            Uz.JSControlUtil.registProperty("TantoSenmonNoDisplayNone");
            Uz.JSControlUtil.registProperty("ItakuJigyoshaNoVisible");
            Uz.JSControlUtil.registProperty("ItakuJigyoshaNoDisplayNode");
            Uz.JSControlUtil.registProperty("ItakuJigyoshaNameVisible");
            Uz.JSControlUtil.registProperty("ItakuJigyoshaNameDisplayNode");
            Uz.JSControlUtil.registProperty("ItakuSenmonNoVisible");
            Uz.JSControlUtil.registProperty("ItakuSenmonNoDisplayNone");
            Uz.JSControlUtil.registProperty("MeisaiListGridSetting");
            Uz.JSControlUtil.registProperty("MeisaiListHeight");
        };

        KyufuKanrihyoInfo_Design.prototype.getEditablePropertyInfo = function () {
            var editablePropertyInfo = _super.prototype.getEditablePropertyInfo.call(this);
            editablePropertyInfo["ZengetsuNissuVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[2]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["ShikyuGendogakuIsComma"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[6]["fieldName"]).getEditablePropertyInfo()["isComma"];
            editablePropertyInfo["GokeiTanisuLabelLText"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).getEditablePropertyInfo()["labelLText"];
            editablePropertyInfo["GokeiTanisuIsComma"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[10]["fieldName"]).getEditablePropertyInfo()["isComma"];
            editablePropertyInfo["TantoSenmonNoVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["TantoSenmonNoDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[12]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["ItakuJigyoshaNoVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["ItakuJigyoshaNoDisplayNode"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[13]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["ItakuJigyoshaNameVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["ItakuJigyoshaNameDisplayNode"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[14]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["ItakuSenmonNoVisible"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]).getEditablePropertyInfo()["visible"];
            editablePropertyInfo["ItakuSenmonNoDisplayNone"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[15]["fieldName"]).getEditablePropertyInfo()["displayNone"];
            editablePropertyInfo["MeisaiListGridSetting"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]).getEditablePropertyInfo()["gridSetting"];
            editablePropertyInfo["MeisaiListHeight"] = Uz.JSControlUtil.getJSControl(this.fieldName + "_" + this.layout.items[0]["fieldName"] + "_" + this.layout.items[0].items[11]["fieldName"]).getEditablePropertyInfo()["height"];

            return editablePropertyInfo;
        };
        KyufuKanrihyoInfo_Design.myLayout = {
            "fieldName": "defaultLayout",
            "items": [
                {
                    "fieldName": "KyufuKanrihyoInfo",
                    "items": [
                        {
                            "fieldName": "txtSakuseiKubun",
                            "items": [],
                            "controlType": "TextBox",
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
                            "required": false,
                            "maxLength": 1000000000000,
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
                            "labelLText": "作成区分",
                            "labelRText": "",
                            "labelLWidth": "140",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": ""
                        },
                        {
                            "fieldName": "txtSakuseiYMD",
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
                            "labelLText": "作成日",
                            "labelRText": "",
                            "labelLWidth": "110",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "ymdKubun": 2,
                            "displayFormat": 0,
                            "permitCharactor": "./_-"
                        },
                        {
                            "fieldName": "txtZengetsuNissu",
                            "items": [],
                            "controlType": "TextBoxNum",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 2,
                            "readOnly": true,
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
                            "labelLText": "前月までの給付計画日数",
                            "labelRText": "",
                            "labelLWidth": "170",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "maxValue": 1.7976931348623157e+308,
                            "minValue": 0,
                            "isCurrency": false,
                            "isComma": false,
                            "decimalPointLength": 0,
                            "permitCharactor": "+-,.\\"
                        },
                        {
                            "fieldName": "txtKeikakuSakuseiKubun",
                            "items": [],
                            "controlType": "TextBox",
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
                            "required": false,
                            "maxLength": 1000000000000,
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
                            "labelLText": "計画作成区分",
                            "labelRText": "",
                            "labelLWidth": "140",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": ""
                        },
                        {
                            "fieldName": "txtShienJigyoshaNo",
                            "items": [],
                            "controlType": "TextBoxCode",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 0,
                            "readOnly": true,
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
                            "labelLText": "支援事業者",
                            "labelRText": "",
                            "labelLWidth": "110",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": "",
                            "formatLength": "10"
                        },
                        {
                            "fieldName": "txtShienJigyoshaName",
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
                            "required": false,
                            "maxLength": 1000000000000,
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
                            "labelLText": "",
                            "labelRText": "",
                            "labelLWidth": "S",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": ""
                        },
                        {
                            "fieldName": "txtShikyuGendogaku",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 2,
                            "readOnly": true,
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
                            "labelLText": "支給限度額",
                            "labelRText": "",
                            "labelLWidth": "140",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "maxValue": 1.7976931348623157e+308,
                            "minValue": 0,
                            "isCurrency": false,
                            "isComma": true,
                            "decimalPointLength": 0,
                            "permitCharactor": "+-,.\\"
                        },
                        {
                            "fieldName": "txtGendogakuTekiyoKikan",
                            "items": [],
                            "controlType": "TextBoxDateRange",
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
                            "readOnly": true,
                            "isPrivateInfo": false,
                            "isPassword": false,
                            "onFocus": "",
                            "onBlur": "",
                            "onChange": "",
                            "onKeyPress": "",
                            "labelLText": "限度額適用期間",
                            "labelRText": "",
                            "labelLWidth": "110",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "ymdKubun": 1,
                            "displayFormat": 0,
                            "permitCharactor": "",
                            "fromPlaceHolder": "",
                            "toPlaceHolder": "",
                            "minDate": "",
                            "maxDate": "",
                            "fromText": "",
                            "toText": "",
                            "fromValue": "",
                            "toValue": ""
                        },
                        {
                            "fieldName": "txtShiteiServiceShokei",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 2,
                            "readOnly": true,
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
                            "labelLText": "指定サービス分小計",
                            "labelRText": "",
                            "labelLWidth": "140",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "maxValue": 1.7976931348623157e+308,
                            "minValue": 0,
                            "isCurrency": false,
                            "isComma": true,
                            "decimalPointLength": 0,
                            "permitCharactor": "+-,.\\"
                        },
                        {
                            "fieldName": "txtKijunServiceShokei",
                            "items": [],
                            "controlType": "TextBoxNum",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 2,
                            "readOnly": true,
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
                            "labelLText": "基準該当等サービス分小計",
                            "labelRText": "",
                            "labelLWidth": "180",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "maxValue": 1.7976931348623157e+308,
                            "minValue": 0,
                            "isCurrency": false,
                            "isComma": true,
                            "decimalPointLength": 0,
                            "permitCharactor": "+-,.\\"
                        },
                        {
                            "fieldName": "txtGokeiTanisu",
                            "items": [],
                            "controlType": "TextBoxNum",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 2,
                            "readOnly": true,
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
                            "labelLText": "給付計画合計単位数",
                            "labelRText": "",
                            "labelLWidth": "140",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "maxValue": 1.7976931348623157e+308,
                            "minValue": 0,
                            "isCurrency": false,
                            "isComma": true,
                            "decimalPointLength": 0,
                            "permitCharactor": "+-,.\\"
                        },
                        {
                            "fieldName": "dgMeisaiList",
                            "items": [],
                            "controlType": "DataGrid",
                            "width": "1200",
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
                                "isShowRowState": false,
                                "header": {
                                    "combineColumns": [],
                                    "frozenColumn": "",
                                    "headerHeight": 0
                                },
                                "columns": [
                                    {
                                        "columnName": "明細",
                                        "dataName": "txtNo",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 60,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 1,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtNo"
                                    },
                                    {
                                        "columnName": "サービス種類",
                                        "dataName": "txtServiceShurui",
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
                                        "sortKey": "txtServiceShurui"
                                    },
                                    {
                                        "columnName": "計画単位数",
                                        "dataName": "txtTanisu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 110,
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
                                        "columnName": "サービス事業者",
                                        "dataName": "txtJigyosha",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 500,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": {
                                            "cellType": 0
                                        },
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": "txtJigyosha"
                                    },
                                    {
                                        "columnName": "事業者区分",
                                        "dataName": "txtJigyoshaKubun",
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
                                        "sortKey": "txtJigyoshaKubun"
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
                        },
                        {
                            "fieldName": "txtTantoSenmonNo",
                            "items": [],
                            "controlType": "TextBoxCode",
                            "width": "65",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 0,
                            "readOnly": true,
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
                            "labelLText": "担当介護支援専門員番号",
                            "labelRText": "",
                            "labelLWidth": "220",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": "",
                            "formatLength": "8"
                        },
                        {
                            "fieldName": "txtItakuJigyoshaNo",
                            "items": [],
                            "controlType": "TextBoxCode",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 0,
                            "readOnly": true,
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
                            "labelLText": "委託先の居宅介護支援事業者",
                            "labelRText": "",
                            "labelLWidth": "220",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": "",
                            "formatLength": "10"
                        },
                        {
                            "fieldName": "txtItakuJigyoshaName",
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
                            "required": false,
                            "maxLength": 1000000000000,
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
                            "labelLText": "",
                            "labelRText": "",
                            "labelLWidth": "S",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": ""
                        },
                        {
                            "fieldName": "txtItakuSenmonNo",
                            "items": [],
                            "controlType": "TextBoxCode",
                            "width": "65",
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
                            "required": false,
                            "maxLength": 1000000000000,
                            "minLength": 0,
                            "textAlign": 0,
                            "readOnly": true,
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
                            "labelLText": "委託先の居宅介護支援専門員番号",
                            "labelRText": "",
                            "labelLWidth": "220",
                            "labelRWidth": "S",
                            "labelLAlign": 2,
                            "labelRAlign": 0,
                            "permitCharactor": "",
                            "formatLength": "8"
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
                    "title": "",
                    "marginTop": "Default",
                    "marginBottom": "Default",
                    "isOpen": true,
                    "canOpenAndClose": true,
                    "postParameterPanelNames": [
                        {
                            "postParameterPanelNames": "KyufuKanrihyoInfo"
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
            "controlName": "KyufuKanrihyoInfo",
            "marginTop": 0,
            "marginBottom": 0,
            "originalProperty": [
                {
                    "publicChildFieldName": "txtZengetsuNissu",
                    "publicChildProperty": "visible",
                    "newPropertyName": "ZengetsuNissuVisible"
                },
                {
                    "publicChildFieldName": "txtShikyuGendogaku",
                    "publicChildProperty": "isComma",
                    "newPropertyName": "ShikyuGendogakuIsComma"
                },
                {
                    "publicChildFieldName": "txtGokeiTanisu",
                    "publicChildProperty": "labelLText",
                    "newPropertyName": "GokeiTanisuLabelLText"
                },
                {
                    "publicChildFieldName": "txtGokeiTanisu",
                    "publicChildProperty": "isComma",
                    "newPropertyName": "GokeiTanisuIsComma"
                },
                {
                    "publicChildFieldName": "txtTantoSenmonNo",
                    "publicChildProperty": "visible",
                    "newPropertyName": "TantoSenmonNoVisible"
                },
                {
                    "publicChildFieldName": "txtTantoSenmonNo",
                    "publicChildProperty": "displayNone",
                    "newPropertyName": "TantoSenmonNoDisplayNone"
                },
                {
                    "publicChildFieldName": "txtItakuJigyoshaNo",
                    "publicChildProperty": "visible",
                    "newPropertyName": "ItakuJigyoshaNoVisible"
                },
                {
                    "publicChildFieldName": "txtItakuJigyoshaNo",
                    "publicChildProperty": "displayNone",
                    "newPropertyName": "ItakuJigyoshaNoDisplayNode"
                },
                {
                    "publicChildFieldName": "txtItakuJigyoshaName",
                    "publicChildProperty": "visible",
                    "newPropertyName": "ItakuJigyoshaNameVisible"
                },
                {
                    "publicChildFieldName": "txtItakuJigyoshaName",
                    "publicChildProperty": "displayNone",
                    "newPropertyName": "ItakuJigyoshaNameDisplayNode"
                },
                {
                    "publicChildFieldName": "txtItakuSenmonNo",
                    "publicChildProperty": "visible",
                    "newPropertyName": "ItakuSenmonNoVisible"
                },
                {
                    "publicChildFieldName": "txtItakuSenmonNo",
                    "publicChildProperty": "displayNone",
                    "newPropertyName": "ItakuSenmonNoDisplayNone"
                },
                {
                    "publicChildFieldName": "dgMeisaiList",
                    "publicChildProperty": "gridSetting",
                    "newPropertyName": "MeisaiListGridSetting"
                },
                {
                    "publicChildFieldName": "dgMeisaiList",
                    "publicChildProperty": "height",
                    "newPropertyName": "MeisaiListHeight"
                }
            ],
            "dataPassingForDialog": [],
            "dialogOkEventNameForDialog": "",
            "dialogCancelEventNameForDialog": ""
        };
        return KyufuKanrihyoInfo_Design;
    })(Uz.CommonChildDiv);
    DBC.KyufuKanrihyoInfo_Design = KyufuKanrihyoInfo_Design;
})(DBC || (DBC = {}));