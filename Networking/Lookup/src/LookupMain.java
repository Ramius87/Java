import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class LookupMain {

	public static void main(String[] args) {
		
		// local Variables
		InetAddress[] address;
		String host = "";
		BufferedReader in;
		
		// Header 
		System.out.printf("Program finds all IP Addresses for given Hostnames%n%n");
		
		// Get Hostname Input
		System.out.print("Please enter a hostname (for example www.google.de): ");
		in = new BufferedReader(new InputStreamReader(System.in));
		try {
			host = in.readLine();
		} catch (IOException e) {
			System.out.println("Error: Couldn't read hostname");
		}
		
		// Get IP-Addresses
		try {
			address = InetAddress.getAllByName(host); 
			System.out.printf("Looking up %s -> %s%n", host, address[0].getHostName());
			System.out.println("IP-Addresses: ");
			for (int i = 0; i < address.length; i++) {
				System.out.print(address[i].getHostAddress());
				System.out.printf(" -> Reachable? %s%n", address[i].isReachable(5000));
			}
		} catch (UnknownHostException e) {
			System.out.print("IP-Addresses of hostname " + host);
			System.out.println(" couldn't be found.");
		} catch (IOException e){
			System.out.println("Unable to check if IP Address is reachable.");
		}
		

	}

}
