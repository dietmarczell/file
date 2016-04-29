package org.campus02.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File dir = new File("D:\\temp\\textdemo.txt");		// Filename definieren
		
		FileReader fir = new FileReader(dir);
		BufferedReader bur = new BufferedReader(fir);
		
		String line;
		while ( (line = bur.readLine()) != null )
		{
			System.out.println(line);
		}
		
		bur.close();
	}

}
