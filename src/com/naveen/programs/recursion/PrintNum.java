package com.naveen.programs.recursion;

public class PrintNum {

    public static void main(String[] args) {
        //print(4);
        printBacktrack(1, 4);
    }

    private static void printBacktrack(int i, int j) {

        // 4,3,2,1

        if(i>j)
            return;

        printBacktrack(i+1,j);
        System.out.println(i);
    }

    private static void print(int i) {

        if(i < 1)
            return;

        System.out.println(i);
        print(i-1);



    }

}
