package com;

import java.util.Scanner;

public class test2_3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String word = Sc.nextLine();
        word=word+" ";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 0 ; i< word.length()-1;i++){
            char ch = word.charAt(i);
            char ch1 = word.charAt(i+1);
            if(ch==ch1 && count < 9 )
                count++;
            else{
                result.append(count).append(ch);
                count = 1;

            }

        }
        System.out.println(result);
    }



}


/*
*
* class Solution {
public:
    string compressedString(string word) {
        string result = "";
        int count = 0;
        for(int i = 0 ; i< word.size();i++){
            if(word[i]==word[i+1] && count < 9 )
                count++;
            else{
                result += count + word[i];
                count = 0;

            }

        }
        return result;


    }
};
*
*
*
*
* */