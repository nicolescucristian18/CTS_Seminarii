package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TestGrupaCuStudentFake;
import teste.TestGrupaWithStubStudent;
import teste.TesteGrupa;

@RunWith(Suite.class)
@SuiteClasses({TesteGrupa.class,TestGrupaCuStudentFake.class,TestGrupaWithStubStudent.class})
public class SuitaCompleta {

}
