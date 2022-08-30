package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int item = 1; item < array.length; item++) {
            if (min > array[item]) {
                min = array[item];
            }
        }
        return min;
    }
}
