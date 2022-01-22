package day17;

import java.util.Scanner;

public class C5Array2D {
    public static void main(String[] args) {
         /*
        WAP to enter the dimensions (no. of rows and colums) of a 2-D array and then enter the
        elements and print them. also, print the sum and avrage of the elements.*/

        Scanner scan = new Scanner(System.in) ;
        System.out.println("enter the no. rows of the array");
        int r = scan.nextInt();
        System.out.println("enter the no. columns of the array");
        int c = scan.nextInt();
        int arr[][] = new int[r][c] ;

        System.out.println("enter the elements of the array");
        for (int i=0; i<arr.length ; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("entered array is: ");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }

    }
}
