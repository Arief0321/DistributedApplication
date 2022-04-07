import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.stream.IntStream;

/**
 * This method launch the frame and manage the connection to the server.
 * 
 * @author emalianakasmuri
 *
 */

public class ClientDateApplication {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		// Launch client-side frame
		ClientDateFrame clientDateFrame = new ClientDateFrame();
		clientDateFrame.setVisible(true);
		
		// Connect to the server @ localhost, port 4228
		Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
		
		// Update the status of the connection
		clientDateFrame.updateConnectionStatus(socket.isConnected());
		
		

			
		
		// Read from network
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		// Display the current date
		String currentDate = bufferedReader.readLine();
		
		 int countChar = 0;
		 
		 
		     for(int i = 0 ; i < currentDate.length(); i++ ) 
		     {
		    	 countChar++;
		     }
		      
		      
		  
		  
		 Integer.toString(countChar);
		clientDateFrame.updateServerDate(currentDate);
		clientDateFrame.textgg(countChar);
		
		
		
		
		// Close everything
		bufferedReader.close();
		socket.close();

	}
	
	

	private static void printf(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
