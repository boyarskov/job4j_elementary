package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int row = 1; row < size; row++) {
            for (int cell = 1; cell < size; cell++) {
                array[row][cell] = row * cell;
            }
        }
        return array;
    }
}
