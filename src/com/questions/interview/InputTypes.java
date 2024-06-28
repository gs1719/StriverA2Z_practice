package com.questions.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String s = br.readLine();
        System.out.println(s);
        System.out.println("Enter the Integer");
        Integer i = Integer.parseInt(br.readLine());
        System.out.println(i);
    }

}
