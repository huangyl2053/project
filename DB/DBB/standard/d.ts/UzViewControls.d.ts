﻿declare module Uz {
    enum _ViewControlType {
        TextBox,
        TextBoxMultiLine,
        TextBoxCode,
        TextBoxNum,
        TextBoxDate,
        TextBoxDateRange,
        TextBoxFlexibleDate,
        TextBoxDateRangeSlider,
        TextBoxYubinNo,
        TextBoxTime,
        TextBoxKana,
        Button,
        ButtonPublish,
        ButtonReportCommon,
        ButtonPreview,
        ButtonPrint,
        ButtonPrinter,
        ButtonReportPublish,
        ButtonSubmit,
        ButtonDownLoad,
        ButtonDialog,
        DropDownList,
        CheckBoxList,
        RadioButton,
        SortableList,
        ControlRepeater,
        TabContainer,
        TabPanel,
        DataGrid,
        Label,
        UploadPanel,
        StaticImage,
        DynamicImage,
        TreeView,
        Panel,
        PanelPublish,
        TablePanel,
        TableCell,
        CompositeControl,
        CommonChildDiv,
        TextBoxKatagaki,
        TextBoxKatagakiCode,
        TextBoxTelNo,
        TextBoxMailAddress,
        TextBoxAtenaMeisho,
        TextBoxAtenaKanaMeisho,
        TextBoxJusho,
        TextBoxBanchi,
        TextBoxShikibetsuCode,
        TextBoxZenkokuJushoCode,
        TextBoxBanchiCode,
        TextBoxChoikiCode,
        TextBoxGyoseikuCode,
        TextBoxChikuCode,
        TextBoxTohyokuCode,
        TextBoxKamokuCode,
        TextBoxEdabanCode,
        TextBoxKinyuKikanCode,
        TextBoxKinyuKikanShitenCode,
        TextBoxTsuzukigaraCode,
        TextBoxSetaiCode,
        TextBoxDomainCode,
        TextBoxShogakkokuCode,
        TextBoxChugakkokuCode,
        TextBoxYear,
        TextBoxYearMonth,
        TextBoxYearMonthDay,
        Icon,
    }
}
declare module Uz {
    enum PropertyEditType {
        text,
        select,
        checkbox,
        button,
    }
    class JSControlUtil {
        private static _properties;
        static getProperties(): any[];
        static registProperty(value: any): void;
        static getJSONInfo(control): {};
        static getTextBoxTypeEditableProperty(value: string, enabled?: boolean): {};
        static getSelectTypeEditableProperty(selectedValue: string, eNum: any): {};
        static getSelectTypeEditablePropertyForDynamicData(selectedValue: string, data: string[]): {};
        static getComboboxTypeEditableProperty(selectedValue: string, eNum: any, enabled?: boolean): {};
        static getCheckBoxTypeEditableProperty(value: boolean, enabled?: boolean): {};
        static getButtonTypeEditableProperty(buttonText: string, callBackFunction: Function): {};
        static getGridTypeEditableProperty(columnInfos: any[], rowData: any[]): {};
        static getPropertyColumnInfo(name: string, editType: PropertyEditType, editOptions?: any, width?: number, editable?: boolean, frozen?: boolean, defaultVal?: any): {};
        private static getDefaultValString(editType, editOptions, defaultVal);
        static getUniqueId(): string;
        static removeControl(parentControl: Uz._JSControl, targetFieldName: string): void;
        static removeControlAll(jsControl: Uz._JSControl): void;
        static getJSControlParent(ancestorControl: Uz._JSControl, fieldName: string): Uz._JSControl;
        static getJSControl(fieldName: string): Uz._JSControl;
        static setJSControl(element: Element, jsControl: Uz._JSControl): void;
        static removeLinkedData(element: Element): void;
        static getJSControlForType(ancestorControl: Uz._JSControl, controlType: string): Uz._JSControl[];
        static getTargetControlItemsIndex(parentControl: Uz._JSControl, targetControlFieldName: string);
        static getCompositeRoot(control: Uz._JSControl): Uz._JSControl;
        static isPropertyPublishing(compositeControl: any, controlName: string, propertyName: string): boolean;
        static getDomIdFromCompositeFieldName(rootControl: any, fieldName: string): string;
        private static appendCompositeDomID(currentControl, fieldName, domId);
        static getCompositeFieldNameFromDomId(domId: string): string;
        private static searchFieldNameFromDomId(currentLayout, parentId, searchFileName);
    }
}
declare module Uz {
    enum TextBoxValidationTypeInDesign {
        Required,
        MaxLength,
        MinLength,
        MaxNumber,
        MinNumber,
        Regex,
        Overlap,
    }
    class ValidationTextBoxInDesign {
        public validateTextBox(propertyName: string, propertyValue: string, rule: any, JSONTextArea: string, changedJSON: boolean, propertyValueOnJson: string): string[];
        private createRequiredErrorMessage(rule, propertyName, propertyValue);
        private createMaxLengthErrorMessage(rule, propertyName, propertyValue);
        private createMinLengthErrorMessage(rule, propertyName, propertyValue);
        private createMaxNumberErrorMessage(rule, propertyName, propertyValue);
        private createMinNumberErrorMessage(rule, propertyName, propertyValue);
        private createRegexErrorMessage(rule, propertyName, propertyValue);
        private createOverlapErrorMessage(rule, propertyName, propertyValue, JSONTextArea, changedJSON, propertyValueOnJson);
        private pushErrorMessage(errorMessage, errorMessageArray);
    }
}
declare module Uz {
    interface _IJSControlsInDesign {
        getEditablePropertyInfo(): any;
        registProperty(): void;
    }
    class _JSControl implements _IJSControlsInDesign {
        private _fieldName;
        private _items;
        private _controlType;
        private _rules;
        public fieldName : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public items : _JSControl[];
        public controlType : any;
        public rules : Object;
        constructor();
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public validateControl(): any;
    }
}
declare module Uz {
    enum Size {
        XS,
        S,
        M,
        L,
        XL,
    }
    enum SizeOfSML {
        S,
        M,
        L,
    }
    enum SizeForGridHeight {
        XS,
        S,
        M,
        L,
        XL,
        Auto,
    }
    enum SizeForPanel {
        XS,
        S,
        M,
        L,
        XL,
        Default,
    }
    enum LumpSizeForContorol {
        S,
        M,
        L,
    }
    enum LumpSizeForPanel {
        S,
        M,
        L,
    }
    enum Align {
        left,
        center,
        right,
    }
    enum Expression {
        isEmpty,
        isNotEmpty,
        isSelected,
        isNotSelected,
    }
    enum Constraint {
        required,
        disabled,
        inVisible,
        moreThan,
        lessThan,
    }
    enum Float {
        left,
        center,
        right,
    }
    enum DataIO {
        input,
        output,
        input_output,
    }
    enum ImeMode {
        Hiragana,
        Alpha,
        Off,
        Katakana,
        KatakanaHalf,
    }
    enum TextKind {
        "All",
        "半角文字すべて",
        "英数字のみ",
        "カナすべて(全半角)",
        "半角カナ",
    }
    enum TimeKubun {
        "時",
        "時分",
        "時分秒",
    }
    enum DisplayFormat {
        "12hh:mm",
        "24hh:mm",
        "12hh時mm分",
        "24hh時mm分",
        "午前hh時mm分",
        "AMhh:mm",
    }
    enum IconType {
        File,
        Data,
    }
    enum YmdKubun {
        "年",
        "年月",
        "年月日",
        "月日",
    }
    enum DisplayDateFormat {
        "平YYMMDD",
        "HYYMMDD",
        "NYYMMDD",
        "平成YY年MM月DD日",
        "YYYY年M月D日",
        "YYYYMMDD",
    }
    enum AuthorityMode {
        ALL_PERMISSION,
        READ_ONLY,
        MASK,
        HIDDEN,
        NONE,
    }
    enum Color {
        Default,
        Alert,
        Error,
        Information,
        Success,
    }
    enum KanaType {
        "全角カナ",
        "半角カナ",
        "全角かな",
    }
    enum Icon {
        Info,
        Question,
        Warning,
        Error,
    }
    enum Appearance {
        Default,
        Image,
    }
}
declare module Uz {
    class GyomuJSHelper {
        static gyomuOriginalEventList: any[];
        static registOriginalEvent(eventName: string, callBackFunction: Function): void;
        static transitionEventFire(eventName: string): void;
        static isDesignMode(): boolean;
        static getJSControl(fieldName: string): Uz._JSControl;
        static getCompositeChildControl(compositeControlFieldName: string, compositeControlName: string, childControlFieldName: string): Uz._JSControl;
    }
}
declare module Uz {
    class _ViewControl extends Uz._JSControl {
        private _width;
        private _visible;
        private _displayNone;
        private _disabled;
        private _parentDisabled;
        private _accessKey;
        private _nextFocusFiledName;
        private _wrap;
        private _dependencies;
        private _float;
        private _toolTip;
        private _authorityMode;
        private _marginLeft;
        private _marginRight;
        private static DEFAULT_SELECTEDSOURCELISTSORTBUTTON_ID;
        private static DEFAULT_TABPANEL_ID;
        public _isDesignMode: boolean;
        public width : any;
        public changeWidth(): void;
        public changeWidthParameter(oldWidth, newWidth): void;
        public bindWidth(value): void;
        public visible : boolean;
        public displayNone : boolean;
        private addDisplayRelatedClass();
        public disabled : boolean;
        public parentDisabled : boolean;
        public accessKey : string;
        public nextFocusFieldName : string;
        public wrap : boolean;
        public wrapChanged(beforeValue, afterValue): void;
        public dependencies : Dependency[];
        public float : Uz.Float;
        public toolTip : string;
        public authorityMode : Uz.AuthorityMode;
        public marginLeft : any;
        public marginRight : any;
        private checkValidMarginLeftRight();
        private setMarginLeftRight();
        private setDisabledMargin(isDisabled);
        public setDisabledWidthAuto(isDisabled: boolean): void;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private changeFieldName(beforeFieldName, newFieldName);
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public initToolTip(element: HTMLElement): void;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private createComboboxTypeDisabledProperty(editablePropertyInfo, keyName, selectedValue, eNum, enabled?);
        static createViewControl(controlType: Uz._ViewControlType, $parentElement: JQuery, isDesignMode: boolean): Uz._JSControl;
        private static isUzControl(controlTypeName);
        public moveNextField(element: HTMLElement): void;
        private isNextField(element);
        public fireEvent(eventName: string): void;
        private executeGyomuFunction(eventName);
        public bindData(data: any): void;
        public getData(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        public changedVisible(): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
        public toggleDisabledAttribute(): void;
    }
    class Dependency {
        public dependTo: string;
        public dependValue: string;
        public expression: Uz.Expression;
        public myCondition: Uz.Constraint;
    }
}
declare module Uz {
    interface _IStateChangable {
        postParameterPanelNames: Object[];
    }
}
declare module Uz {
    enum GridValidationTypeInDesign {
        CircularReference,
        duplicationNewPropertyName,
        duplicationParentClassFieldName,
    }
    class ValidationGridInDesign {
        public validateGrid(propertyName: string, rule: any, fieldName: string, rowDatas: any): any;
        private valiateCircularReference(rule, fieldName, rowDatas);
        private createAllpostParameterPanelNames(fieldName, rowDatas);
        private isSelectSamePanelName(postParameterPanelNames);
        private sortAllParameterPanelNames(allPostParameterPanelNames);
        private createReferenceSequence(allPostParameterPanelNames);
        public createValidateResult(allPostParameterPanelNames: any): any;
        private searchTargetPanelSequenceIndex(circularReferenceInfoArray, postParameterPanelNames, panelName);
        private pushCircularReferenceInfo(circularReferenceInfoArray, postParameterPanelNames, panelName);
        private editCircularReferenceInfo(circularReferenceInfoArray, postParameterPanelNames, panelName, targetIndex);
        private isCircularReferenceError(postParameterPanelNames, targetCheckedPanels, panelName);
        private editPanelSequence(postParameterPanelNames, targetPanelSequence, panelName);
        private sortPanelSequence(targetPanelSequence, myIndex, referenceIndex);
        private changePanelSequenceArray(circularReferenceInfo);
        private valiateDuplicationNewPropertyName(rule, fieldName, rowDatas);
        private createDuplicationNewPropertyName(fieldName, rowDatas);
        private valiateDuplicationParentClassFieldName(rule, rowDatas);
        private createDuplicationParentClassFieldNameError(parentClassId, rowDatas);
    }
}
declare module Uz {
    class _Panel extends Uz._ViewControl implements Uz._IStateChangable {
        private static DEFAULT_BODYAREA_ID;
        private static DEFAULT_HEADERAREA_ID;
        private _panelBodyDom;
        private _panelHeaderDom;
        private _title;
        private _isOpen;
        private _canOpenAndClose;
        private _postParameterPanelNames;
        private _requestSettings;
        private _hiddenInput;
        private _onLoad;
        private _onOpen;
        private _onClose;
        private _session;
        private _backgroundColor;
        private _marginTop;
        private _marginBottom;
        private _eraseBorderBottom;
        private _eraseBorderRight;
        private _eraseBorderLeft;
        private _eraseBorderTop;
        private _widthAuto;
        private _isFirstLoadFinished;
        private _isGroupBox;
        public isFirstLoadFinished : boolean;
        public title : string;
        public isOpen : boolean;
        public canOpenAndClose : boolean;
        private keepHeaderWidth(beforeWidth);
        private changePanelHeaderIcon();
        private changePanelBodyVisible();
        private changePanelHeaderBorderRadius();
        private changePanelHeaderIconVisible();
        public postParameterPanelNames : Object[];
        public requestSettings : RequestSettings[];
        public hiddenInput : Object[];
        public onLoad : string;
        public onOpen : string;
        public onClose : string;
        public session : any;
        public marginTop : any;
        public backgroundColor : Uz.Color;
        public changeMarginTop(): void;
        public marginBottom : any;
        public changeMarginBottom(): void;
        public eraseBorderTop : boolean;
        public eraseBorderBottom : boolean;
        public eraseBorderRight : boolean;
        public eraseBorderLeft : boolean;
        public widthAuto : boolean;
        public isGroupBox : boolean;
        private editGroupBoxSetting(isGroupBox);
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public changeWidth(): void;
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        private createCheckBoxTypeDisabledProperty(editablePropertyInfo, keyName, value, enabled?);
        private childDivAutoMakeSelect();
        private childDivAutoMakeSelectElement(fieldName);
        public showLoading(): void;
        public hideLoading(): void;
        public bindData(data: any): void;
        private getPanelBodyAreaID();
        private getPanelHeaderAreaID();
        public layoutedChildControl(): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
        public setDisabledWidthAuto(isDisabled: boolean): void;
    }
    class RequestSettings {
        public eventName: string;
        public requestUrl: string;
    }
}
declare module Uz {
    interface _IPostable {
        url: string;
        targetPostParamFieldNames: string[];
        relation: string[];
    }
}
declare module Uz {
    class _Button extends Uz._ViewControl {
        private static DEFAULT_IMG_TEMP_ID;
        private static DEFAULT_BTN_TEMP_ID;
        private _text;
        private _appearance;
        private _imageFileUrl;
        private _onClick;
        private _imageWidth;
        private _imageHeight;
        public onClick : string;
        public text : string;
        public appearance : Uz.Appearance;
        public imageFileUrl : string;
        public imageHeight : any;
        public imageWidth : any;
        public changeWidth(): void;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public recreateDomElement(isImage: boolean): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public toggleDisabledAttribute(): void;
        public reSizeHeightImage(isHeightValue: boolean): void;
        public reSizeWidthImage(isWidthValue: boolean): void;
    }
}
declare module Uz {
    class _ButtonSubmit extends Uz._Button {
        private _postParameterPanelNames;
        private _validateUrl;
        private _submitUrl;
        private _onAfterRequest;
        public postParameterPanelNames : Object[];
        public validateUrl : string;
        public submitUrl : string;
        public onAfterRequest : string;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public recreateDomElement(isImage: boolean): void;
        public getEditablePropertyInfo(): any;
        private submitRequest();
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _ButtonDownLoad extends Uz._ViewControl {
        private static DEFAULT_IMG_TEMP_ID;
        private static DEFAULT_BTN_TEMP_ID;
        private _text;
        private _imageFileUrl;
        private _onClick;
        private _fileType;
        private _url;
        private _onBeforeClick;
        private _postParameterPanelNames;
        public onClick : string;
        public text : string;
        public imageFileUrl : string;
        public fileType : string;
        public url : string;
        public onBeforeClick : string;
        public postParameterPanelNames : Object[];
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public recreateDomElement(isImage: boolean): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _UploadPanel extends Uz._ViewControl {
        private static DEFAULT_HIDEFILE_ID;
        private static DEFAULT_SELECTBUTTON_ID;
        private static DEFAULT_DROPAREA_ID;
        private static DEFAULT_UPLOADEFILETABLE_ID;
        private static DEFAULT_UPLOADBUTTON_ID;
        private static ANIMATION_SPEED;
        private _multiSelect;
        private _extension;
        private _url;
        private _uploadFiles;
        private _selectButton;
        private _hideFile;
        private _dropArea;
        private _uploadFileTable;
        private _uploadButton;
        private _postParameterPanelNames;
        public multiSelect : boolean;
        public extension : string;
        public url : string;
        public uploadFiles : File[];
        private selectButton;
        private hideFile;
        private dropArea;
        private uploadFileTable;
        private uploadButton;
        public postParameterPanelNames : Object[];
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        private createOuterDiv();
        private createButton(elementName, id, text);
        private createHideFile();
        private createDropArea();
        private createTable(isDesignMode);
        private bindEvent();
        private openExplorer();
        private addUpdateFilesTo(selectFiles);
        private canUploadFile(selectFile);
        private serchSameFileIndex(selectFileName);
        private addRowtoUploadFileTable(addTargetFileNames);
        private appendRow(table, fileName, fieldName);
        private bindDeleteEvent();
        private fileUpload();
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public toggleDisabledAttribute(): void;
    }
}
declare module Uz {
    class _DateControlUtil {
        private static FORMAT_BASE;
        private static DEFAULT_DISPLAY_FORMAT;
        static initializeRegion(): void;
        static datepickerForGrid(inputElement: JQuery, displayFormat: any, ymdKubun: any): void;
        static monthpickerForGrid(inputElement: any, displayFormat: any, ymdKubun: any): void;
        static yearpickerForGrid(inputElement: any, displayFormat: any, ymdKubun: any): void;
        private static formatOnBlurForGrid(element, displayFormat, ymdKubun);
        static onSelectForDate($element: JQuery, inst: any, displayFormat: any, ymdKubun: any);
        static beforeShowForDate(element: JQuery, value: any, displayFormat: any, ymdKubun: any, maxMin: any): void;
        static formatOnBlurForDate($element: JQuery, displayFormat: any, ymdKubun: any): void;
        static formatOnFocusForDate(element: JQuery, displayFormat: any, ymdKubun: any): string;
        static getOrgTextForDate(targetObj: JQuery, displayFormat: any, ymdKubun: any): string;
        static getFormatText(targetText: string, displayFormat: any, ymdKubun: any): string;
        static displayFormatPropertyCheck(displayFormat: Uz.DisplayFormat, ymdKubun: Uz.YmdKubun): number;
        static suggestYearList($element: JQuery, displayFormat, ymdKubun): any;
        private static format2digit(value);
        static getDateInfoStruct(strDateValueTmp): DateStruct;
        private static convDateSeireki(targetDate, formatType);
        private static displayFormatInputCheck(resultString);
        private static isYearRange(targetValue);
        private static formatDateSeireki(date, fmt, ymd);
        private static formatDateWareki(date, fmt, ymd);
        private static getEraTable();
        private static getEraFromDate(targetValue);
        private static analyzeDateString(strDateValue);
        private static getDateInfoFromWareki(eraType, strYM);
        private static getEraFromName(targetValue);
        private static getEraFromCode(targetValue);
        private static getDaysInMonthWareki(strGYYMM);
        private static convDateWareki(TargetDate);
    }
    class DateStruct {
        private _eraNumber;
        private _eraAlphabet;
        private _eraKanji;
        private _eraKanjiRyaku;
        private _yearSeireki;
        private _yearWareki;
        private _month;
        private _day;
        private _isSeireki;
        public eraNumber : string;
        public eraAlphabet : string;
        public eraKanji : string;
        public eraKanjiRyaku : string;
        public yearSeireki : string;
        public yearWareki : string;
        public month : string;
        public day : string;
        public isSeireki : boolean;
        constructor();
    }
    class CTable {
        private _fcode;
        private _fename;
        private _fjname;
        private _foffset;
        private _fdstart;
        private _fdend;
        private _fjryaku;
        public fcode : string;
        public fename : string;
        public fjname : string;
        public foffset : string;
        public fdstart : Date;
        public fdend : Date;
        public fjryaku : string;
        constructor(fcode, fename, fjname, foffset, fdstart, fdend, fjryaku);
    }
}
declare module Uz {
    class _TextBoxDateRange extends Uz._ViewControl {
        private static DEFAULT_YMDKUBUN;
        private static DEFAULT_DISPLAY_DATE_FORMAT;
        private static DEFAULT_FROMDATE_ID;
        private static DEFAULT_ARROW_ID;
        private static DEFAULT_TODATE_ID;
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private static DEFAULT_LABELR_ID;
        private _coreDom;
        private _labelLDom;
        private _labelRDom;
        private _fromDate;
        private _arrow;
        private _toDate;
        private _rangeWidth;
        private _permitCharactor;
        private _ymdKubun;
        private _displayFormat;
        private _fromText;
        private _toText;
        private _fromValue;
        private _toValue;
        private _fromRequired;
        private _toRequired;
        private _isHolizontal;
        private _fromPlaceHolder;
        private _toPlaceHolder;
        private _minDate;
        private _maxDate;
        private _readOnly;
        private _isPassword;
        private _isPrivateInfo;
        private _onFocus;
        private _onBlur;
        private _onChange;
        private _onKeyPress;
        private _labelLText;
        private _labelRText;
        private _labelLWidth;
        private _labelRWidth;
        private _labelLAlign;
        private _labelRAlign;
        private _defaultPermitCharactor;
        private _suggestSourceYear;
        public suggestSourceYear : any;
        public isDesignModeLocal : boolean;
        public rangeWidth : string;
        public coreDom : HTMLElement;
        public fromDate : HTMLElement;
        public arrow : HTMLElement;
        public toDate : HTMLElement;
        public ymdKubun : Uz.YmdKubun;
        public displayFormat : Uz.DisplayFormat;
        public minDate : string;
        public maxDate : string;
        public fromValue : string;
        public toValue : string;
        public isHolizontal : boolean;
        public fromRequired : boolean;
        public fromPlaceHolder : string;
        public toRequired : boolean;
        public toPlaceHolder : string;
        public readOnly : boolean;
        public isPrivateInfo : boolean;
        public isPassword : boolean;
        public onFocus : string;
        public onBlur : string;
        public onChange : string;
        public onKeyPress : string;
        public fromText : string;
        public toText : string;
        public labelLText : string;
        public labelRText : string;
        private createLabelElement(className);
        public labelLWidth : any;
        public labelRWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        public labelRAlign : Uz.Align;
        public permitCharactor : string;
        public defaultPermitCharactor : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private getCoreID();
        private getLabelLID();
        private getLabelRID();
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public formatValidation(): boolean;
        public changeFormat(): void;
        public registProperty(): void;
        public changeWidthParameter(oldWidth, newWidth): void;
        private resizeOuterDiv();
        public rangeChangeWidth(oldWidth, newWidth): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public createDomElementRange($parentElement): HTMLSpanElement;
        public createFromToDateChange(): void;
        private dateRangeTrigger(from, to);
        public createFromToDate(element): HTMLInputElement;
        public createArrow(): HTMLSpanElement;
        public getEditablePropertyInfo(): any;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        private getJQueryLabelLElement();
        private getJQueryLabelRElement();
        public minMaxDateProperty(minMaxDate): Date;
        public initializeDatepickerProperty(): void;
        public initializeDatepicker(fromToStats): void;
        public initializeYearList($element, format, ymd): void;
        public initializeMonthPicker(fromToStats): void;
        public initializeMonthPickerSet($element): void;
        public initializeDatepickerSet(element, elementChg): void;
        public datepickerOnSelect(element): void;
        public datepickerOnClose(element): void;
        public beforeShowMinMaxSet(element, elementChg, filedName, maxMin): void;
        public inputTextDateConvert(element): void;
        public getDateRangeElement(val: string): JQuery;
        public bindData(data: any): void;
        private getFromDateAreaID();
        private getToDateAreaID();
        public validateControlDateRange(element: JQuery, isFrom: boolean): any;
        public validateRequired(element: JQuery, isFrom: boolean): any;
        public validateTextKind(element: JQuery): any;
        public validateInputDate(element: JQuery): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        public toggleDisabledAttribute(): void;
    }
}
declare module Uz {
    class _TextBox extends Uz._ViewControl {
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private static DEFAULT_LABELR_ID;
        private _coreDom;
        private _labelLDom;
        private _labelRDom;
        private _required;
        private _maxLength;
        private _minLength;
        private _textAlign;
        private _readOnly;
        private _placeHolder;
        private _imeMode;
        private _textKind;
        private _isPassword;
        private _isComboBox;
        private _isPrivateInfo;
        private _text;
        private _onFocus;
        private _onBlur;
        private _onChange;
        private _onKeyPress;
        private _labelLText;
        private _labelRText;
        private _labelLWidth;
        private _labelRWidth;
        private _labelLAlign;
        private _labelRAlign;
        private _suggest;
        private _defaultPermitCharactor;
        private _permitCharactor;
        private _value;
        public required : boolean;
        public maxLength : number;
        public minLength : number;
        public textAlign : Uz.Align;
        public readOnly : boolean;
        public placeHolder : string;
        public imeMode : Uz.ImeMode;
        public textKind : Uz.TextKind;
        public isPrivateInfo : boolean;
        public isPassword : boolean;
        public onFocus : string;
        public onBlur : string;
        public onChange : string;
        public onKeyPress : string;
        public text : string;
        public labelLText : string;
        public labelRText : string;
        private createLabelElement(className);
        public labelLWidth : any;
        public labelRWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        public labelRAlign : Uz.Align;
        public suggest : string[];
        public permitCharactor : string;
        public defaultPermitCharactor : string;
        public value : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private getCoreID();
        private getLabelLID();
        private getLabelRID();
        public isComboBox : boolean;
        private isComboBoxChanged(value);
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        private bindEvent();
        public changeWidth(): void;
        private resizeOuterDiv();
        public formatValidation(): boolean;
        public changeFormat(): void;
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        private createInputDomElement(fieldName, $parent);
        private createSelectDomElement(fieldName, $parent);
        private createOption($parent);
        public getEditablePropertyInfo(): any;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        private getJQueryLabelLElement();
        private getJQueryLabelRElement();
        public bindData(data: any): void;
        public validateControl(): any;
        public validateRequired(): any;
        public validateMaxLength(): any;
        public validateMinLength(): any;
        public validateTextKind(): any;
        public validateUniqueCharactor(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        public toggleDisabledAttribute(): void;
    }
}
declare module Uz {
    class _TextBoxCode extends Uz._TextBox {
        private _formatLength;
        public formatLength : number;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public formatValidation(): boolean;
        public changeFormat(): void;
        static getFormatText(text: string, formatLength: any): string;
        static particularValidation(formatText: string): boolean;
        public validateControl(): any;
        public validateTextKind(): any;
    }
}
declare module Uz {
    class _TextBoxNum extends Uz._TextBox {
        private _maxValue;
        private _minValue;
        private _isCurrency;
        private _isComma;
        private _decimalPointLength;
        public maxValue : number;
        public minValue : number;
        public isCurrency : boolean;
        public isComma : boolean;
        public decimalPointLength : number;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public formatValidation(): boolean;
        public changeFormat(): void;
        private static getPointNumber(num, point);
        private static repeatText(s, num);
        static getNoFormatText(text, decimalPointLength): string;
        static getFormatText(value: string, isCurrency: any, isComma: any): string;
        static particularValidation(text: string): boolean;
        public validateControl(): any;
        public validateMaxLength(): any;
        public validateMinLength(): any;
        public validateMaxValue(): any;
        public validateMinValue(): any;
        public validateTextKind(): any;
    }
}
declare module Uz {
    class _TextBoxDate extends Uz._ViewControl {
        private static DEFAULT_YMDKUBUN;
        private static DEFAULT_DISPLAY_DATE_FORMAT;
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private static DEFAULT_LABELR_ID;
        private _coreDom;
        private _labelLDom;
        private _labelRDom;
        private _required;
        private _readOnly;
        private _placeHolder;
        private _imeMode;
        private _textKind;
        private _isPassword;
        private _isPrivateInfo;
        private _text;
        private _onFocus;
        private _onBlur;
        private _onChange;
        private _onKeyPress;
        private _labelLText;
        private _labelRText;
        private _labelLWidth;
        private _labelRWidth;
        private _labelLAlign;
        private _labelRAlign;
        private _defaultPermitCharactor;
        private _permitCharactor;
        private _ymdKubun;
        private _displayFormat;
        private _value;
        private _suggestSourceYear;
        public suggestSourceYear : any;
        public ymdKubun : Uz.YmdKubun;
        public displayFormat : Uz.DisplayFormat;
        public required : boolean;
        public readOnly : boolean;
        public placeHolder : string;
        public imeMode : Uz.ImeMode;
        public textKind : Uz.TextKind;
        public isPrivateInfo : boolean;
        public isPassword : boolean;
        public onFocus : string;
        public onBlur : string;
        public onChange : string;
        public onKeyPress : string;
        public text : string;
        public labelLText : string;
        public labelRText : string;
        private createLabelElement(className);
        public labelLWidth : any;
        public labelRWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        public labelRAlign : Uz.Align;
        public permitCharactor : string;
        public defaultPermitCharactor : string;
        public value : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private getCoreID();
        private getLabelLID();
        private getLabelRID();
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public changeWidth(): void;
        private resizeOuterDiv();
        public formatValidation(): boolean;
        public changeFormat(): void;
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        private getJQueryLabelLElement();
        private getJQueryLabelRElement();
        public initializeDatepicker(): void;
        public initializeYearList(): void;
        public initializeMonthPicker(): void;
        public initializeMonthPickerSet(): void;
        public initializeDatepickerSet(): void;
        public inputTextDateConvert(element): void;
        public bindData(data: any): void;
        public changeFormatBindData(): void;
        public validateControl(): any;
        public validateRequired(): any;
        public validateTextKind(): any;
        public validateInputDate(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
    }
}
declare module Uz {
    class _TextBoxFlexibleDate extends Uz._TextBoxDate {
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public validateControl(): any;
    }
}
declare module Uz {
    class _GridControlUtil {
    }
}
declare module Uz {
    class _TabPanel extends Uz._ViewControl {
        private $_parentTabContainer;
        private _title;
        private _titleHref;
        private _onActive;
        public title : string;
        private getTabATag();
        private getTabList();
        private titleHref;
        public onActive : string;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private appendLiTitle();
        private createLiTitle();
        private createATag();
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public changedVisible(): void;
        public bindData(data: any): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
    }
}
declare module Uz {
    class _TabContainer extends Uz._ViewControl {
        private _selectedItemFeildName;
        private _tabpanelPosition;
        private _isDraggable;
        private _onChange;
        private _containerWidth;
        public containerWidth : any;
        public onChange : string;
        public selectedItem : Uz._TabPanel;
        private isInvalidPanel(value);
        private activeTab(selectedItem);
        private static getTabListItems($tabContainer);
        public tabpanelPosition : string[];
        public isDraggable : boolean;
        public selectedItemFieldName : string;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLElement;
        private createTabContainer();
        private appendTabList(tabs);
        private alignTabTitlesHeight();
        private static findMaxTitleLineNum(tabContainer);
        private static appendBlankLinesToTitles(tabContainer, maxLineNum);
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private addNewTab(selectedControl);
        private removeTab(selectedControl);
        static saveTabState(): void;
        static refreshTabState(element?: JQuery): void;
        static refreshTabStateByPanel($panel: JQuery): void;
        static clearTabState(): void;
        static initDefaultActiveTab(): void;
        private static resizeTabPanel(anyTabs);
        private static reloadActiveTab();
        private initSortableTabs();
        private sortableTabs();
        private getOrderOfTabpanel();
        public refreshTabOrder(): void;
        private createTabpanelPosition(tabpanelPosition);
        private isAllStringInArray(tabpanelPosition);
        private sortTabpanelByTabpanelPosition();
        private createEditablePropertyTabpanelPosition();
        private getFirstTabInDisplayed();
        private getTabPanelByFieldName(tabFieldName);
        public resetSelectItem(): void;
        public bindData(data: any): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
    }
}
declare module Uz {
    class _DataGridFormatter {
        static HeaderFormatter(row, cell, value, columnDef, dataContext): string;
        static LabelFormatter(row, cell, value, columnDef, dataContext): string;
        static TextBoxFormatter(row, cell, value, columnDef, dataContext): string;
        static CheckBoxFormatter(row, cell, value, columnDef, dataContext): string;
        static DropDownListFormatter(row, cell, value, columnDef, dataContext): string;
        static ButtonFormatter(row, cell, value, columnDef, dataContext): string;
        static ImageFormatter(row, cell, value, columnDef, dataContext): string;
        static DynamicImageFormatter(row, cell, value, columnDef, dataContext): string;
        private static getCustomAttrString(columnDef, dataContext);
        static ButtonDialogFormatter(row, cell, value, columnDef, dataContext): string;
        static TextBoxMultiLineFormatter(row, cell, value, columnDef, dataContext): string;
    }
    class _FormatDataForGrid {
        public value: any;
        public formatValue: any;
        public result: boolean;
        constructor(value: any, column: any);
        private format(value, column);
    }
}
declare module Uz {
    class _ButtonDialog extends Uz._Button {
        private _displayChildDivName;
        private _dataPassing;
        private _visibleCloseButton;
        private _onOkClose;
        private _onBeforeOpenDialog;
        public displayChildDivName : string;
        public dataPassing : Object[];
        public visibleCloseButton : boolean;
        public onOkClose : string;
        public onBeforeOpenDialog : string;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public bindData(data: any): void;
        public waitLoadingForButtonDialog(thisInstance): void;
    }
}
declare module Uz {
    class CommonChildDiv extends Uz._ViewControl {
        private _layout;
        private _businessId;
        private _controlName;
        private _isCommonChildDivEditMode;
        private _relation;
        private _originalProperty;
        private _marginTop;
        private _marginBottom;
        private _dataPassingForDialog;
        private _dialogOkEventNameForDialog;
        private _dialogCancelEventNameForDialog;
        private _parentButtonDialog;
        public layout : any;
        public businessId : string;
        public controlName : string;
        public isCommonChildDivEditMode : boolean;
        public relation : string[];
        public originalProperty : Object[];
        public marginTop : any;
        public marginBottom : any;
        public dataPassingForDialog : Object[];
        public dialogOkEventNameForDialog : string;
        public dialogCancelEventNameForDialog : string;
        private static defaultLayout;
        constructor($parentElement: JQuery, isDesignMode: boolean, staticLayout: any, fieldName: string);
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public renderCompleted(): void;
        private static getCommonChildDivFieldName($parentElement, fieldName);
        private initLayout(staticLayout);
        public raisePropertyChanged(layout): void;
        private copyPropertyFromLayout();
        private initChildControls($childDivParentElement, childDivFieldName);
        private static addFieldNameForCommonChildDivChildren(parentFieldName, childControl);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private createOriginalPropertyColumnInfos();
        static createCommonChildDiv(childdivFieldName: string, businessId: string, controlName: string, $parentElement: JQuery, isDesignMode: boolean, isCommonChildDivEditMode: boolean): Uz._JSControl;
        private static getChildFieldNames(control, fieldNames);
        private setElementId();
        public bindData(data: any): void;
        public initDefaultOriginalProperty(basePanelName: string): void;
        public fireCloseEventForDialog(eventName: string): void;
        public setParentButtonDialog(control: any): void;
        private waitLoadingForDialog(thisInstance);
        public changedDisabled(): void;
        public changedParentDisabled(): void;
    }
}
declare module Uz {
    class _DialogContainer {
        private _displayChildDivName;
        private _dataPassing;
        private _visibleCloseButton;
        private _onOkClose;
        private _parentControl;
        public displayChildDivName : string;
        public dataPassing : Object[];
        public visibleCloseButton : boolean;
        public onOkClose : string;
        public parentControl : Uz._ViewControl;
        constructor(parentControl: Uz._ViewControl, displayChildDivName: string, dataPassing: any, visibleCloseButton: boolean, onOkClose: string);
        public openDialog(): void;
        public closeDialog(isCancel: boolean): void;
        private showDialog();
        private showOverlay();
        private hideDialog();
        private resetIsFirstLoadFinished(control);
        private getDialogDomId();
        private getDialogBusinessId();
        private getDialogControlName();
        private bindParentToDialog();
        private bindDialogToParent();
        private getBindControlFromPage(controlName);
        private getBindControlFromDialog(controlName);
        private searchControl(currentControl, controlName, parentFieldName);
        private searchControlForLayout(currentControl, controlName, parentFieldName, parentLayoutName);
        private isHiddenInput(controlName);
        private isDataGridColumn(controlName);
        private getPassingDataForHidden(panel, hiddenInputName);
        private setPassingDataForHidden(panel, hiddenInputName, value);
        private getDialogDivControl();
        private getDialogDivPanelDomId();
        private fireOnLoadEvent();
    }
}
declare module Uz {
    class _DataGrid extends Uz._ViewControl {
        private static DEFAULT_GRID_ID;
        private static DEFAULT_PAGER_ID;
        private static DEFAULT_GRID_COLUMNS;
        private static DEFAULT_GRID_ROWS;
        private static DEFAULT_GRID_FOOTER_HEIGHT;
        private _grid;
        private _dataView;
        private _options;
        private _footer;
        private _gridDiv;
        private _footerDiv;
        private _outerDiv;
        private _editable;
        private _binding;
        private _columnFilters;
        private _checkboxSelector;
        private _nextFocusRow;
        private _nextFocusCol;
        private _scrollTopPosition;
        private _scrollLeftPosition;
        private _gridSetting;
        private _height;
        private _dataSource;
        private _sortOrder;
        private _isAscending;
        private _filterList;
        private _activeRowId;
        private _onSort;
        private _onSelect;
        private _onSelectByDblClick;
        private _onOnlyRow;
        private _onNoRow;
        private _onMultiRows;
        public gridSetting : _GridSetting;
        public height : any;
        private static convertOldValue(value);
        public dataSource : any[];
        public sortOrder : string;
        public isAscending : any;
        public filterList : any[];
        public activeRowId : number;
        public onSort : string;
        public onSelect : string;
        public onSelectByDblClick : string;
        public onOnlyRow : string;
        public onNoRow : string;
        public onMultiRows : string;
        public changeWidth(): void;
        public changeHeight(): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private createDefaultGridSetting();
        private createGrid();
        private getDispRowStateColumnDefinition();
        private getHeaderHeightClass();
        private getColModel(columns, header);
        private getGroupedColModel(colModel, combines);
        private getGroupSetting(colModel, combines);
        private initSlickGrid(colModel);
        private initFilterEvent();
        private initGridEvent();
        private getNextFocusElement(self, shiftKey);
        private initGridCellClickEvent();
        private initGridCellFocusEvent();
        private initGridCellChangeEvent();
        private afterChangeAction(inputElement, column);
        private saveScrollPosition();
        private getColumnDefinition(columnId);
        private initFilterToolbar();
        private initFrozenColumn(colModel);
        private fillWithEmptyRows();
        private initDataView();
        private initGridFooter();
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private changeGrid();
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private static getDialogTypeEditableProperty(gridSetting);
        public bindData(data: any): void;
        private setScrollPosition();
        private setFocusPosition(isAutoScroll?, isClearNextFocusRowCol?);
        private setCellBgColor();
        private setSelectedRows();
        private setSortColumn();
        private convertDataSource(data, colModel);
        private convertDataForClient(rowId, data, colModel);
        private convertDataForServer(data, colModel);
        private denyControlClickEvent();
        public getOutputParameterForDialog(rowId: number, dataName: string): any;
        public setOutputParameterForDialog(rowId: number, dataName: string, value: any): void;
        private waitLoadingForDialog(thisInstance, column);
        private showDialog(thisInstance, column);
    }
    enum _GridRowNum {
        rows_5,
        rows_10,
        rows_15,
        rows_20,
        rows_25,
    }
    enum _GridColumnWidth {
        XS,
        S,
        M,
        L,
        XL,
    }
    enum _GridCellType {
        String,
        TextBox,
        CheckBox,
        DropDownList,
        TextBoxCode,
        TextBoxNum,
        TextBoxDate,
        TextBoxFlexibleDate,
        Button,
        StaticImage,
        DynamicImage,
        ButtonDialog,
        TextBoxMultiLine,
    }
    enum _GridAlign {
        left,
        center,
        right,
    }
    enum _GridCellBgColor {
        Normal,
        Red,
        Blue,
        Yellow,
        Green,
        Gray,
        LightRed,
        LightBlue,
        LightYellow,
        LightGreen,
        LightGray,
    }
    class _GridSetting {
        static DEFAULT_GRID_ROWHEIGHT: number;
        static DEFAULT_GRID_IS_MULTISELECTABLE: boolean;
        static DEFAULT_GRID_IS_SHOW_FOOTER: boolean;
        static DEFAULT_GRID_IS_SHOW_FILTER: boolean;
        static DEFAULT_GRID_IS_SHOW_FILTER_BUTTON: boolean;
        static DEFAULT_GRID_IS_SHOW_ROWSTATE: boolean;
        public rowHeight: number;
        public isMultiSelectable: boolean;
        public isShowFilter: boolean;
        public isShowFilterButton: boolean;
        public isShowFooter: boolean;
        public isShowRowState: boolean;
        public columns: _GridColumn[];
        public header: _GridHeader;
        constructor();
    }
    class _GridColumn {
        static DEFAULT_GRID_COLUMN_WIDTH: _GridColumnWidth;
        static DEFAULT_GRID_COLUMN_CELL_TYPE: _GridCellType;
        static DEFAULT_GRID_COLUMN_VISIBLE: boolean;
        static DEFAULT_GRID_COLUMN_ALIGN: _GridAlign;
        static DEFAULT_GRID_COLUMN_RISIZE: boolean;
        static DEFAULT_GRID_COLUMN_IS_PRIVATE_INFO: boolean;
        static DEFAULT_GRID_COLUMN_BGCOLOR: _GridCellBgColor;
        public columnName: string;
        public dataName;
        public string;
        public sortKey: string;
        public toolTip: string;
        public bgColor;
        public width;
        public visible: boolean;
        public cellType;
        public cellDetails: any;
        public align;
        public resize: boolean;
        public isPrivateInfo: boolean;
        constructor();
    }
    class _GridHeader {
        static DEFAULT_GRID_HEADER_HEADERHEIGHT: Uz.Size;
        public combineColumns: _GridCombineColumn[];
        public frozenColumn: string;
        public headerHeight: Uz.Size;
        constructor();
    }
    class _GridCombineColumn {
        public combineColumnName: string;
        public combineItem: string[];
        constructor();
    }
}
declare module Uz {
    class CompositeControl extends Uz._ViewControl implements Uz._IPostable {
        private _url;
        private _targetPostParamFieldNames;
        private _layout;
        private _businessId;
        private _controlName;
        private _isCompositeEditMode;
        private _relation;
        private _originalProperty;
        public url : string;
        public targetPostParamFieldNames : string[];
        public layout : any;
        public businessId : string;
        public controlName : string;
        public isCompositeEditMode : boolean;
        public relation : string[];
        public originalProperty : Object[];
        private static defaultLayout;
        constructor($parentElement: JQuery, isDesignMode: boolean, staticLayout: any, fieldName: string);
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public renderCompleted(): void;
        private static getCompositeControlFieldName($parentElement, fieldName);
        private initLayout(staticLayout);
        public raisePropertyChanged(layout): void;
        private copyPropertyFromLayout();
        private initChildControls($compositeParentElement, compositeControlFieldName);
        private static addFieldNameForCompositeControlChildren(parentFieldName, childControl);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private createOriginalPropertyColumnInfos();
        static createCompositeControl(compositeFieldName: string, businessId: string, controlName: string, $parentElement: JQuery, isDesignMode: boolean, isCompositeEditMode: boolean): Uz._JSControl;
        private static getChildFieldNames(control, fieldNames);
        private setElementId();
        public bindData(data: any): void;
        public toggleDisabledAttribute(): void;
    }
}
declare module Uz {
    class _ViewControlUtil {
        static applyLayoutInfo(control: Uz._JSControl, layoutInfo: any, $ancestorElement: JQuery, isDesignMode: boolean): Uz._JSControl;
        static applyLayoutInfoForDesign(control: Uz._JSControl, layoutInfo: any, $ancestorElement: JQuery, isDesignMode: boolean): Uz._JSControl;
        private static getTargetPanelNames(state);
        private static getTargetLayoutInfo(layoutInfo, targetPanelName);
        private static applyLayoutInfoForDesignCore(control, layoutInfo, $ancestorElement, isDesignMode);
        static createInitialControl(control: Uz._JSControl, layoutInfo: any, $ancestorElement: JQuery, isDesignMode: boolean): Uz._JSControl;
        private static isCompositeControlType(controlType);
        private static isCompositeEditMode(control, layoutInfo);
        static adjustmentViewPageHeight(isDesignMode: boolean): void;
        private static resizeViewPageHeight();
        static applyDependencies(myControl: Uz._ViewControl): void;
        private static applyDependency(dependentControl, myCondition, myControl, expression, targetProperty, targetValue);
        private static applyDependencyForSelectableControl(myControl, dependencyIndex, myCondition, isSelected);
        private static changeMyConditionFromDependency(myCondition, controlProperties, isDepend);
        static getPanelFieldNames(parentControl: Uz._ViewControl, panelFieldNames: string[]): string[];
        static serializeArrayForGrid(array: string[]): string;
        static getFirstState(page: Uz._ViewPage): string;
        static getNextState(page: Uz._ViewPage, fieldName: string, eventName: string): string;
        static getTransitionEvents(page: Uz._ViewPage): Object[];
        private static isExistEventInArray(eventArray, data);
        static getStateTransitionByState(page: Uz._ViewPage, targetState: string): any;
        static getVisibleDivByState(page: Uz._ViewPage): string[];
        static bindTransitionEvent(page: Uz._ViewPage, fieldName: string, eventName: string): void;
        static fireEvent(eventName: string): void;
        static getControlEventList(ancestorControl: Uz._JSControl, parentFieldName?: string): string[];
        private static isPrefixOn(propertyName);
        private static appendFeildNameConnectorString(field);
        private static isCommonChildDivType(controlType);
        static splitStringByBreak(str: string): string[];
        static appendNewLinetText(element: JQuery, strArray: string[]): void;
        static getUniqueIdForViewControl(controlType: any);
        static createPostParameter(instance: Uz._JSControl): any;
        static getLayoutByFieldName(rootControl: Uz._JSControl, fieldName: string): any;
        private static searchLayoutByFieldName(currnetControl, fieldName);
        static getLayoutParentByFieldName(rootControl: Uz._JSControl, fieldName: string): any;
        private static searchLayoutParentByFieldName(currnetControl, fieldName);
        static getSendJsonInfo(control: Uz._JSControl, currentLayout?: any): any;
        private static createItemsToJsonObject(parentDiv, parentLayout?);
        private static isViewControl(control);
        static isCommonChildDivPanel(control: Uz._JSControl): boolean;
        static isCompositeChild(control: Uz._JSControl): boolean;
        static fireStateTransitionOnDatagridColumn(fieldName: string, columnName: string, eventName: string): void;
        static viewPageRootTitle(rootTitle: string): void;
        static panelWidthAuto(id: string, status: string): boolean;
        static getSerializedOutputParameter(ioInfo: any): string;
        static getOutputParameter(ioInfo: any): any;
        private static getOutputParameterForHidden(ioInfo);
        static setSerializedOutputParameter(ioInfo: any, serializedParameter: any): void;
        static setOutputParameter(ioInfo: any, parameter: any): void;
        private static setOutputParameterForHidden(dataPassing, parameter);
        static loadSequencePanel(loadPanelInstance: any, loadSequence: any, eventName?: string): void;
        private static loadDivs(instances, loadSequence, eventName);
        static getFieldNamesForDialog(searchControl: Uz._JSControl): string[];
        private static searchFieldNamesForDialog(control, fieldNames);
        static setInitializeDataForControls(control: Uz._JSControl, initlayout: any): void;
        static execClientValidation(postParameterPanelNames: any): boolean;
        private static execValidation(items);
        static setViewPageParameter(element): void;
        private static addControlMargin(element, page);
        static changeDisabledForContainerChildren(parentDisabled: boolean, childrenControl: Uz._JSControl[]): void;
        static changeReadOnlyForPanleChildren(childrenControl: Uz._JSControl[]): void;
        static changeReadOnlyForCompositeChildren(compositeControlFieldName: String): void;
    }
    class Console {
        private static timeCounters;
        private static info(data);
        static time(name, reset?): void;
        static timeEnd(name): number;
    }
}
declare module Uz {
    class _ViewPage extends Uz._ViewControl {
        private _onLoad;
        private _title;
        private _jsPathCollection;
        private _relation;
        private _stateTransition;
        private _currentState;
        private _id;
        private _WFParameter;
        private _UIContainerEventMapping;
        private _loadSequencePanelNames;
        private _panelMargin;
        private _controlMargin;
        private static _helpTabWidth;
        private static _helpTabHeight;
        private static _helpDivWidth;
        private static EXCEPTIONMESSAGE_JSNOTFOUNDERROR;
        private static EXCEPTIONMESSAGE_JSEXECECTIONERROR;
        private static EXCEPTIONMESSAGE_JSCOLLECTIONERROR;
        private static _http200OK;
        private static _http404ERROR;
        public onLoad : string;
        public title : string;
        public jsPathCollection : string[];
        private getScriptFile(path);
        public relation : string[];
        public stateTransition : string[];
        public currentState : string;
        public id : string;
        public WFParameter : string[];
        public UIContainerEventMapping : string[];
        public loadSequencePanelNames : string[];
        public panelMargin : Uz.LumpSizeForPanel;
        public controlMargin : Uz.LumpSizeForContorol;
        constructor($parentElement: JQuery, isDesignMode: boolean, isDialogPage: boolean);
        private initTempHelpData();
        static createCommonButtonArea(): void;
        private initErrorAndWarningAccordion();
        private initPageResizeEvent();
        private static resizeHelpTabAndDiv(pageWidth, top, additionalTop, left, $helpTab, $helpDiv);
        private initHelpTabClickEvent($helpTab, $helpDiv);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        private createErrorAndWarningDiv(errorWarningDiv);
        public getEditablePropertyInfo(): any;
        private static getFieldNames(control, fieldNames);
        private getStateNames();
        private createHelpTab(text, className, startGradient, endGradient, fontSize);
        private createHelpDiv(className);
        private fillColorOfHelpTab(context, startGradient, endGradient);
        private writeVerticalLine(context, text, x, y, fontSize);
        public bindStateTransitionEvent(): void;
        public changeState(fieldName: string, eventName: string): void;
        private changePage(eventName);
        private changeFinishState();
        private changeVisibleDiv(isAll);
        private changeStateDiv(changeInstance);
        private loadDivs(instances, loadSequence);
        private changeControlMargin(value);
        private changePanelMargin(value);
    }
}
declare module Uz {
    class _TextBoxMultiLine extends Uz._ViewControl {
        private static DEFAULT_LIMITLENGTH;
        private static DEFAULT_TEXTAREA_ID;
        private static DEFAULT_TEXTCOUNT_ID;
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private static DEFAULT_LABELR_ID;
        private _coreDom;
        private _labelLDom;
        private _labelRDom;
        private _textareaDom;
        private _textcountDom;
        private _textcountDivDom;
        private _outerDiv;
        private _required;
        private _maxLength;
        private _minLength;
        private _readOnly;
        private _placeHolder;
        private _isPrivateInfo;
        private _imeMode;
        private _textKind;
        private _height;
        private _limitLength;
        private _countDisp;
        private _onFocus;
        private _onBlur;
        private _onChange;
        private _onKeyPress;
        private _text;
        private _value;
        private _labelLText;
        private _labelRText;
        private _labelLWidth;
        private _labelRWidth;
        private _labelLAlign;
        private _labelRAlign;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        private getCoreID();
        private getLabelLID();
        private getLabelRID();
        public required : boolean;
        public maxLength : number;
        public minLength : number;
        public readOnly : boolean;
        public placeHolder : string;
        public isPrivateInfo : boolean;
        public imeMode : Uz.ImeMode;
        public textKind : Uz.TextKind;
        public onFocus : string;
        public onBlur : string;
        public onChange : string;
        public onKeyPress : string;
        public text : string;
        public labelLText : string;
        public labelRText : string;
        private createLabelElement(className);
        private createLabelCountElement(className);
        public labelLWidth : any;
        public labelRWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        public labelRAlign : Uz.Align;
        private height;
        public limitLength : number;
        public countDisp : boolean;
        public value : string;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public changeWidthParameter(oldWidth, newWidth): void;
        private resizeOuterDiv();
        public multiLineChangeWidth(oldWidth, newWidth): void;
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public createDomElementMultiLine(): HTMLSpanElement;
        public createDomElementCount(): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        private getJQueryLabelLElement();
        private getJQueryLabelRElement();
        private getJQueryLabelCountElement();
        public bindData(data: any): void;
        private initEvent();
        private initJcountJS();
        private getTextAreaID();
        private getTextContID();
        private getTextContDivID();
        public validateControl(): any;
        public validateRequired(): any;
        public validateMaxLength(): any;
        public validateMinLength(): any;
        public validateTextKind(): any;
        public validateUniqueCharactor(): any;
        public toggleDisabledAttribute(): void;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        private heightConvert(value);
    }
}
declare module Uz {
    class _TextBoxYubinNo extends Uz._TextBox {
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public formatValidation(): boolean;
        public changeFormat(): void;
        public validateControl(): any;
        public validateTextKind(): any;
    }
}
declare module Uz {
    class _TextBoxDateRangeSlider extends Uz._TextBoxDateRange {
        private static DEFAULT_SLIDER_ID;
        private static DEFAULT_SLIDER_RANGE_DATE_MIN;
        private static DEFAULT_SLIDER_RANGE_DATE_MAX;
        private _sliderDate;
        private _sliderRangeDateMin;
        private _sliderRangeDateMax;
        public sliderDate : HTMLElement;
        public sliderRangeDateMin : string;
        public sliderRangeDateMax : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public changeWidthParameter(oldWidth, newWidth): void;
        public rangeChangeWidthArrow(oldWidth, newWidth): void;
        public rangeChangeWidthArrowFree(oldWidth, newWidth): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public createFromToDateSliderChange(): void;
        public createFromToDate(element): HTMLInputElement;
        public createArrow(): HTMLSpanElement;
        public createSliderDate(element, elementTop);
        public initializeSlider(fieldName): void;
        public dateRangemSliderBase(): void;
        public rangeSliderDataSize(range1, range2, range3, range4): any[];
        public rangeSliderDataVal(fieldName, minDate, maxDate);
        public datepickerOnClose(element): void;
        public createSliderDisplaySize(element);
        public sliderDisplaySize();
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _TextBoxTime extends Uz._TextBox {
        private _displayFormat;
        private _timeKubun;
        public displayFormat : Uz.DisplayFormat;
        public timeKubun : Uz.TimeKubun;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public formatValidation(): boolean;
        private createEasyFormat();
        private changeDateTypeStringCommaSeparateMillis(easyFormat);
        private changeDateTypeStringCommaSeparate(easyFormat);
        private changeDateTypeString1or2DigitNumber(easyFormat);
        private changeDateTypeString4DigitNumber(easyFormat);
        private changeDateTypeString6DigitNumber(easyFormat);
        private changeDateTypeStringJapanFormat(easyFormat);
        private change24Format(text, hourSeparatPosition);
        private changeSeparators(text);
        private searchMinuteAndSecond(text, mySeparatPosition, frontSeparatPosition);
        public changeFormat(): void;
        private setSeparators();
        private createHour(date, separators);
        private change2Digit(value);
        public validateControl(): any;
        public validateTextKind(): any;
        public validateUniqueCharactor(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
    }
}
declare module Uz {
    class _TreeView extends Uz._ViewControl {
        private _iconType;
        private _isDraggable;
        private _beforeData;
        private _selectedItems;
        private _dataSource;
        private _onClick;
        private _onDropped;
        private _treeViewJson;
        private _selectedItemsId;
        public iconType : Uz.IconType;
        public isDraggable : boolean;
        public selectedItems : TreeItem[];
        private getSelectedItemsId(data);
        private getSelectItemsFromData(selectItemsId, dataSource, selectedItems);
        private getSelectedItems(selectItemsId, nodeData, selectedItems);
        private serchSelectNodeItems(selectNodeItem, dataSource);
        private addSelectedItemsId(selectNodeItem, nodeItem);
        public dataSource : TreeItem[];
        private createDataSource(nodeJsonArray, parentTreeItem, dataSource);
        private createTreeItem(nodeJson, parentNodeText);
        private createDefaultDataSource();
        private createTreeViewJson(dataSource, parentId, parentJson);
        private createNodeJson(treeItem, id);
        public beforeData : TreeItem[];
        public onClick : string;
        public onDropped : string;
        public treeViewJson : Object[];
        public selectedItemsId : string[];
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private bindJstree();
        private createJstreeOption();
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
    }
    class TreeItem {
        public childNodes: TreeItem[];
        public text: string;
        public isOpen: boolean;
        public hasChildNode: boolean;
        public parent: string;
        public id: string;
        constructor();
        public setTreeeItem(treeItem): void;
        public treeItemEquals(targetTreeItem: TreeItem): boolean;
    }
}
declare module Uz {
    class _SortableList extends Uz._ViewControl {
        private static DEFAULT_DATASOURCETITLE_ID;
        private static DEFAULT_SELECTEDSOURCETITLE_ID;
        private static DEFAULT_DATASOURCELIST_ID;
        private static DEFAULT_SELECTEDSOURCELIST_ID;
        private static DEFAULT_SELECTBUTTON_ID;
        private static DEFAULT_REMOVEBUTTON_ID;
        private static DEFAULT_DATASOURCELISTALLRELEASEBUTTON_ID;
        private static DEFAULT_DATASOURCELISTALLSELECTBUTTON_ID;
        private static DEFAULT_SELECTEDSOURCELISTALLSELECTBUTTON_ID;
        private static DEFAULT_SELECTEDSOURCELISTALLRELEASEBUTTON_ID;
        private static DEFAULT_SELECTEDSOURCELISTSORTBUTTON_ID;
        private _onChange;
        private _required;
        private _contentValueAlign;
        private _selectedSourceTitle;
        private _dataSourceTitle;
        private _minSelectedItem;
        private _maxSelectedItem;
        private _dataSource;
        private _selectedItems;
        private _dataSourceTitleElement;
        private _selectedSourceTitleElement;
        private _dataSourceListElement;
        private _selectedSourceListElement;
        private _selectButtonElement;
        private _removeButtonElement;
        private _dataSourceListAllSelectButtonElement;
        private _dataSourceListAllReleaseButtonElement;
        private _selectedSourceListAllSelectButtonElement;
        private _selectedSourceListAllReleaseButtonElement;
        private _selectedSourceListSortButtonElement;
        public selectedSourceTitle : string;
        public dataSourceTitle : string;
        public minSelectedItem : number;
        public maxSelectedItem : number;
        private addDefaultDataSource(dataSource);
        public dataSource : SortableListDataItem[];
        public selectedItems : SortableListDataItem[];
        private getSortableListDataItemInList(targetElement);
        private setListHeight();
        public onChange : string;
        public required : boolean;
        public contentValueAlign : Uz.Align;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private bindSortableAndSelectable(sourceList, connectListId);
        private bindMoveNode();
        private moveNode(sourceList, connectList);
        private bindAllSelectAndAllRelease();
        private allSelect(tagetList);
        private allRelease(tagetList);
        private bindSort();
        private sortList(tagetList);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLElement;
        private createTitleArea();
        private createListArea();
        private createDataSourceListArea();
        private createButtonArea();
        private createSelectedSourceListArea();
        private createOuterDiv();
        private createInnerDiv(className);
        private createTitle(id);
        private createList(id);
        private createButton(id, text);
        private createListContent(targetList, source);
        private createLi(key, value, sortKey);
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public validateControl(): any;
        public validateMaxSelect(): any;
        public validateMinSelect(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        public toggleDisabledAttribute(): void;
        private addAsIfDisabledClass();
        private removeAsIfDisabledClass();
    }
    class SortableListDataItem {
        public key: string;
        public value: string;
        public sortKey: string;
        constructor(key: string, value: string, sortKey: string);
    }
}
declare module Uz {
    class _ControlRepeater extends Uz._ViewControl {
        private _repeateData;
        public repeateData : any;
        private setCompositeControlJson(templateControlJson, templateControlFieldName);
        private bindCompositeControl(control, childrenElements, targetRepeateData);
        private repeateJScontrol(repeateData);
        private createNewCompositeControl(templateControl, createCount, idCount);
        private createNewJSControl(templateControl, createCount, idCount);
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
    }
}
declare module Uz {
    class _DynamicImage extends Uz._ViewControl {
        private _src;
        private _imageWidth;
        private _imageHeight;
        public src : string;
        public imageHeight : any;
        public imageWidth : any;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLImageElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _StaticImage extends Uz._ViewControl {
        private _src;
        private _imageWidth;
        private _imageHeight;
        public src : string;
        public imageHeight : any;
        public imageWidth : any;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLImageElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _ButtonDivPopup extends Uz._Button {
        private static DEFAULT_IMG_TEMP_ID;
        private static DEFAULT_BTN_TEMP_ID;
        private _targetPanelName;
        private _modeless;
        private _modalPanel;
        private _foldIconSpan;
        private _closeIconSpan;
        private _childHiddenPanels;
        public targetPanelName : string;
        public modeless : boolean;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public recreateDomElement(isImage: boolean): void;
        public getEditablePropertyInfo(): any;
        private openModalPanel();
        private loadModalPanel();
        private displayModalPanel(sign);
        private adjustCenter();
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _TableCell extends Uz._ViewControl {
        private _connectTd;
        public connectTd : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        private selectParentTablePanel(selectedControl);
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _TablePanel extends Uz._ViewControl {
        static DEFAULT_HTML: string;
        private _html;
        public html : string;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private getTempDivJQueryElement();
        private getTableAreaJQueryElement();
        private createTableHtml();
        private backupTableCell();
        private restoreTableCell();
        private rebuildTableCell();
        private revmoveDisusedTableCell();
        private addNewTableCell();
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        static checkHtml(inputText: string): string;
        public bindData(data: any): void;
        public changedDisabled(): void;
        public changedParentDisabled(): void;
    }
}
declare module Uz {
    class _TextBoxKana extends Uz._TextBox {
        private static DEFAULT_KANATYPE;
        private static DEFAULT_KANJI_IN_TEXTBOX_ID;
        private _kanaType;
        private _kanjiInField;
        public kanaType : Uz.KanaType;
        public kanjiInField : string;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public getKanjiInFeildInfo(): any;
        public bindData(data: any): void;
        static initConvertKanaAll(): void;
        public formatValidation(): boolean;
        static particularValidation(formatText: string): boolean;
    }
}
declare module Uz {
    class _Icon extends Uz._ViewControl {
        private static DEFAULT_ICON_HEADER;
        private static DEFAULT_ICON_TRALER;
        private _icon;
        private _iconSize;
        public icon : any;
        public iconSize : any;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public createDomElement($parentElement, isDesignMode: boolean): HTMLImageElement;
        public registProperty(): void;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _Label extends Uz._ViewControl {
        private _align;
        private _text;
        private _isPrivateInfo;
        private _required;
        public required : boolean;
        public text : string;
        public align : Uz.Align;
        public isPrivateInfo : boolean;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLSpanElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
    }
}
declare module Uz {
    class _PanelPublish extends Uz._Panel {
        private static DEFAULT_CHECKBOX_ID;
        private _checkboxDom;
        private _isPublish;
        public isPublish : boolean;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private getCheckBoxID();
        private bindEvent();
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode): HTMLDivElement;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _ButtonReportCommon extends Uz._ViewControl {
        private static BASE_URL;
        private _reportButtonText;
        private _gyomuCode;
        private _reportId;
        private _reportIndex;
        private _postParameterPanelNames;
        private _validateUrl;
        private _sourceCreateUrl;
        private _afterPrintUrl;
        private _isModal;
        private _isInstruation;
        private _isPreview;
        private _printable;
        private _copiesChangeable;
        private _progressVisible;
        private _onAfterPrint;
        public baseUrl(): string;
        public reportButtonText : string;
        public gyomuCode : string;
        public reportId : string;
        public reportIndex : any;
        public postParameterPanelNames : Object[];
        public validateUrl : string;
        public sourceCreateUrl : string;
        public afterPrintUrl : string;
        public isModal : boolean;
        public isInstruction : boolean;
        public isPreview : boolean;
        public printable : boolean;
        public copiesChangeable : boolean;
        public progressVisible : boolean;
        public onAfterPrint : string;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): any;
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public validate(): void;
        public createQueryStrings(type: number, gyomuCode: string, reportId: string, reportIndex: number): string;
        public createOptions(width: number, height: number, resizable: string, scroll: string): string;
        public concatArrays(options: string[]): string;
        public getPrintType(): any;
    }
    enum _PrintType {
        PRINT_ONLY,
        PRINT_PREVIEW,
        PRINT_SETTING,
    }
}
declare module Uz {
    class _ButtonPreview extends Uz._ButtonReportCommon {
        private static DEFAULT_LABEL;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public createDomElement($parentElement, isDesignMode: boolean): any;
        public getEditablePropertyInfo(): any;
        private onClick_btnPreview();
        private publish();
        private doAfterPrint();
        public showDialog(reportId: string, reportIndex: number): Window;
        public getPrintType(): number;
    }
}
declare module Uz {
    class _ButtonPrint extends Uz._ButtonReportCommon {
        private static DEFAULT_LABEL;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public createDomElement($parentElement, isDesignMode: boolean): any;
        public getEditablePropertyInfo(): any;
        private onClick_btnPrint();
        private publish();
        public showDialog(reportId: string, reportIndex: number, type: number): Window;
        public getPrintType(): number;
    }
}
declare module Uz {
    class _ButtonPrinter extends Uz._ButtonReportCommon {
        private static DEFAULT_LABEL;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public createDomElement($parentElement, isDesignMode: boolean): any;
        public getEditablePropertyInfo(): any;
        private onClick_btnPrinter();
        public showDialog(reportId: string): Window;
        public getPrintType(): number;
    }
}
declare module Uz {
    class _ButtonReportPublish extends Uz._ButtonReportCommon {
        private static DEFAULT_LABEL;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public createDomElement($parentElement, isDesignMode: boolean): any;
        public getEditablePropertyInfo(): any;
        private onClick_btnReportPublish();
        private publish();
        private doAfterPrint();
        public showDialog(reportId: string, reportIndex: number): Window;
        public getPrintType(): number;
    }
}
declare module Uz {
    class _ButtonPublish extends Uz._ViewControl {
        private static DEFAULT_TEXT;
        private static DEFAULT_PRINTDIALOGURL;
        private _text;
        private _postParameterPanelNames;
        private _validateUrl;
        private _sourceCreateUrl;
        private _afterPrintUrl;
        private _isPreview;
        private _onAfterPrint;
        public text : string;
        public postParameterPanelNames : Object[];
        public validateUrl : string;
        public sourceCreateUrl : string;
        public afterPrintUrl : string;
        public isPreview : boolean;
        public onAfterPrint : string;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc?: Function);
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLButtonElement;
        public getEditablePropertyInfo(): any;
        private printDialog();
        public bindData(data: any): void;
    }
}
declare module Uz {
    class _ListControl extends Uz._ViewControl {
        private _dataSource;
        private _selectedItem;
        private _onChange;
        private _required;
        public dataSource : ListControlDataPair[];
        public updateUIforDataSource(): void;
        private addDefaultDataSource();
        public onChange : string;
        public selectedItem : string;
        public _getSelectedItemCore(): ListControlDataPair;
        private __selectedItemForBeforeBindingDataSource;
        public updateUIForSelectedItem(value: string): void;
        public required : boolean;
        constructor($parentElement: JQuery, isDesignMode: boolean, createDomElementFunc: Function);
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        public changeWidth(): void;
        public registProperty(): void;
        public createIDWithKey(key: string): string;
        public getEditablePropertyInfo(): any;
        private createDataSourceColumnInfo();
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
    }
    class ListControlDataPair {
        public key: string;
        public value: string;
        constructor(key: string, value: string);
    }
}
declare module Uz {
    class _ListControlUtil {
        static createLabelFor(htmlElement, key): HTMLLabelElement;
        static createIDForItemInDiv(divID: string, itemKey: string): string;
    }
}
declare module Uz {
    class _DropDownList extends Uz._ListControl {
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private static DEFAULT_LABELR_ID;
        private _coreDom;
        private _labelLDom;
        private _labelRDom;
        private _labelLText;
        private _labelRText;
        private _labelLWidth;
        private _labelRWidth;
        private _labelLAlign;
        private _labelRAlign;
        private _onFocus;
        private _onBlur;
        public onFocus : string;
        public onBlur : string;
        public labelLText : string;
        public labelRText : string;
        private createLabelElement(className);
        public labelLWidth : any;
        public labelRWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        public labelRAlign : Uz.Align;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        public changeWidth(): void;
        private resizeOuterDiv();
        private getCoreID();
        private getLabelLID();
        private getLabelRID();
        public updateUIForSelectedItem(selectedItem: string): void;
        public registProperty(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public updateUIforDataSource(): void;
        public _getSelectedItemCore(): Uz.ListControlDataPair;
        private createDropDownList();
        private createOption(key, value);
        public getEditablePropertyInfo(): any;
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        private getJQueryLabelLElement();
        private getJQueryLabelRElement();
        public bindData(data: any): void;
        public validateControl(): any;
        public validateRequired(): any;
    }
}
declare module Uz {
    class _CheckBoxList extends Uz._ListControl {
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private _coreDom;
        private _labelLDom;
        private _labelLText;
        private _labelLWidth;
        private _labelLAlign;
        private _onClick;
        private _newLineItemNumber;
        private _minCheckedItem;
        private _maxCheckedItem;
        private _selectedItems;
        private _spaceSize;
        private _isAllSelectable;
        private _isAllSelectStatus;
        private _isIndeterminateStatus;
        public selectedItems : Uz.ListControlDataPair[];
        public onClick : string;
        public newLineItemNumber : number;
        public minCheckedItem : number;
        public maxCheckedItem : number;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public spaceSize : any;
        public labelLText : string;
        private updateLabelLText(value);
        private createLabelElement(className);
        public labelLWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        private getLabelLID();
        public isAllSelectable : boolean;
        public isAllSelectStatus : boolean;
        public isIndeterminateStatus : boolean;
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private getJQueryLabelLElement();
        private resizeOuterDiv();
        public updateUIForSelectedItem(value: string): void;
        private updateSelectedItems();
        private updateSelectedItemsAll();
        private updateOfIsAllSelectStatusNoChange();
        private isIndeterminateTrueToFalse();
        private setIndeterminate(isIndeterminate);
        private setAllSelect(isAllSelect, $Element);
        public registProperty(): void;
        public changeWidth(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public updateUIforDataSource(): void;
        private createCheckBoxListEvent();
        private createCheckBoxList();
        private crieateAllSelectCheckBox(element);
        private createCheckBox(key, value);
        private createCheckBoxSpan(className);
        public getEditablePropertyInfo(): any;
        private createTextBoxDisabledProperty(editablePropertyInfo, keyName, value, enabled?);
        private createSelectedItemsColumnInfo();
        public bindData(data: any): void;
        public validateControl(): any;
        public validateRequired(): any;
        public validateMaxSelect(): any;
        public validateMinSelect(): any;
        public getOutputParameter(): any;
        public setOutputParameter(value: any): void;
        private getCoreID();
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        public toggleDisabledAttribute(): void;
    }
}
declare module Uz {
    class _RadioButton extends Uz._ListControl {
        private static DEFAULT_CORE_ID;
        private static DEFAULT_LABELL_ID;
        private _coreDom;
        private _labelLDom;
        private _labelLText;
        private _labelLWidth;
        private _labelLAlign;
        private _groupName;
        private _onClick;
        private _newLineItemNumber;
        private _spaceSize;
        public fieldNameChanged(beforeFieldName, newFieldName): void;
        public groupName : string;
        private updateUIForGroupName();
        public onClick : string;
        public newLineItemNumber : number;
        public spaceSize : any;
        public labelLText : string;
        private updateLabelLText(value);
        private createLabelElement(className);
        public labelLWidth : any;
        private decideWidth(element, beforeWidth, afterWidth);
        public labelLAlign : Uz.Align;
        private getLabelLID();
        constructor($parentElement: JQuery, isDesignMode: boolean);
        private getGroupName();
        private getJQueryLabelLElement();
        private resizeOuterDiv();
        public registProperty(): void;
        public updateUIForSelectedItem(selectedItem: string): void;
        public _getSelectedItemCore(): Uz.ListControlDataPair;
        public changeWidth(): void;
        public createDomElement($parentElement, isDesignMode: boolean): HTMLDivElement;
        public updateUIforDataSource(): void;
        private createRadioButtonEvent();
        private createRadioButton();
        private createRdaioButtonDom(key, value);
        private createButtonSpan(className);
        public getEditablePropertyInfo(): any;
        public bindData(data: any): void;
        public validateControl(): any;
        public validateRequired(): any;
        private getCoreID();
        public getJQueryElement(isCoreElement?: boolean): JQuery;
        public toggleDisabledAttribute(): void;
    }
}