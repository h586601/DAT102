package no.hvl.dat102;

public class Oppg1 {

	public static void main(String[] args) {

		stjerne(5);
		System.out.println(palindrom("abba"));

	}

	public static void stjerne(int n) {
		if(n > 1) {
			stjerne(n/2);
			stjerne(n/2);
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static boolean palindrom(String ord) {

		int lengde = ord.length();
		if(lengde < 2) {
			return true;
		} else {
			if(ord.charAt(0) == ord.charAt(lengde-1)) {
				return palindrom(ord.substring(1, lengde-1));
			} else {
				return false;
			}
		}
	}
}
