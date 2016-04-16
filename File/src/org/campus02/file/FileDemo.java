package org.campus02.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("D:\\temp\\testfile.txt");		// Filename definieren
	
		FileOutputStream fos = new FileOutputStream(dir);		//Outputstream erstellen mit file
		String b = "2432gfsgfgdgfsg54252435";					//Test-String 
		ObjectOutputStream oos = new ObjectOutputStream(fos);	//Object-Stream damit ein String eingelesen werden kann bzw. damit man sich die Schleife spart
		oos.writeObject(b);
	
	    fos.flush();	// schreiben!!!
		fos.close();    // schließen!!!!
		
		System.out.println(dir.isFile() + " , " + dir.getPath() + " " + dir.canWrite() + " " + dir.canRead() + " " + dir.exists() + " " + dir.length());
		
		FileInputStream fis = new FileInputStream(dir);			// File lesen
		//FileInputStream fis = new FileInputStream(System.in);
		int byteRead;
		//while ( (byteRead = System.in.read()) != -1) {			// Input Console lesen / -1 ist für Abbruch wenn das Ende des Strings erreicht ist
		while ( (byteRead = fis.read()) != -1) {
		char[] ch = Character.toChars(byteRead);
			System.out.print(ch[0]);
		}
		fis.close();	// File schließen!
		
		
	}

}
