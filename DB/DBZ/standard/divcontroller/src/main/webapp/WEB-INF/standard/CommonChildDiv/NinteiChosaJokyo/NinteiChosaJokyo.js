var DBZ;
(function (DBZ) {
    (function (NinteiChosaJokyo) {
        var ModeController = (function () {
            function ModeController(fieldName) {
                this.fieldName = fieldName;
                this.controls = new NinteiChosaJokyo.Controls(fieldName);
            }
            ModeController.prototype.Properties = function () {
                return new UZA.CommonChildDiv(this.fieldName);
            };

            ModeController.prototype.PublicProperties = function () {
                return new NinteiChosaJokyo.PublicProperties(this.fieldName);
            };
            ModeController.prototype.DisplayType = function () {
                return new Modes.DisplayType(this.controls);
            };
            return ModeController;
        })();
        NinteiChosaJokyo.ModeController = ModeController;

        (function (Modes) {
            var DisplayType = (function () {
                function DisplayType(controls) {
                    this.controls = controls;
                }
                DisplayType.prototype.shokai = function () {
                    this.controls.NinteiChosaJokyo().readOnly = true;
                    this.controls.btnChosainGuide().disabled = true;
                    this.controls.btnIryoKikanGuide().disabled = true;
                    this.controls.btnItakusakiGuide().disabled = true;
                    this.controls.btnShujiiGuide().disabled = true;
                };
                DisplayType.prototype.input = function () {
                    this.controls.NinteiChosaJokyo().readOnly = false;
                    this.controls.btnChosainGuide().disabled = false;
                    this.controls.btnIryoKikanGuide().disabled = false;
                    this.controls.btnItakusakiGuide().disabled = false;
                    this.controls.btnShujiiGuide().disabled = false;
                };
                return DisplayType;
            })();
            Modes.DisplayType = DisplayType;
        })(NinteiChosaJokyo.Modes || (NinteiChosaJokyo.Modes = {}));
        var Modes = NinteiChosaJokyo.Modes;
    })(DBZ.NinteiChosaJokyo || (DBZ.NinteiChosaJokyo = {}));
    var NinteiChosaJokyo = DBZ.NinteiChosaJokyo;
})(DBZ || (DBZ = {}));

var DBZ;
(function (DBZ) {
    (function (NinteiChosaJokyo) {
        var PublicProperties = (function () {
            function PublicProperties(fieldName) {
                this.fieldName = fieldName;
                this.controls = new NinteiChosaJokyo.Controls(fieldName);
            }
            PublicProperties.prototype.getEditTypes = function () {
                var editTypes = new UZA.EditTypeForPublicProperty();

                return editTypes;
            };
            return PublicProperties;
        })();
        NinteiChosaJokyo.PublicProperties = PublicProperties;
    })(DBZ.NinteiChosaJokyo || (DBZ.NinteiChosaJokyo = {}));
    var NinteiChosaJokyo = DBZ.NinteiChosaJokyo;
})(DBZ || (DBZ = {}));
