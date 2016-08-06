/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.business.report.jigyohokokucompyoshikinenho2111;

import jp.co.ndensan.reams.db.dbu.entity.report.jigyohokokucompyoshikinenho2111.JigyohokokuCompYoshikinenho2111ReportSource;

/**
 * 介護事業状況報告年報（様式2-2）のEditorです。
 *
 * @reamsid_L DBU-5600-200 zhaoran
 */
public class JigyohokokuCompYoshikinenho2111BodyEditor implements IJigyohokokuCompYoshikinenho2111Editor {

    private final JigyohokokuCompYoshikinenho2111BodyData item;

    /**
     * インスタンスを生成します。
     *
     * @param item JigyohokokuCompYoshikinenho2111BodyData
     */
    protected JigyohokokuCompYoshikinenho2111BodyEditor(JigyohokokuCompYoshikinenho2111BodyData item) {
        this.item = item;
    }

    @Override
    public JigyohokokuCompYoshikinenho2111ReportSource edit(JigyohokokuCompYoshikinenho2111ReportSource source) {
        return editSource(source);
    }

    private JigyohokokuCompYoshikinenho2111ReportSource editSource(JigyohokokuCompYoshikinenho2111ReportSource source) {
        source.listList1_1 = item.getListList1_1();
        source.listList1_2 = item.getListList1_2();
        source.listList1_3 = item.getListList1_3();
        source.listList1_4 = item.getListList1_4();
        source.listList1_5 = item.getListList1_5();
        source.listList1_6 = item.getListList1_6();
        source.listList1_7 = item.getListList1_7();
        source.listList1_8 = item.getListList1_8();
        source.listList1_9 = item.getListList1_9();
        source.listList1_10 = item.getListList1_10();
        source.listList1_11 = item.getListList1_11();
        source.listList1_12 = item.getListList1_12();
        return source;
    }
}
