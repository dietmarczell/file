import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class demo_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL test = new URL("https://de.wikipedia.org/wiki/Streaming_Media");
			
			InputStreamReader ipstr = new InputStreamReader(test.openStream());
			BufferedReader bur2 = new BufferedReader(ipstr);
			
			String line3;
			File wikipedia = new File("D:\\temp\\wikipedia.txt");
			FileWriter fw = new FileWriter(wikipedia,true);
			//BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(fw);
			while ( (line3 = bur2.readLine()) != null)
			{
				pw.println(line3);
				System.out.println(line3);
				//bw.write(line3);
			}
			pw.flush();
			pw.close();
			//bw.flush();
			//bw.close();
			bur2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
