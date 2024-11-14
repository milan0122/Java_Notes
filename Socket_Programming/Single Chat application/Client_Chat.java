import java.net.*;
import java.util.*;
import java.io.*;
public class Client_Chat {
    public static void main(String[] args) throws IOException{

        Socket cs = new Socket("localhost",223);

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
        Scanner ink = new Scanner(System.in);

        String rmsg, smsg;
        do {
            //geting sms from the server
            rmsg = ins.nextLine();
            System.out.println("\t Server :" + rmsg);
            System.out.println("Client: ");

            //taking input from the client
            smsg = ink.nextLine();
            out.println(smsg);
        } while (rmsg.equals("bye")!=true);
        ins.close();
        out.close();
        ink.close();
        cs.close();


        
    }

    
}