package OOPS;


class Pen {

    String color;
    String type;



    public void write() {
        System.out.print("write's good");
    }

    public void writebetter() {
        System.out.print("writes even better");
    }
}



public class OPPS {
    
    public static void main(String agrs[]){
        
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.color="red";
        p2.color="black";
        p1.type="ballpoint";
        p2.type="gel";
        p1.write();
        p2.writebetter();
    }
 }
