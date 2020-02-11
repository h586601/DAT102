package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT {

	private int antall;
	private LinearNode<Film> start;

	public Filmarkiv2() {
		start = null;
		antall = 0;
	}

	public static void main(String[] args) {
		Filmarkiv2 arkiv = new Filmarkiv2();
		arkiv.leggTilFilm(
				new Film(1, "Quentin Tarantino", "Once Upon a Time In Hollywood", 2019, Sjanger.DRAMA, "New Line Cinema"));
		arkiv.leggTilFilm(
				new Film(2, "Quentin Tarantino", "Django Unchained", 2012, Sjanger.ACTION, "New Line Cinema"));
		arkiv.leggTilFilm(
				new Film(3, "Tony Kaye", "American History X", 1998, Sjanger.DRAMA, "New Line Cinema"));
		
		Tekstgrensesnitt.skrivUtFilmDelstrengITittel(arkiv, "In");
		
		
	}

	@Override
	public Film[] hentFilmTabell() {

		Film[] filmTab = new Film[antall];
		LinearNode<Film> current = start;

		int pos = 0;
		while (current != null) {
			filmTab[pos] = current.getElement();
			pos++;
			current = current.getNeste();
		}
		return filmTab;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		LinearNode<Film> nyNode = new LinearNode<Film>(nyFilm);
		nyNode.setNeste(start); // first step
		start = nyNode; // second step
		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {

		boolean slettet = false;
		LinearNode<Film> forrige = null;
		LinearNode<Film> current = start;

		if (start == null) {
			return slettet;
		}

		if (start.getElement().getFilmnr() == filmnr) {
			start = start.getNeste();
			antall--;
			slettet = true;
		} else {

			while (current != null && !slettet) {

				if (current.getElement().getFilmnr() == filmnr) {
					forrige.setNeste(current.getNeste());
					antall--;
					slettet = true;
				}
				forrige = current;
				current = current.getNeste();

			}
		}
		return slettet;
	}

	@Override
	public Film[] sokTittel(String delstreng) {

		LinearNode<Film> current = start;

		// Part one: find amount in order to create array in correct length
		int ant = 0;
		while (current != null) {
			if (current.getElement().getTittel().contains(delstreng)) {
				ant++;
			}
			current = current.getNeste();
		}

		current = start;
		// Part two: create array and copy objects
		Film[] tittelTab = new Film[ant];
		int pos = 0;
		while (current != null) {
			if (current.getElement().getTittel().contains(delstreng)) {
				tittelTab[pos] = current.getElement();
				pos++;
			}
			current = current.getNeste();
		}

		return tittelTab;
	}

	@Override
	public Film[] sokProdusent(String delstreng) {
		
		LinearNode<Film> current = start;
		
		//Part one: find amount in order to create array in correct length
		int ant = 0;
		while (current != null) {
			if (current.getElement().getProdusent().contains(delstreng)) {
				ant++;
			}
			current = current.getNeste();
		}
		
		//Part two: create array and copy objects
		Film[] prodTab = new Film[ant];
		int pos = 0;
		while (current != null) {
			if (current.getElement().getProdusent().contains(delstreng)) {
				prodTab[pos] = current.getElement();
				pos++;
			}
			current = current.getNeste();
		}

		return prodTab;
	}
	

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public int antallSjanger(Sjanger sjanger) {
		
		int antallSjanger = 0;
		LinearNode<Film> current = start;
		
		while(current != null) {
			if(current.getElement().getSjanger() == sjanger) {
				antallSjanger++;
			}
			current = current.getNeste();
		}

		return antallSjanger;
	}

}
