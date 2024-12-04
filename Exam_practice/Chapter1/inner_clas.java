package Exam_practice.Chapter1;

//we can define class inside the class such that we can access private data members of outer class
class Shape{
    private int length;
    Shape(int l){
        length = l;
    }
    class Square {
        public void getSqPerm(){
           int  perm = 4 * length;
           System.out.println("Perimeter of Square:"+ perm);
        }
    }
}
public class inner_clas {
    public static void main(String[] args) {
        Shape s1 = new Shape(8);
        Shape.Square sq = s1.new Square();
        sq.getSqPerm();
    }
}
