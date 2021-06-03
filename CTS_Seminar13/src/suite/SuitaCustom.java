package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import teste.TestGrupaCuStudentFake;
import teste.TestGrupaWithStubStudent;
import teste.TesteGrupa;
import teste.TesteGrupaCuFixture;

@RunWith(/*Suite.class*/Categories.class)
@SuiteClasses({TesteGrupa.class,TestGrupaWithStubStudent.class,TestGrupaCuStudentFake.class,TesteGrupaCuFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class,TesteUrgente.class})
public class SuitaCustom {

}
