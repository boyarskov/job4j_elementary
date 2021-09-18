package ru.job4j.condition;

public class Point {

    static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1; //формула
        double second = y2 - y1; //формула =
        first = Math.pow(first, 2);
        second = Math.pow(second, 2);
        double three = first + second;
        three = Math.sqrt(three);
        return three;
    }

    public static void main(String[] args) {
        double distance1 = Point.distance(0, 0, 2, 0);
        System.out.println("Distance (0, 0) to (2, 0): " + distance1);
    }

}
