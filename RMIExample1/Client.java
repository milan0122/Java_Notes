package RMIExample1;
import java.rmi.*;
public class Client {
    public static void main(String[] args) {
        try{
            Adder a = (Adder)Naming.lookup("rmi://localhost/Adder");
            int s = a.add(34, 5);
            System.out.println("Sum = "+s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
       

    }
}
