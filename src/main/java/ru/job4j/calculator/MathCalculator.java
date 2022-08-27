package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMulti(double first, double second) {
        return sum(first, second) + multi(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double sumAllMethodFromMath(double first, double second) {
        return sum(first, second) + multi(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMulti равен: " + sumAndMulti(12, 21));
        System.out.println("Результат расчета diffAndDiv равен: " + diffAndDiv(12, 21));
        System.out.println("Результат расчета sumAllMethodFromMath равен: " + sumAllMethodFromMath(12, 21));
    }
}
