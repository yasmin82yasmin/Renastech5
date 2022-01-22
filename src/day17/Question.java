package day17;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in) ;
        System.out.println("enter the rows");
        int r = ya.nextInt();
        System.out.println("enter the column");
        int c = ya.nextInt();
        int arr[][] = new int[r][c] ;

        System.out.println("enter the elements of the array");
        for (int i=0; i<arr.length ; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = ya.nextInt();
            }
        }
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];

                double average = sum / arr.length;

                System.out.format("The average is:" + average);
            }
            System.out.println();
    }


    }
}
