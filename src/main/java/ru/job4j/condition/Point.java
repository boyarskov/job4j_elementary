package ru.job4j.condition;

public class Point {

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double distance1 = Point.distance(0, 0, 2, 0);
        System.out.println("Distance (0, 0) to (2, 0): " + distance1);
    }
}
