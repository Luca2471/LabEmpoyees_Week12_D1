import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Richard", "12345lg", 200);
    }

    @Test
    public void canGetName() {
        assertEquals("Richard", developer.getName());
    }

    @Test
    public void canGetNin() {
        assertEquals("12345lg", developer.getNin());
    }

    @Test
    public void canGetSalary() {
        assertEquals(200, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(100);
        assertEquals(300, developer.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        developer.payBonus();
        assertEquals(2, developer.getSalary());
    }

}
