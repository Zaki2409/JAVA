class Zaki{

    String name;
    int age;
    int marks;

    public void prit(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
    Zaki(Zaki z2) {
     System.out.println("this is a constructor");
     this.name= z2.name;
     this.age = z2.age;
     this.marks = z2.marks;
  
      
    }
    public Zaki() {
    }
    
    
}



public class PRAC {
   public static void main(String args[]) {
     Zaki z1 = new Zaki();
     z1.age=20;
     z1.name="zaki";
     z1.marks=100;
     z1.prit();
     Zaki z2 = new Zaki(z1);
     z2.prit();
   }  
}
