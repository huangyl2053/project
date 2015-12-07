/// <reference path="../../d.ts/jquery.d.ts" />
/// <reference path="../../d.ts/UzViewControls.d.ts" />
/// <reference path="../../d.ts/UzaConverter.d.ts" />
// <reference path="../../d.ts/DBZCommonChildDiv.d.ts" />

module DBA {

     export module TaJushochiTokureishaKanri {

        export class Events {

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "TaJushochiTokureishaKanri";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBA.TaJushochiTokureishaKanri.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBA.TaJushochiTokureishaKanri.Controls.myType() + "_" + fieldName;
            }

            public TaJushochiTokureishaKanri(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public btnAdd(): UZA.Button {
                return new UZA.Button(this.convFiledName("btnAdd"));
            }

            public dgJushochiTokureiRireki(): UZA.DataGrid {
                return new UZA.DataGrid(this.convFiledName("dgJushochiTokureiRireki"));
            }

            public TajushochiTokureiInput(): UZA.Panel {
                return new UZA.Panel(this.convFiledName("TajushochiTokureiInput"));
            }

            public txtNyusyobi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtNyusyobi"));
            }

            public txtTekiyobi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtTekiyobi"));
            }

            public txtTekiyoTodokedebi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtTekiyoTodokedebi"));
            }

            public ddlTekiyoJiyo(): UZA.DropDownList {
                return new UZA.DropDownList(this.convFiledName("ddlTekiyoJiyo"));
            }

            public txtTasyobi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtTasyobi"));
            }

            public txtKaijyobi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtKaijyobi"));
            }

            public txtKaijyoTodokedebi(): UZA.TextBoxDate {
                return new UZA.TextBoxDate(this.convFiledName("txtKaijyoTodokedebi"));
            }

            public ddlKaijyoJiyo(): UZA.DropDownList {
                return new UZA.DropDownList(this.convFiledName("ddlKaijyoJiyo"));
            }

            public panSotimotoJyoho(): UZA.Panel {
                return new UZA.Panel(this.convFiledName("panSotimotoJyoho"));
            }

            public txtHihoNo(): UZA.TextBoxCode {
                return new UZA.TextBoxCode(this.convFiledName("txtHihoNo"));
            }

            //public ccdHokensha(): DBZ.HokenshaJoho.ModeController {
            //    return new DBZ.HokenshaJoho.ModeController(this.convFiledName("ccdHokensha"));
            //}

            public panShisetsuJoho(): UZA.Panel {
                return new UZA.Panel(this.convFiledName("panShisetsuJoho"));
            }

            //public ccdShisetsuJoho(): DBZ.shisetsuJohoCommonChildDiv.ModeController {
            //    return new DBZ.shisetsuJohoCommonChildDiv.ModeController(this.convFiledName("ccdShisetsuJoho"));
            //}

            public btnKakunin(): UZA.Button {
                return new UZA.Button(this.convFiledName("btnKakunin"));
            }

        }

     }

}
