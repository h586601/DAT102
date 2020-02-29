package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.Hobby;
import no.hvl.dat102.mengde.Medlem;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class KlientMedlem {

	public static void main(String[] args) {
		
		MengdeADT<String> hobbyListe1 = new TabellMengde<String>();
		String[] hobby1 = {"tegne", "lese", "male", "trene"};
		
		for(int pos = 0; pos < hobby1.length; pos++) {
			hobbyListe1.leggTil(hobby1[pos]);
		}
		
		MengdeADT<String> hobbyListe2 = new TabellMengde<String>();
		String[] hobby2 = {"tegne", "lese", "male", "trene"};
		
		for(int pos = 0; pos < hobby2.length; pos++) {
			hobbyListe2.leggTil(hobby2[pos]);
		}
		
		
		System.out.println(hobbyListe1.equals(hobbyListe2)); 
		
	
		
		
	}

}
