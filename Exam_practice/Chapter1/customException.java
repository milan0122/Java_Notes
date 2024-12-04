package Exam_practice.Chapter1;

class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }

}
class ValidateAge{
    static void checkAge(int age) throws InvalidAge{
        if (age<18){
            throw new InvalidAge("You can't caste vote, you are young age");
        }
        else {
            System.out.println("You can caste vote ");
        }
    }
}
public class customException {
    public static void main(String[] args) {
        try {
            ValidateAge.checkAge(20);
            ValidateAge.checkAge(12);
        } catch (Exception e) {
            System.out.println("Exception::"+e);
        }
    }
}
