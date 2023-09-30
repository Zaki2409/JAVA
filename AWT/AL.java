package AWT;
import java.awt.*;
import java.awt.event.*;

public class AL extends Frame implements ActionListener,TextListener {
        TextField text = new TextField("0" , 20);
        Button b,b1,b2,b3;
        private int numClicks = 0;
        TextField t1 = new TextField("0" , 20);
        TextField t2 = new TextField("0" , 20);

        public static void main(String[] args) {
                AL myWindow = new AL("My first window");
                myWindow.setSize(700,200);
                myWindow.setVisible(true);
        }

        public AL(String title) {

                //super(title);
                setLayout(new FlowLayout());
                //addWindowListener(this);
                b = new Button("Click me");
                b1 = new Button("Click1 me");
                b2 = new Button("Click2 me");
                b3 = new Button("Click3 me");

                add(b);
                add(b1);
                add(b2);
                add(b3);
                add(text);
                add(t1);
                add(t2);
                t2.setEnabled(false);
                b.addActionListener(this);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                t1.addTextListener(this);
                 text.addTextListener(this);
        }

        public void actionPerformed(ActionEvent e) {
                // if(e.getActionCommand().equals("Click me")) {
                //         numClicks++;
                //         text.setText("Button Clicked " + numClicks + " times");
                // } 
                if(e.getSource() == b) {
                        numClicks++;
                        text.setText("Button Clicked " + numClicks + " times");
                } 
                else if (e.getActionCommand().equals("Click1 me"))
                {
                        numClicks--;
                         text.setText("Button Clicked " + numClicks + " times");
                }  
                else if (e.getActionCommand().equals("Click2 me"))
                {
                        numClicks+=2;
                         t1.setText("Button Clicked " + numClicks + " times");
                } 
                else if (e.getActionCommand().equals("Click3 me"))
                {
                        numClicks-=2;
                         t1.setText("Button Clicked " + numClicks + " times");
                }  
                //t1.setText(e.getActionCommand());    
        }

        // public void windowClosing(WindowEvent e) {
        //         dispose();
        //         System.exit(0);
        // }


        public void textValueChanged(TextEvent e) {
                // TODO Auto-generated method stub
                // if (e.getSource() == text)
                // {
                //      b1.setLabel("hi");   
                // }
                // else if (e.getSource() == t1)
                // {
                //      b2.setLabel("hi");   
                // }
                //t1.setText(text.getText());
                t2.setText(String.valueOf(Integer.parseInt(text.getText()) + Integer.parseInt(t1.getText())));
        }

        // public void windowOpened(WindowEvent e) {}
        // public void windowActivated(WindowEvent e) {}
        // public void windowIconified(WindowEvent e) {}
        // public void windowDeiconified(WindowEvent e) {}
        // public void windowDeactivated(WindowEvent e) {}
        // public void windowClosed(WindowEvent e) {}

}