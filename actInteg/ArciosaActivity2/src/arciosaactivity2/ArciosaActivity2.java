package arciosaactivity2;


import java.util.*;
import java.net.*;

public class ArciosaActivity2 {
	public static void main(String[] args) throws UnknownHostException {
		
            Scanner kbd = new Scanner(System.in);
		
		System.out.print(">java -cp . PortChecker ");
		String serverName = kbd.nextLine();

		for (int i = 0; i <= 1024; i++){
			try {
				Socket s = new Socket(serverName, i);
				System.out.println("Connected to :" +  serverName + " at port :"+ i);
			} catch (java.io.IOException e){
                            System.err.println("Error Connecting to port :" + i);
               
			}
		}
	}
}