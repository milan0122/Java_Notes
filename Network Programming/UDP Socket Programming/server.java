import java.io.*;
import java.net.*;
public class server{
    public static void main(String[] args)  throws IOException{
        DatagramSocket socket = new DatagramSocket(445);
        
        
        byte[]  buff = new byte[256];
        //recieve request 
        DatagramPacket packet  = new DatagramPacket(buff, buff.length);
        socket.receive(packet);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello";
        buff = s.getBytes();

        //send the response 
        packet = new DatagramPacket(buff,buff.length,address ,port);
        socket.send(packet);

        //close 
        socket.close();
        
    }

}
