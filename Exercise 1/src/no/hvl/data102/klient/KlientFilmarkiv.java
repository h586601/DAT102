package no.hvl.data102.klient;

import no.hvl.data102.*;
import no.hvl.data102.adt.*;

public class KlientFilmarkiv {

	public static void main(String[] args) {
		
		FilmarkivADT filmer = new Filmarkiv();
		Meny meny = new Meny(filmer);
		meny.start();
		
	}

}
