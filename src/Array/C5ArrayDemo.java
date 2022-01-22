package Array;

import java.util.Scanner;

public class C5ArrayDemo {
    /* wap to enter the size of the array, from the user.
    Then input all the values of the array from the user.
    Then print all the values of the array
     */
    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        System.out.println("Enter size of array");
        int a;
        a = ya.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the values");
        for (int i= 0; i<arr.length; i++){
            arr[i] = ya.nextInt();
        }
        System.out.println("entered values are: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }



    }
}
