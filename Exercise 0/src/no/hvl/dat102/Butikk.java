package no.hvl.dat102;

public class Butikk {

	private Vare[] varer;
	private int antallTyper;
	private String butikknavn;


	public Butikk(String butikknavn, int maksAntall) {
		
		varer = new Vare[maksAntall];
		this.antallTyper = 0;
		this.butikknavn = butikknavn;
		
	}
	
	public int finnVare(int varenr) {
		
		int pos = 0;
		while(pos < antallTyper) {
			if(varer[pos].getVarenr() == varenr) {
				return pos;
			}
			pos++;
		}
		return -1;
	}
	
	public boolean erLedigPlass() {
		return varer[antallTyper] == null;
	}
	
	public void leggInnNyVare(int varenr) {
				
		//Sjekk om varen finnes eller lageret er fullt
		if(finnVare(varenr) != -1 || !erLedigPlass()) {
			System.out.println("Lageret er fullt eller saa finnes varen fra for");
		} else {
			//Finn rett posisjon
			int pos = 0;
			while(pos < antallTyper && varenr > varer[pos].getVarenr()) {
			pos++;
			}
		
			int j = antallTyper;
			while(j > pos) {
			varer[j] = varer[j-1];
			j--;
			}
		
			Vare v1 = new Vare(varenr);
			v1.lesVare();
			varer[pos] = v1;
			antallTyper++;
		}
	}
	
	public void slettVare(int varenr) {
		int pos = finnVare(varenr);
		
		if(pos == -1) {
			System.out.println("Denne varen finnes ikke");
		} else {
			antallTyper--;
			while(pos < antallTyper) {
				varer[pos] = varer[pos+1];
				pos++;
			}
			varer[antallTyper] = null;			
		}	
	}
	
	public void detaljSalg(int varenr) {
		
		int pos = finnVare(varenr);
		int antall = varer[pos].getAntall();
		
		if(pos == -1) {
			System.out.println("Varen er ikke i register"); 
		} else if(antall == 0) {
			System.out.println("Det er ingen varer igjen av denne typen");
		} else {
			antall--;
			varer[pos].setAntall(antall);
		}
	}
	
	public void grossInnkjop(int varenr, int ant) {
		
		int pos = finnVare(varenr);
		int antall = varer[pos].getAntall();
		
		if(pos == -1) {
			System.out.println("Denne varen finnes ikke");
		} else if(ant <= 0) {
			System.out.println("Antall varer maa vaere et positivt heltall");
		} else {
			antall += ant;
			varer[pos].setAntall(antall);
		}
	}
	
	public double salgsVerdi() {
		
		double total = 0.0;
		
		for(int pos = 0; pos < antallTyper; pos++) {
			total += varer[pos].getPris() * varer[pos].getAntall();
		}
		
		return total;
	}
	
	public void skrivUtVarer() {
		
		System.out.println("Butikknavn: " + butikknavn + "\nAntall varetyper: " + antallTyper);
		
		for(int pos = 0; pos < antallTyper; pos++) {
			System.out.println(varer[pos].toString());
		}

	}
	
}
