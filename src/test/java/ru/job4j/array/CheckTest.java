package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckTest {

    @Test
    void whenDataMonoByTrueThenTrue() {
        boolean[] in = {true, true, true};
        boolean out = Check.mono(in);
        assertThat(out).isTrue();
    }

    @Test
    void whenDataNotMonoByTrueThenFalse() {
        boolean[] in = {true, true, false};
        boolean out = Check.mono(in);
        assertThat(out).isFalse();
    }

    @Test
    void whenDataMonoByFalseThenTrue() {
        boolean[] in = {false, false, false};
        boolean out = Check.mono(in);
        assertThat(out).isTrue();
    }

    @Test
    void whenDataNotMonoByFalseThenFalse() {
        boolean[] in = {false, true, false};
        boolean out = Check.mono(in);
        assertThat(out).isFalse();
    }
}