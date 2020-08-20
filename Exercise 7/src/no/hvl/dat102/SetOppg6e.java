package no.hvl.dat102;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOppg6e {



	public static void main(String[] args) {

		//size of the array and number of elements put in the HashSet/array
		int ANT_ELEM =  100000;

		Set<Integer> s = new HashSet<>();
		Integer[] tab = new Integer[ANT_ELEM];

		int tall = 1;
		for(int i = 0; i < ANT_ELEM; i++) {
			s.add(tall);
			tab[i] = tall;
			tall = (tall + 45713) % 1000000;
		}

		//Sort the array
		Arrays.sort(tab);

		Random tilf = new Random(); //1000000
		Integer[] searchTab = new Integer[10000];
		for(int i = 0; i < searchTab.length; i++) {
			searchTab[i] = tilf.nextInt(10);
		}



		//Search and time with HashSet
		System.out.println("Search in HashSet");
		int count = 0;
		Instant start, end;

		start = Instant.now();
		for(Integer hs : searchTab) {
			boolean c = s.contains(hs);
			if(c)
				count++;
		}
		end = Instant.now();

		long diff = Duration.between(start,end).toNanos();
		System.out.println(diff);
		System.out.println(count);
		System.out.println();

		//Search and time in array
		System.out.println("Search in array");
		int count1 = 0;
		Instant start1, end1;

		start1 = Instant.now();
		for(Integer hs : searchTab) {
			int n = Arrays.binarySearch(tab, hs);
			if(n >= 0)
				count1++;
		}
		end1 = Instant.now();
		long diff1 = Duration.between(start1, end1).toNanos();
		System.out.println(diff1);
		System.out.println(count1);
	}



}
