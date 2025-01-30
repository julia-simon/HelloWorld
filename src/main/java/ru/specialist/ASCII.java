package ru.specialist;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        System.out.printf("%4s", " ");
        for (int col = 0; col < 16; col++) {
            System.out.printf("%4X", col);
        }
        System.out.println();

        for (int row = 0; row < 16; row++) {
            System.out.printf("%4X", row);
            for (int col = 0; col < 16; col++) {
                int asciiValue = row * 16 + col;
                if (asciiValue >= 32 && asciiValue <= 126) {
                    System.out.printf("%4c", (char) asciiValue);
                } else {
                    System.out.printf("%4s", " ");
                }
            }
            System.out.println();
        }
    }
}
