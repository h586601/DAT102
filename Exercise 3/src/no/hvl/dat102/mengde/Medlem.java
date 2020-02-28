package no.hvl.dat102.mengde;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {

	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem() {
		
	}
	
	/**
	 * @param medlem2
	 * @return boolean foreløpig, i så tilfelle true hvis to medlemmer passer til hverandre
	 */
	public boolean passerTil(Medlem medlem2) {
		
		return false;
	}
}
