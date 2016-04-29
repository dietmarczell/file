package org.campus02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BufferedReader bur = null;
		//BufferedReader bur2 = null;
		PrintWriter pw = null;
		PrintWriter pw2 = null;
		
		try {
			File dir = new File("D:\\temp\\textdemo.txt");		// Filename definieren
			FileReader fir = new FileReader(dir);
			BufferedReader bur = new BufferedReader(fir);

			String line;

			while ( (line = bur.readLine()) != null )
			{
				System.out.println(line);
			}
			bur.close();

			// Splitten von einer cvs-Datei aufgrund des Seperators
			File dir2 = new File("D:\\temp\\demo.csv");		// Filename definieren
			FileReader fir2 = new FileReader(dir2);
			BufferedReader bur2 = new BufferedReader(fir2);

			String line2;
			while ( (line2 = bur2.readLine()) != null )
			{
				/*
			String ausgabe = "";
			for (int i = 0; i < line2.length(); i++) {
				if (line2.charAt(i) == ';' ) {
					System.out.println(ausgabe);
					ausgabe = "";
				}
				else
				{
					ausgabe = ausgabe + line2.charAt(i);
				}
			}
			System.out.println(ausgabe);
				 */	
				String[] parts = line2.split(";");
				for (int i = 0; i < parts.length; i++) {
					String string = parts[i];
					System.out.println(string);
				}	
			}
			bur2.close();

			// Noten aus dem Input von der Konsole schreiben - mit stop wird angehalten
			File noten = new File("D:\\temp\\noten.txt");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bufrea = new BufferedReader(isr);

			String line3;
			FileWriter fw = new FileWriter(noten);
			pw = new PrintWriter(fw);
			while ( !(line3 = bufrea.readLine()).equals("stop"))
			{
				pw.println(line3);
			}
			pw.flush();
			pw.close();


			// Textfile erweitern z.b. für logfile lässig - vor allem das append ist wichtig - das hängt die zeilen dazu statt zu ersetzen!
			File f = new File("D:\\temp\\printout.txt");		
			FileWriter fw2 = new FileWriter(f,true);
			pw2 = new PrintWriter(fw2);

			pw2.println("First Line");
			pw2.println("Second Line");

			pw2.flush();
			pw2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			pw.close();
			pw2.close();
			//bur.close();
			//bur2.close();
		}	

	}

}
