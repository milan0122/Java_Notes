package Exam_practice.Chapter1;

 public class throwException {
//     static void checkAge(int age){
//        try{
//         if (age<18){
//             throw new ArithmeticException("You can't caste votes");
//         }
//         else{
//             System.out.println("You can caste vote");
//         }
//        }
//        catch (Exception e){
//         System.out.println("Exception:: " + e.getMessage());
//        }
//     }
    public static void main(String[] args) {
        // checkAge(20);
        // checkAge(23);
        // checkAge(15);

        try {
           int  a[] = new int[2];
           a[3] = 20;
        } catch (Exception e) {
            System.out.println("Exception::"+e.getMessage());
        
        }
    }
}
