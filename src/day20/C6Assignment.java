package day20;

import java.util.Scanner;

public class C6Assignment {

    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);

        s = scan.next() + " slaw" + " salam";
        System.out.println(s);
        System.out.println(
                s = scan.nextInt() * scan.nextInt() + "yes" + "no"
        );
        System.out.println(s);
    }
}