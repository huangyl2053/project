/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.shujiijoho;

import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.db.PrimaryKey;

/**
 * 主治医マスタ用Entityクラスです。
 *
 * @reamsid_L DBE-0250-010  suguangjun 
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShujiiMasterRelateEntity implements IDbAccessable {

    @PrimaryKey
    private LasdecCode shichosonCode;
    @PrimaryKey
    private RString shujiiIryokikanCode;
    @PrimaryKey
    private RString shujiiCode;
    private RString shujiiName;
    private RString shujiiKana;
    private RString shinryokaName;
    private boolean shiteiiFlag;
    private boolean jokyoFlag;
    private YubinNo yubinNo;
    private AtenaJusho jusho;
    private TelNo telNo;
    private TelNo faxNo;
    private RString seibetsu;
    private RString shichosonMeisho;
    private RString iryoKikanMeisho;
}