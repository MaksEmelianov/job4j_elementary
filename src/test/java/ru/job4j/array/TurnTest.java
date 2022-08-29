package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {

    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] in = {4, 1, 6, 2};
        int[] rsl = Turn.back(in);
        int[] expected = {2, 6, 1, 4};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] in = {4, 1, 6, 2, 7};
        int[] rsl = Turn.back(in);
        int[] expected = {7, 2, 6, 1, 4};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWith1AmountOfElementsThenTurnedArray() {
        int[] in = {1};
        int[] rsl = Turn.back(in);
        int[] expected = {1};
        assertThat(rsl).containsExactly(expected);
    }
}