package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl = !name.isEmpty() && isLowerLatinLetter(name.charAt(0));
            if (rsl) {
                char[] arrayChar = name.toCharArray();
                for (int ch = 1; ch < arrayChar.length; ch++) {
                    if (!(isSpecialSymbol(arrayChar[ch])
                            || isUpperLatinLetter(arrayChar[ch])
                            || isLowerLatinLetter(arrayChar[ch])
                            || Character.isDigit(arrayChar[ch]))) {
                        rsl = false;
                    }
                }
            }
        return rsl;
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
