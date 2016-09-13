/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbu.business.report.jigyohokokucompyoshiki26;

import jp.co.ndensan.reams.db.dbu.entity.report.JigyohokokuCompYoshiki26.JigyohokokuCompYoshiki26ReportSource;

/**
 *
 * 介護事業状況報告月報（様式2-6）のEditorです。
 *
 * @reamsid_L DBU-5600-270 guoqilin
 */
public class JigyohokokuCompYoshiki26BodyEditor implements IJigyohokokuCompYoshiki26Editor {

    private final JigyohokokuGeppoYoshiki26BodyData item;

    /**
     * インスタンスを生成します。
     *
     * @param item JigyohokokuGeppoYoshiki26BodyData
     */
    protected JigyohokokuCompYoshiki26BodyEditor(JigyohokokuGeppoYoshiki26BodyData item) {
        this.item = item;
    }

    @Override
    public JigyohokokuCompYoshiki26ReportSource edit(JigyohokokuCompYoshiki26ReportSource source) {
        return editSource(source);
    }

    private JigyohokokuCompYoshiki26ReportSource editSource(JigyohokokuCompYoshiki26ReportSource source) {
        source.list1_1 = item.getListList1_1();
        source.list1_2 = item.getListList1_2();
        source.list1_3 = item.getListList1_3();
        source.list1_4 = item.getListList1_4();
        source.list1_5 = item.getListList1_6();
        source.list1_6 = item.getListList1_6();
        source.list1_7 = item.getListList1_7();
        source.list1_8 = item.getListList1_8();
        source.list1_9 = item.getListList1_9();
        source.list1_10 = item.getListList1_10();
        source.list1_11 = item.getListList1_11();
        source.list1_12 = item.getListList1_12();
        source.list2_1 = item.getListList2_1();
        source.list2_2 = item.getListList2_2();
        source.list2_3 = item.getListList2_3();
        source.list2_4 = item.getListList2_4();
        source.list2_5 = item.getListList2_6();
        source.list2_6 = item.getListList2_6();
        source.list2_7 = item.getListList2_7();
        source.list2_8 = item.getListList2_8();
        source.list2_9 = item.getListList2_9();
        source.list2_10 = item.getListList2_10();
        source.list2_11 = item.getListList2_11();
        source.list2_12 = item.getListList2_12();
        return source;
    }

}