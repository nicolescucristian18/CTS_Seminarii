package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaWithStubStudent {

	@Test
	public void testGetPromovabilitateFaraRestantieri() {
		Grupa grupa1= new Grupa(1077);
		for(int i=0;i<10;i++) {
			IStudent student = new StudentStub();
			grupa1.adaugaStudent(student);
		}
		assertEquals(1, grupa1.getPromovabilitate(), 0.1);
	}

}
