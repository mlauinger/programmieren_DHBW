package com.probeklausur;


public class Bieter {

	private String vorname;
	private String nachname;
	
	public Bieter(String vor, String nach) {
		vorname = vor;
		nachname = nach;
	}
	
	public String getFullName() {
		return vorname + " " + nachname;
	}
	
}
