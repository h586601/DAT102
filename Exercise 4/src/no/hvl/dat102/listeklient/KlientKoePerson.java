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


		KoeADT<Person> kø = new KjedetKoe<Person>();
		kø.innKoe(anne);
		kø.innKoe(ole);
		kø.innKoe(bendik);
		kø.innKoe(ida);
		kø.innKoe(arne);

		while(!kø.isEmpty()) {
			System.out.println(kø.utKoe());
		}

		System.out.println();
		System.out.println();


		KoeADT<Person> sirKø = new SirkulaerKoe<Person>();
		sirKø.innKoe(ole);
		sirKø.innKoe(arne);
		sirKø.innKoe(ida);
		sirKø.innKoe(bendik);
		sirKø.innKoe(anne);

		while(!sirKø.isEmpty()) {
			System.out.println(sirKø.utKoe());
		}
	}

}
