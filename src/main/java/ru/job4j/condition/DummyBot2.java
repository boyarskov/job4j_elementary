package ru.job4j.condition;

public class DummyBot2 {

    public static void chat(String message) {
        System.out.println("Вы ввели: " + message);
        if (message.equals("Привет, Бот.")) {
            System.out.println("Привет, умник.");
        } else if (message.equals("Пока.")) {
            System.out.println("До скорой встречи.");
        } else {
            System.out.println("Это ставит меня в тупик. Задайте другой вопрос.");
        }
    }

    public static void main(String[] args) {
        chat("Привет, Бот.");
        chat("Пока.");
        chat("привет");
    }
}
