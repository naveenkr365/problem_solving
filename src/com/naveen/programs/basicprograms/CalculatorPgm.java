package com.naveen.programs.basicprograms;

import java.util.Scanner;

public class CalculatorPgm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation: ");
        String op = sc.next();

        if(op.equals("+"))
            System.out.println("Addition result = "+(num1+num2));

        else if(op.equals("-"))
            System.out.println("Subtraction result = "+(num1-num2));

        else if(op.equals("*"))
            System.out.println("Multiplication result = "+(num1*num2));

        else if(op.equals("/"))
            System.out.println("Division result = "+(num2/num1));

        else
            System.out.println("Invalid operator");
    }

}
