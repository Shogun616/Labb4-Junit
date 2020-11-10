package org.example;

public class TextProcessor {

    public static void uppercase(){
        String txt = "java verktyg";
        System.out.println(txt.toUpperCase());
    }

    public static void lowercase(){
        String txt = "JAVA VERKTYG";
        System.out.println(txt.toLowerCase());
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
