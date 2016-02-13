/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbx.entity.db.basic.helper;

import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT7063KaigoJigyoshaShiteiServiceEntity;
import jp.co.ndensan.reams.uz.uza.biz.AtenaJusho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaKanaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.JigyoshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ServiceShuruiCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護事業者指定サービスエンティティのテスト用インスタンスを作成する補助クラスです。
 */
public final class DbT7063KaigoJigyoshaShiteiServiceEntityGenerator {

    public static final JigyoshaNo DEFAULT_事業者番号 = new JigyoshaNo("0123400001");
    public static final ServiceShuruiCode DEFAULT_サービス種類コード = new ServiceShuruiCode("01");
    public static final FlexibleDate DEFAULT_有効開始日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_有効終了日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_異動日 = new FlexibleDate("20141216");
    public static final RString DEFAULT_異動事由 = new RString("01");
    public static final RString DEFAULT_指定番号 = new RString("12");
    public static final RString DEFAULT_基本情報準拠区分 = new RString("1");
    public static final FlexibleDate DEFAULT_事業開始日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_事業休止日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_事業再開日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_事業廃止日 = new FlexibleDate("20141216");
    public static final AtenaMeisho DEFAULT_事業者名称 = new AtenaMeisho("テスト 太郎");
    public static final AtenaKanaMeisho DEFAULT_事業者名称カナ = new AtenaKanaMeisho("テスト　タロウ");
    public static final YubinNo DEFAULT_事業者郵便番号 = new YubinNo("111-1111");
    public static final AtenaJusho DEFAULT_事業者住所 = new AtenaJusho("テスト住所");
    public static final RString DEFAULT_事業者住所カナ = new RString("あいうえおかきくけこ");
    public static final TelNo DEFAULT_事業者電話番号 = new TelNo("111-222-3344");
    public static final TelNo DEFAULT_事業者FAX番号 = new TelNo("111-222-3344");
    public static final RString DEFAULT_登録保険者番号 = new RString("123456");
    public static final Code DEFAULT_受領委任の有無 = new Code("001");
    public static final FlexibleDate DEFAULT_登録開始日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_登録終了日 = new FlexibleDate("20141216");
    public static final AtenaMeisho DEFAULT_管理者氏名 = new AtenaMeisho("テスト 太郎");
    public static final AtenaKanaMeisho DEFAULT_管理者氏名カナ = new AtenaKanaMeisho("テスト　タロウ");
    public static final YubinNo DEFAULT_管理者住所郵便番号 = new YubinNo("111-1111");
    public static final AtenaJusho DEFAULT_管理者住所 = new AtenaJusho("テスト住所");
    public static final RString DEFAULT_管理者住所カナ = new RString("あうおかこ");
    public static final RString DEFAULT_口座情報準拠区分 = new RString("1");
    public static final Code DEFAULT_社会福祉法人軽減事業実施の有無 = new Code("001");
    public static final Code DEFAULT_生活保護法による指定の有無 = new Code("001");
    public static final Code DEFAULT_施設等の区分 = new Code("001");
    public static final Code DEFAULT_人員配置区分 = new Code("001");
    public static final Code DEFAULT_特別地域加算の有無 = new Code("001");
    public static final Code DEFAULT_緊急時訪問介護加算の有無 = new Code("001");
    public static final Code DEFAULT_特別管理体制 = new Code("001");
    public static final Code DEFAULT_機能訓練指導体制の有無 = new Code("001");
    public static final Code DEFAULT_食事提供体制の有無 = new Code("001");
    public static final Code DEFAULT_入浴介助体制の有無 = new Code("001");
    public static final Code DEFAULT_特別入浴介助体制の有無 = new Code("001");
    public static final Code DEFAULT_常勤専従医師配置の有無 = new Code("001");
    public static final Code DEFAULT_医師の配置基準 = new Code("001");
    public static final Code DEFAULT_精神科医師定期的療養指導の有無 = new Code("001");
    public static final Code DEFAULT_夜間勤務条件基準 = new Code("001");
    public static final Code DEFAULT_認知症専門棟の有無 = new Code("001");
    public static final Code DEFAULT_食事提供の状況 = new Code("001");
    public static final Code DEFAULT_送迎体制 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_総合リハビリテーション施設_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_理学療法Ⅱ_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_理学療法Ⅲ_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_作業療法Ⅱ_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_精神科作業療法_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション提供体制_その他_の有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーションの加算状況の有無 = new Code("001");
    public static final Code DEFAULT_療養環境基準 = new Code("001");
    public static final Code DEFAULT_医師の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_看護職員の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_理学療法士の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_作業療法士の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_介護職員の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_介護支援専門員の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_介護従業者の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_感染対策指導管理の有無 = new Code("001");
    public static final Code DEFAULT_重症皮膚潰瘍指導管理の有無 = new Code("001");
    public static final Code DEFAULT_薬剤管理指導の有無 = new Code("001");
    public static final Code DEFAULT_障害者生活支援体制の有無 = new Code("001");
    public static final Code DEFAULT_地域区分コード = new Code("001");
    public static final Code DEFAULT_時間延長サービス体制 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制 = new Code("001");
    public static final Code DEFAULT_居住費対策 = new Code("001");
    public static final Code DEFAULT_夜間ケアの有無 = new Code("001");
    public static final Code DEFAULT_リハビリテーション機能強化の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_総合リハビリテーション施設_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_理学療法Ⅱ_の有無1 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_理学療法Ⅲ_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_作業療法Ⅱ_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_言語聴覚療法Ⅰ_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_言語聴覚療法Ⅱ_の有無 = new Code("001");
    public static final Code DEFAULT_言語聴覚士の欠員による減算の状況の有無 = new Code("001");
    public static final Code DEFAULT_栄養管理の評価 = new Code("001");
    public static final Code DEFAULT_特定事業所加算_訪問介護_の有無 = new Code("001");
    public static final Code DEFAULT_若年性認知症ケア体制の有無 = new Code("001");
    public static final Code DEFAULT_運動器機能向上体制の有無 = new Code("001");
    public static final Code DEFAULT_栄養マネジメント_改善_体制の有無 = new Code("001");
    public static final Code DEFAULT_口腔機能向上体制の有無 = new Code("001");
    public static final Code DEFAULT_事業所評価加算_申出_の有無 = new Code("001");
    public static final Code DEFAULT_事業所評価加算_決定_の有無 = new Code("001");
    public static final Code DEFAULT_緊急受入体制の有無 = new Code("001");
    public static final Code DEFAULT_夜間看護体制の有無 = new Code("001");
    public static final Code DEFAULT_特定事業所加算_居宅介護支援_の有無 = new Code("001");
    public static final int DEFAULT_介護支援専門員数_専従の常勤者_ = 1;
    public static final int DEFAULT_介護支援専門員数_専従の非常勤者_ = 1;
    public static final int DEFAULT_介護支援専門員数_兼務の常勤者_ = 1;
    public static final int DEFAULT_介護支援専門員数_兼務の非常勤者_ = 1;
    public static final int DEFAULT_訪問介護サービス提供責任者数 = 1;
    public static final int DEFAULT_訪問介護員数_専従の常勤者_ = 1;
    public static final int DEFAULT_訪問介護員数_専従の非常勤者_ = 1;
    public static final int DEFAULT_訪問介護員数_兼務の常勤者_ = 1;
    public static final int DEFAULT_訪問介護員数_兼務の非常勤者_ = 1;
    public static final int DEFAULT_訪問介護員数_常勤換算後の人数_ = 1;
    public static final int DEFAULT_利用定員数 = 1;
    public static final FlexibleDate DEFAULT_指定有効開始日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_指定有効終了日 = new FlexibleDate("20141216");
    public static final Code DEFAULT_指定更新申請中区分 = new Code("001");
    public static final FlexibleDate DEFAULT_効力停止開始日 = new FlexibleDate("20141216");
    public static final FlexibleDate DEFAULT_効力停止終了日 = new FlexibleDate("20141216");
    public static final Code DEFAULT_大規模事業所該当の有無 = new Code("001");
    public static final Code DEFAULT_準ユニットケア体制の有無 = new Code("001");
    public static final Code DEFAULT_重度化対応体制の有無 = new Code("001");
    public static final Code DEFAULT_医療連携体制の有無 = new Code("001");
    public static final Code DEFAULT_ユニットケア体制の有無 = new Code("001");
    public static final Code DEFAULT_在宅_入所相互利用体制の有無 = new Code("001");
    public static final Code DEFAULT_ターミナルケア体制_看取り介護体制_の有無 = new Code("001");
    public static final Code DEFAULT_身体拘束廃止取組の有無 = new Code("001");
    public static final Code DEFAULT_小規模拠点集合体制の有無 = new Code("001");
    public static final Code DEFAULT_認知症ケア加算の有無 = new Code("001");
    public static final Code DEFAULT_個別機能訓練体制の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_理学療法Ⅰ_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_理学療法Ⅱ_の有無2 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_作業療法_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_言語聴覚療法_の有無 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_その他_の有無 = new Code("001");
    public static final Code DEFAULT_設備基準 = new Code("001");
    public static final Code DEFAULT_療養体制維持特別加算 = new Code("001");
    public static final Code DEFAULT_個別リハビリテーション提供体制_リハビリテーション指導管理_の有無 = new Code("001");
    public static final Code DEFAULT_３級ヘルパー体制 = new Code("001");
    public static final Code DEFAULT_中山間地域等における小規模事業所加算_地域に関する状況_ = new Code("001");
    public static final Code DEFAULT_中山間地域等における小規模事業所加算_規模に関する状況_ = new Code("001");
    public static final Code DEFAULT_サービス提供体制強化加算 = new Code("001");
    public static final Code DEFAULT_認知症短期集中リハビリテーション加算 = new Code("001");
    public static final Code DEFAULT_若年性認知症利用者_入所者_患者_受入加算 = new Code("001");
    public static final Code DEFAULT_看護体制加算 = new Code("001");
    public static final Code DEFAULT_夜勤職員配置加算 = new Code("001");
    public static final Code DEFAULT_療養食加算 = new Code("001");
    public static final Code DEFAULT_日常生活継続支援加算 = new Code("001");
    public static final Code DEFAULT_認知症専門ケア加算 = new Code("001");
    public static final Code DEFAULT_２４時間通報対応加算 = new Code("001");
    public static final Code DEFAULT_看護職員配置加算 = new Code("001");
    public static final Code DEFAULT_夜間ケア加算 = new Code("001");
    public static final Code DEFAULT_集団コミュニケーション療法の有無 = new Code("001");
    public static final Code DEFAULT_サービス提供体制強化加算_空床型_ = new Code("001");
    public static final Code DEFAULT_日中の身体介護２０分未満体制の有無 = new Code("001");
    public static final Code DEFAULT_サービス提供責任者体制の有無 = new Code("001");
    public static final Code DEFAULT_同一建物に居住する利用者の減算の有無 = new Code("001");
    public static final Code DEFAULT_緊急短期入所体制確保加算 = new Code("001");
    public static final Code DEFAULT_在宅復帰_在宅療養支援機能加算 = new Code("001");
    public static final Code DEFAULT_生活機能向上グループ活動加算 = new Code("001");
    public static final Code DEFAULT_介護職員処遇改善加算 = new Code("001");

    /**
     * インスタンス化を防ぐためのプライベートコンストラクタです。
     */
    private DbT7063KaigoJigyoshaShiteiServiceEntityGenerator() {
    }

    public static DbT7063KaigoJigyoshaShiteiServiceEntity createDbT7063KaigoJigyoshaShiteiServiceEntity() {
        DbT7063KaigoJigyoshaShiteiServiceEntity entity = new DbT7063KaigoJigyoshaShiteiServiceEntity();
        entity.setJigyoshaNo(DEFAULT_事業者番号);
        entity.setServiceShuruiCode(DEFAULT_サービス種類コード);
        entity.setYukoKaishiYMD(DEFAULT_有効開始日);
        entity.setYukoShuryoYMD(DEFAULT_有効終了日);
        entity.setIdoYMD(DEFAULT_異動日);
        entity.setIdoJiyu(DEFAULT_異動事由);
        entity.setShiteiNo(DEFAULT_指定番号);
        entity.setKihonJohoJunkyoKubun(DEFAULT_基本情報準拠区分);
        entity.setJigyoKaishiYMD(DEFAULT_事業開始日);
        entity.setJigyoKyushiYMD(DEFAULT_事業休止日);
        entity.setJigyoSaikaiYMD(DEFAULT_事業再開日);
        entity.setJigyoHaishiYMD(DEFAULT_事業廃止日);
        entity.setJigyoshaName(DEFAULT_事業者名称);
        entity.setJigyoshaNameKana(DEFAULT_事業者名称カナ);
        entity.setJigyoshaYubinNo(DEFAULT_事業者郵便番号);
        entity.setJigyoshaAddress(DEFAULT_事業者住所);
        entity.setJigyoshaAddressKana(DEFAULT_事業者住所カナ);
        entity.setJigyoshaTelNo(DEFAULT_事業者電話番号);
        entity.setJigyoshaFaxNo(DEFAULT_事業者FAX番号);
        entity.setTorokuHokenshaNo(DEFAULT_登録保険者番号);
        entity.setJuryoininUmu(DEFAULT_受領委任の有無);
        entity.setTorokuKaishiYMD(DEFAULT_登録開始日);
        entity.setTorokuShuryoYMD(DEFAULT_登録終了日);
        entity.setKanrishaName(DEFAULT_管理者氏名);
        entity.setKanrishaNameKana(DEFAULT_管理者氏名カナ);
        entity.setKanrishaYubinNo(DEFAULT_管理者住所郵便番号);
        entity.setKanrishaAddress(DEFAULT_管理者住所);
        entity.setKanrishaAddressKana(DEFAULT_管理者住所カナ);
        entity.setKozaJohoJunkyoKubun(DEFAULT_口座情報準拠区分);
        entity.setShakaiFukushihoujinKeigenjigyouJisshi_umu(DEFAULT_社会福祉法人軽減事業実施の有無);
        entity.setSeikatsuhogohouShitei_umu(DEFAULT_生活保護法による指定の有無);
        entity.setShisetsunadoKubun(DEFAULT_施設等の区分);
        entity.setJininHaichiKubun(DEFAULT_人員配置区分);
        entity.setTokubetsuChiikiKasan_umu(DEFAULT_特別地域加算の有無);
        entity.setKinkyujiHomonkaigoKasan_umu(DEFAULT_緊急時訪問介護加算の有無);
        entity.setTokubetsuKanriTaisei(DEFAULT_特別管理体制);
        entity.setKinoKunrenShidoTaisei_umu(DEFAULT_機能訓練指導体制の有無);
        entity.setShokujiTeikyoTaisei_umu(DEFAULT_食事提供体制の有無);
        entity.setNyuyokuKaijoTaisei_umu(DEFAULT_入浴介助体制の有無);
        entity.setTokubetsuNyuyokuKaijoTaisei_umu(DEFAULT_特別入浴介助体制の有無);
        entity.setJoukinsenjuIshiHaichi_umu(DEFAULT_常勤専従医師配置の有無);
        entity.setIshiHaichiKijun(DEFAULT_医師の配置基準);
        entity.setSeisinkaIshiTeikitekiRyouyousidou_umu(DEFAULT_精神科医師定期的療養指導の有無);
        entity.setYakanKinmuJokenKijun(DEFAULT_夜間勤務条件基準);
        entity.setNinchishouSenmontou_umu(DEFAULT_認知症専門棟の有無);
        entity.setShokujiTeikyoJokyo(DEFAULT_食事提供の状況);
        entity.setSougeiTaisei(DEFAULT_送迎体制);
        entity.setRehaTeikyoTaisei_SogoRehaShisetsu_umu(DEFAULT_リハビリテーション提供体制_総合リハビリテーション施設_の有無);
        entity.setRehaTeikyoTaisei_RigakuRyohoII_umu(DEFAULT_リハビリテーション提供体制_理学療法Ⅱ_の有無);
        entity.setRehaTeikyoTaisei_RigakuRyohoIII_umu(DEFAULT_リハビリテーション提供体制_理学療法Ⅲ_の有無);
        entity.setRehaTeikyoTaisei_SagyoRyohoII_umu(DEFAULT_リハビリテーション提供体制_作業療法Ⅱ_の有無);
        entity.setRehaTeikyoTaisei_SeisinkaSagyouRyoho_umu(DEFAULT_リハビリテーション提供体制_精神科作業療法_の有無);
        entity.setRehaTeikyoTaisei_Sonota_umu(DEFAULT_リハビリテーション提供体制_その他_の有無);
        entity.setRehabilitationKasanJokyo(DEFAULT_リハビリテーションの加算状況の有無);
        entity.setRyoyoKankyoKijun(DEFAULT_療養環境基準);
        entity.setIshiKetuinGenzanJokyo_umu(DEFAULT_医師の欠員による減算の状況の有無);
        entity.setKangoShokuinKetsuinGenzanJokyo_umu(DEFAULT_看護職員の欠員による減算の状況の有無);
        entity.setRigakuRyouhousiKetsuinGenzanJokyo_umu(DEFAULT_理学療法士の欠員による減算の状況の有無);
        entity.setSagyouRyouhousiKetsuinGenzanJokyo_umu(DEFAULT_作業療法士の欠員による減算の状況の有無);
        entity.setKaigoShokuinKetsuinGenzanJokyo_umu(DEFAULT_介護職員の欠員による減算の状況の有無);
        entity.setKaigoSienSenmoninShokuinKetsuinGenzanJokyo_umu(DEFAULT_介護支援専門員の欠員による減算の状況の有無);
        entity.setKaigoJujishaKetsuinGenzanJokyo_umu(DEFAULT_介護従業者の欠員による減算の状況の有無);
        entity.setKansenTaisakuSidoKanri_umu(DEFAULT_感染対策指導管理の有無);
        entity.setJushoHifuKaiyouShidoKanri_umu(DEFAULT_重症皮膚潰瘍指導管理の有無);
        entity.setYakuzaiKaniriShido_umu(DEFAULT_薬剤管理指導の有無);
        entity.setShogaishaSeikatsuShienTaisei_umu(DEFAULT_障害者生活支援体制の有無);
        entity.setChiikiKubunCode(DEFAULT_地域区分コード);
        entity.setJikanEnchoServiceTaisei(DEFAULT_時間延長サービス体制);
        entity.setKobetsuRehabilitationTeikyoTaisei(DEFAULT_個別リハビリテーション提供体制);
        entity.setKyojuhiTaisaku(DEFAULT_居住費対策);
        entity.setYakanCare_umu(DEFAULT_夜間ケアの有無);
        entity.setRehabilitationKinoKyoka_umu(DEFAULT_リハビリテーション機能強化の有無);
        entity.setKobetsuRehaTeikyoTaisei_SogoRehaShisetsu_umu(DEFAULT_個別リハビリテーション提供体制_総合リハビリテーション施設_の有無);
        entity.setKobetsuRehaTeikyoTaisei_RigakuRyohoII_umu1(DEFAULT_個別リハビリテーション提供体制_理学療法Ⅱ_の有無1);
        entity.setKobetsuRehaTeikyoTaisei_RigakuRyohoIII_umu(DEFAULT_個別リハビリテーション提供体制_理学療法Ⅲ_の有無);
        entity.setKobetsuRehaTeikyoTaisei_SagyoRyohoII_umu(DEFAULT_個別リハビリテーション提供体制_作業療法Ⅱ_の有無);
        entity.setKobetsuRehaTeikyoTaisei_GengoChokakuRyohoI_umu(DEFAULT_個別リハビリテーション提供体制_言語聴覚療法Ⅰ_の有無);
        entity.setKobetsuRehaTeikyoTaisei_GengoChokakuRyohoII_umu(DEFAULT_個別リハビリテーション提供体制_言語聴覚療法Ⅱ_の有無);
        entity.setGengoChokakushiKetsuinGenzanJokyo_umu(DEFAULT_言語聴覚士の欠員による減算の状況の有無);
        entity.setEiyouKanriHyoka(DEFAULT_栄養管理の評価);
        entity.setTokuteijigyoushoKasan_HomonKaigo_umu(DEFAULT_特定事業所加算_訪問介護_の有無);
        entity.setJakunenseiNinchishoCareTaisei_umu(DEFAULT_若年性認知症ケア体制の有無);
        entity.setUndokiKinoKojoTaisei_umu(DEFAULT_運動器機能向上体制の有無);
        entity.setEiyoManagement_KaizenTaisei_umu(DEFAULT_栄養マネジメント_改善_体制の有無);
        entity.setKokuKinoKojoTaisei_umu(DEFAULT_口腔機能向上体制の有無);
        entity.setJigyoshoHyokaKasan_Moshide_umu(DEFAULT_事業所評価加算_申出_の有無);
        entity.setJigyoshoHyokaKasan_Kettei_umu(DEFAULT_事業所評価加算_決定_の有無);
        entity.setKinkyuUkeireTaisei_umu(DEFAULT_緊急受入体制の有無);
        entity.setYakanKangoTaisei_umu(DEFAULT_夜間看護体制の有無);
        entity.setTokuteijigyoshoKasan_Kyotakukaigoshien_umu(DEFAULT_特定事業所加算_居宅介護支援_の有無);
        entity.setKaigoShienSemmoninSenjuJokinshaNinsu(DEFAULT_介護支援専門員数_専従の常勤者_);
        entity.setKaigoSienSemmoninSenjuHijokinshaNinsu(DEFAULT_介護支援専門員数_専従の非常勤者_);
        entity.setKaigoSienSemmoninKemmuJokinshaNinsu(DEFAULT_介護支援専門員数_兼務の常勤者_);
        entity.setKaigoSienSemmoninKemmuHijokinshaNinsu(DEFAULT_介護支援専門員数_兼務の非常勤者_);
        entity.setHomonkaigoServiceTeikyoSekininshaNinsu(DEFAULT_訪問介護サービス提供責任者数);
        entity.setHomonkaigoSenjuJokinshaNinsu(DEFAULT_訪問介護員数_専従の常勤者_);
        entity.setHomonkaigoSenjuHijokinshaNinsu(DEFAULT_訪問介護員数_専従の非常勤者_);
        entity.setHomonkaigoKemmuJokinshaNinsu(DEFAULT_訪問介護員数_兼務の常勤者_);
        entity.setHomonkaigoKemmuHijokinshaNinsu(DEFAULT_訪問介護員数_兼務の非常勤者_);
        entity.setHomonkaigoJokinKanzangoNinsu(DEFAULT_訪問介護員数_常勤換算後の人数_);
        entity.setRiyoTeiinNinsu(DEFAULT_利用定員数);
        entity.setShiteiYukoKaishiYMD(DEFAULT_指定有効開始日);
        entity.setShiteiYukoShuryoYMD(DEFAULT_指定有効終了日);
        entity.setShiteiKoshinShinseichuKubun(DEFAULT_指定更新申請中区分);
        entity.setKoryokuTeishiKaishiYMD(DEFAULT_効力停止開始日);
        entity.setKoryokuTeishiShuryoYMD(DEFAULT_効力停止終了日);
        entity.setDaikiboJigyoshaGaito_umu(DEFAULT_大規模事業所該当の有無);
        entity.setJunUnitCareTaisei_umu(DEFAULT_準ユニットケア体制の有無);
        entity.setJudokaTaioTaisei_umu(DEFAULT_重度化対応体制の有無);
        entity.setIryoRenkeiTaisei_umu(DEFAULT_医療連携体制の有無);
        entity.setUnitCareTaisei_umu(DEFAULT_ユニットケア体制の有無);
        entity.setZaitaku_nyushoSogoRiyoTaisei_umu(DEFAULT_在宅_入所相互利用体制の有無);
        entity.setTerminalCareTaisei_umu(DEFAULT_ターミナルケア体制_看取り介護体制_の有無);
        entity.setShintaiKosokuHaishiTorikumi_umu(DEFAULT_身体拘束廃止取組の有無);
        entity.setShokiboKyotenShugoTaisei_umu(DEFAULT_小規模拠点集合体制の有無);
        entity.setNinchishoCareKasan_umu(DEFAULT_認知症ケア加算の有無);
        entity.setKobetsuKinoKunrenTaisei_umu(DEFAULT_個別機能訓練体制の有無);
        entity.setKobetsuRehaTeikyoTaisei_RigakuRyohoI_umu(DEFAULT_個別リハビリテーション提供体制_理学療法Ⅰ_の有無);
        entity.setKobetsuRehaTeikyoTaisei_RigakuRyohoII_umu2(DEFAULT_個別リハビリテーション提供体制_理学療法Ⅱ_の有無2);
        entity.setKobetsuRehaTeikyoTaisei_SagyoRyoho_umu(DEFAULT_個別リハビリテーション提供体制_作業療法_の有無);
        entity.setKobetsuRehaTeikyoTaisei_GengoChokakuRyoho_umu(DEFAULT_個別リハビリテーション提供体制_言語聴覚療法_の有無);
        entity.setKobetsuRehaTeikyoTaisei_Sonota_umu(DEFAULT_個別リハビリテーション提供体制_その他_の有無);
        entity.setSetsubiKijun(DEFAULT_設備基準);
        entity.setRyoyoTaiseiIjiTokubetsuKasan(DEFAULT_療養体制維持特別加算);
        entity.setKobetsuRehaTeikyoTaisei_RehaShidoKanri_umu(DEFAULT_個別リハビリテーション提供体制_リハビリテーション指導管理_の有無);
        entity.setSankyuHelperTaisei(DEFAULT_３級ヘルパー体制);
        entity.setChuSankanChiikiShokiboJigyoshoKasan_chiiki(DEFAULT_中山間地域等における小規模事業所加算_地域に関する状況_);
        entity.setChuSankanChiikiShokiboJigyoushoKasan_kibo(DEFAULT_中山間地域等における小規模事業所加算_規模に関する状況_);;
        entity.setServiceTeikyoTaiseiKyokaKasan(DEFAULT_サービス提供体制強化加算);
        entity.setNinchishoTankiShuchuRehabilitationKasan(DEFAULT_認知症短期集中リハビリテーション加算);
        entity.setJakunenseiNinchishoRiyoushaUkeeireKasan(DEFAULT_若年性認知症利用者_入所者_患者_受入加算);
        entity.setKangoTaiseiKasan(DEFAULT_看護体制加算);
        entity.setYakinShokuinHaichiKasan(DEFAULT_夜勤職員配置加算);
        entity.setRyoyoShokuKasan(DEFAULT_療養食加算);
        entity.setNichijoSeikatsuKeizokuShienKasan(DEFAULT_日常生活継続支援加算);
        entity.setNinchishoSemmonCareKasan(DEFAULT_認知症専門ケア加算);
        entity.setTwentyFourHoursTsuhoTaioKasan(DEFAULT_２４時間通報対応加算);
        entity.setKangoShokuinHaichiKasan(DEFAULT_看護職員配置加算);
        entity.setYakanCareKasan(DEFAULT_夜間ケア加算);
        entity.setShudanCommunicationRyoho_umu(DEFAULT_集団コミュニケーション療法の有無);
        entity.setServiceTeikyoTaiseiKyokaKasan_Karadokogata(DEFAULT_サービス提供体制強化加算_空床型_);
        entity.setNitchuShintaikaigoTaise_20funmiman_umu(DEFAULT_日中の身体介護２０分未満体制の有無);
        entity.setServiceTeikyoSekininshaTaisei_umu(DEFAULT_サービス提供責任者体制の有無);
        entity.setDoitsuTatemonoKyojuRiyoshaGenzan_umu(DEFAULT_同一建物に居住する利用者の減算の有無);
        entity.setKinkyuTankiNyushoTaiseiKakuhoKasan(DEFAULT_緊急短期入所体制確保加算);
        entity.setZaitakuFukki_ZaitakuRyoyoShienKinoKasan(DEFAULT_在宅復帰_在宅療養支援機能加算);
        entity.setSeikatuKinoKojoGroupKatsudoKasan(DEFAULT_生活機能向上グループ活動加算);
        entity.setKaigoShokuinShoguKaizenKasan(DEFAULT_介護職員処遇改善加算);
        return entity;
    }
}
