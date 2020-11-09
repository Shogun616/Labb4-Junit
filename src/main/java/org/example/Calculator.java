package org.example;

import java.util.Scanner;

public class Calculator {
    
    public static void calculate(){

        int num1;
        int num2;
        String operator;

        Scanner scan = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = scan.nextInt();

        System.out.println("choose operation? ");
        operator = op.next();

        System.out.println("please enter the second number");
        num2 = scan.nextInt();


        if (operator.equals("+"))
        {
            System.out.println("your answer is " + (num1 + num2));
        }
        if (operator.equals("-"))
        {
            System.out.println("your answer is " + (num1 - num2));
        }
        if (operator.equals("/"))
        {
            System.out.println("your answer is " + (num1 / num2));
        }
        if (operator .equals( "*"))
        {
            System.out.println("your answer is " + (num1 * num2));
        }
    }
}
