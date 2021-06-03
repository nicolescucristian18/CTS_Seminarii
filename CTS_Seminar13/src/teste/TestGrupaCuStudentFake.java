package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import dubluri.StudentFake;

public class TestGrupaCuStudentFake {

	@Test
	@Category({TesteGetPromovabilitate.class})
	public void testPromovabilitateRightCuFake() {
		Grupa grupa = new Grupa(1077);
		for(int i = 0; i<8;i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setAreRestanta(false);
			grupa.adaugaStudent(studentFake);
		}
		for(int i =0;i<2;i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setAreRestanta(true);
			grupa.adaugaStudent(studentFake);
		}
		assertEquals(0.8, grupa.getPromovabilitate(),0.1);
	}

}
