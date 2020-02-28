package no.hvl.dat102.mengde;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {

	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;
	
	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = 0;
	}
	
	
	
	/**
	 * @param medlem2
	 * @return boolean foreløpig, i så tilfelle true hvis to medlemmer passer til hverandre
	 */
	public boolean passerTil(Medlem medlem2) {
		
		return false;
	}
	
	
	/**
	 * Lag en metode for utskrift til skjerm av alle medlemsdata
	 */
	public String toString() {
		return null;
	}

	
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public MengdeADT<Hobby> getHobbyer() {
		return hobbyer;
	}

	public void setHobbyer(MengdeADT<Hobby> hobbyer) {
		this.hobbyer = hobbyer;
	}

	public int getStatusIndeks() {
		return statusIndeks;
	}

	public void setStatusIndeks(int statusIndeks) {
		this.statusIndeks = statusIndeks;
	}
}
