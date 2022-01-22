package day14;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {

        // Scanner is a referenced data type as it is a class
        // Scan : a reference variable OR reference OR reference variable
        Scanner scan = new Scanner(System.in);


        // using the object reference of the scanner calss,
        // in built methods of scanner class cen be called

        System.out.println("Enter a number: ");
        //if (scan.hasNextInt()) {
        // int value = scan.nextInt();
        //System.out.println("Valid int entered: " + value);

        //}
        //else{
        //System.out.println("No. entered is not a valid int");
        //}

        // below loop makes sure tahat a valid int number is
        // entered by the user
        while( !scan.hasNextInt()){
            System.out.println("please enter a valid int number");
            scan.nextLine();
        }

        //after making suer taht the valid int nymber is entered,
        //that number is scanned by the nextInt method.
        int value = scan.nextInt();
        System.out.println("Entered int value is: " + value);


    }


}
