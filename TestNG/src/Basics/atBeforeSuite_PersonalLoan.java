package Basics;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class atBeforeSuite_PersonalLoan {
	@Test
    public void personal_loan() {
        System.out.println("Personal Loan");
        // Your test logic here
    }

    @BeforeSuite
    public void before_suite() {
        System.out.println("First method (executed before all test methods)");
        // Set up environment variables or perform global setup
    }	

}
