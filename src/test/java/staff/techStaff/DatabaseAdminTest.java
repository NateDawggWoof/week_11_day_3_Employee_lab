package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sarah","ZZ5647", 100000.00);
    }

    @Test
    public void givePayRise(){
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(102000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void giveBonus(){
        databaseAdmin.payBonus();
        assertEquals(101000.00,databaseAdmin.getSalary(), 0.001);
    }
}
