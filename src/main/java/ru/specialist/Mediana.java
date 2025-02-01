package ru.specialist;

import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        int[] nums = inputArray();
        int[] analysisResult = analyzeArray(nums);
        double avg = (double) analysisResult[2] / nums.length;
        double mediana = mediana(nums);
        print(analysisResult, avg, mediana);
    }

    public static int[] inputArray() {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] nums = new int[size];
            for (int i = 0; i < nums.length; i++) {
                System.out.printf("Элемент [%d]: ", i + 1);
                nums[i] = scanner.nextInt();
            }
            return nums;
        }
    }

    public static int[] analyzeArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums [i];
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        return new int[]{min, max, sum};
    }

    public static double mediana(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 1)
            return nums[nums.length / 2];
        else
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2D;
    }

    public static void print(int[] results, double avg, double mediana) {
        System.out.printf("Минимум: %d\n", results[0]);
        System.out.printf("Максимум: %d\n", results[1]);
        System.out.printf("Сумма: %d\n", results[2]);
        System.out.printf("Среднее значение: %f\n", avg);
        System.out.printf("Медиана: %f\n", mediana);
    }
}
