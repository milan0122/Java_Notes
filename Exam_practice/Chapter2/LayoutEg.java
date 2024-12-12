package Exam_practice.Chapter2;
/*in SI.java i mentioned all most all types of Layout manager
here we're going to practice GroupLayout manager which groups the components in
sequence or parralel order
*/
import java.awt.*;
import javax.swing.*;

public class LayoutEg extends JFrame {
    JButton b1, b2, b3, b4;

    LayoutEg() {
        // Setup the JFrame
        setTitle("GroupLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        
        // Get the content pane and set GroupLayout
        Container p = getContentPane();
        GroupLayout gl = new GroupLayout(p);
        p.setLayout(gl);
        
        // Enable automatic gap creation
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);
        
        // Initialize buttons
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        
        // Define the horizontal group to place buttons b1, b2, and b3 in the same row
        gl.setHorizontalGroup(
            gl.createSequentialGroup()
                .addComponent(b1)  // First button
                .addComponent(b2)  // Second button
                .addComponent(b3)  // Third button
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(b4) // Fourth button in the same column as b3
                )
        );
        
        // Define the vertical group to place b3 and b4 in the same column
        gl.setVerticalGroup(
            gl.createSequentialGroup()
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3) // b3 in the same row as b1 and b2
                )
                .addComponent(b4) // b4 will be below b3, in the same column
        );
        
        // Use pack() to resize the window based on the components
        pack();
        
        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutEg();
    }
}
