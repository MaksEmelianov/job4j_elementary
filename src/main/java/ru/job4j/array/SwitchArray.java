package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int num : rsl) {
            System.out.print(num);
        }
    }
}
