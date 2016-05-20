package timeserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
	
	public static void main(String[] args)
	{	
		try (ServerSocket srv = new ServerSocket(9801);) {
			
				int counter = 0;
				while (counter < 10)
				{
					counter++;
					System.out.println("Server is running...");
					Socket sock = srv.accept();
	
					BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
					buffer.write(LocalDateTime.now().toString());
					buffer.newLine();
					buffer.flush();
					buffer.close();
				
					System.out.println(counter+". Client-Connection to client was established, timestamp was sent and connection was closed again");	
				}
			}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		finally {
			System.out.println("Shutting down Server...");
		}
	}

}
