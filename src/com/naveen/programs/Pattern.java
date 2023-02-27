package com.naveen.programs;

public class Pattern {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        pattern4(5);
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
