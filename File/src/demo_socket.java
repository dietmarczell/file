import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class demo_socket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket test = new Socket("news.orf.at", 80);												// Socket erstellen

			BufferedWriter buwr = new BufferedWriter(new OutputStreamWriter(test.getOutputStream()));	// Am Socket schreiben
			buwr.write("GET / HTTP/1.1 \r\nHost: news.orf.at\r\n\r\n");									// Anfrage schicken
			buwr.flush(); 																				// Daten wirklich rausschreiben

			BufferedReader bure = new BufferedReader(new InputStreamReader(test.getInputStream()));		// Am Socket lesen
			String line;
			while (( line = bure.readLine()) != null) {													// Zeilenweise auslesen
				System.out.println(line);
			}
			buwr.close();
			bure.close();
			test.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
