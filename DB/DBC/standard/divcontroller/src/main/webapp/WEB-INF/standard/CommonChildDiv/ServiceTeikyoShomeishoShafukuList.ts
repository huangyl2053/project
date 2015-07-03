/// <reference path="ServiceTeikyoShomeishoShafukuList_Design.ts" />

// 共有子Divモード記述TypeScriptソースです。

module DBC
{
    export module ServiceTeikyoShomeishoShafukuList {

        export class ModeController{
            private controls: Controls;
            private fieldName: string;

            constructor(fieldName: string) {
                this.fieldName = fieldName;
                this.controls = new Controls(fieldName);
            }
 
            public priorities(): Array<string> {
                return [];
            }

            public Properties() {
                return new UZA.CommonChildDiv(this.fieldName);
            }
        }

    }
}



module DBC {

    export module ServiceTeikyoShomeishoShafukuList {

        export class PublicProperties {
            private controls: Controls;

            constructor(fieldName: string) {
                this.controls = new Controls(fieldName);
            }

            public getEditTypes(): UZA.EditTypeForPublicProperty {
                var editTypes = new UZA.EditTypeForPublicProperty();

                editTypes.addEditType("AddButtonVisible", UZA.EditTypeEnumForPublicProperty.BooleanType);
                editTypes.addEditType("AddButtonDisplayNone", UZA.EditTypeEnumForPublicProperty.BooleanType);
                editTypes.addEditType("AddButtonOnClick", UZA.EditTypeEnumForPublicProperty.StringType);
                editTypes.addEditType("MeisaiListHeight", UZA.EditTypeEnumForPublicProperty.StringType);
                editTypes.addEditType("MeisaiListOnSelect", UZA.EditTypeEnumForPublicProperty.StringType);
                editTypes.addEditType("MeisaiListOnSelectByDblClick", UZA.EditTypeEnumForPublicProperty.StringType);
                return editTypes;
            }

            public getAddButtonVisible() {
                return this.controls.btnAdd().visible;
            }

            public setAddButtonVisible(value) {
                this.controls.btnAdd().visible = value;
            }

            public getAddButtonDisplayNone() {
                return this.controls.btnAdd().displayNone;
            }

            public setAddButtonDisplayNone(value) {
                this.controls.btnAdd().displayNone = value;
            }

            public getAddButtonOnClick() {
                return this.controls.btnAdd().onClick;
            }

            public setAddButtonOnClick(value) {
                this.controls.btnAdd().onClick = value;
            }
            
            /*
            //TODO n8178 城間篤人 モード化するか削除するか作成者の判断が必要。
            public getMeisaiListGridSetting() {
                return this.controls.dgServiceTeikyoShomeishoShafukuList().gridSetting;
            }

            public setMeisaiListGridSetting(value) {
                this.controls.dgServiceTeikyoShomeishoShafukuList().gridSetting = value;
            }
            */

            public getMeisaiListHeight() {
                return this.controls.dgServiceTeikyoShomeishoShafukuList().height;
            }

            public setMeisaiListHeight(value) {
                this.controls.dgServiceTeikyoShomeishoShafukuList().height = value;
            }

            public getMeisaiListOnSelect() {
                return this.controls.dgServiceTeikyoShomeishoShafukuList().onSelect;
            }

            public setMeisaiListOnSelect(value) {
                this.controls.dgServiceTeikyoShomeishoShafukuList().onSelect = value;
            }

            public getMeisaiListOnSelectByDblClick() {
                return this.controls.dgServiceTeikyoShomeishoShafukuList().onSelectByDblClick;
            }

            public setMeisaiListOnSelectByDblClick(value) {
                this.controls.dgServiceTeikyoShomeishoShafukuList().onSelectByDblClick = value;
            }

        }
    }
}



