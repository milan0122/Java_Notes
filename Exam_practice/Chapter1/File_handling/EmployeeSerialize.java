package Exam_practice.Chapter1.File_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.jar.Attributes.Name;

class Employee implements Serializable{
    String name;
    int age;
    String department;
    Employee(String n, int a, String dep){
        name = n;
        age = a;
        department = dep;
    }
    @Override
    public String toString(){
        return "Name: "+name + "\nAge:" + age + "\nDeapartment: "+department;
    }

}
public class EmployeeSerialize {
    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee("Milan Dangi", 20, "Technical");
        Employee emp2 = new Employee("Suraj Rana",30,"Testing");
        
        FileOutputStream fo = new FileOutputStream("Exam_practice/Chapter1/File_handling/employee.txt");
        ObjectOutputStream out = new ObjectOutputStream(fo);
        out.writeObject(emp1);
        out.writeObject(emp2);
        out.close();
        fo.close();
        
    

        //read object from file
       try {
        FileInputStream fi = new FileInputStream("Exam_practice/Chapter1/File_handling/employee.txt");
        ObjectInputStream in = new ObjectInputStream(fi);
        // read objects;
        Employee em1 = (Employee) in.readObject();
        Employee em2 = (Employee) in.readObject();
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        in.close();
        fi.close();
       } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print(e.getStackTrace());
        
       }

    }
}
