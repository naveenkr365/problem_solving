package com.naveen.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckAnagram {

    public static void main(String[] args) {
        String input1 = "bat";
        String input2 = "abt";
        //Output: [["bat","abt","tab"],["cat","tac"],["abs"]]

        //  1. check if anagram
       // 2. group it with its respectiver anagaram

        groupAnagram(input1, input2);

    }
    private static void groupAnagram(String input1, String input2) {
        char[] c1 = input1.toCharArray();
        char[] c2 = input2.toCharArray();
        boolean flag = true;
        Arrays.sort(c1);
        Arrays.sort(c2);
        int i=0;
        if(c1.length == c2.length){
            while(i<c1.length){
                if(c1[i]!=c2[i]){
                    flag=false;
                    break;
                }
                i++;
            }
        }

        else flag=false;

        if(flag){
            System.out.println("Its an anagram");
        }
        else System.out.println("Not an anagram");




    }

    private static void removeNum(int[] arr, int n) {
        int[] temp = new int[arr.length];
        int i = n - 1; //2-1
        int j = 0;
        while (i < arr.length) {
            if (i % 2 == 0) {
                temp[j] = arr[i];
            }
            i = i + 2;
            j++;
        }
        for(int nn : temp)
            System.out.print(nn);

    }


}
