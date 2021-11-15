package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        //amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту.
        while (amount > 0) {
            amount = (((amount / 100) * percent) + amount) - salary;
            year++;
        }
        System.out.println(year);
        return year;
    }
}
