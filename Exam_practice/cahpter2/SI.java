//Write a program to calcu
package Exam_practice.cahpter2;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class SI extends JFrame implements ActionListener{

    JLabel p, t, r;
    JButton si;
    JTextField ptxt, txt, rtxt ,sitxt;
SI(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p = new JLabel("Enter the Principal");
    t = new JLabel("Enter the time");
    r = new JLabel("Enter the rate");
    ptxt = new JTextField(20);
    txt = new JTextField(20);
    rtxt = new JTextField(20);
    si = new JButton("Calculate SI");
    si.addActionListener(this);
    sitxt = new JTextField(20);
    setLayout(new FlowLayout(FlowLayout.CENTER,150,20));
    add(p);
    add(ptxt);
    add(t);
    add(txt);
    add(r);
    add(rtxt);
    add(si);
    add(sitxt);
    

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
    SI s = new SI();
    s.setVisible(true);
}
}
