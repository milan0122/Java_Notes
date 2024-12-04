package Exam_practice.Chapter1;

import java.util.Scanner;

//taking input of 2 D matrxi and sum of elements
public class MultidimArrray {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row and coloumns::");
        n = sc.nextInt();
        m = sc.nextInt();
        int a [][] = new int[n][m];
        int b [][] = new int[n][m];
        int sumMatrix [][] = new int[n][m];

        System.out.println("Enter the elements of first matrix");
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter the elements of second matrix");
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                b[i][j]=sc.nextInt();

            }
        }

        //sum operation
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                sumMatrix[i][j]=a[i][j]+b[i][j];

            }
        }
        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
               System.out.print(sumMatrix[i][j]+"\t");

            }
            System.out.print("\n");
        }
    }
}
