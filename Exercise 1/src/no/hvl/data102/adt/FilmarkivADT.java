package no.hvl.data102.adt;

import no.hvl.data102.*;

public interface FilmarkivADT {

	//Return an array of films
	Film[] hentFilmTabell();
	
	//Add a new movie
	void leggTilFilm(Film nyFilm);
	
	//Delete a movie if it exists 
	boolean slettFilm(int filmnr);
	
	//Search and collect movies that include a certain string
	Film[] sokTittel(String delstreng);
	
	//Search and collect producers that include a certain string/keyword
	Film[] sokProdusent(String delstreng);
	
	//Count number of movies within a given genre 
	int antallSjanger(Sjanger sjanger);

	//Return number of movies
	int antall();
	
} //interface
