package com.naveen.programs.basicprograms;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int i=1, fib=0,a=0,b=1;
        System.out.println("The Fibonacci series for "+num+" are");
        while(i<=num){
            fib = fib+a;
            a=b;
            b=fib;
            System.out.println(fib);
            i++;
        }
    }
}
