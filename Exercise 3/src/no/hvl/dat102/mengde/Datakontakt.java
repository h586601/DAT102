package no.hvl.dat102.mengde;

public class Datakontakt {

	private final static int STDK = 100;
	private Medlem[] medlemmer;
	private int antallMedlemmer;
	
	public Datakontakt() {
		this(STDK);
	}
	
	public Datakontakt(int startkap) {
		this.medlemmer = new Medlem[startkap];
	}
	
	public void leggTilMedlem(Medlem person) {
		
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
