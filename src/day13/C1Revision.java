package day13;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {
      /*
    WAP to enter marks in 5 subjects out of 100. If marks in any subject
    is less than 33 then it's a faliure.
    Your program should output the no. of subjects the person is failing in else it should print PASS.
	50
	60
	98
	58
	81
       */
        Float english, maths,science,history, computers ;
        Scanner scan = new Scanner(System.in);

        char option;
        do {
            System.out.println("Enter Marks in the Following subjects");
            System.out.println("English:");
            english = scan.nextFloat();
            System.out.println("Maths:");
            maths = scan.nextFloat();
            System.out.println("Science:");
            science = scan.nextFloat();
            System.out.println("History:");
            history = scan.nextFloat();
            System.out.println("Computers:");
            computers = scan.nextFloat();

            byte count = 0;
            if (english < 33) count++;
            else if (maths < 33) count++;
            else if (science < 33) count++;
            else if (history < 33) count++;
            if (computers < 33) count++;

            if (count >= 1) {
                System.out.println("The student is failing in " + count + " subjects");
            } else
                System.out.println("Press y to continue or any other key to stop!");
            option = scan.next() . charAt(0);
        }while (  option=='y' || option=='Y');
        System.out.println("Thanks For using");

    }
}
