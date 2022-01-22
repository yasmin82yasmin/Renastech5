package day15;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class C3Eguals {
    public static void main(String[] args) {
        /*String str = "slav";
        System.out.println(str.equals("Slav"));
        System.out.println(str.equals("SLAV"));
        System.out.println(str.equalsIgnoreCase("SlaV"));
        /*
        Wap to validate usarname and pasword
         */
        // username; procoder
        //pasword; juT7%$
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scan.next();
        System.out.println("Enter pasword");
        String pasword = scan.next();

        if(username.equalsIgnoreCase(username) && pasword.equalsIgnoreCase(pasword)){
            System.out.println("login succesful");
        }else {

            System.out.println("login unsuccesful");
        }
    }
}
