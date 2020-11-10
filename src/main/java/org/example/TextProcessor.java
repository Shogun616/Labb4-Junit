package org.example;

public class TextProcessor {

    public static void uppercase(){
        System.out.println("java" + " verktyg");
    }

    public static void lowercase(){
        System.out.println("java" + " verktyg");
    }

    public static void reverse(){
        StringBuilder str = new StringBuilder("Java Verktyg");
        str.reverse();
        System.out.println(str);
    }

    public static void main(String[] args) {
        uppercase();
        lowercase();
        reverse();
    }
}
