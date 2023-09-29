package ALGO;

import java.util.Scanner;





public class bubble {

        
    public static int printNum(int arr[]) {
         System.out.println("the elemetns in increasing after sorting are");
    for ( int i = 0 ; i < arr.length ; i++) {
       System.out.println(arr[i] + " ");
    }
    System.out.println();
   
    return 1;
}
    public static int printNum1(int arr[]) {
         System.out.println("the elemetns in deacreaing after sorting are");
    for ( int i = 0 ; i < arr.length ; i++) {
       System.out.println(arr[i] + " ");
    }
    System.out.println();
   
    return 1;
}


    public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the sixe of the array");
        int size = sc.nextInt();
        int[] arr = new int[size] ;

        for (int i = 0 ; i < size ; i ++) {
          arr[i] = sc.nextInt();
        }
        System.out.println("the elemetns entered are");

        for(int i = 0 ; i <size ; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0 ; i <arr.length-1; i++) {
            for (int j =0 ; j < arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i <arr.length-1; i++) {
            for (int j =0 ; j < arr.length-i-1 ; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    printNum(arr);  
    printNum1(arr);
     sc.close();
    }
}
