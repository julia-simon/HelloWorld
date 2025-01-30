package ru.specialist;

public class FactorialWithOverflow {
    public static void main(String[] args) {
        int number = 13;

        try {
            int result = factorial(number);
            System.out.printf("Факториал числа %d равен %d\n", number, result);
        } catch (ArithmeticException e) {
            System.out.println("Произошло арифметическое переполнение");
        }
    }

    public static int factorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r = Math.multiplyExact(r, i);
        }
        return r;
    }

}
