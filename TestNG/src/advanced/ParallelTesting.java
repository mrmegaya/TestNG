package advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void OpenGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\chromedriver_win3214thFEb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
	@Test
	public void OpenBing()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\chromedriver_win3214thFEb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}

}
