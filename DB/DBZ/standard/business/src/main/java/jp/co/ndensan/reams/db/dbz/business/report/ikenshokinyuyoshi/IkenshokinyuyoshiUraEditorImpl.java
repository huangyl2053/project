/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.business.report.ikenshokinyuyoshi;

import jp.co.ndensan.reams.db.dbz.business.core.ikenshokinyuyoshi.IkenshokinyuyoshiBusiness;
import jp.co.ndensan.reams.db.dbz.entity.report.ikenshokinyuyoshi.IkenshokinyuyoshiReportSource;
import jp.co.ndensan.reams.db.dbz.entity.report.saichekkuhyo.Layouts;

/**
 * 要介護認定主治医意見書記入用紙-片面-白黒-裏のEditorです。
 *
 * @reamsid_L DBE-0050-030 xuyannan
 */
public class IkenshokinyuyoshiUraEditorImpl implements IIkenshokinyuyoshiEditor {

    private final IkenshokinyuyoshiBusiness business;

    /**
     * インスタンスを生成します。
     *
     * @param business {@link IkenshokinyuyoshiBusiness}
     */
    protected IkenshokinyuyoshiUraEditorImpl(IkenshokinyuyoshiBusiness business) {
        this.business = business;
    }

    /**
     * 要介護認定主治医意見書記入用紙を編集します。
     *
     * @param source 帳票ソース
     * @return 帳票ソース
     */
    @Override
    public IkenshokinyuyoshiReportSource edit(IkenshokinyuyoshiReportSource source) {
        return editSource(source);
    }

    private IkenshokinyuyoshiReportSource editSource(IkenshokinyuyoshiReportSource source) {
        source.hokenshaNo1 = business.getHokenshaNo1();
        source.hokenshaNo2 = business.getHokenshaNo2();
        source.hokenshaNo3 = business.getHokenshaNo3();
        source.hokenshaNo4 = business.getHokenshaNo4();
        source.hokenshaNo5 = business.getHokenshaNo5();
        source.hokenshaNo6 = business.getHokenshaNo6();
        source.shinseiYMDNo1 = business.getShinseiYY1();
        source.shinseiYMDNo2 = business.getShinseiYY2();
        source.shinseiYMDNo3 = business.getShinseiMM1();
        source.shinseiYMDNo4 = business.getShinseiMM2();
        source.shinseiYMDNo5 = business.getShinseiDD1();
        source.shinseiYMDNo6 = business.getShinseiDD2();
        source.hihokenshaNo1 = business.getHihokenshaNo1();
        source.hihokenshaNo2 = business.getHihokenshaNo2();
        source.hihokenshaNo3 = business.getHihokenshaNo3();
        source.hihokenshaNo4 = business.getHihokenshaNo4();
        source.hihokenshaNo5 = business.getHihokenshaNo5();
        source.hihokenshaNo6 = business.getHihokenshaNo6();
        source.hihokenshaNo7 = business.getHihokenshaNo7();
        source.hihokenshaNo8 = business.getHihokenshaNo8();
        source.hihokenshaNo9 = business.getHihokenshaNo9();
        source.hihokenshaNo10 = business.getHihokenshaNo10();
        source.layout = Layouts.必須;
        return source;
    }

}