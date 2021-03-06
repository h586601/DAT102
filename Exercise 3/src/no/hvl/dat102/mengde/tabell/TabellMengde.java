package no.hvl.dat102.mengde.tabell;

import java.util.Iterator;
import java.util.Random;

import no.hvl.dat102.exception.EmptyCollectionException;
import no.hvl.dat102.mengde.adt.*;

public class TabellMengde<T> implements MengdeADT<T> {
	// ADT-en Mengde implementert som tabell
	//
	private final static Random tilf = new Random();
	private final static int STDK = 100;
	private int antall;
	private T[] tab;

	public TabellMengde() {
		this(STDK);
	}

	@SuppressWarnings("unchecked")
	public TabellMengde(int start) {
		antall = 0;
		tab = (T[]) (new Object[start]);
	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public boolean erTom() {
		return (antall == 0);
	}

	@Override
	public void leggTil(T element) {
		if (!inneholder(element)) {
			if (antall == tab.length) {
				utvidKapasitet();
			}
			tab[antall] = element;
			antall++;
		}
	}

	@SuppressWarnings("unchecked")
	private void utvidKapasitet() {
		T[] hjelpetabell = (T[]) (new Object[2 * tab.length]);
		for (int i = 0; i < tab.length; i++) {
			hjelpetabell[i] = tab[i];
		}
		tab = hjelpetabell;
	}

	@Override
	public T fjernTilfeldig() {
		if (erTom())
			throw new EmptyCollectionException("mengde");

		T svar = null;
		int indeks = tilf.nextInt(antall);
		svar = tab[indeks];
		tab[indeks] = tab[antall - 1];
		antall--;

		return svar;
	}

	@Override
	public T fjern(T element) {
		// S�ker etter og fjerner element. Returnerer null-ref ved ikke-funn

		if (erTom())
			throw new EmptyCollectionException("mengde");

		boolean funnet = false;
		T svar = null;

		int pos = 0;
		while (pos < antall && !funnet) {
			if (tab[pos].equals(element)) {
				svar = tab[pos];
				funnet = true;
				tab[pos] = tab[antall];
				tab[antall] = null;
				antall--;
			}
			pos++;
		}
		return svar;
	}
	
   

	@Override
	public boolean inneholder(T element) {
		boolean funnet = false;
		for (int i = 0; (i < antall) && (!funnet); i++) {
			if (tab[i].equals(element)) {
				funnet = true;
			}
		}
		return (funnet);
	}

	@Override
	public boolean equals(Object m2) {
		boolean likeMengder = true;
		T element;
		
		@SuppressWarnings("unchecked")
		MengdeADT<T> mengde2 = (TabellMengde<T>)m2;

		if (mengde2.antall() == this.antall) {
			Iterator<T> teller = mengde2.oppramser();
			while (teller.hasNext() && likeMengder) {
				element = teller.next();
				if (!this.inneholder(element)) {
					likeMengder = false;
				}
			}
		} else {
			likeMengder = false;
		}

		return likeMengder;
	}

	@Override
	public void leggTilAlle(MengdeADT<T> m2) {
		Iterator<T> teller = m2.oppramser();
		while (teller.hasNext())
			leggTil(teller.next());
	}

	@Override

	public MengdeADT<T> union(MengdeADT<T> m2) {
		MengdeADT<T> begge = new TabellMengde<T>(); // begge: interface reference
		T element = null;

		for (int pos = 0; pos < antall; pos++) {
			((TabellMengde<T>) begge).settInn(tab[pos]);
		}

		Iterator<T> teller = m2.oppramser();

		while (teller.hasNext()) {
			element = teller.next();
			if (!inneholder(element)) {
				((TabellMengde<T>) begge).settInn(element);
			}
		}

		return begge;
	}//

	@Override
	public MengdeADT<T> snitt(MengdeADT<T> m2) {
		MengdeADT<T> snittM = new TabellMengde<T>();
		T element = null;

		Iterator<T> teller = m2.oppramser();

		while (teller.hasNext()) {
			element = teller.next();
			if (this.inneholder(element)) {
				((TabellMengde<T>) snittM).settInn(element);
			}
		}
		return snittM;
	}

	@Override
	public MengdeADT<T> differens(MengdeADT<T> m2) {
		MengdeADT<T> differensM = new TabellMengde<T>();
		T element;

		Iterator<T> teller = this.oppramser();

		while (teller.hasNext()) {
			element = teller.next();
			if (!m2.inneholder(element))
				((TabellMengde<T>) differensM).settInn(element);
		}

		return differensM;
	}

	@Override
	public boolean undermengde(MengdeADT<T> m2) {
		boolean erUnderMengde = true;
		
		if(m2.antall() > this.antall()) {
			return false;
		}
		
		Iterator<T> teller = m2.oppramser();

		while (teller.hasNext() && erUnderMengde) {
			T element = teller.next();
			if (!this.inneholder(element)) {
				erUnderMengde = false;
			}
		}

		return erUnderMengde;
	}

	@Override
	public Iterator<T> oppramser() {
		return new TabellIterator<T>(tab, antall);
	}

	private void settInn(T element) {
		if (antall == tab.length) {
			utvidKapasitet();
		}
		tab[antall] = element;
		antall++;
	}
	
	//Extra helper method
	public T hentElementFraIndeks(int i) {
		if (tab[i] != null) {
			return tab[i];
		}
		return null;

	}

	/******************************************
	 * Returns a string that represents the set
	 ******************************************/
	public String toString() {
		String resultat = "<";

		for (int pos = 0; pos < antall; pos++) {
			if(pos > 0) resultat += ", ";
			
			resultat += tab[pos].toString();
		}
		
		resultat += ">";

		return resultat;

	}

}// class
