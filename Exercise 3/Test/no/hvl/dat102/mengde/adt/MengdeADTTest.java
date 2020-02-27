package no.hvl.dat102.mengde.adt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.*;
import no.hvl.dat102.mengde.tabell.*;

public abstract class MengdeADTTest {
	
	//Reference to the set
	private MengdeADT<String> mengde;

			
	protected abstract MengdeADT<String> reset();
	
	
	//Get a new set before each test
	@BeforeEach
	public void setup() {
		mengde = reset();
	}
	
	
	@Test
	public void unionTest() {
	
	}
	
}
