/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.definition.mybatisprm.hakkoichiranhyo;

import java.util.List;
import jp.co.ndensan.reams.uz.uza.batch.parameter.IMyBatisParameter;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import lombok.Getter;

/**
 * 認定調査依頼発行一覧表ですためのMyBatis用パラメータクラスです。
 */
@SuppressWarnings("PMD.UnusedPrivateField")
@Getter
public class ShujiiIkenshoSakuseiMybitisParamter implements IMyBatisParameter {

    private static final RString 未印刷 = new RString("1");
    private static final RString 印刷済 = new RString("2");
    private final RString 依頼日From;
    private final RString 依頼日To;
    private final RString 保険者番号;
    private final RString 主治医意見書作成依頼書;
    private final RString 主治医意見書;
    private final List<RString> 主治医医療機関コードリスト;
    private final List<RString> 主治医コードリスト;
    private final boolean is作成依頼書未印刷;
    private final boolean is作成依頼書印刷済;
    private final boolean is主治医意見書未印刷;
    private final boolean is主治医意見書印刷済;
    private final boolean is依頼日From;
    private final boolean is依頼日To;

    /**
     * コンストラクタです。
     *
     * @param 依頼日From 依頼日From
     * @param 依頼日To 依頼日To
     * @param 保険者番号 保険者番号
     * @param 主治医意見書作成依頼書 主治医意見書作成依頼書
     * @param 主治医意見書 主治医意見書
     * @param 主治医医療機関コードリスト 主治医医療機関コードリスト
     * @param 主治医コードリスト 主治医コードリスト
     * @param is作成依頼書未印刷 is作成依頼書未印刷
     * @param is作成依頼書印刷済 is作成依頼書印刷済
     * @param is主治医意見書未印刷 is主治医意見書未印刷
     * @param is主治医意見書印刷済 is主治医意見書印刷済
     * @param is依頼日From is依頼日From
     * @param is依頼日To is依頼日To
     */
    private ShujiiIkenshoSakuseiMybitisParamter(
            RString 依頼日From,
            RString 依頼日To,
            RString 保険者番号,
            RString 主治医意見書作成依頼書,
            RString 主治医意見書,
            List<RString> 主治医医療機関コードリスト,
            List<RString> 主治医コードリスト,
            boolean is作成依頼書未印刷,
            boolean is作成依頼書印刷済,
            boolean is主治医意見書未印刷,
            boolean is主治医意見書印刷済,
            boolean is依頼日From,
            boolean is依頼日To) {
        this.依頼日From = 依頼日From;
        this.依頼日To = 依頼日To;
        this.保険者番号 = 保険者番号;
        this.主治医意見書作成依頼書 = 主治医意見書作成依頼書;
        this.主治医意見書 = 主治医意見書;
        this.主治医医療機関コードリスト = 主治医医療機関コードリスト;
        this.主治医コードリスト = 主治医コードリスト;
        this.is作成依頼書未印刷 = is作成依頼書未印刷;
        this.is作成依頼書印刷済 = is作成依頼書印刷済;
        this.is主治医意見書未印刷 = is主治医意見書未印刷;
        this.is主治医意見書印刷済 = is主治医意見書印刷済;
        this.is依頼日From = is依頼日From;
        this.is依頼日To = is依頼日To;
    }

    /**
     * コンストラクタです。
     *
     * @param 依頼日From 依頼日From
     * @param 依頼日To 依頼日To
     * @param 保険者番号 保険者番号
     * @param 主治医意見書作成依頼書 主治医意見書作成依頼書
     * @param 主治医意見書 主治医意見書
     * @param 主治医医療機関コードリスト 主治医医療機関コードリスト
     * @param 主治医コードリスト 主治医コードリスト
     *
     * @return ShujiiIkenshoSakuseiMybitisParamter
     */
    public static ShujiiIkenshoSakuseiMybitisParamter createSelectByKeyParam(
            RString 依頼日From,
            RString 依頼日To,
            RString 保険者番号,
            RString 主治医意見書作成依頼書,
            RString 主治医意見書,
            List<RString> 主治医医療機関コードリスト,
            List<RString> 主治医コードリスト) {

        boolean is作成依頼書未印刷 = false;
        boolean is作成依頼書印刷済 = false;
        boolean is主治医意見書未印刷 = false;
        boolean is主治医意見書印刷済 = false;
        boolean is依頼日From = false;
        boolean is依頼日To = false;

        if (!RString.isNullOrEmpty(依頼日From)) {
            is依頼日From = true;
        }
        if (!RString.isNullOrEmpty(依頼日To)) {
            is依頼日To = true;
        }
        if (!RString.isNullOrEmpty(主治医意見書作成依頼書) && 主治医意見書作成依頼書.equals(未印刷)) {
            is作成依頼書未印刷 = true;
        }
        if (!RString.isNullOrEmpty(主治医意見書作成依頼書) && 主治医意見書作成依頼書.equals(印刷済)) {
            is作成依頼書印刷済 = true;
        }
        if (!RString.isNullOrEmpty(主治医意見書) && 主治医意見書.equals(未印刷)) {
            is主治医意見書未印刷 = true;
        }
        if (!RString.isNullOrEmpty(主治医意見書) && 主治医意見書.equals(印刷済)) {
            is主治医意見書印刷済 = true;
        }
        return new ShujiiIkenshoSakuseiMybitisParamter(依頼日From,
                依頼日To,
                保険者番号,
                主治医意見書作成依頼書,
                主治医意見書,
                主治医医療機関コードリスト,
                主治医コードリスト,
                is作成依頼書未印刷,
                is作成依頼書印刷済,
                is主治医意見書未印刷,
                is主治医意見書印刷済,
                is依頼日From,
                is依頼日To);
    }
}
