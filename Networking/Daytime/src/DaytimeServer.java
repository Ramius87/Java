import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DaytimeServer {
	
	// Class Variables
	private static final int BUFSIZE = 508;

	public static void main(String[] args) {
	
		// Local Variables
		int port = 50000;
		int year, month, day;
		String daytime;
		
		// Create UDP Socket
		try (DatagramSocket socket = new DatagramSocket(port)) {
			
			// Create Datagram-Packets
			DatagramPacket inPacket = new DatagramPacket(new byte[BUFSIZE], BUFSIZE);
			DatagramPacket outPacket = new DatagramPacket(new byte[BUFSIZE], BUFSIZE);
			
			System.out.println("Server started ...");
			
			while (true) {
				
				// Get Packet
				socket.receive(inPacket);
				
				// Get System Time
				GregorianCalendar gc = new GregorianCalendar();
				year = gc.get(Calendar.YEAR);
				month = gc.get(Calendar.MONTH)+1; // Januar == 0
				day = gc.get(Calendar.DAY_OF_MONTH);
				
				// Build daytime-String
				daytime = day + "." + month + "." + year;
				
				// Put daytime data in Datagram Packet which shall be send
				outPacket.setData(daytime.getBytes());
				outPacket.setLength(BUFSIZE);
				
				// Set SocketAdress of Client in the Datagram outPacket
				outPacket.setSocketAddress(inPacket.getSocketAddress());
				
				// Send Datagram Packet to Client
				socket.send(outPacket);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}

}
