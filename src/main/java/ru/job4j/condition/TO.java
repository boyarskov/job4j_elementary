package ru.job4j.condition;

public class TO {

    public static void checkMileage(int mileage) {
        System.out.println("Какой у вас пробег? " + mileage);
        if (mileage >= 10000) {
            System.out.println("Пора записаться на тех обслуживание");
        } else {
            System.out.println("Еще рано записываться на тех обслуживание");
        }
    }

    public static void main(String[] args) {
        TO.checkMileage(3000);
        TO.checkMileage(12000);
    }
}
