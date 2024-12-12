package Exam_practice.Chapter2;
import java.awt.Color;

import javax.swing.*;
public class fileColor extends JFrame{
    fileColor(){
        
        setLayout(null);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //for filechoose
        // JFileChooser jf = new JFileChooser();
        // jf.showOpenDialog(this);
        //forcolorchooser
        JPanel p = new JPanel();
        JColorChooser cc = new JColorChooser();
        Color c = cc.showDialog(p, "Select new color", Color.blue);
        p.setBackground(c);
        add(p);
        setVisible(true);

    }
    public static void main(String[] args) {
        new fileColor();
    }
}
