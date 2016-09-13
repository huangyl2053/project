/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.business.report.serviceRiyohyoBeppyo;

import jp.co.ndensan.reams.db.dbc.definition.reportid.ReportIdDBC;
import jp.co.ndensan.reams.db.dbc.entity.report.source.serviceRiyohyoBeppyo.ServiceRiyohyoBeppyoSource;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.report.ReportPropertyBase;

/**
 * 帳票設計_DBC0150011_1_サービス提供票別表Propertyのインターフェースクラスです。
 *
 * @reamsid_L DBC-5100-030 tianshuai
 */
public class ServiceRiyohyoBeppyoProperty extends ReportPropertyBase<ServiceRiyohyoBeppyoSource> {

    /**
     * コンストラクタです。
     */
    public ServiceRiyohyoBeppyoProperty() {
        super(SubGyomuCode.DBC介護給付, ReportIdDBC.DBC100057.getReportId());
    }

}