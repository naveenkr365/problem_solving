package com.naveen.programs.basicprograms;

public class Biggest2Nos {
    public static void main(String[] args) {

        bigTwoNums(17,14);

    }

    private static void bigTwoNums(int x, int y) {

        if (x>y)
            System.out.println("The biggest Num between "+x+" & "+y+" is "+x);
        else
            System.out.println("The biggest Num between "+x+" & "+y+" is "+y);
    }
}

