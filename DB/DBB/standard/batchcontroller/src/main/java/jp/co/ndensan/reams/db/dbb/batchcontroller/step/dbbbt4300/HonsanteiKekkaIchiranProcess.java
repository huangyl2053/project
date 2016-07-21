/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.batchcontroller.step.dbbbt4300;

import jp.co.ndensan.reams.db.dbb.definition.processprm.dbbbt4300.HonsanteiFukaProcessParameter;
import jp.co.ndensan.reams.db.dbb.service.core.honnsanteifuka.HonnSanteiFuka;
import jp.co.ndensan.reams.uz.uza.batch.process.SimpleBatchProcessBase;

/**
 * 本算定結果一覧表出力のクラスです。
 *
 * @reamsid_L DBB-0730-010 yuanzhenxia
 */
public class HonsanteiKekkaIchiranProcess extends SimpleBatchProcessBase {

    private HonnSanteiFuka business;
    private HonsanteiFukaProcessParameter processParameter;

    @Override
    protected void beforeExecute() {
        business = HonnSanteiFuka.createInstance();
    }

    @Override
    protected void process() {
        business.spoolHonsanteiKekkaIchiran(processParameter.get調定年度(), processParameter.get賦課年度(), processParameter.getバッチ起動時処理日時(),
                Long.parseLong(processParameter.get出力帳票().get出力順ID().toString()));
    }
}
