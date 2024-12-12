package Exam_practice.Chapter2;

import javax.swing.*;

public class ToolTipExample {
    ToolTipExample(){
        JFrame frame = new JFrame("Tool tip example");
        JLabel lbl = new JLabel("Password:");
        lbl.setBounds(100,200,80,30);
        JPasswordField ltxt = new JPasswordField(20);
        ltxt.setBounds(200,200,100,40);
        ltxt.setToolTipText("Enter the Password");
        frame.add(lbl);
        frame.add(ltxt);
        frame.setLayout(null);
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

    }
    public static void main(String[] args) {
        new ToolTipExample();
    }
}
