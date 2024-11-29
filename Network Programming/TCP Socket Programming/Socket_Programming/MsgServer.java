

import java.net.*;
import java.io.*;
import java.util.*;

public class MsgServer {
    public static void main(String[] args) throws IOException {
        //register services port 
        ServerSocket ss = new ServerSocket(1254);
        System.out.println("Server Started");
        System.out.println("Waiting for the client ...");

        //wait 
        Socket cs = ss.accept();
        System.out.println("Client Accepted");

        //get a communication stream associated with the socket
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);

        //perform IO

        String s = ins.nextLine();
        System.out.println("From Client " +s);
        outs.println("Hello Client");

        outs.close();
        ins.close();
        cs.close();
        ss.close();

    }
}
