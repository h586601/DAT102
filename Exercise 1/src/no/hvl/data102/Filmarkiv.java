package no.hvl.data102;

import no.hvl.data102.adt.*;

public class Filmarkiv implements FilmarkivADT {

	private Film[] filmTab;
	private int antallFilmer;

	public Filmarkiv() {

	}

	public Filmarkiv(int ant) {

		this.filmTab = new Film[ant];
		this.antallFilmer = 0;

	}

	@Override
	public Film[] hentFilmTabell() {
		return filmTab;
	}
	

	public void utvidFilmarkiv() {

		Film[] biggerArray = new Film[(int)Math.ceil(1.1 * filmTab.length)];

		for (int i = 0; i < filmTab.length; i++) {
			biggerArray[i] = filmTab[i];

		}
		filmTab = biggerArray;

	}
	
	
	@Override
	public void leggTilFilm(Film nyFilm) {

		if (sokNr(nyFilm.getFilmnr()) == -1) {

			if (antallFilmer == filmTab.length) {
				utvidFilmarkiv();

			}

			filmTab[antallFilmer] = nyFilm;

			antallFilmer++;

		} else {

			System.out.println("Denne filmen eksisterer allerede.");

		}
	}

	
	@Override
	public boolean slettFilm(int filmnr) {

		int sok = sokNr(filmnr);

		if (sok != -1) {

			antallFilmer--;
			filmTab[sok] = filmTab[antallFilmer];
			filmTab[antallFilmer] = null;
			return true;
		}
		return false;
	}

	
	// Helper method
	public int sokNr(int filmNr) {

		for (int i = 0; i < antallFilmer; i++) {
			if (filmNr == filmTab[i].getFilmnr()) {
				return i;
			}

		}
		return -1;
	}
	
	
	@Override
	public Film[] sokTittel(String delstreng) {
		Film[] tittelTabell = new Film[antallFilmer];
		int teller = 0;

		for (int i = 0; i < antallFilmer; i++) {
			if (filmTab[i].getTittel() != null && filmTab[i].getTittel().contains(delstreng)) {
				tittelTabell[teller] = filmTab[i];
				teller++;
			}
		}
		
		return tittelTabell;
	}

	
	@Override
	public Film[] sokProdusent(String delstreng) {
		Film[] produsentTabell = new Film[antallFilmer];
		int teller = 0;

		for (int i = 0; i < antallFilmer; i++) {

			if (filmTab[i].getProdusent() != null && filmTab[i].getProdusent().contains(delstreng)) {
				produsentTabell[teller] = filmTab[i];
				teller++;
			}
		}
		return produsentTabell;
	}

	
	public void skrivUtTitler() {
		
		System.out.println("----TITLER----");
		for (int i = 0; i < antallFilmer; i++) {
			System.out.println(filmTab[i].getTittel());
		}

	}

	
	@Override
	public int antallSjanger(Sjanger sjanger) {
		int antallSjanger = 0;

		for (int i = 0; i < antallFilmer; i++) {

			if (filmTab[i].getSjanger() == sjanger) {
				antallSjanger++;
			}
		}

		return antallSjanger;
	}

	
	@Override
	public int antall() {
		return antallFilmer;
	}

}
