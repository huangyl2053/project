var DBA;
(function (DBA) {
    (function (HokenshaInputGuide) {
        var ModeController = (function () {
            function ModeController(fieldName) {
                this.fieldName = fieldName;
                this.controls = new HokenshaInputGuide.Controls(fieldName);
            }
            ModeController.prototype.Properties = function () {
                return new UZA.CommonChildDiv(this.fieldName);
            };

            ModeController.prototype.PublicProperties = function () {
                return new HokenshaInputGuide.PublicProperties(this.fieldName);
            };
            return ModeController;
        })();
        HokenshaInputGuide.ModeController = ModeController;
    })(DBA.HokenshaInputGuide || (DBA.HokenshaInputGuide = {}));
    var HokenshaInputGuide = DBA.HokenshaInputGuide;
})(DBA || (DBA = {}));

var DBA;
(function (DBA) {
    (function (HokenshaInputGuide) {
        var PublicProperties = (function () {
            function PublicProperties(fieldName) {
                this.fieldName = fieldName;
                this.controls = new HokenshaInputGuide.Controls(fieldName);
            }
            PublicProperties.prototype.getEditTypes = function () {
                var editTypes = new UZA.EditTypeForPublicProperty();

                return editTypes;
            };
            return PublicProperties;
        })();
        HokenshaInputGuide.PublicProperties = PublicProperties;
    })(DBA.HokenshaInputGuide || (DBA.HokenshaInputGuide = {}));
    var HokenshaInputGuide = DBA.HokenshaInputGuide;
})(DBA || (DBA = {}));
