package com.strivera2z.recursion;

public class PrintNtoOne {
    public static void main(String[] args) {
        printElementsNtoOne(1,5);
        System.out.println("=============");
        printElementNtoOneBacktracking(1,5);
    }

    private static void printElementsNtoOne(int i, int i1) {
        if(i1<i) return;
        System.out.println(i1);
        printElementsNtoOne(i,i1-1);

    }
    private static void printElementNtoOneBacktracking(int i, int n){
        if(i>n)
            return;
        printElementNtoOneBacktracking(i+1,n);
        System.out.println(i);
    }
}
