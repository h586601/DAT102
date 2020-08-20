package no.hvl.dat102;

import java.util.Objects;

public class Student {
	private int snr;
	private String navn;

	public Student(int snr, String navn) {
		this.snr = snr;
		this.navn = navn;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) return true;
		if (!(o instanceof Student)) {
			return false;
		}
		Student stud = (Student) o;
		return snr == stud.snr &&
				Objects.equals(navn, stud.navn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(snr, navn);
	}
}
