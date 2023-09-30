package AWT;




// imports
import java.awt.Button;
//import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



//main class
public class calci extends Frame implements ActionListener{
    TextField t;
    String s1, s2 ,s3 , sy;
    int op , n;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmulti,bdiv,bmod,bbck,beq,bc;

calci () {
    // frame
    // f = new Frame("Calculator");
    // f.setVisible(true);
    // f.setSize(300, 550);
    // f.setLayout(null);
    //text field
     //t.setEnabled(false);

   

    t = new TextField("" , 20);
    //t.setBackground(Color.GREEN);
    t.setBounds(2, 5, 20, 60);
    // buttons

    b1 = new Button("1");
    b2 = new Button("2");
    b3 = new Button("3");
    b4 = new Button("4");
    b5 = new Button("5");
    b6 = new Button("6");
    b7 = new Button("7");
    b8 = new Button("8");
    b9 = new Button("9");
    b0 = new Button("0");
    badd = new Button("+");
    bmulti = new Button("*");
    bsub = new Button("-");
    bdiv = new Button("/");
    bmod = new Button("%");
    bbck = new Button("BACK");
    beq = new Button("=");
    bc = new Button("CE");


    b1.setBounds(30, 200 , 50 ,50);
    b2.setBounds(90, 200 , 50 ,50);
    b3.setBounds(150, 200 , 50 ,50);
    b4.setBounds(30, 260 , 50 ,50);
    b5.setBounds(90, 260 , 50 ,50);
    b6.setBounds(150, 260 , 50 ,50);
    b7.setBounds(30, 320 , 50 ,50);
    b8.setBounds(90, 320 , 50 ,50);
    b9.setBounds(150, 320 , 50 ,50);
    badd.setBounds(30, 380 , 50 ,50);
    bmulti.setBounds(210, 320 , 50 ,50);
    bdiv.setBounds(210, 260 , 50 ,50);
    bsub.setBounds(90, 380 , 50 ,50);
    b0.setBounds(150, 380 , 50 ,50);
    bmod.setBounds(210, 380 , 50 ,50);
    bbck.setBounds(210, 200 , 50 ,50);
    beq.setBounds(210, 440 , 50 ,50);
    bc.setBounds(30, 440 , 50 ,50);
    //adding component
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b0);
    add(badd);
    add(bsub);
    add(bmulti);
    add(bdiv);
    add(bmod);
    add(bbck);
    add(beq);
    add(bc);
    add(t);


    b1.addActionListener(this);
    b0.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmulti.addActionListener(this);
    bdiv.addActionListener(this);
    bmod.addActionListener(this);
    beq.addActionListener(this);
    bbck.addActionListener(this);
    bc.addActionListener(this);
    t.addActionListener(this);










}





//main
public static void main(String args[]){
    calci myWindow = new calci();
    myWindow.setSize(700,700);
    myWindow.setVisible(true);
}


// action listeners method
public void actionPerformed(ActionEvent e){

if (e.getSource() == b0) {
s1 = t.getText();
s2 = "0";
s3 = s1 + s2;
t.setText(s3);
}
if (e.getSource()==b1) {
    s1 = t.getText();
    s2 = "1";
    s3 =s1 + s2;
    t.setText(s3);
    
}
 if ( e.getSource() == b2){
    s1= t.getText();
    s2 = "2";
    s3 = s1+s2;
    t.setText(s3);

}
 if (e.getSource() == b3){
    s1 = t.getText();
    s2 = "3";
    s3= s1+s2;
    t.setText(s3);

}
 if(e.getSource() == b4) {
    s1=t.getText();
    s2= "4";
    s3 = s1 +s2 ;
    t.setText(s3);

}
 if(e.getSource()==b5) {
    s1 = t.getText();
    s2 = "5";
    s3 = s1+s2;
    t.setText(s3);
}
 if ( e.getSource()==b6) {
    s1 = t.getText();
    s2 = "6";
    s3 =s1+s2;
    t.setText(s3);
}
 if ( e.getSource() == b7){
    s1= t.getText();
    s2 = "7";
    s3 = s1+s2;
    t.setText(s3);
 }
 if ( e.getSource() == b8){
    s1= t.getText();
    s2 = "8";
    s3 = s1+s2;
    t.setText(s3);

}
 if (e.getSource() == b9){
    s1 = t.getText();
    s2 = "9";
    s3= s1+s2;
    t.setText(s3);

}
 if(e.getSource() == bc) {

    t.setText(" ");

}
 if(e.getSource()==badd){
    s1= t.getText();
    t.setText(" ");
    op =1;
}
if(e.getSource()==bmulti){
    s1= t.getText();
    t.setText(" ");
    op =2;
}
 if(e.getSource()==bmod){
    s1= t.getText();
    t.setText(" ");
    op =3;
}
 if(e.getSource()==bdiv){
    s1= t.getText();
    t.setText(" ");
    op =4;
}
if(e.getSource()==bsub){
    s1= t.getText();
    t.setText(" ");
    op= 5;
}
 // issue print the reuslt after operation
if (e.getSource()== beq){
    //s2 = t.getText(); // here prOblem
    
     if(op==1)
			{
				//int n = Integer.parseInt(s1)+Integer.parseInt(s2);
                //t.setText(String.valueOf(n));
				t.setText("ADD");
                //t.setText(s2);
			}
           if(op==2)
			{
				// int n = Integer.parseInt(s1)*Integer.parseInt(s2);
				// t.setText(String.valueOf(n));
                t.setText("MULTI");
			}
            if(op==3)
			{
				// int n = Integer.parseInt(s1)%Integer.parseInt(s2);
				// t.setText(String.valueOf(n));
                t.setText("MOD");
			}
            if(op==4)
			{
				// int n = Integer.parseInt(s1)/Integer.parseInt(s2);
				// t.setText(String.valueOf(n));
                t.setText("DIV");
			}
            if(op==5)
			{
				// int n = Integer.parseInt(s1)-Integer.parseInt(s2);
				// t.setText(String.valueOf(n));
                t.setText("SUB");
			}
        }


// switch (  op) {
//   case 1 :  n =Integer.parseInt(s1) + Integer.parseInt(s2);
//            t.setText(String.valueOf(n));
//   break;
// }

}
}