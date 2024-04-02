package com.strivera2z.recursion;

public class PrintName {
    public static void main(String[] args) {
        printName("Gaurav",5);

    }

    private static void printName(String name, int i) {
        if(i==0)
            return;
        System.out.println(name);
        printName(name,--i);
    }
}
