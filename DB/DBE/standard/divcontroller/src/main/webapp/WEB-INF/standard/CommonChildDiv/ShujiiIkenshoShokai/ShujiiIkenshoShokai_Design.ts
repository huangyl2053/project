/// <reference path="../../d.ts/jquery.d.ts" />
/// <reference path="../../d.ts/UzViewControls.d.ts" />
/// <reference path="../../d.ts/UzaConverter.d.ts" />
// <reference path="../../d.ts/DBZCommonChildDiv.d.ts" />

module DBE {

     export module ShujiiIkenshoShokai {

        export class Events {

            public static onClick_btnReturn(): string {
                return "onClick_btnReturn";
            }

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "ShujiiIkenshoShokai";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBE.ShujiiIkenshoShokai.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBE.ShujiiIkenshoShokai.Controls.myType() + "_" + fieldName;
            }

            public ShujiiIkenshoShokai(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public txtJiritsudo(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtJiritsudo"));
            }

            public txtTankiKioku(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtTankiKioku"));
            }

            public txtNinchiNoryoku(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtNinchiNoryoku"));
            }

            public txtDentatsuNoryoku(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtDentatsuNoryoku"));
            }

            public txtShokujiKoi(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtShokujiKoi"));
            }

            public txtTest(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtTest"));
            }

            public txtTest2(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtTest2"));
            }

            public txtTest3(): UZA.TextBox {
                return new UZA.TextBox(this.convFiledName("txtTest3"));
            }

            //public CcdChosaTokkiShiryoShokai(): DBZ.ChosaTokkiShiryoShokai.ModeController {
            //    return new DBZ.ChosaTokkiShiryoShokai.ModeController(this.convFiledName("CcdChosaTokkiShiryoShokai"));
            //}

            public btnReturn(): UZA.Button {
                return new UZA.Button(this.convFiledName("btnReturn"));
            }

        }

     }

}

