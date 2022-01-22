package day14;

import groovy.json.JsonOutput;

import java.util.Scanner;

public class C7StringRevision {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        System.out.println("Enter the character to find index for:");
        char ch = scan.next().charAt(0);
        System.out.println("\nusing for loop");
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                System.out.println("index of'" +ch+ "' is  " + i);

            }




        }
    }
}
