package ru.job4j.array;

import java.util.Arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left[0].length * right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right[i].length; j++) {
                if (left[i][j] > right[i][j]) {
                    rsl[count++] = left[i][j];
                } else {
                    rsl[count++] = right[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(rsl));
        return rsl;
    }
}