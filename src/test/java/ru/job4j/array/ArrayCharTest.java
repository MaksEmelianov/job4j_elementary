package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {

    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenStartWithPrefixThenFasle() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl).isFalse();
    }
}