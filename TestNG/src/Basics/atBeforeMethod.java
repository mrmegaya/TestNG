package Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class atBeforeMethod {
	
	 @BeforeMethod ()
	    public void setUp() {
	        System.out.println("This method will be invoked before every test method");
	        // Additional setup steps can be added here
	    }
	 @BeforeTest
	 public void setUp1() //Basics.atBeforeMethod.setUp() is depending on method public void Basics.atBeforeMethod.setUp1(), 
	 //which is not annotated with @Test or not included.
	 {
	        System.out.println("invoked before test");
	        // Additional setup steps can be added here
	    }

	    @Test
	    public void testSum() {
	        int a = 10;
	        int b = 9;
	        int sum = a + b;
	        System.out.println("Sum of a and b is: " + sum);
	    }

	    @Test
	    public void testDifference() {
	        int a = 10;
	        int b = 9;
	        int diff = a - b;
	        System.out.println("Difference of a and b is: " + diff);
	    }
	    @AfterMethod
	    public void end() {
	        System.out.println("This method will be invoked After every test method");
	        // Additional setup steps can be added here
	    }
	
}
