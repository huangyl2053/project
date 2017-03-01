var DBE;
(function (DBE) {
    (function (ShujiiIkenshoShokai) {
        var Events = (function () {
            function Events() {
            }
            Events.onClick_btnReturn = function () {
                return "onClick_btnReturn";
            };
            return Events;
        })();
        ShujiiIkenshoShokai.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "ShujiiIkenshoShokai";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBE.ShujiiIkenshoShokai.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBE.ShujiiIkenshoShokai.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.ShujiiIkenshoShokai = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.ShujiiIryokikaknAndShujiiInput = function () {
                return new UZA.Panel(this.convFiledName("ShujiiIryokikaknAndShujiiInput"));
            };

            Controls.prototype.txtShujiiIryoKikanCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtShujiiIryoKikanCode"));
            };

            Controls.prototype.txtShujiiIryoKikanName = function () {
                return new UZA.TextBox(this.convFiledName("txtShujiiIryoKikanName"));
            };

            Controls.prototype.txtShujiiCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtShujiiCode"));
            };

            Controls.prototype.txtShujiiName = function () {
                return new UZA.TextBox(this.convFiledName("txtShujiiName"));
            };

            Controls.prototype.txtShogaiJiritsudo = function () {
                return new UZA.TextBox(this.convFiledName("txtShogaiJiritsudo"));
            };

            Controls.prototype.txtNinchishoJiritsudo = function () {
                return new UZA.TextBox(this.convFiledName("txtNinchishoJiritsudo"));
            };

            Controls.prototype.txtTankiKioku = function () {
                return new UZA.TextBox(this.convFiledName("txtTankiKioku"));
            };

            Controls.prototype.txtNinchiNoryoku = function () {
                return new UZA.TextBox(this.convFiledName("txtNinchiNoryoku"));
            };

            Controls.prototype.txtDentatsuNoryoku = function () {
                return new UZA.TextBox(this.convFiledName("txtDentatsuNoryoku"));
            };

            Controls.prototype.txtShokujiKoi = function () {
                return new UZA.TextBox(this.convFiledName("txtShokujiKoi"));
            };

            Controls.prototype.btnReturn = function () {
                return new UZA.Button(this.convFiledName("btnReturn"));
            };
            return Controls;
        })();
        ShujiiIkenshoShokai.Controls = Controls;
    })(DBE.ShujiiIkenshoShokai || (DBE.ShujiiIkenshoShokai = {}));
    var ShujiiIkenshoShokai = DBE.ShujiiIkenshoShokai;
})(DBE || (DBE = {}));
