package no.hvl.dat102.mengde;

import java.util.Scanner;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Tekstgrensesnitt {
	
	public static Medlem lesMedlem() {
		
		Medlem nyttMedlem; 
		
		Scanner leser = new Scanner(System.in);
		System.out.println("Please type your name");
		String navn = leser.nextLine();
		System.out.println("Write your hobbies with a comma between");
		String hobby = leser.nextLine();
		String[] hobbyTab = hobby.split(",");
		
		MengdeADT<Hobby> hobbies = new TabellMengde<Hobby>();
		for(String hobbyer : hobbyTab) {
			hobbies.leggTil(new Hobby(hobbyer));
		}
		
		nyttMedlem = new Medlem(navn, hobbies);
		
		leser.close();
		
		return nyttMedlem;
	}
	
	public static void skrivHobbyListe(Medlem medlem) {
		System.out.println("Alle hobbyene ");
		System.out.println(medlem.getHobbyer().toString());
	}
	
	public static void skrivParListe(Datakontakt arkiv) {
		
	}
}
