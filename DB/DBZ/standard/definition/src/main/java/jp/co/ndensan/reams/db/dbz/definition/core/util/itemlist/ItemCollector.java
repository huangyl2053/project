/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.core.util.itemlist;

import java.util.Objects;
import jp.co.ndensan.reams.db.dbz.definition.core.util.function.Functions;
import jp.co.ndensan.reams.db.dbz.definition.core.util.function.IBiConsumer;
import jp.co.ndensan.reams.db.dbz.definition.core.util.function.IFunction;
import jp.co.ndensan.reams.db.dbz.definition.core.util.function.ISupplier;

/**
 * {@link IItemCollector}の実装です。{@link IItemCollector}を生成するための{@code static}なメソッドを公開します。
 *
 * @author N3327 三浦 凌
 * @param <T> 集積する元要素の型
 * @param <A> 集積先のオブジェクトの型
 * @param <R> 結果の型
 */
public final class ItemCollector<T, A, R> implements IItemCollector<T, A, R> {

    private final ISupplier<A> theContainer;
    private final IBiConsumer<A, T> theAccumulator;
    private final IFunction<A, R> theFinisher;

    private ItemCollector(ISupplier<A> container, IBiConsumer<A, T> accumulator, IFunction<A, R> finisher) {
        this.theContainer = Objects.requireNonNull(container);
        this.theAccumulator = Objects.requireNonNull(accumulator);
        this.theFinisher = Objects.requireNonNull(finisher);
    }

    /**
     * 指定の要素からなる{@link ItemCollector}を生成します。
     *
     * @param <T> 集積する元要素の型
     * @param <A> 集積先のオブジェクトの型
     * @param <R> 結果の型
     * @param container 集積先のオブジェクトを生成する{@link ISupplier}
     * @param accumulator 集積先のオブジェクトへ集積するオブジェクトをマッピングする{@link IBiConsumer}
     * @param finisher 集積先のオブジェクトを結果へ変換する{@link IFunction}
     * @return 指定の要素からなる{@link ItemCollector}
     */
    public static <T, A, R> ItemCollector<T, A, R> of(ISupplier<A> container, IBiConsumer<A, T> accumulator, IFunction<A, R> finisher) {
        return new ItemCollector<>(container, accumulator, finisher);
    }

    private ItemCollector(ISupplier<A> supplier, IBiConsumer<A, T> accumulator) {
        this(supplier, accumulator, ItemCollector.<A, R>casting());
    }

    private static <A, R> IFunction<A, R> casting() {
        return Functions.cast();
    }

    /**
     * 集積先と結果が同じオブジェクトである{@link ItemCollector}を生成します。
     *
     * @param <T> 集積する元要素の型
     * @param <R> 集積先のオブジェクトの型(結果の型)
     * @param container 集積先のオブジェクトを生成する{@link ISupplier}
     * @param accumulator 集積先のオブジェクトへ集積するオブジェクトをマッピングする{@link IBiConsumer}
     * @return 集積先と結果が同じオブジェクトである{@link ItemCollector}
     */
    public static <T, R> ItemCollector<T, ?, R> of(ISupplier<R> container, IBiConsumer<R, T> accumulator) {
        return new ItemCollector<>(container, accumulator);
    }

    @Override
    public IBiConsumer<A, T> accumulator() {
        return theAccumulator;
    }

    @Override
    public ISupplier<A> container() {
        return theContainer;
    }

    @Override
    public IFunction<A, R> finisher() {
        return theFinisher;
    }
}