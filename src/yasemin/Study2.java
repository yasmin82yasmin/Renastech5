package yasemin;

import java.util.Scanner;

public class Study2 {
    public static void main(String[] args) {

        int arr[][] = {
                {4,5,6,7},
                {3,4,5},
                {1,2,3,4}
        };
        int sum=0;

        for (int i=0; i< arr.length; i++){



            for (int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }



    }


}
