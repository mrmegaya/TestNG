package Basics;

import org.testng.annotations.Test;

public class enableAlwaysRun {
	@Test(alwaysRun = true,priority = 2)
	public void SignUp()
	{
		System.out.println("This is a Message");
	}
	@Test(enabled = true,priority = 3,invocationCount = 5)
	public void Login()
	{
		System.out.println("This is Disabled");
	}

}
