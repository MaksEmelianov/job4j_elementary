package ru.job4j.condition;

public class Games {

    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        for (boolean b : new boolean[]{true, false}) {
            permission(true, b);
        }
        for (boolean b : new boolean[]{true, false}) {
            permission(false, b);
        }
    }
}
