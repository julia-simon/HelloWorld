package ru.specialist;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 10;
        int attempts = 0;

        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");
        System.out.println("Для того чтобы сдаться введите 0.");

        while (attempts < maxAttempts) {
            System.out.print("Ваш ответ: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess == 0) {
                System.out.println("Вы сдались! Загаданное число было: " + numberToGuess);
                break;
            }

            if (playerGuess == numberToGuess) {
                System.out.println("Поздравляю! Вы угадали число с " + attempts + " попытки.");
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Мало! Попробуйте еще раз");
            } else {
                System.out.println("Много! Попробуйте еще раз");
            }

            if (attempts == maxAttempts) {
                System.out.println("К сожалению, попытки закончились. Загаданное число было: " + numberToGuess);
            }
        }

        scanner.close();
    }

}
