package Exam_practice.Chapter2;
import javax.swing.*;
public class customDialog extends JFrame{
    JButton b1,b2;
    customDialog(){
        JLabel lbl = new JLabel("Are you sure to submit?");
        lbl.setBounds(10,20,280,40);
        b1 = new JButton("OK");
        b1.setBounds(30,60,40,40);
        b2 = new JButton("Cancel");
        b2.setBounds(80,60,40,40);
        JDialog jd = new JDialog(this, "Confirmation");
        jd.add(lbl);
        jd.add(b1);
        jd.add(b2);
        jd.setVisible(true);
        jd.setLocation(50,50);
        jd.setSize(300,300);
        setSize(600,600);
        setTitle("parent Frame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new customDialog();
    }
    
}
