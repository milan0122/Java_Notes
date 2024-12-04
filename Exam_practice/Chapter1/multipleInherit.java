package Exam_practice.Chapter1;
class Add{
    int  a =10;
    int sum(int b){
        return a + b;
    }

}
interface Addvalue {
    int x = 20;
    void display();
} 
class Calculate extends Add implements Addvalue{
    int mul = x * a;
    int sum = sum(20);
    public void display(){
        System.out.println("Sum :"+sum);
        System.out.println("Product :"+mul);
    }
   
}
public class multipleInherit {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.display();
    }
}
