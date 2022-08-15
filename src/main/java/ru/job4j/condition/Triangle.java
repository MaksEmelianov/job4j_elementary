package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ca) {
        return ab + bc > ca && bc + ca > ab && ab + ca > bc;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(1, 1, 1));
        System.out.println(Triangle.exist(1, 2, 3));
    }
}
