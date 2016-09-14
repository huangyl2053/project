var DBA;
(function (DBA) {
    (function (IryoHokenRirekiDialogButton) {
        var ModeController = (function () {
            function ModeController(fieldName) {
                this.fieldName = fieldName;
                this.controls = new IryoHokenRirekiDialogButton.Controls(fieldName);
            }
            ModeController.prototype.Properties = function () {
                return new UZA.CommonChildDiv(this.fieldName);
            };

            ModeController.prototype.PublicProperties = function () {
                return new IryoHokenRirekiDialogButton.PublicProperties(this.fieldName);
            };
            return ModeController;
        })();
        IryoHokenRirekiDialogButton.ModeController = ModeController;
    })(DBA.IryoHokenRirekiDialogButton || (DBA.IryoHokenRirekiDialogButton = {}));
    var IryoHokenRirekiDialogButton = DBA.IryoHokenRirekiDialogButton;
})(DBA || (DBA = {}));

var DBA;
(function (DBA) {
    (function (IryoHokenRirekiDialogButton) {
        var PublicProperties = (function () {
            function PublicProperties(fieldName) {
                this.fieldName = fieldName;
                this.controls = new IryoHokenRirekiDialogButton.Controls(fieldName);
            }
            PublicProperties.prototype.getEditTypes = function () {
                var editTypes = new UZA.EditTypeForPublicProperty();

                return editTypes;
            };
            return PublicProperties;
        })();
        IryoHokenRirekiDialogButton.PublicProperties = PublicProperties;
    })(DBA.IryoHokenRirekiDialogButton || (DBA.IryoHokenRirekiDialogButton = {}));
    var IryoHokenRirekiDialogButton = DBA.IryoHokenRirekiDialogButton;
})(DBA || (DBA = {}));
