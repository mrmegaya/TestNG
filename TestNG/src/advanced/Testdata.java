package advanced;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testdata {
	
	public void readingfromexcel() throws IOException
	{
		FileInputStream excel=new FileInputStream("F:\\Workspace\\testData\\orangeHrmTestData.xlsx");
		Workbook workbook=new XSSFWorkbook(excel);
		Sheet sheet=workbook.getSheetAt(0);
		Iterator<Row>  rowiterator= sheet.iterator();
		while (rowiterator.hasNext()) {
			Row row = (Row) rowiterator.next();
			Iterator<Cell>  columniterator =row.iterator();
			while (columniterator.hasNext()) {
				Cell cell = (Cell) columniterator.next();
				System.out.println(cell);
			}
		}
	}
}
