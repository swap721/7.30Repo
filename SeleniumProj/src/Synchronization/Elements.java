package Synchronization;

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

public class Elements 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		String excel_path="../SeleniumProj/Excel/Selenium.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(excel_path));
		Sheet s = book.getSheet("Sheet2");
		
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Dinga");
		FileOutputStream op=new FileOutputStream(excel_path);
		book.write(op);
		
		Row r1 = s.getRow(0);
		Cell c1 = r1.getCell(0);
		System.out.println(c1);
		String str=c1.getStringCellValue();
		System.out.println(str);
	
	}
}
