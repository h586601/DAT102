package no.hvl.dat102;

public class Oppgave3 {

	/*
	 * a) Lag en rekursiv metode   
	 * public static double potens(double a, int n)         
	 * som finner verdien an basert på formelen  an = a * an-1  når n > 0, og a0 = 1.0 
	 */
	public static double potens(double a, int n) {
		
		if(n == 0) {
			return 1.0;
		} else {
			return a * potens(a, n-1);
		}
		
	}
	
	/*
	 * b) Lag en rekursiv metode         
	 * som finn verdien an basert på formelen an = an/2 * an/2  når n er partal > 0,      
	 * an = a * an/2 * an/2 når n er oddetal > 0 og a0 = 1.0 
	 */
	
	public static double potens2(double a, int n) {
		
		if(n == 0) {
			return 1.0;
		} else {
			if(n % 2 == 0) {
			double svar = potens2(a, n/2);
			return svar*svar;
			} else {
				double svar = potens2(a, n/2);
				return a*svar*svar;
			}
		}
	}
	
}
