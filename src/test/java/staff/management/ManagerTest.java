package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private  Manager manager;

    @Before
    public void before(){
        manager = new Manager("Johno", "AB12345", 20000.00,"Financial Fraud");
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("Financial Fraud", manager.getDepartmentName());
    }
}
