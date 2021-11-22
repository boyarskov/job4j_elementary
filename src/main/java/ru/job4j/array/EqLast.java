package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int index = right.length - 1; index == right.length - 1; index--) {
            if (left[index] == right[index]) {
                result = true;
                break;
            }
            result = false;
        }
        return result;
    }
}
