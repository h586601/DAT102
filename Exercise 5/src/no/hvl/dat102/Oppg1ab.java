package no.hvl.dat102;

public class Oppg1ab {

	//a) Summation of numbers from 1 to n
	public static int sum(int n) {

		if(n == 1) {
			return 1;
		} else {
			return n + sum(n-1);
		}
	}

	//b)
	public static int beregnerRekursiv(int n) {
		int an;

		if(n == 0 || n == 1) {
			if(n == 0) {
				an = 2;
			} else {
				an = 5;
			}
		} else {
			an = 5*beregnerRekursiv(n-1) - 6*beregnerRekursiv(n-2) + 2;
		}

		return an;
	}

	//b)
	public static void beregner(int n) {
		System.out.print("{");
		for(int pos = 0; pos <= n; pos++) {
			if(pos < n) {
				System.out.print(beregnerRekursiv(pos) + ", ");
			} else {
				System.out.print(beregnerRekursiv(pos));
			}
		}
		System.out.println("}");
	}


	public static void main(String[] args) {
		System.out.println(sum(100));
		beregner(10);
	}

}


