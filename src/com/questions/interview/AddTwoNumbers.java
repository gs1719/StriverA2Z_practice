package com.questions.interview;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
//        addWithoutArthematic(a, b);
//        addWithoutArthematicNegaive(a, b);
        addWithoutArthematicHalfAdder(a,b);
    }

    private static void addWithoutArthematicHalfAdder(int a, int b) {
        int sum;
        int carry;
        while(b>0) {
            sum = a ^ b;
            carry = (a & b)<<1;

            a = sum;
            b = carry;
        }
        System.out.println(a);
    }

    private static void addWithoutArthematicNegaive(int a, int b) {
        while (b != 0) {
            if (b > 0) {
                a++;
                b--;
            } else if (b < 0) {
                a--;
                b++;
            }
        }
        System.out.println(a);
    }

    private static void addWithoutArthematic(int a, int b) {
        for (int i = 1; i <= b; i++) {
            a++;
        }
        System.out.println("a = " + a);
    }
}
