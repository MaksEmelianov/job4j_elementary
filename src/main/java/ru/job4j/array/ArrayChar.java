package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean rls = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                return false;
            }
        }
        return rls;
    }
}
