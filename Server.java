import java.net.*;
import java.io.*;
class ContentsServer
{
public static void main(String args[]) throws Exception
{
// establishing the connection with the server
ServerSocket sersock = new ServerSocket(4000);
System.out.println("Server ready \n waiting for connection");
Socket sock = sersock.accept();
// binding with port: 4000
System.out.println("Connected to 127.0.0.1\n request recieved\n processing.....\n");
// reading the file name from client
InputStream istream = sock.getInputStream( );
BufferedReader fileRead =new BufferedReader(new InputStreamReader(istream));
String fname = fileRead.readLine( );
// reading file contents
BufferedReader contentRead = new BufferedReader(new FileReader(fname) );
// keeping output stream ready to send the contents
OutputStream ostream = sock.getOutputStream( );
PrintWriter pwrite = new PrintWriter(ostream, true);
String str;
while((str = contentRead.readLine()) != null) // reading line-by-line from file
{
pwrite.println(str); // sending each line to client
}
sock.close(); sersock.close(); // closing network sockets
pwrite.close(); fileRead.close(); contentRead.close();
System.out.println("\n Connection Terminated");
}
}
