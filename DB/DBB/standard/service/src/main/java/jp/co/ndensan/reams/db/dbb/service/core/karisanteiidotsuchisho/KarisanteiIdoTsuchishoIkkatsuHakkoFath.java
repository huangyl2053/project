/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.service.core.karisanteiidotsuchisho;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jp.co.ndensan.reams.db.dbb.business.core.fukaatena.FukaAtena;
import jp.co.ndensan.reams.db.dbb.business.core.fukajoho.fukajoho.FukaJoho;
import jp.co.ndensan.reams.db.dbb.business.core.honsanteitsuchishoikkatsuhakko.HonsanteiTsuchishoTempResult;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.KariTokuchoKaishiTsuchisyoJoho;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.EditedKariSanteiTsuchiShoKyotsu;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.KariSanteiNonyuTsuchiShoJoho;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.ShunyuJoho;
import jp.co.ndensan.reams.db.dbb.business.report.tsuchisho.notsu.UniversalPhase;
import jp.co.ndensan.reams.db.dbb.definition.core.choshuhoho.ChoshuHohoKibetsu;
import jp.co.ndensan.reams.db.dbb.entity.db.basic.DbT2015KeisangoJohoEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.basic.DbT2017TsuchishoHakkogoIdoshaEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.fukajoho.FukaJohoRelateEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.fukajoho.kibetsu.KibetsuEntity;
import jp.co.ndensan.reams.db.dbb.entity.db.relate.honsanteitsuchishoikkatsuhakko.HonsanteiTsuchishoTempEntity;
import jp.co.ndensan.reams.db.dbb.persistence.db.basic.DbT2017TsuchishoHakkogoIdoshaDac;
import jp.co.ndensan.reams.db.dbb.service.core.honsanteitsuchishoikkatsuhakko.HonsanteiTsuchishoIkkatsuHakkoFath;
import jp.co.ndensan.reams.db.dbx.business.core.choshuhoho.ChoshuHoho;
import jp.co.ndensan.reams.db.dbx.business.core.fuka.Fuka;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.DbT2003KibetsuEntity;
import jp.co.ndensan.reams.db.dbx.entity.db.basic.UrT0705ChoteiKyotsuEntity;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.AtesakiFactory;
import jp.co.ndensan.reams.ua.uax.business.core.atesaki.IAtesaki;
import jp.co.ndensan.reams.ua.uax.business.core.koza.Koza;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.ShikibetsuTaishoFactory;
import jp.co.ndensan.reams.ua.uax.business.core.shikibetsutaisho.kojin.IKojin;
import jp.co.ndensan.reams.ue.uex.business.core.NenkinTokuchoKaifuJoho;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.definition.core.codemaster.URZCodeShubetsu;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.euc.definition.UzUDE0831EucAccesslogFileType;
import jp.co.ndensan.reams.uz.uza.euc.io.EucEntityId;
import jp.co.ndensan.reams.uz.uza.io.Encode;
import jp.co.ndensan.reams.uz.uza.io.NewLine;
import jp.co.ndensan.reams.uz.uza.io.Path;
import jp.co.ndensan.reams.uz.uza.io.csv.CsvListWriter;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.math.Decimal;
import jp.co.ndensan.reams.uz.uza.spool.FileSpoolManager;
import jp.co.ndensan.reams.uz.uza.spool.entities.UzUDE0835SpoolOutputType;
import jp.co.ndensan.reams.uz.uza.ui.binding.propertyenum.DisplayTimeFormat;
import jp.co.ndensan.reams.uz.uza.util.code.CodeMaster;
import jp.co.ndensan.reams.uz.uza.util.db.EntityDataState;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;
import jp.co.ndensan.reams.uz.uza.util.editor.DecimalFormatter;

/**
 * 仮算定異動通知書一括発行（バッチ）クラスです。
 *
 * @reamsid_L DBB-0890-040 xicongwang
 */
public class KarisanteiIdoTsuchishoIkkatsuHakkoFath {

    private static final int INT_0 = 0;
    private static final int INT_1 = 1;
    private static final int INT_2 = 2;
    private static final int INT_3 = 3;
    private static final int INT_4 = 4;
    private static final int INT_5 = 5;
    private static final int INT_7 = 7;
    private static final int INT_8 = 8;
    private static final int INT_14 = 14;
    private static final RString 定数_特徴方法 = new RString("getTkKibetsuGaku");
    private static final RString 定数_普徴方法 = new RString("getFuKibetsuGaku");
    private static final RString タイトル_作成年月日 = new RString("作成年月日");
    private static final RString タイトル_作成日時 = new RString("作成日時");
    private static final RString タイトル_作成時刻 = new RString("作成時刻");
    private static final RString タイトル_賦課年度 = new RString("賦課年度");
    private static final RString タイトル_郵便番号 = new RString("郵便番号");
    private static final RString タイトル_住所 = new RString("住所");
    private static final RString タイトル_町域_管内_管外住所 = new RString("町域（管内）・管外住所");
    private static final RString タイトル_番地 = new RString("番地");
    private static final RString タイトル_行政区コード = new RString("行政区コード");
    private static final RString タイトル_行政区 = new RString("行政区");
    private static final RString タイトル_保険料額 = new RString("保険料額");
    private static final RString タイトル_当期 = new RString("当期");
    private static final RString タイトル_納付人_送付先 = new RString("納付人/送付先");
    private static final RString タイトル_前所得段階 = new RString("前所得段階");
    private static final RString タイトル_仮特別徴収額 = new RString("仮特別徴収額");
    private static final RString タイトル_次期以降 = new RString("次期以降");
    private static final RString タイトル_生年月日 = new RString("生年月日");
    private static final RString タイトル_性別 = new RString("性別");
    private static final RString タイトル_世帯主名 = new RString("世帯主名");
    private static final RString タイトル_通知書番号 = new RString("通知書番号");
    private static final RString タイトル_世帯コード = new RString("世帯コード");
    private static final RString タイトル_被保険者氏名 = new RString("被保険者氏名");
    private static final RString タイトル_被保険者番号 = new RString("被保険者番号");
    private static final RString タイトル_特別徴収業務者コード = new RString("特別徴収業務者コード");
    private static final RString タイトル_特別徴収業務者 = new RString("特別徴収業務者");
    private static final RString タイトル_特別徴収対象年金コード = new RString("特別徴収対象年金コード");
    private static final RString タイトル_特別徴収対象年金 = new RString("特別徴収対象年金");
    private static final RString タイトル_仮徴収額_4月 = new RString("仮徴収額（4月）");
    private static final RString タイトル_仮徴収額_6月 = new RString("仮徴収額（6月）");
    private static final RString タイトル_仮徴収額_8月 = new RString("仮徴収額（8月）");
    private static final EucEntityId EUC_ENTITY_ID = new EucEntityId("DBB200001");
    private static final RString 特別徴収_EUCファイル名 = new RString("TokubetsuChoshuKaishiTsuchishoKairiHakkoIchiranData.csv");
    private static final EucEntityId 特別徴収依頼金額明細_EUC_ENTITY_ID = new EucEntityId("DBB200023");
    private static final RString 特別徴収依頼金額明細_EUCファイル名 = new RString("TokubetsuChoshuIraikingakuMeisaiIchiran.csv");
    private static final EucEntityId 変更通知書_EUC_ENTITY_ID = new EucEntityId("DBB200014");
    private static final RString 変更通知書_EUCファイル名 = new RString("KariSanteigakuHenkoTsuchishoHakkoIchiranData.csv");
    private static final RString カンマ = new RString(",");
    private static final RString EUC_WRITER_ENCLOSURE = new RString("\"");
    private static final RString 特徴開始月 = new RString("４月");
    private static final RString タイトル_表示コード名１ = new RString("表示コード名１");
    private static final RString タイトル_表示コード名２ = new RString("表示コード名２");
    private static final RString タイトル_表示コード名３ = new RString("表示コード名３");
    private static final RString タイトル_表示コード１ = new RString("表示コード１");
    private static final RString タイトル_表示コード２ = new RString("表示コード２");
    private static final RString タイトル_表示コード３ = new RString("表示コード３");
    private static final RString タイトル_保険料額_更正前 = new RString("保険料額（更正前）");
    private static final RString タイトル_徴収方法_更正前 = new RString("徴収方法（更正前）");
    private static final RString タイトル_生保開始日 = new RString("生保開始日");
    private static final RString タイトル_生保種別 = new RString("生保種別");
    private static final RString タイトル_氏名 = new RString("氏名");
    private static final RString タイトル_保険料額_更正後 = new RString("保険料額（更正後）");
    private static final RString タイトル_徴収方法_更正後 = new RString("徴収方法（更正後）");
    private static final RString タイトル_口座情報 = new RString("口座情報");
    private static final RString ゆうちょ銀行 = new RString("9900");
    private static final RString 定値_半角ハイフン = new RString("-");
    private static final RString タイトル_保険者コード = new RString("保険者コード");
    private static final RString タイトル_保険者名 = new RString("保険者名");
    private static final RString タイトル_識別コード = new RString("識別コード");
    private static final RString タイトル_年金コード = new RString("年金コード");
    private static final RString タイトル_住所コード = new RString("住所コード");
    private static final RString タイトル_年金番号 = new RString("年金番号");
    private static final RString タイトル_取得段階 = new RString("取得段階");
    private static final RString タイトル_基準年度保険料率 = new RString("基準年度保険料率");
    private static final RString タイトル_基準年度最終期標準額 = new RString("基準年度最終期標準額");
    private static final RString タイトル_特徴捕捉月 = new RString("特徴捕捉月");
    private static final RString タイトル_特徴開始月 = new RString("特徴開始月");
    private static final RString タイトル_依頼金額 = new RString("依頼金額");
    private static final RString タイトル_備考 = new RString("備考");
    private static final RString 定値_ほし = new RString("＊");
    private final DbT2017TsuchishoHakkogoIdoshaDac 通知書発行後異動者Dac;

    /**
     * コンストラクタです。
     */
    KarisanteiIdoTsuchishoIkkatsuHakkoFath() {
        this.通知書発行後異動者Dac = InstanceProvider.create(DbT2017TsuchishoHakkogoIdoshaDac.class);
    }

    /**
     * {@link InstanceProvider#create}にて生成した{@link KarisanteiIdoTsuchishoIkkatsuHakkoFath}のインスタンスを返します。
     *
     * @return KarisanteiIdoTsuchishoIkkatsuHakkoFath
     */
    public static KarisanteiIdoTsuchishoIkkatsuHakkoFath createInstance() {
        return InstanceProvider.create(KarisanteiIdoTsuchishoIkkatsuHakkoFath.class);
    }

    /**
     * 特別徴収開始通知書発行一覧表ＣＳＶの出力メソッドです。
     *
     * @param 調定年度 FlexibleYear
     * @param 帳票作成日時 RDateTime
     * @param 編集後仮算定通知書共通情報List List<EditedKariSanteiTsuchiShoKyotsu>
     */
    public void publish特別徴収開始通知書発行一覧表(FlexibleYear 調定年度, RDateTime 帳票作成日時,
            List<EditedKariSanteiTsuchiShoKyotsu> 編集後仮算定通知書共通情報List) {

        List<RString> headerList = new ArrayList<>();
        headerList.add(タイトル_作成年月日);
        headerList.add(タイトル_作成時刻);
        headerList.add(タイトル_賦課年度);
        headerList.add(タイトル_郵便番号);
        headerList.add(タイトル_住所);
        headerList.add(タイトル_町域_管内_管外住所);
        headerList.add(タイトル_番地);
        headerList.add(タイトル_行政区コード);
        headerList.add(タイトル_行政区);
        headerList.add(タイトル_生年月日);
        headerList.add(タイトル_性別);
        headerList.add(タイトル_世帯主名);
        headerList.add(タイトル_通知書番号);
        headerList.add(タイトル_世帯コード);
        headerList.add(タイトル_被保険者氏名);
        headerList.add(タイトル_特別徴収業務者コード);
        headerList.add(タイトル_特別徴収業務者);
        headerList.add(タイトル_特別徴収対象年金コード);
        headerList.add(タイトル_特別徴収対象年金);
        headerList.add(タイトル_仮徴収額_4月);
        headerList.add(タイトル_仮徴収額_6月);
        headerList.add(タイトル_仮徴収額_8月);

        FileSpoolManager manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther,
                EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        RString eucFilePath = Path.combinePath(spoolWorkPath, 特別徴収_EUCファイル名);
        try (CsvListWriter csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                .setDelimiter(カンマ)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true).setHeader(headerList)
                .build()) {
            for (EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報 : 編集後仮算定通知書共通情報List) {
                List<RString> bodyList = new ArrayList<>();
                bodyList.add(帳票作成日時.getDate().seireki().separator(Separator.SLASH).fillType(FillType.BLANK).toDateString());
                bodyList.add(帳票作成日時.getTime().toFormattedTimeString(DisplayTimeFormat.HH_mm_ss));
                bodyList.add(調定年度.toDateString());
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get郵便番号());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get編集後住所());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get町域());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get番地());
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後宛先().get行政区コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後宛先().get行政区コード().getColumnValue());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get行政区名());
                }
                if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get編集後個人().get生年月日Csv());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後個人().get性別());
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get世帯主名())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get世帯主名().getColumnValue());

                }
                bodyList.add(isNull(編集後仮算定通知書共通情報.get通知書番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get通知書番号().getColumnValue());
                if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get世帯コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get世帯コード().getColumnValue());
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get名称())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get名称().getName().getColumnValue());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収義務者コード());
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収義務者());
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収対象年金コード());
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収対象年金());
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額01()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額01(), 0));
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額02()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額02(), 0));
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額03()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額03(), 0));
                }
                toBodyList(bodyList);
                csvListWriter.writeLine(bodyList);
            }
            csvListWriter.close();
            manager.spool(SubGyomuCode.DBB介護賦課, eucFilePath);
        }
    }

    /**
     * 特別徴収依頼金額明細一覧表CSVの出力メソッドです。
     *
     * @param 調定年度 FlexibleYear
     * @param 帳票作成日時 RDateTime
     * @param 地方公共団体 Association
     * @param 仮算定特徴開始通知書情報List List<KariTokuchoKaishiTsuchisyoJoho>
     */
    public void publish特別徴収依頼金額明細一覧表(FlexibleYear 調定年度, RDateTime 帳票作成日時, Association 地方公共団体,
            List<KariTokuchoKaishiTsuchisyoJoho> 仮算定特徴開始通知書情報List) {

        List<RString> headerList = new ArrayList<>();
        headerList.add(タイトル_作成年月日);
        headerList.add(タイトル_作成時刻);
        headerList.add(タイトル_賦課年度);
        headerList.add(タイトル_保険者コード);
        headerList.add(タイトル_保険者名);
        headerList.add(タイトル_通知書番号);
        headerList.add(タイトル_識別コード);
        headerList.add(タイトル_行政区コード);
        headerList.add(タイトル_年金コード);
        headerList.add(タイトル_住所);
        headerList.add(タイトル_町域_管内_管外住所);
        headerList.add(タイトル_番地);
        headerList.add(タイトル_特別徴収業務者コード);
        headerList.add(タイトル_特別徴収業務者);
        headerList.add(タイトル_被保険者番号);
        headerList.add(タイトル_世帯コード);
        headerList.add(タイトル_住所コード);
        headerList.add(タイトル_年金番号);
        headerList.add(タイトル_被保険者氏名);
        headerList.add(タイトル_特別徴収対象年金);
        headerList.add(タイトル_取得段階);
        headerList.add(タイトル_基準年度保険料率);
        headerList.add(タイトル_基準年度最終期標準額);
        headerList.add(タイトル_特徴捕捉月);
        headerList.add(タイトル_特徴開始月);
        headerList.add(タイトル_依頼金額);
        headerList.add(タイトル_備考);

        FileSpoolManager manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther,
                特別徴収依頼金額明細_EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        RString eucFilePath = Path.combinePath(spoolWorkPath, 特別徴収依頼金額明細_EUCファイル名);
        try (CsvListWriter csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                .setDelimiter(カンマ)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true).setHeader(headerList)
                .build()) {
            for (KariTokuchoKaishiTsuchisyoJoho 仮算定特徴開始通知書情報 : 仮算定特徴開始通知書情報List) {
                List<RString> bodyList = new ArrayList<>();
                bodyList.add(帳票作成日時.getDate().seireki().separator(Separator.SLASH).fillType(FillType.BLANK).toDateString());
                bodyList.add(帳票作成日時.getTime().toFormattedTimeString(DisplayTimeFormat.HH_mm_ss));
                bodyList.add(調定年度.toDateString());
                bodyList.add(地方公共団体.get地方公共団体コード().getColumnValue());
                bodyList.add(地方公共団体.get市町村名());

                EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報 = 仮算定特徴開始通知書情報.get編集後仮算定通知書共通情報();
                bodyList.add(isNull(編集後仮算定通知書共通情報.get通知書番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get通知書番号().getColumnValue());
                bodyList.add(isNull(編集後仮算定通知書共通情報.get識別コード())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get識別コード().getColumnValue());
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後宛先().get行政区コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後宛先().get行政区コード().getColumnValue());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収対象年金コード());
                }
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get編集後住所());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get町域());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get番地());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収義務者コード());
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収義務者());
                }
                bodyList.add(isNull(編集後仮算定通知書共通情報.get被保険者番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get被保険者番号().getColumnValue());
                if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get世帯コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get世帯コード().getColumnValue());
                }
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先()) || isNull(編集後仮算定通知書共通情報.get編集後宛先().get住所コード())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get住所コード().getColumnValue());
                }
                set特別徴収依頼金額明細一覧表(編集後仮算定通知書共通情報, bodyList);
                bodyList.add(仮算定特徴開始通知書情報.get特徴捕捉月());
                bodyList.add(特徴開始月);
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額01()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額01(), 0));
                }
                bodyList.add(RString.EMPTY);
                toBodyList(bodyList);
                csvListWriter.writeLine(bodyList);
            }
            csvListWriter.close();
            manager.spool(SubGyomuCode.DBB介護賦課, eucFilePath);
        }
    }

    private void set特別徴収依頼金額明細一覧表(EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報, List<RString> bodyList) {

        if (isNull(編集後仮算定通知書共通情報.get更正後())) {
            bodyList.add(RString.EMPTY);
        } else {
            bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収対象年金コード());
        }
        if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
            bodyList.add(RString.EMPTY);
        } else {
            bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get名称())
                    ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get名称().getName().getColumnValue());
        }
        if (isNull(編集後仮算定通知書共通情報.get更正後())) {
            bodyList.add(RString.EMPTY);
            bodyList.add(RString.EMPTY);
        } else {
            bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後特別徴収対象年金());
            bodyList.add(RString.isNullOrEmpty(編集後仮算定通知書共通情報.get更正後().get保険料段階()) ? RString.EMPTY
                    : DecimalFormatter.toコンマ区切りRString(new Decimal(編集後仮算定通知書共通情報.get更正後().get保険料段階().toString()), 0));
        }
        if (isNull(編集後仮算定通知書共通情報.get前年度情報())) {
            bodyList.add(RString.EMPTY);
            bodyList.add(RString.EMPTY);
        } else {
            bodyList.add(isNull(編集後仮算定通知書共通情報.get前年度情報().get前年度保険料率()) ? RString.EMPTY
                    : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get前年度情報().get前年度保険料率(), 0));
            bodyList.add(isNull(編集後仮算定通知書共通情報.get前年度情報().get前年度最終期特徴期別介護保険料()) ? RString.EMPTY
                    : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get前年度情報().get前年度最終期特徴期別介護保険料(), 0));
        }

    }

    /**
     * 仮算定額変更通知書発行一覧表ＣＳＶの出力メソッドです。
     *
     * @param 調定年度 FlexibleYear
     * @param 帳票作成日時 RDateTime
     * @param 編集後仮算定通知書共通情報List List<EditedKariSanteiTsuchiShoKyotsu>
     */
    public void publish仮算定額変更通知書発行一覧表(FlexibleYear 調定年度, RDateTime 帳票作成日時,
            List<EditedKariSanteiTsuchiShoKyotsu> 編集後仮算定通知書共通情報List) {

        List<RString> headerList = new ArrayList<>();
        headerList.add(タイトル_作成日時);
        headerList.add(タイトル_作成時刻);
        headerList.add(タイトル_賦課年度);
        headerList.add(タイトル_通知書番号);
        headerList.add(タイトル_被保険者番号);
        headerList.add(タイトル_世帯コード);
        headerList.add(タイトル_氏名);
        headerList.add(タイトル_郵便番号);
        headerList.add(タイトル_住所コード);
        headerList.add(タイトル_住所);
        headerList.add(タイトル_町域_管内_管外住所);
        headerList.add(タイトル_番地);
        headerList.add(タイトル_保険料額_更正前);
        headerList.add(タイトル_保険料額_更正後);
        headerList.add(タイトル_徴収方法_更正前);
        headerList.add(タイトル_徴収方法_更正後);
        headerList.add(タイトル_生保開始日);
        headerList.add(タイトル_生保種別);
        headerList.add(タイトル_口座情報);

        FileSpoolManager manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther,
                変更通知書_EUC_ENTITY_ID, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        RString eucFilePath = Path.combinePath(spoolWorkPath, 変更通知書_EUCファイル名);
        try (CsvListWriter csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                .setDelimiter(カンマ)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true).setHeader(headerList)
                .build()) {
            for (EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報 : 編集後仮算定通知書共通情報List) {
                List<RString> bodyList = new ArrayList<>();
                bodyList.add(帳票作成日時.getDate().seireki().separator(Separator.SLASH).fillType(FillType.BLANK).toDateString());
                bodyList.add(帳票作成日時.getTime().toFormattedTimeString(DisplayTimeFormat.HH_mm_ss));
                bodyList.add(調定年度.toDateString());
                bodyList.add(isNull(編集後仮算定通知書共通情報.get通知書番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get通知書番号().getColumnValue());
                bodyList.add(isNull(編集後仮算定通知書共通情報.get被保険者番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get被保険者番号().getColumnValue());
                if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get世帯コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get世帯コード().getColumnValue());
                }
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後宛先().get本人名称()) ? RString.EMPTY
                            : 編集後仮算定通知書共通情報.get編集後宛先().get本人名称().getName().getColumnValue());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get郵便番号());
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後宛先().get住所コード()) ? RString.EMPTY
                            : 編集後仮算定通知書共通情報.get編集後宛先().get住所コード().getColumnValue());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get編集後住所());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get町域());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get番地());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正前())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正前().get更正前介護保険料仮徴収額合計()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正前().get更正前介護保険料仮徴収額合計(), 0));
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後介護保険料仮徴収額合計()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後介護保険料仮徴収額合計(), 0));
                }
                if (isNull(編集後仮算定通知書共通情報.get更正前())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正前().get更正前徴収方法());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get更正後徴収方法());
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get生保開始日_西暦());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())
                        || RString.isNullOrEmpty(編集後仮算定通知書共通情報.get更正後().get生活保護扶助種類())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    RString 生活保護扶助名称 = CodeMaster.getCodeMeisho(SubGyomuCode.URZ業務共通_共通系,
                            URZCodeShubetsu.扶助種類コード.getCodeShubetsu(),
                            new Code(編集後仮算定通知書共通情報.get更正後().get生活保護扶助種類()));
                    bodyList.add(生活保護扶助名称);
                }
                bodyList.add(editTutishoKyoutuuKoumoku(編集後仮算定通知書共通情報));
                toBodyList(bodyList);
                csvListWriter.writeLine(bodyList);
            }
            csvListWriter.close();
            manager.spool(SubGyomuCode.DBB介護賦課, eucFilePath);
        }
    }

    /**
     * 納入通知書仮算定発行一覧表ＣＳＶの出力メソッドです。
     *
     * @param 帳票作成日時 RDateTime
     * @param 賦課年度 FlexibleYear
     * @param 出力期 RString
     * @param 仮算定納入通知書情報List List<KariSanteiNonyuTsuchiShoJoho>
     * @param eucEntityId EucEntityId
     * @param eucFileName RString
     */
    public void publish納入通知書仮算定発行一覧表(RDateTime 帳票作成日時, FlexibleYear 賦課年度, RString 出力期,
            List<KariSanteiNonyuTsuchiShoJoho> 仮算定納入通知書情報List, EucEntityId eucEntityId, RString eucFileName) {

        List<RString> headerList = new ArrayList<>();
        headerList.add(タイトル_作成年月日);
        headerList.add(タイトル_作成時刻);
        headerList.add(タイトル_表示コード名１);
        headerList.add(タイトル_表示コード名２);
        headerList.add(タイトル_表示コード名３);
        headerList.add(タイトル_通知書番号);
        headerList.add(タイトル_被保険者番号);
        headerList.add(タイトル_世帯コード);
        headerList.add(タイトル_表示コード１);
        headerList.add(タイトル_表示コード２);
        headerList.add(タイトル_表示コード３);
        headerList.add(タイトル_行政区);
        headerList.add(タイトル_保険料額);
        headerList.add(タイトル_当期);
        headerList.add(タイトル_納付人_送付先);
        headerList.add(タイトル_生保開始日);
        headerList.add(タイトル_生保種別);
        headerList.add(タイトル_氏名);
        headerList.add(タイトル_郵便番号);
        headerList.add(タイトル_住所);
        headerList.add(タイトル_町域_管内_管外住所);
        headerList.add(タイトル_番地);
        headerList.add(タイトル_前所得段階);
        headerList.add(タイトル_仮特別徴収額);
        headerList.add(タイトル_次期以降);
        headerList.add(タイトル_口座情報);

        FileSpoolManager manager = new FileSpoolManager(UzUDE0835SpoolOutputType.EucOther,
                eucEntityId, UzUDE0831EucAccesslogFileType.Csv);
        RString spoolWorkPath = manager.getEucOutputDirectry();
        RString eucFilePath = Path.combinePath(spoolWorkPath, eucFileName);
        try (CsvListWriter csvListWriter = new CsvListWriter.InstanceBuilder(eucFilePath).setNewLine(NewLine.CRLF)
                .setDelimiter(カンマ)
                .setEnclosure(EUC_WRITER_ENCLOSURE)
                .setEncode(Encode.UTF_8withBOM)
                .hasHeader(true).setHeader(headerList)
                .build()) {
            for (KariSanteiNonyuTsuchiShoJoho 仮算定納入通知書情報 : 仮算定納入通知書情報List) {
                List<RString> bodyList = new ArrayList<>();
                bodyList.add(帳票作成日時.getDate().seireki().separator(Separator.SLASH).fillType(FillType.BLANK).toDateString());
                bodyList.add(帳票作成日時.getTime().toFormattedTimeString(DisplayTimeFormat.HH_mm_ss));
                EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報 = 仮算定納入通知書情報.get編集後仮算定通知書共通情報();
                if (編集後仮算定通知書共通情報 == null) {
                    continue;
                }
                bodyList.add(編集後仮算定通知書共通情報.get表示コード１名());
                bodyList.add(編集後仮算定通知書共通情報.get表示コード２名());
                bodyList.add(編集後仮算定通知書共通情報.get表示コード３名());
                bodyList.add(isNull(編集後仮算定通知書共通情報.get通知書番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get通知書番号().getColumnValue());
                bodyList.add(isNull(編集後仮算定通知書共通情報.get被保険者番号())
                        ? RString.EMPTY : 編集後仮算定通知書共通情報.get被保険者番号().getColumnValue());
                if (isNull(編集後仮算定通知書共通情報.get編集後個人())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後個人().get世帯コード())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後個人().get世帯コード().getColumnValue());
                }
                bodyList.add(編集後仮算定通知書共通情報.get表示コード1());
                bodyList.add(編集後仮算定通知書共通情報.get表示コード２());
                bodyList.add(編集後仮算定通知書共通情報.get表示コード３());
                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get行政区名());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get保険料率());
                }
                set当期期別金額(編集後仮算定通知書共通情報, 出力期, bodyList);
                set納付人_送付先(編集後仮算定通知書共通情報, bodyList);

                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get更正後().get生保開始日_西暦());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())
                        || RString.isNullOrEmpty(編集後仮算定通知書共通情報.get更正後().get生活保護扶助種類())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    RString 生活保護扶助名称 = CodeMaster.getCodeMeisho(SubGyomuCode.URZ業務共通_共通系,
                            URZCodeShubetsu.扶助種類コード.getCodeShubetsu(),
                            new Code(編集後仮算定通知書共通情報.get更正後().get生活保護扶助種類()));
                    bodyList.add(生活保護扶助名称);
                }

                if (isNull(編集後仮算定通知書共通情報.get編集後宛先())) {
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get編集後宛先().get本人名称())
                            ? RString.EMPTY : 編集後仮算定通知書共通情報.get編集後宛先().get本人名称().getName().getColumnValue());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get郵便番号());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get編集後住所());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get町域());
                    bodyList.add(編集後仮算定通知書共通情報.get編集後宛先().get番地());
                }
                if (isNull(編集後仮算定通知書共通情報.get前年度情報())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(編集後仮算定通知書共通情報.get前年度情報().get前年度保険料段階());
                }
                if (isNull(編集後仮算定通知書共通情報.get更正後())) {
                    bodyList.add(RString.EMPTY);
                } else {
                    bodyList.add(isNull(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額合計()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(編集後仮算定通知書共通情報.get更正後().get更正後特徴期別金額合計(), 0));
                }
                set次期以降期別金額(編集後仮算定通知書共通情報, 出力期, bodyList);
                bodyList.add(editTutishoKyoutuuKoumoku(編集後仮算定通知書共通情報));
                toBodyList(bodyList);
                csvListWriter.writeLine(bodyList);
            }
            csvListWriter.close();
            manager.spool(SubGyomuCode.DBB介護賦課, eucFilePath);
        }
    }

    private void set納付人_送付先(EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報, List<RString> bodyList) {
        if (isNull(編集後仮算定通知書共通情報.get編集後宛先())
                || (isNull(編集後仮算定通知書共通情報.get編集後宛先().get宛先名称())
                && isNull(編集後仮算定通知書共通情報.get編集後宛先().get本人名称()))
                || (!isNull(編集後仮算定通知書共通情報.get編集後宛先().get宛先名称())
                && 編集後仮算定通知書共通情報.get編集後宛先().get宛先名称().equals(編集後仮算定通知書共通情報.get編集後宛先().get本人名称()))) {
            bodyList.add(RString.EMPTY);
        } else {
            bodyList.add(定値_ほし.concat(RString.FULL_SPACE)
                    .concat(編集後仮算定通知書共通情報.get編集後宛先().get宛先名称().getName().getColumnValue()));
        }
    }

    private void set当期期別金額(EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報, RString 出力期, List<RString> bodyList) {

        if (isNull(編集後仮算定通知書共通情報.get更正後()) || isNull(編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト())
                || 編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト().isEmpty()) {
            bodyList.add(RString.EMPTY);
        } else {
            boolean 区分 = false;
            List<UniversalPhase> 普徴期別金額リスト = 編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト();
            for (UniversalPhase 普徴期別金額 : 普徴期別金額リスト) {
                if (Integer.parseInt(出力期.toString()) == 普徴期別金額.get期()) {
                    区分 = true;
                    bodyList.add(isNull(普徴期別金額.get金額()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(普徴期別金額.get金額(), 0));
                    break;
                }
            }
            if (!区分) {
                bodyList.add(RString.EMPTY);
            }
        }
    }

    private void set次期以降期別金額(EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報, RString 出力期, List<RString> bodyList) {

        if (isNull(編集後仮算定通知書共通情報.get更正後()) || isNull(編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト())
                || 編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト().isEmpty()) {
            bodyList.add(RString.EMPTY);
        } else {
            boolean 区分 = false;
            List<UniversalPhase> 普徴期別金額リスト = 編集後仮算定通知書共通情報.get更正後().get更正後普徴期別金額リスト();
            for (UniversalPhase 普徴期別金額 : 普徴期別金額リスト) {
                if (Integer.parseInt(出力期.toString()) == 普徴期別金額.get期() + INT_1) {
                    区分 = true;
                    bodyList.add(isNull(普徴期別金額.get金額()) ? RString.EMPTY
                            : DecimalFormatter.toコンマ区切りRString(普徴期別金額.get金額(), 0));
                    break;
                }
            }
            if (!区分) {
                bodyList.add(RString.EMPTY);
            }
        }
    }

    /**
     * 通知書発行後異動者登録するメソッドです。
     *
     * @param 帳票作成日時 YMDHMS
     * @param 帳票ID ReportId
     * @param entityList List<HonsanteiTsuchishoTempEntity>
     */
    public void insert通知書発行後異動者(YMDHMS 帳票作成日時, ReportId 帳票ID, List<HonsanteiTsuchishoTempEntity> entityList) {

        if (entityList == null || entityList.isEmpty()) {
            return;
        }
        int 連番 = INT_1;
        for (HonsanteiTsuchishoTempEntity entity : entityList) {
            DbT2015KeisangoJohoEntity 計算後情報_更正後 = entity.get計算後情報_更正後();
            DbT2017TsuchishoHakkogoIdoshaEntity dbt2017entity = new DbT2017TsuchishoHakkogoIdoshaEntity();
            dbt2017entity.setReportID(帳票ID);
            dbt2017entity.setChohyosakuseiTimestamp(帳票作成日時);
            dbt2017entity.setTsuchishoNo(計算後情報_更正後.getTsuchishoNo());
            dbt2017entity.setFukaNendo(計算後情報_更正後.getFukaNendo());
            dbt2017entity.setShikibetsuCode(計算後情報_更正後.getShikibetsuCode());
            dbt2017entity.setHihokenshaNo(計算後情報_更正後.getHihokenshaNo());
            dbt2017entity.setKeisanTimestamp(get調定日時(計算後情報_更正後.getChoteiNichiji()));
            dbt2017entity.setGaitoRemban(連番);
            dbt2017entity.setIdoAriFlag(false);
            dbt2017entity.setState(EntityDataState.Added);
            通知書発行後異動者Dac.save(dbt2017entity);
            連番 = 連番 + INT_1;
        }
    }

    /**
     * 賦課情報を取得するメソッドです。
     *
     * @param entityList List<HonsanteiTsuchishoTempEntity>
     * @return List<HonsanteiTsuchishoTempResult> 賦課情報リスト
     * @throws java.lang.reflect.InvocationTargetException 賦課の情報_更正前後が取得できない場合、Exception
     */
    public List<HonsanteiTsuchishoTempResult> get賦課情報(List<HonsanteiTsuchishoTempEntity> entityList) throws InvocationTargetException {

        List<HonsanteiTsuchishoTempResult> tmpResultList = new ArrayList<>();
        for (HonsanteiTsuchishoTempEntity entity : entityList) {
            HonsanteiTsuchishoTempResult result = new HonsanteiTsuchishoTempResult();
            result.set計算後情報_更正後(entity.get計算後情報_更正後());
            result.set計算後情報_更正前(entity.get計算後情報_更正前());
            result.set賦課の情報_更正前(get賦課の情報_更正前後(entity, false));
            result.set賦課の情報_更正後(get賦課の情報_更正前後(entity, true));
            result.set納組情報(entity.get納組());
            IAtesaki 宛先 = AtesakiFactory.createInstance(entity.get宛先());
            result.set宛先情報(宛先);
            if (entity.get宛先代納() != null) {
                IAtesaki 宛先代納 = AtesakiFactory.createInstance(entity.get宛先代納());
                result.set宛先代納(宛先代納);
            }
            if (entity.get口座() != null && entity.get口座().getUaT0310KozaEntity().getKozaId() != 0) {
                result.set口座情報(new Koza(entity.get口座()));
            }
            result.set徴収方法情報_更正前(get徴収方法情報_更正前後(entity, false));
            result.set徴収方法情報_更正後(get徴収方法情報_更正前後(entity, true));
            if (entity.get対象者_追加含む_情報_更正前() != null) {
                result.set対象者_追加含む_情報_更正前(new NenkinTokuchoKaifuJoho(entity.get対象者_追加含む_情報_更正前()));
            }
            if (entity.get対象者_追加含む_情報_更正後() != null) {
                result.set対象者_追加含む_情報_更正後(new NenkinTokuchoKaifuJoho(entity.get対象者_追加含む_情報_更正後()));
            }
            result.set収入情報(get収入情報(entity));
            tmpResultList.add(result);
        }
        return tmpResultList;
    }

    private ShunyuJoho get収入情報(HonsanteiTsuchishoTempEntity entity) {

        DbT2015KeisangoJohoEntity 計算後情報_更正後 = entity.get計算後情報_更正後();
        if (計算後情報_更正後 == null) {
            return null;
        }
        ShunyuJoho 収入情報 = new ShunyuJoho();
        収入情報.set調定年度(計算後情報_更正後.getChoteiNendo());
        収入情報.set賦課年度(計算後情報_更正後.getFukaNendo());
        収入情報.set通知書番号(計算後情報_更正後.getTsuchishoNo());
        収入情報.set普徴収入額01(計算後情報_更正後.getFuShunyuGaku01());
        収入情報.set普徴収入額02(計算後情報_更正後.getFuShunyuGaku02());
        収入情報.set普徴収入額03(計算後情報_更正後.getFuShunyuGaku03());
        収入情報.set普徴収入額04(計算後情報_更正後.getFuShunyuGaku04());
        収入情報.set普徴収入額05(計算後情報_更正後.getFuShunyuGaku05());
        収入情報.set普徴収入額06(計算後情報_更正後.getFuShunyuGaku06());
        収入情報.set普徴収入額07(計算後情報_更正後.getFuShunyuGaku07());
        収入情報.set普徴収入額08(計算後情報_更正後.getFuShunyuGaku08());
        収入情報.set普徴収入額09(計算後情報_更正後.getFuShunyuGaku09());
        収入情報.set普徴収入額10(計算後情報_更正後.getFuShunyuGaku10());
        収入情報.set普徴収入額11(計算後情報_更正後.getFuShunyuGaku11());
        収入情報.set普徴収入額12(計算後情報_更正後.getFuShunyuGaku12());
        収入情報.set普徴収入額13(計算後情報_更正後.getFuShunyuGaku13());
        収入情報.set普徴収入額14(計算後情報_更正後.getFuShunyuGaku14());
        収入情報.set特徴収入額01(計算後情報_更正後.getTkShunyuGaku01());
        収入情報.set特徴収入額02(計算後情報_更正後.getTkShunyuGaku02());
        収入情報.set特徴収入額03(計算後情報_更正後.getTkShunyuGaku03());
        収入情報.set特徴収入額04(計算後情報_更正後.getTkShunyuGaku04());
        収入情報.set特徴収入額05(計算後情報_更正後.getTkShunyuGaku05());
        収入情報.set特徴収入額06(計算後情報_更正後.getTkShunyuGaku06());
        return 収入情報;
    }

    private ChoshuHoho get徴収方法情報_更正前後(HonsanteiTsuchishoTempEntity entity, boolean 前後区分) {

        DbT2015KeisangoJohoEntity 計算後情報_更正前後;
        if (前後区分) {
            計算後情報_更正前後 = entity.get計算後情報_更正後();
        } else {
            計算後情報_更正前後 = entity.get計算後情報_更正前();
        }
        if (計算後情報_更正前後 == null || 計算後情報_更正前後.getFukaNendo() == null || 計算後情報_更正前後.getFukaNendo().isEmpty()
                || 計算後情報_更正前後.getHihokenshaNo() == null || 計算後情報_更正前後.getHihokenshaNo().isEmpty()) {
            return null;
        }
        ChoshuHoho 徴収方法情報 = new ChoshuHoho(計算後情報_更正前後.getFukaNendo(),
                計算後情報_更正前後.getHihokenshaNo(), 計算後情報_更正前後.getChoshuHohoRirekiNo());
        徴収方法情報 = 徴収方法情報.createBuilderForEdit().set徴収方法4月(計算後情報_更正前後.getChoshuHoho4gatsu())
                .set徴収方法5月(計算後情報_更正前後.getChoshuHoho5gatsu()).set徴収方法6月(計算後情報_更正前後.getChoshuHoho6gatsu())
                .set徴収方法7月(計算後情報_更正前後.getChoshuHoho7gatsu()).set徴収方法8月(計算後情報_更正前後.getChoshuHoho8gatsu())
                .set徴収方法9月(計算後情報_更正前後.getChoshuHoho9gatsu()).set徴収方法10月(計算後情報_更正前後.getChoshuHoho10gatsu())
                .set徴収方法11月(計算後情報_更正前後.getChoshuHoho11gatsu()).set徴収方法12月(計算後情報_更正前後.getChoshuHoho12gatsu())
                .set徴収方法1月(計算後情報_更正前後.getChoshuHoho1gatsu()).set徴収方法2月(計算後情報_更正前後.getChoshuHoho2gatsu())
                .set徴収方法3月(計算後情報_更正前後.getChoshuHoho3gatsu()).set徴収方法翌4月(計算後情報_更正前後.getChoshuHohoYoku4gatsu())
                .set徴収方法翌5月(計算後情報_更正前後.getChoshuHohoYoku5gatsu()).set徴収方法翌6月(計算後情報_更正前後.getChoshuHohoYoku6gatsu())
                .set徴収方法翌7月(計算後情報_更正前後.getChoshuHohoYoku7gatsu()).set徴収方法翌8月(計算後情報_更正前後.getChoshuHohoYoku8gatsu())
                .set徴収方法翌9月(計算後情報_更正前後.getChoshuHohoYoku9gatsu()).set仮徴収_基礎年金番号(計算後情報_更正前後.getKariNenkinNo())
                .set仮徴収_年金コード(計算後情報_更正前後.getKariNenkinCode()).set仮徴収_捕捉月(計算後情報_更正前後.getKariHosokuM())
                .set本徴収_基礎年金番号(計算後情報_更正前後.getHonNenkinNo()).set本徴収_年金コード(計算後情報_更正前後.getHonNenkinCode())
                .set本徴収_捕捉月(計算後情報_更正前後.getHonHosokuM()).set翌年度仮徴収_基礎年金番号(計算後情報_更正前後.getYokunendoKariNenkinNo())
                .set翌年度仮徴収_年金コード(計算後情報_更正前後.getYokunendoKariNenkinCode())
                .set翌年度仮徴収_捕捉月(計算後情報_更正前後.getYokunendoKariHosokuM())
                .set依頼情報送付済みフラグ(計算後情報_更正前後.getIraiSohuzumiFlag())
                .set追加依頼情報送付済みフラグ(計算後情報_更正前後.getTsuikaIraiSohuzumiFlag())
                .set特別徴収停止日時(計算後情報_更正前後.getTokuchoTeishiNichiji())
                .set特別徴収停止事由コード(計算後情報_更正前後.getTokuchoTeishiJiyuCode()).build();
        return 徴収方法情報;
    }

    private FukaAtena get賦課の情報_更正前後(HonsanteiTsuchishoTempEntity entity, boolean 前後区分) throws InvocationTargetException {

        FukaAtena fukaAtena = new FukaAtena();
        DbT2015KeisangoJohoEntity 計算後情報_更正前後;
        if (前後区分) {
            計算後情報_更正前後 = entity.get計算後情報_更正後();
        } else {
            計算後情報_更正前後 = entity.get計算後情報_更正前();
        }
        if (計算後情報_更正前後 == null || 計算後情報_更正前後.getChoteiNendo() == null || 計算後情報_更正前後.getChoteiNendo().isEmpty()
                || 計算後情報_更正前後.getFukaNendo() == null || 計算後情報_更正前後.getFukaNendo().isEmpty()
                || 計算後情報_更正前後.getTsuchishoNo() == null || 計算後情報_更正前後.getTsuchishoNo().isEmpty()) {
            return null;
        }
        Fuka fuka = new Fuka(計算後情報_更正前後.getChoteiNendo(), 計算後情報_更正前後.getFukaNendo(),
                計算後情報_更正前後.getTsuchishoNo(), 計算後情報_更正前後.getFukaRirekiNo());
        fuka = fuka.createBuilderForEdit().set被保険者番号(計算後情報_更正前後.getHihokenshaNo())
                .set識別コード(計算後情報_更正前後.getShikibetsuCode())
                .set世帯コード(計算後情報_更正前後.getSetaiCode()).set世帯員数(計算後情報_更正前後.getSetaiInsu())
                .set資格取得日(計算後情報_更正前後.getShikakuShutokuYMD()).set資格取得事由(計算後情報_更正前後.getShikakuShutokuJiyu())
                .set資格喪失日(計算後情報_更正前後.getShikakuSoshitsuYMD()).set資格喪失事由(計算後情報_更正前後.getShikakuSoshitsuJiyu())
                .set生活保護扶助種類(計算後情報_更正前後.getSeihofujoShurui()).set生保開始日(計算後情報_更正前後.getSeihoKaishiYMD())
                .set生保廃止日(計算後情報_更正前後.getSeihoHaishiYMD()).set老年開始日(計算後情報_更正前後.getRonenKaishiYMD())
                .set老年廃止日(計算後情報_更正前後.getRonenHaishiYMD()).set賦課期日(計算後情報_更正前後.getFukaYMD())
                .set課税区分(計算後情報_更正前後.getKazeiKubun()).set世帯課税区分(計算後情報_更正前後.getSetaikazeiKubun())
                .set合計所得金額(計算後情報_更正前後.getGokeiShotokuGaku()).set公的年金収入額(計算後情報_更正前後.getNenkinShunyuGaku())
                .set保険料段階(計算後情報_更正前後.getHokenryoDankai()).set保険料算定段階1(計算後情報_更正前後.getHokenryoDankai1())
                .set算定年額保険料1(計算後情報_更正前後.getNengakuHokenryo1()).set保険料算定段階2(計算後情報_更正前後.getHokenryoDankai2())
                .set算定年額保険料2(計算後情報_更正前後.getNengakuHokenryo2()).set調定日時(計算後情報_更正前後.getChoteiNichiji())
                .set調定事由1(計算後情報_更正前後.getChoteiJiyu1()).set調定事由2(計算後情報_更正前後.getChoteiJiyu2())
                .set調定事由3(計算後情報_更正前後.getChoteiJiyu3()).set調定事由4(計算後情報_更正前後.getChoteiJiyu4())
                .set更正月(計算後情報_更正前後.getKoseiM()).set減免前介護保険料_年額(計算後情報_更正前後.getGemmenMaeHokenryo())
                .set減免額(計算後情報_更正前後.getGemmenGaku()).set確定介護保険料_年額(計算後情報_更正前後.getKakuteiHokenryo())
                .set保険料段階_仮算定時(計算後情報_更正前後.getHokenryoDankaiKarisanntei())
                .set徴収方法履歴番号(計算後情報_更正前後.getChoshuHohoRirekiNo())
                .set異動基準日時(計算後情報_更正前後.getIdoKijunNichiji()).set口座区分(計算後情報_更正前後.getKozaKubun())
                .set境界層区分(計算後情報_更正前後.getKyokaisoKubun()).set職権区分(計算後情報_更正前後.getShokkenKubun())
                .set賦課市町村コード(計算後情報_更正前後.getFukaShichosonCode()).set特徴歳出還付額(計算後情報_更正前後.getTkSaishutsuKampuGaku())
                .set普徴歳出還付額(計算後情報_更正前後.getFuSaishutsuKampuGaku()).set月割開始年月1(計算後情報_更正前後.getTsukiwariStartYM1())
                .set月割終了年月1(計算後情報_更正前後.getTsukiwariEndYM1()).set月割開始年月2(計算後情報_更正前後.getTsukiwariStartYM2())
                .set月割終了年月2(計算後情報_更正前後.getTsukiwariEndYM2()).build();

        FukaJohoRelateEntity fukaJohoRelateEntity = new FukaJohoRelateEntity();
        fukaJohoRelateEntity.set介護賦課Entity(fuka.toEntity());
        List<KibetsuEntity> 介護期別RelateEntity = new ArrayList<>();
        for (int index = INT_1; index < INT_7; index++) {
            KibetsuEntity 介護期別Relate = new KibetsuEntity();
            DbT2003KibetsuEntity 介護期別Entity = new DbT2003KibetsuEntity();
            介護期別Entity.setChoteiNendo(計算後情報_更正前後.getChoteiNendo());
            介護期別Entity.setFukaNendo(計算後情報_更正前後.getFukaNendo());
            介護期別Entity.setTsuchishoNo(計算後情報_更正前後.getTsuchishoNo());
            介護期別Entity.setRirekiNo(計算後情報_更正前後.getFukaRirekiNo());
            介護期別Entity.setChoteiId(new Decimal(index));
            介護期別Entity.setChoshuHouhou(ChoshuHohoKibetsu.特別徴収.getコード());
            介護期別Entity.setKi(index);
            List<UrT0705ChoteiKyotsuEntity> 調定共通EntityList = new ArrayList<>();
            UrT0705ChoteiKyotsuEntity 調定共通Entity = new UrT0705ChoteiKyotsuEntity();
            調定共通Entity.setChoteiId(new Decimal(index).longValue());
            調定共通Entity.setChoteigaku(get特徴調定額(計算後情報_更正前後, index));
            調定共通EntityList.add(調定共通Entity);
            介護期別Relate.set介護期別Entity(介護期別Entity);
            介護期別Relate.set調定共通Entity(調定共通EntityList);
            介護期別RelateEntity.add(介護期別Relate);
        }
        for (int index = INT_1; index <= INT_14; index++) {
            KibetsuEntity 介護期別Relate = new KibetsuEntity();
            DbT2003KibetsuEntity 介護期別Entity = new DbT2003KibetsuEntity();
            介護期別Entity.setChoteiNendo(計算後情報_更正前後.getChoteiNendo());
            介護期別Entity.setFukaNendo(計算後情報_更正前後.getFukaNendo());
            介護期別Entity.setTsuchishoNo(計算後情報_更正前後.getTsuchishoNo());
            介護期別Entity.setRirekiNo(計算後情報_更正前後.getFukaRirekiNo());
            介護期別Entity.setChoteiId(new Decimal(index).add(Decimal.TEN));
            介護期別Entity.setChoshuHouhou(ChoshuHohoKibetsu.普通徴収.getコード());
            介護期別Entity.setKi(index);
            List<UrT0705ChoteiKyotsuEntity> 調定共通EntityList = new ArrayList<>();
            UrT0705ChoteiKyotsuEntity 調定共通Entity = new UrT0705ChoteiKyotsuEntity();
            調定共通Entity.setChoteiId(new Decimal(index).add(Decimal.TEN).longValue());
            調定共通Entity.setChoteigaku(get普通調定額(計算後情報_更正前後, index));
            調定共通EntityList.add(調定共通Entity);
            介護期別Relate.set介護期別Entity(介護期別Entity);
            介護期別Relate.set調定共通Entity(調定共通EntityList);
            介護期別RelateEntity.add(介護期別Relate);
        }
        fukaJohoRelateEntity.set介護期別RelateEntity(介護期別RelateEntity);
        FukaJoho 賦課情報 = new FukaJoho(fukaJohoRelateEntity);
        fukaAtena.set賦課情報(賦課情報);
        IKojin 宛名 = ShikibetsuTaishoFactory.createKojin(entity.get宛名());
        fukaAtena.set宛名(宛名);
        return fukaAtena;
    }

    private Decimal get特徴調定額(DbT2015KeisangoJohoEntity entity, int index) throws InvocationTargetException {
        Decimal 特徴調定額 = Decimal.ZERO;
        if (entity == null) {
            return null;
        }
        RStringBuilder sb = new RStringBuilder(定数_特徴方法.toString());
        sb.append(new RString(index).padZeroToLeft(2));
        Class clazz = entity.getClass();
        try {
            Method getMethod = clazz.getDeclaredMethod(sb.toString());
            特徴調定額 = (Decimal) getMethod.invoke(entity);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(HonsanteiTsuchishoIkkatsuHakkoFath.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 特徴調定額;
    }

    private Decimal get普通調定額(DbT2015KeisangoJohoEntity entity, int index) {
        Decimal 普通調定額 = Decimal.ZERO;
        if (entity == null) {
            return null;
        }
        RStringBuilder sb = new RStringBuilder(定数_普徴方法.toString());
        sb.append(new RString(index).padZeroToLeft(2));
        Class clazz = entity.getClass();
        try {
            Method getMethod = clazz.getDeclaredMethod(sb.toString());
            普通調定額 = (Decimal) getMethod.invoke(entity);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(HonsanteiTsuchishoIkkatsuHakkoFath.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 普通調定額;
    }

    private RString editTutishoKyoutuuKoumoku(EditedKariSanteiTsuchiShoKyotsu 編集後仮算定通知書共通情報) {

        if (編集後仮算定通知書共通情報.get編集後口座() == null) {
            return RString.EMPTY;
        }
        RString 金融機関コード = 編集後仮算定通知書共通情報.get編集後口座().get金融機関コード();
        RString 通帳記号 = 編集後仮算定通知書共通情報.get編集後口座().getEdited通帳記号();
        RString 通帳番号 = 編集後仮算定通知書共通情報.get編集後口座().getEdited通帳番号();
        RString 口座名義人漢字 = 編集後仮算定通知書共通情報.get編集後口座().get口座名義人漢字();
        RString 支店コード = 編集後仮算定通知書共通情報.get編集後口座().get支店コード();
        RString 口座番号 = 編集後仮算定通知書共通情報.get編集後口座().get口座番号();
        RString 口座種別 = 編集後仮算定通知書共通情報.get編集後口座().get預金種別略称();
        if (ゆうちょ銀行.equals(金融機関コード.substringReturnAsPossible(INT_0, INT_4))) {
            return 金融機関コード.substringReturnAsPossible(INT_0, INT_4).concat(RString.HALF_SPACE)
                    .concat(通帳記号.substringReturnAsPossible(INT_0, INT_5))
                    .concat(定値_半角ハイフン)
                    .concat(通帳番号.substringReturnAsPossible(INT_0, INT_8))
                    .concat(RString.HALF_SPACE)
                    .concat(口座名義人漢字);
        } else {
            return 金融機関コード.substringReturnAsPossible(INT_0, INT_4).concat(定値_半角ハイフン)
                    .concat(支店コード.substringReturnAsPossible(INT_0, INT_3)).concat(RString.HALF_SPACE)
                    .concat(口座種別.substringReturnAsPossible(INT_0, INT_2)).concat(定値_半角ハイフン)
                    .concat(口座番号.substringReturnAsPossible(INT_0, INT_7)).concat(RString.HALF_SPACE)
                    .concat(口座名義人漢字);
        }
    }

    private YMDHMS get調定日時(YMDHMS 調定日時) {
        if (調定日時 == null) {
            return null;
        }
        return 調定日時;
    }

    /**
     * nullの判断するメソッドです。
     *
     * @param 項目 Object
     * @return boolean 項目がnullの場合、falseを返し
     */
    public boolean isNull(Object 項目) {
        return 項目 == null;
    }

    private void toBodyList(List<RString> bodyList) {
        for (int i = INT_0; i < bodyList.size(); i++) {
            if (bodyList.get(i) == null) {
                bodyList.remove(bodyList.get(i));
                bodyList.add(i, RString.EMPTY);
            }
        }
    }
}