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
		
		if(valg == 1) {
		System.out.println("Hva ønsker du å gjøre?");
		System.out.println("1 - Utføre endringer (legge til, slette e.l.)");
		System.out.println("2 - Skrive ut informasjon");
		int valg2 = Integer.parseInt(leser.nextLine());
			if(valg2 == 2) {
			System.out.println("Hvilken informasjon vil du ha?");
			System.out.println("1 - Filmstatistikk");
			System.out.println("2 - Søke opp tittel");
			System.out.println("3 - Søke opp produsent");
			}
		} 
		
	}
	}
