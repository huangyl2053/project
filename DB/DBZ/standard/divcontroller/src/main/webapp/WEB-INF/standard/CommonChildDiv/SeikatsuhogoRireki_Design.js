var DBZ;
(function (DBZ) {
    (function (SeikatsuhogoRireki) {
        var Events = (function () {
            function Events() {
            }
            Events.onOk_Cancel = function () {
                return "onOk_Cancel";
            };

            Events.onbtn_AddRow = function () {
                return "onbtn_AddRow";
            };
            return Events;
        })();
        SeikatsuhogoRireki.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "SeikatsuhogoRireki";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBZ.SeikatsuhogoRireki.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBZ.SeikatsuhogoRireki.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.SeikatsuhogoRireki = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.btnAddRow = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnAddRow"));
            };

            Controls.prototype.dgSeikatsuhogoRireki = function () {
                return new UZA.DataGrid(this.convFiledName("dgSeikatsuhogoRireki"));
            };
            return Controls;
        })();
        SeikatsuhogoRireki.Controls = Controls;
    })(DBZ.SeikatsuhogoRireki || (DBZ.SeikatsuhogoRireki = {}));
    var SeikatsuhogoRireki = DBZ.SeikatsuhogoRireki;
})(DBZ || (DBZ = {}));
