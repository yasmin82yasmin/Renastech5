package day27;

public class Test {
    public static void main(String[] args) {
        My m = new Foo()  ;
        Tempo t = (Tempo)m; //down-casting
        Foo f = (Foo) t   ;//down-casting
    }

}

interface My{}

abstract class Tempo implements My{}

class Foo extends Tempo{}