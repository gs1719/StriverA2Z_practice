package com.strivera2z.recursion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyElement {
    public static void main(String[] args) {
        int[] arr = new int[]{10,5,10,15,10,5,1};

        String s = "Hello World";
        usingMap(s.toCharArray());
        usingLoop(s);
    }

        public static void usingLoop(String str){

            char[] arr = str.toCharArray();

            System.out.println("Using Loops");
            int length = arr.length;
            int[] newarr = new int[length];

            for (int i = 0; i < length ; i++) {
                int count=1;
                if(newarr[i] != 0||arr[i]==' '){
                    continue;
                }
                for (int j = i+1; j < length; j++) {
                    if(arr[i]==arr[j]){
                        count++;
                        newarr[j]=1;
                    }
                }
                System.out.println(arr[i]+"=="+count);
            }

        }
    public static void usingMap(char[] arr){
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        /*
        * {10,5,10,15,10,5,1};
        * */
        System.out.println("Using Map Interface ");
        for (char ele : arr) {
            if(ele==' ')
                continue;
            hashMap.put(ele, (hashMap.getOrDefault(ele, 0))+1);
        }
        for(char key: hashMap.keySet()){
            System.out.println(key+"==="+hashMap.get(key));
        }
    }
}
