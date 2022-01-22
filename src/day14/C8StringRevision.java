package day14;

import java.util.Scanner;

public class C8StringRevision {

    // wap to count the number of digits in a string
    // output
    // enter a string;
    // Hello 123
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count= 0;
        System.out.println("Please write in a String : ");
        String name = scn.nextLine();
        for (int j = 0; j < name.length(); j++) {
            if(name.charAt(j)>47 && name.charAt(j)<58){
                count++;
            }
        }
        System.out.println("Digit number of word is :" + count);






    }
}
