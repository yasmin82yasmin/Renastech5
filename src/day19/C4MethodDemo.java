package day19;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C4MethodDemo {
    public static void main(String[] args) {

        System.out.println(add(5.2, 1.1) ) ;

        parrot();
        return ;
    }
    static void parrot(){
        System.out.println("Konk konk!!");
    }
    static double add (double a, double b){
        System.out.println("Jay-Z");
        return a+b;
    }
}
