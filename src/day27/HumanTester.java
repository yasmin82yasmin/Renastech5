package day27;

public class HumanTester {

}

// ABSTRACTION : Can be acheved in 2 ways
//1) Abstract class(partial implementitaion of abstraction
//2)Interface (full implementation of abstraction
interface LivingThing{

   // internally it becomes : public abstract void breathe();
   void breathe();
    //public void breathe();
    //abstract void breathe();
    //abstract public void breathe();
}

//Human "is-a" livingThing
//a class implements an interface while a class extends another class
//LivingThing is the parent interface of the Human class
abstract class Human implements LivingThing{

    // an abstract class can contain abstract as well as mon-abstract methods
    void eat(){System.out.println("Human is eating pizza");}
    abstract void work();
}
// Engineer "is-a" Human
class Engineer extends Human{
    void work(){System.out.println("Engineer is working...");}
    public void breathe(){System.out.println("Engineer is breathing");}
}