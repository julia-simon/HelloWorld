package ru.specialist;

import java.util.Scanner;

public class Fibonacci {
    public static <v> void main(String[] args) {
        int a = 1, b = 1, c;

        System.out.print(a + " " + b + " ");

        while ((c = a + b) < 1000) {
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
