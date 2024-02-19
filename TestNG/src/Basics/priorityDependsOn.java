package Basics;


import org.testng.annotations.Test;

public class priorityDependsOn {
	@Test(priority = 1,dependsOnMethods = {"ignitionon"} )
	public void firstgear()
	{
		System.out.println("First Gear");
	}
	@Test(priority = 2)
	public void secondgear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority = 0)
	public void ignitionon()
	{
		System.out.println("Ignition Started");
	}
	@Test(priority = 3)
	public void thirdgear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority = 4)
	public void fourthgear()
	{
		System.out.println("Fourth Gear");
	}
	@Test(alwaysRun = true)
	public void TestNG_Attributes()
	{
		/*If set to true, this test method will always be run even if it depends on a method that failed.
		 * This attribute will be ignored if this test doesn't depend on any method or group.
		Returns:the value (default false)*/
	}

}
