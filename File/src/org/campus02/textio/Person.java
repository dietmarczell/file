package org.campus02.textio;

public class Person {

	private String Vorname;
	private String Nachname;
	private String Wohnort;
	
	
	public Person(String vorname, String nachname, String wohnort) {
		Vorname = vorname;
		Nachname = nachname;
		Wohnort = wohnort;
	}


	public String getVorname() {
		return Vorname;
	}


	public void setVorname(String vorname) {
		Vorname = vorname;
	}


	public String getNachname() {
		return Nachname;
	}


	public void setNachname(String nachname) {
		Nachname = nachname;
	}


	public String getWohnort() {
		return Wohnort;
	}


	public void setWohnort(String wohnort) {
		Wohnort = wohnort;
	}
	
	
	
}
