package timeserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Socket sock = new Socket("127.0.0.1",9803);
			 BufferedWriter buffer_out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			 BufferedReader serverecho = new BufferedReader(new InputStreamReader(sock.getInputStream()));) 
		{
			BufferedReader inputbuffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Start Client...");
			String line = null;

			while ((line = inputbuffer.readLine()) != null) {
				if (!line.equals("exit"))
				{
					buffer_out.write(line);
					buffer_out.newLine();
					buffer_out.flush();
					
					System.out.println("Got Answer: "+serverecho.readLine());
				}
				else
					break;
			}
			inputbuffer.close();
			buffer_out.flush();
			buffer_out.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
