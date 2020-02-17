import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "12345lg", 100, "Parks and Rec");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNin() {
        assertEquals("12345lg", manager.getNin());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Parks and Rec", manager.getDeptName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100, manager.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100);
        assertEquals(200, manager.getSalary());
    }

    @Test
    public void canGetPayBonus() {
        manager.payBonus();
        assertEquals(1, manager.getSalary());
    }
}