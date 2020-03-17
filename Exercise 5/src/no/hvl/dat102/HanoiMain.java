package no.hvl.dat102;

import java.time.Duration;
import java.time.Instant;

public class HanoiMain {

	public static void main(String[] args) {

		Hanoi tårn = new Hanoi(28);

		Instant start = Instant.now();

		tårn.spill();

		Instant finish = Instant.now();
		System.out.println(Duration.between(start, finish).toMillis());


	}

}
