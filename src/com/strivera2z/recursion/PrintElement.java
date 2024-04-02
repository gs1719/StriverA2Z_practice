package com.strivera2z.recursion;

public class PrintElement {
   static int count =0;
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        if(count++==3)
            return;
        System.out.println(arr[count]);
        printArray(arr);
    }
}
