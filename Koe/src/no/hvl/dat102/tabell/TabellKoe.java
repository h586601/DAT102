package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.*;

public class TabellKoe<T> implements KoeADT<T> {
	private final static int STDK = 100;
	private int bak;
	private T[] koe;

	/******************************************************************
	 * Oppretter en tom kø med standard størrelse.
	 ******************************************************************/
	public TabellKoe() {
		this(STDK);
	}

	/******************************************************************
	 * Oppretter en tom kø med kapasitet gitt ved parameter
	 ******************************************************************/
	public TabellKoe(int startKapasitet) {
		bak = 0;
		koe = (T[]) (new Object[startKapasitet]);
	}

	// ....

}// class
