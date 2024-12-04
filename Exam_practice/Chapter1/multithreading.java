//write a program to create two threads. The first thread should print 
//1 to 10 at interval of 0.5 second and the second thread should print
//11 to 20 at interval of 1 s
package Exam_practice.Chapter1;
class ThreadA extends Thread{
    public void run(){
        try{
            for (int i=1;i<=10;i++){
                System.out.println("ThreadA: "+i);
                //sleep(500);
            }

        }
        catch(Exception e){
            System.out.println("Exception occured due to::" + e.getMessage());
        }
    }
}
class ThreadB extends Thread{
    public void run(){
        try{
            for(int i = 11;i<=20;i++){
                System.out.println("ThreadB "+i);
                //sleep(1000);
            }

        }
        catch(Exception e){
            System.out.println("Exception occured due to::" + e.getMessage());
        }
    }

}
class ThreadC extends Thread{
    public void run(){
        try{
            for (int i=21;i<=30;i++){
                System.out.println("ThreadC: "+i);
                //sleep(500);
            }

        }
        catch(Exception e){
            System.out.println("Exception occured due to::" + e.getMessage());
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        ThreadA first = new ThreadA();
        ThreadB second = new ThreadB();
        ThreadC third = new ThreadC();
        first.setPriority(Thread.MAX_PRIORITY);
        second.setPriority(Thread.MIN_PRIORITY);
        third.setPriority(Thread.NORM_PRIORITY);
        first.start();
        second.start();
        third.start();
    }
    
}
