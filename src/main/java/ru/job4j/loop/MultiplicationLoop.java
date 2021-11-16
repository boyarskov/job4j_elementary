package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int sum = 1;
        for (int i = a; i <= b; i++) {
            while (i % 1 == 0) {
                sum = sum * i;
                System.out.println(sum);
                break;
            }
        }
        return sum;
    }
}
