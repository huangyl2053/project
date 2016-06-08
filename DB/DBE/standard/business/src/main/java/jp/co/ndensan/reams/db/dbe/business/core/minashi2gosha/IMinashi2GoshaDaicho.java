/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.minashi2gosha;

import jp.co.ndensan.reams.db.dbz.business.core.HihokenshaKubun;
import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.HihokenshaNo;
import jp.co.ndensan.reams.uz.uza.biz.LasdecCode;
import jp.co.ndensan.reams.uz.uza.biz.ShikibetsuCode;
import jp.co.ndensan.reams.uz.uza.biz.YMDHMS;
import jp.co.ndensan.reams.uz.uza.lang.FlexibleDate;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * みなし2号者台帳で管理されることを表すインターフェースです。
 *
 * @author N8211 田辺 紘一
 */
public interface IMinashi2GoshaDaicho {

    /**
     * 市町村コードを返します。
     *
     * @return 市町村コード
     */
    LasdecCode get市町村コード();

    /**
     * 被保番号を返します。
     *
     * @return 被保番号
     */
    HihokenshaNo get被保険者番号();

    /**
     * 識別コードを返します。
     *
     * @return 識別コード
     */
    ShikibetsuCode get識別コード();

    /**
     * 履歴番号を返します。
     *
     * @return 履歴番号
     */
    YMDHMS get処理日時();

    /**
     * 被保険者区分コードを返します。
     *
     * @return 被保険者区分
     */
    HihokenshaKubun get被保険者区分();

    /**
     * みなし2号登録年月日を返します。
     *
     * @return みなし2号登録年月日
     */
    FlexibleDate getみなし2号登録年月日();

    /**
     * みなし2号解除年月日を返します。
     *
     * @return みなし2号解除年月日
     */
    FlexibleDate getみなし2号解除年月日();

    /**
     * 福祉被保険者番号を返します。
     *
     * @return 福祉被保険者番号
     */
    RString get福祉被保険者番号();
}
