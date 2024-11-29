package RMIExample1;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class Server{
    public static void main(String[] args) {
        try{
            LocateRegistry.createRegistry(354);
            Adder adder = new AdderRemote();
            Naming.rebind("rmi://localhost/Adder",adder);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
    

