package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when11to22then1dot41() {
        double expected = 1.41;
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        double out = p1.distance(p2);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenM1M1to22then4dot24() {
        double expected = 4.24;
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(2, 2);
        double out = p1.distance(p2);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when123to123then0() {
        double expected = 0;
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(1, 2, 3);
        double out = p1.distance(p2);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void when123to456then4dot24() {
        double expected = 4.24;
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(4, 5, 6);
        double out = p1.distance(p2);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}