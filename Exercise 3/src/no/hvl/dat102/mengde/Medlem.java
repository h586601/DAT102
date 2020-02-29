package no.hvl.dat102.mengde;

import java.util.Iterator;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Medlem {

	private String navn;
	private MengdeADT<Hobby> hobbyer;
	private int statusIndeks;

	public Medlem() {

		this.navn = "";
		this.hobbyer = new TabellMengde<Hobby>();
		this.statusIndeks = -1;
	}
	
	public Medlem(String navn, MengdeADT<Hobby> hobbyer) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = -1;
	}

	public Medlem(String navn, MengdeADT<Hobby> hobbyer, int status) {
		this.navn = navn;
		this.hobbyer = hobbyer;
		this.statusIndeks = status;
	}

	/**
	 * @param medlem2
	 * @return boolean, true if two members have the same hobbies
	 */
	public boolean passerTil(Medlem medlem2) {
		MengdeADT<Hobby> m2 = medlem2.getHobbyer();
		return hobbyer.equals(m2);
	}

	/**
	 * A method that outputs all member data
	 */
	@Override
	public String toString() {
		String s = "";

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

	public static void main(String[] args) {
		MengdeADT<Hobby> hobbyListe = new TabellMengde<Hobby>();
		hobbyListe.leggTil(new Hobby("swim"));
		hobbyListe.leggTil(new Hobby("work out"));
		Medlem pers1 = new Medlem("Adam", hobbyListe);

		MengdeADT<Hobby> hobbyListe2 = new TabellMengde<Hobby>();
		hobbyListe2.leggTil(new Hobby("work out"));
		hobbyListe2.leggTil(new Hobby("swim"));
		Medlem pers2 = new Medlem("Eva", hobbyListe2);

		System.out.println(pers1.passerTil(pers2));

	}
}
