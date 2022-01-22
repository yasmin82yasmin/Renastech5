package day15;

public class C6StringMethods {
    public static void main(String[] args) {
       // anything in double quotes in a pool string object
        String s1 = "Hello-Slav";
        String s2 = "Hello-Slav";

        s2 = new String(s2);
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }

}
