package no.hvl.dat102;

public class Oppgave4 {

	//a
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(6));
	}
}
