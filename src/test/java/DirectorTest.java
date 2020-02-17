import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Richard", "12345lg", 1000, "Computers", 10000);
    }

    @Test
    public void canGetName() {
        assertEquals("Richard", director.getName());
    }

    @Test
    public void canGetNin() {
        assertEquals("12345lg", director.getNin());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000, director.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100);
        assertEquals(1100, director.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        director.payBonus();
        assertEquals(10, director.getSalary());
    }

    @Test
    public void canGetBudget() {
        assertEquals(10000, director.getBudget(), 0.01);
    }

    @Test
    public void canGetExtraPayBonus(){
        assertEquals(20, director.payBonus(), 0.01);
    }

}
