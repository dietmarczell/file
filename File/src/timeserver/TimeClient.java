package timeserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException
	{
		Socket sock = new Socket("127.0.0.1", 9801);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		System.out.println(buffer.readLine());
		buffer.close();
		sock.close();
	}
}
