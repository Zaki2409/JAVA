package BASICS;
import java.util.*;

public class loops {
    public static void main (String argd[]) {
        System.out.println("give any number to find sum till it and its table till 10");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= n ; i++) {
            sum = sum +i;
            System.out.println(n*i);
        }
        System.out.println("the sum is " + " " + sum);
        sc.close();
    }

}
