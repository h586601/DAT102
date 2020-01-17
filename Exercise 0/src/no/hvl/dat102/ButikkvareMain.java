package no.hvl.dat102;

public class ButikkvareMain {

	public static void main(String[] args) {

		Butikk b1 = new Butikk("Apple Store", 100);
		b1.skrivUtVarer();

		b1.leggInnNyVare(1);
		b1.leggInnNyVare(5);
		b1.leggInnNyVare(3);
		b1.leggInnNyVare(4);
		b1.leggInnNyVare(7);
		
		b1.skrivUtVarer();
		
		b1.slettVare(3);
		
		b1.skrivUtVarer();
		
		
		
	}

}
