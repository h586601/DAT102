package no.hvl.dat102.listeklient;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;
import no.hvl.dat102.sirkulaer.SirkulaerKoe;

public class KlientKoePerson {

	public static void main(String[] args) {


		Person anne = new Person("Anne", "Iversen", 1995);
		Person ole = new Person("Ole", "Vik", 1996);
		Person bendik = new Person("Bendik", "Ness", 1997);
		Person ida = new Person("Ida", "Mjelde", 1991);
		Person arne = new Person("Arne", "Mjelde", 1991);


		KoeADT<Person> k� = new KjedetKoe<Person>();
		k�.innKoe(anne);
		k�.innKoe(ole);
		k�.innKoe(bendik);
		k�.innKoe(ida);
		k�.innKoe(arne);

		while(!k�.isEmpty()) {
			System.out.println(k�.utKoe());
		}

		System.out.println();
		System.out.println();


		KoeADT<Person> sirK� = new SirkulaerKoe<Person>();
		sirK�.innKoe(ole);
		sirK�.innKoe(arne);
		sirK�.innKoe(ida);
		sirK�.innKoe(bendik);
		sirK�.innKoe(anne);

		while(!sirK�.isEmpty()) {
			System.out.println(sirK�.utKoe());
		}
	}

}
