/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.chosahoshumeisai;

import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;
import lombok.Setter;

/**
 * 認定調査報酬支払明細書のBodyクラスです。
 *
 * @reamsid_L DBE-1980-045 suguangjun
 */
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class ChosaHoshumeisaiBody {

    private final RString listChosaSakusei_1;
    private final RString listChosaSakusei_2;
    private final RString listChosaSakusei_3;
    private final RString listChosaSakusei_4;
    private final RString listChosaSakusei_5;
    private final RString listChosaSakusei_6;
    private final RString listChosaSakusei_7;
    private final RString listChosaSakusei_8;
    private final RString listChosaSakusei_9;
    private final RString listChosaSakusei_10;
    private final RString listGokeikensu_1;
    private final RString listGokeikensu_2;
    private final RString listGokeikensu_3;
    private final RString listGokeikensu_4;
    private final RString listGokeiKingaku_1;
    private final RString listGokeiKingaku_2;
    private final RString listGokeiKingaku_3;

    /**
     * コンストラクタです。
     *
     * @param listChosaSakusei_1 明細番号
     * @param listChosaSakusei_2 被保険者番号
     * @param listChosaSakusei_3 被保険者氏名
     * @param listChosaSakusei_4 生年月日
     * @param listChosaSakusei_5 帳票提出日
     * @param listChosaSakusei_6 新規（在宅）
     * @param listChosaSakusei_7 新規（施設）
     * @param listChosaSakusei_8 継続（在宅）
     * @param listChosaSakusei_9 継続（施設）
     * @param listChosaSakusei_10 調査票作成料
     * @param listGokeikensu_1 新規（在宅）件数
     * @param listGokeikensu_2 新規（施設）件数
     * @param listGokeikensu_3 継続（在宅）件数
     * @param listGokeikensu_4 継続（施設）件数
     * @param listGokeiKingaku_1 合計金額
     * @param listGokeiKingaku_2 消費税
     * @param listGokeiKingaku_3 合計請求額
     */
    public ChosaHoshumeisaiBody(RString listChosaSakusei_1,
            RString listChosaSakusei_2,
            RString listChosaSakusei_3,
            RString listChosaSakusei_4,
            RString listChosaSakusei_5,
            RString listChosaSakusei_6,
            RString listChosaSakusei_7,
            RString listChosaSakusei_8,
            RString listChosaSakusei_9,
            RString listChosaSakusei_10,
            RString listGokeikensu_1,
            RString listGokeikensu_2,
            RString listGokeikensu_3,
            RString listGokeikensu_4,
            RString listGokeiKingaku_1,
            RString listGokeiKingaku_2,
            RString listGokeiKingaku_3) {
        this.listChosaSakusei_1 = listChosaSakusei_1;
        this.listChosaSakusei_2 = listChosaSakusei_2;
        this.listChosaSakusei_3 = listChosaSakusei_3;
        this.listChosaSakusei_4 = listChosaSakusei_4;
        this.listChosaSakusei_5 = listChosaSakusei_5;
        this.listChosaSakusei_6 = listChosaSakusei_6;
        this.listChosaSakusei_7 = listChosaSakusei_7;
        this.listChosaSakusei_8 = listChosaSakusei_8;
        this.listChosaSakusei_9 = listChosaSakusei_9;
        this.listChosaSakusei_10 = listChosaSakusei_10;
        this.listGokeikensu_1 = listGokeikensu_1;
        this.listGokeikensu_2 = listGokeikensu_2;
        this.listGokeikensu_3 = listGokeikensu_3;
        this.listGokeikensu_4 = listGokeikensu_4;
        this.listGokeiKingaku_1 = listGokeiKingaku_1;
        this.listGokeiKingaku_2 = listGokeiKingaku_2;
        this.listGokeiKingaku_3 = listGokeiKingaku_3;
    }

}
