package no.hvl.dat102;

import java.time.Duration;
import java.time.Instant;

public class HanoiMain {

	public static void main(String[] args) {

		Hanoi t�rn = new Hanoi(28);
		Hanoi t�rn2 = new Hanoi(29);
		Hanoi t�rn3 = new Hanoi(31);

		Instant start = Instant.now();

		t�rn.spill();

		Instant finish = Instant.now();
		System.out.println(Duration.between(start, finish).toMillis());


		Instant start2 = Instant.now();

		t�rn2.spill();

		Instant finish2 = Instant.now();
		System.out.println(Duration.between(start2, finish2).toMillis());

		Instant start3 = Instant.now();

		t�rn3.spill();

		Instant finish3 = Instant.now();
		System.out.println(Duration.between(start3, finish3).toMillis());

		System.out.println(Math.pow(2, 28));
	}

}
