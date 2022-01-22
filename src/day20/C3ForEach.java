package day20;

public class C3ForEach {
    public static void main(String[] args) {
        //loop types
        //for loop
        //while loop
        //do while loop
        //for each loop

        int[] numbers={1,2,3,4,5};
        for (int eachNumber : numbers){
            //for each loop will store each element from the
            //numbers list in each iteration from first one to last one
            System.out.println(eachNumber);
        }
        String[] names= { "yas", "Volk", "Huseyin"};

        //for each string name in the array names
        for(String name : names){
            System.out.println(name);
        }
        String sentence="Hello lovely java People!";
        //split method to store everything in the array
        String[] words = sentence.split(" ");


        System.out.println("Using for each-loop");
        for (String word : words){
            System.out.println(word);
        }

        //for each loop does not need to have starting and ending point
        //it will check everything you have in the list, array

        System.out.println("Using for loop");
        for (int i = 0; i < words.length ; i++){
            System.out.println(words[i]);
        }
        int [] numberList={1,2,5,20,4,-8,9,100};
        for(int number : numberList){
            System.out.print("hello");
            System.out.println("number");
        }
    }
}
