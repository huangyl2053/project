var DBZ;
(function (DBZ) {
    (function (JukyuSikakuShomeishoHakko) {
        var ModeController = (function () {
            function ModeController(fieldName) {
                this.fieldName = fieldName;
                this.controls = new JukyuSikakuShomeishoHakko.Controls(fieldName);
            }
            ModeController.prototype.Properties = function () {
                return new UZA.CommonChildDiv(this.fieldName);
            };

            ModeController.prototype.PublicProperties = function () {
                return new JukyuSikakuShomeishoHakko.PublicProperties(this.fieldName);
            };
            return ModeController;
        })();
        JukyuSikakuShomeishoHakko.ModeController = ModeController;
    })(DBZ.JukyuSikakuShomeishoHakko || (DBZ.JukyuSikakuShomeishoHakko = {}));
    var JukyuSikakuShomeishoHakko = DBZ.JukyuSikakuShomeishoHakko;
})(DBZ || (DBZ = {}));

var DBZ;
(function (DBZ) {
    (function (JukyuSikakuShomeishoHakko) {
        var PublicProperties = (function () {
            function PublicProperties(fieldName) {
                this.fieldName = fieldName;
                this.controls = new JukyuSikakuShomeishoHakko.Controls(fieldName);
            }
            PublicProperties.prototype.getEditTypes = function () {
                var editTypes = new UZA.EditTypeForPublicProperty();

                return editTypes;
            };
            return PublicProperties;
        })();
        JukyuSikakuShomeishoHakko.PublicProperties = PublicProperties;
    })(DBZ.JukyuSikakuShomeishoHakko || (DBZ.JukyuSikakuShomeishoHakko = {}));
    var JukyuSikakuShomeishoHakko = DBZ.JukyuSikakuShomeishoHakko;
})(DBZ || (DBZ = {}));