package staff.techStaff;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sue","AL5647", 50000.00);
    }

    @Test
    public void givePayRise(){
        developer.raiseSalary(1000.00);
        assertEquals(51000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void giveBonus(){
        developer.payBonus();
        assertEquals(50500.00,developer.getSalary(), 0.001);
    }


}
