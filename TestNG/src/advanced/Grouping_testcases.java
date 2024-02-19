package advanced;

import org.testng.annotations.Test;

public class Grouping_testcases {
	//Apple,SAMSUNG ,oppo,VIVO
	@Test(groups = {"Apple"})
	public void apple1()
	{
		System.out.println("Apple Testing 1");
	}
	@Test(groups = {"Apple"})
	public void apple2()
	{
		System.out.println("Apple Testing 2");
	}
	@Test(groups = {"Samsung"})
	public void Samsung1()
	{
		System.out.println("Samsung Testing 1");
	}
	@Test(groups = {"Samsung"})
	public void Samsung2()
	{
		System.out.println("Samsung Testing 2");
	}
	@Test(groups = {"Oppo"})
	public void Oppo1()
	{
		System.out.println("Oppo Testing 1");
	}
	@Test(groups = {"Oppo"})
	public void Oppo2()
	{
		System.out.println("Oppo Testing 2");
	}
	@Test(groups = {"Vivo"})
	public void Vivo1()
	{
		System.out.println("Vivo Testing 1");
	}
	@Test(groups = {"Vivo"})
	public void vivo()
	{
		System.out.println("Vivo Testing 2");
	}

}
