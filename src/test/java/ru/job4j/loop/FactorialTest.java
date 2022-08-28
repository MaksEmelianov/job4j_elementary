package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenFactFor5Then120() {
        int expected = 120;
        int in = 5;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenFactFor0Then1() {
        int expected = 1;
        int in = 0;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }
}