package RMIExample1;
import java.rmi.*;
public interface Adder extends Remote {
    //define the abstract class
    public int add(int x , int y) throws RemoteException;
     
}
