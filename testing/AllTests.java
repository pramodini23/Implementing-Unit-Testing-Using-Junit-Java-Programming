package Assignment2_JunitTest.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({countATest.class, squareTest.class, divide.class})
public class AllTests {

}
