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
		
		
		
		
	}
}
