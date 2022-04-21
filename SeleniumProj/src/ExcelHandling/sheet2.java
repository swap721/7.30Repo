package ExcelHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class sheet2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	String s=("../SeleniumProj/Excel/Selenium.xlsx");
	FileInputStream f=new FileInputStream(s);
	Workbook book=WorkbookFactory.create(f);
	Sheet s2 = book.getSheet("Demo"); 
	Row r=s2.getRow(1);
	Cell c = r.getCell(1);
	String res=c.getStringCellValue();
	Sheet s3=book.createSheet("Demo4");
	Row r2=s3.createRow(2);
	Cell c2=r2.createCell(2);
	c2.setCellValue("Angel");
	Row r1=s3.createRow(1);
	Cell c1 = r1.createCell(0);
	c1.setCellValue("Broken");
	FileOutputStream op=new FileOutputStream(s);
	book.write(op);
	System.out.println(res);
			
	
			
	
	
	
	
}
}