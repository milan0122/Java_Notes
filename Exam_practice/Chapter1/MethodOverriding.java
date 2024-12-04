package Exam_practice.Chapter1;
class Animal{
    void eat(){
        System.out.println("Animal eat grass, meat flesh ");
    }
}
class Cow extends Animal{
    void eat(){
        super.eat();
        System.out.println("Cow eats grass");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Cow x = new Cow();
        x.eat();
    }
    
}
