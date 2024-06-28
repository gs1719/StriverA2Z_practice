package com.questions.interview;

public class string {
    public static void main(String[] args) {
        String s = "12345";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum+=Character.getNumericValue(s.charAt(i));
        }
        System.out.println("sum = " + sum);
    }

}
