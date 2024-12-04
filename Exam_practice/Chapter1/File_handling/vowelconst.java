package Exam_practice.Chapter1.File_handling;

import java.io.*;
import java.util.*;
//Write a program to read an input string from the user and
// write the vowels of that string in VOWEL.TXT and consonants in CONSONANT. TXT.
public class vowelconst {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine().toLowerCase();
        FileWriter vowel = new FileWriter("Exam_practice/Chapter1/File_handling/vowels.txt");
        FileWriter conso = new FileWriter("Exam_practice/Chapter1/File_handling/consonants.txt");

        for(int i= 0;i<input.length();i++){
            char c = input.charAt(i);
            if (
                c == 'a'|| c=='e'|| c=='i'|| c=='o'||c=='u'
            ){
                vowel.write(c);
                vowel.write(" ,");
            }
            else{
                conso.write(c);
                conso.write(",");
            }
        }
        vowel.close();
        conso.close();
    }
}
