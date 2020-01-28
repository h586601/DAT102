package no.hvl.data102.adt;

import no.hvl.data102.*;

public interface FilmarkivADT {

	//returnere en tabell av filmer
	Film[] hentFilmTabell();
	
	//legger til en ny Film
	void leggTilFilm(Film nyFilm);
	
	//sletter en Film hvis den fins
	boolean slettFilm(int filmnr);
	
	//søker og henter Filmer med en gitt delstreng
	Film[] sokTittel(String delstreng);
	
	//søker og henter produsenter med en gitt delstreng
	Film[] sokProdusent(String delstreng);
	
	//henter antall filmer for en gitt sjanger
	int antallSjanger(Sjanger sjanger);

	//returnerer antall filmer
	int antall();
	
} //interface
