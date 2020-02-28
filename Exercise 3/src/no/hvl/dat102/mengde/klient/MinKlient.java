package no.hvl.dat102.mengde.klient;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class MinKlient {

	public static void main(String[] args) {

		MengdeADT<Integer> liste1 = new KjedetMengde<Integer>();

		Integer[] tall1 = { 1, 2, 3 };

		for (int pos = 0; pos < tall1.length; pos++) {
			liste1.leggTil(tall1[pos]);
		}

		MengdeADT<Integer> liste2 = new KjedetMengde<Integer>();

		Integer[] tall2 = { 2, 3, 4 };

		for (int pos = 0; pos < tall2.length; pos++) {
			liste2.leggTil(tall2[pos]);
		}

		MengdeADT<Integer> beggeListene = liste1.union(liste2);
		System.out.println("Unionen av listene med tall");
		int hentTall = 0;
		while (!beggeListene.erTom()) {
			hentTall = beggeListene.fjernTilfeldig();
			System.out.println(hentTall);
		}
		
		
		MengdeADT<Integer> liste3 = new TabellMengde<Integer>();
		Integer[] tall3 = {2,3,4};
		
		for(int pos = 0; pos < tall3.length; pos++) {
			liste3.leggTil(tall3[pos]);
		}
		
		MengdeADT<Integer> liste4 = new TabellMengde<Integer>();
		Integer[] tall4 = {3,5};
		
		for(int pos = 0; pos < tall4.length; pos++) {
			liste4.leggTil(tall4[pos]);
		}
		
		MengdeADT<Integer> beggeTabListene = liste3.union(liste4);
		System.out.println("Unionen av listene med tall");
		int hentTabTall = 0;
		while (!beggeTabListene.erTom()) {
			hentTabTall = beggeTabListene.fjernTilfeldig();
			System.out.println(hentTabTall);
		}
		

	}

}
