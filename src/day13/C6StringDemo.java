package day13;

public class C6StringDemo {
    public static void main(String[] args) {

        char ch1 = 'a';
        char ch2 = '5';
        char ch3 = '(';
// string is a sguence
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        String str = "a5(";
        System.out.println(str);

        int len = str.length();
        System.out.println(len);

        String str2 = "a5(";

        System.out.println(str == str2);

        str="Hello" ; str2="hello";
        System.out.println(str==str2);

    }
}
