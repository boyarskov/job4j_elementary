package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < (number - 1); index++) { //начинаем перебор цифр с 2 до (number - 1)
            if (number % index == 0) { //если number делится на index без остатка, то число НЕ простое
                System.out.println("Число = " + number + ". не простое. Остановка");
                prime = false; //и мы возвращаем prime = false
                break;
            } else {
                System.out.println("Число = " + number + ". простое. WIN");
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        CheckPrimeNumber.check(6);
        CheckPrimeNumber.check(34);
        CheckPrimeNumber.check(9);
        CheckPrimeNumber.check(5);
    }
}
