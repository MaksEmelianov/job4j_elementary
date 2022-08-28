package ru.job4j.array;

import java.util.Arrays;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
