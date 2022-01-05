package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int count = 0;
        for (int i = 0; i < el - 1; i++) {
            count = count + data[i];
        }
        if (count % 2 == 0) {
            return count;
        }
        return 0;
    }
}