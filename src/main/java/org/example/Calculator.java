package org.example;

import java.util.Scanner;

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

    public static void calculate() {

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter second number:");
        num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your selection: 1 for Addition, 2 for subtraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));
                break;
            case 2:
                System.out.println(sub(num1, num2));
                break;
            case 3:
                System.out.println(multi(num1, num2));
                break;
            case 4:
                System.out.println(div(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}