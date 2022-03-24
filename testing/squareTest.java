package Assignment2_JunitTest.testing;

import Assignment2_JunitTest.src.JunitTesting;
import org.junit.Test;

import static org.junit.Assert.*;

public class squareTest {

    @Test
    public void test(){
        JunitTesting test = new JunitTesting();
        int output = test.square(5);
        assertEquals(25,output);
    }
}
