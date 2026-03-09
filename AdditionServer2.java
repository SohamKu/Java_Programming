import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer2 throws Exception
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is Running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is Waiting at port no 2100");
        Socket sobj = ssobj.accept();
        System.out.println("client request arrives and accepted by Server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
    }
}