package Exam_practice.Chapter1.File_handling;

import java.io.*;

public class creatFile {
    //let's first create file
    public static void main(String[] args) throws IOException {
        /*File myFile = new File("Exam_practice/Chapter1/File_handling/practice.txt");
        myFile.createNewFile();
        
        //writing the file using bytestream ie. FileOutputStream
        FileOutputStream fo = new FileOutputStream("Exam_practice/Chapter1/File_handling/practice.txt");
        String s = "Hello world , My name is Milan Dangi\n currently i am  pursing my under graduation at AMC ";
        //convert string into byte code
        byte b[] = s.getBytes();
        fo.write(b);
        fo.close();
        */

        //reading data from files;
        FileInputStream fi = new FileInputStream("Exam_practice/Chapter1/File_handling/practice.txt");
        int i;
        while (( i = fi.read()) != -1) {
            System.out.print((char)i);
           
        }
        fi.close();


    }
}
