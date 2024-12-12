package Exam_practice.Chapter2;
import java.awt.*;

import javax.swing.*;
public class practiceSwing extends JFrame {
    practiceSwing(){
        // String s = "Picture";
        // ImageIcon icon = new ImageIcon("/Users/milandangi/Downloads/images.jpeg","picture");
        // JLabel s1 = new JLabel(icon);
        // JLabel s2 = new JLabel("Select the course");
        // JCheckBox items1 = new JCheckBox("CSIT");
        // add(items1);
        // items1 = new JCheckBox("BCA");
        // add(items1);
        // items1 = new JCheckBox("BIM");
        // //use of comboBox
        // String course[] = {"CSIT","BIM","BCA","BIT"};
        // JComboBox jb = new JComboBox<String>(course);
        // add(jb);
        //setLayout(new FlowLayout());
        JPanel p = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add(s1);

        //Menu components
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        
        //create the menu items
        JMenuItem new1, open, copy,cut, save1,  save_as ,exit;
        new1 = new JMenuItem("New");
        open = new JMenuItem("Open");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        save1 = new JMenuItem("Save");
        save_as = new JMenuItem("Save As");
        exit = new JMenuItem("Exit");
        file.add(new1);
        file.add(open);
        JMenu save = new JMenu("Save");
        file.add(save);
        file.add(exit);
        mb.add(file);
        save.add(save1);
        save.add(save_as);
        edit.add(copy);
        edit.add(cut);
        mb.add(edit);
        p.add(mb);


        //use of JSlider
        JSlider js = new JSlider(1,100);
        js.setMajorTickSpacing(10);
        js.setMinorTickSpacing(2);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
      
       // p.setBorder(BorderFactory.createRaisedBevelBorder());
       //p.setBorder(BorderFactory.createLineBorder(Color.blue,20));
      // p.setBorder(BorderFactory.createEtchedBorder(Color.blue, Color.yellow));
       p.setBorder(BorderFactory.createEtchedBorder(40, Color.blue, Color.yellow));
        p.add(js);
        add(p);
        setVisible(true);
    }
    public static void main(String[] args) {
       practiceSwing s= new practiceSwing();
       s.pack();
    }
}
