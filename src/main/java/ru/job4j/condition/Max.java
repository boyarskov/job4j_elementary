package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int msgSecond = Max.max(8, 2);
        int msgThird = Max.max(5, 9, 10);
        int msgFourth = Max.max(3, 2, 34);
        System.out.println(msgSecond);
        System.out.println(msgThird);
        System.out.println(msgFourth);
    }

}
