package codereview23rddec;

import java.util.Scanner;
/*  WAP to count the number of digits, lower case alphabets,
upper case alphabets, special characters(like %,* etc) and
spaces in a string.
Unicode values corresponding to the digits are 48 to 57.
OUTPUT:
------
Enter a string:
Hello 123*&
Digits in the entered string: 3
Upper case letters: 1
Lower case letters: 4
Spaces: 1
Special characters: 2

Press y to continue or any other key to stop*/

public class StringReview {
    public static void main(String[] args) {
        int count=0;
        Scanner ya = new Scanner(System.in);
        int lower_case =0, upper_case =0, digits =0, special =0, spaces =0;
        System.out.println("Enter a string");
        String str = ya.nextLine();
        for (int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >=48  && ch <=57)digits++;


            else if (ch>=97 && ch<122)lower_case++;
            else if (ch>=65 && ch<122)upper_case++;
            else if (ch==32)spaces++;
            else if ( (ch>=33 && ch<=47) || (ch>=58 && ch<=64) ||
                      (ch>=91 && ch<=96) || (ch>=123 && ch<=126) ) special++ ;
        }
        System.out.println("Digit count : " + digits);


                }

}
