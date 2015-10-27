/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.ShujiiIkensho;

import static java.util.Objects.requireNonNull;
import jp.co.ndensan.reams.ur.urz.definition.message.UrSystemErrorMessages;

/**
 * 主治医意見書の結果を扱うクラスです。
 *
 * @author N8156 宮本 康
 */
public class ShujiiIkenshoResult {

    private final ShujiiIkenshoBase 基本情報;
    private final ShujiiIkenshoDetails 詳細情報;

    /**
     * インスタンスを生成します。
     *
     * @param 基本情報 基本情報
     * @param 詳細情報 詳細情報
     */
    public ShujiiIkenshoResult(ShujiiIkenshoBase 基本情報, ShujiiIkenshoDetails 詳細情報) {
        this.基本情報 = requireNonNull(基本情報, UrSystemErrorMessages.値がnull.getReplacedMessage("基本情報"));
        this.詳細情報 = requireNonNull(詳細情報, UrSystemErrorMessages.値がnull.getReplacedMessage("詳細情報"));
    }

    /**
     * 基本情報を返します。
     *
     * @return 基本情報
     */
    public ShujiiIkenshoBase get基本情報() {
        return 基本情報;
    }

    /**
     * 詳細情報を返します。
     *
     * @return 詳細情報
     */
    public ShujiiIkenshoDetails get詳細情報() {
        return 詳細情報;
    }
}