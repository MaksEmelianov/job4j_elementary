package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        char[] arrayChar = name.toCharArray();
        if (!isLowerLatinLetter(arrayChar[0])) {
            return false;
        }
        for (int ch = 1; ch < arrayChar.length; ch++) {
            if (!(isSpecialSymbol(arrayChar[ch])
                    || isUpperLatinLetter(arrayChar[ch])
                    || isLowerLatinLetter(arrayChar[ch])
                    || Character.isDigit(arrayChar[ch]))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
