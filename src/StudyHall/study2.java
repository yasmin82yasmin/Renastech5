package StudyHall;

public class study2 {
    public static void main(String[] args) {
        int n1 = 2, n2 = 9, n3 = -11;


        // nested ternary operator
        // to find the largest number
        int smallest = (n1 <= n2) ? ((n1 <= n3) ? n1 : n3) : ((n2 <= n3) ? n2 : n3);
        System.out.println("Largest Number: " + smallest);
    }



}
