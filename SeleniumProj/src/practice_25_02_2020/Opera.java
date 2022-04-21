package practice_25_02_2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver", "../SeleniumProj/exe/operadriver.exe");
		WebDriver driver=new OperaDriver();
	}
}
