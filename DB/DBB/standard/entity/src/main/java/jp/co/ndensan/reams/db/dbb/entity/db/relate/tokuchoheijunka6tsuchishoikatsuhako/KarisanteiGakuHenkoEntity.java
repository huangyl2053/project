/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchoheijunka6tsuchishoikatsuhako;

import java.io.Serializable;
import jp.co.ndensan.reams.ca.cax.entity.db.psm.CaFt703FindNokumiEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.keisangojoho.DbTKeisangoJohoTempTableEntity;
import jp.co.ndensan.reams.db.dbz.entity.db.basic.UeT0511NenkinTokuchoKaifuJohoEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt200FindShikibetsuTaishoEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaFt250FindAtesakiEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaT0301YokinShubetsuPatternEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaT0302KinyuKikanEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaT0303KinyuKikanShitenEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.basic.UaT0310KozaEntity;
import jp.co.ndensan.reams.ua.uax.entity.db.relate.TokuteiKozaRelateEntity;
import jp.co.ndensan.reams.ue.uex.definition.core.RenkeiShubetsu;
import jp.co.ndensan.reams.ue.uex.definition.core.SeibetsuCodeNenkinTokucho;
import jp.co.ndensan.reams.ue.uex.definition.core.TokubetsuChoshuSeidoCode;
import jp.co.ndensan.reams.ue.uex.definition.core.TsuchiNaiyoCode;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 計算後情報、宛名、宛先、口座、納組、年金特徴回付情報を取得するEntityクラスです。
 *
 * @reamsid_L DBB-0820-040 xuyue
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class KarisanteiGakuHenkoEntity implements Serializable {

    private DbTKeisangoJohoTempTableEntity 更正後計算後情報;
    private DbTKeisangoJohoTempTableEntity 更正前計算後情報;
    private UaFt200FindShikibetsuTaishoEntity 宛名;
    private UaFt250FindAtesakiEntity 宛先;
    private CaFt703FindNokumiEntity 納組;
    private TokuteiKozaRelateEntity 口座;
    private UeT0511NenkinTokuchoKaifuJohoEntity 対象者_追加含む情報_更正後;

    /**
     * 一時テーブルエンティティDbT2002FukaTempTableEntityを生成します。
     *
     * @return DbT2002FukaTempTableEntity
     */
    public DbT2002FukaTempTableEntity toDbT2002FukaTempTableEntity() {
        DbT2002FukaTempTableEntity entity = new DbT2002FukaTempTableEntity();
        set更正後_計算後情報の全項目(entity);
        set宛名の全項目(entity);
        set宛先の全項目(entity);
        set納組の全項目(entity);
        set口座の全項目(entity);
        set対象者_追加含む情報_更正後の全項目(entity);
        entity.setZennendoTokuchoKibetsuKingaku06(new RString("0"));
        return entity;
    }

    private void set口座の全項目(DbT2002FukaTempTableEntity entity) {
        if (口座 == null) {
            return;
        }
        UaT0310KozaEntity 口座Entity = 口座.getUaT0310KozaEntity();
        entity.setUaT0310Koza_insertDantaiCd(口座Entity.getInsertDantaiCd());
        entity.setUaT0310Koza_isDeleted(口座Entity.getIsDeleted());
        entity.setUaT0310Koza_kozaId(口座Entity.getKozaId());
        entity.setUaT0310Koza_shikibetsuCode(口座Entity.getShikibetsuCode());
        entity.setUaT0310Koza_gyomubetsuPrimaryKey(口座Entity.getGyomubetsuPrimaryKey());
        entity.setUaT0310Koza_gyomuKoyuKey(口座Entity.getGyomuKoyuKey());
        entity.setUaT0310Koza_yotoKubun(口座Entity.getYotoKubun().getColumnValue().getColumnValue());
        entity.setUaT0310Koza_torokuRenban(口座Entity.getTorokuRenban());
        entity.setUaT0310Koza_kaishiYMD(口座Entity.getKaishiYMD());
        entity.setUaT0310Koza_shuryoYMD(口座Entity.getShuryoYMD());
        entity.setUaT0310Koza_kinyuKikanCode(口座Entity.getKinyuKikanCode());
        entity.setUaT0310Koza_kinyuKikanShitenCode(口座Entity.getKinyuKikanShitenCode());
        entity.setUaT0310Koza_yokinShubetsu(口座Entity.getYokinShubetsu());
        entity.setUaT0310Koza_kozaNo(口座Entity.getKozaNo());
        entity.setUaT0310Koza_tsuchoKigo(口座Entity.getTsuchoKigo());
        entity.setUaT0310Koza_tsuchoNo(口座Entity.getTsuchoNo());
        entity.setUaT0310Koza_kozaMeigininShikibetsuCode(口座Entity.getKozaMeigininShikibetsuCode());
        entity.setUaT0310Koza_kozaMeiginin(口座Entity.getKozaMeiginin());
        entity.setUaT0310Koza_kozaMeigininKanji(口座Entity.getKozaMeigininKanji());
        entity.setUaT0310Koza_kensakuyoMeiginin(口座Entity.getKensakuyoMeiginin());
        entity.setUaT0310Koza_kozaHyojiKubun(口座Entity.getKozaHyojiKubun());
        entity.setUaT0310Koza_nayoseKubun(口座Entity.getNayoseKubun());
        entity.setUaT0310Koza_zumitsuHakkoYohi(口座Entity.getZumitsuHakkoYohi());
        entity.setUaT0310Koza_kozaFurikaeKaishiTsuchiHakkozumi(口座Entity.getKozaFurikaeKaishiTsuchiHakkozumi());
        entity.setUaT0310Koza_kozaTorokuNo(口座Entity.getKozaTorokuNo());
        entity.setUaT0310Koza_kozaTorokuKubunCode(口座Entity.getKozaTorokuKubunCode().getColumnValue().getColumnValue());
        entity.setUaT0310Koza_kozaKaishiUketsukeYMD(口座Entity.getKozaKaishiUketsukeYMD());
        entity.setUaT0310Koza_kozaShuryoUketsukeYMD(口座Entity.getKozaShuryoUketsukeYMD());
        entity.setUaT0310Koza_kozaTorokuYMD(口座Entity.getKozaTorokuYMD());
        entity.setUaT0310Koza_temban(口座Entity.getTemban());

        UaT0302KinyuKikanEntity 記入機関Entity = 口座.getKinyuKikanEntity();
        entity.setUaT0302KinyuKikan_insertDantaiCd(記入機関Entity.getInsertDantaiCd());
        entity.setUaT0302KinyuKikan_isDeleted(記入機関Entity.getIsDeleted());
        entity.setUaT0302KinyuKikan_kinyuKikanCode(記入機関Entity.getKinyuKikanCode());
        entity.setUaT0302KinyuKikan_kaishiYMD(記入機関Entity.getKaishiYMD());
        entity.setUaT0302KinyuKikan_shuryoYMD(記入機関Entity.getShuryoYMD());
        entity.setUaT0302KinyuKikan_name(記入機関Entity.getName());
        entity.setUaT0302KinyuKikan_kanaName(記入機関Entity.getKanaName());
        if (記入機関Entity.getYokinShubetsuPatternCode() != null && 記入機関Entity.getYokinShubetsuPatternCode().getColumnValue() != null) {
            entity.setUaT0302KinyuKikan_yokinShubetsuPatternCode(記入機関Entity.getYokinShubetsuPatternCode().getColumnValue().getColumnValue());
        }
        entity.setUaT0302KinyuKikan_hyojijun(記入機関Entity.getHyojijun());

        UaT0303KinyuKikanShitenEntity 記入機関支店Entity = 口座.getKinyuKikanShitenEntity();
        entity.setUaT0303KinyuKikanShiten_insertDantaiCd(記入機関支店Entity.getInsertDantaiCd());
        entity.setUaT0303KinyuKikanShiten_isDeleted(記入機関支店Entity.getIsDeleted());
        entity.setUaT0303KinyuKikanShiten_kinyuKikanCode(記入機関支店Entity.getKinyuKikanCode());
        entity.setUaT0303KinyuKikanShiten_kinyuKikanShitenCode(記入機関支店Entity.getKinyuKikanShitenCode());
        entity.setUaT0303KinyuKikanShiten_kaishiYMD(記入機関支店Entity.getKaishiYMD());
        entity.setUaT0303KinyuKikanShiten_shuryoYMD(記入機関支店Entity.getShuryoYMD());
        entity.setUaT0303KinyuKikanShiten_name(記入機関支店Entity.getName());
        entity.setUaT0303KinyuKikanShiten_kanaName(記入機関支店Entity.getKanaName());
        entity.setUaT0303KinyuKikanShiten_hyojijun(記入機関支店Entity.getHyojijun());

        UaT0301YokinShubetsuPatternEntity 預金種別 = 口座.getYokinShubetsuPatternEntity();
        entity.setUaT0301YokinShubetsuPattern_insertDantaiCd(預金種別.getInsertDantaiCd());
        entity.setUaT0301YokinShubetsuPattern_isDeleted(預金種別.getIsDeleted());
        if (預金種別.getYokinShubetsuPatternCode() != null && 預金種別.getYokinShubetsuPatternCode().getColumnValue() != null) {
            entity.setUaT0301YokinShubetsuPattern_yokinShubetsuPatternCode(預金種別.getYokinShubetsuPatternCode().getColumnValue().getColumnValue());
        }
        entity.setUaT0301YokinShubetsuPattern_yokinShubetsuCode(預金種別.getYokinShubetsuCode());
        entity.setUaT0301YokinShubetsuPattern_yokinShubetsuMeisho(預金種別.getYokinShubetsuMeisho());
        entity.setUaT0301YokinShubetsuPattern_yokinShubetsuRyakusho(預金種別.getYokinShubetsuRyakusho());

        entity.setShunoKensu(口座.getShunoKensu());
    }

    private void set納組の全項目(DbT2002FukaTempTableEntity entity) {
        if (納組 == null) {
            return;
        }
        entity.setCaT0714SeikyuHoho_insertDantaiCd(納組.getSeikyuHoho().getInsertDantaiCd());
        entity.setCaT0714SeikyuHoho_isDeleted(納組.getSeikyuHoho().getIsDeleted());
        entity.setCaT0714SeikyuHoho_shikibetsuCode(納組.getSeikyuHoho().getShikibetsuCode());
        entity.setCaT0714SeikyuHoho_gyomubetsuPrimaryKey(納組.getSeikyuHoho().getGyomubetsuPrimaryKey());
        entity.setCaT0714SeikyuHoho_gyomuKoyuKey(納組.getSeikyuHoho().getGyomuKoyuKey());
        entity.setCaT0714SeikyuHoho_shiharaiHoho(納組.getSeikyuHoho().getShiharaiHoho());
        entity.setCaT0714SeikyuHoho_zennoKubun(納組.getSeikyuHoho().getZennoKubun());
        entity.setCaT0714SeikyuHoho_creditKeizokuTorokuKey(納組.getSeikyuHoho().getCreditKeizokuTorokuKey());
        entity.setCaT0714SeikyuHoho_kaishiYMD(納組.getSeikyuHoho().getKaishiYMD());
        entity.setCaT0714SeikyuHoho_shuryoYMD(納組.getSeikyuHoho().getShuryoYMD());
        entity.setCaT0714SeikyuHoho_nokumiShurui(納組.getSeikyuHoho().getNokumiShurui());
        entity.setCaT0714SeikyuHoho_nokumiCode(納組.getSeikyuHoho().getNokumiCode());
        entity.setCaT0714SeikyuHoho_creditKeiyakushaId(納組.getSeikyuHoho().getCreditKeiyakushaId());
        entity.setCaT0714SeikyuHoho_kozaId(納組.getSeikyuHoho().getKozaId());
        entity.setCaT0752Nokumi_insertDantaiCd(納組.getNokumi().getInsertDantaiCd());
        entity.setCaT0752Nokumi_isDeleted(納組.getNokumi().getIsDeleted());
        entity.setCaT0752Nokumi_nokumiShurui(納組.getNokumi().getNokumiShurui());
        entity.setCaT0752Nokumi_nokumiCode(納組.getNokumi().getNokumiCode());
        entity.setCaT0752Nokumi_meisho(納組.getNokumi().getMeisho());
        entity.setCaT0752Nokumi_kanaMeisho(納組.getNokumi().getKanaMeisho());
        entity.setCaT0752Nokumi_kensakuyoKanaMeisho(納組.getNokumi().getKensakuyoKanaMeisho());
        entity.setCaT0752Nokumi_daihyoshaShikibetsuCode(納組.getNokumi().getDaihyoshaShikibetsuCode());
        entity.setCaT0752Nokumi_daihyoshaShimei(納組.getNokumi().getDaihyoshaShimei());
    }

    private void set宛先の全項目(DbT2002FukaTempTableEntity entity) {
        if (宛先 == null) {
            return;
        }
        entity.setAtesaki_shikibetsuCode(宛先.getShikibetsuCode());
        entity.setAtesaki_atesakiShubetsu(宛先.getAtesakiShubetsu());
        entity.setAtesaki_gyomubetsuPrimaryKey(宛先.getGyomubetsuPrimaryKey());
        entity.setAtesaki_gyomuCode(宛先.getGyomuCode());
        entity.setAtesaki_subGyomuCode(宛先.getSubGyomuCode());
        entity.setAtesaki_gyomuGroupCode(宛先.getGyomuGroupCode());
        entity.setAtesaki_gyomuGroupName(宛先.getGyomuGroupName());
        entity.setAtesaki_subGyomuGroupCode(宛先.getSubGyomuGroupCode());
        entity.setAtesaki_subGyomuGroupName(宛先.getSubGyomuGroupName());
        entity.setAtesaki_kamokuCode(宛先.getKamokuCode());
        entity.setAtesaki_gyomuKoyuKey(宛先.getGyomuKoyuKey());
        entity.setAtesaki_kannaiKangaiKubun(宛先.getKannaiKangaiKubun());
        entity.setAtesaki_zenkokuJushoCode(宛先.getZenkokuJushoCode());
        entity.setAtesaki_choikiCode(宛先.getChoikiCode());
        entity.setAtesaki_jusho(宛先.getJusho());
        entity.setAtesaki_yubinNo(宛先.getYubinNo());
        entity.setAtesaki_banchiCode1(宛先.getBanchiCode1());
        entity.setAtesaki_banchiCode2(宛先.getBanchiCode2());
        entity.setAtesaki_banchiCode3(宛先.getBanchiCode3());
        entity.setAtesaki_banchiCode4(宛先.getBanchiCode4());
        entity.setAtesaki_banchi(宛先.getBanchi());
        entity.setAtesaki_katagakiInjiFlag(宛先.getKatagakiInjiFlag());
        entity.setAtesaki_katagaki(宛先.getKatagaki());
        entity.setAtesaki_gyoseikuCode(宛先.getGyoseikuCode());
        entity.setAtesaki_gyoseiku(宛先.getGyoseiku());
        entity.setAtesaki_chikuCode1(宛先.getChikuCode1());
        entity.setAtesaki_chiku1(宛先.getChiku1());
        entity.setAtesaki_chikuCode2(宛先.getChikuCode2());
        entity.setAtesaki_chiku2(宛先.getChiku2());
        entity.setAtesaki_chikuCode3(宛先.getChikuCode3());
        entity.setAtesaki_chiku3(宛先.getChiku3());
        entity.setAtesaki_juminShubetsuCode(宛先.getJuminShubetsuCode());
        entity.setAtesaki_juminJotaiCode(宛先.getJuminJotaiCode());
        entity.setAtesaki_kanjiShimei(宛先.getKanjiShimei());
        entity.setAtesaki_kanaShimei(宛先.getKanaShimei());
        entity.setAtesaki_gaikokujinShimei(宛先.getGaikokujinShimei());
        entity.setAtesaki_gaikokujinHeikimei(宛先.getGaikokujinHeikimei());
        entity.setAtesaki_gaikokujinKanaShimei(宛先.getGaikokujinKanaShimei());
        entity.setAtesaki_tsushomei(宛先.getTsushomei());
        entity.setAtesaki_kanaTsushomei(宛先.getKanaTsushomei());
        entity.setAtesaki_shimeiRiyoKubun(宛先.getShimeiRiyoKubun());
        entity.setAtesaki_kyoyushaMeisho(宛先.getKyoyushaMeisho());
        entity.setAtesaki_kyoyushaKanaMeisho(宛先.getKyoyushaKanaMeisho());
        entity.setAtesaki_hojinKeitaiCode(宛先.getHojinKeitaiCode());
        entity.setAtesaki_hojinMeiHenshuKubun(宛先.getHojinMeiHenshuKubun());
        entity.setAtesaki_hojinKeitaiRyakushoKubun(宛先.getHojinKeitaiRyakushoKubun());
        entity.setAtesaki_hojinMeisho(宛先.getHojinMeisho());
        entity.setAtesaki_hojinKanaMeisho(宛先.getHojinKanaMeisho());
        entity.setAtesaki_hojinShitenMeisho(宛先.getHojinShitenMeisho());
        entity.setAtesaki_hojinShitenKanaMeisho(宛先.getHojinKanaMeisho());
        entity.setAtesaki_sofusakiMeisho(宛先.getHojinMeisho());
        entity.setAtesaki_sofusakiKanaMeisho(宛先.getSofusakiKanaMeisho());
        entity.setAtesaki_renrakusaki1(宛先.getRenrakusaki1());
        entity.setAtesaki_renrakusakiKubun1(宛先.getRenrakusakiKubun1());
        entity.setAtesaki_renrakusaki2(宛先.getRenrakusaki2());
        entity.setAtesaki_renrakusakiKubun2(宛先.getRenrakusakiKubun2());
        entity.setAtesaki_renrakusaki3(宛先.getRenrakusaki3());
        entity.setAtesaki_renrakusakiKubun3(宛先.getRenrakusakiKubun3());
        entity.setAtesaki_mailAddress(宛先.getMailAddress());
        entity.setAtesaki_dainoKankeiCode(宛先.getDainoKankeiCode());
        entity.setAtesaki_biko(宛先.getBiko());
        entity.setAtesaki_honninJuminShubetsuCode(宛先.getHonninJuminShubetsuCode());
        entity.setAtesaki_honninJuminJotaiCode(宛先.getHonninJuminJotaiCode());
        entity.setAtesaki_honninKanjiShimei(宛先.getHonninKanjiShimei());
        entity.setAtesaki_honninKanaShimei(宛先.getHonninKanaShimei());
        entity.setAtesaki_honninGaikokujinShimei(宛先.getHonninGaikokujinHeikimei());
        entity.setAtesaki_honninGaikokujinHeikimei(宛先.getHonninGaikokujinHeikimei());
        entity.setAtesaki_honninGaikokujinKanaShimei(宛先.getHonninGaikokujinKanaShimei());
        entity.setAtesaki_honninTsushomei(宛先.getHonninTsushomei());
        entity.setAtesaki_honninKanaTsushomei(宛先.getHonninKanaTsushomei());
        entity.setAtesaki_honninShimeiRiyoKubun(宛先.getHonninShimeiRiyoKubun());
        entity.setAtesaki_honninKyoyushaMeisho(宛先.getHonninKyoyushaMeisho());
        entity.setAtesaki_honninKyoyushaKanaMeisho(宛先.getHonninKyoyushaKanaMeisho());
        entity.setAtesaki_honninHojinKeitaiCode(宛先.getHonninHojinKeitaiCode());
        entity.setAtesaki_honninHojinMeiHenshuKubun(宛先.getHonninHojinMeiHenshuKubun());
        entity.setAtesaki_honninHojinKeitaiRyakushoKubun(宛先.getHonninHojinKeitaiRyakushoKubun());
        entity.setAtesaki_honninHojinMeisho(宛先.getHonninHojinMeisho());
        entity.setAtesaki_honninHojinKanaMeisho(宛先.getHonninHojinKanaMeisho());
        entity.setAtesaki_honninHojinShitenMeisho(宛先.getHojinShitenMeisho());
        entity.setAtesaki_honninHojinShitenKanaMeisho(宛先.getHonninHojinKanaMeisho());
        entity.setAtesaki_honninDaihyoshaShikibetsuCode(宛先.getHonninDaihyoshaShikibetsuCode());
        entity.setAtesaki_honninDaihyoshaJuminShubetsuCode(宛先.getHonninDaihyoshaJuminShubetsuCode());
        entity.setAtesaki_honninDaihyoshaShimei(宛先.getHonninDaihyoshaShimei());
        entity.setAtesaki_honninDaihyoshaKanaShimei(宛先.getHonninDaihyoshaKanaShimei());
        entity.setAtesaki_honninDaihyoshaNihonjinShimei(宛先.getHonninDaihyoshaNihonjinShimei());
        entity.setAtesaki_honninDaihyoshaNihonjinKanaShimei(宛先.getHonninDaihyoshaNihonjinKanaShimei());
        entity.setAtesaki_honninDaihyoshaGaikokujinShimei(宛先.getHonninDaihyoshaGaikokujinShimei());
        entity.setAtesaki_honninDaihyoshaGaikokujinHeikimei(宛先.getHonninDaihyoshaGaikokujinHeikimei());
        entity.setAtesaki_honninDaihyoshaGaikokujinKanaShimei(宛先.getHonninDaihyoshaGaikokujinKanaShimei());
        entity.setAtesaki_honninDaihyoshaTsushomei(宛先.getHonninDaihyoshaTsushomei());
        entity.setAtesaki_honninDaihyoshaShimeiRiyoKubun(宛先.getHonninDaihyoshaShimeiRiyoKubun());
        entity.setAtesaki_honninDaihyoshaKanaTsushomei(宛先.getHonninDaihyoshaKanaTsushomei());
        entity.setAtesaki_setainushiShikibetsuCode(宛先.getSetainushiShikibetsuCode());
        entity.setAtesaki_setainushiKannaiKangaiKubun(宛先.getSetainushiKannaiKangaiKubun());
        entity.setAtesaki_setainushiZenkokuJushoCode(宛先.getSetainushiZenkokuJushoCode());
        entity.setAtesaki_setainushiChoikiCode(宛先.getSetainushiChoikiCode());
        entity.setAtesaki_setainushiJusho(宛先.getSetainushiJusho());
        entity.setAtesaki_setainushiYubinNo(宛先.getSetainushiYubinNo());
        entity.setAtesaki_setainushiBanchiCode1(宛先.getSetainushiBanchiCode1());
        entity.setAtesaki_setainushiBanchiCode2(宛先.getSetainushiBanchiCode2());
        entity.setAtesaki_setainushiBanchiCode3(宛先.getSetainushiBanchiCode3());
        entity.setAtesaki_setainushiBanchiCode4(宛先.getSetainushiBanchiCode4());
        entity.setAtesaki_setainushiBanchi(宛先.getSetainushiBanchi());
        entity.setAtesaki_setainushiKatagakiInjiFlag(宛先.getSetainushiKatagakiInjiFlag());
        entity.setAtesaki_setainushiKatagaki(宛先.getSetainushiKatagaki());
        entity.setAtesaki_setainushiGyoseikuCode(宛先.getSetainushiGyoseikuCode());
        entity.setAtesaki_setainushiGyoseikuName(宛先.getSetainushiGyoseikuName());
        entity.setAtesaki_setainushiChikuCode1(宛先.getSetainushiChikuCode1());
        entity.setAtesaki_setainushiChiku1(宛先.getSetainushiChiku1());
        entity.setAtesaki_setainushiChikuCode2(宛先.getSetainushiChikuCode2());
        entity.setAtesaki_setainushiChiku2(宛先.getSetainushiChiku2());
        entity.setAtesaki_setainushiChikuCode3(宛先.getSetainushiChikuCode3());
        entity.setAtesaki_setainushiChiku3(宛先.getSetainushiChiku3());
        entity.setAtesaki_setainushiJuminShubetsuCode(宛先.getSetainushiJuminJotaiCode());
        entity.setAtesaki_setainushiJuminJotaiCode(宛先.getSetainushiJuminJotaiCode());
        entity.setAtesaki_setainushiKanjiShimei(宛先.getSetainushiKanjiShimei());
        entity.setAtesaki_setainushiKanaShimei(宛先.getSetainushiKanaShimei());
        entity.setAtesaki_setainushiGaikokujinShimei(宛先.getSetainushiGaikokujinShimei());
        entity.setAtesaki_setainushiGaikokujinHeikimei(宛先.getSetainushiGaikokujinHeikimei());
        entity.setAtesaki_setainushiGaikokujinKanaShimei(宛先.getSetainushiGaikokujinKanaShimei());
        entity.setAtesaki_setainushiTsushomei(宛先.getSetainushiTsushomei());
        entity.setAtesaki_setainushiKanaTsushomei(宛先.getSetainushiKanaTsushomei());
        entity.setAtesaki_setainushiShimeiRiyoKubun(宛先.getSetainushiShimeiRiyoKubun());
        entity.setAtesaki_setainushiRenrakusaki1(宛先.getSetainushiRenrakusaki1());
        entity.setAtesaki_setainushiRenrakusakiKubun1(宛先.getSetainushiRenrakusakiKubun1());
        entity.setAtesaki_setainushiRenrakusaki2(宛先.getSetainushiRenrakusaki2());
        entity.setAtesaki_setainushiRenrakusakiKubun2(宛先.getSetainushiRenrakusakiKubun2());
        entity.setAtesaki_setainushiRenrakusaki3(宛先.getSetainushiRenrakusaki3());
        entity.setAtesaki_setainushiRenrakusakiKubun3(宛先.getSetainushiRenrakusakiKubun3());
        entity.setAtesaki_setainushiMailAddress(宛先.getSetainushiMailAddress());
        entity.setAtesaki_dainoninShikibetsuCode(宛先.getDainoninShikibetsuCode());
    }

    private void set宛名の全項目(DbT2002FukaTempTableEntity entity) {
        if (宛名 == null) {
            return;
        }
        entity.setAtena_shikibetsuCode(宛名.getShikibetsuCode());
        entity.setAtena_genLasdecCode(宛名.getGenLasdecCode());
        entity.setAtena_kyuLasdecCode(宛名.getKyuLasdecCode());
        entity.setAtena_kyuLasdecCodeRenban(宛名.getKyuLasdecCodeRenban());
        entity.setAtena_gyomuCode(宛名.getGyomuCode());
        entity.setAtena_rirekiNo(宛名.getRirekiNo());
        entity.setAtena_currentFlag(宛名.getCurrentFlag());
        entity.setAtena_juminShubetsuCode(宛名.getJuminShubetsuCode());
        entity.setAtena_kojinNo(宛名.getKojinNo());
        entity.setAtena_hojinNo(宛名.getHojinNo());
        entity.setAtena_shoriYMD(宛名.getShoriYMD());
        entity.setAtena_idoJiyuCode(宛名.getIdoJiyuCode());
        entity.setAtena_idoYMD(宛名.getIdoYMD());
        entity.setAtena_todokedeJiyuCode(宛名.getTodokedeJiyuCode());
        entity.setAtena_todokedeYMD(宛名.getTodokedeYMD());
        entity.setAtena_idoRiyuCode(宛名.getIdoRiyuCode());
        entity.setAtena_meisho(宛名.getMeisho());
        entity.setAtena_kanaMeisho(宛名.getKanaMeisho());
        entity.setAtena_kannaiKangaiKubun(宛名.getKannaiKangaiKubun());
        entity.setAtena_yubinNo(宛名.getYubinNo());
        entity.setAtena_choikiCode(宛名.getChoikiCode());
        entity.setAtena_zenkokuJushoCode(宛名.getZenkokuJushoCode());
        entity.setAtena_jusho(宛名.getJusho());
        entity.setAtena_banchiCode1(宛名.getBanchiCode1());
        entity.setAtena_banchiCode2(宛名.getBanchiCode2());
        entity.setAtena_banchiCode3(宛名.getBanchiCode3());
        entity.setAtena_banchiCode4(宛名.getBanchiCode4());
        entity.setAtena_banchi(宛名.getBanchi());
        entity.setAtena_katagaki(宛名.getKatagaki());
        entity.setAtena_katagakiInjiFlag(宛名.getKatagakiInjiFlag());
        entity.setAtena_gyoseikuCode(宛名.getGyoseikuCode());
        entity.setAtena_gyoseikuName(宛名.getGyoseikuName());
        entity.setAtena_chikuCode1(宛名.getChikuCode1());
        entity.setAtena_chikuName1(宛名.getChikuName1());
        entity.setAtena_chikuCode2(宛名.getChikuCode2());
        entity.setAtena_chikuName2(宛名.getChikuName2());
        entity.setAtena_chikuCode3(宛名.getChikuCode3());
        entity.setAtena_chikuName3(宛名.getChikuName3());
        entity.setAtena_shogakkokuCode(宛名.getShogakkokuCode());
        entity.setAtena_shogakkokuName(宛名.getShogakkokuName());
        entity.setAtena_chugakkokuCode(宛名.getChugakkokuCode());
        entity.setAtena_chugakkokuName(宛名.getChugakkokuName());
        entity.setAtena_tohyokuCode(宛名.getTohyokuCode());
        entity.setAtena_tohyokuName(宛名.getTohyokuName());
        entity.setAtena_juminJotaiCode(宛名.getJuminJotaiCode());
        entity.setAtena_setaiCode(宛名.getSetaiCode());
        entity.setAtena_seinengappiYMD(宛名.getSeinengappiYMD());
        entity.setAtena_seinengappiFushoKubun(宛名.getSeinengappiFushoKubun());
        entity.setAtena_seibetsuCode(宛名.getSeibetsuCode());
        entity.setAtena_tsuzukigaraCode(宛名.getTsuzukigaraCode());
        entity.setAtena_tsuzukigara(宛名.getTsuzukigara());
        entity.setAtena_kazokuNo(宛名.getKazokuNo());
        entity.setAtena_juminhyoHyojijun(宛名.getJuminhyoHyojijun());
        entity.setAtena_kikaYMD(宛名.getKikaYMD());
        entity.setAtena_kanjiShimei(宛名.getKanjiShimei());
        entity.setAtena_kanaShimei(宛名.getKanaShimei());
        entity.setAtena_honsekiZenkokuJushoCode(宛名.getHonsekiZenkokuJushoCode());
        entity.setAtena_honsekiChoikiCode(宛名.getHonsekiChoikiCode());
        entity.setAtena_honsekiJusho(宛名.getHonsekiJusho());
        entity.setAtena_honsekiBanchi(宛名.getHonsekiBanchi());
        entity.setAtena_hittosha(宛名.getHittosha());
        entity.setAtena_gaikokujinShimei(宛名.getGaikokujinShimei());
        entity.setAtena_gaikokujinHeikimei(宛名.getGaikokujinHeikimei());
        entity.setAtena_gaikokujinKanaShimei(宛名.getGaikokujinKanaShimei());
        entity.setAtena_tsushomei(宛名.getTsushomei());
        entity.setAtena_shimeiRiyoKubun(宛名.getShimeiRiyoKubun());
        entity.setAtena_kanaTsushomei(宛名.getKanaTsushomei());
        entity.setAtena_katakanaHyoki(宛名.getKatakanaHyoki());
        entity.setAtena_kokusekiChiikiCode(宛名.getKokusekiChiikiCode());
        entity.setAtena_zairyuShikakuCode(宛名.getZairyuShikakuCode());
        entity.setAtena_zairyuKikanCode(宛名.getZairyuKikanCode());
        entity.setAtena_zairyuKikantoManryoYMD(宛名.getZairyuKikantoManryoYMD());
        entity.setAtena_zairyuCardtoNo(宛名.getZairyuCardtoNo());
        entity.setAtena_zairyuCardtoYukoYMD(宛名.getZairyuCardtoYukoYMD());
        entity.setAtena_dai30Jono45niKiteisuruKubun(宛名.getDai30Jono45niKiteisuruKubun());
        entity.setAtena_setainushiShikibetsuCode(宛名.getSetainushiShikibetsuCode());
        entity.setAtena_setainushiMei(宛名.getSetainushiMei());
        entity.setAtena_hojinKeitaiCode(宛名.getHojinKeitaiCode());
        entity.setAtena_hojinKeitaiMeisho(宛名.getHojinKeitaiMeisho());
        entity.setAtena_hojinKeitaiRyakusho(宛名.getHojinKeitaiRyakusho());
        entity.setAtena_hojinMeishoHenshuKubun(宛名.getHojinMeishoHenshuKubun());
        entity.setAtena_hojinKeitaiRyakushoKubun(宛名.getHojinKeitaiRyakushoKubun());
        entity.setAtena_hojinMeisho(宛名.getHojinMeisho());
        entity.setAtena_hojinKanaMeisho(宛名.getHojinKanaMeisho());
        entity.setAtena_hojinShitenMeisho(宛名.getHojinShitenMeisho());
        entity.setAtena_hojinShitenKanaMeisho(宛名.getHojinShitenKanaMeisho());
        entity.setAtena_daihyoshaShikibetsuCode(宛名.getDaihyoshaShikibetsuCode());
        entity.setAtena_daihyoshaJuminShubetsu(宛名.getDaihyoshaJuminShubetsu());
        entity.setAtena_daihyoshaShimei(宛名.getDaihyoshaShimei());
        entity.setAtena_daihyoshaKanaShimei(宛名.getDaihyoshaKanaShimei());
        entity.setAtena_daihyoshaNihonjinShimei(宛名.getDaihyoshaNihonjinShimei());
        entity.setAtena_daihyoshaNihonjinKanaShimei(宛名.getDaihyoshaNihonjinKanaShimei());
        entity.setAtena_daihyoshaGaikokujinShimei(宛名.getDaihyoshaGaikokujinHeikimei());
        entity.setAtena_daihyoshaGaikokujinHeikimei(宛名.getDaihyoshaGaikokujinHeikimei());
        entity.setAtena_daihyoshaGaikokujinKanaShimei(宛名.getDaihyoshaGaikokujinKanaShimei());
        entity.setAtena_daihyoshaTsushomei(宛名.getDaihyoshaTsushomei());
        entity.setAtena_daihyoshaShimeiRiyoKubun(宛名.getDaihyoshaShimeiRiyoKubun());
        entity.setAtena_daihyoshaKanaTsushomei(宛名.getDaihyoshaKanaTsushomei());
        entity.setAtena_daihyoshaKannaiKangaiKubun(宛名.getDaihyoshaKannaiKangaiKubun());
        entity.setAtena_daihyoshaYubinNo(宛名.getDaihyoshaYubinNo());
        entity.setAtena_daihyoshaChoikiCode(宛名.getDaihyoshaChoikiCode());
        entity.setAtena_daihyoshaZenkokuJushoCode(宛名.getDaihyoshaZenkokuJushoCode());
        entity.setAtena_daihyoshaJusho(宛名.getDaihyoshaJusho());
        entity.setAtena_daihyoshaBanchiCode1(宛名.getDaihyoshaBanchiCode1());
        entity.setAtena_daihyoshaBanchiCode2(宛名.getDaihyoshaBanchiCode2());
        entity.setAtena_daihyoshaBanchiCode3(宛名.getDaihyoshaBanchiCode3());
        entity.setAtena_daihyoshaBanchiCode4(宛名.getDaihyoshaBanchiCode4());
        entity.setAtena_daihyoshaBanchi(宛名.getDaihyoshaBanchi());
        entity.setAtena_daihyoshaKatagaki(宛名.getDaihyoshaKatagaki());
        entity.setAtena_ninkachiendantaiTorokuShikakuKubun(宛名.getNinkachiendantaiTorokuShikakuKubun());
        entity.setAtena_ninkachiendantaiNinkaYMD(宛名.getNinkachiendantaiNinkaYMD());
        entity.setAtena_kojinHojinKBN(宛名.getKojinHojinKBN());
        entity.setAtena_kyoyushaMeisho(宛名.getKyoyushaMeisho());
        entity.setAtena_kyoyushaKanaMeisho(宛名.getKyoyushaKanaMeisho());
        entity.setAtena_torokuJiyuCode(宛名.getTorokuJiyuCode());
        entity.setAtena_torokuIdoYMD(宛名.getTorokuIdoYMD());
        entity.setAtena_torokuTodokedeYMD(宛名.getTorokuTodokedeYMD());
        entity.setAtena_juteiJiyuCode(宛名.getJuteiJiyuCode());
        entity.setAtena_juteiIdoYMD(宛名.getJuteiIdoYMD());
        entity.setAtena_juteiTodokedeYMD(宛名.getJuteiTodokedeYMD());
        entity.setAtena_shojoJiyuCode(宛名.getShojoJiyuCode());
        entity.setAtena_shojoIdoYMD(宛名.getShojoIdoYMD());
        entity.setAtena_shojoTodokedeYMD(宛名.getShojoTodokedeYMD());
        entity.setAtena_jutonaiYubinNo(宛名.getJutonaiYubinNo());
        entity.setAtena_jutonaiChoikiCode(宛名.getJutonaiChoikiCode());
        entity.setAtena_jutonaiJusho(宛名.getJutonaiJusho());
        entity.setAtena_jutonaiBanchiCode1(宛名.getJutonaiBanchiCode1());
        entity.setAtena_jutonaiBanchiCode2(宛名.getJutonaiBanchiCode2());
        entity.setAtena_jutonaiBanchiCode3(宛名.getJutonaiBanchiCode3());
        entity.setAtena_jutonaiBanchiCode4(宛名.getJutonaiBanchiCode4());
        entity.setAtena_jutonaiBanchi(宛名.getJutonaiBanchi());
        entity.setAtena_jutonaiKatagaki(宛名.getJutonaiKatagaki());
        entity.setAtena_jutonaiKatagakiInjiFlag(宛名.getJutonaiKatagakiInjiFlag());
        entity.setAtena_tennyumaeYubinNo(宛名.getTennyumaeYubinNo());
        entity.setAtena_tennyumaeZenkokuJushoCode(宛名.getTennyumaeZenkokuJushoCode());
        entity.setAtena_tennyumaeJusho(宛名.getTennyumaeJusho());
        entity.setAtena_tennyumaeBanchi(宛名.getTennyumaeBanchi());
        set宛名の全項目_２(entity);
    }

    private void set宛名の全項目_２(DbT2002FukaTempTableEntity entity) {
        if (宛名 == null) {
            return;
        }
        entity.setAtena_tennyumaeKatagaki(宛名.getTennyumaeKatagaki());
        entity.setAtena_tennyumaeSetainushimei(宛名.getTennyumaeSetainushimei());
        entity.setAtena_tennyumaeKyusei(宛名.getTennyumaeKyusei());
        entity.setAtena_saishuJutochiYubinNo(宛名.getSaishuJutochiYubinNo());
        entity.setAtena_saishuJutochiZenkokuJushoCode(宛名.getSaishuJutochiZenkokuJushoCode());
        entity.setAtena_saishuJutochiJusho(宛名.getSaishuJutochiJusho());
        entity.setAtena_saishuJutochiBanchi(宛名.getSaishuJutochiBanchi());
        entity.setAtena_saishuJutochiKatagaki(宛名.getSaishuJutochiKatagaki());
        entity.setAtena_saishuJutochiSetainushimei(宛名.getSaishuJutochiSetainushimei());
        entity.setAtena_tenshutsuYoteiIdoYMD(宛名.getTenshutsuYoteiIdoYMD());
        entity.setAtena_tenshutsuYoteiYubinNo(宛名.getTenshutsuKakuteiYubinNo());
        entity.setAtena_tenshutsuYoteiZenkokuJushoCode(宛名.getTenshutsuYoteiZenkokuJushoCode());
        entity.setAtena_tenshutsuYoteiJusho(宛名.getTenshutsuYoteiJusho());
        entity.setAtena_tenshutsuYoteiBanchi(宛名.getTenshutsuYoteiBanchi());
        entity.setAtena_tenshutsuYoteiKatagaki(宛名.getTenshutsuKakuteiKatagaki());
        entity.setAtena_tenshutsuYoteiSetainushimei(宛名.getTenshutsuYoteiSetainushimei());
        entity.setAtena_tenshutsuKakuteiIdoYMD(宛名.getTenshutsuKakuteiIdoYMD());
        entity.setAtena_tenshutsuKakuteiTsuchiYMD(宛名.getTenshutsuKakuteiTsuchiYMD());
        entity.setAtena_tenshutsuKakuteiYubinNo(宛名.getTenshutsuKakuteiYubinNo());
        entity.setAtena_tenshutsuKakuteiZenkokuJushoCode(宛名.getTenshutsuKakuteiZenkokuJushoCode());
        entity.setAtena_tenshutsuKakuteiJusho(宛名.getTenshutsuKakuteiJusho());
        entity.setAtena_tenshutsuKakuteiBanchi(宛名.getTenshutsuKakuteiBanchi());
        entity.setAtena_tenshutsuKakuteiKatagaki(宛名.getTenshutsuKakuteiKatagaki());
        entity.setAtena_tenshutsuKakuteiSetainushimei(宛名.getTenshutsuKakuteiSetainushimei());
        entity.setAtena_juminhyoUtsushiHakkoSeigyoKubun(宛名.getJuminhyoUtsushiHakkoSeigyoKubun());
        entity.setAtena_renrakusaki1(宛名.getRenrakusaki1());
        entity.setAtena_kensakuRenrakusaki1(宛名.getKensakuRenrakusaki1());
        entity.setAtena_renrakusakiKubun1(宛名.getRenrakusakiKubun1());
        entity.setAtena_renrakusaki2(宛名.getRenrakusaki2());
        entity.setAtena_kensakuRenrakusaki2(宛名.getKensakuRenrakusaki2());
        entity.setAtena_renrakusakiKubun2(宛名.getRenrakusakiKubun2());
        entity.setAtena_renrakusaki3(宛名.getRenrakusaki3());
        entity.setAtena_kensakuRenrakusaki3(宛名.getKensakuRenrakusaki3());
        entity.setAtena_renrakusakiKubun3(宛名.getRenrakusakiKubun3());
        entity.setAtena_mailAddress(宛名.getMailAddress());
        entity.setAtena_biko(宛名.getBiko());
        entity.setAtena_kanaName(宛名.getKanaName());
        entity.setAtena_gaikokujinKanaName(宛名.getGaikokujinKanaName());
        entity.setAtena_kanaTsushoName(宛名.getKanaTsushoName());
        entity.setAtena_jutogaiKanriUpdateCount(宛名.getJutogaiKanriUpdateCount());
        entity.setAtena_jutogaiKanriTorokuNo(宛名.getJutogaiGaikokujinTorokuNo());
        entity.setAtena_jutogaiKojinKihonUpdateCount(宛名.getJutogaiKojinKihonUpdateCount());
        entity.setAtena_jutogaiKojinKihonTorokuNo(宛名.getJutogaiKojinKihonTorokuNo());
        entity.setAtena_jutogaiNihonjinUpdateCount(宛名.getJutogaiNihonjinUpdateCount());
        entity.setAtena_jutogaiNihonjinTorokuNo(宛名.getJutogaiNihonjinTorokuNo());
        entity.setAtena_jutogaiGaikokujinUpdateCount(宛名.getJutogaiKojinKihonUpdateCount());
        entity.setAtena_jutogaiGaikokujinTorokuNo(宛名.getJutogaiKojinKihonTorokuNo());
        entity.setAtena_hojinUpdateCount(宛名.getHojinUpdateCount());
        entity.setAtena_hojinTorokuNo(宛名.getHojinTorokuNo());
        entity.setAtena_kyoyushaUpdateCount(宛名.getKyoyushaUpdateCount());
        entity.setAtena_kyoyushaTorokuNo(宛名.getKyoyushaTorokuNo());
        entity.setAtena_shimeiSearchTorokuNo(宛名.getShimeiSearchTorokuNo());
        entity.setAtena_yusenShimeiUpdateCount(宛名.getYusenShimeiUpdateCount());
        entity.setAtena_yusenShimeiTimestamp(宛名.getYusenShimeiTimestamp());
    }

    private void set更正後_計算後情報の全項目(DbT2002FukaTempTableEntity entity) {
        if (更正後計算後情報 == null) {
            return;
        }
        entity.setKoseigo_insertDantaiCd(更正後計算後情報.getInsertDantaiCd());
        entity.setKoseigo_insertTimestamp(更正後計算後情報.getInsertTimestamp());
        entity.setKoseigo_insertReamsLoginId(更正後計算後情報.getInsertReamsLoginId());
        entity.setKoseigo_insertContextId(更正後計算後情報.getInsertContextId());
        entity.setKoseigo_isDeleted(更正後計算後情報.isDeleted());
        entity.setKoseigo_updateCount(更正後計算後情報.getUpdateCount());
        entity.setKoseigo_lastUpdateTimestamp(更正後計算後情報.getLastUpdateTimestamp());
        entity.setKoseigo_lastUpdateReamsLoginId(更正後計算後情報.getLastUpdateReamsLoginId());
        entity.setKoseigo_choteiNendo(更正後計算後情報.getChoteiNendo());
        entity.setKoseigo_fukaNendo(更正後計算後情報.getFukaNendo());
        entity.setKoseigo_tsuchishoNo(更正後計算後情報.getTsuchishoNo());
        entity.setKoseigo_koseiZengoKubun(更正後計算後情報.getKoseiZengoKubun());
        entity.setKoseigo_sakuseiShoriName(更正後計算後情報.getSakuseiShoriName());
        entity.setKoseigo_fukaRirekiNo(更正後計算後情報.getFukaRirekiNo());
        entity.setKoseigo_hihokenshaNo(更正後計算後情報.getHihokenshaNo());
        entity.setKoseigo_shikibetsuCode(更正後計算後情報.getShikibetsuCode());
        entity.setKoseigo_setaiCode(更正後計算後情報.getSetaiCode());
        entity.setKoseigo_setaiInsu(更正後計算後情報.getSetaiInsu());
        entity.setKoseigo_shikakuShutokuYMD(更正後計算後情報.getShikakuShutokuYMD());
        entity.setKoseigo_shikakuShutokuJiyu(更正後計算後情報.getShikakuShutokuJiyu());
        entity.setKoseigo_shikakuSoshitsuYMD(更正後計算後情報.getShikakuSoshitsuYMD());
        entity.setKoseigo_shikakuSoshitsuJiyu(更正後計算後情報.getShikakuSoshitsuJiyu());
        entity.setKoseigo_seihofujoShurui(更正後計算後情報.getSeihofujoShurui());
        entity.setKoseigo_seihoKaishiYMD(更正後計算後情報.getSeihoKaishiYMD());
        entity.setKoseigo_seihoHaishiYMD(更正後計算後情報.getSeihoHaishiYMD());
        entity.setKoseigo_ronenKaishiYMD(更正後計算後情報.getRonenKaishiYMD());
        entity.setKoseigo_ronenHaishiYMD(更正後計算後情報.getRonenHaishiYMD());
        entity.setKoseigo_fukaYMD(更正後計算後情報.getFukaYMD());
        entity.setKoseigo_kazeiKubun(更正後計算後情報.getKazeiKubun());
        entity.setKoseigo_setaikazeiKubun(更正後計算後情報.getSetaikazeiKubun());
        entity.setKoseigo_gokeiShotokuGaku(更正後計算後情報.getGokeiShotokuGaku());
        entity.setKoseigo_nenkinShunyuGaku(更正後計算後情報.getNenkinShunyuGaku());
        entity.setKoseigo_hokenryoDankai(更正後計算後情報.getHokenryoDankai());
        entity.setKoseigo_hokenryoDankai1(更正後計算後情報.getHokenryoDankai1());
        entity.setKoseigo_nengakuHokenryo1(更正後計算後情報.getNengakuHokenryo1());
        entity.setKoseigo_tsukiwariStartYM1(更正後計算後情報.getTsukiwariStartYM1());
        entity.setKoseigo_tsukiwariEndYM1(更正後計算後情報.getTsukiwariEndYM1());
        entity.setKoseigo_hokenryoDankai2(更正後計算後情報.getHokenryoDankai2());
        entity.setKoseigo_nengakuHokenryo2(更正後計算後情報.getNengakuHokenryo2());
        entity.setKoseigo_tsukiwariStartYM2(更正後計算後情報.getTsukiwariStartYM1());
        entity.setKoseigo_tsukiwariEndYM2(更正後計算後情報.getTsukiwariEndYM2());
        entity.setKoseigo_choteiNichiji(更正後計算後情報.getChoteiNichiji());
        entity.setKoseigo_choteiJiyu1(更正後計算後情報.getChoteiJiyu1());
        entity.setKoseigo_choteiJiyu2(更正後計算後情報.getChoteiJiyu2());
        entity.setKoseigo_choteiJiyu3(更正後計算後情報.getChoteiJiyu3());
        entity.setKoseigo_choteiJiyu4(更正後計算後情報.getChoteiJiyu4());
        entity.setKoseigo_koseiM(更正後計算後情報.getKoseiM());
        entity.setKoseigo_gemmenMaeHokenryo(更正後計算後情報.getGemmenMaeHokenryo());
        entity.setKoseigo_gemmenGaku(更正後計算後情報.getGemmenGaku());
        entity.setKoseigo_kakuteiHokenryo(更正後計算後情報.getKakuteiHokenryo());
        entity.setKoseigo_hokenryoDankaiKarisanntei(更正後計算後情報.getHokenryoDankaiKarisanntei());
        entity.setKoseigo_choshuHohoRirekiNo(更正後計算後情報.getChoshuHohoRirekiNo());
        entity.setKoseigo_idoKijunNichiji(更正後計算後情報.getIdoKijunNichiji());
        entity.setKoseigo_kozaKubun(更正後計算後情報.getKozaKubun());
        entity.setKoseigo_kyokaisoKubun(更正後計算後情報.getKyokaisoKubun());
        entity.setKoseigo_shokkenKubun(更正後計算後情報.getShokkenKubun());
        entity.setKoseigo_fukaShichosonCode(更正後計算後情報.getFukaShichosonCode());
        entity.setKoseigo_tkSaishutsuKampuGaku(更正後計算後情報.getTkSaishutsuKampuGaku());
        entity.setKoseigo_fuSaishutsuKampuGaku(更正後計算後情報.getFuSaishutsuKampuGaku());
        entity.setKoseigo_tkKibetsuGaku01(更正後計算後情報.getTkKibetsuGaku01());
        entity.setKoseigo_tkKibetsuGaku02(更正後計算後情報.getTkKibetsuGaku02());
        entity.setKoseigo_tkKibetsuGaku03(更正後計算後情報.getTkKibetsuGaku03());
        entity.setKoseigo_tkKibetsuGaku04(更正後計算後情報.getTkKibetsuGaku04());
        entity.setKoseigo_tkKibetsuGaku05(更正後計算後情報.getTkKibetsuGaku05());
        entity.setKoseigo_tkKibetsuGaku06(更正後計算後情報.getTkKibetsuGaku06());
        entity.setKoseigo_fuKibetsuGaku01(更正後計算後情報.getFuKibetsuGaku01());
        entity.setKoseigo_fuKibetsuGaku02(更正後計算後情報.getFuKibetsuGaku02());
        entity.setKoseigo_fuKibetsuGaku03(更正後計算後情報.getFuKibetsuGaku03());
        entity.setKoseigo_fuKibetsuGaku04(更正後計算後情報.getFuKibetsuGaku04());
        entity.setKoseigo_fuKibetsuGaku05(更正後計算後情報.getFuKibetsuGaku05());
        entity.setKoseigo_fuKibetsuGaku06(更正後計算後情報.getFuKibetsuGaku06());
        entity.setKoseigo_fuKibetsuGaku07(更正後計算後情報.getFuKibetsuGaku07());
        entity.setKoseigo_fuKibetsuGaku08(更正後計算後情報.getFuKibetsuGaku08());
        entity.setKoseigo_fuKibetsuGaku09(更正後計算後情報.getFuKibetsuGaku09());
        entity.setKoseigo_fuKibetsuGaku10(更正後計算後情報.getFuKibetsuGaku10());
        entity.setKoseigo_fuKibetsuGaku11(更正後計算後情報.getFuKibetsuGaku11());
        entity.setKoseigo_fuKibetsuGaku12(更正後計算後情報.getFuKibetsuGaku12());
        entity.setKoseigo_fuKibetsuGaku13(更正後計算後情報.getFuKibetsuGaku13());
        entity.setKoseigo_fuKibetsuGaku14(更正後計算後情報.getFuKibetsuGaku14());
        entity.setKoseigo_choshuHoho1gatsu(更正後計算後情報.getChoshuHoho1gatsu());
        entity.setKoseigo_choshuHoho2gatsu(更正後計算後情報.getChoshuHoho2gatsu());
        entity.setKoseigo_choshuHoho3gatsu(更正後計算後情報.getChoshuHoho3gatsu());
        entity.setKoseigo_choshuHoho4gatsu(更正後計算後情報.getChoshuHoho4gatsu());
        entity.setKoseigo_choshuHoho5gatsu(更正後計算後情報.getChoshuHoho5gatsu());
        entity.setKoseigo_choshuHoho6gatsu(更正後計算後情報.getChoshuHoho6gatsu());
        entity.setKoseigo_choshuHoho7gatsu(更正後計算後情報.getChoshuHoho7gatsu());
        entity.setKoseigo_choshuHoho8gatsu(更正後計算後情報.getChoshuHoho8gatsu());
        entity.setKoseigo_choshuHoho9gatsu(更正後計算後情報.getChoshuHoho9gatsu());
        entity.setKoseigo_choshuHoho10gatsu(更正後計算後情報.getChoshuHoho10gatsu());
        entity.setKoseigo_choshuHoho11gatsu(更正後計算後情報.getChoshuHoho11gatsu());
        entity.setKoseigo_choshuHoho12gatsu(更正後計算後情報.getChoshuHoho12gatsu());
        entity.setKoseigo_choshuHohoYoku4gatsu(更正後計算後情報.getChoshuHohoYoku4gatsu());
        entity.setKoseigo_choshuHohoYoku5gatsu(更正後計算後情報.getChoshuHohoYoku5gatsu());
        entity.setKoseigo_choshuHohoYoku6gatsu(更正後計算後情報.getChoshuHohoYoku6gatsu());
        entity.setKoseigo_choshuHohoYoku7gatsu(更正後計算後情報.getChoshuHohoYoku7gatsu());
        entity.setKoseigo_choshuHohoYoku8gatsu(更正後計算後情報.getChoshuHohoYoku8gatsu());
        entity.setKoseigo_choshuHohoYoku9gatsu(更正後計算後情報.getChoshuHohoYoku9gatsu());
        entity.setKoseigo_kariNenkinNo(更正後計算後情報.getKariNenkinNo());
        entity.setKoseigo_kariNenkinCode(更正後計算後情報.getKariNenkinCode());
        entity.setKoseigo_kariHosokuM(更正後計算後情報.getKariHosokuM());
        entity.setKoseigo_honNenkinNo(更正後計算後情報.getHonNenkinNo());
        entity.setKoseigo_honNenkinCode(更正後計算後情報.getHonNenkinCode());
        entity.setKoseigo_honHosokuM(更正後計算後情報.getHonHosokuM());
        entity.setKoseigo_yokunendoKariNenkinNo(更正後計算後情報.getYokunendoKariNenkinNo());
        entity.setKoseigo_yokunendoKariNenkinCode(更正後計算後情報.getYokunendoKariNenkinCode());
        entity.setKoseigo_yokunendoKariHosokuM(更正後計算後情報.getYokunendoKariHosokuM());
        entity.setKoseigo_iraiSohuzumiFlag(更正後計算後情報.isIraiSohuzumiFlag());
        entity.setKoseigo_tsuikaIraiSohuzumiFlag(更正後計算後情報.isTsuikaIraiSohuzumiFlag());
        entity.setKoseigo_tokuchoTeishiNichiji(更正後計算後情報.getTokuchoTeishiNichiji());
        entity.setKoseigo_tokuchoTeishiJiyuCode(更正後計算後情報.getTokuchoTeishiJiyuCode());
        entity.setKoseigo_tkShunyuGaku01(更正後計算後情報.getTkKibetsuGaku01());
        entity.setKoseigo_tkShunyuGaku02(更正後計算後情報.getTkKibetsuGaku02());
        entity.setKoseigo_tkShunyuGaku03(更正後計算後情報.getTkKibetsuGaku03());
        entity.setKoseigo_tkShunyuGaku04(更正後計算後情報.getTkKibetsuGaku04());
        entity.setKoseigo_tkShunyuGaku05(更正後計算後情報.getTkKibetsuGaku05());
        entity.setKoseigo_tkShunyuGaku06(更正後計算後情報.getTkKibetsuGaku06());
        entity.setKoseigo_fuShunyuGaku01(更正後計算後情報.getFuShunyuGaku01());
        entity.setKoseigo_fuShunyuGaku02(更正後計算後情報.getFuShunyuGaku02());
        entity.setKoseigo_fuShunyuGaku03(更正後計算後情報.getFuShunyuGaku03());
        entity.setKoseigo_fuShunyuGaku04(更正後計算後情報.getFuShunyuGaku04());
        entity.setKoseigo_fuShunyuGaku05(更正後計算後情報.getFuShunyuGaku05());
        entity.setKoseigo_fuShunyuGaku06(更正後計算後情報.getFuShunyuGaku06());
        entity.setKoseigo_fuShunyuGaku07(更正後計算後情報.getFuShunyuGaku07());
        entity.setKoseigo_fuShunyuGaku08(更正後計算後情報.getFuShunyuGaku08());
        entity.setKoseigo_fuShunyuGaku09(更正後計算後情報.getFuShunyuGaku09());
        entity.setKoseigo_fuShunyuGaku10(更正後計算後情報.getFuShunyuGaku10());
        entity.setKoseigo_fuShunyuGaku11(更正後計算後情報.getFuShunyuGaku11());
        entity.setKoseigo_fuShunyuGaku12(更正後計算後情報.getFuShunyuGaku12());
        entity.setKoseigo_fuShunyuGaku13(更正後計算後情報.getFuShunyuGaku13());
        entity.setKoseigo_fuShunyuGaku14(更正後計算後情報.getFuShunyuGaku14());
    }

    private void set対象者_追加含む情報_更正後の全項目(DbT2002FukaTempTableEntity entity) {
        if (対象者_追加含む情報_更正後 == null) {
            return;
        }
        entity.setNenkinTokuchoKaifuJoho_insertDantaiCd(対象者_追加含む情報_更正後.getInsertDantaiCd());
        entity.setNenkinTokuchoKaifuJoho_gyomuCode(対象者_追加含む情報_更正後.getGyomuCode());
        entity.setNenkinTokuchoKaifuJoho_shoriNendo(対象者_追加含む情報_更正後.getShoriNendo());
        if (対象者_追加含む情報_更正後.getTsuchiNaiyoCode() != null) {
            entity.setNenkinTokuchoKaifuJoho_tsuchiNaiyoCode(new TsuchiNaiyoCode(対象者_追加含む情報_更正後.getTsuchiNaiyoCode()));
        }
        entity.setNenkinTokuchoKaifuJoho_shoriTaishoYM(対象者_追加含む情報_更正後.getShoriTaishoYM());
        entity.setNenkinTokuchoKaifuJoho_kisoNenkinNo(対象者_追加含む情報_更正後.getKisoNenkinNo());
        entity.setNenkinTokuchoKaifuJoho_nenkinCode(対象者_追加含む情報_更正後.getNenkinCode());
        entity.setNenkinTokuchoKaifuJoho_koseiCityCode(対象者_追加含む情報_更正後.getKoseiCityCode());
        entity.setNenkinTokuchoKaifuJoho_renban(対象者_追加含む情報_更正後.getRenban());
        entity.setNenkinTokuchoKaifuJoho_shoriTimestamp(対象者_追加含む情報_更正後.getShoriTimestamp());
        if (対象者_追加含む情報_更正後.getRenkeiShubetsu() != null) {
            entity.setNenkinTokuchoKaifuJoho_renkeiShubetsu(new RenkeiShubetsu(対象者_追加含む情報_更正後.getRenkeiShubetsu()));
        }
        entity.setNenkinTokuchoKaifuJoho_hosokuTsuki(対象者_追加含む情報_更正後.getHosokuTsuki());
        entity.setNenkinTokuchoKaifuJoho_tenbikiTsuki(対象者_追加含む情報_更正後.getTenbikiTsuki());
        entity.setNenkinTokuchoKaifuJoho_shikibetsuCode(対象者_追加含む情報_更正後.getShikibetsuCode());
        entity.setNenkinTokuchoKaifuJoho_hihokenshaNo(対象者_追加含む情報_更正後.getHihokenshaNo());
        entity.setNenkinTokuchoKaifuJoho_kokuhoSetaiCode(対象者_追加含む情報_更正後.getKokuhoSetaiCode());
        entity.setNenkinTokuchoKaifuJoho_dtCityCode(対象者_追加含む情報_更正後.getDtCityCode());
        entity.setNenkinTokuchoKaifuJoho_dtTokubetsuChoshuGimushaCode(対象者_追加含む情報_更正後.getDtTokubetsuChoshuGimushaCode());
        if (対象者_追加含む情報_更正後.getDtTsuchiNaiyoCode() != null) {
            entity.setNenkinTokuchoKaifuJoho_dtTsuchiNaiyoCode(new TsuchiNaiyoCode(対象者_追加含む情報_更正後.getDtTsuchiNaiyoCode()));
        }
        entity.setNenkinTokuchoKaifuJoho_dtBaitaiCode(対象者_追加含む情報_更正後.getDtBaitaiCode());
        if (対象者_追加含む情報_更正後.getDtTokubetsuChoshuSeidoCode() != null) {
            entity.setNenkinTokuchoKaifuJoho_dtTokubetsuChoshuSeidoCode(
                    new TokubetsuChoshuSeidoCode(対象者_追加含む情報_更正後.getDtTokubetsuChoshuSeidoCode()));
        }
        entity.setNenkinTokuchoKaifuJoho_dtSakuseiYMD(対象者_追加含む情報_更正後.getDtSakuseiYMD());
        entity.setNenkinTokuchoKaifuJoho_dtKisoNenkinNo(対象者_追加含む情報_更正後.getDtKisoNenkinNo());
        entity.setNenkinTokuchoKaifuJoho_dtNenkinCode(対象者_追加含む情報_更正後.getDtNenkinCode());
        entity.setNenkinTokuchoKaifuJoho_dtYobi1(対象者_追加含む情報_更正後.getDtYobi1());
        entity.setNenkinTokuchoKaifuJoho_dtBirthDay(対象者_追加含む情報_更正後.getDtBirthDay());
        if (対象者_追加含む情報_更正後.getDtSeibetsu() != null) {
            entity.setNenkinTokuchoKaifuJoho_dtSeibetsu(new SeibetsuCodeNenkinTokucho(対象者_追加含む情報_更正後.getDtSeibetsu()));
        }
        entity.setNenkinTokuchoKaifuJoho_dtKanaShimei(対象者_追加含む情報_更正後.getDtKanaShimei());
        entity.setNenkinTokuchoKaifuJoho_dtShiftCode1(対象者_追加含む情報_更正後.getDtShiftCode1());
        entity.setNenkinTokuchoKaifuJoho_dtKanjiShimei(対象者_追加含む情報_更正後.getDtKanjiShimei());
        entity.setNenkinTokuchoKaifuJoho_dtShiftCode2(対象者_追加含む情報_更正後.getDtShiftCode2());
        entity.setNenkinTokuchoKaifuJoho_dtYubinNo(対象者_追加含む情報_更正後.getDtYubinNo());
        entity.setNenkinTokuchoKaifuJoho_dtKanaJusho(対象者_追加含む情報_更正後.getDtKanaJusho());
        entity.setNenkinTokuchoKaifuJoho_dtShiftCode3(対象者_追加含む情報_更正後.getDtShiftCode3());
        entity.setNenkinTokuchoKaifuJoho_dtKanjiJusho(対象者_追加含む情報_更正後.getDtKanjiJusho());
        entity.setNenkinTokuchoKaifuJoho_dtShiftCode4(対象者_追加含む情報_更正後.getDtShiftCode4());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKubun(対象者_追加含む情報_更正後.getDtKakushuKubun());
        entity.setNenkinTokuchoKaifuJoho_dtShoriKekka(対象者_追加含む情報_更正後.getDtShoriKekka());
        entity.setNenkinTokuchoKaifuJoho_dtKokiIkanCode(対象者_追加含む情報_更正後.getDtKokiIkanCode());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuYMD(対象者_追加含む情報_更正後.getDtKakushuYMD());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku1(対象者_追加含む情報_更正後.getDtKakushuKingaku1());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku2(対象者_追加含む情報_更正後.getDtKakushuKingaku2());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku3(対象者_追加含む情報_更正後.getDtKakushuKingaku3());
        entity.setNenkinTokuchoKaifuJoho_dtYobi2(対象者_追加含む情報_更正後.getDtYobi2());
        entity.setNenkinTokuchoKaifuJoho_dtKyosaiNenkinshoshoKigoNo(対象者_追加含む情報_更正後.getDtKyosaiNenkinshoshoKigoNo());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku4(対象者_追加含む情報_更正後.getDtKakushuKingaku4());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku5(対象者_追加含む情報_更正後.getDtKakushuKingaku5());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku6(対象者_追加含む情報_更正後.getDtKakushuKingaku6());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku7(対象者_追加含む情報_更正後.getDtKakushuKingaku7());
        entity.setNenkinTokuchoKaifuJoho_dtKakushuKingaku8(対象者_追加含む情報_更正後.getDtKakushuKingaku8());
        entity.setNenkinTokuchoKaifuJoho_dtTeishiYM(対象者_追加含む情報_更正後.getDtTeishiYM());
        entity.setNenkinTokuchoKaifuJoho_dtYobi4Juminzei(対象者_追加含む情報_更正後.getDtYobi4Juminzei());
        entity.setNenkinTokuchoKaifuJoho_dtKojinNo(対象者_追加含む情報_更正後.getDtKojinNo());
        entity.setNenkinTokuchoKaifuJoho_kokuhoYoteiSoshitsuKubun(対象者_追加含む情報_更正後.getKokuhoYoteiSoshitsuKubun());

    }
}
