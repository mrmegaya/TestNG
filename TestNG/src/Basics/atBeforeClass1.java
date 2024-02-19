package Basics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class atBeforeClass1 {
	@BeforeClass
    public void beforeClass() {
        System.out.println("This method is executed before Class1");
        // Perform any necessary setup here
    }

    @Test
    public void testcase1() {
        System.out.println("Test case1");
        // Your test logic here
    }

    @Test
    public void testcase2() {
        System.out.println("Test case2");
        // Your test logic here
    }

}
