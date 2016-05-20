package timeserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ServerSocket servsock = new ServerSocket(9803);) {
			while(true)
			{
				System.out.println("Start Server connection...");
				Socket sock_in = servsock.accept();
				
				BufferedReader buffer_in = new BufferedReader(new InputStreamReader(sock_in.getInputStream()));
				BufferedWriter buffer_out = new BufferedWriter(new OutputStreamWriter(sock_in.getOutputStream()));
				String input = null;
				while ((input = buffer_in.readLine()) != null) {
					System.out.println("Got input: "+input);
					buffer_out.write(input);
					buffer_out.newLine();
					System.out.println("Sending: "+input);
					buffer_out.flush();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
