package RMIExample2.client;
import RMIExample2.server.*;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the RMI registry
            Hello hello = (Hello) Naming.lookup("rmi://localhost/Hello");

            // Call the remote method
            System.out.println(hello.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

