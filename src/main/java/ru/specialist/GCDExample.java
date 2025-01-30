package ru.specialist;

public class GCDExample {
    public static void main(String[] args) {
        int a = 1071;
        int b = 462;

        int result = gcd(a, b);
        System.out.printf("НОД(%d, %d) = %d\n", a, b, result);
    }

    public static int gcd(int k1, int k2) {
        int k3;

        while ( (k3 = k1 % k2) != 0) {
            k1 = k2;
            k2 = k3;
        }

        return k2;
    }
}
