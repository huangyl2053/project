/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dba.batchcontroller.step.dbamn71001;

import java.util.List;
import jp.co.ndensan.reams.db.dba.definition.processprm.dbamn71001.HihokenshaDaichoUpdateProcessParameter;
import jp.co.ndensan.reams.db.dba.entity.dbamn71001.ShikakuIdoTaishoshaEntity;
import jp.co.ndensan.reams.db.dba.service.dbamn71001.HihokenshaDaichoKoshin;
import jp.co.ndensan.reams.uz.uza.batch.process.SimpleBatchProcessBase;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * ６５歳年齢到達資格異動被保険者台帳更新_バッチ処理クラスです
 */
public class HihokenshaDaichoUpdateProcess extends SimpleBatchProcessBase {
    
    private HihokenshaDaichoUpdateProcessParameter parameter;
    private HihokenshaDaichoKoshin hihokenshaDaichoKoshin;
   
    @Override
    protected void beforeExecute() {
        this.hihokenshaDaichoKoshin = HihokenshaDaichoKoshin.createInstance();
    }

    @Override
    @Transaction
    protected void process() {
        
        List<ShikakuIdoTaishoshaEntity> entityList = (List<ShikakuIdoTaishoshaEntity>) parameter.getShikakuIdoTaishoshaEntityList();
        hihokenshaDaichoKoshin.updHihokenshaDaicho(entityList);
        hihokenshaDaichoKoshin.updNenreitotatsuJoken(parameter.getFlowParam());
    }
    
}
