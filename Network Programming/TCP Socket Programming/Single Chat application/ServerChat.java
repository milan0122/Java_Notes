import java.net.*;
import java.util.*;
import java.io.*;

public class ServerChat{
    public static void main(String[] args) throws IOException {
        //register the port
        ServerSocket ss = new ServerSocket(223);
        System.out.println("Server Started");
        System.out.println("Waiting for the client");

        //acept the client 
        Socket cs = ss.accept();

        //communication 
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        Scanner ink = new Scanner(System.in);

        String rmsg , smsg;
        do {
            System.out.println("Server: ");
            smsg = ink.nextLine();
            outs.println(smsg);
            rmsg = ins.nextLine();
            System.out.println("\t Client " + rmsg);
        } while (rmsg.equals("bye")!= true);
        ins.close();
        outs.close();
        ink.close();
        cs.close();
        ss.close();

    }
}
