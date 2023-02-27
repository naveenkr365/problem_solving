package com.naveen.programs.recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 8;

        System.out.println(fibo(n));
    }

    private static int fibo(int n) {

        if(n==0)
            return 0;

        if(n==1)
            return 1;

        return fibo(n-1) + fibo(n-2);
    }
}
