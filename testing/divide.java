package Assignment2_JunitTest.testing;

import Assignment2_JunitTest.src.JunitTesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class divide {
    @Test
    public void testPositive(){
        JunitTesting test = new JunitTesting();
        double output = test.divide(4,2);
        assertEquals(2,output,0);
    }

    @Test
    public void testNegative(){
        JunitTesting test = new JunitTesting();
        double output = test.divide(9,3);
        assertEquals(2,output,0);
    }
}
