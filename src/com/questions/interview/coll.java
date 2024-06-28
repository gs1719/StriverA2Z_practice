package com.questions.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class coll {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a ="+a+" "+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a+" "+"b="+b);

        Scanner Sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        System.out.println("Enter elements for list respectively");
        for(int i=0;i<5;i++){
            list1.add(Sc.nextInt());
        }for(int i=0;i<5;i++){
            list2.add(Sc.nextInt());
        }for(int i=0;i<5;i++){
            list3.add(Sc.nextInt());
        }for(int i=0;i<5;i++){
            list4.add(Sc.nextInt());
        }for(int i=0;i<5;i++){
            list5.add(Sc.nextInt());
        }
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        map.put(1,list1);
        map.put(2,list2);
        map.put(3,list3);
        map.put(4,list4);
        map.put(5,list5);

        System.out.println(map.get(3).toString());


    }
}
