package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] >= array[i]) {
                count = count + 1;
            } else {
                if (count > max) {
                    max = count;
                    count = 1;
                }
            }
        }
        return count;
    }
}