package day14;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class C5StringDemo {
    public static void main(String[] args) {
        String s = "Tom";

        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();

        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s == s2.intern());
    }
}
