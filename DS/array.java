package DS;

import java.util.Scanner;

public class array {
    public static void main(String args[]) {
       
        // 1 DIMENSIONAL ARRAY

        int[] array = new int[3];
        array[0] = 97;
        array[1] = 98;
        array[2] = 99;
        int[] array1 = {1,2,3,4,5};
        System.out.println(array1);
        System.out.println(array1[2]);
        System.out.println(array[2]);



        //2 DIMENSIONAL ARRAY
        
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr2 = new int[r][c];

        for (int i =0
         ; i < r ; i++) {
            for ( int j =0 ; j< c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("the elements of matrix is");

        for(int i = 0 ; i <r ; i++){
            for (int j =0 ; j <c ; j++) {
                System.out.println(arr2[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("enter a number of wich u need index");
         int x = sc.nextInt();
         for (int i =0 ; i < r ; i++) {
            for(int j =0 ; j< c ; j++) {
                if(arr2[i][j] == x) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
         }
    

         sc.close();



    }
}
