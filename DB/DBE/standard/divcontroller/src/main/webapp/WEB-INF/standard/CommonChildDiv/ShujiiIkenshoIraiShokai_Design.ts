/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />

module DBE {

     export module ShujiiIkenshoIraiShokai {

        export class Events {

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "ShujiiIkenshoIraiShokai";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBE.ShujiiIkenshoIraiShokai.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBE.ShujiiIkenshoIraiShokai.Controls.myType() + "_" + fieldName;
            }

            public ShujiiIkenshoIraiShokai(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public KaigoShikakuKihonDummy(): UZA.Panel {
                return new UZA.Panel(this.convFiledName("KaigoShikakuKihonDummy"));
            }

            public spSpace(): UZA.Space {
                return new UZA.Space(this.convFiledName("spSpace"));
            }

            public dgIkenshoIraiShujiiIchiran(): UZA.DataGrid {
                return new UZA.DataGrid(this.convFiledName("dgIkenshoIraiShujiiIchiran"));
            }

        }

     }

}
