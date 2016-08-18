/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.service.core.futanwariaishoikkatsu;

import java.util.List;
import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbc.definition.core.futanwariai.FutanWariaiHanteiKubun;
import jp.co.ndensan.reams.db.dbc.definition.processprm.futanwariaishohakko.FutanwariaishoHakkoProcessParameter;
import jp.co.ndensan.reams.db.dbc.entity.csv.FutanwariaiShoHakkoIchiranCSVEntity;
import jp.co.ndensan.reams.db.dbc.entity.db.relate.futanwariaishohakko.RiyoshaFutanwariaishoTempEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.futanwariaishohakkoichiran.FutanWariaiShoHakkoIchiranEntity;
import jp.co.ndensan.reams.db.dbc.entity.report.futanwariaishokattokami.FutanWariaiShoKattokamiEntity;
import jp.co.ndensan.reams.db.dbx.definition.core.configkeys.ConfigNameDBU;
import jp.co.ndensan.reams.db.dbx.definition.core.dbbusinessconfig.DbBusinessConfig;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.DonyuKeitaiCode;
import jp.co.ndensan.reams.db.dbx.definition.core.shichosonsecurity.GyomuBunrui;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.db.dbx.service.core.shichosonsecurityjoho.ShichosonSecurityJoho;
import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaDaicho;
import jp.co.ndensan.reams.db.dbz.business.core.basic.ChohyoSeigyoKyotsu;
import jp.co.ndensan.reams.db.dbz.business.core.kanri.JushoHenshu;
import jp.co.ndensan.reams.db.dbz.business.core.koikizenshichosonjoho.KoikiZenShichosonJoho;
import jp.co.ndensan.reams.db.dbz.business.core.koikizenshichosonjoho.ShichosonCodeYoriShichoson;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedAtesaki;
import jp.co.ndensan.reams.db.dbz.business.report.util.EditedKojin;
import jp.co.ndensan.reams.db.dbz.definition.core.futanwariai.FutanwariaiKubun;
import jp.co.ndensan.reams.db.dbz.definition.core.kyotsu.NinshoshaDenshikoinshubetsuCode;
import jp.co.ndensan.reams.db.dbz.service.core.koikishichosonjoho.KoikiShichosonJohoFinder;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.AtesakiFactory;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.IShikibetsuTaisho;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.ShikibetsuTaishoFactory;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.ninshosha.Ninshosha;
import jp.co.ndensan.reams.ur.urz.business.report.parts.ninshosha.NinshoshaSourceBuilderFactory;
import jp.co.ndensan.reams.ur.urz.definition.core.ninshosha.KenmeiFuyoKubunType;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.ur.urz.entity.report.parts.ninshosha.NinshoshaSource;
import jp.co.ndensan.reams.ur.urz.entity.report.sofubutsuatesaki.SofubutsuAtesakiSource;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.ninshosha.NinshoshaFinderFactory;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.GyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;

/**
 * ビジネス設計_DBCMNK3001_負担割合証ソースファイル作成（service）
 *
 * @reamsid_L DBC-4990-032 pengxingyi
 */
public class FutanWariaishoIkkatsu {

    private static final RString 交付年月日TITLE = new RString("交付年月日　");
    private static final RString 開始年月日TITLE = new RString("開始年月日　");
    private static final RString 終了年月日TITLE = new RString("終了年月日　");
    private static final RString TILDE = new RString("　～");
    private static final RString 定数_ZERO = new RString("0");
    private static final RString 定数_ONE = new RString("1");
    private static final RString 定数_TWO = new RString("2");
    private static final RString 定数_THREE = new RString("3");
    private static final RString 定数_FOUR = new RString("4");
    private static final RString 定数_済 = new RString("済");
    private static final RString 定数_事業対象者 = new RString("事業対象者");
    private static final RString 定数_受給者 = new RString("受給者");
    private static final RString 定数_号 = new RString("号");
    private static final RString 定数_未発行 = new RString("未発行");
    private static final RString 定数_発行済み = new RString("発行済み");
    private static final RString 定数_全て = new RString("全て");
    private static final RString 定数_全件 = new RString("全件");
    private static final RString 定数_異動分 = new RString("異動分");
    private static final RString 定数_新規認定分 = new RString("新規認定分");
    private static final RString 定数_作成 = new RString("　作成");
    private static final RString 定数_帳票制御共通 = new RString("帳票制御共通");
    private static final RString 定数_帳票イメージフォルダパス = new RString("帳票イメージフォルダパス");
    private static final RString 定数_利用者負担割合証 = new RString("利用者負担割合証Temp");
    private static final RString 定数_交付年月日 = new RString("交付年月日");
    private static final RString 定数_連番 = new RString("連番");
    private static final RString 定数_バッチパラメータ = new RString("バッチパラメータ");
    private static final RString 定数_保険者番号 = new RString("保険者番号");
    private static final RString 定数_保険者名 = new RString("保険者名");
    private static final RString 定数_作成日時 = new RString("作成日時");
    private static final RString 定数_被保台帳 = new RString("被保台帳");
    private static final RString 定数_ソート順１ = new RString("ソート順１");
    private static final RString 定数_ソート順２ = new RString("ソート順２");
    private static final RString 定数_ソート順３ = new RString("ソート順３");
    private static final RString 定数_ソート順４ = new RString("ソート順４");
    private static final RString 定数_ソート順５ = new RString("ソート順５");
    private static final RString 定数_ページ = new RString("ページ");
    private static final RString 定数_年次 = new RString("年次");
    private static final RString 定数_過年度 = new RString("過年度");
    private static final RString 定数_即時 = new RString("即時");
    private static final int NUM_ONE = 1;
    private static final int NUM_TWO = 2;
    private static final int NUM_THREE = 3;
    private static final int NUM_FOUR = 4;
    private static final int NUM_FIVE = 5;

    /**
     * 負担割合証ソースデータ取得です。
     *
     * @param 帳票制御共通 帳票制御共通
     * @param imageFolderPath 帳票イメージフォルダパス
     * @param 利用者負担割合証Temp 利用者負担割合証Temp
     * @param 交付年月日 交付年月日
     * @param 連番 連番
     * @return {@link FutanWariaiShoKattokamiEntity}
     */
    public FutanWariaiShoKattokamiEntity getFutanWariaiSourceData(ChohyoSeigyoKyotsu 帳票制御共通, RString imageFolderPath,
            RiyoshaFutanwariaishoTempEntity 利用者負担割合証Temp, RDate 交付年月日, RString 連番) {
        requireNonNull(帳票制御共通, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_帳票制御共通.toString()));
        requireNonNull(imageFolderPath, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_帳票イメージフォルダパス.toString()));
        requireNonNull(利用者負担割合証Temp, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_利用者負担割合証.toString()));
        requireNonNull(交付年月日, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_交付年月日.toString()));
        requireNonNull(連番, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_連番.toString()));
        IAtesaki 宛先 = AtesakiFactory.createInstance(利用者負担割合証Temp.get宛先());
        IShikibetsuTaisho 宛名 = ShikibetsuTaishoFactory.createShikibetsuTaisho(利用者負担割合証Temp.get宛名());
        Ninshosha 認証者 = NinshoshaFinderFactory.createInstance().
                get帳票認証者(GyomuCode.DB介護保険, NinshoshaDenshikoinshubetsuCode.保険者印.getコード(), FlexibleDate.getNowDate());
        Association 地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
        NinshoshaSource compNinshosha = NinshoshaSourceBuilderFactory.
                createInstance(認証者, 地方公共団体, imageFolderPath, RDate.getNowDate(), 0, false, false, KenmeiFuyoKubunType.付与なし).
                buildSource();
        EditedAtesaki 編集後宛先 = JushoHenshu.create編集後宛先(宛先, 地方公共団体, 帳票制御共通);
        SofubutsuAtesakiSource 送付物宛先ソースデータ = 編集後宛先.getSofubutsuAtesakiSource().get送付物宛先ソース();
        EditedKojin 編集後個人 = new EditedKojin(宛名.to個人(), 帳票制御共通, 地方公共団体);
        return getFutanWariaishoEntitySource(利用者負担割合証Temp, 編集後個人, 交付年月日, compNinshosha, 連番, 送付物宛先ソースデータ);
    }

    private FutanWariaiShoKattokamiEntity getFutanWariaishoEntitySource(RiyoshaFutanwariaishoTempEntity entity, EditedKojin 編集後個人,
            RDate 交付年月日, NinshoshaSource compNinshosha, RString 連番, SofubutsuAtesakiSource 送付物宛先ソースデータ) {
        FutanWariaiShoKattokamiEntity source = new FutanWariaiShoKattokamiEntity();
        source.set交付年月日(交付年月日TITLE.concat(dateFormat基本形１(交付年月日)));
        source.set被保険者番号(entity.get被保台帳().getHihokenshaNo().getColumnValue());
        source.set住所(編集後個人.get編集後住所());
        source.setカナ氏名(編集後個人.get名称().getKana().getColumnValue());
        source.set氏名(編集後個人.get名称().getName().getColumnValue());
        source.set生年月日(編集後個人.get生年月日For帳票());
        source.set性別(編集後個人.get性別());
        source.set負担割合１(entity.get負担割合期間().getFutanWariaiKubun1());
        if (entity.get負担割合期間().getYukoKaishiYMD1() != null) {
            source.set適用開始年月日１(開始年月日TITLE.concat(dateFormat基本形１(entity.get負担割合期間().getYukoKaishiYMD1())));
        } else {
            source.set適用開始年月日１(RString.EMPTY);
        }
        if (entity.get負担割合期間().getYukoShuryoYMD1() != null) {
            source.set適用終了年月日１(終了年月日TITLE.concat(dateFormat基本形１(entity.get負担割合期間().getYukoShuryoYMD1())));
        } else {
            source.set適用終了年月日１(RString.EMPTY);
        }
        source.set負担割合２(entity.get負担割合期間().getFutanWariaiKubun2());
        if (entity.get負担割合期間().getYukoKaishiYMD2() != null) {
            source.set適用開始年月日２(開始年月日TITLE.concat(dateFormat基本形１(entity.get負担割合期間().getYukoKaishiYMD2())));
        } else {
            source.set適用開始年月日２(RString.EMPTY);
        }
        if (entity.get負担割合期間().getYukoShuryoYMD2() != null) {
            source.set適用終了年月日２(終了年月日TITLE.concat(dateFormat基本形１(entity.get負担割合期間().getYukoShuryoYMD2())));
        } else {
            source.set適用終了年月日２(RString.EMPTY);
        }
        ShoKisaiHokenshaNo hokenshaNo = getHokenshaCode(new HihokenshaDaicho(entity.get被保台帳()));
        if (hokenshaNo != null) {
            source.set保険者コード１(hokenshaNo.getColumnValue().substringReturnAsPossible(0, NUM_ONE));
            source.set保険者コード２(hokenshaNo.getColumnValue().substringReturnAsPossible(NUM_ONE, NUM_TWO));
            source.set保険者コード３(hokenshaNo.getColumnValue().substringReturnAsPossible(NUM_TWO, NUM_THREE));
            source.set保険者コード４(hokenshaNo.getColumnValue().substringReturnAsPossible(NUM_THREE, NUM_FOUR));
            source.set保険者コード５(hokenshaNo.getColumnValue().substringReturnAsPossible(NUM_FOUR, NUM_FIVE));
            source.set保険者コード６(hokenshaNo.getColumnValue().substringReturnAsPossible(NUM_FIVE));
        }
        source.set保険者住所(get保険者住所());
        source.set保険者名(compNinshosha.ninshoshaShimeiKakenai);
        source.set保険者電話番号(get電話番号());
        source.set電子公印(compNinshosha.denshiKoin);
        source.set連番(連番);
        source.setOcr連番(連番);
        source.set送付物宛先(送付物宛先ソースデータ);
        return source;
    }

    private RString get電話番号() {
        return DbBusinessConfig.get(ConfigNameDBU.保険者情報_電話番号, RDate.getNowDate(), SubGyomuCode.DBU介護統計報告);
    }

    private RString get保険者住所() {
        return DbBusinessConfig.get(ConfigNameDBU.保険者情報_住所, RDate.getNowDate(), SubGyomuCode.DBU介護統計報告);
    }

    private ShoKisaiHokenshaNo getHokenshaCode(HihokenshaDaicho 被保台帳) {
        requireNonNull(被保台帳, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_被保台帳.toString()));
        LasdecCode 市町村コード = null;
        if (定数_ONE.equals(被保台帳.get広域内住所地特例フラグ())) {
            市町村コード = 被保台帳.get広住特措置元市町村コード();
        } else if (定数_ZERO.equals(被保台帳.get広域内住所地特例フラグ())) {
            市町村コード = 被保台帳.get市町村コード();
        }
        Code 導入形態コード = ShichosonSecurityJoho.getShichosonSecurityJoho(GyomuBunrui.介護事務).get導入形態コード();
        if (DonyuKeitaiCode.事務単一.getCode().equals(導入形態コード.getKey())
                || DonyuKeitaiCode.事務構成市町村.getCode().equals(導入形態コード.getKey())) {
            List<KoikiZenShichosonJoho> 市町村情報 = KoikiShichosonJohoFinder.createInstance().koseiShichosonJoho().records();
            return 市町村情報.get(0).get証記載保険者番号();
        } else if (DonyuKeitaiCode.事務広域.getCode().equals(導入形態コード.getKey())) {
            List<ShichosonCodeYoriShichoson> 市町村コードによる市町村情報
                    = KoikiShichosonJohoFinder.createInstance().shichosonCodeYoriShichosonJoho(市町村コード).records();
            return 市町村コードによる市町村情報.get(0).get証記載保険者番号();
        }
        return null;
    }

    /**
     * 負担割合証発行一覧ソースデータ取得です。
     *
     * @param 帳票制御共通 帳票制御共通
     * @param 利用者負担割合証 利用者負担割合証
     * @param param param
     * @param 保険者番号 保険者番号
     * @param 保険者名 保険者名
     * @param ソート順１ ソート順１
     * @param ソート順２ ソート順２
     * @param ソート順３ ソート順３
     * @param ソート順４ ソート順４
     * @param ソート順５ ソート順５
     * @param ページ ページ
     * @param 作成日時 作成日時
     * @param 連番 連番
     * @return FutanWariaiShoHakkoIchiranEntity
     */
    public FutanWariaiShoHakkoIchiranEntity getHakkoIchiranSourceData(ChohyoSeigyoKyotsu 帳票制御共通,
            RiyoshaFutanwariaishoTempEntity 利用者負担割合証, FutanwariaishoHakkoProcessParameter param, RString 保険者番号,
            RString 保険者名, RString ソート順１, RString ソート順２, RString ソート順３, RString ソート順４, RString ソート順５,
            RString ページ, RDateTime 作成日時, RString 連番) {
        requireNonNull(帳票制御共通, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_帳票制御共通.toString()));
        requireNonNull(利用者負担割合証, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_利用者負担割合証.toString()));
        requireNonNull(param, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_バッチパラメータ.toString()));
        requireNonNull(保険者番号, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_保険者番号.toString()));
        requireNonNull(保険者名, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_保険者名.toString()));
        requireNonNull(ソート順１, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ソート順１.toString()));
        requireNonNull(ソート順２, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ソート順２.toString()));
        requireNonNull(ソート順３, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ソート順３.toString()));
        requireNonNull(ソート順４, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ソート順４.toString()));
        requireNonNull(ソート順５, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ソート順５.toString()));
        requireNonNull(ページ, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_ページ.toString()));
        requireNonNull(作成日時, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_作成日時.toString()));
        requireNonNull(連番, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_連番.toString()));
        IAtesaki 宛先 = AtesakiFactory.createInstance(利用者負担割合証.get宛先());
        IShikibetsuTaisho 宛名 = ShikibetsuTaishoFactory.createShikibetsuTaisho(利用者負担割合証.get宛名());
        Association 地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
        EditedAtesaki 編集後宛先 = JushoHenshu.create編集後宛先(宛先, 地方公共団体, 帳票制御共通);
        EditedKojin 編集後個人 = new EditedKojin(宛名.to個人(), 帳票制御共通, 地方公共団体);
        FutanWariaiShoHakkoIchiranEntity source = new FutanWariaiShoHakkoIchiranEntity();
        source.set年度(dateFormatパターン107(param.get年度()));
        source.set条件(param.get出力対象());
        if (定数_ZERO.equals(param.get出力対象())) {
            source.set条件(定数_全件);
        } else if (定数_ONE.equals(param.get出力対象())) {
            source.set条件(定数_異動分);
        } else if (定数_TWO.equals(param.get出力対象())) {
            source.set条件(定数_新規認定分);
        }
        if (format日時(param.get抽出期間開始日時()).isNullOrEmpty()) {
            source.set抽出対象期間開始(RString.EMPTY);
        } else {
            source.set抽出対象期間開始(format日時(param.get抽出期間開始日時()).concat(TILDE));
        }
        source.set抽出対象期間終了(format日時(param.get抽出期間終了日時()));
        if (定数_ZERO.equals(param.get発行区分())) {
            source.set発行区分(定数_未発行);
        } else if (定数_ONE.equals(param.get発行区分())) {
            source.set発行区分(定数_発行済み);
        } else if (定数_TWO.equals(param.get発行区分())) {
            source.set発行区分(定数_全て);
        }
        source.set交付日(dateFormat基本形１(param.get交付年月日()));
        source.set保険者番号(保険者番号);
        source.set保険者名(保険者名);
        source.setソート順１(ソート順１);
        source.setソート順２(ソート順２);
        source.setソート順３(ソート順３);
        source.setソート順４(ソート順４);
        source.setソート順５(ソート順５);
        source.setページ(ページ);
        source.set作成日時(format日時(作成日時).concat(定数_作成));
        source.set連番(連番);
        source.set被保険者番号(利用者負担割合証.get被保台帳().getHihokenshaNo().getColumnValue());
        source.set送付先住所(編集後宛先.get編集後住所());
        source.set被保険者氏名(編集後個人.get名称().getName().getColumnValue());
        source.set判定日(dateFormatパターン4(利用者負担割合証.get利用者負担割合().getHanteiYMD()));
        if (利用者負担割合証.get負担割合期間().getYukoKaishiYMD2() != null) {
            source.set開始年月日(dateFormatパターン4(利用者負担割合証.get負担割合期間().getYukoKaishiYMD2()));
        } else {
            source.set開始年月日(dateFormatパターン4(利用者負担割合証.get負担割合期間().getYukoKaishiYMD1()));
        }
        if (利用者負担割合証.get負担割合期間().getYukoShuryoYMD2() != null) {
            source.set終了年月日(dateFormatパターン4(利用者負担割合証.get負担割合期間().getYukoShuryoYMD2()));
        } else {
            source.set終了年月日(dateFormatパターン4(利用者負担割合証.get負担割合期間().getYukoShuryoYMD1()));
        }
        if (!RString.isNullOrEmpty(利用者負担割合証.get負担割合期間().getFutanWariaiKubun2())) {
            source.set負担割合(FutanwariaiKubun.toValue(利用者負担割合証.get負担割合期間().getFutanWariaiKubun2()).get名称());
        } else {
            source.set負担割合(FutanwariaiKubun.toValue(利用者負担割合証.get負担割合期間().getFutanWariaiKubun1()).get名称());
        }
        if (定数_ONE.equals(利用者負担割合証.get利用者負担割合().getHanteiKubun())) {
            source.set判定区分(定数_年次);
        } else if (定数_TWO.equals(利用者負担割合証.get利用者負担割合().getHanteiKubun())) {
            source.set判定区分(定数_異動分);
        } else if (定数_THREE.equals(利用者負担割合証.get利用者負担割合().getHanteiKubun())) {
            source.set判定区分(定数_過年度);
        } else if (定数_FOUR.equals(利用者負担割合証.get利用者負担割合().getHanteiKubun())) {
            source.set判定区分(定数_即時);
        }
        if (定数_ZERO.equals(利用者負担割合証.get利用者負担割合().getHakoKubun())) {
            source.set発行済(RString.EMPTY);
        } else {
            source.set発行済(定数_済);
        }
        getHokenshaCode(new HihokenshaDaicho(利用者負担割合証.get被保台帳()));
        return source;
    }

    /**
     * 負担割合証発行一覧CSVデータ取得です。
     *
     * @param 帳票制御共通 帳票制御共通
     * @param 利用者負担割合証Temp 利用者負担割合証Temp
     * @param 連番 連番
     * @return FutanwariaiShoHakkoIchiranCSVEntity
     */
    public FutanwariaiShoHakkoIchiranCSVEntity getHakkoIchiranCSVData(ChohyoSeigyoKyotsu 帳票制御共通,
            RiyoshaFutanwariaishoTempEntity 利用者負担割合証Temp, RString 連番) {
        requireNonNull(帳票制御共通, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_帳票制御共通.toString()));
        requireNonNull(利用者負担割合証Temp, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_利用者負担割合証.toString()));
        requireNonNull(連番, UrSystemErrorMessages.値がnull.getReplacedMessage(定数_連番.toString()));
        IAtesaki 宛先 = AtesakiFactory.createInstance(利用者負担割合証Temp.get宛先());
        IShikibetsuTaisho 宛名 = ShikibetsuTaishoFactory.createShikibetsuTaisho(利用者負担割合証Temp.get宛名());
        Association 地方公共団体 = AssociationFinderFactory.createInstance().getAssociation();
        EditedAtesaki 編集後宛先 = JushoHenshu.create編集後宛先(宛先, 地方公共団体, 帳票制御共通);
        EditedKojin 編集後個人 = new EditedKojin(宛名.to個人(), 帳票制御共通, 地方公共団体);
        FutanwariaiShoHakkoIchiranCSVEntity csvEntity = new FutanwariaiShoHakkoIchiranCSVEntity();
        csvEntity.set連番(連番);
        csvEntity.set被保険者番号(利用者負担割合証Temp.get被保台帳().getHihokenshaNo().getColumnValue());
        csvEntity.set送付先住所(編集後宛先.get編集後住所());
        csvEntity.set被保険者氏名(編集後個人.get名称().getName().getColumnValue());
        csvEntity.set判定日(dateFormat基本形１(利用者負担割合証Temp.get利用者負担割合().getHanteiYMD()));
        if (利用者負担割合証Temp.get負担割合期間().getYukoKaishiYMD2() != null) {
            csvEntity.set開始年月日(dateFormat基本形１(利用者負担割合証Temp.get負担割合期間().getYukoKaishiYMD2()));
        } else {
            csvEntity.set開始年月日(dateFormat基本形１(利用者負担割合証Temp.get負担割合期間().getYukoKaishiYMD1()));
        }
        if (利用者負担割合証Temp.get負担割合期間().getYukoShuryoYMD2() != null) {
            csvEntity.set終了年月日(dateFormat基本形１(利用者負担割合証Temp.get負担割合期間().getYukoShuryoYMD2()));
        } else {
            csvEntity.set終了年月日(dateFormat基本形１(利用者負担割合証Temp.get負担割合期間().getYukoShuryoYMD1()));
        }
        if (!RString.isNullOrEmpty(利用者負担割合証Temp.get負担割合期間().getFutanWariaiKubun2())) {
            csvEntity.set負担割合(FutanwariaiKubun.toValue(利用者負担割合証Temp.get負担割合期間().getFutanWariaiKubun2()).get名称());
        } else {
            csvEntity.set負担割合(FutanwariaiKubun.toValue(利用者負担割合証Temp.get負担割合期間().getFutanWariaiKubun1()).get名称());
        }
        csvEntity.set判定区分(FutanWariaiHanteiKubun.toValue(利用者負担割合証Temp.get利用者負担割合().getHanteiKubun()).get名称());
        if (定数_ZERO.equals(利用者負担割合証Temp.get利用者負担割合().getHakoKubun())) {
            csvEntity.set発行済(RString.EMPTY);
        } else {
            csvEntity.set発行済(定数_済);
        }
        if (定数_ONE.equals(利用者負担割合証Temp.get事業対象者受給者区分())) {
            csvEntity.set事業対象者受給者区分(定数_事業対象者);
        } else if (定数_TWO.equals(利用者負担割合証Temp.get事業対象者受給者区分())) {
            csvEntity.set事業対象者受給者区分(定数_受給者);
        }
        if (!RString.isNullOrEmpty(利用者負担割合証Temp.get負担割合期間().getShikakuKubun2())) {
            csvEntity.set資格区分(利用者負担割合証Temp.get負担割合期間().getShikakuKubun2().concat(定数_号));
        } else {
            csvEntity.set資格区分(利用者負担割合証Temp.get負担割合期間().getShikakuKubun1().concat(定数_号));
        }
        csvEntity.set証記載保険者番号(getHokenshaCode(new HihokenshaDaicho(利用者負担割合証Temp.get被保台帳())).getColumnValue());
        return csvEntity;
    }

    private RString dateFormat基本形１(RDate date) {
        if (date == null) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
    }

    private RString dateFormat基本形１(FlexibleDate date) {
        if (date == null) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).fillType(FillType.BLANK).toDateString();
    }

    private RString dateFormatパターン4(FlexibleDate date) {
        if (date == null) {
            return RString.EMPTY;
        }
        return date.wareki().eraType(EraType.KANJI_RYAKU).firstYear(FirstYear.GAN_NEN).
                separator(Separator.PERIOD).fillType(FillType.BLANK).toDateString();
    }

    private RString dateFormatパターン107(FlexibleYear nendo) {
        if (nendo == null) {
            return RString.EMPTY;
        }
        return nendo.wareki().eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).fillType(FillType.BLANK).toDateString();
    }

    private RString format日時(RDateTime 作成日時) {
        if (作成日時 == null) {
            return RString.EMPTY;
        }

        RStringBuilder dateTime = new RStringBuilder();

        dateTime.append(作成日時.getDate().wareki().
                eraType(EraType.KANJI).firstYear(FirstYear.GAN_NEN).
                separator(Separator.JAPANESE).
                fillType(FillType.BLANK).toDateString());
        dateTime.append(RString.FULL_SPACE);
        dateTime.append(作成日時.getTime().toFormattedTimeString(DisplayTimeFormat.HH時mm分ss秒));
        return dateTime.toRString();
    }
}
