package no.hvl.dat102;

public class Forskjellig {

	public static void reduceByOne(int n) {
		if (n < 1) {
			System.out.print(0);
		} else {
			reduceByOne(n - 1);
			System.out.print(n);
		}
		System.out.print(" ");
	}

	/*
	 * Kladdeoppgave nr 5
	 */

	// Oppg1
	public static void snuTall(int tall) {
		if (tall > 0) {
			System.out.print(tall % 10);
		}
		if ((tall / 10) != 0) {
			snuTall(tall / 10);
		}
	}

	// Oppg2
	public static void snuTabell(int[] tab) {
		int første = 0;
		int siste = tab.length - 1;
		snuTabRek(tab, første, siste);

		for (int pos = 0; pos < tab.length; pos++) {
			System.out.print(tab[pos]);
		}
	}

	private static void snuTabRek(int[] tab, int første, int siste) {
		if (første < siste) {
			int temp = tab[første];
			tab[første] = tab[siste];
			tab[siste] = temp;
			snuTabRek(tab, første + 1, siste - 1);
		}
	}

	//Oppg3a
	public static int sumKvadOpp(int m, int n) {
		int svar = 0;
		if(m <= n) {
			if (m < n) {
				svar = m * m + sumKvadOpp(m + 1, n);
			} else {
				svar = n * n;
			}
		}
		return svar;
	}

	//b
	public static int sumKvadNed(int m, int n) {

		int svar = 0;
		if(m <= n) {
			if(m < n) {
				svar = n*n + (sumKvadNed(m, n-1));
			} else {
				svar = m*m;
			}
		}
		return svar;

	}

	public static void main(String[] args) {
		reduceByOne(10);
		System.out.println();
		snuTall(1234);
		System.out.println();

		int[] tab = { 1, 2, 3, 4, 5, 6 };
		snuTabell(tab);

		System.out.println();
		int sum = sumKvadOpp(1, 9);
		System.out.println(sum);

		int sum1 = sumKvadNed(1,9);
		System.out.println(sum1);
	}

}
