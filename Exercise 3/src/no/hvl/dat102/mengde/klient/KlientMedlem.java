package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.Hobby;
import no.hvl.dat102.mengde.Medlem;
import no.hvl.dat102.mengde.Datakontakt;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class KlientMedlem {

	public static void main(String[] args) {
		
		MengdeADT<Hobby> hobbyListe1 = new TabellMengde<Hobby>();
		hobbyListe1.leggTil(new Hobby ("climb"));
		hobbyListe1.leggTil(new Hobby("swim"));
		
		MengdeADT<Hobby> hobbyListe2 = new TabellMengde<Hobby>();
		hobbyListe2.leggTil(new Hobby("swim"));
		hobbyListe2.leggTil(new Hobby("climb"));
		
		System.out.println(hobbyListe1.equals(hobbyListe2)); 
		
		Medlem pers1 = new Medlem("Adam", hobbyListe1);
		Medlem pers2 = new Medlem("Eva", hobbyListe2);
		
		System.out.println(pers1.passerTil(pers2));
		System.out.println();
		System.out.println(pers1);
		System.out.println();
		System.out.println(pers2);
	
	}

}
