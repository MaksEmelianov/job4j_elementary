package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "�����������";
            case 2 -> "�������";
            case 3 -> "�����";
            case 4 -> "�������";
            case 5 -> "�������";
            case 6 -> "�������";
            case 7 -> "�����������";
            default -> "������";
        };
    }
}
