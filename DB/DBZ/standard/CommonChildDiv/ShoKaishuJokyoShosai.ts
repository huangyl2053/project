﻿/// <reference path="../d.ts/jquery.d.ts" />
/// <reference path="../d.ts/UzViewControls.d.ts" />
/// <reference path="../d.ts/UzaConverter.d.ts" />

/// <reference path='ShoKaishuJokyoShosai_Design.ts' />
module DBZ
{
    export module ShoKaishuJokyoShosai
    {
        export class ModeController {
            private controls: Controls;
            private fieldName: string;

            constructor(fieldName: string) {
                this.fieldName = fieldName;
                this.controls = new Controls(fieldName);
            }

            public priorities(): Array {
                return [
                    "表示方法"
                ];
            }

            public Properties() {
                return new UZA.CommonChildDiv(this.fieldName);
            }

            public 表示方法() {
                return new Modes.表示方法(this.controls);
            }
        }

        export module Modes {

            export class 表示方法 {
                private controls: Controls;

                constructor(controls: Controls) {
                    this.controls = controls;
                }

                public 照会(): void {
                    this.controls.ShoKaishuJokyoShosai().disabled = true;
                }

                public 入力(): void {
                    this.controls.ShoKaishuJokyoShosai().disabled = false;
                }
            }

        }
    }
}
