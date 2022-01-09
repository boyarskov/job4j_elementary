package ru.job4j.array;

import java.util.Arrays;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int count = 0;
        int[] rsl = new int[data[0].length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count++] = data[i][j];
            }
        }
            System.out.println(Arrays.toString(rsl));
            return rsl;
        }
    }
