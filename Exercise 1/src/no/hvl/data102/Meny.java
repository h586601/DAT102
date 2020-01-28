package no.hvl.data102;


/**
 * Close Scanner within this class
 */

import no.hvl.data102.adt.*;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmer;
	
	public Meny(FilmarkivADT filmer) {
		tekstgr = new Tekstgrensesnitt();
		this.filmer = filmer;
	}
	
	
	public void start() {
		
	}
}
