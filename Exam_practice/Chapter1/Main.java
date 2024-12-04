package Exam_practice.Chapter1;

class Rectangle {
    int length;
    int breadth;
    int height;

    public Rectangle(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    
    // Static method to calculate the area of a rectangle
    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Static method to calculate the volume of a 3D rectangle
    public static int calculateVolume(int length, int breadth, int height) {
        return length * breadth * height;
    }
}

class Area extends Rectangle {
    public Area(int l, int b) {
        super(l, b, 0);  // 2D rectangle (height = 0)
    }
    
    public Area(int l, int b, int h) {
        super(l, b, h);  // 3D rectangle
    }

    void displayArea() {
        int area = calculateArea(length, breadth);
        System.out.println("Area: " + area);
    }

    void displayVolume() {
        int volume = calculateVolume(length, breadth, height);
        System.out.println("Volume: " + volume);
    }
}

public class Main {
    public static void main(String[] args) {
        Area area = new Area(5, 3);
        area.displayArea();  // Static method used for 2D
        
        Area volume = new Area(5, 3, 2);
        volume.displayVolume();  // Static method used for 3D
    }
}
