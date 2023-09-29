package ALGO;
import java.util.*;

public class linear {

    
    public static void main (String args[]) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

    //INPUT
    for ( int i = 0 ; i < array.length ; i++  ) {
        array[i] = sc.nextInt();
    }
    System.out.println("the given array elements are");
    //elements shown here
    for ( int i = 0 ; i < array.length ; i++ ) {
        System.out.println(array[i]);
    }
    System.out.println("enter the number you want to find");
    int x = sc.nextInt();
    //OUTPUT
    for ( int i = 0 ; i < array.length ; i++) {
        if(x == array[i]){
            System.out.println("the index at which" + x + " is present is" + i);
        }
        
        
    }

  sc.close();
    }
}
