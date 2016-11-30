/// <reference path="../../d.ts/jquery.d.ts" />
/// <reference path="../../d.ts/UzViewControls.d.ts" />
/// <reference path="../../d.ts/UzaConverter.d.ts" />

module DBZ {

     export module ChosaTokkiShiryoShokai {

        export class Events {

            public static onChange_radGenpoMask(): string {
                return "onChange_radGenpoMask";
            }

        }

        export class Controls {
            private _myName: string;

            public static myType(): string {
                return "ChosaTokkiShiryoShokai";
            }

            constructor(fieldName: string) {
                this._myName = fieldName;
            }

            public convFiledNameSelf(): string {
                return this._myName + "_" + DBZ.ChosaTokkiShiryoShokai.Controls.myType();
            }

            public convFiledName(fieldName: string): string {
                return this._myName + "_" + DBZ.ChosaTokkiShiryoShokai.Controls.myType() + "_" + fieldName;
            }

            public ChosaTokkiShiryoShokai(): UZA.Panel {
                return new UZA.Panel(this.convFiledNameSelf());
            }

            public radGenpoMask(): UZA.RadioButton {
                return new UZA.RadioButton(this.convFiledName("radGenpoMask"));
            }

            public genpoTabContainer(): UZA.TabContainer {
                return new UZA.TabContainer(this.convFiledName("genpoTabContainer"));
            }

            public genpoTabPanel1(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel1"));
            }

            public imgGenpo1(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo1"));
            }

            public genpoTabPanel2(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel2"));
            }

            public imgGenpo2(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo2"));
            }

            public genpoTabPanel3(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel3"));
            }

            public imgGenpo3(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo3"));
            }

            public genpoTabPanel4(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel4"));
            }

            public imgGenpo4(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo4"));
            }

            public genpoTabPanel5(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel5"));
            }

            public imgGenpo5(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo5"));
            }

            public genpoTabPanel6(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel6"));
            }

            public imgGenpo6(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo6"));
            }

            public genpoTabPanel7(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel7"));
            }

            public imgGenpo7(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo7"));
            }

            public genpoTabPanel8(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("genpoTabPanel8"));
            }

            public imgGenpo8(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgGenpo8"));
            }

            public maskTabContainer(): UZA.TabContainer {
                return new UZA.TabContainer(this.convFiledName("maskTabContainer"));
            }

            public maskTabPanel1(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel1"));
            }

            public imgMask1(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask1"));
            }

            public maskTabPanel2(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel2"));
            }

            public imgMask2(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask2"));
            }

            public maskTabPanel3(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel3"));
            }

            public imgMask3(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask3"));
            }

            public maskTabPanel4(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel4"));
            }

            public imgMask4(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask4"));
            }

            public maskTabPanel5(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel5"));
            }

            public imgMask5(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask5"));
            }

            public maskTabPanel6(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel6"));
            }

            public imgMask6(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask6"));
            }

            public maskTabPanel7(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel7"));
            }

            public imgMask7(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask7"));
            }

            public maskTabPanel8(): UZA.TabPanel {
                return new UZA.TabPanel(this.convFiledName("maskTabPanel8"));
            }

            public imgMask8(): UZA.StaticImage {
                return new UZA.StaticImage(this.convFiledName("imgMask8"));
            }

        }

     }

}

