package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private  Director director;

    @Before
    public void before(){
        director = new Director("Steveo","ZX9876", 20100.00,"Financial Fraud", 100.00);
    }

    @Test
    public void hasBudget(){
        assertEquals(100.00,director.getBudget(), 0.001);
    }

    @Test
    public void giveBonus(){
        director.payBonus();
        assertEquals(20502.00,director.getSalary(), 0.001);
    }
}
