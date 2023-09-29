package DS;

import java.util.Scanner;

public class strings {
    public static void main (String args[]) {

     // basic

         Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);


     // contcatenation 
        // String fname = sc.nextLine();
        // String sname = sc.nextLine();
        // String full = fname + sname;
        //  System.out.println(full);
    // cahr at

    // for ( int  i = 0 ; i  < full.length() ; i++){
    //     System.out.println(full.charAt(i));
    // }
   // comapre 

    // if(sname.compareTo(fname) == 0) {
    //     System.out.println("Stringd are equal");
    // }else {
    //     System.out.println("Strings are NOT equal");
    // }

    // substring 
    // String sent = "my name is zaki";
    // String name = sent.substring(11, sent.length());
    // System.out.println(name);




      /////////////// STRING BUILDER ////////////
      StringBuilder sb = new StringBuilder("MOHAMMED");
      System.out.println(sb);
      System.out.println(sb.charAt(0));
      sb.setCharAt(0, 'm');
      System.out.println(sb);
      sb.insert(4, 'z');
      System.out.println(sb);
      sb.delete(4, 5);
      System.out.println(sb);
      sb.append("Z");
      System.out.println(sb);
      sb.setCharAt(0, 'M');
      System.out.println(sb);
 
    ////////// REVERSE //////
    StringBuilder sb1 = new StringBuilder("mohammed");
    for (int i = 0 ; i < sb1.length()/2 ; i++) {
        int front = i ;
        int back = sb1.length() - 1 -i;

        char fc =   sb1.charAt(front);
        char bc = sb1.charAt(back); 
        
        sb1.setCharAt(front, bc );
        sb1.setCharAt(back, fc);

    }
    System.out.println(sb1);


    
        sc.close();
        
    }

    
}
