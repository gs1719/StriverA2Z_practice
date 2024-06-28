package com.questions.interview;

import java.util.Scanner;

public class charfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int)ch;
            arr[ascii-97]++;
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>0)
            System.out.println(arr[i]);
        }
    }
}
