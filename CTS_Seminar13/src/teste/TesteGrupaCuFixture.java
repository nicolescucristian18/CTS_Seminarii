package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

public class TesteGrupaCuFixture {
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
	@Category({TesteGetPromovabilitate.class})
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
	@Category({TesteGetPromovabilitate.class,TesteUrgente.class})
	public void testGetPromovabilitateLimitaInferioara() {
		assertEquals(0, grupa.getPromovabilitate(), 0);
	}
	
	@Test(timeout = 500)
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
