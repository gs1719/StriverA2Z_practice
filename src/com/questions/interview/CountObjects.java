package com.questions.interview;

public class CountObjects {
    static int count;
    CountObjects(){
        count++;
    }
    public static void main(String[] args) {
        CountObjects countObjects = new CountObjects();
        CountObjects countObjects1 = new CountObjects();
        CountObjects countObjects2= new CountObjects();
        CountObjects countObjects3 = new CountObjects();
        CountObjects countObjects4 = new CountObjects();
        System.out.println("Number of objects created");
        System.out.println(count);
    }
}
