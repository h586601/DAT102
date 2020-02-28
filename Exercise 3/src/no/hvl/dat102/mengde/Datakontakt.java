package no.hvl.dat102.mengde;

public class Datakontakt {

	private final static int STDK = 100;
	private Medlem[] medlemstabell; //opplysninger om medlemmer
	private int antallMedlemmer;
	
	public Datakontakt() {
		this(STDK);
	}
	
	public Datakontakt(int startkap) {
		this.medlemstabell = new Medlem[startkap];
		this.antallMedlemmer = 0;
	}
	
	public void leggTilMedlem(Medlem person) {
		//Can make an if statement about the persons name existence
		
		if(antallMedlemmer == medlemstabell.length) {
			utvidTabell();
		}
		medlemstabell[antallMedlemmer] = person;
		antallMedlemmer++;
	}
	
	private void utvidTabell() {
		Medlem[] hjelpetabell = new Medlem[medlemstabell.length*2];
		
		for(int pos = 0; pos < medlemstabell.length; pos++) {
			hjelpetabell[pos] = medlemstabell[pos];
		}
		
		medlemstabell = hjelpetabell;
	}

	public int finnMedlemsIndeks(String medlemsnavn) {
		
		return 0;
	}
	
	public int finnParnerFor(String medlemsnavn) {
		
		return 0;
	}
	
	public void tilbakestillStatusIndeks(String medlemsnavn) {
		
	}
}
