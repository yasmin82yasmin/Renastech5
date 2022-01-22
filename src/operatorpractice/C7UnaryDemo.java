package operatorpractice;

public class C7UnaryDemo {
    public static void main(String[] args) {
        int i=1;

        int r = ++i + i++ + ++i + ++i + i++ ;


        System.out.println(r);
        System.out.println(i);



    }
}
