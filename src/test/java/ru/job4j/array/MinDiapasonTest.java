package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinDiapasonTest {

    @Test
    void whenFirstMin() {
        int[] array = {0, 1, 3, 5, 6};
        int start = 1;
        int finish = 3;
        int rsl = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {0, 1, 3, 5, 1};
        int start = 2;
        int finish = array.length - 1;
        int rsl = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMiddleMin() {
        int[] array = {0, 1, 3, 5, 1, 5, 8, 13};
        int start = 2;
        int finish = 6;
        int rsl = MinDiapason.findMin(array, start, finish);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }
}