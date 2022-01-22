package codereview19thjan;

public class ThisSuperDemo {
    public static void main(String[] args) {
        /*
        How the below statement executes:
        - run all the static blocks from the parent class to the child in top to bottom order
        - runs init blocks and constructors of each class from parent to the child
        - runs the overriding method
         */

        new Kids() . m1();
    }
}
class Base {
    void m1(){System.out.println("Hello");}
    static {System. out.println("London");}
    Base() {
        System.out.println("Chao");
    }

    {System.out.println("Apple");}

}


class Kids extends Base{
    static {System. out.println("Paris");}
    {System.out.println("Mango");}

    void m1(){System.out.println("Hi");}

    Kids(){
        System.out.println("slaw");
    }
}
