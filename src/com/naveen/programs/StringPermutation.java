package com.naveen.programs;

import java.util.ArrayList;

public class StringPermutation {

    static ArrayList<String> result= new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(getPermutation("", "ABC"));

        /*String s = "ABC";
        String out = s.substring(0,0)+s.substring(1);
        System.out.println(out);*/

    }
    static ArrayList<String> getPermutation(String f, String u){
        if(u.length()==0) {
            result.add(f);
            return result;
        }
        for(int i=0;i<u.length();i++) {
            String fixed = f + u.charAt(i);
            String unFixed = u.substring(0,i)+ u.substring(i+1);
            getPermutation(fixed, unFixed);
        }

        return result;
    }
}
