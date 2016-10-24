/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.divcontroller.controller.commonchilddiv.SeikatsuhogoRireki;

import java.util.List;
import jp.co.ndensan.reams.db.dbz.definition.mybatisprm.seikatsuhogorireki.SeikaatsuhogoDataModel;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuhogoRireki.SeikatsuhogoRirekiDiv;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuhogoRireki.SeikatsuhogoRirekiHandler;
import jp.co.ndensan.reams.db.dbz.divcontroller.entity.commonchilddiv.SeikatsuhogoRireki.dgSeikatsuhogoRireki_Row;
import jp.co.ndensan.reams.uz.uza.core.ui.response.ResponseData;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.ui.binding.RowState;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;
import jp.co.ndensan.reams.uz.uza.util.serialization.DataPassingConverter;

/**
 * 共有子Div生活保護履歴画面のイベントを定義したDivControllerです。
 *
 * @reamsid_L DBZ-4520-010 zhangzhiming
 */
public class SeikatsuhogoRireki {

    private final RString 表示モード_修正 = new RString("修正");
    private final RString 表示モード_新規 = new RString("新規");
    private final RString 表示モード_照会 = new RString("照会");
    private final RString 表示モード_削除 = new RString("削除");

    /**
     * 「生活保護情報を追加する」を押します。
     *
     * @param div 画面情報
     * @return ResponseData<SeikatsuhogoRirekiDiv>
     */
    public ResponseData<SeikatsuhogoRirekiDiv> onbtn_AddRow(SeikatsuhogoRirekiDiv div) {
        getHandler(div).onbtn_HiyuoJi(表示モード_新規);
        return ResponseData.of(div).respond();
    }

    /**
     * 「行の修正」を押します。
     *
     * @param div 画面情報
     * @return ResponseData<SeikatsuhogoRirekiDiv>
     */
    public ResponseData<SeikatsuhogoRirekiDiv> onbtn_Modify(SeikatsuhogoRirekiDiv div) {
        getHandler(div).onbtn_HiyuoJi(表示モード_修正);
        return ResponseData.of(div).respond();
    }

    /**
     * 「行の削除」を押します。
     *
     * @param div 画面情報
     * @return ResponseData<SeikatsuhogoRirekiDiv>
     */
    public ResponseData<SeikatsuhogoRirekiDiv> onbtn_Delete(SeikatsuhogoRirekiDiv div) {
        getHandler(div).onbtn_HiyuoJi(表示モード_削除);
        return ResponseData.of(div).respond();
    }

    /**
     * 「選択アイコン」を押します。
     *
     * @param div 画面情報
     * @return ResponseData<SeikatsuhogoRirekiDiv>
     */
    public ResponseData<SeikatsuhogoRirekiDiv> onbtn_Select(SeikatsuhogoRirekiDiv div) {
        getHandler(div).onbtn_HiyuoJi(表示モード_照会);
        return ResponseData.of(div).respond();
    }

    /**
     * 明細から戻ってきた受給期間情報します。
     *
     * @param div 画面情報
     * @return ResponseData<SeikatsuhogoRirekiDiv>
     */
    public ResponseData<SeikatsuhogoRirekiDiv> onOk_Cancel(SeikatsuhogoRirekiDiv div) {
        ValidationMessageControlPairs validationMessageControlPairs = getHandler(div).validateCheck();
        if (validationMessageControlPairs.iterator().hasNext()) {
            return ResponseData.of(div).addValidationMessages(validationMessageControlPairs).respond();
        }
        SeikaatsuhogoDataModel 判定モデル = DataPassingConverter.deserialize(div.getHdnDataPass(), SeikaatsuhogoDataModel.class);
        List<dgSeikatsuhogoRireki_Row> rowList = div.getDgSeikatsuhogoRireki().getDataSource();
        if (表示モード_新規.equals(判定モデル.get表示モード())) {
            dgSeikatsuhogoRireki_Row dgRow = new dgSeikatsuhogoRireki_Row();
            dgRow.setRowState(RowState.Added);
            dgRow.getTxtJukyushaNo().setValue(判定モデル.get受給者番号());
            dgRow.getTxtKaishiYMD().setValue(判定モデル.get受給開始日());
            dgRow.getTxtHaishiYMD().setValue(判定モデル.get受給廃止日());
            dgRow.setTxtHokenryoDairiNofuKubun(判定モデル.get納付区分());
            dgRow.getTxtHokenryoDairiNofuYM().setValue(判定モデル.get納付年月());
            dgRow.setTxtKyugoshisetsuNyutaishoKubun(判定モデル.get入退所区分());
            dgRow.getTxtKyugoshisetsuNyutaishoYMD().setValue(判定モデル.get入所日());
            dgRow.setTxtFujoShurui(判定モデル.get扶助種類());
            dgRow.setTxtFujoShuruiCode(判定モデル.get扶助種類コード());
            dgRow.setTxtJukyuTeishiKikan(判定モデル.get受給停止期間());
            rowList.add(dgRow);
        } else if (表示モード_削除.equals(判定モデル.get表示モード())) {
            dgSeikatsuhogoRireki_Row dgRow = div.getDgSeikatsuhogoRireki().getSelectedItems().get(0);
            dgRow.setRowState(RowState.Deleted);
        } else if (表示モード_修正.equals(判定モデル.get表示モード())) {
            dgSeikatsuhogoRireki_Row dgRow = div.getDgSeikatsuhogoRireki().getSelectedItems().get(0);
            dgRow.setRowState(RowState.Modified);
            dgRow.getTxtJukyushaNo().setValue(判定モデル.get受給者番号());
            dgRow.getTxtKaishiYMD().setValue(判定モデル.get受給開始日());
            dgRow.getTxtHaishiYMD().setValue(判定モデル.get受給廃止日());
            dgRow.setTxtHokenryoDairiNofuKubun(判定モデル.get納付区分());
            dgRow.getTxtHokenryoDairiNofuYM().setValue(判定モデル.get納付年月());
            dgRow.setTxtKyugoshisetsuNyutaishoKubun(判定モデル.get入退所区分());
            dgRow.getTxtKyugoshisetsuNyutaishoYMD().setValue(判定モデル.get入所日());
            dgRow.setTxtFujoShurui(判定モデル.get扶助種類());
            dgRow.setTxtFujoShuruiCode(判定モデル.get扶助種類コード());
            dgRow.setTxtJukyuTeishiKikan(判定モデル.get受給停止期間());
        }
        return ResponseData.of(div).respond();
    }

    private SeikatsuhogoRirekiHandler getHandler(SeikatsuhogoRirekiDiv div) {
        return new SeikatsuhogoRirekiHandler(div);
    }
}
