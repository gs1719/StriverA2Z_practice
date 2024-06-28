package com;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner Sc = new Scanner(System.in);
        String s = Sc.nextLine();
        int count=0;

       int[] arr1 = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            count=0;
            if(arr1[i] == 1||s.charAt(i)==' ')
                continue;
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)) {
                    arr1[j] = 1;
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"==="+count);

        }
    }
}
