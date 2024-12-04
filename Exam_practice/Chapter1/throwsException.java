package Exam_practice.Chapter1;

public class throwsException {
    void divide (int x , int y) throws ArithmeticException{
        int divide = x/y;
        System.out.println("Division of two numbers:"+divide);
    }
    public static void main(String[] args) {
        throwsException t1 = new throwsException();
        try {
            t1.divide(20, 0);
            t1.divide(20, 3);
        } catch (Exception e) {
            System.out.println("Exception Occured::" + e.getMessage());
        }
    }
}
