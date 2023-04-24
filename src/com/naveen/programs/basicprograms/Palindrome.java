package com.naveen.programs.basicprograms;

public class Palindrome {

    public static void main(String[] args) {

        checkPalidrome("madam");
    }

    private static void checkPalidrome(String str) {
        String rev="";
        for(int i=str.length()-1; i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str))
            System.out.println("String is Palidrome - "+rev);
        else
            System.out.println("String is not a Palidrome - "+rev);
    }


}
