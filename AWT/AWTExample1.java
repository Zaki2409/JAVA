package AWT;
import java.awt.*;    

public class AWTExample1 extends Frame{
    public static void main(String args[]){
    Frame f = new Frame("AWT1");

    Label l1 = new Label("username");
    Label l2 = new Label("password");

    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    

    Button b1 = new Button("submit");

    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(t2);
    f.add(b1);


    f.setLayout(new FlowLayout()); // important

    f.setSize(500, 500);
    f.setVisible(true);
    }
}
