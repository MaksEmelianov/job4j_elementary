package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EndsWithTest {

    @Test
    void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'l', 'o'};
        boolean rls = EndsWith.endsWith(word, post);
        assertThat(rls).isTrue();
    }

    @Test
    void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a', 'o'};
        boolean rls = EndsWith.endsWith(word, post);
        assertThat(rls).isFalse();
    }
}