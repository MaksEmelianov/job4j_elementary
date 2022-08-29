package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = {1, 2, 3};
        int rsl = Min.findMin(array);
        int expected = 1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMiddletMin() {
        int[] array = {10, 2, 3};
        int rsl = Min.findMin(array);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenLasttMin() {
        int[] array = {10, 20, 3};
        int rsl = Min.findMin(array);
        int expected = 3;
        assertThat(rsl).isEqualTo(expected);
    }
}