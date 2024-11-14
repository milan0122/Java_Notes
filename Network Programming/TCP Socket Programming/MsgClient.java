package Socket_Programming;
import java.net.*;
import java.io.*;
import java.util.*;

public class MsgClient{
    public static void main(String[] args) throws IOException {
        //open connection to server, at port 1254
        Socket cs = new Socket("localhost",1254);
        System.out.println("Connected");
        //get an input file handle from the socket and read the input
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);

        //perform IO
        outs.println("Hello Server");
        String s = ins.nextLine();
        System.out.println("From Server" +s);

        //close the streams and connections 
        ins.close();
        outs.close();
        cs.close();
    }
}