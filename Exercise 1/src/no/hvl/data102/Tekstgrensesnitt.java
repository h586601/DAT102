package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.*;

public class Tekstgrensesnitt {

	//Du kan opprette et Scanner-objekt i lesFilm og ha det åpent hele tiden 
	//og eventuelt lukke det på slutten i Meny når all lesing er ferdig. 
	//Lese opplysningene om en film fra tastatur
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
	
	//vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		//TODO
	}
	
	//skrive ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filmer, String delstreng) {
		Film[] filmTab = filmer.sokTittel(delstreng);
	}
	
	//skriver ut alle filmer av en produsent/en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filmer, String delstreng) {
		//TODO
	}
	
	//skrive ut en enkel statistikk som inneholder antall filmer totalt
	//og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filmer) {
		//TODO
	}
	
	public static void main(String[] args) {

		Filmarkiv filmarkiv = new Filmarkiv(10);
		filmarkiv.leggTilFilm(new Film());
		filmarkiv.leggTilFilm(new Film());
		Film nyFilm = Tekstgrensesnitt.lesFilm();
		filmarkiv.leggTilFilm(nyFilm);
		filmarkiv.skrivUtTitler();
		
	}

	
	
}//class
