var DBZ;
(function (DBZ) {
    (function (SogoShokaiKyotakuServiceKeikakuInfo) {
        var Events = (function () {
            function Events() {
            }
            Events.onClick_btnClose = function () {
                return "onClick_btnClose";
            };
            return Events;
        })();
        SogoShokaiKyotakuServiceKeikakuInfo.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "SogoShokaiKyotakuServiceKeikakuInfo";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBZ.SogoShokaiKyotakuServiceKeikakuInfo.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBZ.SogoShokaiKyotakuServiceKeikakuInfo.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.SogoShokaiKyotakuServiceKeikakuInfo = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.txtKeikakuTodokedeYMD = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKeikakuTodokedeYMD"));
            };

            Controls.prototype.txtKeikakuHenkoYMD = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKeikakuHenkoYMD"));
            };

            Controls.prototype.txtKeikakuJigyoshaShurui = function () {
                return new UZA.TextBox(this.convFiledName("txtKeikakuJigyoshaShurui"));
            };

            Controls.prototype.txtKeikakuJigyoshaNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtKeikakuJigyoshaNo"));
            };

            Controls.prototype.txtKeikakuJigyoshaName = function () {
                return new UZA.TextBox(this.convFiledName("txtKeikakuJigyoshaName"));
            };

            Controls.prototype.txtKeikakuServiceShurui = function () {
                return new UZA.TextBox(this.convFiledName("txtKeikakuServiceShurui"));
            };

            Controls.prototype.txtKeikakuSakuseiKubun = function () {
                return new UZA.TextBox(this.convFiledName("txtKeikakuSakuseiKubun"));
            };

            Controls.prototype.txtKeikakuYM = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKeikakuYM"));
            };

            Controls.prototype.txtKeikakuKikan = function () {
                return new UZA.TextBoxDateRange(this.convFiledName("txtKeikakuKikan"));
            };

            Controls.prototype.btnClose = function () {
                return new UZA.Button(this.convFiledName("btnClose"));
            };
            return Controls;
        })();
        SogoShokaiKyotakuServiceKeikakuInfo.Controls = Controls;
    })(DBZ.SogoShokaiKyotakuServiceKeikakuInfo || (DBZ.SogoShokaiKyotakuServiceKeikakuInfo = {}));
    var SogoShokaiKyotakuServiceKeikakuInfo = DBZ.SogoShokaiKyotakuServiceKeikakuInfo;
})(DBZ || (DBZ = {}));