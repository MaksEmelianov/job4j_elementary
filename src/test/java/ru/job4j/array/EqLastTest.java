package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {

    @Test
    void whenTrue() {
        int[] left = {1, 2, 3, 4};
        int[] right = {3, 5, 1, 4};
        boolean rsl = EqLast.check(left, right);
        assertThat(rsl).isTrue();
    }

    @Test
    void whenFalse() {
        int[] left = {1, 2, 3, 6};
        int[] right = {3, 5, 1, 4};
        boolean rsl = EqLast.check(left, right);
        assertThat(rsl).isFalse();
    }
}