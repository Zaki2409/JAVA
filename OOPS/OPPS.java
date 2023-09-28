package OOPS;
//import BANK.Bank;


class Pen {

    String color; 
    String type;



    public void write() {
        System.out.println("write's good");
    }

    public void writebetter() {
        System.out.println("writes even better");
    }
}


class Student{

    String name;
    int age;        
    
    public void stdinfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
                                                
    Student() {
        System.out.println("this is a non parametried contrucotr");//if this(priority) is not written in a class, java auto create one in its object.
    }
}

class Studentt{
    String name;
    int age;

    public void stdinfo2() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Studentt(String name , int age){
        this.name= name;
        this.age=age;
    }

}

class Studenttt{
    String name;
    int age;

    public void stfinfo3() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Studenttt( Studenttt s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    Studenttt(){
        
    }
}

class Polyl{
    // this is func over loading 
    String name;
    int age;
    String sub;
    // now i have to create func with same name but diff code...differ should be either in num of args or return type or arg type

    public void printinfo(String name) {
        System.out.println(name);
    }
    public void printinfo(String sub , int age){
        System.out.println(sub+ " " + age);

    }
    public void printinfo(int age){
        System.out.println(age);
    }

}

 // Inheritance 
 
  class Shape {
    public void area() {
    System.out.println("area");
  }
}

// 1 lvl (single inherit)
 class Triangle extends Shape {
    public void area(int l , int h) {
        System.out.println(0.5*l*h);
    }
 }
 // 2 lvl ( multi inherit)
 class Eqitria extends Triangle {
    public void area(int l , int h) {
        System.out.println(0.5*l*h);
    }
 }
// heirachi  inherti  (using same parent calss)
class Cirlce extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

// Acesse modifiers 

class Bank  {
     String name; //default 
     public String eamil; // public
     protected String Acctype; // protected
     private String pass; // praivet only acessed they getter and setter function

     
         //getter funcion
         public String getPass() {
            return this.pass;
         }
         // setter function
         public void setpass(String pass) {
            this.pass=pass;
         }


}

// Abstract 

abstract class Animal{
    abstract void walk();
    Animal() {
        System.out.println("you are creating an animal");
    }
    public void eat() {
   System.out.println("Animal Eat");
    }
   
}
 
class Horse extends Animal {

    Horse () {
        System.out.println("you have created a horse");
    }
    public void walk() {
        System.out.println("walks on 4");
    }
    public void eat() {
        System.out.println("Horse Eat");
         }
}

class Chiken extends Animal {
    public void walk() {
        System.out.println("walks on 2");
    }
}

// interface and multiple inhertiance
interface Animals {
    void walks();           // here only  define and not implement code
}
interface Herbivore{
    void eatgrass();          // function is just deined , need to implement somewhere
}
                                     
class Dog implements Animals , Herbivore { //  multiple inhertiance
    public void walks() {
        System.out.println("dog walks on 4 legs");
    }
    public void eatgrass() {
        System.out.println("this is herbocorere");
    }
}




 
    


///////////////////////////////
///////////////////////////////
///////////////////////////////   MAIN CLASS 
///////////////////////////////
///////////////////////////////

public class OPPS {
    
    public static void main(String agrs[]){
        //classes and object
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.color="red";
        p2.color="black";
        p1.type="ballpoint";
        p2.type="gel";
        p1.write();
        p2.writebetter();



        //non parametrised contructor
        Student s1 = new Student();
        s1.name="zaki";
        s1.age=20;
        s1.stdinfo();


        //parametrised construtor
        Studentt s2 = new Studentt("zaki" , 19);
        s2.stdinfo2();

        // copy contructor
        Studenttt s3 = new Studenttt();
            s3.name = "zakikhan";
            s3.age = 18;
          
        Studenttt s4 = new Studenttt(s3);
        s4.stfinfo3();


       //Polymorphism (func overloading)
       Polyl pl1 = new Polyl();
       pl1.name="zaki";
       pl1.age=12;
       pl1.sub="java";
       pl1.printinfo(pl1.sub , pl1.age );

      // inheritanfe lvl 1 
      Triangle t1 = new Triangle();
      t1.area();
      t1.area(4, 2);
 
     // pacakge (bank)
     //BANK.Bank a1 = new BANK.Bank();
     
     
       Bank b1 = new Bank();
       b1.name= "punjabbank";
       b1.eamil="mzk";
       b1.Acctype="debit";
       b1.setpass("this is Password");
       System.out.println(b1.getPass());
    //Abstraction
    Horse h1 = new Horse();
    h1.walk();
        
    //Animal a1 = new Animal();   un comment this to see thhe error
    
    // interfaces
     Dog  d1 = new Dog();
     d1.walks();
     d1.eatgrass(); // multiple inhertance

    }

  


 }


