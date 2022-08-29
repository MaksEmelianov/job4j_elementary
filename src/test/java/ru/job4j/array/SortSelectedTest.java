package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void when6Nums() {
        int[] in = {5, 3, 6, 7, 8, 5};
        int[] expected = {3, 5, 5, 6, 7, 8};
        int[] out = SortSelected.sort(in);
        assertThat(out).containsExactly(expected);
    }

    @Test
    void when5Nums() {
        int[] in = {2, 1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1, 2};
        int[] out = SortSelected.sort(in);
        assertThat(out).containsExactly(expected);
    }

    @Test
    void when4Nums() {
        int[] in = {0, -1, -11, 11, 1};
        int[] expected = {-11, -1, 0, 1, 11};
        int[] out = SortSelected.sort(in);
        assertThat(out).containsExactly(expected);
    }

    @Test
    void when3Nums() {
        int[] in = {'3', 0, 0};
        int[] expected = {0, 0, '3'};
        int[] out = SortSelected.sort(in);
        assertThat(out).containsExactly(expected);
    }

    @Test
    void when2Nums() {
        int[] in = {'3', 0x11};
        int[] expected = {0x11, '3'};
        int[] out = SortSelected.sort(in);
        assertThat(out).containsExactly(expected);
    }
}