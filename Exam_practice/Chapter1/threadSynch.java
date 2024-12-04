package Exam_practice.Chapter1;
//write the synchorize function
class Table{
    synchronized void printTable(int n){
        System.out.println("Table of "+n);
        //we're simply calculating for table of n using for loop
        for (int i=1;i<=10;i++){
            System.out.print(i*n+ "\t\t");
        }
        System.out.println("");
        try {
            //wait 1s 
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyThread extends Thread{
    Table t;
    int n;
    //constructor
    MyThread(Table t, int n){
        this.t = t;
        this.n = n;
    }

    public void run(){
        t.printTable(n);

    }
}
public class threadSynch {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread m1 = new MyThread(t,5);
        MyThread m2 = new MyThread(t, 6);
        m1.start();
        m2.start();


    }
}
