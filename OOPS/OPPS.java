package OOPS;


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




    }



 }


