/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.entity.basic.helper;

import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbz.entity.basic.DbV4001JukyushaDaichoEntity;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 受給者台帳Aliveエンティティのテスト用インスタンスを作成する補助クラスです。
 */
public final class DbV4001JukyushaDaichoEntityGenerator {

    public static final LasdecCode DEFAULT_市町村コード = new LasdecCode("209007");
    public static final HihokenshaNo DEFAULT_被保険者番号 = new HihokenshaNo("0000000001");
    public static final RString DEFAULT_履歴番号 = new RString("Data");
    public static final RString DEFAULT_枝番 = new RString("Data");
    public static final ShinseishoKanriNo DEFAULT_申請書管理番号 = new ShinseishoKanriNo("12345678");
    public static final RString DEFAULT_申請状況区分 = new RString("Data");
    public static final RString DEFAULT_支所コード = new RString("Data");
    public static final boolean DEFAULT_直近フラグ = false;
    public static final ShikibetsuCode DEFAULT_識別コード = new ShikibetsuCode("012340123400001");
    public static final Code DEFAULT_受給申請事由 = new Code("01");
    public static final RString DEFAULT_申請理由 = new RString("Data");
    public static final Code DEFAULT_届出者申請者関係コード = new Code("01");
    public static final RString DEFAULT_届出者本人との関係 = new RString("Data");
    public static final FlexibleDate DEFAULT_受給申請年月日 = new FlexibleDate("19900101");
    public static final Code DEFAULT_２号特定疾病コード = new Code("01");
    public static final FlexibleDate DEFAULT_審査会依頼年月日 = new FlexibleDate("19900101");
    public static final Code DEFAULT_要介護認定状態区分コード = new Code("01");
    public static final FlexibleDate DEFAULT_認定有効期間開始年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_認定有効期間終了年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_認定年月日 = new FlexibleDate("19900101");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類01 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類02 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類03 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類04 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類05 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類06 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類07 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類08 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類09 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類10 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類11 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類12 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類13 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類14 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類15 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類16 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類17 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類18 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類19 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類20 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類21 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類22 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類23 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類24 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類25 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類26 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類27 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類28 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類29 = new ServiceShuruiCode("01");
    public static final ServiceShuruiCode DEFAULT_指定サービス種類30 = new ServiceShuruiCode("01");
    public static final FlexibleDate DEFAULT_喪失年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_直近異動年月日 = new FlexibleDate("19900101");
    public static final Code DEFAULT_直近異動事由コード = new Code("01");
    public static final Code DEFAULT_有効無効区分 = new Code("01");
    public static final Code DEFAULT_データ区分 = new Code("01");
    public static final RString DEFAULT_同一連番 = new RString("Data");
    public static final RString DEFAULT_異動理由 = new RString("Data");
    public static final Code DEFAULT_申請書区分 = new Code("01");
    public static final Code DEFAULT_削除事由コード = new Code("01");
    public static final boolean DEFAULT_要支援者認定申請区分 = false;
    public static final Decimal DEFAULT_支給限度単位数 = new Decimal(0);
    public static final FlexibleDate DEFAULT_支給限度有効開始年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_支給限度有効終了年月日 = new FlexibleDate("19900101");
    public static final int DEFAULT_短期入所支給限度日数 = 1;
    public static final FlexibleDate DEFAULT_短期入所支給限度開始年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_短期入所支給限度終了年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_当初認定有効開始年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_当初認定有効終了年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_受給資格証明書発行年月日１ = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_受給資格証明書発行年月日２ = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_診断命令書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_２号申請受理通知書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_認定結果通知書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_区分変更通知書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_サービス変更通知書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_認定却下通知書発行年月日 = new FlexibleDate("19900101");
    public static final FlexibleDate DEFAULT_認定取消通知書発行年月日 = new FlexibleDate("19900101");
    public static final boolean DEFAULT_資格取得前申請フラグ = false;
    public static final boolean DEFAULT_旧措置者フラグ = false;
    public static final boolean DEFAULT_論理削除フラグ = false;

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private DbV4001JukyushaDaichoEntityGenerator() {
    }

    public static DbV4001JukyushaDaichoEntity createDbV4001JukyushaDaichoEntity() {
        DbV4001JukyushaDaichoEntity entity = new DbV4001JukyushaDaichoEntity();
        entity.setShichosonCode(DEFAULT_市町村コード);
        entity.setHihokenshaNo(DEFAULT_被保険者番号);
        entity.setRirekiNo(DEFAULT_履歴番号);
        entity.setEdaban(DEFAULT_枝番);
        entity.setShinseishoKanriNo(DEFAULT_申請書管理番号);
        entity.setShinseiJokyoKubun(DEFAULT_申請状況区分);
        entity.setShishoCode(DEFAULT_支所コード);
        entity.setChokkinFlag(DEFAULT_直近フラグ);
        entity.setShikibetsuCode(DEFAULT_識別コード);
        entity.setJukyuShinseiJiyu(DEFAULT_受給申請事由);
        entity.setShinseiRiyu(DEFAULT_申請理由);
        entity.setShinseishaKankeiCode(DEFAULT_届出者申請者関係コード);
        entity.setHomninKankei(DEFAULT_届出者本人との関係);
        entity.setJukyuShinseiYMD(DEFAULT_受給申請年月日);
        entity.setNigoTokuteiShippeiCode(DEFAULT_２号特定疾病コード);
        entity.setShinsakaiIraiYMD(DEFAULT_審査会依頼年月日);
        entity.setYokaigoJotaiKubunCode(DEFAULT_要介護認定状態区分コード);
        entity.setNinteiYukoKikanKaishiYMD(DEFAULT_認定有効期間開始年月日);
        entity.setNinteiYukoKikanShuryoYMD(DEFAULT_認定有効期間終了年月日);
        entity.setNinteiYMD(DEFAULT_認定年月日);
        entity.setShiteiServiceShurui01(DEFAULT_指定サービス種類01);
        entity.setShiteiServiceShurui02(DEFAULT_指定サービス種類02);
        entity.setShiteiServiceShurui03(DEFAULT_指定サービス種類03);
        entity.setShiteiServiceShurui04(DEFAULT_指定サービス種類04);
        entity.setShiteiServiceShurui05(DEFAULT_指定サービス種類05);
        entity.setShiteiServiceShurui06(DEFAULT_指定サービス種類06);
        entity.setShiteiServiceShurui07(DEFAULT_指定サービス種類07);
        entity.setShiteiServiceShurui08(DEFAULT_指定サービス種類08);
        entity.setShiteiServiceShurui09(DEFAULT_指定サービス種類09);
        entity.setShiteiServiceShurui10(DEFAULT_指定サービス種類10);
        entity.setShiteiServiceShurui11(DEFAULT_指定サービス種類11);
        entity.setShiteiServiceShurui12(DEFAULT_指定サービス種類12);
        entity.setShiteiServiceShurui13(DEFAULT_指定サービス種類13);
        entity.setShiteiServiceShurui14(DEFAULT_指定サービス種類14);
        entity.setShiteiServiceShurui15(DEFAULT_指定サービス種類15);
        entity.setShiteiServiceShurui16(DEFAULT_指定サービス種類16);
        entity.setShiteiServiceShurui17(DEFAULT_指定サービス種類17);
        entity.setShiteiServiceShurui18(DEFAULT_指定サービス種類18);
        entity.setShiteiServiceShurui19(DEFAULT_指定サービス種類19);
        entity.setShiteiServiceShurui20(DEFAULT_指定サービス種類20);
        entity.setShiteiServiceShurui21(DEFAULT_指定サービス種類21);
        entity.setShiteiServiceShurui22(DEFAULT_指定サービス種類22);
        entity.setShiteiServiceShurui23(DEFAULT_指定サービス種類23);
        entity.setShiteiServiceShurui24(DEFAULT_指定サービス種類24);
        entity.setShiteiServiceShurui25(DEFAULT_指定サービス種類25);
        entity.setShiteiServiceShurui26(DEFAULT_指定サービス種類26);
        entity.setShiteiServiceShurui27(DEFAULT_指定サービス種類27);
        entity.setShiteiServiceShurui28(DEFAULT_指定サービス種類28);
        entity.setShiteiServiceShurui29(DEFAULT_指定サービス種類29);
        entity.setShiteiServiceShurui30(DEFAULT_指定サービス種類30);
        entity.setSoshitsuYMD(DEFAULT_喪失年月日);
        entity.setChokkinIdoYMD(DEFAULT_直近異動年月日);
        entity.setChokkinIdoJiyuCode(DEFAULT_直近異動事由コード);
        entity.setYukoMukoKubun(DEFAULT_有効無効区分);
        entity.setDataKubun(DEFAULT_データ区分);
        entity.setRemban(DEFAULT_同一連番);
        entity.setIdoRiyu(DEFAULT_異動理由);
        entity.setShinseishoKubun(DEFAULT_申請書区分);
        entity.setSakujoJiyuCode(DEFAULT_削除事由コード);
        entity.setYoshienshaNinteiShinseiFlag(DEFAULT_要支援者認定申請区分);
        entity.setShikyuGendoTanisu(DEFAULT_支給限度単位数);
        entity.setShikyuGendoKaishiYMD(DEFAULT_支給限度有効開始年月日);
        entity.setShikyuGendoShuryoYMD(DEFAULT_支給限度有効終了年月日);
        entity.setTankiSikyuGendoNissu(DEFAULT_短期入所支給限度日数);
        entity.setTankiShikyuGendoKaishiYMD(DEFAULT_短期入所支給限度開始年月日);
        entity.setTankiShikyuGendoShuryoYMD(DEFAULT_短期入所支給限度終了年月日);
        entity.setToshoNinteiYukoKaishiYMD(DEFAULT_当初認定有効開始年月日);
        entity.setToshoNinteiYukoShuryoYMD(DEFAULT_当初認定有効終了年月日);
        entity.setJukyuShikakuShomeishoHakkoYMD1(DEFAULT_受給資格証明書発行年月日１);
        entity.setJukyuShikakuShomeishoHakkoYMD2(DEFAULT_受給資格証明書発行年月日２);
        entity.setShindanMeireishoHakkoYMD(DEFAULT_診断命令書発行年月日);
        entity.setNigoShinseiJuriTsuchishoHakkoYMD(DEFAULT_２号申請受理通知書発行年月日);
        entity.setNinteiKekkaTsuchishoHakkoYMD(DEFAULT_認定結果通知書発行年月日);
        entity.setKubunHenkoTsuchishoHakkoYMD(DEFAULT_区分変更通知書発行年月日);
        entity.setServiceHenkoTsuchishoHakkoYMD(DEFAULT_サービス変更通知書発行年月日);
        entity.setNinteiKyakkaTsuchishoHakkoYMD(DEFAULT_認定却下通知書発行年月日);
        entity.setNinteiTorikeshiTsuchishoHakkoYMD(DEFAULT_認定取消通知書発行年月日);
        entity.setShikakuShutokuMaeShinseiFlag(DEFAULT_資格取得前申請フラグ);
        entity.setKyuSochishaFlag(DEFAULT_旧措置者フラグ);
        entity.setLogicalDeletedFlag(DEFAULT_論理削除フラグ);
        return entity;
    }
}
