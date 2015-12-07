var DBA;
(function (DBA) {
    (function (TaJushochiTokureishaKanri) {
        var Events = (function () {
            function Events() {
            }
            return Events;
        })();
        TaJushochiTokureishaKanri.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "TaJushochiTokureishaKanri";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBA.TaJushochiTokureishaKanri.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBA.TaJushochiTokureishaKanri.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.TaJushochiTokureishaKanri = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.btnAdd = function () {
                return new UZA.Button(this.convFiledName("btnAdd"));
            };

            Controls.prototype.dgJushochiTokureiRireki = function () {
                return new UZA.DataGrid(this.convFiledName("dgJushochiTokureiRireki"));
            };

            Controls.prototype.TajushochiTokureiInput = function () {
                return new UZA.Panel(this.convFiledName("TajushochiTokureiInput"));
            };

            Controls.prototype.txtNyusyobi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNyusyobi"));
            };

            Controls.prototype.txtTekiyobi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtTekiyobi"));
            };

            Controls.prototype.txtTekiyoTodokedebi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtTekiyoTodokedebi"));
            };

            Controls.prototype.ddlTekiyoJiyo = function () {
                return new UZA.DropDownList(this.convFiledName("ddlTekiyoJiyo"));
            };

            Controls.prototype.txtTasyobi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtTasyobi"));
            };

            Controls.prototype.txtKaijyobi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKaijyobi"));
            };

            Controls.prototype.txtKaijyoTodokedebi = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtKaijyoTodokedebi"));
            };

            Controls.prototype.ddlKaijyoJiyo = function () {
                return new UZA.DropDownList(this.convFiledName("ddlKaijyoJiyo"));
            };

            Controls.prototype.panSotimotoJyoho = function () {
                return new UZA.Panel(this.convFiledName("panSotimotoJyoho"));
            };

            Controls.prototype.txtHihoNo = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtHihoNo"));
            };

            Controls.prototype.panShisetsuJoho = function () {
                return new UZA.Panel(this.convFiledName("panShisetsuJoho"));
            };

            Controls.prototype.btnKakunin = function () {
                return new UZA.Button(this.convFiledName("btnKakunin"));
            };
            return Controls;
        })();
        TaJushochiTokureishaKanri.Controls = Controls;
    })(DBA.TaJushochiTokureishaKanri || (DBA.TaJushochiTokureishaKanri = {}));
    var TaJushochiTokureishaKanri = DBA.TaJushochiTokureishaKanri;
})(DBA || (DBA = {}));