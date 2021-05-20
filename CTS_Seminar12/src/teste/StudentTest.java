package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTest {
	Student student = null;
	@Before
	public void setUp() {
		student = new Student();
	}
	
	

	@Test
	public void testApelCorectConstructorCuParametrii() {
		String nume = "Ion";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelCorectConstructorFaraParametrii() {
		String nume = "Student";
		Student student = new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareCorectaListaConstructorFaraParametrii() {
		Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareCorectaNotaInLista() {
		//Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testMarimeListaCorecta() {
		//Student student = new Student();
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetCorectNume() {
		//Student student = new Student();
		String nume = "Gigel";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testCalculeazaCorectMedia() {
		int nota1 = 8;
		int nota2 = 10;
		int nota3 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		int medie = (nota1 + nota2 + nota3) / 3;
		assertEquals(medie, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote(){
		assertEquals(0, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testCalculeazaMedieCuONata() {
		int nota = 8;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota1 = 10;
		int nota2 = 4;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestanta() {
		int nota1 = 10;
		int nota2 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestantaFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaCuIndexGresit() {
		int nota1 = 10;
		int nota2 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		int index = -1;
		student.getNota(index);
	}
	
	@Test
	public void testGetNotaCuIndexGresitJUnit3() {
		int nota1 = 10;
		int nota2 = 6;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		int index = -1;
		try {
		student.getNota(index);
		fail("Nu trebuia sa ajunga aici");
		}
		catch(IndexOutOfBoundsException err) {
			
		}
	}
}
