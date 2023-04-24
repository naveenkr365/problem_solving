package com.naveen.programs;

public class Pattern {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        //pattern5(5);
       // pattern6(5);
        //pattern7(5);
        //pattern8(5);

    }

    /* Print the following Patter
          *
         ***
        *****
       *******
      *********

     */
    private static void pattern7(int n) {

        for (int i=0; i<n; i++){
            //Space
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //Stars
            for (int j=0; j<(2*i+1);j++){
                System.out.print("*");
            }
            //Space
            for (int j=0; j>n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Print the following Patter
     *********
      *******
       *****
        ***
         *
     */
    private static void pattern8(int n) {

        for (int i=n-1; i>=0; i--){
            //Space
            for (int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            //Stars
            for (int j=(2*i+1); j>0;j--){
                System.out.print("*");
            }
            //Space
            for (int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Print the following pattern
     1 2 3 4 5
     1 2 3 4
     1 2 3
     1 2
     1

     */
    private static void pattern6(int n) {

        for(int i=n; i>0; i--){
            int count=1;
            for (int j=n; j>n-i; j--){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    /* Print the following pattern
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    private static void pattern5(int n) {
        for(int i=n; i>0; i--){
            for (int j=n; j>n-i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    /* Print the following pattern
     1
     2 2
     3 3 3
     4 4 4 4
     */
    private static void pattern4(int n) {
        for (int i=1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    /* Print the following pattern
     1
     1 2
     1 2 3
     1 2 3 4
     */
    private static void pattern3(int n) {
        for (int i=1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


    /* Print the following pattern
     *
     * *
     * * *
     * * * *
     */
    private static void pattern2(int n) {
        for (int i=0; i<n; i++){
            for (int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /* Print the following pattern
      * * * *
      * * * *
      * * * *
      * * * *
    */
    private static void pattern1(int n) {

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
