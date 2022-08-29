package ru.job4j.array;

public class RollBackArray {

    public static int[] rollBack(int[] array) {
        int[] rsl = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - 1;
            int currentIndex = lastIndex - i;
            rsl[currentIndex] = array[i];
        }
        return rsl;
    }
}
