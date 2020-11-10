package org.example;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 2 is " + add(2, 2) + ".");
        System.out.println("2 - 2 is " + sub(2, 2) + ".");
        System.out.println("4 * 2 is " + multi(4, 2) + ".");
        System.out.println("8 / 2 is " + div(8, 2) + ".");
    }
}