/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.createtarget;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * センター送信Csvデータ出力情報ビジネスクラスです。
 *
 * @reamsid_L DBE-1680-010 zhangzhiming
 */
@Setter
@Getter
@SuppressWarnings("PMD.UnusedPrivateField")
public class CenterTransmissionRecord {

    private ApplicationsResultMain csvBusiness;
    private List<ExaminationsPartialResult> 主治医意見書;
    private List<ExaminationsPartialResult> サービスの状況;
    private List<ExaminationsPartialResult> 調査票調査項目;
    private List<ExaminationsPartialResult> 前回調査票調査項目;
    private List<ExaminationsPartialResult> 前回サービスの状況;

    /**
     * @param main {@link ApplicationsResultMain}
     */
    public CenterTransmissionRecord(ApplicationsResultMain main) {
        this.csvBusiness = main;
        this.主治医意見書 = new ArrayList<>();
        this.サービスの状況 = new ArrayList<>();
        this.調査票調査項目 = new ArrayList<>();
        this.前回調査票調査項目 = new ArrayList<>();
        this.前回サービスの状況 = new ArrayList<>();
    }

}
