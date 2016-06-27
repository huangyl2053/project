/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.entity.db.relate.publicationshiryoshinsakai;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.uz.uza.biz.AtenaMeisho;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RDateTime;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 委員用概況特記の情報です。
 *
 * @reamsid_L DBE-0150-200 linghuhang
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class SonotaJohoEntity {

    private int shinsakaiOrder;
    private ShinseishoKanriNo shinseishoKanriNo;
    private FlexibleDate shinsakaiKaisaiYMD;
    private AtenaMeisho hihokenshaName;
    private RString hihokenshaNo;
    private RString shoKisaiHokenshaNo;
    private FlexibleDate ninteiShinseiYMD;
    private FlexibleDate ninteichosaJisshiYMD;
    private RDateTime imageSharedFileId;
}
