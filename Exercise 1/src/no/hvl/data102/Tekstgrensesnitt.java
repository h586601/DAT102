package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.*;

public class Tekstgrensesnitt {

	/*
	 * Create a Scanner object in lesFilm and keep it open Close it in the end
	 * inside Menu when all reading is done
	 */

	// Read the information about a movie from keyboard/terminal window
	public static Film lesFilm() {

		Film nyFilm;

		Scanner leser = new Scanner(System.in);
		System.out.println("Filmnummer");
		int filmnr = leser.nextInt();
		leser.nextLine();
		System.out.println("Produsent");
		String prod = leser.nextLine();
		System.out.println("Tittel");
		String tittel = leser.nextLine();
		System.out.println("Årstall");
		int aarstall = Integer.parseInt(leser.nextLine());
		System.out.println("Sjanger: Action, Drama, History eller Scifi");
		Sjanger sjang = Sjanger.finnSjanger(leser.nextLine());
		System.out.println("Filmselskap");
		String selskap = leser.nextLine();

		nyFilm = new Film(filmnr, prod, tittel, aarstall, sjang, selskap);

		return nyFilm;
	}

	// Print out a movie with all information on the screen (remember text for the genre)
	public static void visFilm(Film film) {
		String filmInformasjon = "Filmtittel: " + film.getTittel() 
				+ "\nProdusent: " + film.getProdusent()
				+ "\nFilmnummeret: " + film.getFilmnr() 
				+ "\nUtgivelsesår: " + film.getAarstall()
				+ "\nSjanger: " + film.getSjanger() 
				+ "\nFilmselskap: "
				+ film.getFilmselskap();
		System.out.println(filmInformasjon);
	}

	//Print out all movies with a specific string in title
	public static void skrivUtFilmDelstrengITittel(Filmarkiv filmer, String delstreng) {
		
		System.out.println();
		System.out.println("----FILMER MED TITTEL: '" + delstreng.toUpperCase() + "'----");
		
		Film[] filmTab = filmer.sokTittel(delstreng);
		
		for(int pos = 0; pos < filmTab.length; pos++) {
			if(filmTab[pos] != null) {
			visFilm(filmTab[pos]);
			System.out.println();
			}
		}
	}

	// Print out all the films by one producer 
	public static void skrivUtFilmProdusent(Filmarkiv filmer, String delstreng) {
		
		System.out.println();
		System.out.println("----FILMER PRODUSERT AV: '" + delstreng.toUpperCase() + "'----");
		
		Film[] filmTab = filmer.sokProdusent(delstreng);
	
		for(int pos = 0; pos < filmTab.length; pos++) {
			if(filmTab[pos] != null) {
				visFilm(filmTab[pos]);
				System.out.println();
			}
		}
	}

	//Print out simple statistics including number of films in total and in every genre
	public static void skrivUtStatistikk(Filmarkiv filmer) {

		System.out.println("\nStatistikk \nAntall filmer: " + filmer.antall());

		Sjanger[] sjang = Sjanger.values();
		for (int pos = 0; pos < sjang.length; pos++) {
			System.out.println(sjang[pos] + ": " + filmer.antallSjanger(Sjanger.values()[pos]));
		}
		
		System.out.println();
	}

	public static void main(String[] args) {

		Filmarkiv filmarkiv = new Filmarkiv(10);
		Film nyFilm = Tekstgrensesnitt.lesFilm();
		filmarkiv.leggTilFilm(nyFilm);
		filmarkiv.leggTilFilm(new Film(1, "Tony Kaye", "American History X", 1998, Sjanger.DRAMA, "New Line Cinema"));
		filmarkiv.leggTilFilm(new Film(2, "Kaye", "History", 1998, Sjanger.SCIFI, "New Line Cinema"));
		
		System.out.println();
		filmarkiv.skrivUtTitler();
		System.out.println();
		
//		Tekstgrensesnitt.skrivUtStatistikk(filmarkiv);
		
//		visFilm(nyFilm);
		skrivUtFilmDelstrengITittel(filmarkiv, "History");
		skrivUtFilmProdusent(filmarkiv, "Kaye");
		
		Fil.skrivTilFil(filmarkiv, "filtest.txt");
	}

}
