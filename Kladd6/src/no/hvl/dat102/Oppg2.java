package no.hvl.dat102;

public class Oppg2 {

	public static void main(String[] args) {

		int[] tab = {7, 5, 3, 1};
		int minste = finnMinste(tab);
		System.out.println(minste);

		System.out.println(finnMinste2(tab));
	}

	public static int finnMinste(int[] tab) {
		return finnMinRek(tab, 0, tab.length-1);
	}

	private static int finnMinRek(int[] tab, int m, int n) {
		int svar;

		if(m == n) {
			svar = tab[m];
		} else {
			int minsteAvResten = finnMinRek(tab, m+1, n);
			if(tab[m] < minsteAvResten) {
				svar = tab[m];
			} else {
				svar = minsteAvResten;
			}
		}

		return svar;
	}

	public static int finnMinste2(int[] tab) {
		return finnMinRek2(tab, 0, tab.length-1);
	}

	private static int finnMinRek2(int[] tab, int m, int n) {
		int svar;
		int midten = (m+n)/2;
		int m1, m2;

		if(m == n) {
			svar = tab[m];
		} else {
			m1 = finnMinRek2(tab, m, midten);
			m2 = finnMinRek2(tab, midten+1, n);
			svar = Math.min(m1, m2);
		}

		return svar;
	}

}

//finnMinRek(tab, 0, 3) tab[0] = 7 > 3 så svar = 3
//finnMinRek(tab, 1, 3) tab[1] = 13 > tab[2], så svar = 3 (fra tab[2])
//finnMinRek(tab, 2, 3) tab[2] = 3 < 4, så vi svarer med tab[2]
//finnMinRek(tab, 3, 3) svarer direkte med tab[3] som er 4

