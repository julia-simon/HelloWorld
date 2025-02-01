package ru.specialist;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] nums = inputArray();
        int[] analysisResult = analyzeArray(nums);
        print(analysisResult);
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

    public static void print(int[] results) {
        System.out.printf("Минимум: %d\n", results[0]);
        System.out.printf("Максимум: %d\n", results[1]);
        System.out.printf("Сумма: %d\n", results[2]);
    }
}
