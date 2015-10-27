/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.NinteiShinseiTorisage;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.db.dbx.definition.core.enumeratedtype.NinteiShinseiKubunShinsei;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShoKisaiHokenshaNo;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;

/**
 * 要介護認定申請取下げ対象者を表すクラスです。
 *
 * @author n8178 城間篤人
 */
public class NinteiShinseiTorisageTaishosha {

    private final ShinseishoKanriNo 申請書管理No;
    private final ShoKisaiHokenshaNo 証記載保険者番号;
    private final HihokenshaNo 被保険者番号;
    private final FlexibleDate 認定申請年月日;
    //TODO n8178 城間篤人
    //今後、独自クラスとして認定申請区分コード_申請時を作成予定。作成後修正を行う 2014年2月末
    private final NinteiShinseiKubunShinsei 認定申請区分コード_申請時;
    private final NinteiShinseiTorisage 認定申請取下げ;

    /**
     * 引数からメンバを受け取るコンストラクタです。
     *
     * @param 申請書管理No 申請書管理No
     * @param 証記載保険者番号 証記載保険者番号
     * @param 被保険者番号 被保険者番号
     * @param 認定申請年月日 認定申請年月日
     * @param 認定申請区分コード_申請時 認定申請区分（申請時）コード
     * @param 認定申請取下げ 認定申請取下げ
     */
    public NinteiShinseiTorisageTaishosha(ShinseishoKanriNo 申請書管理No, ShoKisaiHokenshaNo 証記載保険者番号, HihokenshaNo 被保険者番号,
            FlexibleDate 認定申請年月日, NinteiShinseiKubunShinsei 認定申請区分コード_申請時, NinteiShinseiTorisage 認定申請取下げ) {

        requireNonNull(申請書管理No, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("申請書管理No", getClass().getName()));
        requireNonNull(証記載保険者番号, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("証記載保険者番号", getClass().getName()));
        requireNonNull(被保険者番号, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("被保険者番号", getClass().getName()));
        requireNonNull(認定申請年月日, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("認定申請年月日", getClass().getName()));
        requireNonNull(認定申請区分コード_申請時, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("認定申請区分コード(申請時)", getClass().getName()));
        requireNonNull(認定申請取下げ, UrSystemErrorMessages.引数がnullのため生成不可.getReplacedMessage("認定申請取下げ", getClass().getName()));

        this.申請書管理No = 申請書管理No;
        this.証記載保険者番号 = 証記載保険者番号;
        this.被保険者番号 = 被保険者番号;
        this.認定申請年月日 = 認定申請年月日;
        this.認定申請区分コード_申請時 = 認定申請区分コード_申請時;
        this.認定申請取下げ = 認定申請取下げ;
    }

    /**
     * 申請書管理Noを返します。
     *
     * @return 申請書管理No
     */
    public ShinseishoKanriNo get申請書管理No() {
        return 申請書管理No;
    }

    /**
     * 証記載保険者番号を返します。
     *
     * @return 証記載保険者番号
     */
    public ShoKisaiHokenshaNo get証記載保険者番号() {
        return 証記載保険者番号;
    }

    /**
     * 被保険者番号を返します。
     *
     * @return 被保険者番号
     */
    public HihokenshaNo get被保険者番号() {
        return 被保険者番号;
    }

    /**
     * 認定申請年月日を返します。
     *
     * @return 認定申請年月日
     */
    public FlexibleDate get認定申請年月日() {
        return 認定申請年月日;
    }

    /**
     * 認定申請区分（申請時）コードを返します。
     *
     * @return 認定申請区分（申請時）コード
     */
    public NinteiShinseiKubunShinsei get認定申請区分コード_申請時() {
        return 認定申請区分コード_申請時;
    }

    /**
     * 認定申請取下げの情報を返します。
     *
     * @return 認定申請取下げ
     */
    public NinteiShinseiTorisage get認定申請取下げ() {
        return 認定申請取下げ;
    }
}