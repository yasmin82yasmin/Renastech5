package Ternary;

public class NestedTernaryOperator {
    public static void main(String[] args) {
         int n1 = 2, n2 = 9, n3 = -11;

         int largest = (n1 >= n2) ? ( (n1 >= n3)  ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("largest Number: " + largest);
    }
}
