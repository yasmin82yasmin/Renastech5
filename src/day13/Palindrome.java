package day13;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
// WAP to enter a number and check if its a palindrome or not.
        int num,reverse=0,copy ,r;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        copy=num;
        while(num>0)
        {
            r=num%10;
            reverse=(reverse*10) +r;
            num=num/10;
        }
        if(copy == reverse)
            System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }
}
