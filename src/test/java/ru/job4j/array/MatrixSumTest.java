package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {

    @Test
    void whenOne() {
        int[][] in = {{1}};
        int rsl = MatrixSum.sum(in);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenTwo() {
        int[][] in = {{12, 13}, {1, 2}};
        int rsl = MatrixSum.sum(in);
        int expected = 28;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] in = {{12, 13, 14}, {1, 2, 3}, {4, 5, 6}};
        int rsl = MatrixSum.sum(in);
        int expected = 60;
        assertThat(rsl).isEqualTo(expected);
    }
}