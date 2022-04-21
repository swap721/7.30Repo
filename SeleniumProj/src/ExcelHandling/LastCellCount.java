package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastCellCount
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String excel_path="../SeleniumProj/Excel/Selenium.xlsx";
		Workbook book = WorkbookFactory.create(new FileInputStream(excel_path));
		
		Sheet s = book.getSheet("Demo");
		
		for (int i = 0; i <=s.getLastRowNum(); i++) 
		{
			Row r=s.getRow(i);
			
			for (int j = 0; j < r.getLastCellNum(); j++) 
			{
			String str=r.getCell(j).toString();
			System.out.print(str+" ");
			}
			System.out.println();
			
		}
		
	}
}
