/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />

module DBC {

     export module ServiceTeikyoShomeishoShinryoListH1503 {

        export class Events {

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "ServiceTeikyoShomeishoShinryoListH1503";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBC.ServiceTeikyoShomeishoShinryoListH1503.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBC.ServiceTeikyoShomeishoShinryoListH1503.Controls.myType() + "_" + fieldName;
            }

            public ServiceTeikyoShomeishoShinryoListH1503(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public btnAdd(): UZA.Button {
                return new UZA.Button(this.convFiledName("btnAdd"));
            }

            public dgServiceTeikyoShomeishoShinryoListH1503(): UZA.DataGrid {
                return new UZA.DataGrid(this.convFiledName("dgServiceTeikyoShomeishoShinryoListH1503"));
            }

        }

     }

}
