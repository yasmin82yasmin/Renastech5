package day17;

public class C1Array1Dprac {
    public static void main(String[] args) {
        /* wap to enter a 1-d array and print the smallest number in that array

        wap to enter a 1-d array and print the largest number in that array
         */

        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Smallest element of the array is:: "+array[0]);
    }
}
