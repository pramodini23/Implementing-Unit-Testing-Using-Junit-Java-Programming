package Assignment2_JunitTest.testing;

import Assignment2_JunitTest.src.JunitTesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class countATest {
    @Test
    public void test(){
        JunitTesting test = new JunitTesting();
        int output = test.count("alphabet");
        assertEquals(2, output);
    }
}
