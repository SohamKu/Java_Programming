import java.util.*;
import java.io.*;
import java.net.*;

class AdditionClient1
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is Running...");


        Socket sobj = new Socket("LocalHost",2100);
        System.out.println("client request arrives and accepted by Server");

    }

}