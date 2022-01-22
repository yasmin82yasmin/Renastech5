package Array;

import java.util.Scanner;

public class C4ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float temp[] = new float[10];
        /*System.out.println("Enter a temprature of temp[0]");
        temp[0] = scan.nextFloat();
        System.out.println("Entered temprature is: " + temp[0]);*/
        System.out.println("Enter a tempratures of 10 cities");

        for (int i=0; i<temp.length; i++){
            temp[i] = scan.nextFloat();
        }
        System.out.println(("\nEntered tempratures are:"));
        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
        }

    }
}
