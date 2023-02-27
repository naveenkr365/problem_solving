package com.naveen.programs.recursion;

public class SumArray {

    static int[] arr = {1,3,5,7,9};

    public static void main(String[] args) {

        int sum = sumOfArray(arr.length-1);
        System.out.println(sum);
    }

    private static int sumOfArray(int n) {

        if(n==0){
            return arr[n];
        }
        return arr[n]+sumOfArray(n-1);
    }
}
