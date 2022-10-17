package com.naveen.programs;

public class ReverseEachWord {
    public static void main(String[] args) {
        String in = "This is Test Class";
        reverseString(in);

    }

    private static void reverseString(String in) {
        String[] str = in.split(" ");
        String out = "";
        for(int i=0; i< str.length; i++){
            for(int j= str[i].length()-1; j>=0; j--){
                out = out + str[i].charAt(j);
            }
            out = out + " ";
        }
        System.out.println(out);
    }
}