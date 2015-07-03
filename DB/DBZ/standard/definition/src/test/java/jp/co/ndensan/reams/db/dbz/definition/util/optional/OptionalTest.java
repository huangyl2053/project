/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.ndensan.reams.db.dbz.definition.util.optional;

import java.util.NoSuchElementException;
import jp.co.ndensan.reams.db.dbz.definition.util.function.IFunction;
import jp.co.ndensan.reams.db.dbz.definition.util.function.ISupplier;
import jp.co.ndensan.reams.db.dbz.definition.util.function.ExceptionSuppliers;
import jp.co.ndensan.reams.db.dbz.definition.util.function.IPredicate;
import jp.co.ndensan.reams.db.dbz.testhelper.DbzTestBase;
import jp.co.ndensan.reams.uz.uza.lang.RString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * Optionalのテストです。
 *
 * @author N3327 三浦 凌
 */
@RunWith(Enclosed.class)
public class OptionalTest {

    public OptionalTest() {
    }

    public static class of extends DbzTestBase {

        private Optional sut;

        @Test
        public void of_はOptionalのインスタンスを生成する() {
            assertThat(sut.of("string"), isA(Optional.class));
        }

        @Test
        public void of_は引数の値を保持する_Optionalのインスタンスを生成する() {
            String value = "value";
            assertThat(sut.of(value).get(), is(value));
        }

        @Test(expected = NullPointerException.class)
        public void of_は引数がnullの時_NullPointerExceptionをスローする() {
            sut.of(null);
        }
    }

    public static class ofNullable extends DbzTestBase {

        private Optional sut;

        @Test
        public void ofNullable_はOptionalのインスタンスを生成する() {
            assertThat(sut.ofNullable("string"), isA(Optional.class));
        }

        @Test
        public void ofNullable_は引数の値を保持する_Optionalのインスタンスを生成する() {
            String value = "value";
            assertThat(sut.of(value).get(), is(value));
        }

        @Test
        public void ofNullable_は引数がnullの時_空のOptionalのインスタンスを生成する() {
            assertThat(sut.ofNullable(null).isPresent(), is(false));
        }
    }

    public static class empty extends DbzTestBase {

        private Optional sut;

        @Test
        public void empty_は空のOptionalのインスタンスを生成する() {
            assertThat(sut.empty().isPresent(), is(false));
        }
    }

    @RunWith(Enclosed.class)
    public static class equals extends DbzTestBase {

        public static class DifferentValues extends DbzTestBase {

            private Optional<RString> sut;
            private RString value;

            @Before
            public void setUp() {
                value = new RString("value");
                sut = Optional.of(value);
            }

            @Test
            public void equals_は保持する値が異なる時_falseを返す() {
                Optional<RString> target = Optional.of(new RString("different value"));
                assertThat(sut.equals(target), is(false));
            }

            @Test
            public void equals_は保持する値の型が異なる時_falseを返す() {
                Optional<String> target = Optional.of(value.toString());
                assertThat(sut.equals(target), is(false));
            }
        }

        public static class empty extends DbzTestBase {

            private Optional<RString> sut;

            @Before
            public void setUp() {
                sut = Optional.<RString>empty();
            }

            @Test
            public void equals_はどちらもnullを保持するとき_trueを返す() {
                Optional<String> target = Optional.<String>empty();
                assertThat(sut.equals(target), is(true));
            }
        }

        public static class other extends DbzTestBase {

            private Optional<RString> sut;
            private RString value;

            @Before
            public void setUp() {
                value = new RString("value");
                sut = Optional.of(value);
            }

            @Test
            public void equals_はnullと比較したとき_falseを返す() {
                assertThat(sut.equals(null), is(false));
            }

            @Test
            public void equals_は型の異なるオブジェクトと比較したとき_falseを返す() {
                assertThat(sut.equals(value), is(false));
            }
        }

        public static class SameValues extends DbzTestBase {

            private Optional<String> sut;
            private Optional<String> target;

            @Before
            public void setUp() {
                sut = Optional.of("value");
                target = Optional.of("value");
            }

            @Test
            public void equals_は同じ値同士であればtrueを返す() {
                assertThat(sut.equals(target), is(true));
            }

            @Test
            public void equals_はtrueを返す組わせならば_順番を変えても_trueを返す() {
                assertThat(target.equals(sut), is(true));
            }

            @Test
            public void hashCode_はequalsがtrueを返す時_同じ値を返す() {
                assertThat(sut.hashCode(), is(target.hashCode()));
            }
        }
    }

    public static class get extends DbzTestBase {

        private Optional<RString> sut;

        @Test(expected = NoSuchElementException.class)
        public void get_はコンストラクタで受け取った値がnullの時_NoSuchElementExceptionをスローする() {
            sut = Optional.empty();
            sut.get();
        }

        @Test
        public void get_はコンストラクタで受け取った値がnullでない時_その値を返す() {
            RString value = new RString("value");
            sut = Optional.of(value);
            assertThat(sut.get(), is(value));
        }
    }

    public static class isPresent extends DbzTestBase {

        private Optional<RString> sut;

        @Test
        public void isPresent_はコンストラクタで受け取った値がnullの時_falseを返す() {
            sut = Optional.empty();
            assertThat(sut.isPresent(), is(false));
        }

        @Test
        public void isPresent_はコンストラクタで受け取った値がnullでない時_trueを返す() {
            RString value = new RString("value");
            sut = Optional.of(value);
            assertThat(sut.isPresent(), is(true));
        }
    }

    public static class orElse extends DbzTestBase {

        private Optional<RString> sut;
        private RString other;

        @Before
        public void setUp() {
            other = new RString("other");
        }

        @Test
        public void orElse_はコンストラクタで受け取った値がnullの時_引数の値を返す() {
            sut = Optional.empty();
            assertThat(sut.orElse(other), is(other));
        }

        @Test
        public void orElse_はコンストラクタで受け取った値がnullでない時_その値を返す() {
            RString value = new RString("value");
            sut = Optional.of(value);
            assertThat(sut.orElse(other), is(value));
        }
    }

    public static class orElseThrow extends DbzTestBase {

        private Optional<RString> sut;
        private ISupplier<NullPointerException> exceptionSupplier;

        @Before
        public void setUp() {
            exceptionSupplier = ExceptionSuppliers.nullPointerException("test");
        }

        @Test(expected = NullPointerException.class)
        public void orElseThrow_はコンストラクタで受け取った値がnullの時_引数のsupplierが生成するexceptionをスローする() {
            sut = Optional.empty();
            sut.orElseThrow(exceptionSupplier);
        }

        @Test
        public void orElseThrow_はコンストラクタで受け取った値がnullでない時_その値を返す() {
            RString value = new RString("value");
            sut = Optional.of(value);
            assertThat(sut.orElseThrow(exceptionSupplier), is(value));
        }
    }

    public static class map extends DbzTestBase {

        private Optional<RString> sut;
        private Optional<String> mapped;

        private IFunction<RString, String> createMapper() {
            return new IFunction<RString, String>() {
                @Override
                public String apply(RString t) {
                    return t.toString();
                }
            };
        }

        @Test
        public void map_の戻り値は_保持する値が引数のIFuntionにより変換された結果を_持つ() {
            sut = Optional.of(new RString("input"));
            mapped = sut.map(createMapper());
            assertThat(mapped.get(), is(createMapper().apply(sut.get())));
        }

        @Test
        public void map_の戻り値は_emptyの時_emptyである() {
            sut = Optional.empty();
            mapped = sut.map(createMapper());
            assertThat(mapped.isPresent(), is(false));
        }
    }

    public static class flatMap extends DbzTestBase {

        private Optional<RString> sut;
        private Optional<String> mapped;

        private IFunction<RString, Optional<String>> createMapper() {
            return new IFunction<RString, Optional<String>>() {
                @Override
                public Optional<String> apply(RString t) {
                    return Optional.of(t.toString());
                }
            };
        }

        @Test
        public void flatMap_の戻り値は_保持する値を引数のIFuntionにより変換した値をもつ_Optionalである() {
            sut = Optional.of(new RString("input"));
            mapped = sut.flatMap(createMapper());
            assertThat(mapped.get(), is(createMapper().apply(sut.get()).get()));
        }

        @Test
        public void flatMap_の戻り値は_emptyの時_emptyである() {
            sut = Optional.empty();
            mapped = sut.flatMap(createMapper());
            assertThat(mapped.isPresent(), is(false));
        }
    }

    public static class filter extends DbzTestBase {

        private String value;
        private Optional<String> sut;

        @Before
        public void setUp() {
            value = "test";
            sut = Optional.of(value);
        }

        @Test
        public void filterは_引数のIConditon$checkに対して_自身が保持する値を渡すと_trueが返る時_空でないOptionalを返す() {
            assertThat(sut.filter(new IPredicate<String>() {
                @Override
                public boolean evaluate(String t) {
                    return true;
                }
            }).isPresent(), is(true));
        }

        @Test
        public void filterは_引数のIConditon$checkに対して_自身が保持する値を渡すと_falseが返る時_空のOptionalを返す() {
            assertThat(sut.filter(new IPredicate<String>() {
                @Override
                public boolean evaluate(String t) {
                    return false;
                }
            }).isPresent(), is(false));
        }

        @Test
        public void filterは_自身が値を保持していないとき_引数のIConditionにかかわらず_空のOptionalを返す() {
            assertThat(Optional.<String>empty().filter(new IPredicate<String>() {
                @Override
                public boolean evaluate(String t) {
                    return true;
                }
            }).isPresent(), is(false));
            assertThat(Optional.<String>empty().filter(new IPredicate<String>() {
                @Override
                public boolean evaluate(String t) {
                    return false;
                }
            }).isPresent(), is(false));
        }
    }
}