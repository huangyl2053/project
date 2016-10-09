/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbd.divcontroller.handler.parentdiv.DBD5520001;

import java.util.List;
import jp.co.ndensan.reams.db.dbd.business.core.rirekishusei.RirekiShuseiBusiness;
import jp.co.ndensan.reams.db.dbd.definition.message.DbdErrorMessages;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD5520001.RirekiShuseiDiv;
import jp.co.ndensan.reams.db.dbd.divcontroller.entity.parentdiv.DBD5520001.dgRirekiIchiran_Row;
import jp.co.ndensan.reams.db.dbx.definition.core.jukyusha.ShinseiJokyoKubun;
import jp.co.ndensan.reams.ur.urz.definition.message.UrErrorMessages;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import jp.co.ndensan.reams.uz.uza.message.IMessageGettable;
import jp.co.ndensan.reams.uz.uza.message.IValidationMessage;
import jp.co.ndensan.reams.uz.uza.message.Message;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPair;
import jp.co.ndensan.reams.uz.uza.ui.servlets.ValidationMessageControlPairs;

/**
 * 特殊修正画面のバリデーションハンドラークラスです。
 *
 * @reamsid_L DBD-1330-010 chengsanyuan
 */
public class RirekiShuseiValidationHandler {

    private final RirekiShuseiDiv div;

    private static final RString KU_BUN_追 = new RString("追");
    private static final RString KU_BUN_直 = new RString("直");

    /**
     * コンストラクタです。
     *
     * @param div 特殊修正Div
     */
    public RirekiShuseiValidationHandler(RirekiShuseiDiv div) {
        this.div = div;
    }

    /**
     *
     * 変更レコード無しチェック
     *
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 変更レコード無しチェック() {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        boolean hasFlag = false;
        for (dgRirekiIchiran_Row row : div.getDgRirekiIchiran().getDataSource()) {
            if (!RString.isNullOrEmpty(row.getKubun()) && !KU_BUN_直.equals(row.getKubun())) {
                hasFlag = true;
                break;
            }
        }
        if (!hasFlag) {
            validationMessages.add(new ValidationMessageControlPair(RirekiShuseiMessages.編集なしで更新不可));
            return validationMessages;
        }
        return validationMessages;
    }

    /**
     *
     * 重複チェック
     *
     * @param compareRow 「前に追加する/後に追加する」の追加行
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 重複チェック(dgRirekiIchiran_Row compareRow) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        boolean hasFlag = false;
        int count = 0;
        for (dgRirekiIchiran_Row row : div.getDgRirekiIchiran().getDataSource()) {
            if (compareRow.getNinteiNaiyo().equals(row.getNinteiNaiyo())
                    && compareRow.getDataKubun().equals(row.getDataKubun())
                    && compareRow.getNiteiDay().getValue().compareTo(row.getNiteiDay().getValue()) == 0
                    && compareRow.getYokaigodo().equals(row.getYokaigodo())
                    && compareRow.getYukoKaishi().getValue().compareTo(row.getYukoKaishi().getValue()) == 0
                    && compareRow.getYukoShuryo().getValue().compareTo(row.getYukoShuryo().getValue()) == 0) {
                count = count + 1;
            }
            if (1 < count) {
                hasFlag = true;
                break;
            }
        }
        if (hasFlag) {
            validationMessages.add(new ValidationMessageControlPair(RirekiShuseiMessages.既に登録済, div.getDgRirekiIchiran()));
            return validationMessages;
        }
        return validationMessages;
    }

    /**
     *
     * 申請中のデータが存在
     *
     * @param rstList 受給履歴
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs 申請中のデータが存在(List<RirekiShuseiBusiness> rstList) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        boolean hasFlag = false;
        for (RirekiShuseiBusiness business : rstList) {
            if (ShinseiJokyoKubun.申請中.getコード().equals(business.get受給者台帳().get申請状況区分())) {
                hasFlag = true;
                break;
            }
        }
        if (hasFlag) {
            validationMessages.add(new ValidationMessageControlPair(RirekiShuseiMessages.更新不可_汎用, div.getDgRirekiIchiran()));
        }
        return validationMessages;
    }

    /**
     *
     * データが存在しない
     *
     * @param rstList 受給履歴
     * @return ValidationMessageControlPairs
     */
    public ValidationMessageControlPairs データが存在しない(List<RirekiShuseiBusiness> rstList) {
        ValidationMessageControlPairs validationMessages = new ValidationMessageControlPairs();
        if (rstList.isEmpty()) {
            validationMessages.add(new ValidationMessageControlPair(RirekiShuseiMessages.受給共通_受給者登録なし));
            return validationMessages;
        }
        return validationMessages;
    }

    private static enum RirekiShuseiMessages implements IValidationMessage {

        既に登録済(UrErrorMessages.既に登録済, "認定内容～有効終了"),
        更新不可_汎用(UrErrorMessages.更新不可_汎用, "受給申請中のデータが存在する"),
        受給共通_受給者登録なし(DbdErrorMessages.受給共通_受給者登録なし),
        編集なしで更新不可(UrErrorMessages.編集なしで更新不可);

        private final Message message;

        private RirekiShuseiMessages(IMessageGettable message, String... replaceParam) {
            this.message = message.getMessage().replace(replaceParam);
        }

        @Override
        public Message getMessage() {
            return message;
        }
    }
}
