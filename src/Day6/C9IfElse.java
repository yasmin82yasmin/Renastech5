package Day6;

public class C9IfElse {
    public static void main(String[] args) {
        int i =1, j=10;
        if(i==j)
            i = i + j;
        else
            i = ++i + j;

        System.out.println(i+"\n"+j);

    }
}
