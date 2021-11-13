package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < (number - 1); index++) {
            if (number % index == 0) {
                System.out.println("Число = " + number + ". не простое. Остановка");
                prime = false;
                break;
            } else {
                System.out.println("Число = " + number + ". простое. WIN");
            }
        }
        return prime;
    }
}
