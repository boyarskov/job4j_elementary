package ru.job4j.array;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int value = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                value++;
            }
        }
        int count = 0;
        int[] rsl = new int[value];
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                rsl[count] = data[i];
                count++;
            }
        }
        return rsl;
    }
}