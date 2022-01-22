package day18;

public class C3MethodsDemo {
    public static void main(String[] args) {
        //any variable declared inside a method is called a local variable

        int i=10;
       m1();
        System.out.println("Hello People!");
    }
    static void m1(){
        m2();
        int j=50;//local variable
        System.out.println("m1 method");
    }
    static void m2(){
        int k=30;
        System.out.println("m2 method");

    }
}
