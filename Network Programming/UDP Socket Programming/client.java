import java.net.*;
import java.io.*;


public class client {

     public static void main(String[] args) throws IOException{
        //create socket
        DatagramSocket ds = new DatagramSocket();

        //send request 
        byte[] buff = new byte[256];
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buff,buff.length,address,445);
        ds.send(packet);

        //get response
        packet = new DatagramPacket(buff, buff.length);
        ds.receive(packet);

        //display response 
        String rsmg = new String(packet.getData());
        System.out.println("Server Response:"+ rsmg);

        ds.close();

     }
}
