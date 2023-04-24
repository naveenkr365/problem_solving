package com.naveen.programs.basicprograms;

import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Welcome " +name+". Have a Nice day!!!" );
    }
}
