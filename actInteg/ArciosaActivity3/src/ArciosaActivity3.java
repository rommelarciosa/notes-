import java.util.*;
import java.io.*;
import java.net.*;

public class ArciosaActivity3 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        boolean test = true;
        while(test){
        try{
            Socket mySocket = new Socket("smtpdsl4.pldtdsl.net",587);
            DataInputStream dis = new DataInputStream(mySocket.getInputStream());
            DataOutputStream dos = new DataOutputStream(mySocket.getOutputStream());
            System.out.println("Server :" + dis.readLine());
            System.out.print("Client:");
            String input = kbd.nextLine() + " \r \n";
            dos.writeBytes(input);
        
        }catch(java.io.IOException e){
            System.err.println("Connection Lost");
           
        }
        
    }
    }
}
