/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.entity.db.relate.tokuchokarisanteifuka;

import jp.co.ndensan.reams.uz.uza.biz.ReportId;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * バッチ出力帳票一覧Entityクラスです。
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class BatchTokuchoEntity {

    private ReportId 帳票分類ID;
    private RString 帳票ID;
    private RString 出力順ID;

    /**
     * コンストラクタです。
     *
     */
    public BatchTokuchoEntity() {
    }

    /**
     * コンストラクタです。
     *
     * @param 帳票分類ID 帳票分類ID
     * @param 帳票ID 帳票ID
     * @param 出力順ID 出力順ID
     */
    public BatchTokuchoEntity(ReportId 帳票分類ID,
            RString 帳票ID,
            RString 出力順ID) {
        this.帳票分類ID = 帳票分類ID;
        this.帳票ID = 帳票ID;
        this.出力順ID = 出力順ID;
    }
}
