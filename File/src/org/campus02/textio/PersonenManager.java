package org.campus02.textio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonenManager {

	private ArrayList<Person> Personen = new ArrayList<>();

	public void load (String path) throws IOException,FileNotFoundException
	{
		try {
			File file = new File(path);		// Filename definieren
			FileReader fir = new FileReader(file);
			BufferedReader bur = new BufferedReader(fir);
			String line;
			while ( (line = bur.readLine()) != null )
			{
				String[] parts = line.split(",");
				//for (int i = 0; i < parts.length; i++) {
				//	String string = parts[i];
				//	System.out.println(string);
				//}	
				if (parts.length != 3)
				{
					throw new PersonenManagerException("Length not ok!");
				}
				Person lineread = new Person(parts[0], parts[1], parts[2]);	
				Personen.add(lineread);
			}
			bur.close();
		} catch (PersonenManagerException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public ArrayList<Person> getPersonen() {
		return Personen;
	}

	public void addPerson(Person person) {
		Personen.add(person);
	}

	@Override
	public String toString() {
		String string = new String();
		int i=1;
		for (Person person : Personen) {
			string += "Person "+i+": "+person.getNachname()+" "+person.getVorname()+" "+person.getWohnort()+"\n";
			i++;
		}
		return string;
	}
	
}
