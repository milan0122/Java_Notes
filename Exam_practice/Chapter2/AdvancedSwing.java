package Exam_practice.Chapter2;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
/*
 In advancedSwing we practicr three components 
 1. List ->  by JList() constructor
 2. Table -> by JTable(data,column_name);
 3.JTree -> consist of root node and child node, instance of node defined by DefaultMutableTreeNode under class JTree()
 */
public class AdvancedSwing extends JFrame{
    AdvancedSwing(){
        setSize(600,600);
        setTitle("Advanced Swing Practice:List,Table,Trees");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //List
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        String food[]={"Vegetables","Fruit","Meat"};
        JList <String> list = new JList<>(food);
        // p1.setBorder(null);
        add(p1,BorderLayout.WEST);
        p1.add(list);
        p1.setBorder(BorderFactory.createLineBorder(Color.blue,2));

        //Trees
        DefaultMutableTreeNode foods = new DefaultMutableTreeNode("Food");
        
        DefaultMutableTreeNode veg = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode fruit= new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode meat = new DefaultMutableTreeNode("Meat");
        
        DefaultMutableTreeNode potato= new DefaultMutableTreeNode("Potato");
        
        DefaultMutableTreeNode cauli= new DefaultMutableTreeNode("Cauliflower");
        DefaultMutableTreeNode brinjal= new DefaultMutableTreeNode("Brinjal");
        DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode banana = new DefaultMutableTreeNode("banana");
        DefaultMutableTreeNode chicken = new DefaultMutableTreeNode("chicken");
        foods.add(veg);
        foods.add(fruit);
        foods.add(meat);
        veg.add(potato);
        veg.add(cauli);
        veg.add(brinjal);
        fruit.add(apple);
        fruit.add(banana);
        meat.add(chicken);
        JTree tree = new JTree(foods);
        add(tree,BorderLayout.EAST);
        //creat table
        String col[] = {"Vegetables","Fruit","Momo"};
        String items [][]={{"potato","cauliflower","laddyfinger"},{"apple","banana","cherry"},{"chicken","mutton","buff"}};
        JTable table = new JTable(items,col);
        JScrollPane sp = new JScrollPane(table);
        add(sp,BorderLayout.CENTER);
        pack();

        
        

    }
    public static void main(String[] args) {
        new AdvancedSwing();
    }
    
}
