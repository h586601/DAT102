package no.hvl.dat102.mengde;

public class Hobby {

	private String hobbyNavn;
	
	public Hobby(String hobby) {
		hobbyNavn = hobby;
	}
	
	//Return name of the hobbies with < before and > after a string
	//Example: <climb, swim>
	public String toString() {
		return hobbyNavn;
		
	}
	
	//Check if two hobbies are the same
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

	
}
