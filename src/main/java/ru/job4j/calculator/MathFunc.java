package ru.job4j.calculator;

public class MathFunc {

        //метод
        public static int func1 (int x) {
            int y = x * x + 1;
            return y;
        }

        //метод2
        public static int func2(int x) {
            int y = x * 10;
            return y;
        }


    public static void main(String[] args) {
            int result1 = MathFunc.func1(3);
            int result2 = MathFunc.func2(5);
            int result3 = MathFunc.func1(100);
            int Total = result1 + result2 + result3;
        System.out.println(Total);
    }

}

