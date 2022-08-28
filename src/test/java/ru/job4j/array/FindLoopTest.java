package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int rsl = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10Then0() {
        int[] data = new int[]{5, 7, 3, 14, 2, 5};
        int el = 10;
        int rsl = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }
}