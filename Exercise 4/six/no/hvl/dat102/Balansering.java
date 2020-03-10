package no.hvl.dat102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat102.adt.StabelADT;

public class Balansering {
	StabelADT<Parentesinfo> stabel = new TabellStabel<Parentesinfo>();
	boolean feil = true;

	private boolean passer(char åpent, char lukket) {
		switch (åpent) {
		case '(':
			return (lukket == ')');
		case '[':
			return (lukket == ']');
		case '{':
			return (lukket == '}');
		default:
			return false;
		}
	}

	public void foretaBalansering(String innDataStreng, int linjenr) {

		int lengde = innDataStreng.length();


		for (int i = 0; i < lengde; i++) {

			char tegn = innDataStreng.charAt(i);

			if(tegn == '(' || tegn == '{'|| tegn == '[') {
				Parentesinfo pinfo = new Parentesinfo(linjenr, i, tegn);
				stabel.push(pinfo);
			} else if (tegn == ')' || tegn == '}'|| tegn == ']') {
				if (stabel.erTom()) {
					feil = false;
					System.out.println(new Parentesinfo(linjenr, i, tegn).toStringTomStabel());
				} else {
					Parentesinfo poppet = stabel.pop();
					if ( !passer(poppet.getVenstreparentes(),tegn ) ) {
						feil= false;
						System.out.println(poppet.toStringIkkeBalansert());
					}
				}
			}
		}
	}

	public void lesFraFil(String filnavn) {
		FileReader tekstFilLeser = null;
		try {
			tekstFilLeser = new FileReader(filnavn);
		} catch (FileNotFoundException unntak) {
			System.out.println("Finner ikke filen!");
			System.exit(-1);
		}

		BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
		String linje = null;
		int linjenr = 0;
		try {
			linje = tekstLeser.readLine();
			while (linje != null) {
				foretaBalansering(linje, linjenr);
				linje = tekstLeser.readLine();
				linjenr++;
			}

			if (!stabel.erTom()) {
				System.out.println("Stabelen er ikke tom etter innlesing.");
				while (!stabel.erTom()) {
					feil = false;
					Parentesinfo rest = stabel.pop();
					System.out.println(rest.toStringRest());
				}
			}
			if (feil == true) {
				System.out.println("Filen er balansert.");
			} else {
				System.out.println("Filen er ikke balansert.");
			}
		}

		catch (IOException unntak) {
			System.out.println("Feil ved innlesing!");
			System.exit(-1);
		}
		try {
			tekstFilLeser.close();
		} catch (IOException unntak) {
			System.out.println("Feil ved lukking av fil!");
		}

	}

}
