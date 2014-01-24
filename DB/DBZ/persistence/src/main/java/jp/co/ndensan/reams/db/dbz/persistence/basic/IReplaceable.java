/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.persistence.basic;

import jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable;
import jp.co.ndensan.reams.uz.uza.util.di.Transaction;

/**
 * テーブルへのデータの挿入または更新をするためのインタフェースです。
 *
 * @author N3327 三浦 凌
 *
 * @param <T> 挿入または更新したいテーブルのEntityクラス
 */
public interface IReplaceable<T extends IDbAccessable> extends IInsertable<T>, IUpdatable<T> {

    /**
     * データと同じ内容がすでにテーブルにあれば更新、なければ挿入をします。 <br />
     * 実装する際はデータを挿入か更新かをまず判定し、それぞれ、 {@link #insert(jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable) insert()}、
     * {@link #update(jp.co.ndensan.reams.uz.uza.util.db.IDbAccessable) update()}
     * を呼び出すようにします。
     *
     * @param data 挿入または更新したいデータ
     * @return 挿入件数または更新件数
     */
    @Transaction
    int insertOrUpdate(T data);
}
