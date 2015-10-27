/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbb.realservice;

import jp.co.ndensan.reams.db.dbb.persistence.relate.ChoshuYuyoRelateDac;
import jp.co.ndensan.reams.db.dbz.definition.enumeratedtype.fuka.GemmenChoshuYuyoStateKubun;
import jp.co.ndensan.reams.db.dbz.definition.util.optional.Optional;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.ChoteiNendo;
import jp.co.ndensan.reams.db.dbz.definition.valueobject.FukaNendo;
import jp.co.ndensan.reams.db.dbx.definition.valueobject.domain.TsuchishoNo;
import jp.co.ndensan.reams.uz.uza.util.di.InstanceProvider;

/**
 * 徴収猶予を取得するクラスです。
 *
 * @author N3317 塚田 萌
 */
public class ChoshuYuyoFinder {

    private final ChoshuYuyoRelateDac dac;

    /**
     * コンストラクタです。
     */
    public ChoshuYuyoFinder() {
        dac = InstanceProvider.create(ChoshuYuyoRelateDac.class);
    }

    /**
     * 単体テスト用のコンストラクタです。
     *
     * @param dac 徴収猶予Relatedac
     */
    ChoshuYuyoFinder(ChoshuYuyoRelateDac dac) {
        this.dac = dac;
    }

    /**
     * 引数の主キーと状態区分に該当する１件の徴収猶予Relateモデルを取得します。
     *
     * @param 調定年度 調定年度
     * @param 賦課年度 賦課年度
     * @param 通知書番号 通知書番号
     * @param 履歴番号 履歴番号
     * @param 状態区分 状態区分
     * @return 徴収猶予Relateモデル
     */
    public Optional<ChoshuYuyoRelate> find徴収猶予(ChoteiNendo 調定年度, FukaNendo 賦課年度,
            TsuchishoNo 通知書番号, int 履歴番号, GemmenChoshuYuyoStateKubun 状態区分) {

        return dac.select徴収猶予RelateByKeyAndState(調定年度, 賦課年度, 通知書番号, 履歴番号, 状態区分);
    }
}