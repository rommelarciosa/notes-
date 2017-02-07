package arciosaactivity1;

import java.net.InetAddress;
import java.util.Scanner;

public class ArciosaActivity1 {
    public static void main(String[] args) throws Exception{
        Scanner kbd = new Scanner(System.in);
        String server_name;
        char choice = 'y';
        int counter = 1;
        
        while(choice == 'Y' || choice == 'y'){
            System.out.print("Host "+counter+" - Type IP address/Hostname: ");
            server_name = kbd.nextLine();
            InetAddress[] me = InetAddress.getAllByName(server_name);
            System.out.println("Number of Host/IPs: " + me.length);

            for( InetAddress x : me){
                System.out.println("Host Name: "+x.getHostName());//hostname display
                System.out.println("IP Address: "+x.getHostAddress());//IP address display
            }//end of for
            
                counter++;
                System.out.print("Search Another? [y/n]:");
                choice = kbd.nextLine().charAt(0);
                
            if(choice == 'N' ||  choice == 'n'){
                System.out.println("BYE");
                System.exit(0);
                }//end of if
        }//end of while
    } //end of main method   
}//end of class

