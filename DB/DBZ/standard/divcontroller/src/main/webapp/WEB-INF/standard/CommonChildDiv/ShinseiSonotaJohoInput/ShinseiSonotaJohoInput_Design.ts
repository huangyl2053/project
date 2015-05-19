/// <reference path="../../d.ts/jquery.d.ts" />
/// <reference path="../../d.ts/UzViewControls.d.ts" />
/// <reference path="../../d.ts/UzaConverter.d.ts" />

module DBZ {

     export module ShinseiSonotaJohoInput {

        export class Events {

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "ShinseiSonotaJohoInput";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBZ.ShinseiSonotaJohoInput.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBZ.ShinseiSonotaJohoInput.Controls.myType() + "_" + fieldName;
            }

            public ShinseiSonotaJohoInput(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public ddlIdoJiyu(): UZA.DropDownList {
                return new UZA.DropDownList(this.convFiledName("ddlIdoJiyu"));
            }

            public ddlSakujoJiyu(): UZA.DropDownList {
                return new UZA.DropDownList(this.convFiledName("ddlSakujoJiyu"));
            }

            public txtRiyu(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtRiyu"));
            }

            public txtSoshitsuDay(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtSoshitsuDay"));
            }

            public txtTorikeshiDay(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtTorikeshiDay"));
            }

            public txtToshoNinteiKikanFrom(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtToshoNinteiKikanFrom"));
            }

            public txtToshoNinteiKikanTo(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtToshoNinteiKikanTo"));
            }

            public lblJukyuShikakuShomeisho(): UZA.Label {
                return new UZA.Label(this.convFiledName("lblJukyuShikakuShomeisho"));
            }

            public txtJukyuShikakuHakkoDay1(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtJukyuShikakuHakkoDay1"));
            }

            public txtJukyuShikakuHakkoDay2(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtJukyuShikakuHakkoDay2"));
            }

        }

     }

}

