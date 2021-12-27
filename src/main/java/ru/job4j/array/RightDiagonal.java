package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        int count = 0;
        for (int i = data.length - 1; i >= 0; i--) {
                rsl[count] = data[count][i];
                count++;
            }
        return rsl;
    }
}
