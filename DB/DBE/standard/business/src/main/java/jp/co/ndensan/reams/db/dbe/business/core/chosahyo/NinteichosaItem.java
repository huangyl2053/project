/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbe.business.core.chosahyo;

import jp.co.ndensan.reams.db.dbe.business.core.IAnswerItem;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyo.INinteichosaItemGroup;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyo.INinteichosaItemKubun;
import jp.co.ndensan.reams.db.dbe.definition.enumeratedtype.core.chosahyo.INinteichosaItemSubGroup;
import jp.co.ndensan.reams.db.dbe.definition.valueobject.NinteichosaItemNo;
import jp.co.ndensan.reams.ur.urz.definition.Messages;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static java.util.Objects.requireNonNull;

/**
 * 要介護認定調査の調査項目を扱うクラスです。
 *
 * @author N8156 宮本 康
 */
public class NinteichosaItem implements INinteichosaItem {

    private final INinteichosaItemGroup 調査項目グループ;
    private final INinteichosaItemSubGroup 調査項目サブグループ;
    private final int 調査項目グループ内番号;
    private final int 調査項目サブグループ内番号;
    private final NinteichosaItemNo 調査項目番号;
    private final INinteichosaItemKubun 調査項目区分;
    private final RString 表示名称;
    private final IAnswerItem 回答項目;

    /**
     * インスタンスを生成します。
     *
     * @param 調査項目グループ 調査項目グループ
     * @param 調査項目サブグループ 調査項目サブグループ
     * @param 調査項目グループ内番号 調査項目グループ内番号
     * @param 調査項目サブグループ内番号 調査項目サブグループ内番号
     * @param 調査項目番号 調査項目番号
     * @param 調査項目区分 調査項目区分
     * @param 表示名称 表示名称
     * @param 回答項目 回答項目
     */
    public NinteichosaItem(INinteichosaItemGroup 調査項目グループ, INinteichosaItemSubGroup 調査項目サブグループ,
            int 調査項目グループ内番号, int 調査項目サブグループ内番号, NinteichosaItemNo 調査項目番号,
            INinteichosaItemKubun 調査項目区分, RString 表示名称, IAnswerItem 回答項目) {
        this.調査項目グループ = requireNonNull(調査項目グループ, Messages.E00001.replace("調査項目グループ").getMessage());
        this.調査項目サブグループ = requireNonNull(調査項目サブグループ, Messages.E00001.replace("調査項目サブグループ").getMessage());
        this.調査項目グループ内番号 = 調査項目グループ内番号;
        this.調査項目サブグループ内番号 = 調査項目サブグループ内番号;
        this.調査項目番号 = requireNonNull(調査項目番号, Messages.E00001.replace("調査項目番号").getMessage());
        this.調査項目区分 = requireNonNull(調査項目区分, Messages.E00001.replace("調査項目区分").getMessage());
        this.表示名称 = requireNonNull(表示名称, Messages.E00001.replace("表示名称").getMessage());
        this.回答項目 = requireNonNull(回答項目, Messages.E00001.replace("回答項目").getMessage());
    }

    @Override
    public boolean is調査結果項目() {
        return false;
    }

    @Override
    public INinteichosaItemGroup get調査項目グループ() {
        return 調査項目グループ;
    }

    @Override
    public INinteichosaItemSubGroup get調査項目サブグループ() {
        return 調査項目サブグループ;
    }

    @Override
    public int get調査項目グループ内番号() {
        return 調査項目グループ内番号;
    }

    @Override
    public int get調査項目サブグループ内番号() {
        return 調査項目サブグループ内番号;
    }

    @Override
    public NinteichosaItemNo get調査項目番号() {
        return 調査項目番号;
    }

    @Override
    public INinteichosaItemKubun get調査項目区分() {
        return 調査項目区分;
    }

    @Override
    public RString get表示名称() {
        return 表示名称;
    }

    @Override
    public IAnswerItem get回答項目() {
        return 回答項目;
    }
}