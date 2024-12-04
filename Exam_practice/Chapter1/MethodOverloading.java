package Exam_practice.Chapter1;
class Sum{
    public int sum(int a,int b){
        return a + b;
    }
    public int sum(int a,int b,int c){
        return a + b + c;
    }
}
public class MethodOverloading{
public static void main(String[] args) {
    Sum s1 = new Sum();
    int x = s1.sum(5,7,9);
    System.out.println("Sum of 3 numbers :" + x);
}
}