package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TesteGrupa {
	
	Grupa grupa = null;
	
	@Before
	public void setUp() {
		grupa = new Grupa(1077);
		for(int i =0;i<10;i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(5);
			student.adaugaNota(10);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test
	public void testGetPromovabilitateRight() {
		for(int i=0;i<2;i++) {
			Student student = new Student("Marius");
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0.16f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateLimitaInferioara() {
		assertEquals(0, grupa.getPromovabilitate(), 0);
	}
	
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = null;
		grupa = new Grupa(1077);
		for(int i =0;i<10;i++) {
			Student student = new Student("Marcel");
			student.adaugaNota(8);
			student.adaugaNota(10);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1077);
		grupa.getPromovabilitate();
	}
	
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	

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
