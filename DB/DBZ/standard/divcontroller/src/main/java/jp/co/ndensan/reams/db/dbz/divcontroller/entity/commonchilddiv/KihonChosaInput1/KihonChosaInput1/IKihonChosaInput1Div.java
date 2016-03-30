package jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.KihonChosaInput1.KihonChosaInput1;

import jp.co.ndensan.reams.db.dbx.definition.core.valueobject.domain.ShinseishoKanriNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.ICommonChildDivBaseProperties;
import jp.co.ndensan.reams.uz.uza.ui.binding.IDialogDiv;

/*
 * このコードはツールによって生成されました。
 */
public interface IKihonChosaInput1Div extends ICommonChildDivBaseProperties, IDialogDiv {

    /**
     * 共有子Divの状態を初期化します。
     *
     * @param 申請書管理番号 申請書管理番号
     * @param 認定調査依頼履歴番号 認定調査依頼履歴番号
     */
    void onLoad(ShinseishoKanriNo 申請書管理番号, RString 認定調査依頼履歴番号);
}
