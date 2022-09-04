package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To2Then10() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxM1To2Then2() {
        int left = -1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxBetweenThreeThen5() {
        int ont = 1;
        int two = 2;
        int three = 5;
        int result = Max.max(ont, two, three);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxBetweenFourThen5() {
        int ont = 1;
        int two = 2;
        int three = 15;
        int four = 5;
        int result = Max.max(ont, two, three, four);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}