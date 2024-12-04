package Exam_practice.Chapter1;

class Rectangle {
    int length;
    int breadth;
    int height;
    
    public Rectangle(int l ,int b, int h){
       length =l;
        breadth =b;
        height = h;

    }

}
class Area extends Rectangle {
    //since we're using parametrized constructor so that we must call constructor from the subclass using super()
    Area(int l, int b ){
        super(l, b,0);
    }

    void getArea(){
         int area = length * breadth;
        System.out.println("Area of rectangle: "+area);
    }

}
class Volume extends Rectangle{
    Volume(int l, int b, int h ){
        super(l, b,h);
    }
    void getVolumne(){
        int volume = length * breadth * height;
        System.out.println("Volume of rectangle: "+ volume);
    }
    }


public class InheritenacePra {
    public static void main(String[] args) {
        Area a = new Area(20, 20);
        a.getArea();
        Volume v = new Volume(20, 30, 5);
        v.getVolumne();
    }
}
