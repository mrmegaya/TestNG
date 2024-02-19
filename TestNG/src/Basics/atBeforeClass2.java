package Basics;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class atBeforeClass2 {
	 @BeforeClass
	    public void beforeClass() {
	        System.out.println("This method is executed before Class2");
	        // Perform any necessary setup here
	    }

	    @Test
	    public void testcase3() {
	        System.out.println("Test case3");
	        // Your test logic here
	    }

	    @Test
	    public void testcase4() {
	        System.out.println("Test case4");
	        // Your test logic here
	    }

}
