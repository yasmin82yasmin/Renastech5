package day27;

public class Demo {
    public void main(String[] args) {


        B b = new B();
        b.setA(56);
        System.out.println(b.getA());
        b.show();
    }

    class A {
        int a;

        void show() {System.out.println("Hello");
        }

        int getA() {return this.a;}

        void setA(int a) { this.a = a; }

    }

    class B extends A {
        @Override
        void show() {
            System.out.println("Hi");
        }
    }

}
