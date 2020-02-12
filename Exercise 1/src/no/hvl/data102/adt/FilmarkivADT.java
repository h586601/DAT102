package no.hvl.data102.adt;

import no.hvl.data102.*;

public interface FilmarkivADT {

	/**
	 * Return an array of films
	 * @return Film[]
	 */
	Film[] hentFilmTabell();
	
	/**
	 * Add a new movie
	 * @param nyFilm
	 */
	void leggTilFilm(Film nyFilm);
	
	/**
	 * Delete a movie if it exists 
	 * @param filmnr
	 * @return boolean -> true if element deleted and false if not
	 */
	boolean slettFilm(int filmnr);
	
	/**
	 * Search and collect movies that include a certain string
	 * @param delstreng
	 * @return Film[] 
	 */
	Film[] sokTittel(String delstreng);
	
	/**
	 * Search and collect producers that include a certain string/keyword
	 * @param delstreng
	 * @return Film[]
	 */
	Film[] sokProdusent(String delstreng);
	
	/**
	 * Count number of movies within a given genre 
	 * @param sjanger
	 * @return integer
	 */
	int antallSjanger(Sjanger sjanger);

	/**
	 * Return number of movies
	 * @return integer
	 */
	int antall();
	
}
