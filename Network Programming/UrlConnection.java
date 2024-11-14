import java.io.*;
import java.net.*;
public class UrlConnection {

     public static void main(String[] args) {
        try{
            URL url = new URL("http://www.tutorialspoint.com/java/java_networking.html");
            URLConnection urlConnection = url.openConnection();
            InputStream stream = urlConnection.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.println((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
     }
}
