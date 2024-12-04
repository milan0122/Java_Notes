package Exam_practice.Chapter1.File_handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//write a program to read from and write to files;
public class readwrite {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Exam_practice/Chapter1/File_handling/practice.txt");
        FileWriter fw = new FileWriter("Exam_practice/Chapter1/File_handling/practice1.txt");
        int c;
        while ((c=fr.read())!=-1) {
            fw.write(c);
            System.out.println((char)c);
            
        }
        fr.close();
        fw.close();
    }
}
