package ru.specialist;

public class ConverterToString {
    public static void main(String[] args) {
        int intValue = 5;
        byte byteValue = 5;
        short shortValue = 5;
        long longValue = 5;

        System.out.println("int:   " + toBinaryString(intValue));
        System.out.println("byte:  " + toBinaryString(byteValue));
        System.out.println("short: " + toBinaryString(shortValue));
        System.out.println("long:  " + toBinaryString(longValue));
    }
    // Метод для int
    public static String toBinaryString(int number) {
        final int size = 32;
        char[] bits = new char[size];

        for(int i = size-1; i >=0; i--) {
            bits[i] = ( (number & 1) == 0) ? '0' : '1';
            number >>= 1;
        }

        return new String(bits);
    }

    // Метод для byte
    public static String toBinaryString(byte number) {
        final int size = 8;
        char[] bits = new char[size];

        for(int i = size-1; i >=0; i--) {
            bits[i] = ( (number & 1) == 0) ? '0' : '1';
            number >>= 1;
        }

        return new String(bits);
    }

    // Метод для short
    public static String toBinaryString(short number) {
        final int size = 16;
        char[] bits = new char[size];

        for(int i = size-1; i >=0; i--) {
            bits[i] = ( (number & 1) == 0) ? '0' : '1';
            number>>= 1;
        }

        return new String(bits);
    }

    // Метод для long
    public static String toBinaryString(long number) {
        final int size = 64;
        char[] bits = new char[size];

        for(int i = size-1; i >=0; i--) {
            bits[i] = ( (number & 1) == 0) ? '0' : '1';
            number>>= 1;
        }

        return new String(bits);
    }
}
