package yasemin;

import java.util.Locale;
import java.util.Scanner;

public class Yasemin1 {
    public static void main(String[] args) {
       /* String name = "Yasemin Apacik";
        System.out.println("name:" + name);
        System.out.println("First char:" + name.charAt(0));
        System.out.println("Lenght:" + name.length());
        System.out.println("LowerCase:" + name.toLowerCase());
        System.out.println("UpperCase:" + name.toUpperCase());
        System.out.println("Substring:" + name.substring(10,13));*/

       /* String s = "Shell";
        String str = s.replace("Sh" , "p");
        System.out.println(s + "\n" + str);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s2 = scan.nextLine();
        System.out.println(s2.replace('a' , '&') );

        Scanner ya = new Scanner(System.in);
        System.out.println("Enter a String");
        String s3 = scan.nextLine();
        System.out.println(s3.replace('i','*'));*/
/*
        String str = "Slav";
        String s = str.substring(0);
        System.out.println(s);
        System.out.println(str.equals("slav"));
        System.out.println(str.equals("SLAV"));
        System.out.println(str.equalsIgnoreCase("Slav"));*/

Scanner scan = new Scanner(System.in);
String UserName = "yasemin";
String Pasword = "1234*";
        System.out.println("Enter UserName");
        String Uname = scan.next();
        System.out.println("Enter Pasword");
        String Pass = scan.next();
if( Uname.equalsIgnoreCase(UserName) && Pass.equals(Pasword)) {
    System.out.println("login succesful");
}else{
        System.out.println("login unsuccesful");

}




    }
}
