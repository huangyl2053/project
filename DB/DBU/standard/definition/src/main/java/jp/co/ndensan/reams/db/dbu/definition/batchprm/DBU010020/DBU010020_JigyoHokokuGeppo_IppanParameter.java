/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.definition.batchprm.DBU010020;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.HihokenshaDaichoBirthYMDProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.JigyoHokokuGeppoIppanReportProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.JigyoHokokuGeppoShoriKekkaKakuninListProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.JigyouHoukokuTokeiProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.RiyoshaFutangakuKanriJohoSyoriProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.SyotaiJohoSyoriProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.TokuteiNyushoshaJohoSyoriProcessParameter;
import jp.co.ndensan.reams.db.dbu.definition.processprm.jigyohokokugeppoippan.YokaigoNinteishaJohoSyoriProcessParameter;
import jp.co.ndensan.reams.uz.uza.batch.BatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.flow.BatchParameterBase;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYearMonth;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 事業報告月報_一般状況のパラメータクラスです。
 *
 * @reamsid_L DBU-5530-030 wangxiaodong
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class DBU010020_JigyoHokokuGeppo_IppanParameter extends BatchParameterBase {

    private static final String PRINTCONTROLKBN = "printControlKbn";
    private static final String SYUKEIYM = "syukeiYM";
    private static final String HOKOKUYM = "hokokuYM";
    private static final String NENDO = "nendo";
    private static final String SAKUSEIYMD = "sakuseiYMD";
    private static final String SYORIYMDHMS = "syoriYMDHMS";
    private static final String SHICHOSONCODE = "shichosonCode";
    private static final String KOSEISHICHOSONKBN = "koseiShichosonKbn";
    private static final String KYUSHICHOSONKBN = "kyuShichosonKbn";
    private static final String KOSEISHICHOSONLIST = "koseiShichosonList";
    private static final String KYUSHICHOSONLIST = "kyuShichosonList";
    private static final String KAKOSHUKEISHICHOSONLIST = "kakoShukeiShichosonList";
    private static final String KAKOSHUKEIKYUSHICHOSONKBN = "kakoShukeiKyuShichosonKbn";
    private static final String SYUTURYOKUCSVFILEPATH = "syuturyokuCSVFilePath";
    private static final String BATCHID = "batchID";
    
    private static final RString 市町村分 = new RString ("1");
    private static final RString 構成市町村分 = new RString ("2");
    private static final RString 旧市町村分 = new RString ("3");

    @BatchParameter(key = PRINTCONTROLKBN, name = "プリントコントロール区分")
    private RString printControlKbn;
    @BatchParameter(key = SYUKEIYM, name = "集計年月")
    private FlexibleYearMonth syukeiYM;
    @BatchParameter(key = HOKOKUYM, name = "報告年月")
    private FlexibleYearMonth hokokuYM;
    @BatchParameter(key = NENDO, name = "年度")
    private FlexibleYear nendo;
    @BatchParameter(key = SAKUSEIYMD, name = "作成日付")
    private RString sakuseiYMD;
    @BatchParameter(key = SHICHOSONCODE, name = "市町村コード")
    private RString shichosonCode;
    @BatchParameter(key = KOSEISHICHOSONKBN, name = "構成市町村区分")
    private RString koseiShichosonKbn;
    @BatchParameter(key = KYUSHICHOSONKBN, name = "旧市町村区分")
    private RString kyuShichosonKbn;
    @BatchParameter(key = KOSEISHICHOSONLIST, name = "構成市町村コードリスト")
    private List<RString> koseiShichosonList;
    @BatchParameter(key = KYUSHICHOSONLIST, name = "旧市町村コードリスト")
    private List<RString> kyuShichosonList;
    @BatchParameter(key = KAKOSHUKEISHICHOSONLIST, name = "過去集計分市町村コードリスト")
    private List<RString> kakoShukeiShichosonList;
    @BatchParameter(key = KAKOSHUKEIKYUSHICHOSONKBN, name = "過去集計分旧市町村区分")
    private RString kakoShukeiKyuShichosonKbn;
    @BatchParameter(key = SYUTURYOKUCSVFILEPATH, name = "出力CSVファイルPath")
    private RString csvFilePath;
    @BatchParameter(key = BATCHID, name = "バッチID")
    private RString batchID;
    @BatchParameter(key = SYORIYMDHMS, name = "処理日時")
    private YMDHMS syoriYMDHMS;

    /**
     * コンストラクタです。
     */
    public DBU010020_JigyoHokokuGeppo_IppanParameter() {

    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return SyotaiJohoSyoriProcessParameter
     */
    public SyotaiJohoSyoriProcessParameter toSyotaiJohoSyoriProcessParameter() {
        return new SyotaiJohoSyoriProcessParameter(syukeiYM, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return HihokenshaDaichoBirthYMDProcessParameter
     */
    public HihokenshaDaichoBirthYMDProcessParameter toHihokenshaDaichoBirthYMDProcessParameter() {
        return new HihokenshaDaichoBirthYMDProcessParameter(syoriYMDHMS, syukeiYM, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return RiyoshaFutangakuKanriJohoSyoriProcessParameter
     */
    public RiyoshaFutangakuKanriJohoSyoriProcessParameter toRiyoshaFutangakuKanriJohoSyoriProcessParameter() {
        return new RiyoshaFutangakuKanriJohoSyoriProcessParameter(syukeiYM, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return TokuteiNyushoshaJohoSyoriProcessParameter
     */
    public TokuteiNyushoshaJohoSyoriProcessParameter toTokuteiNyushoshaJohoSyoriProcessParameter() {
        return new TokuteiNyushoshaJohoSyoriProcessParameter(syukeiYM, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return TokuteiNyushoshaJohoSyoriProcessParameter
     */
    public YokaigoNinteishaJohoSyoriProcessParameter toYokaigoNinteishaJohoSyoriProcessParameter() {
        return new YokaigoNinteishaJohoSyoriProcessParameter(syukeiYM, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return JigyouHoukokuTokeiProcessParameter
     */
    public JigyouHoukokuTokeiProcessParameter toJigyouHoukokuTokeiProcessParameter() {
        return new JigyouHoukokuTokeiProcessParameter(hokokuYM, syukeiYM, nendo, shichosonCode.concat(市町村分),
                addCode_kosei(koseiShichosonList), koseiShichosonKbn, addCode_kyu(kyuShichosonList), kyuShichosonKbn, syoriYMDHMS, csvFilePath);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return JigyoHokokuGeppoIppanReportProcessParameter
     */
    public JigyoHokokuGeppoIppanReportProcessParameter toJigyoHokokuGeppoIppanReportProcessParameter() {
        return new JigyoHokokuGeppoIppanReportProcessParameter(syukeiYM, kakoShukeiShichosonList,
                shichosonCode.concat(市町村分), printControlKbn, syoriYMDHMS, kakoShukeiKyuShichosonKbn);
    }

    /**
     * Process用のパラメータを生成します。
     *
     * @return JigyoHokokuGeppoShoriKekkaKakuninListProcessParameter
     */
    public JigyoHokokuGeppoShoriKekkaKakuninListProcessParameter toJigyoHokokuGeppoShoriKekkaKakuninListProcessParameter() {
        return new JigyoHokokuGeppoShoriKekkaKakuninListProcessParameter(batchID, kakoShukeiKyuShichosonKbn,
                koseiShichosonKbn, kyuShichosonKbn, syukeiYM, addCode_kosei(koseiShichosonList), addCode_kyu(kyuShichosonList), syoriYMDHMS);
    }

    private List<RString> addCode_kosei(List<RString> コードリスト) {
        List<RString> codelist = new ArrayList();
        if (コードリスト.isEmpty()) {
            return コードリスト;
        }
        for (RString code : コードリスト) {
            if (!RString.isNullOrEmpty(code)) {
                codelist.add(code.concat(構成市町村分));
            } else {
                codelist.add(code);
            }
        }
        return codelist;
    }

    private List<RString> addCode_kyu(List<RString> コードリスト) {
        List<RString> codelist = new ArrayList();
        if (コードリスト.isEmpty()) {
            return コードリスト;
        }
        for (RString code : コードリスト) {
            if (!RString.isNullOrEmpty(code)) {
                codelist.add(code.concat(旧市町村分));
            } else {
                codelist.add(code);
            }
        }
        return codelist;
    }
}
