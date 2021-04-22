package Basics;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hierarchy {
	@BeforeSuite
	public void ignitionon()
	{
		System.out.println("Ignition Started");
	}
	@BeforeTest
	public void firstgear()
	{
		System.out.println("First Gear");
	}
	@BeforeClass
	public void secondgear()
	{
		System.out.println("Second Gear");
	}
	
	@BeforeMethod
	public void thirdgear()
	{
		System.out.println("Third Gear");
	}
	@Test
	public void fourthgear()
	{
		System.out.println("Fourth Gear");
	}
	@AfterMethod
	public void disengagethirdgear()
	{
		System.out.println("disengage to Third Gear");
	}
	@AfterClass
	public void disengagesecondgear()
	{
		System.out.println("disengage to Second Gear");
	}
	@AfterTest
	public void disengagefirstgear()
	{
		System.out.println("disengage to First Gear");
	}
	@AfterSuite
	public void ignitionOFF()
	{
		System.out.println("Ignition OFF");
	}

}
