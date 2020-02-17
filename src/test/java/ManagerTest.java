import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "12345lg", "Parks and Rec" );
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
    }

}
