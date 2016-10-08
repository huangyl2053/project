/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.entity.db.relate.jukyushokai;

import java.util.UUID;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.definition.core.valueobject.ninteishinsei.ChosaItakusakiCode;
import jp.co.ndensan.reams.db.dbz.definition.core.valueobject.ninteishinsei.ChosainCode;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.EdabanCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 申請認定情報RelateEntityクラスです。
 *
 * @reamsid_L DBD-3560-011 xuyue
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class JukyuShokaiShinseiNinteiEntity {

    private RString dbT4001JukyushaDaicho_insertDantaiCd;
    private RDateTime dbT4001JukyushaDaicho_insertTimestamp;
    private RString dbT4001JukyushaDaicho_insertReamsLoginId;
    private UUID dbT4001JukyushaDaicho_insertContextId;
    private boolean dbT4001JukyushaDaicho_isDeleted;
    private int dbT4001JukyushaDaicho_updateCount;
    private RDateTime dbT4001JukyushaDaicho_lastUpdateTimestamp;
    private RString dbT4001JukyushaDaicho_lastUpdateReamsLoginId;
    private LasdecCode dbT4001JukyushaDaicho_shichosonCode;
    private HihokenshaNo dbT4001JukyushaDaicho_hihokenshaNo;
    private RString dbT4001JukyushaDaicho_rirekiNo;
    private RString dbT4001JukyushaDaicho_edaban;
    private ShinseishoKanriNo dbT4001JukyushaDaicho_shinseishoKanriNo;
    private RString dbT4001JukyushaDaicho_shinseiJokyoKubun;
    private RString dbT4001JukyushaDaicho_shishoCode;
    private boolean dbT4001JukyushaDaicho_chokkinFlag;
    private ShikibetsuCode dbT4001JukyushaDaicho_shikibetsuCode;
    private Code dbT4001JukyushaDaicho_jukyuShinseiJiyu;
    private RString dbT4001JukyushaDaicho_shinseiRiyu;
    private Code dbT4001JukyushaDaicho_shinseishaKankeiCode;
    private RString dbT4001JukyushaDaicho_homninKankei;
    private FlexibleDate dbT4001JukyushaDaicho_jukyuShinseiYMD;
    private Code dbT4001JukyushaDaicho_nigoTokuteiShippeiCode;
    private FlexibleDate dbT4001JukyushaDaicho_shinsakaiIraiYMD;
    private Code dbT4001JukyushaDaicho_yokaigoJotaiKubunCode;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiYukoKikanKaishiYMD;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiYukoKikanShuryoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiYMD;
    private Code dbT4001JukyushaDaicho_minashiCode;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui01;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui02;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui03;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui04;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui05;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui06;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui07;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui08;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui09;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui10;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui11;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui12;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui13;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui14;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui15;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui16;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui17;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui18;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui19;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui20;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui21;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui22;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui23;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui24;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui25;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui26;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui27;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui28;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui29;
    private ServiceShuruiCode dbT4001JukyushaDaicho_shiteiServiceShurui30;
    private FlexibleDate dbT4001JukyushaDaicho_soshitsuYMD;
    private FlexibleDate dbT4001JukyushaDaicho_chokkinIdoYMD;
    private Code dbT4001JukyushaDaicho_chokkinIdoJiyuCode;
    private Code dbT4001JukyushaDaicho_yukoMukoKubun;
    private Code dbT4001JukyushaDaicho_dataKubun;
    private RString dbT4001JukyushaDaicho_remban;
    private RString dbT4001JukyushaDaicho_idoRiyu;
    private Code dbT4001JukyushaDaicho_shinseishoKubun;
    private Code dbT4001JukyushaDaicho_sakujoJiyuCode;
    private boolean dbT4001JukyushaDaicho_yoshienshaNinteiShinseiFlag;
    private Decimal dbT4001JukyushaDaicho_shikyuGendoTanisu;
    private FlexibleDate dbT4001JukyushaDaicho_shikyuGendoKaishiYMD;
    private FlexibleDate dbT4001JukyushaDaicho_shikyuGendoShuryoYMD;
    private int dbT4001JukyushaDaicho_tankiSikyuGendoNissu;
    private FlexibleDate dbT4001JukyushaDaicho_tankiShikyuGendoKaishiYMD;
    private FlexibleDate dbT4001JukyushaDaicho_tankiShikyuGendoShuryoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_toshoNinteiYukoKaishiYMD;
    private FlexibleDate dbT4001JukyushaDaicho_toshoNinteiYukoShuryoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_jukyuShikakuShomeishoHakkoYMD1;
    private FlexibleDate dbT4001JukyushaDaicho_jukyuShikakuShomeishoHakkoYMD2;
    private FlexibleDate dbT4001JukyushaDaicho_shindanMeireishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_nigoShinseiJuriTsuchishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiKekkaTsuchishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_kubunHenkoTsuchishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_serviceHenkoTsuchishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiKyakkaTsuchishoHakkoYMD;
    private FlexibleDate dbT4001JukyushaDaicho_ninteiTorikeshiTsuchishoHakkoYMD;
    private boolean dbT4001JukyushaDaicho_shikakuShutokuMaeShinseiFlag;
    private boolean dbT4001JukyushaDaicho_kyuSochishaFlag;
    private boolean dbT4001JukyushaDaicho_logicalDeletedFlag;

    private RString dbT4101NinteiShinseiJoho_insertDantaiCd;
    private RDateTime dbT4101NinteiShinseiJoho_insertTimestamp;
    private RString dbT4101NinteiShinseiJoho_insertReamsLoginId;
    private UUID dbT4101NinteiShinseiJoho_insertContextId;
    private boolean dbT4101NinteiShinseiJoho_isDeleted;
    private int dbT4101NinteiShinseiJoho_updateCount;
    private RDateTime dbT4101NinteiShinseiJoho_lastUpdateTimestamp;
    private RString dbT4101NinteiShinseiJoho_lastUpdateReamsLoginId;
    private ShinseishoKanriNo dbT4101NinteiShinseiJoho_shinseishoKanriNo;
    private Code dbT4101NinteiShinseiJoho_koroshoIfShikibetsuCode;
    private RString dbT4101NinteiShinseiJoho_shoKisaiHokenshaNo;
    private FlexibleYear dbT4101NinteiShinseiJoho_shinseiNendo;
    private RString dbT4101NinteiShinseiJoho_hihokenshaNo;
    private FlexibleDate dbT4101NinteiShinseiJoho_ninteiShinseiYMD;
    private EdabanCode dbT4101NinteiShinseiJoho_ninteiShinseiEdabanCode;
    private Code dbT4101NinteiShinseiJoho_ninteiShinseiHoreiKubunCode;
    private Code dbT4101NinteiShinseiJoho_ninteiShinseiShinseijiKubunCode;
    private Code dbT4101NinteiShinseiJoho_torisageKubunCode;
    private RString dbT4101NinteiShinseiJoho_hihokenshaKubunCode;
    private FlexibleDate dbT4101NinteiShinseiJoho_seinengappiYMD;
    private int dbT4101NinteiShinseiJoho_age;
    private Code dbT4101NinteiShinseiJoho_seibetsu;
    private AtenaKanaMeisho dbT4101NinteiShinseiJoho_hihokenshaKana;
    private AtenaMeisho dbT4101NinteiShinseiJoho_hihokenshaName;
    private YubinNo dbT4101NinteiShinseiJoho_yubinNo;
    private AtenaJusho dbT4101NinteiShinseiJoho_jusho;
    private TelNo dbT4101NinteiShinseiJoho_telNo;
    private RString dbT4101NinteiShinseiJoho_shishoCode;
    private ShikibetsuCode dbT4101NinteiShinseiJoho_shikibetsuCode;
    private ChikuCode dbT4101NinteiShinseiJoho_chikuCode;
    private boolean dbT4101NinteiShinseiJoho_minashiNigoEtcTaishoFlag;
    private Code dbT4101NinteiShinseiJoho_koikinaiTenkyoKubun;
    private Code dbT4101NinteiShinseiJoho_ninteiShinseiYukoKubunCode;
    private RString dbT4101NinteiShinseiJoho_shienShinseiKubun;
    private RString dbT4101NinteiShinseiJoho_ninteiShinseiRiyu;
    private RString dbT4101NinteiShinseiJoho_shinseiServiceDeleteRiyu;
    private Code dbT4101NinteiShinseiJoho_zenYokaigoKubunCode;
    private FlexibleDate dbT4101NinteiShinseiJoho_zenkaiNinteiYMD;
    private FlexibleDate dbT4101NinteiShinseiJoho_zenkaiYukoKikanStart;
    private FlexibleDate dbT4101NinteiShinseiJoho_zenkaiYukoKikanEnd;
    private RString dbT4101NinteiShinseiJoho_nigoIryoHokenshaName;
    private RString dbT4101NinteiShinseiJoho_nigoIryoHokenKigoBango;
    private Code dbT4101NinteiShinseiJoho_nigoTokuteiShippeiCode;
    private RString dbT4101NinteiShinseiJoho_jidoWariateJogaishaKubun;
    private boolean dbT4101NinteiShinseiJoho_johoteikyoDoiFlag;
    private FlexibleDate dbT4101NinteiShinseiJoho_johoteikyoSiryoOutputYMD;
    private Code dbT4101NinteiShinseiJoho_chosaKubun;
    private ChosaItakusakiCode dbT4101NinteiShinseiJoho_ninteiChosaItakusakiCode;
    private ChosainCode dbT4101NinteiShinseiJoho_ninteiChosainCode;
    private RString dbT4101NinteiShinseiJoho_renrakuJikoToChosain;
    private RString dbT4101NinteiShinseiJoho_shujiiIryokikanCode;
    private RString dbT4101NinteiShinseiJoho_shujiiCode;
    private boolean dbT4101NinteiShinseiJoho_shiteiiFlag;
    private Code dbT4101NinteiShinseiJoho_ikenshoDataShubetsu;
    private RString dbT4101NinteiShinseiJoho_renrakuJikoToShujii;
    private boolean dbT4101NinteiShinseiJoho_enkitsuchiNashiDoiFlag;
    private boolean dbT4101NinteiShinseiJoho_shisetsuNyushoFlag;
    private JigyoshaNo dbT4101NinteiShinseiJoho_nyushoShisetsuCode;
    private boolean dbT4101NinteiShinseiJoho_kateiHomonFlag;
    private YubinNo dbT4101NinteiShinseiJoho_homonChosasakiYubinNo;
    private AtenaJusho dbT4101NinteiShinseiJoho_homonChosasakiJusho;
    private AtenaMeisho dbT4101NinteiShinseiJoho_homonChosasakiName;
    private TelNo dbT4101NinteiShinseiJoho_homonChosasakiTelNo;
    private RString dbT4101NinteiShinseiJoho_shichosonRenrakuJiko;
    private Code dbT4101NinteiShinseiJoho_shoriJotaiKubun;
    private FlexibleDate dbT4101NinteiShinseiJoho_torisageYMD;
    private RString dbT4101NinteiShinseiJoho_torisageRiyu;
    private FlexibleDate dbT4101NinteiShinseiJoho_kyakkaYMD;
    private RString dbT4101NinteiShinseiJoho_kyakkaRiyu;
    private FlexibleDate dbT4101NinteiShinseiJoho_enkiKetteiYMD;
    private RString dbT4101NinteiShinseiJoho_enkiRiyu;
    private FlexibleDate dbT4101NinteiShinseiJoho_enkiTsuchiHakkoYMD;
    private int dbT4101NinteiShinseiJoho_enkiTsuchiHakkoKaisu;
    private FlexibleDate dbT4101NinteiShinseiJoho_enkiMikomiKaishiYMD;
    private FlexibleDate dbT4101NinteiShinseiJoho_enkiMikomiShuryoYMD;
    private boolean dbT4101NinteiShinseiJoho_shinsaKeizokuFlag;
    private Code dbT4101NinteiShinseiJoho_shinsakaiYusenWaritsukeKubunCode;
    private FlexibleDate dbT4101NinteiShinseiJoho_koshinTsuchiHakkoYMD;
    private FlexibleDate dbT4101NinteiShinseiJoho_koshinTsuchiHakkoKanryoYMD;
    private FlexibleDate dbT4101NinteiShinseiJoho_ninteiShinseiJohoTorokuYMD;
    private int dbT4101NinteiShinseiJoho_saiChosaIraiKaisu;
    private int dbT4101NinteiShinseiJoho_saiSakuseiIraiKaisu;
    private FlexibleDate dbT4101NinteiShinseiJoho_ifSofuYMD;
    private boolean dbT4101NinteiShinseiJoho_logicalDeletedFlag;

    private RString dbT5120ShinseitodokedeJoho_insertDantaiCd;
    private RDateTime dbT5120ShinseitodokedeJoho_insertTimestamp;
    private RString dbT5120ShinseitodokedeJoho_insertReamsLoginId;
    private UUID dbT5120ShinseitodokedeJoho_insertContextId;
    private boolean dbT5120ShinseitodokedeJoho_isDeleted;
    private int dbT5120ShinseitodokedeJoho_updateCount;
    private RDateTime dbT5120ShinseitodokedeJoho_lastUpdateTimestamp;
    private RString dbT5120ShinseitodokedeJoho_lastUpdateReamsLoginId;
    private ShinseishoKanriNo dbT5120ShinseitodokedeJoho_shinseishoKanriNo;
    private Code dbT5120ShinseitodokedeJoho_shinseiTodokedeDaikoKubunCode;
    private RString dbT5120ShinseitodokedeJoho_shinseiTodokedeshaShimei;
    private RString dbT5120ShinseitodokedeJoho_shinseiTodokedeshaKanaShimei;
    private RString dbT5120ShinseitodokedeJoho_shinseiTodokedeshaTsuzukigara;
    private JigyoshaNo dbT5120ShinseitodokedeJoho_shinseiTodokedeDaikoJigyoshaNo;
    private RString dbT5120ShinseitodokedeJoho_jigyoshaKubun;
    private YubinNo dbT5120ShinseitodokedeJoho_shinseiTodokedeshaYubinNo;
    private RString dbT5120ShinseitodokedeJoho_shinseiTodokedeshaJusho;
    private TelNo dbT5120ShinseitodokedeJoho_shinseiTodokedeshaTelNo;

    private RString dbT4003YokaigoNinteiInterface_insertDantaiCd;
    private RDateTime dbT4003YokaigoNinteiInterface_insertTimestamp;
    private RString dbT4003YokaigoNinteiInterface_insertReamsLoginId;
    private UUID dbT4003YokaigoNinteiInterface_insertContextId;
    private boolean isDeleted;
    private int dbT4003YokaigoNinteiInterface_updateCount;
    private RDateTime dbT4003YokaigoNinteiInterface_lastUpdateTimestamp;
    private RString dbT4003YokaigoNinteiInterface_lastUpdateReamsLoginId;
    private ShinseishoKanriNo dbT4003YokaigoNinteiInterface_shinseishoKanriNo;
    private HihokenshaNo dbT4003YokaigoNinteiInterface_hihokenshaNo;
    private RString dbT4003YokaigoNinteiInterface_rirekiNo;
    private RString dbT4003YokaigoNinteiInterface_torikomiTimestamp;
    private YMDHMS dbT4003YokaigoNinteiInterface_torikomiKubun;
    private RString dbT4003YokaigoNinteiInterface_shinseiShubetsuCode;
    private RString dbT4003YokaigoNinteiInterface_torisageKubunCode;
    private FlexibleDate dbT4003YokaigoNinteiInterface_shinseiYMD;
    private RString dbT4003YokaigoNinteiInterface_iryoKikanCode;
    private RString dbT4003YokaigoNinteiInterface_shujiiCode;
    private FlexibleDate dbT4003YokaigoNinteiInterface_ikenshoIraiYMD;
    private FlexibleDate dbT4003YokaigoNinteiInterface_ikenshoToriyoseYMD;
    private FlexibleDate dbT4003YokaigoNinteiInterface_chosaItakuYMD;
    private FlexibleDate dbT4003YokaigoNinteiInterface_chosaShuryoYMD;
    private JigyoshaNo dbT4003YokaigoNinteiInterface_chosaItakusakiCode;
    private RString dbT4003YokaigoNinteiInterface_chosainCode;
    private FlexibleDate dbT4003YokaigoNinteiInterface_ichijiHanteiYMD;
    private RString dbT4003YokaigoNinteiInterface_ichijiHanteiKekkaCode;
    private RString dbT4003YokaigoNinteiInterface_ichijiHanteiKekkaKasanCode;
    private FlexibleDate dbT4003YokaigoNinteiInterface_shinsakaiShiryoSakuseiYMD;
    private FlexibleDate dbT4003YokaigoNinteiInterface_shinsakaiYoteiYMD;
    private int dbT4003YokaigoNinteiInterface_gogitaiNo;
    private FlexibleDate dbT4003YokaigoNinteiInterface_nijiHanteiYMD;
    private RString dbT4003YokaigoNinteiInterface_nijiHanteiKekkaCode;
    private FlexibleDate dbT4003YokaigoNinteiInterface_ninteiYukoKikanStart;
    private FlexibleDate dbT4003YokaigoNinteiInterface_ninteiYukoKikanEnd;
    private RString dbT4003YokaigoNinteiInterface_serviceHenkoRiyuCode;
    private RString dbT4003YokaigoNinteiInterface_tokuteiShippeiCode;
    private RString dbT4003YokaigoNinteiInterface_shogaiKoreiJiritsudo;
    private RString dbT4003YokaigoNinteiInterface_ninchishoKoreiJiritsudo;
    private RString dbT4003YokaigoNinteiInterface_shinsakaiIken;
    private RString dbT4003YokaigoNinteiInterface_versionNo;
    private RString dbT4003YokaigoNinteiInterface_ichijiHanteiNaiyo;
    private RString dbT4003YokaigoNinteiInterface_ichijiHanteiNaiyo2;
    private YMDHMS dbT4003YokaigoNinteiInterface_zenTorikomiTimestamp;
    private RString dbT4003YokaigoNinteiInterface_keshikomiFlag;
    private YMDHMS dbT4003YokaigoNinteiInterface_keshikomiTimestamp;
    private RString dbT4003YokaigoNinteiInterface_yobiKomoku1;
    private RString dbT4003YokaigoNinteiInterface_yobiKomoku2;
    private RString dbT4003YokaigoNinteiInterface_yobiKomoku3;
    private RString dbT4003YokaigoNinteiInterface_yobiKomoku4;
    private RString dbT4003YokaigoNinteiInterface_yobiKomoku5;
    private RString dbT4003YokaigoNinteiInterface_yobiKubun1;
    private RString dbT4003YokaigoNinteiInterface_yobiKubun2;
    private RString dbT4003YokaigoNinteiInterface_yobiKubun3;
    private RString dbT4003YokaigoNinteiInterface_yobiKubun4;
    private RString dbT4003YokaigoNinteiInterface_yobiKubun5;
    private RString dbT4003YokaigoNinteiInterface_reserve;

    private RString 医療機関名称;
    private RString 主治医氏名;
    private boolean 指定医フラグ;

    private Code 前回要介護状態区分コード;
    private FlexibleDate 前回認定年月日;
    private FlexibleDate 前回有効期間開始;
    private FlexibleDate 前回有効期間終了;
    private Code 前回厚労省IF識別コード;

    private RString dbt7037_被保険者番号;
    private FlexibleDate dbt7037_有効期限;
    private FlexibleDate dbt7037_交付年月日;
    private RString dbt7037_最近交付順;
}
