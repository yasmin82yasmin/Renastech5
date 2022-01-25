package day27;

public class PetTester {
    public static void main(String[] args) {

        //upcasting; a parente reference can refer to the child class object
        Labrador dog1 = new Labrador();
        Dog dog2 = new Labrador();
        Pet dog3 = new Labrador();
    }
}
abstract class Pet{
    abstract void play() ;

}

// Dog "is-a" Pet
abstract class Dog extends Pet{

    }
//Labrador "is-a" Dog
//Labrador "is-a" Pet
class Labrador extends Dog{
    void play(){
        System.out.println("Cute Labrador is playing....");
    }

}