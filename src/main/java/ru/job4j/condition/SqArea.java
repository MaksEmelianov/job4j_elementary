package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (1 + k));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double square = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + square);

        square = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = " + square);
    }
}
