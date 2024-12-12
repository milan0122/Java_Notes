package Exam_practice.Chapter2;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.*;

public class DialogPractice {
    
    DialogPractice(){
        JFrame f = new JFrame("Dialog Practice");
        //let first practic confirm dialog box
        //JOptionPane.showConfirmDialog(f, "Are your sure to exit?", "Confirmation",JOptionPane.YES_NO_OPTION);

        /*let's take input from the input dialog box and sum it and display to user using 
        message dialog box
        */
        String num1 = JOptionPane.showInputDialog(f,"Enter first number");
        String num2 = JOptionPane.showInputDialog(f,"Enter the second number");

        //for output
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        int z = x + y;
        JOptionPane.showMessageDialog(f, "sum =" + z, "sum of two integer",JOptionPane.PLAIN_MESSAGE);
        //to display output in frame
        JLabel l = new JLabel("Sum = ");
        JTextField value = new JTextField();
        value.setText(String.valueOf(z));
        f.add(l);
        f.add(value);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
       

    }
    public static void main(String[] args) {
        new DialogPractice();
    }
}
