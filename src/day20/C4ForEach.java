package day20;

import java.util.Scanner;

public class C4ForEach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter the element of the array");

        int [] a= new int[5];
        for (int i=0; i< a.length; i++){
            a[i] = scan.nextInt();
        }
        System.out.println("Enter element are");

        for (int i : a ){
            System.out.print(i+" ");
        }
    }
}
