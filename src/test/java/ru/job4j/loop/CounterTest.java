package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To20Then104() {
        int start = 5;
        int finish = 20;
        int expected = 104;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumAllNumbersFrom3To5Then12() {
        int start = 3;
        int finish = 5;
        int expected = 12;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumAllNumbersFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}