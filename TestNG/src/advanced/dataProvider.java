package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	WebDriver driver;
	@BeforeSuite
	public void initiate()
	{
		System.out.println("Started");
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\chromedriver_win3214thFEb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}	
	public void dataproviders()
	{
		
	}
	@Test
	@DataProvider
	public void login(String uname, String pword) throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("TEST");
		WebElement username= driver.findElement(By.xpath("//input[@name= 'username']"));
		username.sendKeys(uname);
		WebElement password= driver.findElement(By.xpath("//input[@name= 'username']"));
		password.sendKeys(uname);
		WebElement type= driver.findElement(By.xpath("//button[@type= 'submit']"));
		type.click();
	}
	@AfterSuite
	public void end()
	{
		System.out.println("Ended");
		driver.close();
	}

}
