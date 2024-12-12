//Write a program to calcu
package Exam_practice.Chapter2;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class SI extends JFrame implements ActionListener{

    JLabel p, t, r;
    JButton si;
    JTextField ptxt, txt, rtxt ,sitxt;
SI(){
    JFrame  f= new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(500,400);
    p = new JLabel("Enter the Principal");
    t = new JLabel("Enter the time");
    r = new JLabel("Enter the rate");
    ptxt = new JTextField(20);
    txt = new JTextField(20);
    rtxt = new JTextField(20);
    si = new JButton("Calculate SI");
    si.addActionListener(this);
    sitxt = new JTextField(20);
   //f.setLayout(new FlowLayout(FlowLayout.CENTER,150,20));
    
    f.add(t);
    f.add(txt);
   f.add(r);
    f.add(rtxt);
    f.add(si);
    f.add(sitxt);
    //applying grid Layout
    //f.setLayout(new GridLayout(4,2,20,30));

    //let's create GridBagLayout
    f.setLayout(new GridBagLayout());
    GridBagConstraints cst = new GridBagConstraints();
    //add principle label and text field in one row
    cst.fill= GridBagConstraints.HORIZONTAL;
    cst.gridx=0;
    cst.gridy=0;
    f.add(p,cst);
    cst.gridx=1;
    f.add(ptxt,cst);
    cst.gridx = 0;
    cst.gridy=1;
    f.add(t,cst);
    cst.gridx=1;
    f.add(txt,cst);
    cst.gridx = 0;
    cst.gridy=2;
    f.add(r,cst);
    cst.gridx=1;
    f.add(rtxt,cst);
    cst.gridx = 1;
    cst.gridy=3;
    cst.gridwidth=2;
    cst.insets= new Insets(5,5 ,5,5);
    f.add(si,cst);

    cst.gridx=1;
    cst.gridy=4;
    cst.gridwidth=1;
    f.add(sitxt,cst);



    
    f.setVisible(true);
    

}
public void actionPerformed(ActionEvent e){
    int x,y,z;
    x = Integer.parseInt(ptxt.getText());
    y = Integer.parseInt(txt.getText());
    z = Integer.parseInt(rtxt.getText());
    double si = (x*y*z)/100;
    sitxt.setText(String.valueOf(si));
}
public static void main(String[] args) {
    new SI();
   
}
}
