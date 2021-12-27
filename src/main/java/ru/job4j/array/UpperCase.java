package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] newString = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                newString[i] = Character.toUpperCase(string[i]);
            } else {
                newString[i] = string[i];
            }
        }
        return newString;
    }
}
