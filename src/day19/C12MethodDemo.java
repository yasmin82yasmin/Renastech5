package day19;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class C12MethodDemo {

    public static void main(String[] args) {

        int myArray[] = show();
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    static int[] show(){
        System.out.println("Hello");

        int arr[] = {10, 20, 30, 40};
        return arr ;

        //if a method returns a value, that returned can be stored in a variable
        //or may not be stored in a variable or it can be used as an argument for another method.
    }
}