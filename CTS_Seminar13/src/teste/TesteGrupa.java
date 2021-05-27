package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TesteGrupa {

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}

	@Test
	public void testLimitaInferiora() {
		int nrGrupa = 1000;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		int nrGrupa = 1100;
		Grupa grupa = new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorLimitaInferioara() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorLimitaSuperioara() {
		int nrGrupa=10000;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistance() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
