package no.hvl.dat102.mengde.adt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.adt.MengdeADT;


public abstract class MengdeADTTest {
	
	//Reference to the set
	private MengdeADT<Integer> begge = null;
	
	private MengdeADT<Integer> m1 = null;
	private MengdeADT<Integer> m2 = null;
	
			
	protected abstract MengdeADT<Integer> reset();
	
	
	//Get a new set before each test
	@BeforeEach
	public void setup() {
		begge = reset();
		m1 = reset();
		m2 = reset();
	}
	
	
	/**
	 * Testing if the method Union adds all elements from both sets (m1 U m2)
	 */
	@Test
	public void unionTest() {
		m1.leggTil(2);
		m1.leggTil(3);
		m1.leggTil(4);
		
		m2.leggTil(3);
		m2.leggTil(5);
		
		//Fasitmengde
		begge.leggTil(2);
		begge.leggTil(3);
		begge.leggTil(4);
		begge.leggTil(5);
		
		assertTrue(begge.equals(m1.union(m2)));
	}
	
	/**
	 * Testing if method Snitt adds only elements that is contained in both sets
	 */
	@Test
	public void snittTest() {
		m1.leggTil(1);
		m1.leggTil(2);
		m1.leggTil(3);
		
		m2.leggTil(2);
		m2.leggTil(3);
		m2.leggTil(4);
		
		//Fasitmengde
		begge.leggTil(2);
		begge.leggTil(3);
		
		assertTrue(begge.equals(m1.snitt(m2)));
		
	}
	
	/**
	 * Testing difference between two sets (m1 - m2)
	 */
	@Test
	public void diffTest() {
		m1.leggTil(1);
		m1.leggTil(2);
		m1.leggTil(3);
		m1.leggTil(4);
		m1.leggTil(5);
		
		m2.leggTil(1);
		m2.leggTil(3);
		m2.leggTil(5);
		m2.leggTil(7);
		
		//Fasitmengde
		begge.leggTil(2);
		begge.leggTil(4);
		
		assertTrue(begge.equals(m1.differens(m2)));
	}
}
