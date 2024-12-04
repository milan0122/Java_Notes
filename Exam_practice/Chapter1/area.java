package Exam_practice.Chapter1;
import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    
    public void getData(){
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:: ");
        length = s.nextInt();
        breadth = s.nextInt();
    }
    public void display(){
        int area = length * breadth;
        System.out.println(
          "Area of rectangle:: " + area);
    }
}
public class area {
    public static void main(String[] args) {
       Rectangle r = new Rectangle();
       r.getData();
       r.display();
    }
}
