package Exam_practice.Chapter2;
import java.awt.FlowLayout;

//Internal frame similar to regular frame which can be resize,close, maximize or minimize
//Internal frame are added to desktop frame and desktop frame to JFrame
import javax.swing.*;
public class IFPractice extends JFrame{
   IFPractice(){
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Parent Frame");
    
    JDesktopPane jdp = new JDesktopPane();
    JInternalFrame jif = new JInternalFrame("Internal Frame",true,true,true,true);
    JLabel lb = new JLabel("Enter name");
    JTextField tx = new JTextField(20);
    jif.add(lb);
    jif.add(tx);
    jif.setSize(400,400);
    jif.setLayout(new FlowLayout(FlowLayout.CENTER));
    jif.setVisible(true);
    jdp.add(jif);
    add(jdp);
    setVisible(true);

   }
   public static void main(String[] args) {
    new IFPractice();
   }
    

    
}
