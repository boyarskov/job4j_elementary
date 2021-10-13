package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double norma = (height - 100) * 1.15;
        return norma;
    }

    public static double womanWeight(double height) {
        double norma = (height - 110) * 1.15;
        return norma;
    }

    public static void main(String[] args) {
        double manNorma = Fit.manWeight(180);
        double womanNorma = Fit.womanWeight(160);
        System.out.println("Man 180 is " + manNorma);
        System.out.println("Woman 160 is " + womanNorma);
    }

}
