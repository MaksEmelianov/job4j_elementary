package ru.job4j.array;

public class Defragmentation {

    public static String[] compress(String[] array) {
        String tmp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

    }
}
