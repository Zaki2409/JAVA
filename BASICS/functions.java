package BASICS;
import java.util.*;

public class functions {

    public static void printMyName(String name) {
    System.out.println(name);
    return;
    }
     
    public static void sumOfTwo(int a , int b) {
        int sum = a+b;
        System.out.println("sum of two number " + a + " and " +  b + " is " +  sum );
    }

    public static void Fact(int n) {
        if( n <0 ){
            System.out.println("Invalid");
            return;
        }else{
            int num= 1;
            for ( int i = n ; i >=1 ; i-- ) {
                num = num*i;
            }
            System.out.println("the factorial is " + num);
        }
    }


    public static void main(String args[]){
    //System.out.println("write your name");
    //System.out.println("Enter two numbers");
     System.out.println("write a number to find its facotrial");
    Scanner sc = new Scanner(System.in);
    //String name = sc.nextLine();
    //printMyName("your name is " + " " + name);
    //int a = sc.nextInt();
    //int b = sc.nextInt();
    //sumOfTwo(a, b);
    int num = sc.nextInt();
    Fact(num);
    sc.close();


}
}
