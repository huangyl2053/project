var DBB;
(function (DBB) {
    (function (FukaRirekiAll) {
        var Events = (function () {
            function Events() {
            }
            Events.onSelectByDblClick_dgFukaRirekiAll = function () {
                return "onSelectByDblClick_dgFukaRirekiAll";
            };

            Events.onSelectBySelectButton_dgFukaRirekiAll = function () {
                return "onSelectBySelectButton_dgFukaRirekiAll";
            };

            Events.onAfterRequestByDblClick_dgFukaRirekiAll = function () {
                return "onAfterRequestByDblClick_dgFukaRirekiAll";
            };

            Events.onAfterRequestBySelectButton_dgFukaRirekiAll = function () {
                return "onAfterRequestBySelectButton_dgFukaRirekiAll";
            };
            return Events;
        })();
        FukaRirekiAll.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "FukaRirekiAll";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBB.FukaRirekiAll.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBB.FukaRirekiAll.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.FukaRirekiAll = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.dgFukaRirekiAll = function () {
                return new UZA.DataGrid(this.convFiledName("dgFukaRirekiAll"));
            };
            return Controls;
        })();
        FukaRirekiAll.Controls = Controls;
    })(DBB.FukaRirekiAll || (DBB.FukaRirekiAll = {}));
    var FukaRirekiAll = DBB.FukaRirekiAll;
})(DBB || (DBB = {}));