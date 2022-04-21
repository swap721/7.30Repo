package practice_25_02_2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetExp 
{
	public static void main(String[] args) 
	{
	WebDriverManager.iedriver().setup();
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("http://www.internetexplorer.com");
	driver.get("http://www.facebook.com");
	}
}
