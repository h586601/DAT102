package no.hvl.dat102;

public class ButikkvareMain {

	public static void main(String[] args) {

		Butikk b1 = new Butikk("Apple Store", 100);
//		b1.skrivUtVarer();

		b1.leggInnNyVare(1);
		b1.skrivUtVarer();
		
	}

}
