var DBZ;
(function (DBZ) {
    (function (KihonChosaInput2) {
        var Events = (function () {
            function Events() {
            }
            Events.onClick_btnOpenDialog = function () {
                return "onClick_btnOpenDialog";
            };

            Events.onClick_btnConfirm = function () {
                return "onClick_btnConfirm";
            };

            Events.onClick_btnBack = function () {
                return "onClick_btnBack";
            };
            return Events;
        })();
        KihonChosaInput2.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "KihonChosaInput2";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBZ.KihonChosaInput2.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBZ.KihonChosaInput2.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.KihonChosaInput2 = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.ZenkaiHyojiTeiji = function () {
                return new UZA.Label(this.convFiledName("ZenkaiHyojiTeiji"));
            };

            Controls.prototype.SeikatsuKinou = function () {
                return new UZA.Panel(this.convFiledName("SeikatsuKinou"));
            };

            Controls.prototype.Ijyo = function () {
                return new UZA.Panel(this.convFiledName("Ijyo"));
            };

            Controls.prototype.btnIjyo = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnIjyo"));
            };

            Controls.prototype.radIjyo = function () {
                return new UZA.RadioButton(this.convFiledName("radIjyo"));
            };

            Controls.prototype.Idou = function () {
                return new UZA.Panel(this.convFiledName("Idou"));
            };

            Controls.prototype.btnIdou = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnIdou"));
            };

            Controls.prototype.radIdou = function () {
                return new UZA.RadioButton(this.convFiledName("radIdou"));
            };

            Controls.prototype.Enka = function () {
                return new UZA.Panel(this.convFiledName("Enka"));
            };

            Controls.prototype.btnEnka = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnEnka"));
            };

            Controls.prototype.radEnka = function () {
                return new UZA.RadioButton(this.convFiledName("radEnka"));
            };

            Controls.prototype.Shokuji = function () {
                return new UZA.Panel(this.convFiledName("Shokuji"));
            };

            Controls.prototype.btnShokuji = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnShokuji"));
            };

            Controls.prototype.radShokuji = function () {
                return new UZA.RadioButton(this.convFiledName("radShokuji"));
            };

            Controls.prototype.Hainyo = function () {
                return new UZA.Panel(this.convFiledName("Hainyo"));
            };

            Controls.prototype.btnHainyo = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnHainyo"));
            };

            Controls.prototype.radHainyo = function () {
                return new UZA.RadioButton(this.convFiledName("radHainyo"));
            };

            Controls.prototype.Haiben = function () {
                return new UZA.Panel(this.convFiledName("Haiben"));
            };

            Controls.prototype.btnHaiben = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnHaiben"));
            };

            Controls.prototype.radHaiben = function () {
                return new UZA.RadioButton(this.convFiledName("radHaiben"));
            };

            Controls.prototype.Kokou = function () {
                return new UZA.Panel(this.convFiledName("Kokou"));
            };

            Controls.prototype.btnKokou = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnKokou"));
            };

            Controls.prototype.radKokou = function () {
                return new UZA.RadioButton(this.convFiledName("radKokou"));
            };

            Controls.prototype.Sengan = function () {
                return new UZA.Panel(this.convFiledName("Sengan"));
            };

            Controls.prototype.btnSengan = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnSengan"));
            };

            Controls.prototype.radSengan = function () {
                return new UZA.RadioButton(this.convFiledName("radSengan"));
            };

            Controls.prototype.Seihatsu = function () {
                return new UZA.Panel(this.convFiledName("Seihatsu"));
            };

            Controls.prototype.btnSeihatsu = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnSeihatsu"));
            };

            Controls.prototype.radSeihatsu = function () {
                return new UZA.RadioButton(this.convFiledName("radSeihatsu"));
            };

            Controls.prototype.Uwagi = function () {
                return new UZA.Panel(this.convFiledName("Uwagi"));
            };

            Controls.prototype.btnUwagi = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnUwagi"));
            };

            Controls.prototype.radUwagi = function () {
                return new UZA.RadioButton(this.convFiledName("radUwagi"));
            };

            Controls.prototype.Zubon = function () {
                return new UZA.Panel(this.convFiledName("Zubon"));
            };

            Controls.prototype.btnZubon = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnZubon"));
            };

            Controls.prototype.radZubon = function () {
                return new UZA.RadioButton(this.convFiledName("radZubon"));
            };

            Controls.prototype.Hindo = function () {
                return new UZA.Panel(this.convFiledName("Hindo"));
            };

            Controls.prototype.btnHindo = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnHindo"));
            };

            Controls.prototype.radHindo = function () {
                return new UZA.RadioButton(this.convFiledName("radHindo"));
            };

            Controls.prototype.btnConfirm = function () {
                return new UZA.Button(this.convFiledName("btnConfirm"));
            };

            Controls.prototype.btnBack = function () {
                return new UZA.Button(this.convFiledName("btnBack"));
            };
            return Controls;
        })();
        KihonChosaInput2.Controls = Controls;
    })(DBZ.KihonChosaInput2 || (DBZ.KihonChosaInput2 = {}));
    var KihonChosaInput2 = DBZ.KihonChosaInput2;
})(DBZ || (DBZ = {}));
