package Basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class atBeforeTest {
	/*Even if we re arrange the test cases Execution will happen in hierarchy
	Before and After test contains only enabled,alwaysRun attributes and 
	does not have priority attribute to change the order. */
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Priority 1");
	}
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("Priority 2");
	}
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("Priority 3");
	}
	@Test(priority = -1)
	public void test4()
	{
		System.out.println("-ve Priority Test case");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test case");
	}
	@BeforeTest
	public void Beforetest1()
	{
		System.out.println("Before Test case");
	}
	@BeforeTest
	public void Beforetest2()
	{
		System.out.println("Before Test case 2 ");
	}

}
