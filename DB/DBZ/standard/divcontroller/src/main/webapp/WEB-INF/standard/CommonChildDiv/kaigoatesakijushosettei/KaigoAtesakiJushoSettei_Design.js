var DBZ;
(function (DBZ) {
    (function (KaigoAtesakiJushoSettei) {
        var Events = (function () {
            function Events() {
            }
            Events.onChange_radJushoSettei = function () {
                return "onChange_radJushoSettei";
            };

            Events.onOkClose_radJushoSettei = function () {
                return "onOkClose_radJushoSettei";
            };
            return Events;
        })();
        KaigoAtesakiJushoSettei.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "KaigoAtesakiJushoSettei";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBZ.KaigoAtesakiJushoSettei.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBZ.KaigoAtesakiJushoSettei.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.KaigoAtesakiJushoSettei = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.radJushoSettei = function () {
                return new UZA.RadioButton(this.convFiledName("radJushoSettei"));
            };

            Controls.prototype.btnAtesakiJushoSettei = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnAtesakiJushoSettei"));
            };

            Controls.prototype.txtAtesakiJushoSettei = function () {
                return new UZA.TextBox(this.convFiledName("txtAtesakiJushoSettei"));
            };
            return Controls;
        })();
        KaigoAtesakiJushoSettei.Controls = Controls;
    })(DBZ.KaigoAtesakiJushoSettei || (DBZ.KaigoAtesakiJushoSettei = {}));
    var KaigoAtesakiJushoSettei = DBZ.KaigoAtesakiJushoSettei;
})(DBZ || (DBZ = {}));
