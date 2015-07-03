/// <reference path='NinteiShinseishaFinder_Design.ts' />
module DBZ
{
    export module NinteiShinseishaFinder
    {
        export class ModeController {
            private controls: Controls;
            private fieldName: string;

            constructor(fieldName: string) {
                this.fieldName = fieldName;
                this.controls = new Controls(fieldName);
            }

            public Properties() {
                return new UZA.CommonChildDiv(this.fieldName);
            }

            public PublicProperties() {
                return new PublicProperties(this.fieldName);
            }
            public DisplayType() {
                return new Modes.DisplayType(this.controls);
            }
        }

        export module Modes {
            export class DisplayType {
                private controls: Controls;

                constructor(controls: Controls) {
                    this.controls = controls;
                }

                public StandardMode(): void {
                    this.controls.ShosaiJoken().isOpen = false;
                    this.controls.KihonJoho().isOpen = true;
                    this.controls.NinteiChosa().isOpen = false;
                    this.controls.ShujiiJoho().isOpen = false;
                    this.controls.IchijiHantei().isOpen = false;
                    this.controls.KaigoNinteiShinsakaiJoho().isOpen = false;
                    this.controls.ZenkaiJoho().isOpen = false;
                    this.controls.SonotaJoho().isOpen = false;
                    this.controls.KanryoJoho().isOpen = false;
                }
                public PhaseMode(): void {
                    this.controls.ShosaiJoken().isOpen = false;
                    this.controls.KihonJoho().isOpen = true;
                    this.controls.NinteiChosa().isOpen = false;
                    this.controls.ShujiiJoho().isOpen = false;
                    this.controls.IchijiHantei().isOpen = false;
                    this.controls.KaigoNinteiShinsakaiJoho().isOpen = false;
                    this.controls.ZenkaiJoho().isOpen = false;
                    this.controls.SonotaJoho().isOpen = false;
                    this.controls.KanryoJoho().isOpen = true;
                }

                public NinteiChosaMode(): void {
                    this.controls.ShosaiJoken().isOpen = false;
                    this.controls.KihonJoho().isOpen = true;
                    this.controls.NinteiChosa().isOpen = true;
                    this.controls.ShujiiJoho().isOpen = false;
                    this.controls.IchijiHantei().isOpen = false;
                    this.controls.KaigoNinteiShinsakaiJoho().isOpen = false;
                    this.controls.ZenkaiJoho().isOpen = false;
                    this.controls.SonotaJoho().isOpen = false;
                    this.controls.KanryoJoho().isOpen = false;
                }
                
                public IkenshoMode(): void {
                    this.controls.ShosaiJoken().isOpen = false;
                    this.controls.KihonJoho().isOpen = true;
                    this.controls.NinteiChosa().isOpen = false;
                    this.controls.ShujiiJoho().isOpen = true;
                    this.controls.IchijiHantei().isOpen = false;
                    this.controls.KaigoNinteiShinsakaiJoho().isOpen = false;
                    this.controls.ZenkaiJoho().isOpen = false;
                    this.controls.SonotaJoho().isOpen = false;
                    this.controls.KanryoJoho().isOpen = false;
                }
                public ShinsakaiMode(): void {
                    this.controls.ShosaiJoken().isOpen = false;
                    this.controls.KihonJoho().isOpen = true;
                    this.controls.NinteiChosa().isOpen = false;
                    this.controls.ShujiiJoho().isOpen = false;
                    this.controls.IchijiHantei().isOpen = true;
                    this.controls.KaigoNinteiShinsakaiJoho().isOpen = true;
                    this.controls.ZenkaiJoho().isOpen = false;
                    this.controls.SonotaJoho().isOpen = false;
                    this.controls.KanryoJoho().isOpen = false;
                }

            }
        }
    }
}

module DBZ
{
    export module NinteiShinseishaFinder
    {
        export class PublicProperties {
            private controls: Controls;
            private fieldName: string;

            constructor(fieldName: string) {
                this.fieldName = fieldName;
                this.controls = new Controls(fieldName);
            }

            public getEditTypes(): UZA.EditTypeForPublicProperty {
                var editTypes = new UZA.EditTypeForPublicProperty();

                return editTypes;
            }
        }
    }
}
