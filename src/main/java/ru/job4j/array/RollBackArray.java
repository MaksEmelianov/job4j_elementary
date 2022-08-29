package ru.job4j.array;

public class RollBackArray {

    public static int[] rollBack(int[] array) {
        int[] rsl = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rsl[array.length - 1 - i] = array[i];
        }
        return rsl;
    }
}
