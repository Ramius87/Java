import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class LocalHost {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			String message = "<html><span style=\"font-family: monospace; font-size: 24; color: blue;\">"
					+ address.getHostName()
					+ "/"
					+ address.getHostAddress()
					+ "</span></html>";
			JOptionPane.showMessageDialog(null, message, "Local Host", JOptionPane.PLAIN_MESSAGE);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
