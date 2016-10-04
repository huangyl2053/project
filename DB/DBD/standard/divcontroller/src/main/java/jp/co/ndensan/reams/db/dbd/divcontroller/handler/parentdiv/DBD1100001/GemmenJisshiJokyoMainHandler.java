/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD1100001;

import jp.co.ndensan.reams.db.dbd.definition.batchprm.DBD104010.DBD104010_JukyushaGemmenJisshiJokyoParameter;
import jp.co.ndensan.reams.db.dbd.definition.batchprm.JukyushaGenmenJissijokyo.NinteijokyohyoKijyunbiKubun;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD1100001.GemmenJisshiJokyoMainDiv;
import jp.co.ndensan.reams.db.dbz.definition.batchprm.hanyolist.atena.AtenaSelectBatchParameter;
import jp.co.ndensan.reams.uz.uza.batch.parameter.BatchParameterMap;
import jp.co.ndensan.reams.uz.uza.biz.ChikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ChoikiCode;
import jp.co.ndensan.reams.uz.uza.biz.GyoseikuCode;
import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleYear;
import jp.co.ndensan.reams.uz.uza.lang.RDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.lang.RYear;
import jp.co.ndensan.reams.uz.uza.math.Decimal;

/**
 * 受給者減免実施状況のHandlerです。
 *
 * @reamsid_L DBD-3770-010 x_liuwei
 */
public class GemmenJisshiJokyoMainHandler {

    private final GemmenJisshiJokyoMainDiv div;

    /**
     * コンストラクターです。
     *
     * @param div GemmenJisshiJokyoMainDiv
     */
    public GemmenJisshiJokyoMainHandler(GemmenJisshiJokyoMainDiv div) {
        this.div = div;
    }

    /**
     * 出力帳票onChange。
     */
    public void onChange_RadShutsuryokuChohyo() {
        RString key = div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().getSelectedKey();

        if ("1".equals(key.toString())) {
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().clearValue();
            div.getGemmenJisshiJokyoJoken().getRadKijunBi().setDisabled(true);
            div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().setDisabled(true);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(true);
        } else {
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setValue(new Decimal(RDate.getNowDate().getDayValue()));
            div.getGemmenJisshiJokyoJoken().getRadKijunBi().setDisabled(false);
            div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().setDisabled(false);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(false);
        }
    }

    /**
     * 基準年月と基準日onChange。
     */
    public void onChange_RadKijun() {
        RString key = div.getGemmenJisshiJokyoJoken().getRadKijunBi().getSelectedKey();
        if (null != key && "1".equals(key.toString())) {
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(false);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setValue(new Decimal(RDate.getNowDate().getDayValue()));
        } else {
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(true);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().clearValue();
        }
    }

    /**
     * 「条件を保存する」ボタンを押下時、バッチパラメータを保存します。//TODO
     *
     * @return parameter
     */
    public DBD104010_JukyushaGemmenJisshiJokyoParameter onClick_btnBatchParameterSave() {
        DBD104010_JukyushaGemmenJisshiJokyoParameter parameter = new DBD104010_JukyushaGemmenJisshiJokyoParameter();
        parameter.set出力帳票(div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().getSelectedKey());
        parameter.set対象年度(new FlexibleYear(div.getGemmenJisshiJokyoJoken().getTxtTaishoNendo().getDomain().toDateString()));
        if ("1".equals(div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().getSelectedKey().toString())) {
            parameter.set基準日区分(new RString("0"));
        } else {
            RString key = div.getGemmenJisshiJokyoJoken().getRadKijunBi().getSelectedKey();
            if (null != key && "1".equals(key.toString())) {
                parameter.set基準日区分(NinteijokyohyoKijyunbiKubun.基準日.getコード());
            } else {
                parameter.set基準日区分(NinteijokyohyoKijyunbiKubun.基準年月.getコード());
            }
        }
        if ("1".equals(div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().getSelectedKey().toString())) {
            parameter.set基準日(new RString("00"));
        } else {
            RString key = div.getGemmenJisshiJokyoJoken().getRadKijunBi().getSelectedKey();
            if (null != key && "1".equals(key.toString())) {
                parameter.set基準日(new RString(div.getGemmenJisshiJokyoJoken().getTxtKijunBi().getValue().toString()));
            } else {
                parameter.set基準日(new RString("00"));
            }
        }
        if ("1".equals(div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().getSelectedKey().toString())) {
            parameter.set帳票ID(new ReportId("DBD300001_JukyushaGemmenTsukibetsuShinseiNinteiJokyohyoCover"));
        } else {
            parameter.set帳票ID(new ReportId("DBD300002_JukyushaGemmenTsukibetsuNinteishasuJokyohyo"));
        }

        宛名抽出条件保存(parameter);

        return parameter;
    }

    /**
     * 「条件を復元する」ボタンを押下時、バッチパラメータを復元します。
     *
     */
    public void onClick_btnBatchParameterRestore() {
        BatchParameterMap restoreBatchParameterMap = div.getBtnBatchParameterRestore().getRestoreBatchParameterMap();
        RString 出力帳票 = restoreBatchParameterMap.getParameterValue(RString.class, new RString("出力帳票"));
        FlexibleYear 対象年度 = restoreBatchParameterMap.getParameterValue(FlexibleYear.class, new RString("対象年度"));
        RString 基準日区分 = restoreBatchParameterMap.getParameterValue(RString.class, new RString("基準日区分"));
        RString 基準日 = restoreBatchParameterMap.getParameterValue(RString.class, new RString("基準日"));
        ReportId 帳票ID = restoreBatchParameterMap.getParameterValue(ReportId.class, new RString("帳票ID"));
        div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().setSelectedKey(出力帳票);
        div.getGemmenJisshiJokyoJoken().getTxtTaishoNendo().setDomain(new RYear(対象年度.toDateString()));
        if ("1".equals(出力帳票.toString())) {
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().clearValue();
            div.getGemmenJisshiJokyoJoken().getRadKijunBi().setDisabled(true);
            div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().setDisabled(true);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(true);
            div.getGemmenJisshiJokyoJoken().getRadKijunBi().setSelectedKey(new RString("1"));
        } else {
            div.getGemmenJisshiJokyoJoken().getRadKijunBi().setDisabled(false);
            div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().setDisabled(false);
            div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setReadOnly(false);
            if ("1".equals(基準日区分.toString())) {
                div.getGemmenJisshiJokyoJoken().getRadKijunBi().setSelectedKey(new RString("1"));
                div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().clearSelectedItem();
                div.getGemmenJisshiJokyoJoken().getTxtKijunBi().setValue(new Decimal(基準日.toString()));
            } else {
                div.getGemmenJisshiJokyoJoken().getRadKijunBi().clearSelectedItem();
                div.getGemmenJisshiJokyoJoken().getRadKijunNengetsu().setSelectedKey(new RString("2"));
                div.getGemmenJisshiJokyoJoken().getTxtKijunBi().clearValue();
            }

        }
        if (new ReportId("DBD300001_JukyushaGemmenTsukibetsuShinseiNinteiJokyohyoCover").equals(帳票ID)) {
            div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().setSelectedKey(new RString("1"));
        } else {
            div.getGemmenJisshiJokyoJoken().getRadShutsuryokuChohyo().setSelectedKey(new RString("2"));
        }
        宛名抽出条件復元(restoreBatchParameterMap);
    }

    private void 宛名抽出条件保存(DBD104010_JukyushaGemmenJisshiJokyoParameter parameter) {
        AtenaSelectBatchParameter 宛名抽出条件 = div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().get宛名抽出条件();
        parameter.setPsmChushutsu_Kubun(宛名抽出条件.getAgeSelectKijun().getコード());
        parameter.setPsmChushutsuAge_Start(宛名抽出条件.getNenreiRange().getFrom());
        parameter.setPsmChushutsuAge_End(宛名抽出条件.getNenreiRange().getTo());
        parameter.setPsmSeinengappiYMD_Start(宛名抽出条件.getSeinengappiRange().getFrom());
        parameter.setPsmSeinengappiYMD_End(宛名抽出条件.getSeinengappiRange().getTo());
        parameter.setPsmAgeKijunni(宛名抽出条件.getNenreiKijunbi());
        parameter.setPsmChiku_Kubun(宛名抽出条件.getChiku_Kubun().getコード());
        parameter.setPsmJusho_From(宛名抽出条件.getJusho_From());
        parameter.setPsmJusho_From_Name(宛名抽出条件.getJusho_FromMesho());
        parameter.setPsmJusho_To(宛名抽出条件.getJusho_To());
        parameter.setPsmJusho_To_Name(宛名抽出条件.getJusho_ToMesho());
        parameter.setPsmGyoseiku_From(宛名抽出条件.getGyoseiku_From());
        parameter.setPsmGyoseiku_From_Name(宛名抽出条件.getGyoseiku_FromMesho());
        parameter.setPsmGyoseiku_To(宛名抽出条件.getGyoseiku_To());
        parameter.setPsmGyoseiku_To_Name(宛名抽出条件.getGyoseiku_ToMesho());
        parameter.setPsmChiku1_From(宛名抽出条件.getChiku1_From());
        parameter.setPsmChiku1_To(宛名抽出条件.getChiku1_To());
        parameter.setPsmChiku2_From(宛名抽出条件.getChiku2_From());
        parameter.setPsmChiku2_To(宛名抽出条件.getChiku2_To());
        parameter.setPsmChiku3_From(宛名抽出条件.getChiku3_From());
        parameter.setPsmChiku3_To(宛名抽出条件.getChiku3_To());
        parameter.setPsmChiku1_From_Name(宛名抽出条件.getChiku1_FromMesho());
        parameter.setPsmChiku1_To_Name(宛名抽出条件.getChiku1_ToMesho());
        parameter.setPsmChiku2_From_Name(宛名抽出条件.getChiku2_FromMesho());
        parameter.setPsmChiku2_To_Name(宛名抽出条件.getChiku2_ToMesho());
        parameter.setPsmChiku3_From_Name(宛名抽出条件.getChiku3_FromMesho());
        parameter.setPsmChiku3_To_Name(宛名抽出条件.getChiku3_ToMesho());
    }

    private void 宛名抽出条件復元(BatchParameterMap restoreBatchParameterMap) {
        RString 年齢層抽出方法 = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChushutsu_Kubun"));
        div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set年齢層抽出方法(年齢層抽出方法);
        Decimal 宛名抽出年齢開始 = restoreBatchParameterMap.getParameterValue(Decimal.class, new RString("psmChushutsuAge_Start"));
        if (宛名抽出年齢開始 != null) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set年齢開始(宛名抽出年齢開始);
        }
        Decimal 宛名抽出年齢終了 = restoreBatchParameterMap.getParameterValue(Decimal.class, new RString("psmChushutsuAge_End"));
        if (宛名抽出年齢終了 != null) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set年齢終了(宛名抽出年齢終了);
        }
        RDate 宛名抽出生年月日開始 = restoreBatchParameterMap.getParameterValue(RDate.class, new RString("psmSeinengappiYMD_Start"));
        if (宛名抽出生年月日開始 != null) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set生年月日開始(宛名抽出生年月日開始);
        }
        RDate 宛名抽出生年月日終了 = restoreBatchParameterMap.getParameterValue(RDate.class, new RString("psmSeinengappiYMD_End"));
        if (宛名抽出生年月日終了 != null) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set生年月日終了(宛名抽出生年月日終了);
        }
        RDate 年齢基準日 = restoreBatchParameterMap.getParameterValue(RDate.class, new RString("psmAgeKijunni"));
        if (年齢基準日 != null) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set年齢基準日(年齢基準日);
        }
        div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set保険者();
        RString 地区区分 = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku_Kubun"));
        div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区(地区区分);

        RString 町域From = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmJusho_From"));
        if (!RString.isNullOrEmpty(町域From)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set住所開始(new ChoikiCode(町域From));
        }
        RString 町域To = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmJusho_To"));
        if (!RString.isNullOrEmpty(町域To)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set住所終了(new ChoikiCode(町域To));
        }
        RString 行政区From = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmGyoseiku_From"));
        if (!RString.isNullOrEmpty(行政区From)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set行政区開始(new GyoseikuCode(行政区From));
        }
        RString 行政区To = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmGyoseiku_To"));
        if (!RString.isNullOrEmpty(行政区To)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set行政区終了(new GyoseikuCode(行政区To));
        }
        RString 地区１From = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku1_From"));
        if (!RString.isNullOrEmpty(地区１From)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区１開始(new ChikuCode(地区１From));
        }
        RString 地区１To = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku1_To"));
        if (!RString.isNullOrEmpty(地区１To)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区１終了(new ChikuCode(地区１To));
        }
        RString 地区２From = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku2_From"));
        if (!RString.isNullOrEmpty(地区２From)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区２開始(new ChikuCode(地区２From));
        }
        RString 地区２To = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku2_To"));
        if (!RString.isNullOrEmpty(地区２To)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区２終了(new ChikuCode(地区２To));
        }
        RString 地区３From = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku3_From"));
        if (!RString.isNullOrEmpty(地区３From)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区３開始(new ChikuCode(地区３From));
        }
        RString 地区３To = restoreBatchParameterMap.getParameterValue(RString.class, new RString("psmChiku3_To"));
        if (!RString.isNullOrEmpty(地区３To)) {
            div.getGemmenJisshiJokyoJoken().getCcdAtenaJoken().set地区３終了(new ChikuCode(地区３To));
        }
    }
}