package org.example;

import java.util.Scanner;

public class Main {

    static boolean repeat = true;
    static Scanner scan = new Scanner(System.in);

    public static void menu(){

        System.out.println("              Main Menu             ");
        System.out.println("======================================");
        System.out.println("1. Add Book");
        System.out.println("2. Show Book");
        System.out.println("0.  Exit");

        System.out.println("\nMake your choice");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 0:
                System.out.println("This program has been terminated!");
                repeat = false;
                break;
            case 1:

                break;
            case 2:
                break;

            default:
                System.out.println("Invalid command! Try again!");
        }
    }

    public static void main(String[] args) {
        while (repeat){
            menu();
        }
    }

}

