var DBZ;
(function (DBZ) {
    (function (shisetsuJohoCommonChildDiv) {
        var ModeController = (function () {
            function ModeController(fieldName) {
                this.fieldName = fieldName;
                this.controls = new shisetsuJohoCommonChildDiv.Controls(fieldName);
            }
            ModeController.prototype.priorities = function () {
                return [
                    "State"
                ];
            };
            ModeController.prototype.State = function () {
                return new Modes.State(this.controls);
            };
            ModeController.prototype.Properties = function () {
                return new UZA.CommonChildDiv(this.fieldName);
            };

            ModeController.prototype.PublicProperties = function () {
                return new shisetsuJohoCommonChildDiv.PublicProperties(this.fieldName);
            };
            return ModeController;
        })();
        shisetsuJohoCommonChildDiv.ModeController = ModeController;

        (function (Modes) {
            var State = (function () {
                function State(controls) {
                    this.controls = controls;
                }
                State.prototype.DaichoShubetsuAriMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = false;
                    this.controls.radKaigoHokenShisetsu().displayNone = false;
                    this.controls.radOtherTokureiShisetsu().displayNone = false;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = false;
                };

                State.prototype.DaichoShubetsuNashiMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = true;
                    this.controls.radKaigoHokenShisetsu().labelLText = " ";
                    this.controls.radKaigoHokenShisetsu().displayNone = false;
                    this.controls.radOtherTokureiShisetsu().displayNone = false;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = false;
                };
                State.prototype.KaigoHokenMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = true;
                    this.controls.radKaigoHokenShisetsu().labelLText = " ";
                    this.controls.radKaigoHokenShisetsu().displayNone = false;
                    this.controls.radOtherTokureiShisetsu().displayNone = false;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = true;
                };

                State.prototype.OtherTokureiMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = true;
                    this.controls.radKaigoHokenShisetsu().labelLText = " ";
                    this.controls.radKaigoHokenShisetsu().displayNone = false;
                    this.controls.radOtherTokureiShisetsu().displayNone = false;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = true;
                };
                State.prototype.TekiyoJogaiMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = true;
                    this.controls.radKaigoHokenShisetsu().displayNone = true;
                    this.controls.radOtherTokureiShisetsu().displayNone = true;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = true;
                };
                State.prototype.JigyoshaInputGuideMode = function () {
                    this.controls.ddlDaichoShubetsu().displayNone = true;
                    this.controls.radKaigoHokenShisetsu().displayNone = true;
                    this.controls.radOtherTokureiShisetsu().displayNone = true;
                    this.controls.radTekiyoJyogaiShisetsu().displayNone = true;
                };
                return State;
            })();
            Modes.State = State;
        })(shisetsuJohoCommonChildDiv.Modes || (shisetsuJohoCommonChildDiv.Modes = {}));
        var Modes = shisetsuJohoCommonChildDiv.Modes;
    })(DBZ.shisetsuJohoCommonChildDiv || (DBZ.shisetsuJohoCommonChildDiv = {}));
    var shisetsuJohoCommonChildDiv = DBZ.shisetsuJohoCommonChildDiv;
})(DBZ || (DBZ = {}));

var DBZ;
(function (DBZ) {
    (function (shisetsuJohoCommonChildDiv) {
        var PublicProperties = (function () {
            function PublicProperties(fieldName) {
                this.getNyuryokuShisetsuKodo_labelLText = function () {
                    return this.controls.txtNyuryokuShisetsuKodo().labelLText;
                };
                this.setNyuryokuShisetsuKodo_labelLText = function (value) {
                    this.controls.txtNyuryokuShisetsuKodo().labelLText = value;
                };
                this.getNyuryokuShisetsuKodo_required = function () {
                    return this.controls.txtNyuryokuShisetsuKodo().required;
                };
                this.setNyuryokuShisetsuKodo_required = function (value) {
                    this.controls.txtNyuryokuShisetsuKodo().required = value;
                };
                this.getNyuryokuShisetsuKodo_labelLWidth = function () {
                    return this.controls.txtNyuryokuShisetsuKodo().labelLWidth;
                };
                this.setNyuryokuShisetsuKodo_labelLWidth = function (value) {
                    this.controls.txtNyuryokuShisetsuKodo().labelLWidth = value;
                };
                this.fieldName = fieldName;
                this.controls = new shisetsuJohoCommonChildDiv.Controls(fieldName);
            }
            PublicProperties.prototype.getEditTypes = function () {
                var editTypes = new UZA.EditTypeForPublicProperty();
                editTypes.addEditType("NyuryokuShisetsuKodo_labelLText", UZA.EditTypeEnumForPublicProperty.StringType);
                editTypes.addEditType("NyuryokuShisetsuKodo_labelLWidth", UZA.EditTypeEnumForPublicProperty.StringType);
                editTypes.addEditType("NyuryokuShisetsuKodo_required", UZA.EditTypeEnumForPublicProperty.BooleanType);
                return editTypes;
            };
            return PublicProperties;
        })();
        shisetsuJohoCommonChildDiv.PublicProperties = PublicProperties;
    })(DBZ.shisetsuJohoCommonChildDiv || (DBZ.shisetsuJohoCommonChildDiv = {}));
    var shisetsuJohoCommonChildDiv = DBZ.shisetsuJohoCommonChildDiv;
})(DBZ || (DBZ = {}));