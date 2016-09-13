package jp.co.ndensan.reams.db.dbu.definition.core.zigyouhoukokunenpou;

import java.io.Serializable;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 遷移画面と事業状況報告（年報）補正検索画面は渡す項目Entityクラスです。
 *
 * @reamsid_L DBU-1060-010 lijia
 *
 */
@lombok.Getter
@lombok.Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ZigyouHoukokuNenpouHoseihakouKensakuRelateEntity implements Serializable {

    private static final long serialVersionUID = -2468578993427554952L;

    private RString 行報告年;
    private RString 行集計対象年;
    private RString 行市町村コード;
    private RString 事業報告年報補正表示のコード;
    private RString 画面報告年度;
    private RString 画面集計年度;
    private RString 市町村名称;
    private RString 補正フラグ;
    private RString 保険者コード;
    private RString 選択した市町村コード;

}