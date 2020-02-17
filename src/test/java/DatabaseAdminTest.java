import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Karol", "12345lg", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("Karol", databaseAdmin.getName());
    }

    @Test
    public void canGetNin() {
        assertEquals("12345lg", databaseAdmin.getNin());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(100);
        assertEquals(200, databaseAdmin.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        databaseAdmin.payBonus();
        assertEquals(1, databaseAdmin.getSalary());
    }
}
