package org.example;

public class TextProcessor {

    public static String uppercase(String a){
        return a.toUpperCase();
    }

    public static String lowercase(String a){
        return a.toLowerCase();
    }

    public static String backwards(String a){
        StringBuilder str = new StringBuilder("java verktyg");

        str.append(a);

        str = str.reverse();

        return a + str;
    }

    public static void main(String[] args) {
        System.out.println("java verktyg blir " + uppercase("java verktyg") + ".");
        System.out.println("JAVA VERKTYG blir " + lowercase("JAVA verktyg") + ".");
        System.out.println("java verktyg blir " +backwards("") + ".");
    }

}