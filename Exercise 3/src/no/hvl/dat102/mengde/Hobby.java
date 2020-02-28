package no.hvl.dat102.mengde;

public class Hobby {

	private String hobbyNavn;
	
	public Hobby(String hobby) {
		hobbyNavn = hobby;
	}
	
	/**
	 * @return name of hobby with < in front and > behind like a string (example <draw, paint>)
	 */
	public String toString() {
		return "<" + hobbyNavn + ">";
	}
	
	/**
	 * @return boolean. True if this hobby equals to hobby2
	 */
	public boolean equals(Object hobby2) {
		Hobby hobbyDenAndre = (Hobby)hobby2;
		return (hobbyNavn.equals(hobbyDenAndre.getHobbyNavn()));
	}

	
	/**
	 * Getters and setters
	 * @return hobbynavn
	 */
	public String getHobbyNavn() {
		return hobbyNavn;
	}

	public void setHobbyNavn(String hobbyNavn) {
		this.hobbyNavn = hobbyNavn;
	}

	
}
