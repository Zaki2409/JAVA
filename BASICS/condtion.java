package BASICS;
import java.util.Scanner;




public class condtion {
    public static void main (String args[]) {
    
     //if and else conditional statement 

      /*Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      if(a ==b) {
        System.out.println(a + " and  " + b  +  "are equal");
      }
      else{
        if(a > b) {
            System.out.println(a + " is greater than  " + b  );
          } else {
            System.out.println(b + " is greater than  " + a );
          }
      }
     sc.close();*/

   // if and else if conditional statement


     /*Scanner sc1 = new Scanner(System.in);
      int c = sc.nextInt();
      int d = sc.nextInt();
      
      if(c ==d) {
        System.out.println(c + " and  " + d  +  "are equal");
      }
      else if(c > d) {
            System.out.println(c + " is greater than  " + d  );
          } else {
            System.out.println(c + " is greater than  " + d );
          }
      
     sc1.close();*/
   // switch and break 

   Scanner sc2 = new Scanner(System.in);
   int Button = sc2.nextInt();

   switch (Button) {
    case 1 : System.out.println("helllo");
    break;
    case 2 : System.out.println("salam ");
    break;
    case 3 : System.out.println("bonjour");
    break;
    default: System.out.println("invalid option");

    }
    sc2.close();






     
    }
}
