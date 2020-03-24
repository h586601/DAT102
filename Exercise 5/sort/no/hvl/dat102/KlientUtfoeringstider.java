package no.hvl.dat102;

import static no.hvl.dat102.SorteringOgSoeking.fletteSort;
import static no.hvl.dat102.SorteringOgSoeking.kvikkSort;

public class KlientUtfoeringstider {
	public static Integer[] tallTabell = {
			Integer.valueOf(14),
			Integer.valueOf(56),
			Integer.valueOf(10),
			Integer.valueOf(22),
			Integer.valueOf(17),
			Integer.valueOf(13),
			Integer.valueOf(81),
			Integer.valueOf(93),
			Integer.valueOf(70),
			Integer.valueOf(90)
	};

	public static Integer[] kopierOriginalTabell(Integer[] tabell){
		Integer[] kopi = new Integer[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			kopi[i] = tabell[i];
		}
		return kopi;
	}

	public static void skrivUtTallTabell(Integer[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(tabell[i]);
		}
	}

	public static void main(String[] args) {
		// Originale data
		System.out.println("\nOriginale data:");
		for (int i = 0; i < tallTabell.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(tallTabell[i]);
		}

		//Utvalgssortering
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert med \"Utvalgssortering\":");
		Integer[] kopi3 = kopierOriginalTabell(tallTabell);
		SorteringOgSoeking.utvalgSort(kopi3);
		skrivUtTallTabell(kopi3);

		//Sortering ved innsetting
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert ved innsetting:");
		Integer[] kopi4 = kopierOriginalTabell(tallTabell);
		SorteringOgSoeking.sorteringVedInnsetting(kopi4);
		skrivUtTallTabell(kopi4);

		//Boblesort
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert med \"Boblesortering\":");
		Integer[] kopi5 = kopierOriginalTabell(tallTabell);
		SorteringOgSoeking.bobleSort(kopi5);
		skrivUtTallTabell(kopi5);


		// Kvikksortering
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert med \"kvikksortering\":");
		Integer[] kopi1 = kopierOriginalTabell(tallTabell);
		kvikkSort(kopi1);
		skrivUtTallTabell(kopi1);

		// Flettesortering
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert med \"flettesortering\":");
		Integer[] kopi2 = kopierOriginalTabell(tallTabell);
		// venstre side
		fletteSort(kopi2, 0, kopi2.length-1);
		skrivUtTallTabell(kopi2);

		// Radix-sort
		System.out.println();
		System.out.println("\nUtskrift etter at talltabellen er sortert med \"radix-sort\":");
		Integer[] kopi6 = kopierOriginalTabell(tallTabell);
		SorteringOgSoeking.radixSort(kopi6);
		skrivUtTallTabell(kopi6);
	} // main

}
