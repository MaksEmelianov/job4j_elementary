package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class RollBackArrayTest {

    @Test
    void whenEmpty() {
        int[] in = {};
        int[] out = RollBackArray.rollBack(in);
        int[] expected = {};
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenOne() {
        int[] in = {1};
        int[] out = RollBackArray.rollBack(in);
        int[] expected = {1};
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenFull() {
        int[] in = {1, 2, 3, 4};
        int[] out = RollBackArray.rollBack(in);
        int[] expected = {4, 3, 2, 1};
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenTheSame() {
        int[] in = {1, 1, 1, 1};
        int[] out = RollBackArray.rollBack(in);
        int[] expected = {1, 1, 1, 1};
        assertThat(out).containsExactly(expected);
    }
}