package ALGO;

import java.util.Scanner;

public class selection {
         
    public static int printNum(int arr[]) {
         System.out.println("the elemetns  after selection sorting are");
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
            int smallest  = i;
            for (int j =i+1 ; j < arr.length ; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = arr[j];
                    
                }
            }
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;

        }
        
    printNum(arr);  
  
     sc.close();
    }
}
