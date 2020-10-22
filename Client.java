
import java.net.*;
import java.io.*;
class ContentsClient
{
public static void main( String args[ ] ) throws Exception
{
Socket sock = new Socket("127.0.0.1", 4000);
// reading the file name from keyboard. Uses input stream
System.out.print("Enter the full path of the file to be displayed");
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
String fname = keyRead.readLine();
System.out.print("the Content of the file is\n");
// sending the file name to server. Uses PrintWriter
OutputStream ostream = sock.getOutputStream( );
PrintWriter pwrite = new PrintWriter(ostream, true);
pwrite.println(fname);
// receiving the contents from server. Uses input stream
InputStream istream = sock.getInputStream();
BufferedReader socketRead = new BufferedReader(new InputStreamReader(istream));
String str;
while((str = socketRead.readLine()) != null) // reading line-by-line
{
System.out.println(str);
}
pwrite.close();
socketRead.close();
keyRead.close();
}
}

