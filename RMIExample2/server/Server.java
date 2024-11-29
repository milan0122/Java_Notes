package RMIExample2.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a registry on port 1099 (default RMI port)
            LocateRegistry.createRegistry(1091);

            // Create an instance of HelloImpl and bind it to the RMI registry
            HelloImpl hello = new HelloImpl();
            Naming.rebind("rmi://localhost/Hello", hello);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
