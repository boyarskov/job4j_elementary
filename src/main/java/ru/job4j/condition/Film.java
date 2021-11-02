package ru.job4j.condition;

public class Film {
    public static String permission(int age) {
        String label = "";
        if (age >= 18) {
            label = "Please, enjoy it.";
        } else {
            label = "You can't watch it.";
        }
        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permission(33);
        System.out.println(msg);
    }
}
