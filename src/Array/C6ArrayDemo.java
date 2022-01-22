package Array;

import java.util.Scanner;

public class C6ArrayDemo {
    public static void main(String[] args) {
       /*
       WAP ENTER THE size of a double array.
       then input the values of the array and find sum and average of all the values.
        */
        System.out.println("Enter the size of double array");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        double[] arr = new double[a];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Values of the array "+(i+1)+":");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total +=arr[i];
            System.out.println("sum: " + total);

        }
        double average = total / arr.length;

        System.out.format("The average is:" + average);
    }
}
