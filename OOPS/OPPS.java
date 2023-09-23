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









    }

















 }
