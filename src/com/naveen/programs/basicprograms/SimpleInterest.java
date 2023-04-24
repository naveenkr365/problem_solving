package com.naveen.programs.basicprograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pricipal amount:");
        float p = sc.nextFloat();
        System.out.println("Enter tenure:");
        int n = sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        float r = sc.nextFloat();

        float simpleInterest = (p*n*r)/100;

        System.out.println("Simple Interest - "+simpleInterest);

    }
}
