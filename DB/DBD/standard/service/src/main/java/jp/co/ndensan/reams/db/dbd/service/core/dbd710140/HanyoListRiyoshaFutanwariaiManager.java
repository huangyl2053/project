/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.service.core.dbd710140;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.dbd710140.HanyoListRiyoshaFutanwariaiBusiness;
import jp.co.ndensan.reams.db.dbd.business.report.HanyoListRiyoshaFutanwariaiOrderby;
import jp.co.ndensan.reams.db.dbd.definition.processprm.dbd710140.HanyoListRiyoshaFutanwariaiProcessParameter;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.hanyorisutoriyoshafutanwariai.HanyoRisutoRiyoshaFutanWariaiEntity;
import jp.co.ndensan.reams.db.dbd.entity.db.relate.hanyorisutoriyoshafutanwariai.HanyoRisutoRiyoshaFutanWariaiEucCsvEntity;
import jp.co.ndensan.reams.db.dbx.business.core.hokenshalist.HokenshaList;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.Outputs;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.Chiku;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.NenreiSoChushutsuHoho;
import jp.co.ndensan.reams.db.dbz.entity.db.relate.hanyolist.HanyoListEntity;
import jp.co.ndensan.reams.ur.urz.business.core.association.Association;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.IOutputOrder;
import jp.co.ndensan.reams.ur.urz.business.core.reportoutputorder.ISetSortItem;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.EucFileOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.business.report.outputjokenhyo.ReportOutputJokenhyoItem;
import jp.co.ndensan.reams.ur.urz.service.core.association.AssociationFinderFactory;
import jp.co.ndensan.reams.ur.urz.service.core.association.IAssociationFinder;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.EucFileOutputJokenhyoFactory;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.IReportOutputJokenhyoPrinter;
import jp.co.ndensan.reams.ur.urz.service.report.outputjokenhyo.OutputJokenhyoFactory;
import jp.co.ndensan.reams.uz.uza.batch.batchexecutor.util.JobContextHolder;
import jp.co.ndensan.reams.uz.uza.biz.AtenaBanchi;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.GyoseikuCode;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.SetaiCode;
import jp.co.ndensan.reams.uz.uza.biz.YubinNo;
import jp.co.ndensan.reams.uz.uza.lang.EraType;
import jp.co.ndensan.reams.uz.uza.lang.FillType;
import jp.co.ndensan.reams.uz.uza.lang.FirstYear;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RStringBuilder;
import jp.co.ndensan.reams.uz.uza.lang.Separator;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 汎用リスト出力(利用者負担割合)_ＣＳＶ編集クラスです。
 *
 * @reamsid_L DBD-5810-030 panxiaobo
 */
public class HanyoListRiyoshaFutanwariaiManager {

    private static final RString CYUSYUTSUTAISYOSHA = new RString("【抽出対象者】");
    private static final RString HOKENSHA = new RString("保険者：");
    private static final RString NENDO = new RString("年度：");
    private static final RString KIZYUNNICHI = new RString("基準日：");
    private static final RString NENLEIKIZYUNNICHI = new RString("年齢基準日:");
    private static final RString CHOKINNOMI = new RString("対象データ：直近のみ");
    private static final RString FUTANWARIAIKUBUN = new RString("負担割合区分：");
    private static final RString FUTANWARIAI_1_2 = new RString("１割・２割");
    private static final RString FUTANWARIAI_1 = new RString("１割");
    private static final RString FUTANWARIAI_2 = new RString("２割");
    private static final RString CHIKI_1 = new RString("地区１");
    private static final RString CHIKI_2 = new RString("地区２");
    private static final RString CHIKI_3 = new RString("地区３");
    private static final RString GYOSEIKU = new RString("行政区");
    private static final RString JUSYO = new RString("住所");
    private static final RString NENLEI = new RString("年齢");
    private static final RString SEINENGAPPI = new RString("生年月日");
    private static final RString SAI = new RString("歳");
    private static final RString SPACE = new RString(" ");
    private static final RString COMMA = new RString(",");
    private static final RString COLON = new RString(":");
    private static final RString カラ = new RString("～");
    private static final RString 左記号 = new RString("(");
    private static final RString 右記号 = new RString(")");
    private static final int NO_0 = 0;
    private static final int NO_1 = 1;
    private static final int NO_2 = 2;
    private static final int NO_3 = 3;
    private static final int NO_4 = 4;

    /**
     * HanyoListRiyoshaFutanwariaiManagerのインスタンス化
     *
     * @return HanyoListRiyoshaFutanwariaiManager
     */
    public static HanyoListRiyoshaFutanwariaiManager createInstance() {
        return InstanceProvider.create(HanyoListRiyoshaFutanwariaiManager.class);
    }

    /**
     * 連番ありCSV情報設定
     *
     * @param eucCsvEntity CSV情報設定情報
     * @param entity SQL取得結果情報
     * @param 地方公共団体情報 地方公共団体情報
     * @param 保険者リスト 保険者リスト
     * @param 日付スラッシュ付加 日付スラッシュ付加
     */
    public void get情報設定(HanyoRisutoRiyoshaFutanWariaiEucCsvEntity eucCsvEntity, HanyoRisutoRiyoshaFutanWariaiEntity entity,
            Association 地方公共団体情報, HokenshaList 保険者リスト, boolean 日付スラッシュ付加) {
        HanyoListRiyoshaFutanwariaiBusiness bus = new HanyoListRiyoshaFutanwariaiBusiness();
        bus.setEucCsvEntity(地方公共団体情報, 日付スラッシュ付加, eucCsvEntity, entity, 保険者リスト);
    }

    /**
     * ＣＳＶ情報
     *
     * @return eucCsvEntity eucCsvEntity
     */
    public HanyoRisutoRiyoshaFutanWariaiEucCsvEntity setBlank() {
        HanyoListRiyoshaFutanwariaiBusiness bus = new HanyoListRiyoshaFutanwariaiBusiness();
        return bus.setNewBlank();
    }

    /**
     * ＣＳＶ情報
     *
     * @param entity entity
     * @param hanyolistentity hanyolistentity
     *
     */
    public void get方法(HanyoRisutoRiyoshaFutanWariaiEntity entity, HanyoListEntity hanyolistentity) {
        ChoikiCode 町域コード = entity.getPsmEntity().getChoikiCode();
        YubinNo 郵便番号 = entity.getPsmEntity().getYubinNo();
        AtenaBanchi 番地コード = entity.getPsmEntity().getBanchi();
        GyoseikuCode 行政区コード = entity.getPsmEntity().getGyoseikuCode();
        ChikuCode 地区１ = entity.getPsmEntity().getChikuCode1();
        ChikuCode 地区２ = entity.getPsmEntity().getChikuCode2();
        SetaiCode 世帯コード = entity.getPsmEntity().getSetaiCode();
        hanyolistentity.set郵便番号(郵便番号 != null ? 郵便番号.getYubinNo() : RString.EMPTY);
        hanyolistentity.set町域コード(町域コード != null ? 町域コード.getColumnValue() : RString.EMPTY);
        hanyolistentity.set番地コード(番地コード != null ? 番地コード.getColumnValue() : RString.EMPTY);
        hanyolistentity.set行政区コード(行政区コード != null ? 行政区コード.getColumnValue() : RString.EMPTY);
        hanyolistentity.set地区１(地区１ != null ? 地区１.getColumnValue() : RString.EMPTY);
        hanyolistentity.set地区２(地区２ != null ? 地区２.getColumnValue() : RString.EMPTY);
        hanyolistentity.set世帯コード(世帯コード != null ? 世帯コード.getColumnValue() : RString.EMPTY);
        hanyolistentity.set識別コード(entity.get被保険者台帳管理_識別コード());
        hanyolistentity.set氏名５０音カナ(entity.getPsmEntity().getKanaName());
        hanyolistentity.set生年月日(entity.getPsmEntity().getSeinengappiYMD());
        hanyolistentity.set性別(entity.getPsmEntity().getSeibetsuCode());
        hanyolistentity.set市町村コード(entity.get被保険者台帳管理_市町村コード());
        hanyolistentity.set被保険者番号(entity.get被保険者台帳管理_被保険者番号());
        hanyolistentity.set資格区分(entity.get利用者負担割合明細_資格区分());
        hanyolistentity.set認定開始日(entity.get利用者負担割合明細_有効開始日());
        hanyolistentity.set資格取得日(entity.get被保険者台帳管理_資格取得年月日());
        hanyolistentity.set資格喪失日(entity.get被保険者台帳管理_資格喪失年月日());
    }

    /**
     * 改頁Key
     *
     * @param outputOrder outputOrder
     * @param pageBreakKeys pageBreakKeys
     *
     *
     */
    public void set改頁Key(IOutputOrder outputOrder, List<RString> pageBreakKeys) {
        RString 改頁１ = RString.EMPTY;
        RString 改頁２ = RString.EMPTY;
        RString 改頁３ = RString.EMPTY;
        RString 改頁４ = RString.EMPTY;
        RString 改頁５ = RString.EMPTY;
        if (outputOrder != null) {
            List<ISetSortItem> list = outputOrder.get設定項目リスト();
            if (list == null) {
                list = new ArrayList<>();
            }
            if (list.size() > NO_0 && list.get(NO_0).is改頁項目()) {
                改頁１ = to帳票物理名(list.get(NO_0).get項目ID());
            }
            if (list.size() > NO_1 && list.get(NO_1).is改頁項目()) {
                改頁２ = to帳票物理名(list.get(NO_1).get項目ID());
            }
            if (list.size() > NO_2 && list.get(NO_2).is改頁項目()) {
                改頁３ = to帳票物理名(list.get(NO_2).get項目ID());
            }
            if (list.size() > NO_3 && list.get(NO_3).is改頁項目()) {
                改頁４ = to帳票物理名(list.get(NO_3).get項目ID());
            }
            if (list.size() > NO_4 && list.get(NO_4).is改頁項目()) {
                改頁５ = to帳票物理名(list.get(NO_4).get項目ID());
            }

            if (!改頁１.isEmpty()) {
                pageBreakKeys.add(改頁１);
            }
            if (!改頁２.isEmpty()) {
                pageBreakKeys.add(改頁２);
            }
            if (!改頁３.isEmpty()) {
                pageBreakKeys.add(改頁３);
            }
            if (!改頁４.isEmpty()) {
                pageBreakKeys.add(改頁４);
            }
            if (!改頁５.isEmpty()) {
                pageBreakKeys.add(改頁５);
            }
        }
    }

    /**
     * バッチ出力条件リストの出力
     *
     * @param processParamter processParamter
     * @param 導入団体コード 導入団体コード
     * @param 市町村名 市町村名
     * @param 帳票出力 帳票出力
     * @param 出力ページ数 出力ページ数
     * @param 出力件数 出力件数
     *
     *
     */
    public void バッチ出力条件リストの出力(HanyoListRiyoshaFutanwariaiProcessParameter processParamter,
            RString 導入団体コード, RString 市町村名, boolean 帳票出力, RString 出力ページ数, RString 出力件数) {
        RString 日本語ファイル名 = new RString("汎用リスト　利用者負担割合CSV");
        RString 英数字ファイル名 = new RString("HanyoList_RiyosyaFutanwariai.csv");
        RString ジョブ番号 = new RString(String.valueOf(JobContextHolder.getJobId()));
        List<RString> 出力条件 = new ArrayList<>();
        出力条件.add(CYUSYUTSUTAISYOSHA);
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getShichoson_Code()
                && !processParamter.getAtenacyusyutsujyoken().getShichoson_Code().equals(LasdecCode.EMPTY)) {
            builder.append(HOKENSHA);
            Association 地方公共団体 = get地方公共団体(processParamter.getAtenacyusyutsujyoken().getShichoson_Code());
            builder.append(地方公共団体.get市町村名());
            builder.append(COMMA);
        }
        if (null != processParamter.getNendo()) {
            builder.append(NENDO);
            builder.append(processParamter.getNendo().wareki().eraType(EraType.KANJI).toDateString());
            builder.append(COMMA);
        }
        if (null != processParamter.getKizyunnichi()) {
            builder.append(KIZYUNNICHI);
            builder.append(processParamter.getKizyunnichi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(COMMA);
        }
        if (processParamter.isNendochokindatacyusyutsu()) {
            builder.append(CHOKINNOMI);
            builder.append(COMMA);
        }
        if (builder.toRString() != null && !builder.toRString().isEmpty()) {
            List<RString> builderList = builder.toRString().substring(0, builder.toRString().length() - 1).split(COMMA.toString());
            for (RString build : builderList) {
                出力条件.add(build);
            }
        }
        RString 事業対象者負担情報 = get事業対象者負担情報(processParamter);
        if (事業対象者負担情報 != null && 事業対象者負担情報.isEmpty()) {
            出力条件.add(事業対象者負担情報);
        }
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun()) {
            RString get宛名抽出区分情報 = get宛名抽出区分情報(processParamter);
            if (get宛名抽出区分情報 != null && !get宛名抽出区分情報.isEmpty()) {
                出力条件.add(get宛名抽出区分情報(processParamter));
            }
        }
        if (null != processParamter.getAtenacyusyutsujyoken()
                && null != processParamter.getAtenacyusyutsujyoken().getChiku_Kubun()) {
            RString get地区区分情報 = get地区選択区分情報(processParamter);
            if (get地区区分情報 != null && !get地区区分情報.isEmpty()) {
                List<RString> 地区区分情報 = get地区区分情報.substring(0, get地区区分情報.length() - 1).split(COMMA.toString());
                for (RString 情報 : 地区区分情報) {
                    出力条件.add(情報);
                }
            }
        }
        バッチ出力条件表出力(processParamter, 導入団体コード, 市町村名, 出力ページ数, 出力件数,
                日本語ファイル名, 英数字ファイル名, ジョブ番号, 出力条件, 帳票出力);
    }

    private void バッチ出力条件表出力(HanyoListRiyoshaFutanwariaiProcessParameter processParamter, RString 導入団体コード,
            RString 市町村名, RString 出力ページ数, RString 出力件数, RString 日本語ファイル名,
            RString 英数字ファイル名, RString ジョブ番号, List<RString> 出力条件, boolean is帳票出力) {
        if (is帳票出力) {
            RString csv出力有無;
            RString csvファイル名;
            if (processParamter.getSyutsuryoku().equals(Outputs.帳票_CSV出力.getコード())) {
                csv出力有無 = new RString("あり");
                csvファイル名 = 英数字ファイル名;
            } else {
                csv出力有無 = new RString("なし");
                csvファイル名 = RString.EMPTY;
            }
            ReportOutputJokenhyoItem reportOutputJokenhyoItem = new ReportOutputJokenhyoItem(
                    new RString("DBD701014"),
                    導入団体コード,
                    市町村名,
                    ジョブ番号,
                    processParamter.getHyoudai(),
                    出力ページ数,
                    csv出力有無,
                    csvファイル名,
                    出力条件);
            IReportOutputJokenhyoPrinter printer = OutputJokenhyoFactory.createInstance(reportOutputJokenhyoItem);
            printer.print();
        } else if (processParamter.getSyutsuryoku().equals(Outputs.CSVのみ出力.getコード())) {
            EucFileOutputJokenhyoItem item = new EucFileOutputJokenhyoItem(
                    日本語ファイル名,
                    導入団体コード,
                    市町村名,
                    ジョブ番号,
                    英数字ファイル名,
                    new RString("DBD701014"),
                    出力件数,
                    出力条件);
            EucFileOutputJokenhyoFactory.createInstance(item).print();
        }
    }

    private RString get地区区間出力条件(RString codeFrom, RString fromMesho, RString codeTo, RString toMesho) {
        RStringBuilder builder = new RStringBuilder();
        if (!RString.isNullOrEmpty(codeFrom)) {
            builder.append(左記号);
            builder.append(codeFrom);
            builder.append(右記号);
            builder.append(SPACE);
            builder.append(fromMesho);
            builder.append(SPACE);
        }
        builder.append(カラ);
        if (!RString.isNullOrEmpty(codeTo)) {
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(codeTo);
            builder.append(右記号);
            builder.append(SPACE);
            builder.append(toMesho);
        }
        return builder.toRString();
    }

    private RString get宛名抽出区分情報(HanyoListRiyoshaFutanwariaiProcessParameter processParamter) {
        RStringBuilder builder = new RStringBuilder();
        if (NenreiSoChushutsuHoho.年齢範囲.equals(processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun())
                && processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi() != null) {
            builder = get年齢(processParamter);
        } else if (NenreiSoChushutsuHoho.生年月日範囲.equals(processParamter.getAtenacyusyutsujyoken().getAgeSelectKijun())) {
            builder = get生年月日(processParamter);
        }
        return builder.toRString();
    }

    private RString get地区選択区分情報(HanyoListRiyoshaFutanwariaiProcessParameter processParamter) {
        RStringBuilder builder = new RStringBuilder();
        if (Chiku.地区.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku1_From())
                    && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku1_To())) {
                builder.append(CHIKI_1);
                builder.append(COLON);
                builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getChiku1_From(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_FromMesho(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_To(),
                        processParamter.getAtenacyusyutsujyoken().getChiku1_ToMesho()));
            } else if (!RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku2_From())
                    && RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku2_To())) {
                builder.append(CHIKI_2);
                builder.append(COLON);
                builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getChiku2_From(),
                        processParamter.getAtenacyusyutsujyoken().getChiku2_FromMesho(),
                        RString.EMPTY,
                        RString.EMPTY));
            } else if (RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku3_From())
                    && !RString.isNullOrEmpty(processParamter.getAtenacyusyutsujyoken().getChiku3_To())) {
                builder.append(CHIKI_3);
                builder.append(COLON);
                builder.append(get地区区間出力条件(RString.EMPTY,
                        RString.EMPTY,
                        processParamter.getAtenacyusyutsujyoken().getChiku3_To(),
                        processParamter.getAtenacyusyutsujyoken().getChiku3_ToMesho()));
            }
        } else if (Chiku.行政区.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            builder.append(GYOSEIKU);
            builder.append(COLON);
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getGyoseiku_From(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_To(),
                    processParamter.getAtenacyusyutsujyoken().getGyoseiku_ToMesho()));
        } else if (Chiku.住所.equals(processParamter.getAtenacyusyutsujyoken().getChiku_Kubun())) {
            builder.append(JUSYO);
            builder.append(COLON);
            builder.append(get地区区間出力条件(processParamter.getAtenacyusyutsujyoken().getJusho_From(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_FromMesho(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_To(),
                    processParamter.getAtenacyusyutsujyoken().getJusho_ToMesho()));
        }
        return builder.toRString();
    }

    private RString get事業対象者負担情報(HanyoListRiyoshaFutanwariaiProcessParameter processParamter) {
        RStringBuilder builder = new RStringBuilder();
        if (processParamter.isJigyotaishoshafutanichiwari() && processParamter.isJigyotaishoshafutanniwari()) {
            builder.append(FUTANWARIAIKUBUN);
            builder.append(FUTANWARIAI_1_2);
        } else if (processParamter.isJigyotaishoshafutanichiwari()) {
            builder.append(FUTANWARIAIKUBUN);
            builder.append(FUTANWARIAI_1);
        } else if (processParamter.isJigyotaishoshafutanniwari()) {
            builder.append(FUTANWARIAIKUBUN);
            builder.append(FUTANWARIAI_2);
        }
        return builder.toRString();
    }

    private RStringBuilder get年齢(HanyoListRiyoshaFutanwariaiProcessParameter processParamter) {
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null == processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getNenreiRange()
                && null == processParamter.getAtenacyusyutsujyoken().getNenreiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo()) {
            builder.append(NENLEI);
            builder.append(SPACE);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(new RString(processParamter.getAtenacyusyutsujyoken().getNenreiRange().getTo().toString()));
            builder.append(SAI);
            builder.append(SPACE);
            builder.append(左記号);
            builder.append(NENLEIKIZYUNNICHI);
            builder.append(processParamter.getAtenacyusyutsujyoken().getNenreiKijunbi().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(右記号);
        }
        return builder;
    }

    private RStringBuilder get生年月日(HanyoListRiyoshaFutanwariaiProcessParameter processParamter) {
        RStringBuilder builder = new RStringBuilder();
        if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
        } else if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null == processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
            builder.append(SPACE);
            builder.append(カラ);
        } else if (null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange()
                && null == processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getFrom()
                && null != processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo()) {
            builder.append(SEINENGAPPI);
            builder.append(COLON);
            builder.append(SPACE);
            builder.append(カラ);
            builder.append(SPACE);
            builder.append(processParamter.getAtenacyusyutsujyoken().getSeinengappiRange().getTo().wareki().eraType(EraType.KANJI)
                    .firstYear(FirstYear.GAN_NEN).separator(Separator.JAPANESE).fillType(FillType.ZERO).toDateString());
        }
        return builder;
    }

    private Association get地方公共団体(LasdecCode 市町村コード) {
        IAssociationFinder finder = AssociationFinderFactory.createInstance();
        return finder.getAssociation(市町村コード);
    }

    private RString to帳票物理名(RString 項目ID) {
        RString 帳票物理名 = RString.EMPTY;
        if (HanyoListRiyoshaFutanwariaiOrderby.郵便番号.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("yubinNo");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.町域コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("choikiCode");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.番地コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("banchi");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.行政区コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("gyoseikuCode");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.地区１.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("chikuCode1");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.地区２.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("chikuCode2");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.世帯コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("setaiCode");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.識別コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("shikibetsuCode");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.氏名５０音カナ.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("kanaShimei");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.生年月日.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("seinengappiYMD");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.性別.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("seibetsuCode");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.市町村コード.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("shichosonCode1");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.被保険者番号.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("hokenshaNo");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.資格区分.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("shikakuKubun");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.認定開始日.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("ninteiKaishiYMD");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.資格取得日.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("shikakuShutokuYMD");
        } else if (HanyoListRiyoshaFutanwariaiOrderby.資格喪失日.get項目ID().equals(項目ID)) {
            帳票物理名 = new RString("shikakuSoshitsuYMD");
        }
        return 帳票物理名;
    }
}
