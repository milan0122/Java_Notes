/*
 * You are hired by a reputed software company which is going to design an application for
 *  "Movie Rental System". Your responsibility is to design a schema named MRS and create a table 
 * named Movie(id, Title, Genre, Language, Length). Write a program to design a GUI form to take
 *  input for this table and insert the data into table after clicking the OK button.
 */

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MRS implements ActionListener{
    JFrame f = new JFrame();
    JLabel l1, l2, l3, l4, l5 ;
    JTextField id, title, genre, language, duration;
    MRS(){
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(6,2));
        l1 = new JLabel("Enter ID:");
        l2 = new JLabel("Enter title: ");
        l3 = new JLabel("Enter genere:");
        l4 = new JLabel("Enter Language:");
        l5 = new JLabel("Enter duration: ");
        id = new JTextField(20);
        title = new JTextField(20);
        genre = new JTextField(20);
        language = new JTextField(20);
        duration= new JTextField(20);
        JButton ok = new JButton("Ok");
        ok.addActionListener(this);
        f.add(l1);
        f.add(id);
        f.add(l2);
        f.add(title);
        f.add(l3);
        f.add(genre);
        f.add(l4);
        f.add(language);
        f.add(l5);
        f.add(duration);
        f.add(ok);
        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand()=="Ok"){
            int ID = Integer.parseInt(id.getText());
            String Title = title.getText();
            String Genre = genre.getText();
            String Language = language.getText();
            double Duration = Double.parseDouble(duration.getText());
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/MRS", "root","MySql46.@");
                String Query = "Insert Into Movie values(?,?,?,?,?)";
                PreparedStatement ps = cn.prepareStatement(Query);
                ps.setInt(1, ID);
                ps.setString(2, Title);
                ps.setString(3, Genre);
                ps.setString(4, Language);
                ps.setDouble(5, Duration);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(f, "Data inserted successfully");
        
            } catch (SQLException se) {
                System.out.println(se.getErrorCode());
                se.printStackTrace();
            }


        }
    }
    public static void main(String[] args) {
        new MRS();
    }
    
    
}
