package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int maxNum = Max.max(10, 10);
        System.out.println(maxNum);
        maxNum = Max.max(0, 0);
        System.out.println(maxNum);
        maxNum = Max.max(-10, -10);
        System.out.println(maxNum);
        maxNum = Max.max(-10, 10);
        System.out.println(maxNum);
        maxNum = Max.max(10, 1);
        System.out.println(maxNum);
    }
}
