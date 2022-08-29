package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        for (int[] ints : array) {
            System.out.println("Размер вложенного массива равен: " + ints.length);
        }
    }
}
