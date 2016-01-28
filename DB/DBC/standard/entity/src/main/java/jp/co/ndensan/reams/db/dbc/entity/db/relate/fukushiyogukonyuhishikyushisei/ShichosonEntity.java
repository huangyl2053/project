/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbc.entity.db.relate.fukushiyogukonyuhishikyushisei;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 市町村entity
 *
 * @author GC 張鋭
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ShichosonEntity {

    private ShoKisaiHokenshaNo 証記載保険者番号;
    private RString 市町村名称;
}
