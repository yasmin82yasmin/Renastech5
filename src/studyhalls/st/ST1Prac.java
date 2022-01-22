package studyhalls.st;

import java.util.Scanner;

public class ST1Prac {


        /*
        ***********CALCULATOR*********
        * Enter 2 NUMBERS
        * 2.2
        * 3
        * 1.ADD
        * 2.SUB
        * 3.MULTI
        * 4.DIVI
        * 5. MODULUS
        * choose and option from above
        * 1
        * result = 5.2
        * press y to continue or any other key to stop
        * n
        * thanks for using calculator
         */
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("********CALCULATOR********");

                char ch;
                do{
                        System.out.println("Enter 2 numbers");
                        double num1 = scan.nextDouble() ;
                        double num2 = scan.nextDouble() ;
                        System.out.println("1. Add\n" +
                                "2. Subtraction\n" +
                                "3. Multiplication\n" +
                                "4. Division\n" +
                                "5. Modulus");
                        System.out.println("Choose an option from above");
                        byte option=  scan.nextByte() ;

                        switch(option){
                                case 1 :
                                        System.out.println("Result = "  + add(num1,num2) ) ;
                                        break ;

                                case 2 :
                                        System.out.println("Result = "  + subtract(num1,num2) ) ;
                                        break ;

                                case 3 :
                                        System.out.println("Result = "  + multiply(num1,num2) ) ;
                                        break ;

                                case 4 :
                                        System.out.println("Result = "  + divide(num1,num2) ) ;
                                        break ;

                                case 5 :
                                        System.out.println("Result = "  + modulus(num1,num2) ) ;
                                        break ;
                        }
                        System.out.println("Press y to continue or any other key to stop");
                        ch = scan.next() . charAt(0) ;

                }while(ch=='y' || ch=='Y') ;

                System.out.println("*****Thanks for using calculator*****");
        }

        static double multiply(double num1, double num2) {
                return num1*num2;
        }

        static double divide(double num1, double num2) {
                return num1/num2;
        }

        static double modulus(double num1, double num2) {
                return num1%num2;
        }

        static double subtract(double num1, double num2) {
                return num1-num2;
        }

        static double add(double num1, double num2) {
                return num1+num2;
        }
}
