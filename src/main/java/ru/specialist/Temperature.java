package ru.specialist;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру (С): ");
        double tc = sc.nextDouble();

        double tf = tc * 9 / 5 + 32;

        System.out.printf("Температура (F): %6.2f\n", tf);
    }
}
