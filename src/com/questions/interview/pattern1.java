package com.questions.interview;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int k =n-1;k>=i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            for (int k = 2*(n-i)+1;k>=1 ; k--) {
                System.out.print("* ");
            }
            System.out.println();


        }

    }
}
