package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] in = {1, 2, 3, 4};
        int source = 0;
        int dest = 3;
        int[] rsl = SwitchArray.swap(in, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap1To3() {
        int[] in = {1, 2, 3, 4, 4, 5, 6, 7};
        int source = 1;
        int dest = 3;
        int[] rsl = SwitchArray.swap(in, source, dest);
        int[] expected = {1, 4, 3, 2, 4, 5, 6, 7};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap0To0() {
        int[] in = {1, 2, 3, 4, 4, 5};
        int source = 0;
        int dest = 0;
        int[] rsl = SwitchArray.swap(in, source, dest);
        int[] expected = {1, 2, 3, 4, 4, 5};
        assertThat(rsl).containsExactly(expected);
    }
}