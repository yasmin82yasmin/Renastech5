package day14;

import java.util.Scanner;

public class C6StringDemo {
    public static void main(String[] args) {

       /* String s1 = "Drum";
        System.out.println(s1.indexOf('u'));

        //
        //WAP TO ENTER A STRING AND THEN ASK THE USER THE ENTER A CHARACTER
        // TO FIND ITS INDEX IN THE ENTERED STRING AND PRINT THE INDEX
        // OUTOUT
        // Hello Bello
        // enter the character to find index for:
        // e
        // index of 'e' is 1*/


        System.out.println("enter a string");
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("enter the character index for:");
         char ch = scan.next().charAt(0);

         if(str.indexOf(ch) == -1)
             System.out.println("character '" + ch+ "'is not there!");
         else
             System.out.println("index of '"+ch+ "' is " + str.indexOf(ch));




    }
}
