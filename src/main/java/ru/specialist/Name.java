package ru.specialist;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        if (name.isEmpty()) name = "Незнакомец";

        System.out.printf("Привет, %s!\n", name);
    }
}
