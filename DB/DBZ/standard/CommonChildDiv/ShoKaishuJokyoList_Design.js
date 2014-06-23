var __extends = this.__extends || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    __.prototype = b.prototype;
    d.prototype = new __();
};
var DBZ;
(function (DBZ) {
    var ShoKaishuJokyoList_Design = (function (_super) {
        __extends(ShoKaishuJokyoList_Design, _super);
        function ShoKaishuJokyoList_Design($parentElement, isDesignMode, fieldName) {
            _super.call(this, $parentElement, isDesignMode, ShoKaishuJokyoList_Design.myLayout, fieldName);
        }
        ShoKaishuJokyoList_Design.prototype.registProperty = function () {
            _super.prototype.registProperty.call(this);
        };

        ShoKaishuJokyoList_Design.prototype.getEditablePropertyInfo = function () {
            var editablePropertyInfo = _super.prototype.getEditablePropertyInfo.call(this);

            return editablePropertyInfo;
        };
        ShoKaishuJokyoList_Design.myLayout = {
            "fieldName": "defaultLayout",
            "items": [
                {
                    "fieldName": "ShoKaishuJokyoList",
                    "items": [
                        {
                            "fieldName": "dgShoKaishuJokyo",
                            "items": [],
                            "controlType": "DataGrid",
                            "width": "930",
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
                                        "width": 20,
                                        "visible": true,
                                        "cellType": 8,
                                        "cellDetails": {
                                            "cellType": 8,
                                            "text": "",
                                            "onClick": "onClick_btnSelect",
                                            "imageFileUrl": "/uz/uza/css/Edit.png",
                                            "imageWidth": "15",
                                            "imageHeight": "15"
                                        },
                                        "align": 1,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": ""
                                    },
                                    {
                                        "columnName": "交付証種類",
                                        "dataName": "kofushoShurui",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 180,
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
                                        "columnName": "交付日",
                                        "dataName": "kofuDate",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 90,
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
                                        "sortKey": ""
                                    },
                                    {
                                        "columnName": "交付事由",
                                        "dataName": "kofuJiyu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": ""
                                    },
                                    {
                                        "columnName": "回収日",
                                        "dataName": "kaishuDate",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 90,
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
                                        "sortKey": ""
                                    },
                                    {
                                        "columnName": "回収事由",
                                        "dataName": "kaishuJiyu",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 200,
                                        "visible": true,
                                        "cellType": 0,
                                        "cellDetails": null,
                                        "align": 0,
                                        "resize": true,
                                        "isPrivateInfo": false,
                                        "sortKey": ""
                                    },
                                    {
                                        "columnName": "有効期限",
                                        "dataName": "yukoKigen",
                                        "toolTip": "",
                                        "bgColor": 0,
                                        "width": 90,
                                        "visible": true,
                                        "cellType": 7,
                                        "cellDetails": {
                                            "cellType": 7,
                                            "ymdKubun": 2,
                                            "displayFormat": 0,
                                            "onChange": ""
                                        },
                                        "align": 1,
                                        "resize": false,
                                        "isPrivateInfo": false,
                                        "sortKey": ""
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
                            "dataSource": [],
                            "sortOrder": "kaishuDate",
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
                            "postParameterPanelNames": "ShoKaishuJokyoList"
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
                    "widthAuto": false,
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
            "controlName": "ShoKaishuJokyoList",
            "marginTop": 0,
            "marginBottom": 0,
            "originalProperty": [],
            "dataPassingForDialog": [],
            "dialogOkEventNameForDialog": "",
            "dialogCancelEventNameForDialog": ""
        };
        return ShoKaishuJokyoList_Design;
    })(Uz.CommonChildDiv);
    DBZ.ShoKaishuJokyoList_Design = ShoKaishuJokyoList_Design;
})(DBZ || (DBZ = {}));