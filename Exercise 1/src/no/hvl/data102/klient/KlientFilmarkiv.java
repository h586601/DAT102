package no.hvl.data102.klient;

import no.hvl.data102.*;
import no.hvl.data102.adt.*;

public class KlientFilmarkiv {

	public static void main(String[] args) {
		/*
		 * When we start the program, user will get questioned if he/she wishes to 
		 * work on an existing archive OR create a new archive
		 */
		FilmarkivADT filmer = new Filmarkiv();
		Meny meny = new Meny(filmer);
		meny.start();
		
	}

}
