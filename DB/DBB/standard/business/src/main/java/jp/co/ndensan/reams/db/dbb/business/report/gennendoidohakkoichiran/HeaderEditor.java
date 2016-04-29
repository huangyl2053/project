/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.business.report.gennendoidohakkoichiran;

import jp.co.ndensan.reams.db.dbb.entity.report.nonyutsuchishohonsanteihakkoichiran.NonyuTsuchIchiranSource;

/**
 * 帳票設計_DBBRP44002_1_保険料納入通知書（本算定現年度異動）発行一覧表 HeaderEditorです。
 *
 * 帳票項目定義は帳票設計_DBBRP43002_2_保険料納入通知書（本算定）発行一覧表と同じです。
 *
 * @reamsid_L DBB-0880-050 zhangrui
 */
public class HeaderEditor implements IHonsanteiGennendoIdoNonyutsuchishoHakkoIchiranEditor {

    @Override
    public NonyuTsuchIchiranSource edit(NonyuTsuchIchiranSource source) {
        return source;
    }

}
