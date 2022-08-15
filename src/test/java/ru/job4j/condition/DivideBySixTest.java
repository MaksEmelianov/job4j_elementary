package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @Test
    void whenNumbDivBy3AndNotEven() {
        int in = 15;
        String result = DivideBySix.checkNumber(in);
        String expected = "�������� ����� ������� �� 3, �� �� �������� ������.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "�������� ����� ������� �� 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "�������� ����� ������� �� 3, �� �� �������� ������.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "�������� ����� �� ������� �� 3, �� �������� ������.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "�������� ����� �� ������� �� 3 � �� �������� ������.";
        assertThat(result).isEqualTo(expected);
    }
}