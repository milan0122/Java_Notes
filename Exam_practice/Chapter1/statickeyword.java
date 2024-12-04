package Exam_practice.Chapter1;


class  Test {
    static int x = 20;
    int y = 10;
    // we can access static members and methods in non-static methods but vice-versa can't do
    //in static method, we can only access static variables 
    void display(){
        System.out.println(x + y);
    }
    static void display2(int x , int y){
        int sum = x + y;
        System.out.println("Sum: "+ sum);

    }

}
class Test1 extends Test{
    int z = 30;
    void display1(){
        System.out.println(x+y+z);
    }
}
public class statickeyword {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        Test1 oj1 = new Test1();
        oj1.display();
        Test.x = 100;
        oj1.display1();
        Test.display2(29, 0);
    }
}
