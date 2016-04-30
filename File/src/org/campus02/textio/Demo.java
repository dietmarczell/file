package org.campus02.textio;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonenManager persmanag = new PersonenManager();
		
		try {
			persmanag.load("D:\\temp\\Personen.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(persmanag.toString());
	}

}
