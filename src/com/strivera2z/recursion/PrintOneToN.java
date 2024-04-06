package com.strivera2z.recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        int i = 1;
        int N = 5;
        printElementsOneToN(i,N);
        System.out.println("====================");
        printElementsOneToNBacktracking(N,N);
    }

    private static void printElementsOneToNBacktracking(int i, int n) {
        // here the change from the above is that we have
        // printed the element after the function call
        if(i<1) return;
        printElementsOneToNBacktracking(i-1,n);
        System.out.println(i);
    }

    private static void printElementsOneToN(int i, int n) {
        if(i>n)
            return;
        System.out.println(i);
        printElementsOneToN(++i,n);

    }
}
