var DBZ;
(function (DBZ) {
    (function (NinteiChosaJokyo) {
        var Events = (function () {
            function Events() {
            }
            return Events;
        })();
        NinteiChosaJokyo.Events = Events;

        var Controls = (function () {
            function Controls(fieldName) {
                this._myName = fieldName;
            }
            Controls.myType = function () {
                return "NinteiChosaJokyo";
            };

            Controls.prototype.convFiledNameSelf = function () {
                return this._myName + "_" + DBZ.NinteiChosaJokyo.Controls.myType();
            };

            Controls.prototype.convFiledName = function (fieldName) {
                return this._myName + "_" + DBZ.NinteiChosaJokyo.Controls.myType() + "_" + fieldName;
            };

            Controls.prototype.NinteiChosaJokyo = function () {
                return new UZA.Panel(this.convFiledNameSelf());
            };

            Controls.prototype.lblNinteiChosa = function () {
                return new UZA.Label(this.convFiledName("lblNinteiChosa"));
            };

            Controls.prototype.NinteiChosa = function () {
                return new UZA.Panel(this.convFiledName("NinteiChosa"));
            };

            Controls.prototype.txtNinteiChosainCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtNinteiChosainCode"));
            };

            Controls.prototype.btnChosainGuide = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnChosainGuide"));
            };

            Controls.prototype.txtNinteiChosainName = function () {
                return new UZA.TextBox(this.convFiledName("txtNinteiChosainName"));
            };

            Controls.prototype.txtNinteiChosaItakusakiCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtNinteiChosaItakusakiCode"));
            };

            Controls.prototype.btnItakusakiGuide = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnItakusakiGuide"));
            };

            Controls.prototype.txtNinteiChosaItakusakiName = function () {
                return new UZA.TextBox(this.convFiledName("txtNinteiChosaItakusakiName"));
            };

            Controls.prototype.txtNinteiChosaYubinNo = function () {
                return new UZA.TextBoxYubinNo(this.convFiledName("txtNinteiChosaYubinNo"));
            };

            Controls.prototype.txtNinteiChosaJusho = function () {
                return new UZA.TextBoxJusho(this.convFiledName("txtNinteiChosaJusho"));
            };

            Controls.prototype.txtNinteiChosaTelNo = function () {
                return new UZA.TextBoxTelNo(this.convFiledName("txtNinteiChosaTelNo"));
            };

            Controls.prototype.txtNinteiChosaIraiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNinteiChosaIraiDay"));
            };

            Controls.prototype.txtNinteiChosaJisshiYoteiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNinteiChosaJisshiYoteiDay"));
            };

            Controls.prototype.NinteiChosaJissiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("NinteiChosaJissiDay"));
            };

            Controls.prototype.ddlNinteiChosaItakusakiKubun = function () {
                return new UZA.DropDownList(this.convFiledName("ddlNinteiChosaItakusakiKubun"));
            };

            Controls.prototype.lblHomonSaki = function () {
                return new UZA.Label(this.convFiledName("lblHomonSaki"));
            };

            Controls.prototype.HomonChosasaki = function () {
                return new UZA.Panel(this.convFiledName("HomonChosasaki"));
            };

            Controls.prototype.txtChosasakiName = function () {
                return new UZA.TextBox(this.convFiledName("txtChosasakiName"));
            };

            Controls.prototype.txtChosasakiYubinNo = function () {
                return new UZA.TextBoxYubinNo(this.convFiledName("txtChosasakiYubinNo"));
            };

            Controls.prototype.txtChosasakiJusho = function () {
                return new UZA.TextBoxJusho(this.convFiledName("txtChosasakiJusho"));
            };

            Controls.prototype.txtChosasakiTelNo = function () {
                return new UZA.TextBoxTelNo(this.convFiledName("txtChosasakiTelNo"));
            };

            Controls.prototype.lblShujii = function () {
                return new UZA.Label(this.convFiledName("lblShujii"));
            };

            Controls.prototype.ShujiiAndShujiIryoKikan = function () {
                return new UZA.Panel(this.convFiledName("ShujiiAndShujiIryoKikan"));
            };

            Controls.prototype.txtShujiiCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtShujiiCode"));
            };

            Controls.prototype.btnShujii = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnShujii"));
            };

            Controls.prototype.txtShujiiName = function () {
                return new UZA.TextBox(this.convFiledName("txtShujiiName"));
            };

            Controls.prototype.txtShujiiIryoKikanCode = function () {
                return new UZA.TextBoxCode(this.convFiledName("txtShujiiIryoKikanCode"));
            };

            Controls.prototype.btnIryoKikan = function () {
                return new UZA.ButtonDialog(this.convFiledName("btnIryoKikan"));
            };

            Controls.prototype.txtShujiiIryoKikanName = function () {
                return new UZA.TextBox(this.convFiledName("txtShujiiIryoKikanName"));
            };

            Controls.prototype.txtShujiiIryoKikanYubinNo = function () {
                return new UZA.TextBoxYubinNo(this.convFiledName("txtShujiiIryoKikanYubinNo"));
            };

            Controls.prototype.txtShujiiIryoKikanJusho = function () {
                return new UZA.TextBoxJusho(this.convFiledName("txtShujiiIryoKikanJusho"));
            };

            Controls.prototype.txtShujiiIryoKikanTelNo = function () {
                return new UZA.TextBoxTelNo(this.convFiledName("txtShujiiIryoKikanTelNo"));
            };

            Controls.prototype.txtShujiiIryoKikanIraiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtShujiiIryoKikanIraiDay"));
            };

            Controls.prototype.txtShujiiIryoKikanNyushuYoteiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtShujiiIryoKikanNyushuYoteiDay"));
            };

            Controls.prototype.txtShujiiIryoKikanNyushuDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtShujiiIryoKikanNyushuDay"));
            };

            Controls.prototype.chkShujiiKubun = function () {
                return new UZA.CheckBoxList(this.convFiledName("chkShujiiKubun"));
            };

            Controls.prototype.lblIchijiHantei = function () {
                return new UZA.Label(this.convFiledName("lblIchijiHantei"));
            };

            Controls.prototype.IchijiHantei = function () {
                return new UZA.Panel(this.convFiledName("IchijiHantei"));
            };

            Controls.prototype.ddlYokaigodo = function () {
                return new UZA.DropDownList(this.convFiledName("ddlYokaigodo"));
            };

            Controls.prototype.txtIchijiHanteiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtIchijiHanteiDay"));
            };

            Controls.prototype.ddlNinchishoKasangoYokaigodo = function () {
                return new UZA.DropDownList(this.convFiledName("ddlNinchishoKasangoYokaigodo"));
            };

            Controls.prototype.lblKaigoNinteiShinsakai = function () {
                return new UZA.Label(this.convFiledName("lblKaigoNinteiShinsakai"));
            };

            Controls.prototype.KaigoNinteiShinsakai = function () {
                return new UZA.Panel(this.convFiledName("KaigoNinteiShinsakai"));
            };

            Controls.prototype.txtShinsakaiShiryoSakuseiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtShinsakaiShiryoSakuseiDay"));
            };

            Controls.prototype.txtShinsakaiKaisaiYoteiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtShinsakaiKaisaiYoteiDay"));
            };

            Controls.prototype.txtNijiHanteiDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNijiHanteiDay"));
            };

            Controls.prototype.ddlNijiHanteiKekka = function () {
                return new UZA.DropDownList(this.convFiledName("ddlNijiHanteiKekka"));
            };

            Controls.prototype.txtNijiHanteiYukoKikan = function () {
                return new UZA.TextBox(this.convFiledName("txtNijiHanteiYukoKikan"));
            };

            Controls.prototype.txtNinteiYukoKikanFrom = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNinteiYukoKikanFrom"));
            };

            Controls.prototype.txtNinteiYukoKikanTo = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtNinteiYukoKikanTo"));
            };

            Controls.prototype.lblEnkiTsuchi = function () {
                return new UZA.Label(this.convFiledName("lblEnkiTsuchi"));
            };

            Controls.prototype.EnkiTsuchi = function () {
                return new UZA.Panel(this.convFiledName("EnkiTsuchi"));
            };

            Controls.prototype.txtEnkiTsuchiHakkoDay = function () {
                return new UZA.TextBoxDate(this.convFiledName("txtEnkiTsuchiHakkoDay"));
            };

            Controls.prototype.txtEnkiTsuchiHakkoCount = function () {
                return new UZA.TextBoxNum(this.convFiledName("txtEnkiTsuchiHakkoCount"));
            };

            Controls.prototype.btnModoru = function () {
                return new UZA.Button(this.convFiledName("btnModoru"));
            };
            return Controls;
        })();
        NinteiChosaJokyo.Controls = Controls;
    })(DBZ.NinteiChosaJokyo || (DBZ.NinteiChosaJokyo = {}));
    var NinteiChosaJokyo = DBZ.NinteiChosaJokyo;
})(DBZ || (DBZ = {}));