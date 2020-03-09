package no.hvl.dat102.mengde;

import java.util.Iterator;

import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Datakontakt {

	private TabellMengde<Medlem> medlemstabell;
	private int antallMedlemmer;

	public Datakontakt() {
		medlemstabell = new TabellMengde<Medlem>();
		this.antallMedlemmer = medlemstabell.antall();
	}

	public Datakontakt(int start) {
		medlemstabell = new TabellMengde<Medlem>(start);
		this.antallMedlemmer = 0;
	}

	public int getAntall() {
		return this.antallMedlemmer;
	}

	public void leggTilMedlem(Medlem person) {
		medlemstabell.leggTil(person);
	}

	public int finnMedlemsIndeks(String medlemsnavn) {
		int funnet = -1;
		Iterator<Medlem> teller = medlemstabell.oppramser();
		int pos = 0;

		while (teller.hasNext() && funnet == -1) {
			Medlem element = teller.next();
			if (medlemsnavn.equals(element.getNavn())) {
				funnet = pos;
			} else {
				pos++;
			}
		}
		return funnet;
	}

	public int finnPartnerFor(String medlemsnavn) {
		int passer = -1;
		Medlem medlem1 = hentMedlem(medlemsnavn);

		Iterator<Medlem> teller = medlemstabell.oppramser();

		while (teller.hasNext() && (passer == -1)) {
			Medlem medlem2 = teller.next();
			if (medlem2.passerTil(medlem1) && (medlem2.getStatusIndeks() == -1) && (medlem2.getNavn() != medlemsnavn)) {
				passer = finnMedlemsIndeks(medlem2.getNavn());
				medlem1.setStatusIndeks(passer);
				medlem2.setStatusIndeks(finnMedlemsIndeks(medlemsnavn));
			}
		}

		return passer;
	}

	public void tilbakestillStatusIndeks(String medlemsnavn) {
		Medlem medlem = hentMedlem(medlemsnavn);

		int partnerIndeks = medlem.getStatusIndeks();
		Medlem partner = hentMedlemFraIndeks(partnerIndeks);

		if (medlem != null && partner != null) {
			medlem.setStatusIndeks(-1);
			partner.setStatusIndeks(-1);
		}
	}

	// ternary operator ? :
	public Medlem hentMedlem(String medlemsnavn) {
		Iterator<Medlem> teller = medlemstabell.oppramser();
		Medlem element;

		while (teller.hasNext()) {
			element = teller.next();
			if (element.getNavn().equals(medlemsnavn)) {
				return element;
			}
		}

		return null;
	}

	

	// Extra helper methods
	public int getAntallPar() {

		Iterator<Medlem> teller = oppramser(medlemstabell);
		Medlem medlem;

		int antallPar = 0;
		while (teller.hasNext()) {
			medlem = teller.next();
			if (medlem.getStatusIndeks() != -1) {
				antallPar++;
			}
		}
		return antallPar / 2;

	}

	public void skrivUtMedlemPar() {
		
		int[] usedIndexes = new int[getAntallPar()*2];
		int pos = 0;
		int medlemIndeks;
		
		Iterator<Medlem> teller = oppramser(medlemstabell);
		Medlem medlem;

		while (teller.hasNext()) {
			medlem = teller.next();
			medlemIndeks = finnMedlemsIndeks(medlem.getNavn());
			int statusIndeks = medlem.getStatusIndeks();
			boolean duplicate = false;

			for (int i = 0; i < usedIndexes.length; i++) {
				int alleredeLagtTil = usedIndexes[i];

				// always whitelist index 0 due to Java initializing ints in arrays to 0
				if (statusIndeks != 0) {

					// if current member or his/her partner is already added
					if (alleredeLagtTil == medlemIndeks || alleredeLagtTil == statusIndeks) {
						duplicate = true;
					}
				}
			}

			if (statusIndeks != -1 && !duplicate) {
				usedIndexes[pos] = statusIndeks;
				pos++;

				System.out.println(medlem.getNavn() + " og " +
						hentMedlemFraIndeks(medlem.getStatusIndeks()).getNavn() +
						"\t" + medlem.getHobbyer()
						);

			}

		}
	
	}
	
	
	public Iterator<Medlem> oppramser(TabellMengde<Medlem> tab) {
		return tab.oppramser();
	}
	
	public Medlem hentMedlemFraIndeks(int i) {
		return medlemstabell.hentElementFraIndeks(i);
	}
	
}
