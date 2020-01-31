package no.hvl.data102;

import java.util.Scanner;

/**
 * Close Scanner within this class
 */

import no.hvl.data102.adt.*;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmer;
	
	public Meny(FilmarkivADT filmer) {
		tekstgr = new Tekstgrensesnitt();
		this.filmer = filmer;
	}
	
	
	public void start() {
		System.out.println("Velg det som passer for deg.");
		System.out.println("1 - Jobbe med eksisterende arkiv?");
		System.out.println("2 - Opprette nytt arkiv?");
		Scanner leser = new Scanner(System.in);
		int valg = Integer.parseInt(leser.nextLine());
		
		System.out.println("Skriv nytt/eksisterende filnavn");
		String filnavn = leser.nextLine();
		
		
		//WORK ON EXISTING DOC
		if(valg == 1) {
			System.out.println("Hva ønsker du å gjøre?");
			System.out.println("1 - Utføre endringer (legge til, slette e.l.)");
			System.out.println("2 - Skrive ut informasjon");
			int valgEksist = Integer.parseInt(leser.nextLine());
			
			if(valgEksist == 1) {
				System.out.println("1 - Legge til ny film");
				System.out.println("2 - Slette film fra arkiv");
				int sisteValg = Integer.parseInt(leser.nextLine());
				
				if(sisteValg == 1) {
					Film nyFilm = tekstgr.lesFilm();
					filmer.leggTilFilm(nyFilm); 
					Fil.skrivTilFil(filmer, filnavn);
				} else if(sisteValg == 2) {
					System.out.println("Hvilket filmnummer vil du slette?");
					int filmnr = Integer.parseInt(leser.nextLine());
					if(filmer.slettFilm(filmnr)) {
						Fil.skrivTilFil(filmer, filnavn);
						System.out.println("Film med filmnr " + filmnr + " er slettet");
					} else {
						System.out.println("Filmen ble ikke slettet");
					}
				}
			} else if(valgEksist == 2) {
				System.out.println("Hva ønsker du?");
				System.out.println("1 - Skriv ut statestikk");
				System.out.println("2 - Søk etter tittel");
				System.out.println("3 - Søk etter produsent");
				int valgUtskrift = Integer.parseInt(leser.nextLine());
				
			}
		}
	}
}
