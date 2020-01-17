package no.hvl.dat102;

import javax.swing.JOptionPane;

public class Vare {

	private int varenr;
	private String navn;
	private double pris;
	private int antall;

	public Vare() {

		this(0, "", 0.0, 0);

	}

	public Vare(int varenr) {

		this(varenr, "", 0.0, 0);

	}

	public Vare(int varenr, String navn, double pris, int antall) {

		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
		this.antall = antall;

	}

	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}

	public int getVarenr() {
		return varenr;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}

	public double getPris() {
		return pris;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public int getAntall() {
		return antall;
	}

	public void lesVare() {
		String varenavn = JOptionPane.showInputDialog("Varenavn: ");
		this.navn = varenavn;

		double pris;
		do {
			pris = Double.parseDouble(JOptionPane.showInputDialog("Pris: "));
		} while (pris < 0.0);

		this.pris = pris;

	}

	public String toString() {
		return "Varenr: " + varenr + "\nVarenavn: " + navn + "\nPris: " + pris + "\nAntall: " + antall;
	}

}
