package no.hvl.dat102.mengde;

import no.hvl.dat102.mengde.adt.MengdeADT;

public class Medlem {

	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	public Medlem() {

	}

	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = -1;
	}

	public boolean passerTil(Medlem medlem2) {
		MengdeADT<Hobby> m2 = medlem2.getHobbyer();
		return hobbyer.equals(m2);
	}

	public String toString() {
		String s = "";
		s += "Name: " + navn;
		s += "\nHobbies: " + hobbyer.toString();
		s += "\nStatus: ";
		s += (statusIndeks == -1) ? "No partner" : ("Partner with " + statusIndeks);
		return s;
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
