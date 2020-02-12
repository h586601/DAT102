package no.hvl.dat102.kjedet;

import no.hvl.dat102.adt.KoeADT;

//********************************************************************
// 
//  Representer en samling koe, implementert vha kjedet struktur
//********************************************************************

public class KjedetKoe<T> implements KoeADT<T> {
	private int antall;
	private LinearNode<T> front, bak;

	@Override
	public void innKoe(T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public T utKoe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int amount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
