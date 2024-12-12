package Exam_practice.Chapter2;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class PopupMenuExample extends JFrame {
    PopupMenuExample(){
        JFrame frame = new JFrame("PopupMenu Example");
        PopupMenu pm = new PopupMenu("Edit");
        MenuItem copy, paste;
        copy = new MenuItem("Copy");
        paste = new MenuItem("Paste");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pm.add(copy);
        pm.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                pm.show(frame,e.getX(),e.getY());
            }
        });
        frame.add(pm);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
