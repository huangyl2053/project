package jp.co.ndensan.reams.db.dbe.divcontroller.handler.parentdiv.DBE5120001;

import java.util.ArrayList;
import java.util.List;
import jp.co.ndensan.reams.db.dbe.business.core.gogitaijoho.shinsakaikaisaibashojoho.ShinsakaiKaisaiBashoJoho;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5120001.NinteiShinsakaiKaisaibashoTorokuDiv;
import jp.co.ndensan.reams.db.dbe.divcontroller.entity.parentdiv.DBE5120001.dgKaisaibashoIchiran_Row;
import jp.co.ndensan.reams.ur.urz.divcontroller.entity.commonchilddiv.CodeInput.ICodeInputDiv;
import jp.co.ndensan.reams.uz.uza.biz.Code;
import jp.co.ndensan.reams.uz.uza.biz.CodeShubetsu;
import jp.co.ndensan.reams.uz.uza.biz.SubGyomuCode;
import jp.co.ndensan.reams.uz.uza.biz.TelNo;
import jp.co.ndensan.reams.uz.uza.lang.RString;

/**
 * 介護認定審査会開催場所登録画面でのバリデーションを管理するハンドラークラスです。
 *
 */
public class NinteiShinsakaiKaisaibashoTorokuHandler {

    public static final RString 更新モード = new RString("更新");
    public static final RString 追加モード = new RString("追加");
    public static final RString 削除モード = new RString("削除");
    public static final RString 通常 = new RString("通常");
    public static final RString 削除 = new RString("削除");
    public static final boolean 有効 = true;
    public static final boolean 全て = false;

    private final NinteiShinsakaiKaisaibashoTorokuDiv div;

    /**
     * コンストラクタです。
     *
     * @param div 介護認定審査会開催場所情報Div
     */
    public NinteiShinsakaiKaisaibashoTorokuHandler(NinteiShinsakaiKaisaibashoTorokuDiv div) {
        this.div = div;
    }

    /**
     * コンストラクタです。
     *
     * @param shinsakaiKaisaiBashoJohoList 介護認定審査会開催場所情報ビジネス
     */
    public void set介護認定審査会開催場所一覧(List<ShinsakaiKaisaiBashoJoho> shinsakaiKaisaiBashoJohoList) {
        List<dgKaisaibashoIchiran_Row> rowList = new ArrayList();
        for (ShinsakaiKaisaiBashoJoho shinsakaiKaisaiBashoJoho : shinsakaiKaisaiBashoJohoList) {
            dgKaisaibashoIchiran_Row row = new dgKaisaibashoIchiran_Row(RString.EMPTY,
                    shinsakaiKaisaiBashoJoho.get介護認定審査会開催場所コード(),
                    shinsakaiKaisaiBashoJoho.get介護認定審査会開催場所名称(),
                    shinsakaiKaisaiBashoJoho.get介護認定審査会開催地区コード().value(),
                    shinsakaiKaisaiBashoJoho.get介護認定審査会開催場所住所(),
                    shinsakaiKaisaiBashoJoho.get介護認定審査会開催場所電話番号().value(),
                    RString.EMPTY);
            if (shinsakaiKaisaiBashoJoho.get介護認定審査会開催場所状況()) {
                row.setKaisaibashoJokyo(通常);
            } else {
                row.setKaisaibashoJokyo(削除);
            }
            rowList.add(row);
        }
        div.getDgKaisaibashoIchiran().setDataSource(rowList);
        clear開催場所編集エリア();
        set開催場所編集エリア非活性();
    }

    /**
     * 開催場所の更新処理します。
     *
     */
    public void 開催場所の更新処理() {
        
    }
    
    /**
     * 開催場所編集エリアを設定します。
     *
     */
    public void set開催場所一覧の追加() {
        div.getShinakaiKaisaIbashoShosai().setJyotai(追加モード);
        clear開催場所編集エリア();
        set開催場所編集エリア活性();
    }

    /**
     * 開催場所一覧の削除を設定しました。
     *
     */
    public void set開催場所一覧の削除() {
        List<dgKaisaibashoIchiran_Row> rowList = div.getDgKaisaibashoIchiran().getDataSource();
        dgKaisaibashoIchiran_Row clickedItem = div.getDgKaisaibashoIchiran().getClickedItem();
        if (追加モード.equals(clickedItem.getJyotai())) {
            rowList.remove(div.getDgKaisaibashoIchiran().getClickedRowId());
        } else {
            clickedItem.setJyotai(削除);
            rowList.set(div.getDgKaisaibashoIchiran().getClickedRowId(), clickedItem);
        }
        div.getDgKaisaibashoIchiran().setDataSource(rowList);
    }

    /**
     * 開催場所一覧の参照を設定しました。
     *
     */
    public void set開催場所一覧の参照() {
        dgKaisaibashoIchiran_Row ClickedItem = div.getDgKaisaibashoIchiran().getClickedItem();
        if (!(更新モード.equals(ClickedItem.getJyotai()) || 追加モード.equals(ClickedItem.getJyotai()))) {
            setSelectItem(ClickedItem);
            set開催場所編集エリア非活性();
        }
    }

    /**
     * 新規モード或いは更新モードの場合開催場所編集エリア活性です。
     *
     */
    public void set修正の場合開催場所編集エリア() {
        div.getShinakaiKaisaIbashoShosai().setJyotai(更新モード);
        dgKaisaibashoIchiran_Row ClickedItem = div.getDgKaisaibashoIchiran().getClickedItem();
        setSelectItem(ClickedItem);
        set開催場所編集エリア活性();
    }

    /**
     * 開催場所編集エリア初期化設定します。
     *
     */
    public void set開催場所編集エリアを初期化処理() {
        clear開催場所編集エリア();
        set開催場所編集エリア非活性();
        div.getBtnTsuika().setDisabled(false);
    }

    /**
     * 開催場所一覧の更新を設定します。
     *
     */
    public void 開催場所一覧の更新() {
        List<dgKaisaibashoIchiran_Row> rowList = div.getDgKaisaibashoIchiran().getDataSource();
        dgKaisaibashoIchiran_Row clickedItem = div.getDgKaisaibashoIchiran().getClickedItem();
        int clickedItemId = div.getDgKaisaibashoIchiran().getClickedRowId();
        RString モード = div.getShinakaiKaisaIbashoShosai().getJyotai();
        if (更新モード.equals(モード) && 追加モード.equals(clickedItem.getJyotai())) {
            clickedItem.setJyotai(追加モード);
            setYiChiRanItem(clickedItem);
            rowList.set(clickedItemId, clickedItem);
        } else if (更新モード.equals(モード)
                && (更新モード.equals(clickedItem.getJyotai()) || clickedItem.getJyotai().isEmpty())) {
            clickedItem.setJyotai(更新モード);
            setYiChiRanItem(clickedItem);
            rowList.set(clickedItemId, clickedItem);
        } else if (追加モード.equals(モード)) {
            clickedItem.setJyotai(追加モード);
            dgKaisaibashoIchiran_Row clickedItemNew = new dgKaisaibashoIchiran_Row();
            setYiChiRanItem(clickedItemNew);
            rowList.add(clickedItemNew);
        }
        clickedItem.setJyotai(RString.EMPTY);
        div.getDgKaisaibashoIchiran().setDataSource(rowList);
        clear開催場所編集エリア();
        set開催場所編集エリア非活性();
    }
    
    private void setYiChiRanItem(dgKaisaibashoIchiran_Row clickedItem) {
        clickedItem.setKaisaibashoCode(div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoCode().getValue()); //開催場所コード
        clickedItem.setKaisaibashoMeisho(div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoMeisho().getValue()); //開催場所名称
        clickedItem.setKaisaibashoJusho(div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().getValue()); //開催場所住所
        clickedItem.setKaisaibashoTelNo(div.getShinakaiKaisaIbashoShosai().getTxtTelNumber().getDomain().getColumnValue()); //電話番号
        clickedItem.setKaisaibashoJusho(div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().getValue()); //開催場所住所
        div.getShinakaiKaisaIbashoShosai().getCcdKaisaiChikuCode().getCode(); // 開催地区コード
        div.getShinakaiKaisaIbashoShosai().getCcdKaisaiChikuCode().getCodeMeisho(); // 開催地区内容
        // 開催場所住所状況
        if (div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().getSelectedIndex() == 0) {
            clickedItem.setKaisaibashoJokyo(通常);
        } else if (div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().getSelectedIndex() == 1) {
            clickedItem.setKaisaibashoJokyo(削除);
        }
    }

    private void setSelectItem(dgKaisaibashoIchiran_Row clickedItem) { 
       div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoCode().setValue(clickedItem.getKaisaibashoCode()); //開催場所コード
       div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoMeisho().setValue(clickedItem.getKaisaibashoMeisho()); //開催場所名称
       div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().setValue(clickedItem.getKaisaibashoJusho()); //開催場所住所
       div.getShinakaiKaisaIbashoShosai().getTxtTelNumber().setDomain(new TelNo(clickedItem.getKaisaibashoTelNo())); //電話番号
       div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().setValue(clickedItem.getKaisaibashoJusho()); //開催場所住所
       if (通常.equals(clickedItem.getKaisaibashoJokyo())) {
            div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().setSelectedIndex(0); // 開催場所住所
        } else if (削除.equals(clickedItem.getKaisaibashoJokyo())) {
                div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().setSelectedIndex(1); // 開催場所住所
        }
       get開催地区内容(clickedItem);
    }
    
    private void set開催場所編集エリア非活性() {
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoCode().setReadOnly(true); // 開催場所コード
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoMeisho().setReadOnly(true); // 開催場所名称
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().setReadOnly(true); // 開催場所住所
        div.getShinakaiKaisaIbashoShosai().getTxtTelNumber().setReadOnly(true);  // 電話番号
        div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().setReadOnly(true); // 開催場所住所状況
        div.getShinakaiKaisaIbashoShosai().getBtnback().setDisabled(true);
        div.getShinakaiKaisaIbashoShosai().getBtnupdate().setDisabled(true);
        div.getBtnTsuika().setDisabled(false);
    }

    private void set開催場所編集エリア活性() {
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoCode().setReadOnly(false); // 開催場所コード
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoMeisho().setReadOnly(false); // 開催場所名称
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().setReadOnly(false); // 開催場所住所
        div.getShinakaiKaisaIbashoShosai().getTxtTelNumber().setReadOnly(false); // 電話番号
        div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().setReadOnly(false); // 開催場所住所状況
        div.getShinakaiKaisaIbashoShosai().getBtnback().setDisabled(false);
        div.getShinakaiKaisaIbashoShosai().getBtnupdate().setDisabled(false);
        div.getBtnTsuika().setDisabled(true);
    }

    private void clear開催場所編集エリア() {
        div.getShinakaiKaisaIbashoShosai().setJyotai(RString.EMPTY);
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoCode().clearValue(); // 開催場所コード
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoMeisho().clearValue(); // 開催場所名称
        div.getShinakaiKaisaIbashoShosai().getTxtKaisaibashoJusho().clearValue(); // 開催場所住所
        div.getShinakaiKaisaIbashoShosai().getTxtTelNumber().clearDomain(); // 電話番号
        div.getShinakaiKaisaIbashoShosai().getDdlKaisaiBashoJokyo().setSelectedIndex(0); // 開催場所住所状況
        div.getShinakaiKaisaIbashoShosai().getCcdKaisaiChikuCode().load(new CodeShubetsu("5001"));
        div.getShinakaiKaisaIbashoShosai().getCcdKaisaiChikuCode().clearDisplayedValues();
    }
    
     private void get開催地区内容(dgKaisaibashoIchiran_Row clickedItem) {
        ICodeInputDiv codeInput = div.getShinakaiKaisaIbashoShosai().getCcdKaisaiChikuCode();
        codeInput.load(SubGyomuCode.DBE認定支援, new CodeShubetsu("5001"), new Code(clickedItem.getKaisaiChikuCode()));
    }
}
