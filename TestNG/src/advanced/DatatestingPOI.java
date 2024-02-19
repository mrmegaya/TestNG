package advanced;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatestingPOI {
	List<String> usernamelist=new ArrayList<String>();
	List<String> passwordlist=new ArrayList<String>();
	public void readingfromexcel() throws IOException
	{
		FileInputStream excel=new FileInputStream("F:\\Workspace\\testData\\orangeHrmTestData.xlsx");

		Workbook workbook=new XSSFWorkbook(excel);
		Sheet sheet=workbook.getSheetAt(0);
		Iterator<Row>  rowiterator= sheet.iterator();
		while (rowiterator.hasNext()) {
			Row rowvalue =rowiterator.next();
			Iterator<Cell>  columniterator =rowvalue.iterator();
			int i=2;
			while (columniterator.hasNext()) {
				if (i%2==0) {
					usernamelist.add(columniterator.next().getStringCellValue());
				}
				else
				{
					passwordlist.add(columniterator.next().getStringCellValue());
				}
				i++;
			}
		}
		workbook.close();
	}
	public void login(String uname, String pword)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\chromedriver_win3214thFEb\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			WebElement username= driver.findElement(By.xpath("//input[@name= 'username']"));
			username.sendKeys(uname);
			WebElement password= driver.findElement(By.xpath("//input[@name= 'password']"));
			password.sendKeys(pword);
			WebElement submit= driver.findElement(By.xpath("//button[@type= 'submit']"));
			submit.click();
	}

	public void executetest() {
		for (int i = 0; i < usernamelist.size(); i++) {
			login(usernamelist.get(i), passwordlist.get(i));

		}

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatatestingPOI ddriven=new DatatestingPOI();
		ddriven.readingfromexcel();
		ddriven.executetest();
	}



}
