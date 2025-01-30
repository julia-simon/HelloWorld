package ru.specialist;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " равен " + factorial(number));
    }
        public static int factorial(int n){
            int r = 1;
            for (int i = 1; i <= n; i++)
                r *=i;
            return r;
        }
}
