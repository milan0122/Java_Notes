package Exam_practice.Chapter1;
import java.util.*;
public class SingleDimArray {
    public static void main(String[] args) {
        // int x, y;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number");
        // x = sc.nextInt();
        // System.out.println("Enter the second number");
        // y = sc.nextInt();

        // int sum = x + y;
        // System.out.println("Sum of two number = "+ sum);


        // array
        //  int [] array1 = new int[5];
        //  array1[0] = 5;
        //  array1[1] = 7;
        //  System.out.println("array"+array1[1]);

        //sum and average of all elements in array

        // int [] collections = {1,3,6,3,8,9};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int [] collections = new int[n];
        int sum = 0;
        System.out.println("Enter the elements of array:: ");
        for (int x = 0 ;x<n;x++){
            collections[x]= sc.nextInt();
            sum = sum + collections[x];

        }
        float average = sum / collections.length;
        System.out.println("Sum of elements in arrya:: "+ sum);
        System.out.println("Average of elements in arrya:: "+ average);



    }
}
